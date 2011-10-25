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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FEATURE_TEXT", "RULE_BACKGROUND_TEXT", "RULE_SCENARIO_TEXT", "RULE_GIVEN_TEXT", "RULE_WHEN_TEXT", "RULE_THEN_TEXT", "RULE_AND_TEXT", "RULE_EXAMPLE_TEXT", "RULE_EXAMPLE_ROW_END", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_COLON", "RULE_MNL", "RULE_SPACES", "RULE_NL", "RULE_TEXT_MULTI_LINE", "RULE_TEXT_AND_NL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'static'", "'extension'", "'.'", "'*'", "'|'", "'@'", "'('", "','", "')'", "'='", "'+'", "'{'", "'}'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'['", "']'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_TEXT_MULTI_LINE=20;
    public static final int RULE_ID=15;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int RULE_TEXT_AND_NL=21;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int RULE_ANY_OTHER=25;
    public static final int RULE_THEN_TEXT=9;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int RULE_EXAMPLE_TEXT=11;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__90=90;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_WHEN_TEXT=8;
    public static final int RULE_GIVEN_TEXT=7;
    public static final int RULE_EXAMPLE_ROW_END=12;
    public static final int RULE_SCENARIO_TEXT=6;
    public static final int T__59=59;
    public static final int RULE_INT=13;
    public static final int RULE_BACKGROUND_TEXT=5;
    public static final int RULE_MNL=17;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_NL=19;
    public static final int RULE_SPACES=18;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=22;
    public static final int T__30=30;
    public static final int RULE_COLON=16;
    public static final int T__31=31;
    public static final int RULE_STRING=14;
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
    public static final int RULE_WS=24;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_AND_TEXT=10;
    public static final int T__73=73;
    public static final int T__79=79;
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
            pushFollow(FollowSets000.FOLLOW_ruleJnario_in_entryRuleJnario75);
            iv_ruleJnario=ruleJnario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJnario; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJnario85); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:76:1: ruleJnario returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_name_3_0= RULE_FEATURE_TEXT ) ) ( (lv_background_4_0= ruleBackground ) )? ( (lv_scenarios_5_0= ruleScenario ) )+ ) ;
    public final EObject ruleJnario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_package_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_background_4_0 = null;

        EObject lv_scenarios_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:79:28: ( ( (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_name_3_0= RULE_FEATURE_TEXT ) ) ( (lv_background_4_0= ruleBackground ) )? ( (lv_scenarios_5_0= ruleScenario ) )+ ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:80:1: ( (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_name_3_0= RULE_FEATURE_TEXT ) ) ( (lv_background_4_0= ruleBackground ) )? ( (lv_scenarios_5_0= ruleScenario ) )+ )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:80:1: ( (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_name_3_0= RULE_FEATURE_TEXT ) ) ( (lv_background_4_0= ruleBackground ) )? ( (lv_scenarios_5_0= ruleScenario ) )+ )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:80:2: (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_name_3_0= RULE_FEATURE_TEXT ) ) ( (lv_background_4_0= ruleBackground ) )? ( (lv_scenarios_5_0= ruleScenario ) )+
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:80:2: (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:80:4: otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleJnario123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getJnarioAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:84:1: ( (lv_package_1_0= ruleQualifiedName ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:85:1: (lv_package_1_0= ruleQualifiedName )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:85:1: (lv_package_1_0= ruleQualifiedName )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:86:3: lv_package_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJnarioAccess().getPackageQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleJnario144);
                    lv_package_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJnarioRule());
                      	        }
                             		set(
                             			current, 
                             			"package",
                              		lv_package_1_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:102:4: ( (lv_imports_2_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJnarioAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImport_in_ruleJnario167);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getJnarioRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:120:3: ( (lv_name_3_0= RULE_FEATURE_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:121:1: (lv_name_3_0= RULE_FEATURE_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:121:1: (lv_name_3_0= RULE_FEATURE_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:122:3: lv_name_3_0= RULE_FEATURE_TEXT
            {
            lv_name_3_0=(Token)match(input,RULE_FEATURE_TEXT,FollowSets000.FOLLOW_RULE_FEATURE_TEXT_in_ruleJnario185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getJnarioAccess().getNameFEATURE_TEXTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJnarioRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"FEATURE_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:138:2: ( (lv_background_4_0= ruleBackground ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_BACKGROUND_TEXT||LA3_0==RULE_AND_TEXT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:139:1: (lv_background_4_0= ruleBackground )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:139:1: (lv_background_4_0= ruleBackground )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:140:3: lv_background_4_0= ruleBackground
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJnarioAccess().getBackgroundBackgroundParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBackground_in_ruleJnario211);
                    lv_background_4_0=ruleBackground();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJnarioRule());
                      	        }
                             		set(
                             			current, 
                             			"background",
                              		lv_background_4_0, 
                              		"Background");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:156:3: ( (lv_scenarios_5_0= ruleScenario ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SCENARIO_TEXT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:157:1: (lv_scenarios_5_0= ruleScenario )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:157:1: (lv_scenarios_5_0= ruleScenario )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:158:3: lv_scenarios_5_0= ruleScenario
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJnarioAccess().getScenariosScenarioParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleScenario_in_ruleJnario233);
            	    lv_scenarios_5_0=ruleScenario();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getJnarioRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scenarios",
            	              		lv_scenarios_5_0, 
            	              		"Scenario");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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


    // $ANTLR start "entryRuleImport"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:182:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:183:2: (iv_ruleImport= ruleImport EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:184:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport270);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport280); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:191:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:194:28: ( (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:195:1: (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:195:1: (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:195:3: otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleImport317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:199:1: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:199:2: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )?
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:199:2: ( (lv_static_1_0= 'static' ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:200:1: (lv_static_1_0= 'static' )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:200:1: (lv_static_1_0= 'static' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:201:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleImport336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getImportAccess().getStaticStaticKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:214:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==29) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:215:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:215:1: (lv_extension_2_0= 'extension' )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:216:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleImport367); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getImportAccess().getExtensionExtensionKeyword_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getImportRule());
                              	        }
                                     		setWithLastConsumed(current, "extension", true, "extension");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:229:5: ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:230:1: (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:230:1: (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:231:3: lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport404);
            lv_importedNamespace_3_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_3_0, 
                      		"QualifiedNameWithWildCard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:255:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:256:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:257:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard441);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:264:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:267:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:268:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:268:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:269:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard499);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:279:1: (kw= '.' kw= '*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:280:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleQualifiedNameWithWildCard518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleQualifiedNameWithWildCard531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleBackground"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:299:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:300:2: (iv_ruleBackground= ruleBackground EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:301:2: iv_ruleBackground= ruleBackground EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBackgroundRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBackground_in_entryRuleBackground573);
            iv_ruleBackground=ruleBackground();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBackground; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBackground583); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:308:1: ruleBackground returns [EObject current=null] : ( (this_BACKGROUND_TEXT_0= RULE_BACKGROUND_TEXT ( (lv_steps_1_0= ruleGiven ) ) ) | this_And_2= ruleAnd ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token this_BACKGROUND_TEXT_0=null;
        EObject lv_steps_1_0 = null;

        EObject this_And_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:311:28: ( ( (this_BACKGROUND_TEXT_0= RULE_BACKGROUND_TEXT ( (lv_steps_1_0= ruleGiven ) ) ) | this_And_2= ruleAnd ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:312:1: ( (this_BACKGROUND_TEXT_0= RULE_BACKGROUND_TEXT ( (lv_steps_1_0= ruleGiven ) ) ) | this_And_2= ruleAnd )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:312:1: ( (this_BACKGROUND_TEXT_0= RULE_BACKGROUND_TEXT ( (lv_steps_1_0= ruleGiven ) ) ) | this_And_2= ruleAnd )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_BACKGROUND_TEXT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_AND_TEXT) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:312:2: (this_BACKGROUND_TEXT_0= RULE_BACKGROUND_TEXT ( (lv_steps_1_0= ruleGiven ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:312:2: (this_BACKGROUND_TEXT_0= RULE_BACKGROUND_TEXT ( (lv_steps_1_0= ruleGiven ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:312:3: this_BACKGROUND_TEXT_0= RULE_BACKGROUND_TEXT ( (lv_steps_1_0= ruleGiven ) )
                    {
                    this_BACKGROUND_TEXT_0=(Token)match(input,RULE_BACKGROUND_TEXT,FollowSets000.FOLLOW_RULE_BACKGROUND_TEXT_in_ruleBackground620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BACKGROUND_TEXT_0, grammarAccess.getBackgroundAccess().getBACKGROUND_TEXTTerminalRuleCall_0_0()); 
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:316:1: ( (lv_steps_1_0= ruleGiven ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:317:1: (lv_steps_1_0= ruleGiven )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:317:1: (lv_steps_1_0= ruleGiven )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:318:3: lv_steps_1_0= ruleGiven
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBackgroundAccess().getStepsGivenParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGiven_in_ruleBackground640);
                    lv_steps_1_0=ruleGiven();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
                      	        }
                             		add(
                             			current, 
                             			"steps",
                              		lv_steps_1_0, 
                              		"Given");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:336:5: this_And_2= ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBackgroundAccess().getAndParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleBackground669);
                    this_And_2=ruleAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_And_2; 
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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:352:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:353:2: (iv_ruleScenario= ruleScenario EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:354:2: iv_ruleScenario= ruleScenario EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenarioRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleScenario_in_entryRuleScenario704);
            iv_ruleScenario=ruleScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScenario714); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:361:1: ruleScenario returns [EObject current=null] : ( ( (lv_name_0_0= RULE_SCENARIO_TEXT ) ) ( (lv_steps_1_0= ruleStep ) )* ( (lv_examples_2_0= ruleExamples ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_steps_1_0 = null;

        EObject lv_examples_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:364:28: ( ( ( (lv_name_0_0= RULE_SCENARIO_TEXT ) ) ( (lv_steps_1_0= ruleStep ) )* ( (lv_examples_2_0= ruleExamples ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:365:1: ( ( (lv_name_0_0= RULE_SCENARIO_TEXT ) ) ( (lv_steps_1_0= ruleStep ) )* ( (lv_examples_2_0= ruleExamples ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:365:1: ( ( (lv_name_0_0= RULE_SCENARIO_TEXT ) ) ( (lv_steps_1_0= ruleStep ) )* ( (lv_examples_2_0= ruleExamples ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:365:2: ( (lv_name_0_0= RULE_SCENARIO_TEXT ) ) ( (lv_steps_1_0= ruleStep ) )* ( (lv_examples_2_0= ruleExamples ) )*
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:365:2: ( (lv_name_0_0= RULE_SCENARIO_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:366:1: (lv_name_0_0= RULE_SCENARIO_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:366:1: (lv_name_0_0= RULE_SCENARIO_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:367:3: lv_name_0_0= RULE_SCENARIO_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_SCENARIO_TEXT,FollowSets000.FOLLOW_RULE_SCENARIO_TEXT_in_ruleScenario756); if (state.failed) return current;
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

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:383:2: ( (lv_steps_1_0= ruleStep ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_GIVEN_TEXT && LA9_0<=RULE_AND_TEXT)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:384:1: (lv_steps_1_0= ruleStep )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:384:1: (lv_steps_1_0= ruleStep )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:385:3: lv_steps_1_0= ruleStep
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStep_in_ruleScenario782);
            	    lv_steps_1_0=ruleStep();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"steps",
            	              		lv_steps_1_0, 
            	              		"Step");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:401:3: ( (lv_examples_2_0= ruleExamples ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_EXAMPLE_TEXT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:402:1: (lv_examples_2_0= ruleExamples )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:402:1: (lv_examples_2_0= ruleExamples )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:403:3: lv_examples_2_0= ruleExamples
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScenarioAccess().getExamplesExamplesParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExamples_in_ruleScenario804);
            	    lv_examples_2_0=ruleExamples();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"examples",
            	              		lv_examples_2_0, 
            	              		"Examples");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStep"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:427:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:428:2: (iv_ruleStep= ruleStep EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:429:2: iv_ruleStep= ruleStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStepRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStep_in_entryRuleStep841);
            iv_ruleStep=ruleStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStep; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStep851); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:436:1: ruleStep returns [EObject current=null] : (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Given_0 = null;

        EObject this_When_1 = null;

        EObject this_Then_2 = null;

        EObject this_And_3 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:439:28: ( (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:440:1: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:440:1: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_GIVEN_TEXT:
                {
                alt11=1;
                }
                break;
            case RULE_WHEN_TEXT:
                {
                alt11=2;
                }
                break;
            case RULE_THEN_TEXT:
                {
                alt11=3;
                }
                break;
            case RULE_AND_TEXT:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:441:5: this_Given_0= ruleGiven
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStepAccess().getGivenParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGiven_in_ruleStep898);
                    this_Given_0=ruleGiven();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Given_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:451:5: this_When_1= ruleWhen
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStepAccess().getWhenParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleWhen_in_ruleStep925);
                    this_When_1=ruleWhen();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_When_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:461:5: this_Then_2= ruleThen
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStepAccess().getThenParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleThen_in_ruleStep952);
                    this_Then_2=ruleThen();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Then_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:471:5: this_And_3= ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStepAccess().getAndParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleStep979);
                    this_And_3=ruleAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_And_3; 
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleGiven"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:487:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:488:2: (iv_ruleGiven= ruleGiven EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:489:2: iv_ruleGiven= ruleGiven EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGivenRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGiven_in_entryRuleGiven1014);
            iv_ruleGiven=ruleGiven();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGiven; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGiven1024); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:496:1: ruleGiven returns [EObject current=null] : ( ( (lv_name_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_code_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:499:28: ( ( ( (lv_name_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:500:1: ( ( (lv_name_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:500:1: ( ( (lv_name_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:500:2: ( (lv_name_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:500:2: ( (lv_name_0_0= RULE_GIVEN_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:501:1: (lv_name_0_0= RULE_GIVEN_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:501:1: (lv_name_0_0= RULE_GIVEN_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:502:3: lv_name_0_0= RULE_GIVEN_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_GIVEN_TEXT,FollowSets000.FOLLOW_RULE_GIVEN_TEXT_in_ruleGiven1066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getGivenAccess().getNameGIVEN_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGivenRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"GIVEN_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:518:2: ( (lv_code_1_0= ruleCode ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:519:1: (lv_code_1_0= ruleCode )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:519:1: (lv_code_1_0= ruleCode )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:520:3: lv_code_1_0= ruleCode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGivenAccess().getCodeCodeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCode_in_ruleGiven1092);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:544:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:545:2: (iv_ruleWhen= ruleWhen EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:546:2: iv_ruleWhen= ruleWhen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhenRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWhen_in_entryRuleWhen1128);
            iv_ruleWhen=ruleWhen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhen; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhen1138); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:553:1: ruleWhen returns [EObject current=null] : ( ( (lv_name_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_code_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:556:28: ( ( ( (lv_name_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:557:1: ( ( (lv_name_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:557:1: ( ( (lv_name_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:557:2: ( (lv_name_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:557:2: ( (lv_name_0_0= RULE_WHEN_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:558:1: (lv_name_0_0= RULE_WHEN_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:558:1: (lv_name_0_0= RULE_WHEN_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:559:3: lv_name_0_0= RULE_WHEN_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_WHEN_TEXT,FollowSets000.FOLLOW_RULE_WHEN_TEXT_in_ruleWhen1180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getWhenAccess().getNameWHEN_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWhenRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"WHEN_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:575:2: ( (lv_code_1_0= ruleCode ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:576:1: (lv_code_1_0= ruleCode )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:576:1: (lv_code_1_0= ruleCode )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:577:3: lv_code_1_0= ruleCode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhenAccess().getCodeCodeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCode_in_ruleWhen1206);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:601:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:602:2: (iv_ruleThen= ruleThen EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:603:2: iv_ruleThen= ruleThen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThenRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleThen_in_entryRuleThen1242);
            iv_ruleThen=ruleThen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThen; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleThen1252); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:610:1: ruleThen returns [EObject current=null] : ( ( (lv_name_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_code_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:613:28: ( ( ( (lv_name_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:614:1: ( ( (lv_name_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:614:1: ( ( (lv_name_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:614:2: ( (lv_name_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:614:2: ( (lv_name_0_0= RULE_THEN_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:615:1: (lv_name_0_0= RULE_THEN_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:615:1: (lv_name_0_0= RULE_THEN_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:616:3: lv_name_0_0= RULE_THEN_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_THEN_TEXT,FollowSets000.FOLLOW_RULE_THEN_TEXT_in_ruleThen1294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getThenAccess().getNameTHEN_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getThenRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"THEN_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:632:2: ( (lv_code_1_0= ruleCode ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:633:1: (lv_code_1_0= ruleCode )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:633:1: (lv_code_1_0= ruleCode )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:634:3: lv_code_1_0= ruleCode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getThenAccess().getCodeCodeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCode_in_ruleThen1320);
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


    // $ANTLR start "entryRuleAnd"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:658:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:659:2: (iv_ruleAnd= ruleAnd EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:660:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd1356);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd1366); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:667:1: ruleAnd returns [EObject current=null] : ( ( (lv_name_0_0= RULE_AND_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_code_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:670:28: ( ( ( (lv_name_0_0= RULE_AND_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:671:1: ( ( (lv_name_0_0= RULE_AND_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:671:1: ( ( (lv_name_0_0= RULE_AND_TEXT ) ) ( (lv_code_1_0= ruleCode ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:671:2: ( (lv_name_0_0= RULE_AND_TEXT ) ) ( (lv_code_1_0= ruleCode ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:671:2: ( (lv_name_0_0= RULE_AND_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:672:1: (lv_name_0_0= RULE_AND_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:672:1: (lv_name_0_0= RULE_AND_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:673:3: lv_name_0_0= RULE_AND_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_AND_TEXT,FollowSets000.FOLLOW_RULE_AND_TEXT_in_ruleAnd1408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAndAccess().getNameAND_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAndRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"AND_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:689:2: ( (lv_code_1_0= ruleCode ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:690:1: (lv_code_1_0= ruleCode )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:690:1: (lv_code_1_0= ruleCode )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:691:3: lv_code_1_0= ruleCode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAndAccess().getCodeCodeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCode_in_ruleAnd1434);
            lv_code_1_0=ruleCode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAndRule());
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleCode"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:715:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:716:2: (iv_ruleCode= ruleCode EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:717:2: iv_ruleCode= ruleCode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCode_in_entryRuleCode1470);
            iv_ruleCode=ruleCode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCode; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCode1480); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:724:1: ruleCode returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_blockExpression_2_0= ruleBlockExpression ) )? ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_1_0 = null;

        EObject lv_blockExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:727:28: ( ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_blockExpression_2_0= ruleBlockExpression ) )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:728:1: ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_blockExpression_2_0= ruleBlockExpression ) )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:728:1: ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_blockExpression_2_0= ruleBlockExpression ) )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:728:2: () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_blockExpression_2_0= ruleBlockExpression ) )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:728:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:729:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCodeAccess().getCodeAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:734:2: ( (lv_annotations_1_0= ruleXAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:735:1: (lv_annotations_1_0= ruleXAnnotation )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:735:1: (lv_annotations_1_0= ruleXAnnotation )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:736:3: lv_annotations_1_0= ruleXAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCodeAccess().getAnnotationsXAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXAnnotation_in_ruleCode1535);
            	    lv_annotations_1_0=ruleXAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"XAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:752:3: ( (lv_blockExpression_2_0= ruleBlockExpression ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_ID)||LA13_0==34||(LA13_0>=38 && LA13_0<=39)||LA13_0==50||LA13_0==53||LA13_0==57||LA13_0==61||LA13_0==63||LA13_0==65||(LA13_0>=69 && LA13_0<=71)||(LA13_0>=73 && LA13_0<=75)||(LA13_0>=77 && LA13_0<=84)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:753:1: (lv_blockExpression_2_0= ruleBlockExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:753:1: (lv_blockExpression_2_0= ruleBlockExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:754:3: lv_blockExpression_2_0= ruleBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCodeAccess().getBlockExpressionBlockExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBlockExpression_in_ruleCode1557);
                    lv_blockExpression_2_0=ruleBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCodeRule());
                      	        }
                             		set(
                             			current, 
                             			"blockExpression",
                              		lv_blockExpression_2_0, 
                              		"BlockExpression");
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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleBlockExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:778:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:779:2: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:780:2: iv_ruleBlockExpression= ruleBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression1594);
            iv_ruleBlockExpression=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlockExpression1604); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:787:1: ruleBlockExpression returns [EObject current=null] : ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+ ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:790:28: ( ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+ )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:791:1: ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:791:1: ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_ID)||LA14_0==34||(LA14_0>=38 && LA14_0<=39)||LA14_0==50||LA14_0==53||LA14_0==57||LA14_0==61||LA14_0==63||LA14_0==65||(LA14_0>=69 && LA14_0<=71)||(LA14_0>=73 && LA14_0<=75)||(LA14_0>=77 && LA14_0<=84)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:792:1: (lv_expressions_0_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:792:1: (lv_expressions_0_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:793:3: lv_expressions_0_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXExpressionInsideBlock_in_ruleBlockExpression1649);
            	    lv_expressions_0_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockExpressionRule());
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
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleExamples"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:817:1: entryRuleExamples returns [EObject current=null] : iv_ruleExamples= ruleExamples EOF ;
    public final EObject entryRuleExamples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamples = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:818:2: (iv_ruleExamples= ruleExamples EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:819:2: iv_ruleExamples= ruleExamples EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExamplesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExamples_in_entryRuleExamples1685);
            iv_ruleExamples=ruleExamples();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExamples; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExamples1695); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExamples"


    // $ANTLR start "ruleExamples"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:826:1: ruleExamples returns [EObject current=null] : ( ( (lv_name_0_0= RULE_EXAMPLE_TEXT ) ) ( (lv_heading_1_0= ruleExampleHeading ) ) ( (lv_rows_2_0= ruleExampleRow ) )* ) ;
    public final EObject ruleExamples() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_heading_1_0 = null;

        EObject lv_rows_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:829:28: ( ( ( (lv_name_0_0= RULE_EXAMPLE_TEXT ) ) ( (lv_heading_1_0= ruleExampleHeading ) ) ( (lv_rows_2_0= ruleExampleRow ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:830:1: ( ( (lv_name_0_0= RULE_EXAMPLE_TEXT ) ) ( (lv_heading_1_0= ruleExampleHeading ) ) ( (lv_rows_2_0= ruleExampleRow ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:830:1: ( ( (lv_name_0_0= RULE_EXAMPLE_TEXT ) ) ( (lv_heading_1_0= ruleExampleHeading ) ) ( (lv_rows_2_0= ruleExampleRow ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:830:2: ( (lv_name_0_0= RULE_EXAMPLE_TEXT ) ) ( (lv_heading_1_0= ruleExampleHeading ) ) ( (lv_rows_2_0= ruleExampleRow ) )*
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:830:2: ( (lv_name_0_0= RULE_EXAMPLE_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:831:1: (lv_name_0_0= RULE_EXAMPLE_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:831:1: (lv_name_0_0= RULE_EXAMPLE_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:832:3: lv_name_0_0= RULE_EXAMPLE_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_EXAMPLE_TEXT,FollowSets000.FOLLOW_RULE_EXAMPLE_TEXT_in_ruleExamples1737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getExamplesAccess().getNameEXAMPLE_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExamplesRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"EXAMPLE_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:848:2: ( (lv_heading_1_0= ruleExampleHeading ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:849:1: (lv_heading_1_0= ruleExampleHeading )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:849:1: (lv_heading_1_0= ruleExampleHeading )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:850:3: lv_heading_1_0= ruleExampleHeading
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExamplesAccess().getHeadingExampleHeadingParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExampleHeading_in_ruleExamples1763);
            lv_heading_1_0=ruleExampleHeading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExamplesRule());
              	        }
                     		set(
                     			current, 
                     			"heading",
                      		lv_heading_1_0, 
                      		"ExampleHeading");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:866:2: ( (lv_rows_2_0= ruleExampleRow ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:867:1: (lv_rows_2_0= ruleExampleRow )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:867:1: (lv_rows_2_0= ruleExampleRow )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:868:3: lv_rows_2_0= ruleExampleRow
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExamplesAccess().getRowsExampleRowParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExampleRow_in_ruleExamples1784);
            	    lv_rows_2_0=ruleExampleRow();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExamplesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rows",
            	              		lv_rows_2_0, 
            	              		"ExampleRow");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleExamples"


    // $ANTLR start "entryRuleExampleHeading"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:892:1: entryRuleExampleHeading returns [EObject current=null] : iv_ruleExampleHeading= ruleExampleHeading EOF ;
    public final EObject entryRuleExampleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleHeading = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:893:2: (iv_ruleExampleHeading= ruleExampleHeading EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:894:2: iv_ruleExampleHeading= ruleExampleHeading EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleHeadingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExampleHeading_in_entryRuleExampleHeading1821);
            iv_ruleExampleHeading=ruleExampleHeading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExampleHeading; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExampleHeading1831); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExampleHeading"


    // $ANTLR start "ruleExampleHeading"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:901:1: ruleExampleHeading returns [EObject current=null] : ( ( (lv_parts_0_0= ruleExampleHeadingCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) ;
    public final EObject ruleExampleHeading() throws RecognitionException {
        EObject current = null;

        Token this_EXAMPLE_ROW_END_1=null;
        EObject lv_parts_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:904:28: ( ( ( (lv_parts_0_0= ruleExampleHeadingCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:905:1: ( ( (lv_parts_0_0= ruleExampleHeadingCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:905:1: ( ( (lv_parts_0_0= ruleExampleHeadingCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:905:2: ( (lv_parts_0_0= ruleExampleHeadingCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:905:2: ( (lv_parts_0_0= ruleExampleHeadingCell ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:906:1: (lv_parts_0_0= ruleExampleHeadingCell )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:906:1: (lv_parts_0_0= ruleExampleHeadingCell )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:907:3: lv_parts_0_0= ruleExampleHeadingCell
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExampleHeadingAccess().getPartsExampleHeadingCellParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExampleHeadingCell_in_ruleExampleHeading1877);
            	    lv_parts_0_0=ruleExampleHeadingCell();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExampleHeadingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parts",
            	              		lv_parts_0_0, 
            	              		"ExampleHeadingCell");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            this_EXAMPLE_ROW_END_1=(Token)match(input,RULE_EXAMPLE_ROW_END,FollowSets000.FOLLOW_RULE_EXAMPLE_ROW_END_in_ruleExampleHeading1889); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EXAMPLE_ROW_END_1, grammarAccess.getExampleHeadingAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleExampleHeading"


    // $ANTLR start "entryRuleExampleHeadingCell"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:935:1: entryRuleExampleHeadingCell returns [EObject current=null] : iv_ruleExampleHeadingCell= ruleExampleHeadingCell EOF ;
    public final EObject entryRuleExampleHeadingCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleHeadingCell = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:936:2: (iv_ruleExampleHeadingCell= ruleExampleHeadingCell EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:937:2: iv_ruleExampleHeadingCell= ruleExampleHeadingCell EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleHeadingCellRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExampleHeadingCell_in_entryRuleExampleHeadingCell1924);
            iv_ruleExampleHeadingCell=ruleExampleHeadingCell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExampleHeadingCell; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExampleHeadingCell1934); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExampleHeadingCell"


    // $ANTLR start "ruleExampleHeadingCell"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:944:1: ruleExampleHeadingCell returns [EObject current=null] : ( () otherlv_1= '|' ( (lv_name_2_0= ruleValidID ) ) ) ;
    public final EObject ruleExampleHeadingCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:947:28: ( ( () otherlv_1= '|' ( (lv_name_2_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:948:1: ( () otherlv_1= '|' ( (lv_name_2_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:948:1: ( () otherlv_1= '|' ( (lv_name_2_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:948:2: () otherlv_1= '|' ( (lv_name_2_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:948:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:949:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExampleHeadingCellAccess().getExampleHeadingCellAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleExampleHeadingCell1980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExampleHeadingCellAccess().getVerticalLineKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:958:1: ( (lv_name_2_0= ruleValidID ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:959:1: (lv_name_2_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:959:1: (lv_name_2_0= ruleValidID )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:960:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExampleHeadingCellAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleExampleHeadingCell2001);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExampleHeadingCellRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
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
    // $ANTLR end "ruleExampleHeadingCell"


    // $ANTLR start "entryRuleExampleRow"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:984:1: entryRuleExampleRow returns [EObject current=null] : iv_ruleExampleRow= ruleExampleRow EOF ;
    public final EObject entryRuleExampleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleRow = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:985:2: (iv_ruleExampleRow= ruleExampleRow EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:986:2: iv_ruleExampleRow= ruleExampleRow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleRowRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExampleRow_in_entryRuleExampleRow2037);
            iv_ruleExampleRow=ruleExampleRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExampleRow; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExampleRow2047); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExampleRow"


    // $ANTLR start "ruleExampleRow"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:993:1: ruleExampleRow returns [EObject current=null] : ( ( (lv_parts_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) ;
    public final EObject ruleExampleRow() throws RecognitionException {
        EObject current = null;

        Token this_EXAMPLE_ROW_END_1=null;
        EObject lv_parts_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:996:28: ( ( ( (lv_parts_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:997:1: ( ( (lv_parts_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:997:1: ( ( (lv_parts_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:997:2: ( (lv_parts_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:997:2: ( (lv_parts_0_0= ruleExampleCell ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:998:1: (lv_parts_0_0= ruleExampleCell )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:998:1: (lv_parts_0_0= ruleExampleCell )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:999:3: lv_parts_0_0= ruleExampleCell
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExampleRowAccess().getPartsExampleCellParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExampleCell_in_ruleExampleRow2093);
            	    lv_parts_0_0=ruleExampleCell();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExampleRowRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parts",
            	              		lv_parts_0_0, 
            	              		"ExampleCell");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            this_EXAMPLE_ROW_END_1=(Token)match(input,RULE_EXAMPLE_ROW_END,FollowSets000.FOLLOW_RULE_EXAMPLE_ROW_END_in_ruleExampleRow2105); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EXAMPLE_ROW_END_1, grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleExampleRow"


    // $ANTLR start "entryRuleExampleCell"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1027:1: entryRuleExampleCell returns [EObject current=null] : iv_ruleExampleCell= ruleExampleCell EOF ;
    public final EObject entryRuleExampleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleCell = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1028:2: (iv_ruleExampleCell= ruleExampleCell EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1029:2: iv_ruleExampleCell= ruleExampleCell EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleCellRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExampleCell_in_entryRuleExampleCell2140);
            iv_ruleExampleCell=ruleExampleCell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExampleCell; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExampleCell2150); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExampleCell"


    // $ANTLR start "ruleExampleCell"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1036:1: ruleExampleCell returns [EObject current=null] : (otherlv_0= '|' ( (lv_name_1_0= ruleXExpression ) ) ) ;
    public final EObject ruleExampleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1039:28: ( (otherlv_0= '|' ( (lv_name_1_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1040:1: (otherlv_0= '|' ( (lv_name_1_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1040:1: (otherlv_0= '|' ( (lv_name_1_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1040:3: otherlv_0= '|' ( (lv_name_1_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleExampleCell2187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExampleCellAccess().getVerticalLineKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1044:1: ( (lv_name_1_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1045:1: (lv_name_1_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1045:1: (lv_name_1_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1046:3: lv_name_1_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExampleCellAccess().getNameXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleExampleCell2208);
            lv_name_1_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExampleCellRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
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
    // $ANTLR end "ruleExampleCell"


    // $ANTLR start "entryRuleXAnnotation"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1070:1: entryRuleXAnnotation returns [EObject current=null] : iv_ruleXAnnotation= ruleXAnnotation EOF ;
    public final EObject entryRuleXAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotation = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1071:2: (iv_ruleXAnnotation= ruleXAnnotation EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1072:2: iv_ruleXAnnotation= ruleXAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAnnotation_in_entryRuleXAnnotation2244);
            iv_ruleXAnnotation=ruleXAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXAnnotation2254); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotation"


    // $ANTLR start "ruleXAnnotation"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1079:1: ruleXAnnotation returns [EObject current=null] : ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )? ) ;
    public final EObject ruleXAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_elementValuePairs_4_0 = null;

        EObject lv_elementValuePairs_6_0 = null;

        EObject lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1082:28: ( ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1083:1: ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1083:1: ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1083:2: () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1083:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1084:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXAnnotationAccess().getXAnnotationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleXAnnotation2300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAnnotationAccess().getCommercialAtKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1093:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1094:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1094:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1095:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXAnnotationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationAccess().getAnnotationTypeJvmAnnotationTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleXAnnotation2323);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1108:2: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1108:3: ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')'
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1108:3: ( ( '(' )=>otherlv_3= '(' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1108:4: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXAnnotation2344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1113:2: ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )?
                    int alt19=3;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==37) ) {
                            alt19=1;
                        }
                        else if ( (LA19_1==36||LA19_1==76) ) {
                            alt19=2;
                        }
                    }
                    else if ( ((LA19_0>=RULE_INT && LA19_0<=RULE_STRING)||(LA19_0>=33 && LA19_0<=34)||LA19_0==39||LA19_0==75||(LA19_0>=78 && LA19_0<=79)||LA19_0==81) ) {
                        alt19=2;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1113:3: ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1113:3: ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1113:4: ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )*
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1113:4: ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1114:1: (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1114:1: (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1115:3: lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAnnotationAccess().getElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation2368);
                            lv_elementValuePairs_4_0=ruleXAnnotationElementValuePair();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAnnotationRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"elementValuePairs",
                                      		lv_elementValuePairs_4_0, 
                                      		"XAnnotationElementValuePair");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1131:2: (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==35) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1131:4: otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXAnnotation2381); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getXAnnotationAccess().getCommaKeyword_3_1_0_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1135:1: ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) )
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1136:1: (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair )
                            	    {
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1136:1: (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair )
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1137:3: lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXAnnotationAccess().getElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation2402);
                            	    lv_elementValuePairs_6_0=ruleXAnnotationElementValuePair();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXAnnotationRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"elementValuePairs",
                            	              		lv_elementValuePairs_6_0, 
                            	              		"XAnnotationElementValuePair");
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
                            break;
                        case 2 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1154:6: ( (lv_value_7_0= ruleXAnnotationElementValue ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1154:6: ( (lv_value_7_0= ruleXAnnotationElementValue ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1155:1: (lv_value_7_0= ruleXAnnotationElementValue )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1155:1: (lv_value_7_0= ruleXAnnotationElementValue )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1156:3: lv_value_7_0= ruleXAnnotationElementValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAnnotationAccess().getValueXAnnotationElementValueParserRuleCall_3_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotation2432);
                            lv_value_7_0=ruleXAnnotationElementValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAnnotationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_7_0, 
                                      		"XAnnotationElementValue");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXAnnotation2446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleXAnnotation"


    // $ANTLR start "entryRuleXAnnotationElementValuePair"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1184:1: entryRuleXAnnotationElementValuePair returns [EObject current=null] : iv_ruleXAnnotationElementValuePair= ruleXAnnotationElementValuePair EOF ;
    public final EObject entryRuleXAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationElementValuePair = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1185:2: (iv_ruleXAnnotationElementValuePair= ruleXAnnotationElementValuePair EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1186:2: iv_ruleXAnnotationElementValuePair= ruleXAnnotationElementValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationElementValuePairRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValuePair_in_entryRuleXAnnotationElementValuePair2484);
            iv_ruleXAnnotationElementValuePair=ruleXAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationElementValuePair; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXAnnotationElementValuePair2494); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotationElementValuePair"


    // $ANTLR start "ruleXAnnotationElementValuePair"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1193:1: ruleXAnnotationElementValuePair returns [EObject current=null] : ( ( ( ruleValidID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXAnnotationElementValue ) ) ) ;
    public final EObject ruleXAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1196:28: ( ( ( ( ruleValidID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXAnnotationElementValue ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1197:1: ( ( ( ruleValidID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXAnnotationElementValue ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1197:1: ( ( ( ruleValidID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXAnnotationElementValue ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1197:2: ( ( ruleValidID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXAnnotationElementValue ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1197:2: ( ( ruleValidID ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1198:1: ( ruleValidID )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1198:1: ( ruleValidID )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1199:3: ruleValidID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXAnnotationElementValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationElementValuePairAccess().getElementJvmOperationCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleXAnnotationElementValuePair2542);
            ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleXAnnotationElementValuePair2554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAnnotationElementValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1216:1: ( (lv_value_2_0= ruleXAnnotationElementValue ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1217:1: (lv_value_2_0= ruleXAnnotationElementValue )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1217:1: (lv_value_2_0= ruleXAnnotationElementValue )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1218:3: lv_value_2_0= ruleXAnnotationElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationElementValuePairAccess().getValueXAnnotationElementValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValuePair2575);
            lv_value_2_0=ruleXAnnotationElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXAnnotationElementValuePairRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"XAnnotationElementValue");
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
    // $ANTLR end "ruleXAnnotationElementValuePair"


    // $ANTLR start "entryRuleXAnnotationElementValueStringConcatenation"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1242:1: entryRuleXAnnotationElementValueStringConcatenation returns [EObject current=null] : iv_ruleXAnnotationElementValueStringConcatenation= ruleXAnnotationElementValueStringConcatenation EOF ;
    public final EObject entryRuleXAnnotationElementValueStringConcatenation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationElementValueStringConcatenation = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1243:2: (iv_ruleXAnnotationElementValueStringConcatenation= ruleXAnnotationElementValueStringConcatenation EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1244:2: iv_ruleXAnnotationElementValueStringConcatenation= ruleXAnnotationElementValueStringConcatenation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationElementValueStringConcatenationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValueStringConcatenation_in_entryRuleXAnnotationElementValueStringConcatenation2611);
            iv_ruleXAnnotationElementValueStringConcatenation=ruleXAnnotationElementValueStringConcatenation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationElementValueStringConcatenation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXAnnotationElementValueStringConcatenation2621); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotationElementValueStringConcatenation"


    // $ANTLR start "ruleXAnnotationElementValueStringConcatenation"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1251:1: ruleXAnnotationElementValueStringConcatenation returns [EObject current=null] : (this_XAnnotationElementValue_0= ruleXAnnotationElementValue ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )* ) ;
    public final EObject ruleXAnnotationElementValueStringConcatenation() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_XAnnotationElementValue_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1254:28: ( (this_XAnnotationElementValue_0= ruleXAnnotationElementValue ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1255:1: (this_XAnnotationElementValue_0= ruleXAnnotationElementValue ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1255:1: (this_XAnnotationElementValue_0= ruleXAnnotationElementValue ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1256:5: this_XAnnotationElementValue_0= ruleXAnnotationElementValue ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValueStringConcatenation2668);
            this_XAnnotationElementValue_0=ruleXAnnotationElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAnnotationElementValue_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1264:1: ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1264:2: () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1264:2: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1265:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueBinaryOperationLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1270:2: ( (lv_operator_2_0= '+' ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1271:1: (lv_operator_2_0= '+' )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1271:1: (lv_operator_2_0= '+' )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1272:3: lv_operator_2_0= '+'
            	    {
            	    lv_operator_2_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleXAnnotationElementValueStringConcatenation2695); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_operator_2_0, grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getOperatorPlusSignKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAnnotationElementValueStringConcatenationRule());
            	      	        }
            	             		setWithLastConsumed(current, "operator", lv_operator_2_0, "+");
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1285:2: ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1286:1: (lv_rightOperand_3_0= ruleXAnnotationElementValue )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1286:1: (lv_rightOperand_3_0= ruleXAnnotationElementValue )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1287:3: lv_rightOperand_3_0= ruleXAnnotationElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getRightOperandXAnnotationElementValueParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValueStringConcatenation2729);
            	    lv_rightOperand_3_0=ruleXAnnotationElementValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAnnotationElementValueStringConcatenationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAnnotationElementValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleXAnnotationElementValueStringConcatenation"


    // $ANTLR start "entryRuleXAnnotationElementValue"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1311:1: entryRuleXAnnotationElementValue returns [EObject current=null] : iv_ruleXAnnotationElementValue= ruleXAnnotationElementValue EOF ;
    public final EObject entryRuleXAnnotationElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationElementValue = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1312:2: (iv_ruleXAnnotationElementValue= ruleXAnnotationElementValue EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1313:2: iv_ruleXAnnotationElementValue= ruleXAnnotationElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationElementValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValue_in_entryRuleXAnnotationElementValue2767);
            iv_ruleXAnnotationElementValue=ruleXAnnotationElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationElementValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXAnnotationElementValue2777); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotationElementValue"


    // $ANTLR start "ruleXAnnotationElementValue"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1320:1: ruleXAnnotationElementValue returns [EObject current=null] : (this_XAnnotation_0= ruleXAnnotation | this_XAnnotationValueArray_1= ruleXAnnotationValueArray | this_XStringLiteral_2= ruleXStringLiteral | this_XBooleanLiteral_3= ruleXBooleanLiteral | this_XIntLiteral_4= ruleXIntLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XAnnotationValueFieldReference_6= ruleXAnnotationValueFieldReference | (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' ) ) ;
    public final EObject ruleXAnnotationElementValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_XAnnotation_0 = null;

        EObject this_XAnnotationValueArray_1 = null;

        EObject this_XStringLiteral_2 = null;

        EObject this_XBooleanLiteral_3 = null;

        EObject this_XIntLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;

        EObject this_XAnnotationValueFieldReference_6 = null;

        EObject this_XAnnotationElementValueStringConcatenation_8 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1323:28: ( (this_XAnnotation_0= ruleXAnnotation | this_XAnnotationValueArray_1= ruleXAnnotationValueArray | this_XStringLiteral_2= ruleXStringLiteral | this_XBooleanLiteral_3= ruleXBooleanLiteral | this_XIntLiteral_4= ruleXIntLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XAnnotationValueFieldReference_6= ruleXAnnotationValueFieldReference | (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1324:1: (this_XAnnotation_0= ruleXAnnotation | this_XAnnotationValueArray_1= ruleXAnnotationValueArray | this_XStringLiteral_2= ruleXStringLiteral | this_XBooleanLiteral_3= ruleXBooleanLiteral | this_XIntLiteral_4= ruleXIntLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XAnnotationValueFieldReference_6= ruleXAnnotationValueFieldReference | (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1324:1: (this_XAnnotation_0= ruleXAnnotation | this_XAnnotationValueArray_1= ruleXAnnotationValueArray | this_XStringLiteral_2= ruleXStringLiteral | this_XBooleanLiteral_3= ruleXBooleanLiteral | this_XIntLiteral_4= ruleXIntLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XAnnotationValueFieldReference_6= ruleXAnnotationValueFieldReference | (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' ) )
            int alt22=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt22=1;
                }
                break;
            case 39:
                {
                alt22=2;
                }
                break;
            case RULE_STRING:
                {
                alt22=3;
                }
                break;
            case 78:
            case 79:
                {
                alt22=4;
                }
                break;
            case RULE_INT:
                {
                alt22=5;
                }
                break;
            case 81:
                {
                alt22=6;
                }
                break;
            case RULE_ID:
            case 75:
                {
                alt22=7;
                }
                break;
            case 34:
                {
                alt22=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1325:5: this_XAnnotation_0= ruleXAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXAnnotation_in_ruleXAnnotationElementValue2824);
                    this_XAnnotation_0=ruleXAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAnnotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1335:5: this_XAnnotationValueArray_1= ruleXAnnotationValueArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXAnnotationValueArrayParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXAnnotationValueArray_in_ruleXAnnotationElementValue2851);
                    this_XAnnotationValueArray_1=ruleXAnnotationValueArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAnnotationValueArray_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1345:5: this_XStringLiteral_2= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXStringLiteral_in_ruleXAnnotationElementValue2878);
                    this_XStringLiteral_2=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1355:5: this_XBooleanLiteral_3= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXBooleanLiteral_in_ruleXAnnotationElementValue2905);
                    this_XBooleanLiteral_3=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1365:5: this_XIntLiteral_4= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXIntLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXIntLiteral_in_ruleXAnnotationElementValue2932);
                    this_XIntLiteral_4=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1375:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXTypeLiteral_in_ruleXAnnotationElementValue2959);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1385:5: this_XAnnotationValueFieldReference_6= ruleXAnnotationValueFieldReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXAnnotationValueFieldReferenceParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXAnnotationValueFieldReference_in_ruleXAnnotationElementValue2986);
                    this_XAnnotationValueFieldReference_6=ruleXAnnotationValueFieldReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAnnotationValueFieldReference_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1394:6: (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1394:6: (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1394:8: otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXAnnotationElementValue3004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXAnnotationElementValueAccess().getLeftParenthesisKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXAnnotationElementValueStringConcatenationParserRuleCall_7_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValueStringConcatenation_in_ruleXAnnotationElementValue3026);
                    this_XAnnotationElementValueStringConcatenation_8=ruleXAnnotationElementValueStringConcatenation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAnnotationElementValueStringConcatenation_8; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXAnnotationElementValue3037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXAnnotationElementValueAccess().getRightParenthesisKeyword_7_2());
                          
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
    // $ANTLR end "ruleXAnnotationElementValue"


    // $ANTLR start "entryRuleXAnnotationValueFieldReference"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1419:1: entryRuleXAnnotationValueFieldReference returns [EObject current=null] : iv_ruleXAnnotationValueFieldReference= ruleXAnnotationValueFieldReference EOF ;
    public final EObject entryRuleXAnnotationValueFieldReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationValueFieldReference = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1420:2: (iv_ruleXAnnotationValueFieldReference= ruleXAnnotationValueFieldReference EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1421:2: iv_ruleXAnnotationValueFieldReference= ruleXAnnotationValueFieldReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationValueFieldReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAnnotationValueFieldReference_in_entryRuleXAnnotationValueFieldReference3074);
            iv_ruleXAnnotationValueFieldReference=ruleXAnnotationValueFieldReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationValueFieldReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXAnnotationValueFieldReference3084); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotationValueFieldReference"


    // $ANTLR start "ruleXAnnotationValueFieldReference"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1428:1: ruleXAnnotationValueFieldReference returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? ( ( ruleIdOrSuper ) ) ) ;
    public final EObject ruleXAnnotationValueFieldReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1431:28: ( ( () ( ( ruleStaticQualifier ) )? ( ( ruleIdOrSuper ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1432:1: ( () ( ( ruleStaticQualifier ) )? ( ( ruleIdOrSuper ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1432:1: ( () ( ( ruleStaticQualifier ) )? ( ( ruleIdOrSuper ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1432:2: () ( ( ruleStaticQualifier ) )? ( ( ruleIdOrSuper ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1432:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1433:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXAnnotationValueFieldReferenceAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1438:2: ( ( ruleStaticQualifier ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==76) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1439:1: ( ruleStaticQualifier )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1439:1: ( ruleStaticQualifier )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1440:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAnnotationValueFieldReferenceRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAnnotationValueFieldReferenceAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStaticQualifier_in_ruleXAnnotationValueFieldReference3141);
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

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1453:3: ( ( ruleIdOrSuper ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1454:1: ( ruleIdOrSuper )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1454:1: ( ruleIdOrSuper )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1455:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXAnnotationValueFieldReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationValueFieldReferenceAccess().getFeatureJvmIdentifiableElementCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdOrSuper_in_ruleXAnnotationValueFieldReference3165);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleXAnnotationValueFieldReference"


    // $ANTLR start "entryRuleXAnnotationValueArray"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1476:1: entryRuleXAnnotationValueArray returns [EObject current=null] : iv_ruleXAnnotationValueArray= ruleXAnnotationValueArray EOF ;
    public final EObject entryRuleXAnnotationValueArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationValueArray = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1477:2: (iv_ruleXAnnotationValueArray= ruleXAnnotationValueArray EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1478:2: iv_ruleXAnnotationValueArray= ruleXAnnotationValueArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationValueArrayRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAnnotationValueArray_in_entryRuleXAnnotationValueArray3201);
            iv_ruleXAnnotationValueArray=ruleXAnnotationValueArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationValueArray; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXAnnotationValueArray3211); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotationValueArray"


    // $ANTLR start "ruleXAnnotationValueArray"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1485:1: ruleXAnnotationValueArray returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_values_2_0= ruleXAnnotationElementValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleXAnnotationValueArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1488:28: ( ( () otherlv_1= '{' ( (lv_values_2_0= ruleXAnnotationElementValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )* otherlv_5= '}' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1489:1: ( () otherlv_1= '{' ( (lv_values_2_0= ruleXAnnotationElementValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )* otherlv_5= '}' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1489:1: ( () otherlv_1= '{' ( (lv_values_2_0= ruleXAnnotationElementValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )* otherlv_5= '}' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1489:2: () otherlv_1= '{' ( (lv_values_2_0= ruleXAnnotationElementValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )* otherlv_5= '}'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1489:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1490:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXAnnotationValueArrayAccess().getXAnnotationValueArrayAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleXAnnotationValueArray3257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAnnotationValueArrayAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1499:1: ( (lv_values_2_0= ruleXAnnotationElementValue ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1500:1: (lv_values_2_0= ruleXAnnotationElementValue )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1500:1: (lv_values_2_0= ruleXAnnotationElementValue )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1501:3: lv_values_2_0= ruleXAnnotationElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationValueArrayAccess().getValuesXAnnotationElementValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationValueArray3278);
            lv_values_2_0=ruleXAnnotationElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXAnnotationValueArrayRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"XAnnotationElementValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1517:2: (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1517:4: otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXAnnotationValueArray3291); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getXAnnotationValueArrayAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1521:1: ( (lv_values_4_0= ruleXAnnotationElementValue ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1522:1: (lv_values_4_0= ruleXAnnotationElementValue )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1522:1: (lv_values_4_0= ruleXAnnotationElementValue )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1523:3: lv_values_4_0= ruleXAnnotationElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAnnotationValueArrayAccess().getValuesXAnnotationElementValueParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationValueArray3312);
            	    lv_values_4_0=ruleXAnnotationElementValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAnnotationValueArrayRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"XAnnotationElementValue");
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

            otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleXAnnotationValueArray3326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXAnnotationValueArrayAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleXAnnotationValueArray"


    // $ANTLR start "entryRuleXExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1551:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1552:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1553:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_entryRuleXExpression3362);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXExpression3372); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1560:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1563:28: (this_XAssignment_0= ruleXAssignment )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1565:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAssignment_in_ruleXExpression3418);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1581:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1582:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1583:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAssignment_in_entryRuleXAssignment3452);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXAssignment3462); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1590:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1593:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1594:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1594:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==EOF||(LA26_1>=RULE_SCENARIO_TEXT && LA26_1<=RULE_ID)||(LA26_1>=30 && LA26_1<=32)||(LA26_1>=34 && LA26_1<=36)||(LA26_1>=38 && LA26_1<=87)) ) {
                    alt26=2;
                }
                else if ( (LA26_1==37) ) {
                    alt26=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_STRING)||LA26_0==34||(LA26_0>=38 && LA26_0<=39)||LA26_0==50||LA26_0==53||LA26_0==57||LA26_0==61||LA26_0==63||LA26_0==65||(LA26_0>=69 && LA26_0<=71)||LA26_0==75||(LA26_0>=77 && LA26_0<=84)) ) {
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1594:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1594:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1594:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1594:3: ()
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1595:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1600:2: ( ( ruleValidID ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1601:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1601:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1602:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleXAssignment3520);
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
                    pushFollow(FollowSets000.FOLLOW_ruleOpSingleAssign_in_ruleXAssignment3536);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1623:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1624:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1624:1: (lv_value_3_0= ruleXAssignment )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1625:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXAssignment_in_ruleXAssignment3556);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1642:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1642:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1643:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXOrExpression_in_ruleXAssignment3586);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1651:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==41) ) {
                        int LA25_1 = input.LA(2);

                        if ( (synpred2_InternalJnario()) ) {
                            alt25=1;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1651:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1651:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1651:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1656:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1656:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1656:7: ()
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1657:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1662:2: ( ( ruleOpMultiAssign ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1663:1: ( ruleOpMultiAssign )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1663:1: ( ruleOpMultiAssign )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1664:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3639);
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

                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1677:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1678:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1678:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1679:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleXAssignment_in_ruleXAssignment3662);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1703:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1704:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1705:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3702);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpSingleAssign3713); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1712:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1715:28: (kw= '=' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1717:2: kw= '='
            {
            kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOpSingleAssign3750); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1730:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1731:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1732:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3790);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpMultiAssign3801); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1739:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1742:28: (kw= '+=' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1744:2: kw= '+='
            {
            kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOpMultiAssign3838); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1757:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1758:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1759:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3877);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXOrExpression3887); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1766:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1769:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1770:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1770:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1771:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAndExpression_in_ruleXOrExpression3934);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1779:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==42) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred3_InternalJnario()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1779:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1779:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1779:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1784:6: ( () ( ( ruleOpOr ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1784:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1784:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1785:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1790:2: ( ( ruleOpOr ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1791:1: ( ruleOpOr )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1791:1: ( ruleOpOr )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOpOr_in_ruleXOrExpression3987);
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

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1805:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1806:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1806:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1807:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXAndExpression_in_ruleXOrExpression4010);
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
            	    break loop27;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1831:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1832:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1833:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOpOr_in_entryRuleOpOr4049);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpOr4060); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1840:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1843:28: (kw= '||' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1845:2: kw= '||'
            {
            kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOpOr4097); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1858:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1859:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1860:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression4136);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXAndExpression4146); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1867:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1870:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1871:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1871:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1872:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4193);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1880:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred4_InternalJnario()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1880:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1880:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1880:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1885:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1885:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1885:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1886:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1891:2: ( ( ruleOpAnd ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1892:1: ( ruleOpAnd )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1892:1: ( ruleOpAnd )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1893:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOpAnd_in_ruleXAndExpression4246);
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

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1906:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1907:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1907:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1908:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4269);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1932:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1933:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1934:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOpAnd_in_entryRuleOpAnd4308);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpAnd4319); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1941:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1944:28: (kw= '&&' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1946:2: kw= '&&'
            {
            kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOpAnd4356); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1959:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1960:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1961:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression4395);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXEqualityExpression4405); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1968:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1971:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1972:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1972:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1973:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4452);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1981:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==44) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred5_InternalJnario()) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==45) ) {
                    int LA29_3 = input.LA(2);

                    if ( (synpred5_InternalJnario()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1981:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1981:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1981:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1986:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1986:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1986:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1987:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1992:2: ( ( ruleOpEquality ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1993:1: ( ruleOpEquality )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1993:1: ( ruleOpEquality )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1994:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOpEquality_in_ruleXEqualityExpression4505);
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

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2007:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2008:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2008:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2009:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4528);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2033:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2034:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2035:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOpEquality_in_entryRuleOpEquality4567);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpEquality4578); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2042:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2045:28: ( (kw= '==' | kw= '!=' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2046:1: (kw= '==' | kw= '!=' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2046:1: (kw= '==' | kw= '!=' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            else if ( (LA30_0==45) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2047:2: kw= '=='
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOpEquality4616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2054:2: kw= '!='
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleOpEquality4635); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2067:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2068:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2069:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4675);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXRelationalExpression4685); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2076:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2079:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2080:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2080:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2081:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4732);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop31:
            do {
                int alt31=3;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred6_InternalJnario()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred7_InternalJnario()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred7_InternalJnario()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred7_InternalJnario()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA31_6 = input.LA(2);

                    if ( (synpred7_InternalJnario()) ) {
                        alt31=2;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2091:5: ( () otherlv_2= 'instanceof' )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2091:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2091:6: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2092:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleXRelationalExpression4768); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2101:3: ( ( ruleQualifiedName ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2102:1: ( ruleQualifiedName )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2102:1: ( ruleQualifiedName )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2103:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression4793);
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
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2117:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2117:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2117:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2117:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2117:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2122:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2122:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2122:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2123:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2128:2: ( ( ruleOpCompare ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2129:1: ( ruleOpCompare )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2129:1: ( ruleOpCompare )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2130:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4854);
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

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2143:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2144:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2144:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2145:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4877);
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
            	    break loop31;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2169:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2170:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2171:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOpCompare_in_entryRuleOpCompare4917);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpCompare4928); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2178:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2181:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2182:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2182:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt32=1;
                }
                break;
            case 48:
                {
                alt32=2;
                }
                break;
            case 49:
                {
                alt32=3;
                }
                break;
            case 50:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2183:2: kw= '>='
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleOpCompare4966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2190:2: kw= '<='
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleOpCompare4985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2197:2: kw= '>'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleOpCompare5004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2204:2: kw= '<'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleOpCompare5023); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2217:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2218:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2219:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression5063);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXOtherOperatorExpression5073); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2226:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2229:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2230:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2230:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2231:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5120);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2239:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==51) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred8_InternalJnario()) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==52) ) {
                    int LA33_3 = input.LA(2);

                    if ( (synpred8_InternalJnario()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2239:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2239:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2239:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2244:6: ( () ( ( ruleOpOther ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2244:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2244:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2245:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2250:2: ( ( ruleOpOther ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2251:1: ( ruleOpOther )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2251:1: ( ruleOpOther )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2252:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression5173);
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

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2265:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2266:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2266:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2267:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5196);
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
            	    break loop33;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2291:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2292:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2293:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOpOther_in_entryRuleOpOther5235);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpOther5246); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2300:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2303:28: ( (kw= '->' | kw= '..' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2304:1: (kw= '->' | kw= '..' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2304:1: (kw= '->' | kw= '..' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            else if ( (LA34_0==52) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2305:2: kw= '->'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleOpOther5284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2312:2: kw= '..'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleOpOther5303); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2325:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2326:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2327:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression5343);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXAdditiveExpression5353); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2334:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2337:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2338:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2338:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2339:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5400);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2347:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==38) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred9_InternalJnario()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==53) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred9_InternalJnario()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2347:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2347:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2347:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2352:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2352:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2352:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2353:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2358:2: ( ( ruleOpAdd ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2359:1: ( ruleOpAdd )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2359:1: ( ruleOpAdd )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2360:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5453);
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

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2373:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2374:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2374:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2375:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5476);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2399:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2400:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2401:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOpAdd_in_entryRuleOpAdd5515);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpAdd5526); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2408:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2411:28: ( (kw= '+' | kw= '-' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2412:1: (kw= '+' | kw= '-' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2412:1: (kw= '+' | kw= '-' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            else if ( (LA36_0==53) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2413:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOpAdd5564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2420:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleOpAdd5583); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2433:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2434:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2435:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5623);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5633); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2442:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2445:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2446:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2446:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2447:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5680);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2455:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred10_InternalJnario()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred10_InternalJnario()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred10_InternalJnario()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 56:
                    {
                    int LA37_5 = input.LA(2);

                    if ( (synpred10_InternalJnario()) ) {
                        alt37=1;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2455:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2455:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2455:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2460:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2460:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2460:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2461:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2466:2: ( ( ruleOpMulti ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2467:1: ( ruleOpMulti )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2467:1: ( ruleOpMulti )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2468:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5733);
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

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2481:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2482:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2482:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2483:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5756);
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
            	    break loop37;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2507:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2508:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2509:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOpMulti_in_entryRuleOpMulti5795);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpMulti5806); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2516:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2519:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2520:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2520:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt38=1;
                }
                break;
            case 54:
                {
                alt38=2;
                }
                break;
            case 55:
                {
                alt38=3;
                }
                break;
            case 56:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2521:2: kw= '*'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOpMulti5844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2528:2: kw= '**'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleOpMulti5863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2535:2: kw= '/'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleOpMulti5882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2542:2: kw= '%'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleOpMulti5901); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2555:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2556:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2557:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5941);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXUnaryOperation5951); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2564:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2567:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2568:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2568:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38||LA39_0==53||LA39_0==57) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_ID)||LA39_0==34||LA39_0==39||LA39_0==50||LA39_0==61||LA39_0==63||LA39_0==65||(LA39_0>=69 && LA39_0<=71)||LA39_0==75||(LA39_0>=77 && LA39_0<=84)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2568:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2568:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2568:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2568:3: ()
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2569:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2574:2: ( ( ruleOpUnary ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2575:1: ( ruleOpUnary )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2575:1: ( ruleOpUnary )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2576:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOpUnary_in_ruleXUnaryOperation6009);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2589:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2590:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2590:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2591:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation6030);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2609:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation6059);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2625:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2626:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2627:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOpUnary_in_entryRuleOpUnary6095);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpUnary6106); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2634:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2637:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2638:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2638:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt40=1;
                }
                break;
            case 53:
                {
                alt40=2;
                }
                break;
            case 38:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2639:2: kw= '!'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleOpUnary6144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2646:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleOpUnary6163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2653:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOpUnary6182); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2666:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2667:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2668:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression6222);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXCastedExpression6232); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2675:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2678:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2679:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2679:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2680:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression6279);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2688:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==58) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred11_InternalJnario()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2688:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2688:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2688:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2690:5: ( () otherlv_2= 'as' )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2690:6: () otherlv_2= 'as'
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2690:6: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2691:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleXCastedExpression6314); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2700:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2701:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2701:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2702:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression6337);
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
            	    break loop41;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2726:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2727:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2728:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall6375);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXMemberFeatureCall6385); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2735:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2738:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2739:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2739:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2740:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall6432);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop48:
            do {
                int alt48=3;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    int LA48_2 = input.LA(2);

                    if ( (synpred12_InternalJnario()) ) {
                        alt48=1;
                    }
                    else if ( (synpred13_InternalJnario()) ) {
                        alt48=2;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA48_3 = input.LA(2);

                    if ( (synpred13_InternalJnario()) ) {
                        alt48=2;
                    }


                    }
                    break;
                case 60:
                    {
                    int LA48_4 = input.LA(2);

                    if ( (synpred13_InternalJnario()) ) {
                        alt48=2;
                    }


                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2754:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2754:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2754:26: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2755:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleXMemberFeatureCall6481); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2764:1: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2765:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2765:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2766:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleXMemberFeatureCall6504);
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
            	    pushFollow(FollowSets000.FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall6520);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2787:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2788:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2788:1: (lv_value_5_0= ruleXAssignment )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2789:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall6542);
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
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2806:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2806:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2806:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2806:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2806:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2822:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2822:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2822:8: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2823:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2828:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt42=3;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt42=1;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt42=2;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt42=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt42) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2828:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleXMemberFeatureCall6628); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2833:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2833:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2834:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2834:1: (lv_nullSafe_8_0= '?.' )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2835:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleXMemberFeatureCall6652); if (state.failed) return current;
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
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2849:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2849:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2850:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2850:1: (lv_spreading_9_0= '*.' )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2851:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleXMemberFeatureCall6689); if (state.failed) return current;
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

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2864:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==50) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2864:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleXMemberFeatureCall6718); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2868:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2869:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2869:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2870:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FollowSets000.FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6739);
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

            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2886:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop43:
            	            do {
            	                int alt43=2;
            	                int LA43_0 = input.LA(1);

            	                if ( (LA43_0==35) ) {
            	                    alt43=1;
            	                }


            	                switch (alt43) {
            	            	case 1 :
            	            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2886:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXMemberFeatureCall6752); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2890:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2891:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2891:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2892:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FollowSets000.FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6773);
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
            	            	    break loop43;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleXMemberFeatureCall6787); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2912:3: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2913:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2913:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2914:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleXMemberFeatureCall6812);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2927:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt47=2;
            	    alt47 = dfa47.predict(input);
            	    switch (alt47) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2927:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2927:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2927:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2934:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2935:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXMemberFeatureCall6846); if (state.failed) return current;
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

            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2948:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt46=3;
            	            alt46 = dfa46.predict(input);
            	            switch (alt46) {
            	                case 1 :
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2948:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2948:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2948:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2960:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2961:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FollowSets000.FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6921);
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
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2978:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2978:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2978:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2978:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2979:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2979:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2980:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6949);
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

            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2996:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop45:
            	                    do {
            	                        int alt45=2;
            	                        int LA45_0 = input.LA(1);

            	                        if ( (LA45_0==35) ) {
            	                            alt45=1;
            	                        }


            	                        switch (alt45) {
            	                    	case 1 :
            	                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2996:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXMemberFeatureCall6962); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3000:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3001:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3001:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3002:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6983);
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
            	                    	    break loop45;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXMemberFeatureCall7000); if (state.failed) return current;
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
            	    break loop48;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3030:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3031:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3032:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression7041);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXPrimaryExpression7051); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3039:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3042:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3043:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3043:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt49=13;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt49=1;
                }
                break;
            case 39:
                {
                alt49=2;
                }
                break;
            case 65:
                {
                alt49=3;
                }
                break;
            case RULE_ID:
            case 50:
            case 75:
                {
                alt49=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 61:
            case 78:
            case 79:
            case 80:
            case 81:
                {
                alt49=5;
                }
                break;
            case 63:
                {
                alt49=6;
                }
                break;
            case 69:
                {
                alt49=7;
                }
                break;
            case 70:
                {
                alt49=8;
                }
                break;
            case 71:
                {
                alt49=9;
                }
                break;
            case 82:
                {
                alt49=10;
                }
                break;
            case 83:
                {
                alt49=11;
                }
                break;
            case 84:
                {
                alt49=12;
                }
                break;
            case 34:
                {
                alt49=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3044:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression7098);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3054:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression7125);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3064:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression7152);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3074:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression7179);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3084:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression7206);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3094:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression7233);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3104:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression7260);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3114:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression7287);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3124:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression7314);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3134:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression7341);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3144:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression7368);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3154:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression7395);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3164:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7422);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3180:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3181:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3182:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXLiteral_in_entryRuleXLiteral7457);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXLiteral7467); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3189:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3192:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3193:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3193:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt50=1;
                }
                break;
            case 78:
            case 79:
                {
                alt50=2;
                }
                break;
            case RULE_INT:
                {
                alt50=3;
                }
                break;
            case 80:
                {
                alt50=4;
                }
                break;
            case RULE_STRING:
                {
                alt50=5;
                }
                break;
            case 81:
                {
                alt50=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3194:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXClosure_in_ruleXLiteral7514);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3204:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral7541);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3214:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXIntLiteral_in_ruleXLiteral7568);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3224:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXNullLiteral_in_ruleXLiteral7595);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3234:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXStringLiteral_in_ruleXLiteral7622);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3244:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7649);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3260:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3261:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3262:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXClosure_in_entryRuleXClosure7684);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXClosure7694); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3269:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3272:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3273:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3273:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3273:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3273:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3274:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleXClosure7740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3283:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==34||LA52_0==87) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3283:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3283:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3284:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3284:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3285:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7762);
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

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3301:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==35) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3301:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXClosure7775); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3305:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3306:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3306:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3307:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7796);
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
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleXClosure7812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3327:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3328:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3328:1: (lv_expression_6_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3329:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXClosure7833);
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

            otherlv_7=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleXClosure7845); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3357:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3358:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3359:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7881);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXShortClosure7891); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3366:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3369:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3370:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3370:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3370:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3370:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3370:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3381:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3381:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3381:6: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3382:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3387:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||LA54_0==34||LA54_0==87) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3387:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3387:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3388:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3388:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3389:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7989);
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

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3405:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==35) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3405:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXShortClosure8002); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3409:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3410:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3410:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3411:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure8023);
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleXShortClosure8039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3431:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3432:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3432:1: (lv_expression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3433:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXShortClosure8062);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3457:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3458:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3459:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression8098);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXParenthesizedExpression8108); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3466:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3469:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3470:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3470:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3470:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXParenthesizedExpression8145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression8167);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXParenthesizedExpression8178); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3495:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3496:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3497:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression8214);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXIfExpression8224); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3504:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3507:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3508:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3508:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3508:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3508:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3509:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleXIfExpression8270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXIfExpression8282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3522:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3523:1: (lv_if_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3523:1: (lv_if_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3524:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXIfExpression8303);
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

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXIfExpression8315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3544:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3545:1: (lv_then_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3545:1: (lv_then_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3546:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXIfExpression8336);
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

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3562:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==64) ) {
                int LA55_1 = input.LA(2);

                if ( (synpred17_InternalJnario()) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3562:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3562:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3562:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleXIfExpression8357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3567:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3568:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3568:1: (lv_else_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3569:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXIfExpression8379);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3593:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3594:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3595:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression8417);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXSwitchExpression8427); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3602:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3605:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3606:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3606:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3606:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3606:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3607:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleXSwitchExpression8473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3616:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==66) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3616:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3616:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3617:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3617:1: (lv_localVarName_2_0= ruleValidID )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3618:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleXSwitchExpression8495);
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

                    otherlv_3=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleXSwitchExpression8507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3638:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3639:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3639:1: (lv_switch_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3640:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXSwitchExpression8530);
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

            otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleXSwitchExpression8542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3660:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID||LA57_0==34||LA57_0==66||LA57_0==68||LA57_0==87) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3661:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3661:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3662:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXCasePart_in_ruleXSwitchExpression8563);
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
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3678:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==67) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3678:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleXSwitchExpression8577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleXSwitchExpression8589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3686:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3687:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3687:1: (lv_default_9_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3688:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXSwitchExpression8610);
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

            otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleXSwitchExpression8624); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3716:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3717:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3718:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXCasePart_in_entryRuleXCasePart8660);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXCasePart8670); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3725:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3728:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3729:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3729:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3729:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3729:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||LA59_0==34||LA59_0==87) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3730:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3730:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3731:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8716);
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

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3747:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==68) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3747:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleXCasePart8730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3751:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3752:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3752:1: (lv_case_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3753:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXCasePart8751);
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

            otherlv_3=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleXCasePart8765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3773:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3774:1: (lv_then_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3774:1: (lv_then_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3775:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXCasePart8786);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3799:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3800:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3801:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8822);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXForLoopExpression8832); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3808:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3811:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3812:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3812:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3812:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3812:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3813:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleXForLoopExpression8878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXForLoopExpression8890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3826:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3827:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3827:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3828:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8911);
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

            otherlv_4=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleXForLoopExpression8923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3848:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3849:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3849:1: (lv_forExpression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3850:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXForLoopExpression8944);
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

            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXForLoopExpression8956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3870:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3871:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3871:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3872:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXForLoopExpression8977);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3896:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3897:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3898:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression9013);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXWhileExpression9023); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3905:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3908:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3909:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3909:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3909:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3909:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3910:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleXWhileExpression9069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXWhileExpression9081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3923:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3924:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3924:1: (lv_predicate_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3925:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXWhileExpression9102);
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

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXWhileExpression9114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3945:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3946:1: (lv_body_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3946:1: (lv_body_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3947:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXWhileExpression9135);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3971:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3972:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3973:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression9171);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXDoWhileExpression9181); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3980:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3983:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3984:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3984:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3984:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3984:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3985:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleXDoWhileExpression9227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3994:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3995:1: (lv_body_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3995:1: (lv_body_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3996:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9248);
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

            otherlv_3=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleXDoWhileExpression9260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXDoWhileExpression9272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4020:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4021:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4021:1: (lv_predicate_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4022:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9293);
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

            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXDoWhileExpression9305); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4050:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4051:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4052:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression9341);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXBlockExpression9351); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4059:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4062:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4063:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4063:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4063:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4063:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4064:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleXBlockExpression9397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4073:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=RULE_INT && LA62_0<=RULE_ID)||LA62_0==34||(LA62_0>=38 && LA62_0<=39)||LA62_0==50||LA62_0==53||LA62_0==57||LA62_0==61||LA62_0==63||LA62_0==65||(LA62_0>=69 && LA62_0<=71)||(LA62_0>=73 && LA62_0<=75)||(LA62_0>=77 && LA62_0<=84)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4073:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4073:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4074:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4074:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4075:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression9419);
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

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4091:2: (otherlv_3= ';' )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==72) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4091:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleXBlockExpression9432); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleXBlockExpression9448); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4107:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4108:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4109:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock9484);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXExpressionInsideBlock9494); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4116:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4119:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4120:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4120:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=73 && LA63_0<=74)) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=RULE_INT && LA63_0<=RULE_ID)||LA63_0==34||(LA63_0>=38 && LA63_0<=39)||LA63_0==50||LA63_0==53||LA63_0==57||LA63_0==61||LA63_0==63||LA63_0==65||(LA63_0>=69 && LA63_0<=71)||LA63_0==75||(LA63_0>=77 && LA63_0<=84)) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4121:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock9541);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4131:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock9568);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4147:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4148:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4149:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration9603);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXVariableDeclaration9613); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4156:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4159:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4160:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4160:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4160:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4160:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4161:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4166:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==73) ) {
                alt64=1;
            }
            else if ( (LA64_0==74) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4166:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4166:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4167:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4167:1: (lv_writeable_1_0= 'var' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4168:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleXVariableDeclaration9666); if (state.failed) return current;
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4182:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleXVariableDeclaration9697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4186:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                int LA65_1 = input.LA(2);

                if ( (synpred18_InternalJnario()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA65_0==34) && (synpred18_InternalJnario())) {
                alt65=1;
            }
            else if ( (LA65_0==87) && (synpred18_InternalJnario())) {
                alt65=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4186:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4186:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4186:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4194:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4194:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4194:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4195:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4195:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4196:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9745);
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

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4212:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4213:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4213:1: (lv_name_4_0= ruleValidID )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4214:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleXVariableDeclaration9766);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4231:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4231:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4232:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4232:1: (lv_name_5_0= ruleValidID )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4233:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleXVariableDeclaration9795);
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

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4249:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==37) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4249:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleXVariableDeclaration9809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4253:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4254:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4254:1: (lv_right_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4255:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9830);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4279:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4280:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4281:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9868);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJvmFormalParameter9878); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4288:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4291:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4292:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4292:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4292:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4292:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==RULE_ID||LA67_1==30||LA67_1==50) ) {
                    alt67=1;
                }
            }
            else if ( (LA67_0==34||LA67_0==87) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4293:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4293:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4294:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9924);
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

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4310:3: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4311:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4311:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4312:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleJvmFormalParameter9946);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4336:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4337:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4338:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9982);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXFeatureCall9992); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4345:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4348:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4349:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4349:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4349:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4349:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4350:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4355:2: ( ( ruleStaticQualifier ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==76) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4356:1: ( ruleStaticQualifier )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4356:1: ( ruleStaticQualifier )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4357:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall10049);
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

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4370:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==50) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4370:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleXFeatureCall10063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4374:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4375:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4375:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4376:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10084);
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

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4392:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==35) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4392:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXFeatureCall10097); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4396:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4397:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4397:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4398:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10118);
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
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleXFeatureCall10132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4418:3: ( ( ruleIdOrSuper ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4419:1: ( ruleIdOrSuper )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4419:1: ( ruleIdOrSuper )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4420:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall10157);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4433:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4433:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4433:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4433:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4440:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4441:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXFeatureCall10191); if (state.failed) return current;
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

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4454:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt72=3;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4454:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4454:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4454:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4466:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4467:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleXShortClosure_in_ruleXFeatureCall10266);
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
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4484:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4484:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4484:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4484:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4485:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4485:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4486:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXFeatureCall10294);
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

                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4502:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==35) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4502:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXFeatureCall10307); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4506:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4507:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4507:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4508:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXFeatureCall10328);
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
                            	    break loop71;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXFeatureCall10345); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4536:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4537:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4538:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper10384);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdOrSuper10395); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4545:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4548:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4549:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4549:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID) ) {
                alt74=1;
            }
            else if ( (LA74_0==75) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4550:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleIdOrSuper10442);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4562:2: kw= 'super'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleIdOrSuper10466); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4575:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4576:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4577:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10507);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStaticQualifier10518); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4584:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4587:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4588:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4588:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_ID) ) {
                    int LA75_1 = input.LA(2);

                    if ( (LA75_1==76) ) {
                        alt75=1;
                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4589:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleStaticQualifier10565);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleStaticQualifier10583); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4613:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4614:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4615:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10624);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXConstructorCall10634); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4622:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4625:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4626:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4626:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4626:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4626:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4627:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleXConstructorCall10680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4636:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4637:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4637:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4638:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10703);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4651:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==50) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4651:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleXConstructorCall10716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4655:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4656:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4656:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4657:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10737);
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

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4673:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==35) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4673:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXConstructorCall10750); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4677:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4678:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4678:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4679:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10771);
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
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleXConstructorCall10785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXConstructorCall10799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4703:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt79=3;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4703:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4703:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4703:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4715:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4716:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10861);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4733:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4733:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4733:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4733:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4734:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4734:1: (lv_arguments_10_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4735:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXConstructorCall10889);
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

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4751:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==35) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4751:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXConstructorCall10902); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4755:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4756:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4756:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4757:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXConstructorCall10923);
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
                    	    break loop78;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXConstructorCall10940); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4785:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4786:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4787:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10976);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXBooleanLiteral10986); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4794:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4797:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4798:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4798:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4798:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4798:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4799:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4804:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==78) ) {
                alt80=1;
            }
            else if ( (LA80_0==79) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4804:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleXBooleanLiteral11033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4809:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4809:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4810:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4810:1: (lv_isTrue_2_0= 'true' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4811:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleXBooleanLiteral11057); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4832:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4833:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4834:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral11107);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXNullLiteral11117); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4841:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4844:28: ( ( () otherlv_1= 'null' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4845:1: ( () otherlv_1= 'null' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4845:1: ( () otherlv_1= 'null' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4845:2: () otherlv_1= 'null'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4845:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4846:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleXNullLiteral11163); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4863:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4864:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4865:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral11199);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXIntLiteral11209); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4872:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4875:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4876:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4876:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4876:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4876:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4877:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4882:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4883:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4883:1: (lv_value_1_0= RULE_INT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4884:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleXIntLiteral11260); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4908:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4909:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4910:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral11301);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXStringLiteral11311); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4917:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4920:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4921:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4921:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4921:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4921:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4922:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4927:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4928:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4928:1: (lv_value_1_0= RULE_STRING )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4929:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleXStringLiteral11362); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4953:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4954:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4955:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral11403);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXTypeLiteral11413); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4962:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4965:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4966:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4966:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4966:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4966:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4967:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleXTypeLiteral11459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXTypeLiteral11471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4980:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4981:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4981:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4982:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11494);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXTypeLiteral11506); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5007:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5008:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5009:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11542);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXThrowExpression11552); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5016:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5019:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5020:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5020:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5020:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5020:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5021:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleXThrowExpression11598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5030:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5031:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5031:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5032:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXThrowExpression11619);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5056:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5057:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5058:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11655);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXReturnExpression11665); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5065:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5068:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5069:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5069:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5069:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5069:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5070:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleXReturnExpression11711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5079:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5079:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5084:1: (lv_expression_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5085:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXReturnExpression11742);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5109:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5110:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5111:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11779);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11789); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5118:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5121:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5122:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5122:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5122:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5122:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5123:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleXTryCatchFinallyExpression11835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5132:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5133:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5133:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5134:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11856);
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

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5150:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==86) ) {
                alt84=1;
            }
            else if ( (LA84_0==85) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5150:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5150:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5150:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5150:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt82=0;
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==86) ) {
                            int LA82_2 = input.LA(2);

                            if ( (synpred23_InternalJnario()) ) {
                                alt82=1;
                            }


                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5150:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5152:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5153:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11886);
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
                    	    if ( cnt82 >= 1 ) break loop82;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(82, input);
                                throw eee;
                        }
                        cnt82++;
                    } while (true);

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5169:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==85) ) {
                        int LA83_1 = input.LA(2);

                        if ( (synpred24_InternalJnario()) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5169:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5169:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5169:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleXTryCatchFinallyExpression11908); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5174:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5175:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5175:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5176:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11930);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5193:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5193:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5193:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleXTryCatchFinallyExpression11952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5197:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5198:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5198:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5199:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11973);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5223:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5224:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5225:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause12011);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXCatchClause12021); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5232:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5235:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5236:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5236:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5236:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5236:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5236:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleXCatchClause12066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXCatchClause12079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5245:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5246:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5246:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5247:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause12100);
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

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXCatchClause12112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5267:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5268:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5268:1: (lv_expression_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5269:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_ruleXCatchClause12133);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5293:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5294:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5295:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12170);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName12181); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5302:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5305:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5306:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5306:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5307:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleQualifiedName12228);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5317:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==30) ) {
                    int LA85_2 = input.LA(2);

                    if ( (LA85_2==RULE_ID) ) {
                        int LA85_3 = input.LA(3);

                        if ( (synpred26_InternalJnario()) ) {
                            alt85=1;
                        }


                    }


                }


                switch (alt85) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5317:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5317:2: ( ( '.' )=>kw= '.' )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5317:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleQualifiedName12256); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleValidID_in_ruleQualifiedName12279);
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
            	    break loop85;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5344:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5345:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5346:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12326);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJvmTypeReference12336); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5353:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5356:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5357:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5357:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            else if ( (LA86_0==34||LA86_0==87) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5358:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12383);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5368:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12410);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5384:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5385:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5386:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12445);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXFunctionTypeRef12455); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5393:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5396:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5397:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5397:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5397:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5397:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==34) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5397:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleXFunctionTypeRef12493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5401:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5402:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5402:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5403:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12514);
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

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5419:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==35) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5419:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleXFunctionTypeRef12527); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5423:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5424:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5424:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5425:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12548);
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
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleXFunctionTypeRef12562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleXFunctionTypeRef12576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5449:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5450:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5450:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5451:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12597);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5475:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5476:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5477:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12633);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12643); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5484:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5487:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5488:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5488:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5488:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5488:2: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5489:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5489:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5490:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12691);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5503:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5503:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5503:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5503:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleJvmParameterizedTypeReference12712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5508:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5509:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5509:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5510:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12734);
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

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5526:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==35) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5526:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleJvmParameterizedTypeReference12747); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5530:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5531:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5531:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5532:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12768);
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
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleJvmParameterizedTypeReference12782); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5560:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5561:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5562:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12820);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12830); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5569:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5572:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5573:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5573:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_ID||LA91_0==34||LA91_0==87) ) {
                alt91=1;
            }
            else if ( (LA91_0==88) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5574:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12877);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5584:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12904);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5600:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5601:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5602:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12939);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12949); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5609:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5612:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5613:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5613:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5613:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5613:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5614:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleJvmWildcardTypeReference12995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5623:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==89) ) {
                alt92=1;
            }
            else if ( (LA92_0==75) ) {
                alt92=2;
            }
            switch (alt92) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5623:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5623:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5624:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5624:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5625:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference13017);
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
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5642:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5642:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5643:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5643:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5644:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference13044);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5668:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5669:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5670:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound13082);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJvmUpperBound13092); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5677:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5680:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5681:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5681:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5681:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleJvmUpperBound13129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5685:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5686:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5686:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5687:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound13150);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5711:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5712:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5713:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded13186);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded13196); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5720:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5723:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5724:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5724:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5724:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleJvmUpperBoundAnded13233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5728:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5729:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5729:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5730:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13254);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5754:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5755:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5756:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13290);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJvmLowerBound13300); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5763:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5766:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5767:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5767:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5767:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleJvmLowerBound13337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5771:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5772:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5772:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5773:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13358);
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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5799:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5800:2: (iv_ruleValidID= ruleValidID EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5801:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValidID_in_entryRuleValidID13397);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValidID13408); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5808:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5811:28: (this_ID_0= RULE_ID )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5812:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValidID13447); if (state.failed) return current;
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
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1108:4: ( '(' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1108:6: '('
        {
        match(input,34,FollowSets000.FOLLOW_34_in_synpred1_InternalJnario2336); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalJnario

    // $ANTLR start synpred2_InternalJnario
    public final void synpred2_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1651:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1651:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1651:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1651:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1651:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1652:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1652:2: ( ( ruleOpMultiAssign ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1653:1: ( ruleOpMultiAssign )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1653:1: ( ruleOpMultiAssign )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1654:3: ruleOpMultiAssign
        {
        pushFollow(FollowSets000.FOLLOW_ruleOpMultiAssign_in_synpred2_InternalJnario3607);
        ruleOpMultiAssign();

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
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1779:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1779:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1779:4: ( () ( ( ruleOpOr ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1779:5: () ( ( ruleOpOr ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1779:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1780:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1780:2: ( ( ruleOpOr ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1781:1: ( ruleOpOr )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1781:1: ( ruleOpOr )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1782:3: ruleOpOr
        {
        pushFollow(FollowSets000.FOLLOW_ruleOpOr_in_synpred3_InternalJnario3955);
        ruleOpOr();

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
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1880:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1880:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1880:4: ( () ( ( ruleOpAnd ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1880:5: () ( ( ruleOpAnd ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1880:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1881:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1881:2: ( ( ruleOpAnd ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1882:1: ( ruleOpAnd )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1882:1: ( ruleOpAnd )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1883:3: ruleOpAnd
        {
        pushFollow(FollowSets000.FOLLOW_ruleOpAnd_in_synpred4_InternalJnario4214);
        ruleOpAnd();

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
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1981:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1981:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1981:4: ( () ( ( ruleOpEquality ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1981:5: () ( ( ruleOpEquality ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1981:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1982:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1982:2: ( ( ruleOpEquality ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1983:1: ( ruleOpEquality )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1983:1: ( ruleOpEquality )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1984:3: ruleOpEquality
        {
        pushFollow(FollowSets000.FOLLOW_ruleOpEquality_in_synpred5_InternalJnario4473);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalJnario

    // $ANTLR start synpred6_InternalJnario
    public final void synpred6_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:4: ( ( () 'instanceof' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:5: ( () 'instanceof' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:5: ( () 'instanceof' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:6: () 'instanceof'
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2089:6: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2090:1: 
        {
        }

        match(input,46,FollowSets000.FOLLOW_46_in_synpred6_InternalJnario4749); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalJnario

    // $ANTLR start synpred7_InternalJnario
    public final void synpred7_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2117:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2117:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2117:9: ( () ( ( ruleOpCompare ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2117:10: () ( ( ruleOpCompare ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2117:10: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2118:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2118:2: ( ( ruleOpCompare ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2119:1: ( ruleOpCompare )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2119:1: ( ruleOpCompare )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2120:3: ruleOpCompare
        {
        pushFollow(FollowSets000.FOLLOW_ruleOpCompare_in_synpred7_InternalJnario4822);
        ruleOpCompare();

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
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2239:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2239:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2239:4: ( () ( ( ruleOpOther ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2239:5: () ( ( ruleOpOther ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2239:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2240:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2240:2: ( ( ruleOpOther ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2241:1: ( ruleOpOther )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2241:1: ( ruleOpOther )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2242:3: ruleOpOther
        {
        pushFollow(FollowSets000.FOLLOW_ruleOpOther_in_synpred8_InternalJnario5141);
        ruleOpOther();

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
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2347:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2347:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2347:4: ( () ( ( ruleOpAdd ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2347:5: () ( ( ruleOpAdd ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2347:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2348:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2348:2: ( ( ruleOpAdd ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2349:1: ( ruleOpAdd )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2349:1: ( ruleOpAdd )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2350:3: ruleOpAdd
        {
        pushFollow(FollowSets000.FOLLOW_ruleOpAdd_in_synpred9_InternalJnario5421);
        ruleOpAdd();

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
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2455:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2455:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2455:4: ( () ( ( ruleOpMulti ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2455:5: () ( ( ruleOpMulti ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2455:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2456:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2456:2: ( ( ruleOpMulti ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2457:1: ( ruleOpMulti )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2457:1: ( ruleOpMulti )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2458:3: ruleOpMulti
        {
        pushFollow(FollowSets000.FOLLOW_ruleOpMulti_in_synpred10_InternalJnario5701);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalJnario

    // $ANTLR start synpred11_InternalJnario
    public final void synpred11_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2688:3: ( ( () 'as' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2688:4: ( () 'as' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2688:4: ( () 'as' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2688:5: () 'as'
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2688:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2689:1: 
        {
        }

        match(input,58,FollowSets000.FOLLOW_58_in_synpred11_InternalJnario6295); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalJnario

    // $ANTLR start synpred12_InternalJnario
    public final void synpred12_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2748:6: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2749:1: 
        {
        }

        match(input,30,FollowSets000.FOLLOW_30_in_synpred12_InternalJnario6449); if (state.failed) return ;
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2750:1: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2751:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2751:1: ( ruleValidID )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2752:3: ruleValidID
        {
        pushFollow(FollowSets000.FOLLOW_ruleValidID_in_synpred12_InternalJnario6458);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FollowSets000.FOLLOW_ruleOpSingleAssign_in_synpred12_InternalJnario6464);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalJnario

    // $ANTLR start synpred13_InternalJnario
    public final void synpred13_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2806:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2806:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2806:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2806:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2806:10: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2807:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2807:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt93=3;
        switch ( input.LA(1) ) {
        case 30:
            {
            alt93=1;
            }
            break;
        case 59:
            {
            alt93=2;
            }
            break;
        case 60:
            {
            alt93=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 93, 0, input);

            throw nvae;
        }

        switch (alt93) {
            case 1 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2807:4: '.'
                {
                match(input,30,FollowSets000.FOLLOW_30_in_synpred13_InternalJnario6567); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2809:6: ( ( '?.' ) )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2809:6: ( ( '?.' ) )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2810:1: ( '?.' )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2810:1: ( '?.' )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2811:2: '?.'
                {
                match(input,59,FollowSets000.FOLLOW_59_in_synpred13_InternalJnario6581); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2816:6: ( ( '*.' ) )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2816:6: ( ( '*.' ) )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2817:1: ( '*.' )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2817:1: ( '*.' )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2818:2: '*.'
                {
                match(input,60,FollowSets000.FOLLOW_60_in_synpred13_InternalJnario6601); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalJnario

    // $ANTLR start synpred14_InternalJnario
    public final void synpred14_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2927:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2928:1: ( '(' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2928:1: ( '(' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2929:2: '('
        {
        match(input,34,FollowSets000.FOLLOW_34_in_synpred14_InternalJnario6828); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalJnario

    // $ANTLR start synpred15_InternalJnario
    public final void synpred15_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2948:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2948:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2948:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2948:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2948:6: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2949:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2949:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==34||LA95_0==87) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2949:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2949:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2950:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2950:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2951:1: ruleJvmFormalParameter
                {
                pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalJnario6880);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2953:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==35) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2953:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,35,FollowSets000.FOLLOW_35_in_synpred15_InternalJnario6887); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2954:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2955:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2955:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2956:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalJnario6894);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);


                }
                break;

        }

        match(input,32,FollowSets000.FOLLOW_32_in_synpred15_InternalJnario6904); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalJnario

    // $ANTLR start synpred17_InternalJnario
    public final void synpred17_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3562:4: ( 'else' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3562:6: 'else'
        {
        match(input,64,FollowSets000.FOLLOW_64_in_synpred17_InternalJnario8349); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalJnario

    // $ANTLR start synpred18_InternalJnario
    public final void synpred18_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4186:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4186:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4186:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4186:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4186:6: ( ( ruleJvmTypeReference ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4187:1: ( ruleJvmTypeReference )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4187:1: ( ruleJvmTypeReference )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4188:1: ruleJvmTypeReference
        {
        pushFollow(FollowSets000.FOLLOW_ruleJvmTypeReference_in_synpred18_InternalJnario9715);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4190:2: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4191:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4191:1: ( ruleValidID )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4192:1: ruleValidID
        {
        pushFollow(FollowSets000.FOLLOW_ruleValidID_in_synpred18_InternalJnario9724);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalJnario

    // $ANTLR start synpred19_InternalJnario
    public final void synpred19_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4433:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4434:1: ( '(' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4434:1: ( '(' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4435:2: '('
        {
        match(input,34,FollowSets000.FOLLOW_34_in_synpred19_InternalJnario10173); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalJnario

    // $ANTLR start synpred20_InternalJnario
    public final void synpred20_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4454:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4454:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4454:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4454:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4454:6: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4455:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4455:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==34||LA99_0==87) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4455:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4455:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4456:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4456:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4457:1: ruleJvmFormalParameter
                {
                pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalJnario10225);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4459:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==35) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4459:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,35,FollowSets000.FOLLOW_35_in_synpred20_InternalJnario10232); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4460:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4461:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4461:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4462:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalJnario10239);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop98;
                    }
                } while (true);


                }
                break;

        }

        match(input,32,FollowSets000.FOLLOW_32_in_synpred20_InternalJnario10249); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalJnario

    // $ANTLR start synpred21_InternalJnario
    public final void synpred21_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4703:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4703:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4703:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4703:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4703:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4704:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4704:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==34||LA101_0==87) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4704:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4704:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4705:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4705:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4706:1: ruleJvmFormalParameter
                {
                pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalJnario10820);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4708:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==35) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4708:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,35,FollowSets000.FOLLOW_35_in_synpred21_InternalJnario10827); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4709:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4710:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4710:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4711:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FollowSets000.FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalJnario10834);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop100;
                    }
                } while (true);


                }
                break;

        }

        match(input,32,FollowSets000.FOLLOW_32_in_synpred21_InternalJnario10844); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalJnario

    // $ANTLR start synpred22_InternalJnario
    public final void synpred22_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5079:2: ( ( ruleXExpression ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5080:1: ( ruleXExpression )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5080:1: ( ruleXExpression )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5081:1: ruleXExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleXExpression_in_synpred22_InternalJnario11725);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalJnario

    // $ANTLR start synpred23_InternalJnario
    public final void synpred23_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5150:5: ( 'catch' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5150:7: 'catch'
        {
        match(input,86,FollowSets000.FOLLOW_86_in_synpred23_InternalJnario11870); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalJnario

    // $ANTLR start synpred24_InternalJnario
    public final void synpred24_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5169:5: ( 'finally' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5169:7: 'finally'
        {
        match(input,85,FollowSets000.FOLLOW_85_in_synpred24_InternalJnario11900); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalJnario

    // $ANTLR start synpred26_InternalJnario
    public final void synpred26_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5317:3: ( '.' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5318:2: '.'
        {
        match(input,30,FollowSets000.FOLLOW_30_in_synpred26_InternalJnario12247); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalJnario

    // $ANTLR start synpred27_InternalJnario
    public final void synpred27_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5503:4: ( '<' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5503:6: '<'
        {
        match(input,50,FollowSets000.FOLLOW_50_in_synpred27_InternalJnario12704); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalJnario

    // Delegated rules

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
    public final boolean synpred27_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalJnario_fragment(); // can never throw exception
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
    public final boolean synpred24_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalJnario_fragment(); // can never throw exception
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
    public final boolean synpred15_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalJnario_fragment(); // can never throw exception
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


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String DFA20_eotS =
        "\47\uffff";
    static final String DFA20_eofS =
        "\1\2\46\uffff";
    static final String DFA20_minS =
        "\1\6\1\0\45\uffff";
    static final String DFA20_maxS =
        "\1\124\1\0\45\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\43\uffff\1\1";
    static final String DFA20_specialS =
        "\1\uffff\1\0\45\uffff}>";
    static final String[] DFA20_transitionS = {
            "\6\2\1\uffff\3\2\21\uffff\1\2\1\1\2\2\1\uffff\3\2\11\uffff"+
            "\1\2\2\uffff\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\2\3\uffff\3\2\1\uffff\3\2\1\uffff\10\2",
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
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1108:2: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJnario()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\104\uffff";
    static final String DFA47_eofS =
        "\1\2\103\uffff";
    static final String DFA47_minS =
        "\1\6\1\0\102\uffff";
    static final String DFA47_maxS =
        "\1\127\1\0\102\uffff";
    static final String DFA47_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA47_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA47_transitionS = {
            "\12\2\16\uffff\3\2\1\uffff\1\1\2\2\1\uffff\46\2\1\uffff\13"+
            "\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "2927:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_1 = input.LA(1);

                         
                        int index47_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index47_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\34\uffff";
    static final String DFA46_eofS =
        "\34\uffff";
    static final String DFA46_minS =
        "\1\15\2\0\31\uffff";
    static final String DFA46_maxS =
        "\1\127\2\0\31\uffff";
    static final String DFA46_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA46_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA46_transitionS = {
            "\2\5\1\1\20\uffff\1\4\1\uffff\1\2\1\uffff\1\33\1\uffff\2\5"+
            "\12\uffff\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\3\5\3\uffff\1\5\1\uffff\10\5\2\uffff"+
            "\1\3",
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

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "2948:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_0 = input.LA(1);

                         
                        int index46_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA46_0==RULE_ID) ) {s = 1;}

                        else if ( (LA46_0==34) ) {s = 2;}

                        else if ( (LA46_0==87) && (synpred15_InternalJnario())) {s = 3;}

                        else if ( (LA46_0==32) && (synpred15_InternalJnario())) {s = 4;}

                        else if ( ((LA46_0>=RULE_INT && LA46_0<=RULE_STRING)||(LA46_0>=38 && LA46_0<=39)||LA46_0==50||LA46_0==53||LA46_0==57||LA46_0==61||LA46_0==63||LA46_0==65||(LA46_0>=69 && LA46_0<=71)||LA46_0==75||(LA46_0>=77 && LA46_0<=84)) ) {s = 5;}

                        else if ( (LA46_0==36) ) {s = 27;}

                         
                        input.seek(index46_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index46_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\104\uffff";
    static final String DFA73_eofS =
        "\1\2\103\uffff";
    static final String DFA73_minS =
        "\1\6\1\0\102\uffff";
    static final String DFA73_maxS =
        "\1\127\1\0\102\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA73_transitionS = {
            "\12\2\16\uffff\3\2\1\uffff\1\1\2\2\1\uffff\46\2\1\uffff\13"+
            "\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "4433:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\34\uffff";
    static final String DFA72_eofS =
        "\34\uffff";
    static final String DFA72_minS =
        "\1\15\2\0\31\uffff";
    static final String DFA72_maxS =
        "\1\127\2\0\31\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA72_transitionS = {
            "\2\5\1\1\20\uffff\1\4\1\uffff\1\2\1\uffff\1\33\1\uffff\2\5"+
            "\12\uffff\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\3\5\3\uffff\1\5\1\uffff\10\5\2\uffff"+
            "\1\3",
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

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4454:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_0 = input.LA(1);

                         
                        int index72_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA72_0==RULE_ID) ) {s = 1;}

                        else if ( (LA72_0==34) ) {s = 2;}

                        else if ( (LA72_0==87) && (synpred20_InternalJnario())) {s = 3;}

                        else if ( (LA72_0==32) && (synpred20_InternalJnario())) {s = 4;}

                        else if ( ((LA72_0>=RULE_INT && LA72_0<=RULE_STRING)||(LA72_0>=38 && LA72_0<=39)||LA72_0==50||LA72_0==53||LA72_0==57||LA72_0==61||LA72_0==63||LA72_0==65||(LA72_0>=69 && LA72_0<=71)||LA72_0==75||(LA72_0>=77 && LA72_0<=84)) ) {s = 5;}

                        else if ( (LA72_0==36) ) {s = 27;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\34\uffff";
    static final String DFA79_eofS =
        "\34\uffff";
    static final String DFA79_minS =
        "\1\15\2\0\31\uffff";
    static final String DFA79_maxS =
        "\1\127\2\0\31\uffff";
    static final String DFA79_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA79_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA79_transitionS = {
            "\2\5\1\1\20\uffff\1\4\1\uffff\1\2\1\uffff\1\33\1\uffff\2\5"+
            "\12\uffff\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\3\5\3\uffff\1\5\1\uffff\10\5\2\uffff"+
            "\1\3",
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

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "4703:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_0 = input.LA(1);

                         
                        int index79_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA79_0==RULE_ID) ) {s = 1;}

                        else if ( (LA79_0==34) ) {s = 2;}

                        else if ( (LA79_0==87) && (synpred21_InternalJnario())) {s = 3;}

                        else if ( (LA79_0==32) && (synpred21_InternalJnario())) {s = 4;}

                        else if ( ((LA79_0>=RULE_INT && LA79_0<=RULE_STRING)||(LA79_0>=38 && LA79_0<=39)||LA79_0==50||LA79_0==53||LA79_0==57||LA79_0==61||LA79_0==63||LA79_0==65||(LA79_0>=69 && LA79_0<=71)||LA79_0==75||(LA79_0>=77 && LA79_0<=84)) ) {s = 5;}

                        else if ( (LA79_0==36) ) {s = 27;}

                         
                        input.seek(index79_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\104\uffff";
    static final String DFA81_eofS =
        "\1\31\103\uffff";
    static final String DFA81_minS =
        "\1\6\30\0\53\uffff";
    static final String DFA81_maxS =
        "\1\127\30\0\53\uffff";
    static final String DFA81_acceptS =
        "\31\uffff\1\2\51\uffff\1\1";
    static final String DFA81_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\53\uffff}>";
    static final String[] DFA81_transitionS = {
            "\7\31\1\15\1\17\1\1\16\uffff\3\31\1\uffff\1\30\2\31\1\uffff"+
            "\1\4\1\6\12\31\1\10\2\31\1\3\3\31\1\2\3\31\1\12\1\31\1\21\1"+
            "\31\1\7\3\31\1\22\1\23\1\24\3\31\1\11\1\uffff\1\5\1\13\1\14"+
            "\1\16\1\20\1\25\1\26\1\27\3\31",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "5079:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_2 = input.LA(1);

                         
                        int index81_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_3 = input.LA(1);

                         
                        int index81_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_4 = input.LA(1);

                         
                        int index81_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_8 = input.LA(1);

                         
                        int index81_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_9 = input.LA(1);

                         
                        int index81_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_10 = input.LA(1);

                         
                        int index81_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_12 = input.LA(1);

                         
                        int index81_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA81_13 = input.LA(1);

                         
                        int index81_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA81_14 = input.LA(1);

                         
                        int index81_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA81_15 = input.LA(1);

                         
                        int index81_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA81_16 = input.LA(1);

                         
                        int index81_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA81_17 = input.LA(1);

                         
                        int index81_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA81_18 = input.LA(1);

                         
                        int index81_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA81_19 = input.LA(1);

                         
                        int index81_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA81_20 = input.LA(1);

                         
                        int index81_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA81_21 = input.LA(1);

                         
                        int index81_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA81_22 = input.LA(1);

                         
                        int index81_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA81_23 = input.LA(1);

                         
                        int index81_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA81_24 = input.LA(1);

                         
                        int index81_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index81_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\104\uffff";
    static final String DFA90_eofS =
        "\1\2\103\uffff";
    static final String DFA90_minS =
        "\1\6\1\0\102\uffff";
    static final String DFA90_maxS =
        "\1\127\1\0\102\uffff";
    static final String DFA90_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA90_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA90_transitionS = {
            "\12\2\16\uffff\3\2\1\uffff\3\2\1\uffff\14\2\1\1\31\2\1\uffff"+
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "5503:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_1 = input.LA(1);

                         
                        int index90_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalJnario()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index90_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleJnario_in_entryRuleJnario75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJnario85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleJnario123 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJnario144 = new BitSet(new long[]{0x0000000008000010L});
        public static final BitSet FOLLOW_ruleImport_in_ruleJnario167 = new BitSet(new long[]{0x0000000008000010L});
        public static final BitSet FOLLOW_RULE_FEATURE_TEXT_in_ruleJnario185 = new BitSet(new long[]{0x0000000000000460L});
        public static final BitSet FOLLOW_ruleBackground_in_ruleJnario211 = new BitSet(new long[]{0x0000000000000460L});
        public static final BitSet FOLLOW_ruleScenario_in_ruleJnario233 = new BitSet(new long[]{0x0000000000000462L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport270 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleImport317 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleImport336 = new BitSet(new long[]{0x0000000030008000L});
        public static final BitSet FOLLOW_29_in_ruleImport367 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard499 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleQualifiedNameWithWildCard518 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleQualifiedNameWithWildCard531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground573 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBackground583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BACKGROUND_TEXT_in_ruleBackground620 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleGiven_in_ruleBackground640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleBackground669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario704 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScenario714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SCENARIO_TEXT_in_ruleScenario756 = new BitSet(new long[]{0x0000000000000FA2L});
        public static final BitSet FOLLOW_ruleStep_in_ruleScenario782 = new BitSet(new long[]{0x0000000000000FA2L});
        public static final BitSet FOLLOW_ruleExamples_in_ruleScenario804 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleStep_in_entryRuleStep841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStep851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGiven_in_ruleStep898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhen_in_ruleStep925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleThen_in_ruleStep952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleStep979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGiven_in_entryRuleGiven1014 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGiven1024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_GIVEN_TEXT_in_ruleGiven1066 = new BitSet(new long[]{0xA22400C60000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleCode_in_ruleGiven1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhen_in_entryRuleWhen1128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhen1138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WHEN_TEXT_in_ruleWhen1180 = new BitSet(new long[]{0xA22400C60000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleCode_in_ruleWhen1206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleThen_in_entryRuleThen1242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleThen1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_THEN_TEXT_in_ruleThen1294 = new BitSet(new long[]{0xA22400C60000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleCode_in_ruleThen1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_AND_TEXT_in_ruleAnd1408 = new BitSet(new long[]{0xA22400C60000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleCode_in_ruleAnd1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCode_in_entryRuleCode1470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCode1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAnnotation_in_ruleCode1535 = new BitSet(new long[]{0xA22400C60000E002L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleBlockExpression_in_ruleCode1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression1594 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlockExpression1604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleBlockExpression1649 = new BitSet(new long[]{0xA22400C40000E002L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleExamples_in_entryRuleExamples1685 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExamples1695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EXAMPLE_TEXT_in_ruleExamples1737 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleExampleHeading_in_ruleExamples1763 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_ruleExampleRow_in_ruleExamples1784 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_ruleExampleHeading_in_entryRuleExampleHeading1821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExampleHeading1831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExampleHeadingCell_in_ruleExampleHeading1877 = new BitSet(new long[]{0x0000000100001000L});
        public static final BitSet FOLLOW_RULE_EXAMPLE_ROW_END_in_ruleExampleHeading1889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExampleHeadingCell_in_entryRuleExampleHeadingCell1924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExampleHeadingCell1934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleExampleHeadingCell1980 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleExampleHeadingCell2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExampleRow_in_entryRuleExampleRow2037 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExampleRow2047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExampleCell_in_ruleExampleRow2093 = new BitSet(new long[]{0x0000000100001000L});
        public static final BitSet FOLLOW_RULE_EXAMPLE_ROW_END_in_ruleExampleRow2105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExampleCell_in_entryRuleExampleCell2140 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExampleCell2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleExampleCell2187 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleExampleCell2208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAnnotation_in_entryRuleXAnnotation2244 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotation2254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleXAnnotation2300 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXAnnotation2323 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleXAnnotation2344 = new BitSet(new long[]{0x200400960000E000L,0x000000000003C800L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation2368 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleXAnnotation2381 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation2402 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotation2432 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleXAnnotation2446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValuePair_in_entryRuleXAnnotationElementValuePair2484 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotationElementValuePair2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleXAnnotationElementValuePair2542 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleXAnnotationElementValuePair2554 = new BitSet(new long[]{0x200400860000E000L,0x000000000003C800L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValuePair2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValueStringConcatenation_in_entryRuleXAnnotationElementValueStringConcatenation2611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotationElementValueStringConcatenation2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValueStringConcatenation2668 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_38_in_ruleXAnnotationElementValueStringConcatenation2695 = new BitSet(new long[]{0x200400860000E000L,0x000000000003C800L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValueStringConcatenation2729 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_entryRuleXAnnotationElementValue2767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotationElementValue2777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAnnotation_in_ruleXAnnotationElementValue2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAnnotationValueArray_in_ruleXAnnotationElementValue2851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXAnnotationElementValue2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXAnnotationElementValue2905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXAnnotationElementValue2932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXAnnotationElementValue2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAnnotationValueFieldReference_in_ruleXAnnotationElementValue2986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleXAnnotationElementValue3004 = new BitSet(new long[]{0x200400860000E000L,0x000000000003C800L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValueStringConcatenation_in_ruleXAnnotationElementValue3026 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleXAnnotationElementValue3037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAnnotationValueFieldReference_in_entryRuleXAnnotationValueFieldReference3074 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotationValueFieldReference3084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXAnnotationValueFieldReference3141 = new BitSet(new long[]{0x0004000000008000L,0x0000000000000800L});
        public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXAnnotationValueFieldReference3165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAnnotationValueArray_in_entryRuleXAnnotationValueArray3201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotationValueArray3211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleXAnnotationValueArray3257 = new BitSet(new long[]{0x200400860000E000L,0x000000000003C800L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationValueArray3278 = new BitSet(new long[]{0x0000010800000000L});
        public static final BitSet FOLLOW_35_in_ruleXAnnotationValueArray3291 = new BitSet(new long[]{0x200400860000E000L,0x000000000003C800L});
        public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationValueArray3312 = new BitSet(new long[]{0x0000010800000000L});
        public static final BitSet FOLLOW_40_in_ruleXAnnotationValueArray3326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression3362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXExpression3372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression3418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment3452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment3462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment3520 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment3536 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment3586 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3639 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign3713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleOpSingleAssign3750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3790 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign3801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleOpMultiAssign3838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression3887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3934 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression3987 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression4010 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr4049 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpOr4060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleOpOr4097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression4136 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression4146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4193 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression4246 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4269 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd4308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd4319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleOpAnd4356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression4395 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression4405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4452 = new BitSet(new long[]{0x0000300000000002L});
        public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression4505 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4528 = new BitSet(new long[]{0x0000300000000002L});
        public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality4567 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleOpEquality4616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleOpEquality4635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression4685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4732 = new BitSet(new long[]{0x0007C00000000002L});
        public static final BitSet FOLLOW_46_in_ruleXRelationalExpression4768 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression4793 = new BitSet(new long[]{0x0007C00000000002L});
        public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4854 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4877 = new BitSet(new long[]{0x0007C00000000002L});
        public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare4917 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare4928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleOpCompare4966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleOpCompare4985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleOpCompare5004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleOpCompare5023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression5063 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression5073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5120 = new BitSet(new long[]{0x0018000000000002L});
        public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression5173 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5196 = new BitSet(new long[]{0x0018000000000002L});
        public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther5235 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpOther5246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleOpOther5284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleOpOther5303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression5343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression5353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5400 = new BitSet(new long[]{0x0020004000000002L});
        public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5453 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5476 = new BitSet(new long[]{0x0020004000000002L});
        public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd5515 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd5526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleOpAdd5564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleOpAdd5583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5680 = new BitSet(new long[]{0x01C0000080000002L});
        public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5733 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5756 = new BitSet(new long[]{0x01C0000080000002L});
        public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti5795 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti5806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleOpMulti5844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleOpMulti5863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleOpMulti5882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleOpMulti5901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation5951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation6009 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation6030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation6059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary6095 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary6106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleOpUnary6144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleOpUnary6163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleOpUnary6182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression6222 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression6232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression6279 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleXCastedExpression6314 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression6337 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall6375 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall6385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall6432 = new BitSet(new long[]{0x1800000040000002L});
        public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall6481 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall6504 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall6520 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall6542 = new BitSet(new long[]{0x1800000040000002L});
        public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall6628 = new BitSet(new long[]{0x0004000000008000L});
        public static final BitSet FOLLOW_59_in_ruleXMemberFeatureCall6652 = new BitSet(new long[]{0x0004000000008000L});
        public static final BitSet FOLLOW_60_in_ruleXMemberFeatureCall6689 = new BitSet(new long[]{0x0004000000008000L});
        public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall6718 = new BitSet(new long[]{0x0000000400008000L,0x0000000001800000L});
        public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6739 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall6752 = new BitSet(new long[]{0x0000000400008000L,0x0000000001800000L});
        public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6773 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall6787 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall6812 = new BitSet(new long[]{0x1800000440000002L});
        public static final BitSet FOLLOW_34_in_ruleXMemberFeatureCall6846 = new BitSet(new long[]{0xA22400D50000E000L,0x00000000009FEEE2L});
        public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6921 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6949 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall6962 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6983 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall7000 = new BitSet(new long[]{0x1800000040000002L});
        public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression7041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression7051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression7098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression7125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression7152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression7179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression7206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression7233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression7260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression7287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression7314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression7341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression7368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression7395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral7457 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral7467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral7514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral7541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral7568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral7595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral7622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure7684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXClosure7694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleXClosure7740 = new BitSet(new long[]{0x0000000500008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7762 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_35_in_ruleXClosure7775 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7796 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_32_in_ruleXClosure7812 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure7833 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_62_in_ruleXClosure7845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7881 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure7891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7989 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_35_in_ruleXShortClosure8002 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure8023 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_32_in_ruleXShortClosure8039 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure8062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression8098 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression8108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleXParenthesizedExpression8145 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression8167 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleXParenthesizedExpression8178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression8214 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression8224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleXIfExpression8270 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleXIfExpression8282 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8303 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleXIfExpression8315 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8336 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleXIfExpression8357 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression8417 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression8427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleXSwitchExpression8473 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression8495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleXSwitchExpression8507 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8530 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleXSwitchExpression8542 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800014L});
        public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression8563 = new BitSet(new long[]{0x0000010400008000L,0x000000000080001CL});
        public static final BitSet FOLLOW_67_in_ruleXSwitchExpression8577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleXSwitchExpression8589 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8610 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleXSwitchExpression8624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart8660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart8670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
        public static final BitSet FOLLOW_68_in_ruleXCasePart8730 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleXCasePart8765 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8822 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression8832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleXForLoopExpression8878 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleXForLoopExpression8890 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleXForLoopExpression8923 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8944 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleXForLoopExpression8956 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression9013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression9023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleXWhileExpression9069 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleXWhileExpression9081 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression9102 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleXWhileExpression9114 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression9135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression9171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression9181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleXDoWhileExpression9227 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleXDoWhileExpression9260 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleXDoWhileExpression9272 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9293 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleXDoWhileExpression9305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression9341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression9351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleXBlockExpression9397 = new BitSet(new long[]{0xA22401C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression9419 = new BitSet(new long[]{0xA22401C40000E000L,0x00000000001FEFE2L});
        public static final BitSet FOLLOW_72_in_ruleXBlockExpression9432 = new BitSet(new long[]{0xA22401C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_40_in_ruleXBlockExpression9448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock9484 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock9494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock9541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock9568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration9603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration9613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleXVariableDeclaration9666 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_74_in_ruleXVariableDeclaration9697 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9745 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9766 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9795 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_37_in_ruleXVariableDeclaration9809 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9868 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter9878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9924 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter9946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9982 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall9992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall10049 = new BitSet(new long[]{0x0004000000008000L,0x0000000000000800L});
        public static final BitSet FOLLOW_50_in_ruleXFeatureCall10063 = new BitSet(new long[]{0x0000000400008000L,0x0000000001800000L});
        public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10084 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_35_in_ruleXFeatureCall10097 = new BitSet(new long[]{0x0000000400008000L,0x0000000001800000L});
        public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10118 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_49_in_ruleXFeatureCall10132 = new BitSet(new long[]{0x0004000000008000L,0x0000000000000800L});
        public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall10157 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleXFeatureCall10191 = new BitSet(new long[]{0xA22400D50000E000L,0x00000000009FEEE2L});
        public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall10266 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall10294 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleXFeatureCall10307 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall10328 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_36_in_ruleXFeatureCall10345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper10384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper10395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper10442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleIdOrSuper10466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10507 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier10518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier10565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_76_in_ruleStaticQualifier10583 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10624 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall10634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleXConstructorCall10680 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10703 = new BitSet(new long[]{0x0004000400000000L});
        public static final BitSet FOLLOW_50_in_ruleXConstructorCall10716 = new BitSet(new long[]{0x0000000400008000L,0x0000000001800000L});
        public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10737 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_35_in_ruleXConstructorCall10750 = new BitSet(new long[]{0x0000000400008000L,0x0000000001800000L});
        public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10771 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_49_in_ruleXConstructorCall10785 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleXConstructorCall10799 = new BitSet(new long[]{0xA22400D50000E000L,0x00000000009FEEE2L});
        public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10861 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10889 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleXConstructorCall10902 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10923 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_36_in_ruleXConstructorCall10940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleXBooleanLiteral11033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleXBooleanLiteral11057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral11107 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral11117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleXNullLiteral11163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral11199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral11209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral11260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral11301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral11311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral11362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral11403 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral11413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleXTypeLiteral11459 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleXTypeLiteral11471 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11494 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleXTypeLiteral11506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression11552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleXThrowExpression11598 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression11619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11655 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression11665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleXReturnExpression11711 = new BitSet(new long[]{0xA22400C40000E002L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression11742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11779 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleXTryCatchFinallyExpression11835 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
        public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
        public static final BitSet FOLLOW_85_in_ruleXTryCatchFinallyExpression11908 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleXTryCatchFinallyExpression11952 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause12011 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause12021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleXCatchClause12066 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleXCatchClause12079 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause12100 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleXCatchClause12112 = new BitSet(new long[]{0xA22400C40000E000L,0x00000000001FEEE2L});
        public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause12133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12170 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName12228 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleQualifiedName12256 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName12279 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference12336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef12455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleXFunctionTypeRef12493 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12514 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleXFunctionTypeRef12527 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12548 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_36_in_ruleXFunctionTypeRef12562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_87_in_ruleXFunctionTypeRef12576 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12633 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12691 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_50_in_ruleJvmParameterizedTypeReference12712 = new BitSet(new long[]{0x0000000400008000L,0x0000000001800000L});
        public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12734 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_35_in_ruleJvmParameterizedTypeReference12747 = new BitSet(new long[]{0x0000000400008000L,0x0000000001800000L});
        public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12768 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_49_in_ruleJvmParameterizedTypeReference12782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12820 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12939 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleJvmWildcardTypeReference12995 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000800L});
        public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference13017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference13044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound13082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound13092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleJvmUpperBound13129 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound13150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded13186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded13196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleJvmUpperBoundAnded13233 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13290 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound13300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleJvmLowerBound13337 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID13397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValidID13408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValidID13447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_synpred1_InternalJnario2336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred2_InternalJnario3607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpOr_in_synpred3_InternalJnario3955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpAnd_in_synpred4_InternalJnario4214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpEquality_in_synpred5_InternalJnario4473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_synpred6_InternalJnario4749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpCompare_in_synpred7_InternalJnario4822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpOther_in_synpred8_InternalJnario5141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpAdd_in_synpred9_InternalJnario5421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpMulti_in_synpred10_InternalJnario5701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_synpred11_InternalJnario6295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_synpred12_InternalJnario6449 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleValidID_in_synpred12_InternalJnario6458 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred12_InternalJnario6464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_synpred13_InternalJnario6567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_synpred13_InternalJnario6581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_synpred13_InternalJnario6601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_synpred14_InternalJnario6828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalJnario6880 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_35_in_synpred15_InternalJnario6887 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalJnario6894 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_32_in_synpred15_InternalJnario6904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_synpred17_InternalJnario8349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred18_InternalJnario9715 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleValidID_in_synpred18_InternalJnario9724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_synpred19_InternalJnario10173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalJnario10225 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_35_in_synpred20_InternalJnario10232 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalJnario10239 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_32_in_synpred20_InternalJnario10249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalJnario10820 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_35_in_synpred21_InternalJnario10827 = new BitSet(new long[]{0x0000000400008000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalJnario10834 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_32_in_synpred21_InternalJnario10844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXExpression_in_synpred22_InternalJnario11725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_synpred23_InternalJnario11870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_synpred24_InternalJnario11900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_synpred26_InternalJnario12247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_synpred27_InternalJnario12704 = new BitSet(new long[]{0x0000000000000002L});
    }


}