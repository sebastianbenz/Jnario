package de.bmw.carit.xspec.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.bmw.carit.xspec.services.XSpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalXSpecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_GIVEN_TEXT", "RULE_WHEN_TEXT", "RULE_THEN_TEXT", "RULE_INT", "RULE_STRING", "RULE_SENTENCE_ENDING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int RULE_SENTENCE_ENDING=10;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_THEN_TEXT=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int RULE_WHEN_TEXT=6;
    public static final int RULE_GIVEN_TEXT=5;
    public static final int T__59=59;
    public static final int RULE_INT=8;
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
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
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
    public static final int RULE_WS=13;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalXSpecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXSpecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXSpecParser.tokenNames; }
    public String getGrammarFileName() { return "../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g"; }



     	private XSpecGrammarAccess grammarAccess;
     	
        public InternalXSpecParser(TokenStream input, XSpecGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "XSpec";	
       	}
       	
       	@Override
       	protected XSpecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXSpec"
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:67:1: entryRuleXSpec returns [EObject current=null] : iv_ruleXSpec= ruleXSpec EOF ;
    public final EObject entryRuleXSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSpec = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:68:2: (iv_ruleXSpec= ruleXSpec EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:69:2: iv_ruleXSpec= ruleXSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSpecRule()); 
            }
            pushFollow(FOLLOW_ruleXSpec_in_entryRuleXSpec75);
            iv_ruleXSpec=ruleXSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSpec85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSpec"


    // $ANTLR start "ruleXSpec"
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:76:1: ruleXSpec returns [EObject current=null] : ( ( (lv_moduleName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_specs_2_0= ruleSentence ) )* otherlv_3= '}' ) ;
    public final EObject ruleXSpec() throws RecognitionException {
        EObject current = null;

        Token lv_moduleName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_specs_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:79:28: ( ( ( (lv_moduleName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_specs_2_0= ruleSentence ) )* otherlv_3= '}' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:80:1: ( ( (lv_moduleName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_specs_2_0= ruleSentence ) )* otherlv_3= '}' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:80:1: ( ( (lv_moduleName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_specs_2_0= ruleSentence ) )* otherlv_3= '}' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:80:2: ( (lv_moduleName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_specs_2_0= ruleSentence ) )* otherlv_3= '}'
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:80:2: ( (lv_moduleName_0_0= RULE_ID ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:81:1: (lv_moduleName_0_0= RULE_ID )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:81:1: (lv_moduleName_0_0= RULE_ID )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:82:3: lv_moduleName_0_0= RULE_ID
            {
            lv_moduleName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXSpec127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_moduleName_0_0, grammarAccess.getXSpecAccess().getModuleNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXSpecRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"moduleName",
                      		lv_moduleName_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXSpec144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSpecAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:102:1: ( (lv_specs_2_0= ruleSentence ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_GIVEN_TEXT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:103:1: (lv_specs_2_0= ruleSentence )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:103:1: (lv_specs_2_0= ruleSentence )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:104:3: lv_specs_2_0= ruleSentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSpecAccess().getSpecsSentenceParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSentence_in_ruleXSpec165);
            	    lv_specs_2_0=ruleSentence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"specs",
            	              		lv_specs_2_0, 
            	              		"Sentence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXSpec178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXSpecAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleXSpec"


    // $ANTLR start "entryRuleSentence"
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:132:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:133:2: (iv_ruleSentence= ruleSentence EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:134:2: iv_ruleSentence= ruleSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSentenceRule()); 
            }
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence214);
            iv_ruleSentence=ruleSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence224); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:141:1: ruleSentence returns [EObject current=null] : ( ( (lv_given_0_0= ruleGiven ) ) ( (lv_when_1_0= ruleWhen ) ) ( (lv_then_2_0= ruleThen ) ) ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        EObject lv_given_0_0 = null;

        EObject lv_when_1_0 = null;

        EObject lv_then_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:144:28: ( ( ( (lv_given_0_0= ruleGiven ) ) ( (lv_when_1_0= ruleWhen ) ) ( (lv_then_2_0= ruleThen ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:145:1: ( ( (lv_given_0_0= ruleGiven ) ) ( (lv_when_1_0= ruleWhen ) ) ( (lv_then_2_0= ruleThen ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:145:1: ( ( (lv_given_0_0= ruleGiven ) ) ( (lv_when_1_0= ruleWhen ) ) ( (lv_then_2_0= ruleThen ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:145:2: ( (lv_given_0_0= ruleGiven ) ) ( (lv_when_1_0= ruleWhen ) ) ( (lv_then_2_0= ruleThen ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:145:2: ( (lv_given_0_0= ruleGiven ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:146:1: (lv_given_0_0= ruleGiven )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:146:1: (lv_given_0_0= ruleGiven )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:147:3: lv_given_0_0= ruleGiven
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSentenceAccess().getGivenGivenParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGiven_in_ruleSentence270);
            lv_given_0_0=ruleGiven();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSentenceRule());
              	        }
                     		set(
                     			current, 
                     			"given",
                      		lv_given_0_0, 
                      		"Given");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:163:2: ( (lv_when_1_0= ruleWhen ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:164:1: (lv_when_1_0= ruleWhen )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:164:1: (lv_when_1_0= ruleWhen )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:165:3: lv_when_1_0= ruleWhen
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSentenceAccess().getWhenWhenParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleWhen_in_ruleSentence291);
            lv_when_1_0=ruleWhen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSentenceRule());
              	        }
                     		set(
                     			current, 
                     			"when",
                      		lv_when_1_0, 
                      		"When");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:181:2: ( (lv_then_2_0= ruleThen ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:182:1: (lv_then_2_0= ruleThen )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:182:1: (lv_then_2_0= ruleThen )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:183:3: lv_then_2_0= ruleThen
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSentenceAccess().getThenThenParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleThen_in_ruleSentence312);
            lv_then_2_0=ruleThen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSentenceRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_2_0, 
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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleGiven"
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:209:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:210:2: (iv_ruleGiven= ruleGiven EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:211:2: iv_ruleGiven= ruleGiven EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGivenRule()); 
            }
            pushFollow(FOLLOW_ruleGiven_in_entryRuleGiven350);
            iv_ruleGiven=ruleGiven();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGiven; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGiven360); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:218:1: ruleGiven returns [EObject current=null] : ( ( (lv_desc_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token lv_desc_0_0=null;
        EObject lv_code_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:221:28: ( ( ( (lv_desc_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:222:1: ( ( (lv_desc_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:222:1: ( ( (lv_desc_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:222:2: ( (lv_desc_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )?
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:222:2: ( (lv_desc_0_0= RULE_GIVEN_TEXT ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:223:1: (lv_desc_0_0= RULE_GIVEN_TEXT )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:223:1: (lv_desc_0_0= RULE_GIVEN_TEXT )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:224:3: lv_desc_0_0= RULE_GIVEN_TEXT
            {
            lv_desc_0_0=(Token)match(input,RULE_GIVEN_TEXT,FOLLOW_RULE_GIVEN_TEXT_in_ruleGiven402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_desc_0_0, grammarAccess.getGivenAccess().getDescGIVEN_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGivenRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"desc",
                      		lv_desc_0_0, 
                      		"GIVEN_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:240:2: ( (lv_code_1_0= ruleCode ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||LA2_0==15||LA2_0==27||(LA2_0>=30 && LA2_0<=31)||LA2_0==36||LA2_0==42||LA2_0==44||LA2_0==47||LA2_0==49||(LA2_0>=53 && LA2_0<=55)||(LA2_0>=57 && LA2_0<=59)||(LA2_0>=61 && LA2_0<=68)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:241:1: (lv_code_1_0= ruleCode )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:241:1: (lv_code_1_0= ruleCode )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:242:3: lv_code_1_0= ruleCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGivenAccess().getCodeCodeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCode_in_ruleGiven428);
                    lv_code_1_0=ruleCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGivenRule());
                      	        }
                             		set(
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:266:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:267:2: (iv_ruleWhen= ruleWhen EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:268:2: iv_ruleWhen= ruleWhen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhenRule()); 
            }
            pushFollow(FOLLOW_ruleWhen_in_entryRuleWhen465);
            iv_ruleWhen=ruleWhen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhen; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhen475); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:275:1: ruleWhen returns [EObject current=null] : ( ( (lv_desc_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token lv_desc_0_0=null;
        EObject lv_code_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:278:28: ( ( ( (lv_desc_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:279:1: ( ( (lv_desc_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:279:1: ( ( (lv_desc_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:279:2: ( (lv_desc_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )?
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:279:2: ( (lv_desc_0_0= RULE_WHEN_TEXT ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:280:1: (lv_desc_0_0= RULE_WHEN_TEXT )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:280:1: (lv_desc_0_0= RULE_WHEN_TEXT )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:281:3: lv_desc_0_0= RULE_WHEN_TEXT
            {
            lv_desc_0_0=(Token)match(input,RULE_WHEN_TEXT,FOLLOW_RULE_WHEN_TEXT_in_ruleWhen517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_desc_0_0, grammarAccess.getWhenAccess().getDescWHEN_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWhenRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"desc",
                      		lv_desc_0_0, 
                      		"WHEN_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:297:2: ( (lv_code_1_0= ruleCode ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=RULE_INT && LA3_0<=RULE_STRING)||LA3_0==15||LA3_0==27||(LA3_0>=30 && LA3_0<=31)||LA3_0==36||LA3_0==42||LA3_0==44||LA3_0==47||LA3_0==49||(LA3_0>=53 && LA3_0<=55)||(LA3_0>=57 && LA3_0<=59)||(LA3_0>=61 && LA3_0<=68)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:298:1: (lv_code_1_0= ruleCode )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:298:1: (lv_code_1_0= ruleCode )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:299:3: lv_code_1_0= ruleCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhenAccess().getCodeCodeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCode_in_ruleWhen543);
                    lv_code_1_0=ruleCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhenRule());
                      	        }
                             		set(
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:323:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:324:2: (iv_ruleThen= ruleThen EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:325:2: iv_ruleThen= ruleThen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThenRule()); 
            }
            pushFollow(FOLLOW_ruleThen_in_entryRuleThen580);
            iv_ruleThen=ruleThen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThen; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThen590); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:332:1: ruleThen returns [EObject current=null] : ( ( (lv_desc_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token lv_desc_0_0=null;
        EObject lv_code_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:335:28: ( ( ( (lv_desc_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:336:1: ( ( (lv_desc_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:336:1: ( ( (lv_desc_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:336:2: ( (lv_desc_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )?
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:336:2: ( (lv_desc_0_0= RULE_THEN_TEXT ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:337:1: (lv_desc_0_0= RULE_THEN_TEXT )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:337:1: (lv_desc_0_0= RULE_THEN_TEXT )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:338:3: lv_desc_0_0= RULE_THEN_TEXT
            {
            lv_desc_0_0=(Token)match(input,RULE_THEN_TEXT,FOLLOW_RULE_THEN_TEXT_in_ruleThen632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_desc_0_0, grammarAccess.getThenAccess().getDescTHEN_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getThenRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"desc",
                      		lv_desc_0_0, 
                      		"THEN_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:354:2: ( (lv_code_1_0= ruleCode ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=RULE_INT && LA4_0<=RULE_STRING)||LA4_0==15||LA4_0==27||(LA4_0>=30 && LA4_0<=31)||LA4_0==36||LA4_0==42||LA4_0==44||LA4_0==47||LA4_0==49||(LA4_0>=53 && LA4_0<=55)||(LA4_0>=57 && LA4_0<=59)||(LA4_0>=61 && LA4_0<=68)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:355:1: (lv_code_1_0= ruleCode )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:355:1: (lv_code_1_0= ruleCode )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:356:3: lv_code_1_0= ruleCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getThenAccess().getCodeCodeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCode_in_ruleThen658);
                    lv_code_1_0=ruleCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getThenRule());
                      	        }
                             		set(
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:380:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:381:2: (iv_ruleCode= ruleCode EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:382:2: iv_ruleCode= ruleCode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeRule()); 
            }
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode695);
            iv_ruleCode=ruleCode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode705); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:389:1: ruleCode returns [EObject current=null] : ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+ ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:392:28: ( ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+ )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:393:1: ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:393:1: ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=RULE_INT && LA5_0<=RULE_STRING)||LA5_0==15||LA5_0==27||(LA5_0>=30 && LA5_0<=31)||LA5_0==36||LA5_0==42||LA5_0==44||LA5_0==47||LA5_0==49||(LA5_0>=53 && LA5_0<=55)||(LA5_0>=57 && LA5_0<=59)||(LA5_0>=61 && LA5_0<=68)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:394:1: (lv_expressions_0_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:394:1: (lv_expressions_0_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:395:3: lv_expressions_0_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCodeAccess().getExpressionsXExpressionInsideBlockParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleCode750);
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
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:419:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:420:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:421:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression786);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression796); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:428:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:431:28: (this_XAssignment_0= ruleXAssignment )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:433:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression842);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:449:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:450:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:451:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment876);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment886); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:458:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:461:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:462:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:462:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||(LA7_1>=RULE_ID && LA7_1<=RULE_STRING)||(LA7_1>=15 && LA7_1<=16)||(LA7_1>=18 && LA7_1<=44)||(LA7_1>=46 && LA7_1<=71)) ) {
                    alt7=2;
                }
                else if ( (LA7_1==17) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)||LA7_0==15||LA7_0==27||(LA7_0>=30 && LA7_0<=31)||LA7_0==36||LA7_0==42||LA7_0==44||LA7_0==47||LA7_0==49||(LA7_0>=53 && LA7_0<=55)||LA7_0==59||(LA7_0>=61 && LA7_0<=68)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:462:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:462:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:462:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:462:3: ()
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:463:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:468:2: ( ( ruleValidID ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:469:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:469:1: ( ruleValidID )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:470:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment944);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment960);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:491:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:492:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:492:1: (lv_value_3_0= ruleXAssignment )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:493:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment980);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:510:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:510:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:511:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1010);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:519:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==18) ) {
                        int LA6_1 = input.LA(2);

                        if ( (synpred1_InternalXSpec()) ) {
                            alt6=1;
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:519:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:519:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:519:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:524:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:524:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:524:7: ()
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:525:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:530:2: ( ( ruleOpMultiAssign ) )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:531:1: ( ruleOpMultiAssign )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:531:1: ( ruleOpMultiAssign )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:532:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1063);
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

                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:545:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:546:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:546:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:547:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1086);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:571:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:572:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:573:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1126);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1137); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:580:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:583:28: (kw= '=' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:585:2: kw= '='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpSingleAssign1174); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:598:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:599:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:600:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1214);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1225); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:607:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:610:28: (kw= '+=' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:612:2: kw= '+='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpMultiAssign1262); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:625:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:626:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:627:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1301);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1311); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:634:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:637:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:638:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:638:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:639:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1358);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:647:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred2_InternalXSpec()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:647:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:647:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:647:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:652:6: ( () ( ( ruleOpOr ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:652:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:652:7: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:653:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:658:2: ( ( ruleOpOr ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:659:1: ( ruleOpOr )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:659:1: ( ruleOpOr )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:660:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1411);
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

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:673:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:674:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:674:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:675:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1434);
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
            	    break loop8;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:699:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:700:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:701:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1473);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1484); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:708:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:711:28: (kw= '||' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:713:2: kw= '||'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpOr1521); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:726:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:727:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:728:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1560);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1570); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:735:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:738:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:739:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:739:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:740:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1617);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:748:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred3_InternalXSpec()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:748:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:748:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:748:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:753:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:753:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:753:7: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:754:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:759:2: ( ( ruleOpAnd ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:760:1: ( ruleOpAnd )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:760:1: ( ruleOpAnd )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:761:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1670);
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

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:774:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:775:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:775:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:776:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1693);
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
            	    break loop9;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:800:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:801:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:802:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1732);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1743); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:809:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:812:28: (kw= '&&' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:814:2: kw= '&&'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpAnd1780); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:827:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:828:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:829:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1819);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1829); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:836:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:839:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:840:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:840:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:841:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1876);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:849:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred4_InternalXSpec()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==22) ) {
                    int LA10_3 = input.LA(2);

                    if ( (synpred4_InternalXSpec()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:849:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:849:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:849:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:854:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:854:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:854:7: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:855:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:860:2: ( ( ruleOpEquality ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:861:1: ( ruleOpEquality )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:861:1: ( ruleOpEquality )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:862:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1929);
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

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:875:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:876:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:876:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:877:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1952);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:901:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:902:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:903:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1991);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2002); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:910:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:913:28: ( (kw= '==' | kw= '!=' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:914:1: (kw= '==' | kw= '!=' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:914:1: (kw= '==' | kw= '!=' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:915:2: kw= '=='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality2040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:922:2: kw= '!='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality2059); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:935:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:936:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:937:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2099);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2109); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:944:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:947:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:948:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:948:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:949:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2156);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop12:
            do {
                int alt12=3;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred5_InternalXSpec()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred6_InternalXSpec()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (synpred6_InternalXSpec()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (synpred6_InternalXSpec()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (synpred6_InternalXSpec()) ) {
                        alt12=2;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:959:5: ( () otherlv_2= 'instanceof' )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:959:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:959:6: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:960:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXRelationalExpression2192); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:969:3: ( ( ruleQualifiedName ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:970:1: ( ruleQualifiedName )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:970:1: ( ruleQualifiedName )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:971:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2217);
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
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:985:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:985:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:985:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:985:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:985:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:990:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:990:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:990:7: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:991:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:996:2: ( ( ruleOpCompare ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:997:1: ( ruleOpCompare )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:997:1: ( ruleOpCompare )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:998:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2278);
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

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1011:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1012:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1012:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1013:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2301);
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
            	    break loop12;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1037:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1038:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1039:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2341);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2352); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1046:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1049:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1050:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1050:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1051:2: kw= '>='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1058:2: kw= '<='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1065:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1072:2: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2447); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1085:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1086:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1087:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2487);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2497); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1094:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1097:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1098:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1098:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1099:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2544);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1107:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred7_InternalXSpec()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==29) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred7_InternalXSpec()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1107:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1107:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1107:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1112:6: ( () ( ( ruleOpOther ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1112:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1112:7: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1113:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1118:2: ( ( ruleOpOther ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1119:1: ( ruleOpOther )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1119:1: ( ruleOpOther )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1120:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2597);
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

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1133:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1134:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1134:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1135:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2620);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1159:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1160:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1161:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2659);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2670); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1168:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1171:28: ( (kw= '->' | kw= '..' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1172:1: (kw= '->' | kw= '..' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1172:1: (kw= '->' | kw= '..' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1173:2: kw= '->'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1180:2: kw= '..'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2727); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1193:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1194:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1195:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2767);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2777); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1202:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1205:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1206:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1206:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1207:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2824);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1215:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred8_InternalXSpec()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==31) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred8_InternalXSpec()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1215:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1215:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1215:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1220:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1220:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1220:7: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1221:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1226:2: ( ( ruleOpAdd ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1227:1: ( ruleOpAdd )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1227:1: ( ruleOpAdd )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1228:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2877);
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

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1241:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1242:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1242:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1243:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2900);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1267:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1268:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1269:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2939);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2950); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1276:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1279:28: ( (kw= '+' | kw= '-' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1280:1: (kw= '+' | kw= '-' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1280:1: (kw= '+' | kw= '-' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            else if ( (LA17_0==31) ) {
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1281:2: kw= '+'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpAdd2988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1288:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpAdd3007); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1301:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1302:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1303:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3047);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3057); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1310:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1313:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1314:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1314:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1315:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3104);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1323:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred9_InternalXSpec()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred9_InternalXSpec()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred9_InternalXSpec()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred9_InternalXSpec()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1323:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1323:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1323:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1328:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1328:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1328:7: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1329:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1334:2: ( ( ruleOpMulti ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1335:1: ( ruleOpMulti )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1335:1: ( ruleOpMulti )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1336:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3157);
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

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1349:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1350:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1350:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1351:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3180);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1375:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1376:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1377:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3219);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3230); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1384:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1387:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1388:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1388:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                alt19=2;
                }
                break;
            case 34:
                {
                alt19=3;
                }
                break;
            case 35:
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1389:2: kw= '*'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpMulti3268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1396:2: kw= '**'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1403:2: kw= '/'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1410:2: kw= '%'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3325); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1423:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1424:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1425:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3365);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3375); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1432:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1435:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1436:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1436:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=30 && LA20_0<=31)||LA20_0==36) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID||(LA20_0>=RULE_INT && LA20_0<=RULE_STRING)||LA20_0==15||LA20_0==27||LA20_0==42||LA20_0==44||LA20_0==47||LA20_0==49||(LA20_0>=53 && LA20_0<=55)||LA20_0==59||(LA20_0>=61 && LA20_0<=68)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1436:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1436:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1436:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1436:3: ()
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1437:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1442:2: ( ( ruleOpUnary ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1443:1: ( ruleOpUnary )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1443:1: ( ruleOpUnary )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1444:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3433);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1457:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1458:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1458:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1459:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3454);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1477:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3483);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1493:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1494:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1495:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3519);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3530); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1502:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1505:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1506:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1506:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case 30:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1507:2: kw= '!'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary3568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1514:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpUnary3587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1521:2: kw= '+'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpUnary3606); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1534:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1535:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1536:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3646);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3656); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1543:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1546:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1547:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1547:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1548:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3703);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1556:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred10_InternalXSpec()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1556:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1556:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1556:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1558:5: ( () otherlv_2= 'as' )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1558:6: () otherlv_2= 'as'
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1558:6: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1559:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXCastedExpression3738); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1568:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1569:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1569:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1570:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3761);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1594:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1595:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1596:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3799);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3809); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1603:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1606:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1607:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1607:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1608:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3856);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop29:
            do {
                int alt29=3;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred11_InternalXSpec()) ) {
                        alt29=1;
                    }
                    else if ( (synpred12_InternalXSpec()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred12_InternalXSpec()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred12_InternalXSpec()) ) {
                        alt29=2;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1622:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1622:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1622:26: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1623:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall3905); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1632:1: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1633:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1633:1: ( ruleValidID )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1634:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3928);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3944);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1655:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1656:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1656:1: (lv_value_5_0= ruleXAssignment )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1657:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3966);
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
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1674:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1674:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1674:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1674:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1674:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1690:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1690:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1690:8: ()
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1691:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1696:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1696:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4052); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1701:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1701:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1702:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1702:1: (lv_nullSafe_8_0= '?.' )
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1703:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4076); if (state.failed) return current;
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
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1717:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1717:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1718:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1718:1: (lv_spreading_9_0= '*.' )
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1719:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4113); if (state.failed) return current;
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

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1732:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==27) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1732:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4142); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1736:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1737:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1737:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1738:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4163);
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

            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1754:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==41) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1754:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4176); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1758:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1759:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1759:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1760:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4197);
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
            	            	    break loop24;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall4211); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1780:3: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1781:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1781:1: ( ruleValidID )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1782:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4236);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1795:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1795:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1795:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1795:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1802:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1803:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4270); if (state.failed) return current;
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

            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1816:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt27=3;
            	            alt27 = dfa27.predict(input);
            	            switch (alt27) {
            	                case 1 :
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1816:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1816:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1816:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1828:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1829:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4345);
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
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1846:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1846:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1846:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1846:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1847:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1847:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1848:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4373);
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

            	                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1864:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop26:
            	                    do {
            	                        int alt26=2;
            	                        int LA26_0 = input.LA(1);

            	                        if ( (LA26_0==41) ) {
            	                            alt26=1;
            	                        }


            	                        switch (alt26) {
            	                    	case 1 :
            	                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1864:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4386); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1868:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1869:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1869:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1870:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4407);
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
            	                    	    break loop26;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4424); if (state.failed) return current;
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
            	    break loop29;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1898:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1899:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1900:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4465);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4475); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1907:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1910:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1911:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1911:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt30=13;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt30=1;
                }
                break;
            case 15:
                {
                alt30=2;
                }
                break;
            case 49:
                {
                alt30=3;
                }
                break;
            case RULE_ID:
            case 27:
            case 59:
                {
                alt30=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 44:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt30=5;
                }
                break;
            case 47:
                {
                alt30=6;
                }
                break;
            case 53:
                {
                alt30=7;
                }
                break;
            case 54:
                {
                alt30=8;
                }
                break;
            case 55:
                {
                alt30=9;
                }
                break;
            case 66:
                {
                alt30=10;
                }
                break;
            case 67:
                {
                alt30=11;
                }
                break;
            case 68:
                {
                alt30=12;
                }
                break;
            case 42:
                {
                alt30=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1912:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4522);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1922:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4549);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1932:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4576);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1942:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4603);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1952:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4630);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1962:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4657);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1972:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4684);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1982:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4711);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1992:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4738);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2002:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4765);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2012:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4792);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2022:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4819);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2032:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4846);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2048:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2049:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2050:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4881);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4891); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2057:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2060:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2061:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2061:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt31=1;
                }
                break;
            case 62:
            case 63:
                {
                alt31=2;
                }
                break;
            case RULE_INT:
                {
                alt31=3;
                }
                break;
            case 64:
                {
                alt31=4;
                }
                break;
            case RULE_STRING:
                {
                alt31=5;
                }
                break;
            case 65:
                {
                alt31=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2062:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4938);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2072:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4965);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2082:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral4992);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2092:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5019);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2102:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5046);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2112:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5073);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2128:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2129:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2130:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5108);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5118); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2137:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2140:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2141:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2141:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2141:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2141:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2142:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2151:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==42||LA33_0==71) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2151:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2151:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2152:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2152:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2153:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5186);
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

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2169:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==41) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2169:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXClosure5199); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2173:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2174:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2174:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2175:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5220);
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2195:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2196:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2196:1: (lv_expression_6_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2197:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5257);
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

            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5269); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2225:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2226:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2227:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5305);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5315); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2234:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2237:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2238:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2238:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2238:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2238:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2238:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2249:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2249:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2249:6: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2250:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2255:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==42||LA35_0==71) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2255:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2255:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2256:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2256:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2257:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5413);
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

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2273:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==41) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2273:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXShortClosure5426); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2277:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2278:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2278:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2279:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5447);
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXShortClosure5463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2299:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2300:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2300:1: (lv_expression_5_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2301:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5486);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2325:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2326:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2327:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5522);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5532); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2334:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2337:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2338:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2338:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2338:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleXParenthesizedExpression5569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5591);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXParenthesizedExpression5602); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2363:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2364:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2365:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5638);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5648); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2372:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2375:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2376:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2376:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2376:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2376:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2377:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression5694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression5706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2390:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2391:1: (lv_if_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2391:1: (lv_if_3_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2392:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5727);
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

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression5739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2412:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2413:1: (lv_then_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2413:1: (lv_then_5_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2414:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5760);
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

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2430:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred16_InternalXSpec()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2430:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2430:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2430:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression5781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2435:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2436:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2436:1: (lv_else_7_0= ruleXExpression )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2437:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5803);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2461:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2462:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2463:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5841);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5851); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2470:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2473:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2474:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2474:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2474:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2474:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2475:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression5897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2484:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==50) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2484:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2484:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2485:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2485:1: (lv_localVarName_2_0= ruleValidID )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2486:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression5919);
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

                    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression5931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2506:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2507:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2507:1: (lv_switch_4_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2508:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5954);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleXSwitchExpression5966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2528:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==42||LA38_0==50||LA38_0==52||LA38_0==71) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2529:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2529:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2530:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5987);
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
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2546:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2546:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2554:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2555:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2555:1: (lv_default_9_0= ruleXExpression )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2556:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6034);
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

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6048); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2584:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2585:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2586:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6084);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6094); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2593:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2596:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2597:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2597:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2597:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2597:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==42||LA40_0==71) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2598:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2598:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2599:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6140);
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

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2615:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==52) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2615:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2619:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2620:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2620:1: (lv_case_2_0= ruleXExpression )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2621:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6175);
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

            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXCasePart6189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2641:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2642:1: (lv_then_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2642:1: (lv_then_4_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2643:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6210);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2667:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2668:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2669:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6246);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6256); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2676:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2679:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2680:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2680:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2680:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2680:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2681:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression6302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXForLoopExpression6314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2694:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2695:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2695:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2696:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6335);
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

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXForLoopExpression6347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2716:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2717:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2717:1: (lv_forExpression_5_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2718:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6368);
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

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleXForLoopExpression6380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2738:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2739:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2739:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2740:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6401);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2764:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2765:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2766:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6437);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6447); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2773:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2776:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2777:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2777:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2777:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2777:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2778:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXWhileExpression6493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXWhileExpression6505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2791:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2792:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2792:1: (lv_predicate_3_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2793:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6526);
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

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXWhileExpression6538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2813:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2814:1: (lv_body_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2814:1: (lv_body_5_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2815:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6559);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2839:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2840:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2841:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6595);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6605); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2848:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2851:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2852:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2852:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2852:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2852:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2853:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression6651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2862:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2863:1: (lv_body_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2863:1: (lv_body_2_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2864:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6672);
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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXDoWhileExpression6684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXDoWhileExpression6696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2888:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2889:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2889:1: (lv_predicate_5_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2890:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6717);
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

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleXDoWhileExpression6729); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2918:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2919:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2920:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6765);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6775); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2927:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2930:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2931:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2931:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2931:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2931:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2932:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression6821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2941:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||(LA43_0>=RULE_INT && LA43_0<=RULE_STRING)||LA43_0==15||LA43_0==27||(LA43_0>=30 && LA43_0<=31)||LA43_0==36||LA43_0==42||LA43_0==44||LA43_0==47||LA43_0==49||(LA43_0>=53 && LA43_0<=55)||(LA43_0>=57 && LA43_0<=59)||(LA43_0>=61 && LA43_0<=68)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2941:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2941:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2942:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2942:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2943:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6843);
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

            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2959:2: (otherlv_3= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==56) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2959:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression6856); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression6872); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2975:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2976:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2977:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6908);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6918); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2984:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2987:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2988:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2988:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=57 && LA44_0<=58)) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID||(LA44_0>=RULE_INT && LA44_0<=RULE_STRING)||LA44_0==15||LA44_0==27||(LA44_0>=30 && LA44_0<=31)||LA44_0==36||LA44_0==42||LA44_0==44||LA44_0==47||LA44_0==49||(LA44_0>=53 && LA44_0<=55)||LA44_0==59||(LA44_0>=61 && LA44_0<=68)) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2989:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6965);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2999:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6992);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3015:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3016:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3017:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7027);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7037); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3024:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3027:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3028:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3028:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3028:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3028:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3029:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3034:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            else if ( (LA45_0==58) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3034:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3034:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3035:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3035:1: (lv_writeable_1_0= 'var' )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3036:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,57,FOLLOW_57_in_ruleXVariableDeclaration7090); if (state.failed) return current;
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3050:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3054:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred17_InternalXSpec()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA46_0==42) && (synpred17_InternalXSpec())) {
                alt46=1;
            }
            else if ( (LA46_0==71) && (synpred17_InternalXSpec())) {
                alt46=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3054:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3054:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3054:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3062:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3062:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3062:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3063:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3063:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3064:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7169);
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

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3080:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3081:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3081:1: (lv_name_4_0= ruleValidID )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3082:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7190);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3099:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3099:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3100:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3100:1: (lv_name_5_0= ruleValidID )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3101:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7219);
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

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3117:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==17) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3117:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleXVariableDeclaration7233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3121:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3122:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3122:1: (lv_right_7_0= ruleXExpression )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3123:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7254);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3147:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3148:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3149:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7292);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7302); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3156:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3159:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3160:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3160:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3160:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3160:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==RULE_ID||LA48_1==27||LA48_1==38) ) {
                    alt48=1;
                }
            }
            else if ( (LA48_0==42||LA48_0==71) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3161:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3161:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3162:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7348);
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

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3178:3: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3179:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3179:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3180:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7370);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3204:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3205:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3206:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7406);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7416); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3213:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3216:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3217:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3217:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3217:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3217:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3218:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3223:2: ( ( ruleStaticQualifier ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==60) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3224:1: ( ruleStaticQualifier )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3224:1: ( ruleStaticQualifier )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3225:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7473);
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

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3238:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==27) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3238:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall7487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3242:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3243:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3243:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3244:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7508);
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

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3260:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==41) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3260:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7521); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3264:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3265:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3265:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3266:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7542);
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
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall7556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3286:3: ( ( ruleIdOrSuper ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3287:1: ( ruleIdOrSuper )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3287:1: ( ruleIdOrSuper )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3288:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7581);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3301:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3301:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3301:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3301:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3308:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3309:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall7615); if (state.failed) return current;
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

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3322:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt53=3;
                    alt53 = dfa53.predict(input);
                    switch (alt53) {
                        case 1 :
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3322:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3322:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3322:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3334:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3335:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7690);
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
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3352:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3352:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3352:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3352:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3353:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3353:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3354:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7718);
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

                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3370:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==41) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3370:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7731); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3374:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3375:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3375:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3376:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7752);
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
                            	    break loop52;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall7769); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3404:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3405:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3406:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7808);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper7819); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3413:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3416:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3417:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3417:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            else if ( (LA55_0==59) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3418:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper7866);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3430:2: kw= 'super'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleIdOrSuper7890); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3443:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3444:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3445:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7931);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier7942); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3452:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3455:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3456:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3456:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    int LA56_2 = input.LA(2);

                    if ( (LA56_2==60) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3457:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier7989);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleStaticQualifier8007); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3481:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3482:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3483:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8048);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8058); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3490:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3493:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3494:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3494:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3494:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3494:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3495:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXConstructorCall8104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3504:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3505:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3505:1: ( ruleQualifiedName )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3506:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8127);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3519:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==27) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3519:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3523:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3524:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3524:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3525:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8161);
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

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3541:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==41) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3541:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8174); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3545:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3546:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3546:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3547:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8195);
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
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall8209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall8223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3571:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt60=3;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3571:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3571:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3571:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3583:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3584:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8285);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3601:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3601:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3601:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3601:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3602:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3602:1: (lv_arguments_10_0= ruleXExpression )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3603:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8313);
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

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3619:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==41) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3619:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8326); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3623:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3624:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3624:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3625:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8347);
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
                    	    break loop59;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8364); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3653:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3654:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3655:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8400);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8410); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3662:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3665:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3666:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3666:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3666:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3666:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3667:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3672:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==62) ) {
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3672:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXBooleanLiteral8457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3677:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3677:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3678:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3678:1: (lv_isTrue_2_0= 'true' )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3679:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,63,FOLLOW_63_in_ruleXBooleanLiteral8481); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3700:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3701:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3702:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8531);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8541); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3709:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3712:28: ( ( () otherlv_1= 'null' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3713:1: ( () otherlv_1= 'null' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3713:1: ( () otherlv_1= 'null' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3713:2: () otherlv_1= 'null'
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3713:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3714:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXNullLiteral8587); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3731:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3732:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3733:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8623);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8633); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3740:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3743:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3744:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3744:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3744:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3744:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3745:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3750:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3751:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3751:1: (lv_value_1_0= RULE_INT )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3752:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8684); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3776:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3777:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3778:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8725);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8735); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3785:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3788:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3789:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3789:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3789:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3789:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3790:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3795:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3796:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3796:1: (lv_value_1_0= RULE_STRING )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3797:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8786); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3821:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3822:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3823:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8827);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8837); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3830:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3833:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3834:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3834:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3834:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3834:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3835:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXTypeLiteral8883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXTypeLiteral8895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3848:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3849:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3849:1: ( ruleQualifiedName )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3850:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8918);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXTypeLiteral8930); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3875:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3876:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3877:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8966);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression8976); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3884:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3887:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3888:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3888:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3888:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3888:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3889:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXThrowExpression9022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3898:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3899:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3899:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3900:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9043);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3924:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3925:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3926:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9079);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9089); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3933:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3936:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3937:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3937:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3937:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3937:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3938:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXReturnExpression9135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3947:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3947:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3952:1: (lv_expression_2_0= ruleXExpression )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3953:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9166);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3977:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3978:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3979:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9203);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9213); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3986:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3989:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3990:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3990:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3990:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3990:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3991:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression9259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4000:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4001:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4001:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4002:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9280);
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

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4018:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==70) ) {
                alt65=1;
            }
            else if ( (LA65_0==69) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4018:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4018:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4018:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4018:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==70) ) {
                            int LA63_2 = input.LA(2);

                            if ( (synpred22_InternalXSpec()) ) {
                                alt63=1;
                            }


                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4018:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4020:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4021:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9310);
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
                    	    if ( cnt63 >= 1 ) break loop63;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4037:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==69) ) {
                        int LA64_1 = input.LA(2);

                        if ( (synpred23_InternalXSpec()) ) {
                            alt64=1;
                        }
                    }
                    switch (alt64) {
                        case 1 :
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4037:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4037:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4037:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9332); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4042:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4043:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4043:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4044:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9354);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4061:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4061:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4061:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4065:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4066:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4066:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4067:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9397);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4091:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4092:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4093:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9435);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9445); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4100:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4103:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4104:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4104:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4104:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4104:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4104:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleXCatchClause9490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXCatchClause9503); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4113:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4114:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4114:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4115:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9524);
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

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXCatchClause9536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4135:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4136:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4136:1: (lv_expression_4_0= ruleXExpression )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4137:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9557);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4161:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4162:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4163:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9594);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9605); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4170:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4173:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4174:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4174:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4175:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9652);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4185:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==38) ) {
                    int LA66_2 = input.LA(2);

                    if ( (LA66_2==RULE_ID) ) {
                        int LA66_3 = input.LA(3);

                        if ( (synpred25_InternalXSpec()) ) {
                            alt66=1;
                        }


                    }


                }


                switch (alt66) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4185:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4185:2: ( ( '.' )=>kw= '.' )
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4185:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleQualifiedName9680); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9703);
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
            	    break loop66;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4212:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4213:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4214:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9750);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9760); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4221:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4224:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4225:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4225:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            else if ( (LA67_0==42||LA67_0==71) ) {
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4226:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9807);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4236:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9834);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4252:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4253:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4254:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9869);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9879); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4261:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4264:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4265:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4265:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4265:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4265:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==42) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4265:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef9917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4269:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4270:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4270:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4271:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9938);
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

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4287:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==41) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4287:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef9951); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4291:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4292:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4292:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4293:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9972);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef9986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleXFunctionTypeRef10000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4317:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4318:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4318:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4319:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10021);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4343:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4344:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4345:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10057);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10067); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4352:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4355:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4356:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4356:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4356:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4356:2: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4357:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4357:1: ( ruleQualifiedName )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4358:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10115);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4371:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4371:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4371:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4371:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference10136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4376:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4377:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4377:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4378:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10158);
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

                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4394:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==41) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4394:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleJvmParameterizedTypeReference10171); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4398:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4399:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4399:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4400:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10192);
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
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference10206); if (state.failed) return current;
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4428:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4429:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4430:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10244);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10254); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4437:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4440:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4441:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4441:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID||LA72_0==42||LA72_0==71) ) {
                alt72=1;
            }
            else if ( (LA72_0==72) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4442:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10301);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4452:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10328);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4468:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4469:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4470:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10363);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10373); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4477:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4480:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4481:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4481:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4481:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4481:2: ()
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4482:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleJvmWildcardTypeReference10419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4491:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==73) ) {
                alt73=1;
            }
            else if ( (LA73_0==59) ) {
                alt73=2;
            }
            switch (alt73) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4491:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4491:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4492:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4492:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4493:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10441);
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
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4510:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4510:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4511:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4511:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4512:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10468);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4536:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4537:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4538:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10506);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10516); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4545:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4548:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4549:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4549:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4549:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmUpperBound10553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4553:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4554:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4554:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4555:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10574);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4579:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4580:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4581:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10610);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10620); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4588:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4591:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4592:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4592:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4592:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBoundAnded10657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4596:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4597:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4597:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4598:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10678);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4622:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4623:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4624:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10714);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10724); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4631:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4634:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4635:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4635:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4635:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleJvmLowerBound10761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4639:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4640:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4640:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4641:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10782);
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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4667:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4668:2: (iv_ruleValidID= ruleValidID EOF )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4669:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID10821);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID10832); if (state.failed) return current;

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
    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4676:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4679:28: (this_ID_0= RULE_ID )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4680:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID10871); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalXSpec
    public final void synpred1_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:519:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:519:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:519:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:519:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:519:5: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:520:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:520:2: ( ( ruleOpMultiAssign ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:521:1: ( ruleOpMultiAssign )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:521:1: ( ruleOpMultiAssign )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:522:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXSpec1031);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalXSpec

    // $ANTLR start synpred2_InternalXSpec
    public final void synpred2_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:647:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:647:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:647:4: ( () ( ( ruleOpOr ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:647:5: () ( ( ruleOpOr ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:647:5: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:648:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:648:2: ( ( ruleOpOr ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:649:1: ( ruleOpOr )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:649:1: ( ruleOpOr )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:650:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalXSpec1379);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalXSpec

    // $ANTLR start synpred3_InternalXSpec
    public final void synpred3_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:748:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:748:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:748:4: ( () ( ( ruleOpAnd ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:748:5: () ( ( ruleOpAnd ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:748:5: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:749:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:749:2: ( ( ruleOpAnd ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:750:1: ( ruleOpAnd )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:750:1: ( ruleOpAnd )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:751:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalXSpec1638);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalXSpec

    // $ANTLR start synpred4_InternalXSpec
    public final void synpred4_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:849:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:849:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:849:4: ( () ( ( ruleOpEquality ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:849:5: () ( ( ruleOpEquality ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:849:5: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:850:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:850:2: ( ( ruleOpEquality ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:851:1: ( ruleOpEquality )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:851:1: ( ruleOpEquality )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:852:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalXSpec1897);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalXSpec

    // $ANTLR start synpred5_InternalXSpec
    public final void synpred5_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:4: ( ( () 'instanceof' ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:5: ( () 'instanceof' )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:5: ( () 'instanceof' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:6: () 'instanceof'
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:957:6: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:958:1: 
        {
        }

        match(input,23,FOLLOW_23_in_synpred5_InternalXSpec2173); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalXSpec

    // $ANTLR start synpred6_InternalXSpec
    public final void synpred6_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:985:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:985:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:985:9: ( () ( ( ruleOpCompare ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:985:10: () ( ( ruleOpCompare ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:985:10: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:986:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:986:2: ( ( ruleOpCompare ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:987:1: ( ruleOpCompare )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:987:1: ( ruleOpCompare )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:988:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalXSpec2246);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalXSpec

    // $ANTLR start synpred7_InternalXSpec
    public final void synpred7_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1107:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1107:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1107:4: ( () ( ( ruleOpOther ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1107:5: () ( ( ruleOpOther ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1107:5: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1108:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1108:2: ( ( ruleOpOther ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1109:1: ( ruleOpOther )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1109:1: ( ruleOpOther )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1110:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalXSpec2565);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalXSpec

    // $ANTLR start synpred8_InternalXSpec
    public final void synpred8_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1215:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1215:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1215:4: ( () ( ( ruleOpAdd ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1215:5: () ( ( ruleOpAdd ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1215:5: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1216:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1216:2: ( ( ruleOpAdd ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1217:1: ( ruleOpAdd )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1217:1: ( ruleOpAdd )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1218:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalXSpec2845);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalXSpec

    // $ANTLR start synpred9_InternalXSpec
    public final void synpred9_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1323:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1323:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1323:4: ( () ( ( ruleOpMulti ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1323:5: () ( ( ruleOpMulti ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1323:5: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1324:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1324:2: ( ( ruleOpMulti ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1325:1: ( ruleOpMulti )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1325:1: ( ruleOpMulti )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1326:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalXSpec3125);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalXSpec

    // $ANTLR start synpred10_InternalXSpec
    public final void synpred10_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1556:3: ( ( () 'as' ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1556:4: ( () 'as' )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1556:4: ( () 'as' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1556:5: () 'as'
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1556:5: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1557:1: 
        {
        }

        match(input,37,FOLLOW_37_in_synpred10_InternalXSpec3719); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalXSpec

    // $ANTLR start synpred11_InternalXSpec
    public final void synpred11_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1616:6: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1617:1: 
        {
        }

        match(input,38,FOLLOW_38_in_synpred11_InternalXSpec3873); if (state.failed) return ;
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1618:1: ( ( ruleValidID ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1619:1: ( ruleValidID )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1619:1: ( ruleValidID )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1620:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalXSpec3882);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXSpec3888);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalXSpec

    // $ANTLR start synpred12_InternalXSpec
    public final void synpred12_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1674:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1674:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1674:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1674:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1674:10: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1675:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1675:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt74=3;
        switch ( input.LA(1) ) {
        case 38:
            {
            alt74=1;
            }
            break;
        case 39:
            {
            alt74=2;
            }
            break;
        case 40:
            {
            alt74=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 74, 0, input);

            throw nvae;
        }

        switch (alt74) {
            case 1 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1675:4: '.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalXSpec3991); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1677:6: ( ( '?.' ) )
                {
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1677:6: ( ( '?.' ) )
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1678:1: ( '?.' )
                {
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1678:1: ( '?.' )
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1679:2: '?.'
                {
                match(input,39,FOLLOW_39_in_synpred12_InternalXSpec4005); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1684:6: ( ( '*.' ) )
                {
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1684:6: ( ( '*.' ) )
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1685:1: ( '*.' )
                {
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1685:1: ( '*.' )
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1686:2: '*.'
                {
                match(input,40,FOLLOW_40_in_synpred12_InternalXSpec4025); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalXSpec

    // $ANTLR start synpred13_InternalXSpec
    public final void synpred13_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1795:4: ( ( '(' ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1796:1: ( '(' )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1796:1: ( '(' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1797:2: '('
        {
        match(input,42,FOLLOW_42_in_synpred13_InternalXSpec4252); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalXSpec

    // $ANTLR start synpred14_InternalXSpec
    public final void synpred14_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1816:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1816:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1816:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1816:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1816:6: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1817:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1817:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt76=2;
        int LA76_0 = input.LA(1);

        if ( (LA76_0==RULE_ID||LA76_0==42||LA76_0==71) ) {
            alt76=1;
        }
        switch (alt76) {
            case 1 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1817:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1817:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1818:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1818:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1819:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXSpec4304);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1821:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop75:
                do {
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==41) ) {
                        alt75=1;
                    }


                    switch (alt75) {
                	case 1 :
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1821:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred14_InternalXSpec4311); if (state.failed) return ;
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1822:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1823:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1823:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1824:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXSpec4318);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop75;
                    }
                } while (true);


                }
                break;

        }

        match(input,45,FOLLOW_45_in_synpred14_InternalXSpec4328); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalXSpec

    // $ANTLR start synpred16_InternalXSpec
    public final void synpred16_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2430:4: ( 'else' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:2430:6: 'else'
        {
        match(input,48,FOLLOW_48_in_synpred16_InternalXSpec5773); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalXSpec

    // $ANTLR start synpred17_InternalXSpec
    public final void synpred17_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3054:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3054:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3054:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3054:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3054:6: ( ( ruleJvmTypeReference ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3055:1: ( ruleJvmTypeReference )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3055:1: ( ruleJvmTypeReference )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3056:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalXSpec7139);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3058:2: ( ( ruleValidID ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3059:1: ( ruleValidID )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3059:1: ( ruleValidID )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3060:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalXSpec7148);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalXSpec

    // $ANTLR start synpred18_InternalXSpec
    public final void synpred18_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3301:4: ( ( '(' ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3302:1: ( '(' )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3302:1: ( '(' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3303:2: '('
        {
        match(input,42,FOLLOW_42_in_synpred18_InternalXSpec7597); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalXSpec

    // $ANTLR start synpred19_InternalXSpec
    public final void synpred19_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3322:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3322:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3322:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3322:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3322:6: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3323:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3323:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt80=2;
        int LA80_0 = input.LA(1);

        if ( (LA80_0==RULE_ID||LA80_0==42||LA80_0==71) ) {
            alt80=1;
        }
        switch (alt80) {
            case 1 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3323:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3323:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3324:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3324:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3325:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXSpec7649);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3327:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop79:
                do {
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==41) ) {
                        alt79=1;
                    }


                    switch (alt79) {
                	case 1 :
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3327:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred19_InternalXSpec7656); if (state.failed) return ;
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3328:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3329:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3329:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3330:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXSpec7663);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop79;
                    }
                } while (true);


                }
                break;

        }

        match(input,45,FOLLOW_45_in_synpred19_InternalXSpec7673); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalXSpec

    // $ANTLR start synpred20_InternalXSpec
    public final void synpred20_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3571:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3571:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3571:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3571:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3571:5: ()
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3572:1: 
        {
        }

        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3572:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==RULE_ID||LA82_0==42||LA82_0==71) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3572:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3572:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3573:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3573:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3574:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXSpec8244);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3576:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==41) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3576:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred20_InternalXSpec8251); if (state.failed) return ;
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3577:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3578:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3578:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3579:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXSpec8258);
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

        match(input,45,FOLLOW_45_in_synpred20_InternalXSpec8268); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalXSpec

    // $ANTLR start synpred21_InternalXSpec
    public final void synpred21_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3947:2: ( ( ruleXExpression ) )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3948:1: ( ruleXExpression )
        {
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3948:1: ( ruleXExpression )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:3949:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalXSpec9149);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalXSpec

    // $ANTLR start synpred22_InternalXSpec
    public final void synpred22_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4018:5: ( 'catch' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4018:7: 'catch'
        {
        match(input,70,FOLLOW_70_in_synpred22_InternalXSpec9294); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalXSpec

    // $ANTLR start synpred23_InternalXSpec
    public final void synpred23_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4037:5: ( 'finally' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4037:7: 'finally'
        {
        match(input,69,FOLLOW_69_in_synpred23_InternalXSpec9324); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalXSpec

    // $ANTLR start synpred25_InternalXSpec
    public final void synpred25_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4185:3: ( '.' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4186:2: '.'
        {
        match(input,38,FOLLOW_38_in_synpred25_InternalXSpec9671); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalXSpec

    // $ANTLR start synpred26_InternalXSpec
    public final void synpred26_InternalXSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4371:4: ( '<' )
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4371:6: '<'
        {
        match(input,27,FOLLOW_27_in_synpred26_InternalXSpec10128); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalXSpec

    // Delegated rules

    public final boolean synpred2_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalXSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalXSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA71 dfa71 = new DFA71(this);
    static final String DFA28_eotS =
        "\77\uffff";
    static final String DFA28_eofS =
        "\1\2\76\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA28_maxS =
        "\1\107\1\0\75\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA28_transitionS = {
            "\6\2\5\uffff\2\2\1\uffff\30\2\1\1\2\2\1\uffff\16\2\1\uffff"+
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
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1795:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\34\uffff";
    static final String DFA27_eofS =
        "\34\uffff";
    static final String DFA27_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA27_maxS =
        "\1\107\2\0\31\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA27_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\3\uffff\2\5\5\uffff\1\5\13\uffff\1\5\2\uffff\2\5\4\uffff"+
            "\1\5\5\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\3\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1816:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==RULE_ID) ) {s = 1;}

                        else if ( (LA27_0==42) ) {s = 2;}

                        else if ( (LA27_0==71) && (synpred14_InternalXSpec())) {s = 3;}

                        else if ( (LA27_0==45) && (synpred14_InternalXSpec())) {s = 4;}

                        else if ( ((LA27_0>=RULE_INT && LA27_0<=RULE_STRING)||LA27_0==15||LA27_0==27||(LA27_0>=30 && LA27_0<=31)||LA27_0==36||LA27_0==44||LA27_0==47||LA27_0==49||(LA27_0>=53 && LA27_0<=55)||LA27_0==59||(LA27_0>=61 && LA27_0<=68)) ) {s = 5;}

                        else if ( (LA27_0==43) ) {s = 27;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalXSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalXSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\77\uffff";
    static final String DFA54_eofS =
        "\1\2\76\uffff";
    static final String DFA54_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA54_maxS =
        "\1\107\1\0\75\uffff";
    static final String DFA54_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA54_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA54_transitionS = {
            "\6\2\5\uffff\2\2\1\uffff\30\2\1\1\2\2\1\uffff\16\2\1\uffff"+
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
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "3301:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\34\uffff";
    static final String DFA53_eofS =
        "\34\uffff";
    static final String DFA53_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA53_maxS =
        "\1\107\2\0\31\uffff";
    static final String DFA53_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA53_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\3\uffff\2\5\5\uffff\1\5\13\uffff\1\5\2\uffff\2\5\4\uffff"+
            "\1\5\5\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\3\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3322:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==RULE_ID) ) {s = 1;}

                        else if ( (LA53_0==42) ) {s = 2;}

                        else if ( (LA53_0==71) && (synpred19_InternalXSpec())) {s = 3;}

                        else if ( (LA53_0==45) && (synpred19_InternalXSpec())) {s = 4;}

                        else if ( ((LA53_0>=RULE_INT && LA53_0<=RULE_STRING)||LA53_0==15||LA53_0==27||(LA53_0>=30 && LA53_0<=31)||LA53_0==36||LA53_0==44||LA53_0==47||LA53_0==49||(LA53_0>=53 && LA53_0<=55)||LA53_0==59||(LA53_0>=61 && LA53_0<=68)) ) {s = 5;}

                        else if ( (LA53_0==43) ) {s = 27;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\34\uffff";
    static final String DFA60_eofS =
        "\34\uffff";
    static final String DFA60_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA60_maxS =
        "\1\107\2\0\31\uffff";
    static final String DFA60_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA60_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1\3\uffff\2\5\5\uffff\1\5\13\uffff\1\5\2\uffff\2\5\4\uffff"+
            "\1\5\5\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\3\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3571:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_0 = input.LA(1);

                         
                        int index60_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_0==RULE_ID) ) {s = 1;}

                        else if ( (LA60_0==42) ) {s = 2;}

                        else if ( (LA60_0==71) && (synpred20_InternalXSpec())) {s = 3;}

                        else if ( (LA60_0==45) && (synpred20_InternalXSpec())) {s = 4;}

                        else if ( ((LA60_0>=RULE_INT && LA60_0<=RULE_STRING)||LA60_0==15||LA60_0==27||(LA60_0>=30 && LA60_0<=31)||LA60_0==36||LA60_0==44||LA60_0==47||LA60_0==49||(LA60_0>=53 && LA60_0<=55)||LA60_0==59||(LA60_0>=61 && LA60_0<=68)) ) {s = 5;}

                        else if ( (LA60_0==43) ) {s = 27;}

                         
                        input.seek(index60_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_2 = input.LA(1);

                         
                        int index60_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index60_2);
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
    static final String DFA62_eotS =
        "\77\uffff";
    static final String DFA62_eofS =
        "\1\31\76\uffff";
    static final String DFA62_minS =
        "\1\4\30\0\46\uffff";
    static final String DFA62_maxS =
        "\1\107\30\0\46\uffff";
    static final String DFA62_acceptS =
        "\31\uffff\1\2\44\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\46\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1\3\31\1\15\1\17\5\uffff\1\6\1\31\1\uffff\11\31\1\10\2\31"+
            "\1\4\1\3\4\31\1\2\5\31\1\30\1\31\1\12\1\uffff\1\31\1\21\1\31"+
            "\1\7\3\31\1\22\1\23\1\24\3\31\1\11\1\uffff\1\5\1\13\1\14\1\16"+
            "\1\20\1\25\1\26\1\27\3\31",
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
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3947:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_3 = input.LA(1);

                         
                        int index62_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA62_4 = input.LA(1);

                         
                        int index62_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA62_5 = input.LA(1);

                         
                        int index62_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA62_6 = input.LA(1);

                         
                        int index62_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA62_7 = input.LA(1);

                         
                        int index62_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA62_8 = input.LA(1);

                         
                        int index62_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA62_9 = input.LA(1);

                         
                        int index62_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA62_10 = input.LA(1);

                         
                        int index62_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA62_11 = input.LA(1);

                         
                        int index62_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA62_12 = input.LA(1);

                         
                        int index62_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA62_13 = input.LA(1);

                         
                        int index62_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA62_14 = input.LA(1);

                         
                        int index62_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA62_15 = input.LA(1);

                         
                        int index62_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA62_16 = input.LA(1);

                         
                        int index62_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA62_17 = input.LA(1);

                         
                        int index62_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA62_18 = input.LA(1);

                         
                        int index62_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA62_19 = input.LA(1);

                         
                        int index62_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA62_20 = input.LA(1);

                         
                        int index62_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA62_21 = input.LA(1);

                         
                        int index62_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA62_22 = input.LA(1);

                         
                        int index62_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA62_23 = input.LA(1);

                         
                        int index62_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA62_24 = input.LA(1);

                         
                        int index62_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index62_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\77\uffff";
    static final String DFA71_eofS =
        "\1\2\76\uffff";
    static final String DFA71_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA71_maxS =
        "\1\107\1\0\75\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA71_transitionS = {
            "\6\2\5\uffff\2\2\1\uffff\11\2\1\1\21\2\1\uffff\16\2\1\uffff"+
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
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "4371:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalXSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXSpec_in_entryRuleXSpec75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSpec85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXSpec127 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSpec144 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleXSpec165 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleXSpec178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGiven_in_ruleSentence270 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWhen_in_ruleSentence291 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleThen_in_ruleSentence312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGiven_in_entryRuleGiven350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGiven360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GIVEN_TEXT_in_ruleGiven402 = new BitSet(new long[]{0xEEE29410C8008312L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleCode_in_ruleGiven428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhen_in_entryRuleWhen465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhen475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_TEXT_in_ruleWhen517 = new BitSet(new long[]{0xEEE29410C8008312L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleCode_in_ruleWhen543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThen_in_entryRuleThen580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThen590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THEN_TEXT_in_ruleThen632 = new BitSet(new long[]{0xEEE29410C8008312L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleCode_in_ruleThen658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleCode750 = new BitSet(new long[]{0xEEE29410C8008312L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment944 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment960 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1010 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1063 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpSingleAssign1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpMultiAssign1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1358 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1411 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1434 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpOr1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1617 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1670 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1693 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpAnd1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1876 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1929 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1952 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2156 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_23_in_ruleXRelationalExpression2192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2217 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2278 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2301 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2544 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2597 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2620 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2824 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2877 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2900 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpAdd2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpAdd3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3104 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3157 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3180 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpMulti3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3433 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpUnary3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpUnary3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3703 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleXCastedExpression3738 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3761 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3856 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall3905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3928 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3944 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3966 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4052 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4076 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4113 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4142 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4163 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4176 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4197 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall4211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4236 = new BitSet(new long[]{0x000005C000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4270 = new BitSet(new long[]{0xEEE2BC10C8008310L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4345 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4373 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4386 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4407 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4424 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5164 = new BitSet(new long[]{0x0000240000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5186 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_ruleXClosure5199 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5220 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5236 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5257 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5413 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_ruleXShortClosure5426 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5447 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_ruleXShortClosure5463 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXParenthesizedExpression5569 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5591 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXParenthesizedExpression5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression5694 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression5706 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5727 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression5739 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5760 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression5781 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression5897 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5919 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression5931 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5954 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSwitchExpression5966 = new BitSet(new long[]{0x0014040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5987 = new BitSet(new long[]{0x001C040000010010L,0x0000000000000080L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6001 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6013 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6034 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6140 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6154 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6175 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXCasePart6189 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression6302 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXForLoopExpression6314 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6335 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXForLoopExpression6347 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6368 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXForLoopExpression6380 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXWhileExpression6493 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXWhileExpression6505 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6526 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXWhileExpression6538 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression6651 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6672 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXDoWhileExpression6684 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXDoWhileExpression6696 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6717 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXDoWhileExpression6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression6821 = new BitSet(new long[]{0xEEE29410C8018310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6843 = new BitSet(new long[]{0xEFE29410C8018310L,0x000000000000001FL});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression6856 = new BitSet(new long[]{0xEEE29410C8018310L,0x000000000000001FL});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXVariableDeclaration7090 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7121 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7190 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7219 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXVariableDeclaration7233 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7473 = new BitSet(new long[]{0x0800000008000010L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall7487 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7508 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7521 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7542 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall7556 = new BitSet(new long[]{0x0800000008000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7581 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall7615 = new BitSet(new long[]{0xEEE2BC10C8008310L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7690 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7718 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7731 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7752 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper7819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper7866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIdOrSuper7890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier7989 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleStaticQualifier8007 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXConstructorCall8104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8127 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8140 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8161 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8174 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8195 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall8209 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall8223 = new BitSet(new long[]{0xEEE2BC10C8008310L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8285 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8313 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8326 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8347 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXBooleanLiteral8457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXBooleanLiteral8481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXNullLiteral8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXTypeLiteral8883 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXTypeLiteral8895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8918 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXTypeLiteral8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXThrowExpression9022 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXReturnExpression9135 = new BitSet(new long[]{0xEEE29410C8008312L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression9259 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9332 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9376 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXCatchClause9490 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXCatchClause9503 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9524 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXCatchClause9536 = new BitSet(new long[]{0xEEE29410C8008310L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9652 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleQualifiedName9680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9703 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef9917 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9938 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef9951 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9972 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef9986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleXFunctionTypeRef10000 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10115 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference10136 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10158 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_41_in_ruleJvmParameterizedTypeReference10171 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10192 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference10206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmWildcardTypeReference10419 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmUpperBound10553 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBoundAnded10657 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleJvmLowerBound10761 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID10821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID10832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID10871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXSpec1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalXSpec1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalXSpec1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalXSpec1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred5_InternalXSpec2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalXSpec2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalXSpec2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalXSpec2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalXSpec3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred10_InternalXSpec3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred11_InternalXSpec3873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalXSpec3882 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXSpec3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalXSpec3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred12_InternalXSpec4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalXSpec4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred13_InternalXSpec4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXSpec4304 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalXSpec4311 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXSpec4318 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred14_InternalXSpec4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred16_InternalXSpec5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalXSpec7139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalXSpec7148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred18_InternalXSpec7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXSpec7649 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred19_InternalXSpec7656 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXSpec7663 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred19_InternalXSpec7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXSpec8244 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred20_InternalXSpec8251 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXSpec8258 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred20_InternalXSpec8268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalXSpec9149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred22_InternalXSpec9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred23_InternalXSpec9324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred25_InternalXSpec9671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred26_InternalXSpec10128 = new BitSet(new long[]{0x0000000000000002L});

}