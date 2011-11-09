package de.bmw.carit.jnario.spec.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.bmw.carit.jnario.spec.services.SpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSpecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.'", "'*'", "'describes'", "'{'", "'}'", "'context'", "'it'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
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
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
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
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
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
    public static final int RULE_WS=9;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalSpecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpecParser.tokenNames; }
    public String getGrammarFileName() { return "../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g"; }



     	private SpecGrammarAccess grammarAccess;
     	
        public InternalSpecParser(TokenStream input, SpecGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Spec";	
       	}
       	
       	@Override
       	protected SpecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSpec"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:67:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:68:2: (iv_ruleSpec= ruleSpec EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:69:2: iv_ruleSpec= ruleSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecRule()); 
            }
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec75);
            iv_ruleSpec=ruleSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:76:1: ruleSpec returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSpec122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getPackageKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:86:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSpecAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSpec143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSpecRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:102:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecAccess().getImportsImportParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleSpec164);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecRule());
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
            	    break loop1;
                }
            } while (true);

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:120:3: ( (lv_elements_3_0= ruleExampleGroup ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:121:1: (lv_elements_3_0= ruleExampleGroup )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:121:1: (lv_elements_3_0= ruleExampleGroup )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:122:3: lv_elements_3_0= ruleExampleGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecAccess().getElementsExampleGroupParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExampleGroup_in_ruleSpec186);
            	    lv_elements_3_0=ruleExampleGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"ExampleGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleImport"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:146:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:147:2: (iv_ruleImport= ruleImport EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:148:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport223);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport233); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:158:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:159:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:163:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:164:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:164:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:165:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport291);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:189:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:190:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:191:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard328);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard339); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:198:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:201:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:202:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:202:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:203:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard386);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:213:1: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:214:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildCard405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard418); if (state.failed) return current;
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


    // $ANTLR start "entryRuleExampleGroup"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:233:1: entryRuleExampleGroup returns [EObject current=null] : iv_ruleExampleGroup= ruleExampleGroup EOF ;
    public final EObject entryRuleExampleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleGroup = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:234:2: (iv_ruleExampleGroup= ruleExampleGroup EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:235:2: iv_ruleExampleGroup= ruleExampleGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleGroupRule()); 
            }
            pushFollow(FOLLOW_ruleExampleGroup_in_entryRuleExampleGroup460);
            iv_ruleExampleGroup=ruleExampleGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExampleGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleGroup470); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExampleGroup"


    // $ANTLR start "ruleExampleGroup"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:242:1: ruleExampleGroup returns [EObject current=null] : (otherlv_0= 'describes' () ( (lv_target_2_0= ruleJvmTypeReference ) )? ( (lv_name_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleExampleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_target_2_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:245:28: ( (otherlv_0= 'describes' () ( (lv_target_2_0= ruleJvmTypeReference ) )? ( (lv_name_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) )* otherlv_6= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:246:1: (otherlv_0= 'describes' () ( (lv_target_2_0= ruleJvmTypeReference ) )? ( (lv_name_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) )* otherlv_6= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:246:1: (otherlv_0= 'describes' () ( (lv_target_2_0= ruleJvmTypeReference ) )? ( (lv_name_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) )* otherlv_6= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:246:3: otherlv_0= 'describes' () ( (lv_target_2_0= ruleJvmTypeReference ) )? ( (lv_name_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleExampleGroup507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExampleGroupAccess().getDescribesKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:250:1: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:251:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExampleGroupAccess().getExampleGroupAction_1(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:256:2: ( (lv_target_2_0= ruleJvmTypeReference ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==43||LA4_0==72) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:257:1: (lv_target_2_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:257:1: (lv_target_2_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:258:3: lv_target_2_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExampleGroupAccess().getTargetJvmTypeReferenceParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleExampleGroup537);
                    lv_target_2_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExampleGroupRule());
                      	        }
                             		set(
                             			current, 
                             			"target",
                              		lv_target_2_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:274:3: ( (lv_name_3_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:275:1: (lv_name_3_0= RULE_STRING )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:275:1: (lv_name_3_0= RULE_STRING )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:276:3: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExampleGroup555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getExampleGroupAccess().getNameSTRINGTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleGroupRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleExampleGroup573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExampleGroupAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:296:1: ( (lv_elements_5_0= ruleAbstractElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=18 && LA6_0<=19)||(LA6_0>=58 && LA6_0<=59)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:297:1: (lv_elements_5_0= ruleAbstractElement )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:297:1: (lv_elements_5_0= ruleAbstractElement )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:298:3: lv_elements_5_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExampleGroupAccess().getElementsAbstractElementParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleExampleGroup594);
            	    lv_elements_5_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExampleGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_5_0, 
            	              		"AbstractElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleExampleGroup607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getExampleGroupAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleExampleGroup"


    // $ANTLR start "entryRuleAbstractElement"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:326:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:327:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:328:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement643);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement653); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:335:1: ruleAbstractElement returns [EObject current=null] : (this_Context_0= ruleContext | this_Example_1= ruleExample | this_Member_2= ruleMember ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Context_0 = null;

        EObject this_Example_1 = null;

        EObject this_Member_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:338:28: ( (this_Context_0= ruleContext | this_Example_1= ruleExample | this_Member_2= ruleMember ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:339:1: (this_Context_0= ruleContext | this_Example_1= ruleExample | this_Member_2= ruleMember )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:339:1: (this_Context_0= ruleContext | this_Example_1= ruleExample | this_Member_2= ruleMember )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 58:
            case 59:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:340:5: this_Context_0= ruleContext
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getContextParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContext_in_ruleAbstractElement700);
                    this_Context_0=ruleContext();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Context_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:350:5: this_Example_1= ruleExample
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getExampleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExample_in_ruleAbstractElement727);
                    this_Example_1=ruleExample();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Example_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:360:5: this_Member_2= ruleMember
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getMemberParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMember_in_ruleAbstractElement754);
                    this_Member_2=ruleMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Member_2; 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleMember"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:376:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:377:2: (iv_ruleMember= ruleMember EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:378:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember789);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember799); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:385:1: ruleMember returns [EObject current=null] : ( (lv_decl_0_0= ruleXVariableDeclaration ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:388:28: ( ( (lv_decl_0_0= ruleXVariableDeclaration ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:389:1: ( (lv_decl_0_0= ruleXVariableDeclaration ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:389:1: ( (lv_decl_0_0= ruleXVariableDeclaration ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:390:1: (lv_decl_0_0= ruleXVariableDeclaration )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:390:1: (lv_decl_0_0= ruleXVariableDeclaration )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:391:3: lv_decl_0_0= ruleXVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMemberAccess().getDeclXVariableDeclarationParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleMember844);
            lv_decl_0_0=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMemberRule());
              	        }
                     		set(
                     			current, 
                     			"decl",
                      		lv_decl_0_0, 
                      		"XVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleContext"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:415:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:416:2: (iv_ruleContext= ruleContext EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:417:2: iv_ruleContext= ruleContext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextRule()); 
            }
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext879);
            iv_ruleContext=ruleContext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContext; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext889); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:424:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:427:28: ( (otherlv_0= 'context' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:428:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:428:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:428:3: otherlv_0= 'context' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleContext926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:432:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:433:1: (lv_name_1_0= RULE_STRING )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:433:1: (lv_name_1_0= RULE_STRING )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:434:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContext943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getContextAccess().getNameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getContextRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleContext960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:454:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=19)||(LA8_0>=58 && LA8_0<=59)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:455:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:455:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:456:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContextAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleContext981);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContextRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"AbstractElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleContext994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleExample"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:484:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:485:2: (iv_ruleExample= ruleExample EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:486:2: iv_ruleExample= ruleExample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleRule()); 
            }
            pushFollow(FOLLOW_ruleExample_in_entryRuleExample1030);
            iv_ruleExample=ruleExample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExample; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExample1040); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:493:1: ruleExample returns [EObject current=null] : (otherlv_0= 'it' ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:496:28: ( (otherlv_0= 'it' ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:497:1: (otherlv_0= 'it' ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:497:1: (otherlv_0= 'it' ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:497:3: otherlv_0= 'it' ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleExample1077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExampleAccess().getItKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:501:1: ( ( ruleValidID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:502:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:502:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:503:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExampleAccess().getFeatureJvmIdentifiableElementCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleExample1100);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:516:3: ( (lv_name_2_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:517:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:517:1: (lv_name_2_0= RULE_STRING )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:518:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExample1118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getExampleAccess().getNameSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:534:3: ( (lv_body_3_0= ruleXBlockExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:535:1: (lv_body_3_0= ruleXBlockExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:535:1: (lv_body_3_0= ruleXBlockExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:536:3: lv_body_3_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExampleAccess().getBodyXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleExample1145);
            lv_body_3_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExampleRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_3_0, 
                      		"XBlockExpression");
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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleXExpression"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:560:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:561:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:562:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1181);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1191); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:569:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:572:28: (this_XAssignment_0= ruleXAssignment )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:574:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1237);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:590:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:591:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:592:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1271);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1281); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:599:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:602:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:603:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:603:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||(LA12_1>=RULE_STRING && LA12_1<=RULE_ID)||(LA12_1>=13 && LA12_1<=14)||(LA12_1>=16 && LA12_1<=19)||(LA12_1>=21 && LA12_1<=45)||(LA12_1>=47 && LA12_1<=72)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==20) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)||LA12_0==16||LA12_0==30||(LA12_0>=33 && LA12_0<=34)||LA12_0==38||LA12_0==43||LA12_0==45||LA12_0==49||LA12_0==51||(LA12_0>=55 && LA12_0<=57)||LA12_0==60||(LA12_0>=62 && LA12_0<=69)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:603:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:603:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:603:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:603:3: ()
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:604:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:609:2: ( ( ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:610:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:610:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:611:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1339);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1355);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:632:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:633:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:633:1: (lv_value_3_0= ruleXAssignment )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:634:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1375);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:651:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:651:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:652:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1405);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:660:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        int LA11_1 = input.LA(2);

                        if ( (synpred1_InternalSpec()) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:660:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:660:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:660:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:665:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:665:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:665:7: ()
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:666:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:671:2: ( ( ruleOpMultiAssign ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:672:1: ( ruleOpMultiAssign )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:672:1: ( ruleOpMultiAssign )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:673:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1458);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:686:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:687:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:687:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:688:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1481);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:712:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:713:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:714:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1521);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1532); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:721:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:724:28: (kw= '=' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:726:2: kw= '='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpSingleAssign1569); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:739:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:740:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:741:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1609);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1620); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:748:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:751:28: (kw= '+=' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:753:2: kw= '+='
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpMultiAssign1657); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:766:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:767:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:768:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1696);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1706); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:775:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:778:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:779:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:779:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:780:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1753);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:788:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred2_InternalSpec()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:788:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:788:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:788:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:793:6: ( () ( ( ruleOpOr ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:793:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:793:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:794:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:799:2: ( ( ruleOpOr ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:800:1: ( ruleOpOr )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:800:1: ( ruleOpOr )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:801:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1806);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:814:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:815:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:815:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:816:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1829);
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
            	    break loop13;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:840:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:841:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:842:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1868);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1879); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:849:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:852:28: (kw= '||' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:854:2: kw= '||'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpOr1916); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:867:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:868:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:869:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1955);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1965); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:876:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:879:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:880:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:880:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:881:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2012);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:889:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred3_InternalSpec()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:889:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:889:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:889:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:894:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:894:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:894:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:895:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:900:2: ( ( ruleOpAnd ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:901:1: ( ruleOpAnd )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:901:1: ( ruleOpAnd )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:902:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2065);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:915:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:916:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:916:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:917:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2088);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:941:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:942:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:943:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2127);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2138); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:950:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:953:28: (kw= '&&' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:955:2: kw= '&&'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpAnd2175); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:968:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:969:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:970:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2214);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2224); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:977:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:980:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:981:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:981:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:982:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2271);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:990:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred4_InternalSpec()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==25) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred4_InternalSpec()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:990:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:990:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:990:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:995:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:995:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:995:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:996:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1001:2: ( ( ruleOpEquality ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1002:1: ( ruleOpEquality )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1002:1: ( ruleOpEquality )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1003:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2324);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1016:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1017:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1017:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1018:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2347);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1042:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1043:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1044:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2386);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2397); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1051:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1054:28: ( (kw= '==' | kw= '!=' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1055:1: (kw= '==' | kw= '!=' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1055:1: (kw= '==' | kw= '!=' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1056:2: kw= '=='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality2435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1063:2: kw= '!='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpEquality2454); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1076:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1077:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1078:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2494);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2504); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1085:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1088:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1089:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1089:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1090:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2551);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop17:
            do {
                int alt17=3;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred5_InternalSpec()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA17_6 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt17=2;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1100:5: ( () otherlv_2= 'instanceof' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1100:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1100:6: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1101:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXRelationalExpression2587); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1110:3: ( ( ruleQualifiedName ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1111:1: ( ruleQualifiedName )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1111:1: ( ruleQualifiedName )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2612);
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
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1131:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1131:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1131:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1132:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1137:2: ( ( ruleOpCompare ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:1: ( ruleOpCompare )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:1: ( ruleOpCompare )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1139:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2673);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1152:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1153:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1153:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1154:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2696);
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
            	    break loop17;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1178:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1179:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1180:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2736);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2747); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1187:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1190:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1191:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1191:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt18=1;
                }
                break;
            case 28:
                {
                alt18=2;
                }
                break;
            case 29:
                {
                alt18=3;
                }
                break;
            case 30:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1192:2: kw= '>='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1199:2: kw= '<='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1206:2: kw= '>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1213:2: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2842); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1226:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1227:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1228:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2882);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2892); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1235:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1238:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1239:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1239:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1240:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2939);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1248:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred7_InternalSpec()) ) {
                        alt19=1;
                    }


                }
                else if ( (LA19_0==32) ) {
                    int LA19_3 = input.LA(2);

                    if ( (synpred7_InternalSpec()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1248:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1248:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1248:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1253:6: ( () ( ( ruleOpOther ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1253:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1253:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1254:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1259:2: ( ( ruleOpOther ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1260:1: ( ruleOpOther )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1260:1: ( ruleOpOther )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1261:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2992);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1274:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1275:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1275:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1276:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3015);
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
            	    break loop19;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1300:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1301:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1302:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3054);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3065); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1309:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1312:28: ( (kw= '->' | kw= '..' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1313:1: (kw= '->' | kw= '..' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1313:1: (kw= '->' | kw= '..' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            else if ( (LA20_0==32) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1314:2: kw= '->'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1321:2: kw= '..'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3122); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1334:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1335:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1336:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3162);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3172); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1343:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1346:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1347:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1347:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1348:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3219);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1356:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred8_InternalSpec()) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==34) ) {
                    int LA21_3 = input.LA(2);

                    if ( (synpred8_InternalSpec()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1356:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1356:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1356:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1362:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1367:2: ( ( ruleOpAdd ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1368:1: ( ruleOpAdd )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1368:1: ( ruleOpAdd )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1369:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3272);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1382:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1383:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1383:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1384:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3295);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1408:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1409:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1410:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3334);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3345); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1417:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1420:28: ( (kw= '+' | kw= '-' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1421:1: (kw= '+' | kw= '-' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1421:1: (kw= '+' | kw= '-' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            else if ( (LA22_0==34) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1422:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd3383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1429:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd3402); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1442:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1443:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1444:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3442);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3452); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1451:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1454:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1455:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1455:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1456:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3499);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt23=1;
                    }


                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1469:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1469:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1469:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1470:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1475:2: ( ( ruleOpMulti ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1476:1: ( ruleOpMulti )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1476:1: ( ruleOpMulti )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1477:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3552);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1490:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1491:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1491:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1492:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3575);
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
            	    break loop23;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1516:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1517:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1518:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3614);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3625); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1525:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1528:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1529:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1529:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt24=1;
                }
                break;
            case 35:
                {
                alt24=2;
                }
                break;
            case 36:
                {
                alt24=3;
                }
                break;
            case 37:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1530:2: kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleOpMulti3663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1537:2: kw= '**'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1544:2: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1551:2: kw= '%'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3720); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1564:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1565:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1566:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3760);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3770); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1573:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1576:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1577:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1577:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=33 && LA25_0<=34)||LA25_0==38) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||LA25_0==16||LA25_0==30||LA25_0==43||LA25_0==45||LA25_0==49||LA25_0==51||(LA25_0>=55 && LA25_0<=57)||LA25_0==60||(LA25_0>=62 && LA25_0<=69)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1577:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1577:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1577:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1577:3: ()
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1578:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1583:2: ( ( ruleOpUnary ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1584:1: ( ruleOpUnary )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1584:1: ( ruleOpUnary )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1585:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3828);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1598:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1599:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1599:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1600:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3849);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1618:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3878);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1634:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1635:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1636:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3914);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3925); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1643:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1646:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1647:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1647:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt26=1;
                }
                break;
            case 34:
                {
                alt26=2;
                }
                break;
            case 33:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1648:2: kw= '!'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary3963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1655:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary3982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1662:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary4001); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1675:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1676:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1677:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4041);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4051); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1684:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1687:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1688:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1688:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1689:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4098);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1697:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==39) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred10_InternalSpec()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1697:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1697:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1697:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:5: ( () otherlv_2= 'as' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:6: () otherlv_2= 'as'
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:6: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1700:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXCastedExpression4133); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1709:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1710:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1710:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4156);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1735:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1736:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1737:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4194);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4204); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1744:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1747:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1748:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1748:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1749:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4251);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop35:
            do {
                int alt35=3;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred11_InternalSpec()) ) {
                        alt35=1;
                    }
                    else if ( (synpred12_InternalSpec()) ) {
                        alt35=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred12_InternalSpec()) ) {
                        alt35=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred12_InternalSpec()) ) {
                        alt35=2;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1763:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1763:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1763:26: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1764:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall4300); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1773:1: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1774:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1774:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1775:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4323);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4339);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1796:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:1: (lv_value_5_0= ruleXAssignment )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1798:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4361);
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
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1831:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1831:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1831:8: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1832:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1837:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt28=3;
            	    switch ( input.LA(1) ) {
            	    case 13:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1837:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall4447); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1842:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1842:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1843:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1843:1: (lv_nullSafe_8_0= '?.' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1844:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4471); if (state.failed) return current;
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
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1858:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1858:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1859:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1859:1: (lv_spreading_9_0= '*.' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1860:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4508); if (state.failed) return current;
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1873:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==30) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1873:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleXMemberFeatureCall4537); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1877:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1878:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1878:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1879:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4558);
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

            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1895:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop29:
            	            do {
            	                int alt29=2;
            	                int LA29_0 = input.LA(1);

            	                if ( (LA29_0==42) ) {
            	                    alt29=1;
            	                }


            	                switch (alt29) {
            	            	case 1 :
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1895:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4571); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1899:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1900:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1900:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1901:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4592);
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
            	            	    break loop29;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4606); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1921:3: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1922:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1922:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1923:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4631);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1936:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt33=2;
            	    alt33 = dfa33.predict(input);
            	    switch (alt33) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1936:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1936:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1936:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1943:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1944:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4665); if (state.failed) return current;
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

            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt32=3;
            	            alt32 = dfa32.predict(input);
            	            switch (alt32) {
            	                case 1 :
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1974:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1975:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4750);
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
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1992:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1992:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1992:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1992:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1993:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1993:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1994:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4778);
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

            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2010:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop31:
            	                    do {
            	                        int alt31=2;
            	                        int LA31_0 = input.LA(1);

            	                        if ( (LA31_0==42) ) {
            	                            alt31=1;
            	                        }


            	                        switch (alt31) {
            	                    	case 1 :
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2010:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4791); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2014:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2015:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2015:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2016:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4812);
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
            	                    	    break loop31;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4829); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2036:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2036:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2041:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2042:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4862);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2066:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2067:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2068:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4902);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4912); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2075:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2078:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2079:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2079:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt36=13;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt36=1;
                }
                break;
            case 16:
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
            case 30:
            case 60:
                {
                alt36=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 45:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt36=5;
                }
                break;
            case 49:
                {
                alt36=6;
                }
                break;
            case 55:
                {
                alt36=7;
                }
                break;
            case 56:
                {
                alt36=8;
                }
                break;
            case 57:
                {
                alt36=9;
                }
                break;
            case 67:
                {
                alt36=10;
                }
                break;
            case 68:
                {
                alt36=11;
                }
                break;
            case 69:
                {
                alt36=12;
                }
                break;
            case 43:
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2080:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4959);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2090:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4986);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2100:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5013);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2110:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5040);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2120:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5067);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2130:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5094);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2140:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5121);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2150:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5148);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2160:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5175);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2170:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5202);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2180:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5229);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2190:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5256);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2200:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5283);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2216:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2217:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2218:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5318);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5328); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2225:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2228:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2229:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2229:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt37=1;
                }
                break;
            case 63:
            case 64:
                {
                alt37=2;
                }
                break;
            case RULE_INT:
                {
                alt37=3;
                }
                break;
            case 65:
                {
                alt37=4;
                }
                break;
            case RULE_STRING:
                {
                alt37=5;
                }
                break;
            case 66:
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2230:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5375);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2240:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5402);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2250:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5429);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2260:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5456);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5483);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2280:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5510);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2296:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2297:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2298:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5545);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5555); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2305:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2308:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2309:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2309:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2309:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2309:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2310:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2319:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2319:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2334:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2334:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2334:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID||LA39_0==43||LA39_0==72) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2334:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2334:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2335:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2335:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2336:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5672);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2352:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==42) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2352:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5685); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2356:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2357:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2357:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2358:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5706);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2374:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2375:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2375:1: (lv_explicitSyntax_5_0= '|' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2376:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2389:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2390:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2390:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2391:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5765);
            lv_expression_6_0=ruleXExpressionInClosure();

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
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
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


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2419:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2420:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2421:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5813);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5823); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2428:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2431:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2432:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2432:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2432:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2432:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2433:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2438:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)||LA42_0==16||LA42_0==30||(LA42_0>=33 && LA42_0<=34)||LA42_0==38||LA42_0==43||LA42_0==45||LA42_0==49||LA42_0==51||(LA42_0>=55 && LA42_0<=60)||(LA42_0>=62 && LA42_0<=69)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2438:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2438:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2439:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2439:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2440:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5879);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2456:2: (otherlv_2= ';' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==48) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2456:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXExpressionInClosure5892); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2468:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2469:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2470:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5932);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5942); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2477:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2480:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2481:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2481:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2481:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2481:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2481:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2497:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2497:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2497:7: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2498:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2503:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==43||LA44_0==72) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2503:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2503:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2504:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2504:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2505:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6050);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2521:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==42) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2521:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXShortClosure6063); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2525:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2526:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2526:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2527:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6084);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
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


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2543:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2544:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2544:1: (lv_explicitSyntax_4_0= '|' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2545:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,46,FOLLOW_46_in_ruleXShortClosure6106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2558:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2559:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2559:1: (lv_expression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2560:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6142);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2584:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2585:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2586:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6178);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6188); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2593:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2596:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2597:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2597:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2597:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleXParenthesizedExpression6225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6247);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression6258); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2622:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2623:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2624:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6294);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6304); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2631:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2634:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2635:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2635:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2635:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2635:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2636:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression6350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression6362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2649:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2650:1: (lv_if_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2650:1: (lv_if_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2651:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6383);
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

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression6395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2671:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2672:1: (lv_then_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2672:1: (lv_then_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2673:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6416);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2689:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred18_InternalSpec()) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2689:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2689:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2689:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2694:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2695:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2695:1: (lv_else_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2696:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6459);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2720:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2721:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2722:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6497);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6507); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2729:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2732:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2733:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2733:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2733:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2733:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2734:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2743:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==52) && (synpred19_InternalSpec())) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2743:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2748:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2748:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2748:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2749:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2749:1: (lv_localVarName_2_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2750:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6594);
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

                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2770:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2771:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2771:1: (lv_switch_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2772:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6630);
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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2792:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||LA47_0==43||LA47_0==52||LA47_0==54||LA47_0==72) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2793:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2793:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2794:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6663);
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
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2810:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==53) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2810:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2818:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2819:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2819:1: (lv_default_9_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2820:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6710);
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

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6724); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2848:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2849:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2850:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6760);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6770); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2857:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2860:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2861:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2861:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2861:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2861:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||LA49_0==43||LA49_0==72) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2862:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2862:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2863:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6816);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2879:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2879:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXCasePart6830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2883:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2884:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2884:1: (lv_case_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2885:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6851);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2905:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2906:1: (lv_then_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2906:1: (lv_then_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2907:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6886);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2931:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2932:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2933:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6922);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6932); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2940:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2943:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2944:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2944:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2944:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2944:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2945:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXForLoopExpression6978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXForLoopExpression6990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2958:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2959:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2959:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2960:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7011);
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

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXForLoopExpression7023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2980:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2981:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2981:1: (lv_forExpression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2982:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7044);
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

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression7056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3002:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3003:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3003:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3004:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7077);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3028:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3029:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3030:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7113);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7123); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3037:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3040:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3041:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3041:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3041:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3041:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3042:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXWhileExpression7169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXWhileExpression7181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3055:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3056:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3056:1: (lv_predicate_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3057:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7202);
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

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression7214); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3077:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3078:1: (lv_body_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3078:1: (lv_body_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3079:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7235);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3103:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3104:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3105:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7271);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7281); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3112:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3115:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3116:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3116:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3116:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3116:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3117:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression7327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3126:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3127:1: (lv_body_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3127:1: (lv_body_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3128:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7348);
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

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXDoWhileExpression7360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXDoWhileExpression7372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3152:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3153:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3153:1: (lv_predicate_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3154:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7393);
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

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression7405); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3182:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3183:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3184:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7441);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7451); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3191:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3194:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3195:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3195:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3195:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3195:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3196:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression7497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3205:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||LA52_0==16||LA52_0==30||(LA52_0>=33 && LA52_0<=34)||LA52_0==38||LA52_0==43||LA52_0==45||LA52_0==49||LA52_0==51||(LA52_0>=55 && LA52_0<=60)||(LA52_0>=62 && LA52_0<=69)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3205:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3205:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3206:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3206:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3207:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7519);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3223:2: (otherlv_3= ';' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==48) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3223:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXBlockExpression7532); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7548); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3239:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3240:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3241:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7584);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7594); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3248:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3251:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3252:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3252:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=58 && LA53_0<=59)) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)||LA53_0==16||LA53_0==30||(LA53_0>=33 && LA53_0<=34)||LA53_0==38||LA53_0==43||LA53_0==45||LA53_0==49||LA53_0==51||(LA53_0>=55 && LA53_0<=57)||LA53_0==60||(LA53_0>=62 && LA53_0<=69)) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3253:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7641);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3263:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7668);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3279:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3280:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3281:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7703);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7713); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3288:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3291:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3292:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3292:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3292:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3292:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3293:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3298:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==58) ) {
                alt54=1;
            }
            else if ( (LA54_0==59) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3298:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3298:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3299:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3299:1: (lv_writeable_1_0= 'var' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3300:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7766); if (state.failed) return current;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3314:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration7797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3318:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (synpred20_InternalSpec()) ) {
                    alt55=1;
                }
                else if ( (true) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA55_0==43) && (synpred20_InternalSpec())) {
                alt55=1;
            }
            else if ( (LA55_0==72) && (synpred20_InternalSpec())) {
                alt55=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3318:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3318:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3318:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3326:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3326:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3326:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3327:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3327:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3328:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7845);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3344:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3345:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3345:1: (lv_name_4_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3346:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7866);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3363:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3363:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3364:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3364:1: (lv_name_5_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3365:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7895);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3381:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==20) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3381:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleXVariableDeclaration7909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3385:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3386:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3386:1: (lv_right_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3387:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7930);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3411:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3412:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3413:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7968);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7978); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3420:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3423:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3424:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3424:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3424:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3424:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==RULE_ID||LA57_1==13||LA57_1==30||LA57_1==45) ) {
                    alt57=1;
                }
            }
            else if ( (LA57_0==43||LA57_0==72) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3425:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3425:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3426:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8024);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3442:3: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3443:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3443:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3444:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8046);
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


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3468:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3469:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3470:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8082);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8092); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3477:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3480:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3481:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3481:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3481:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3481:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3482:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3482:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3483:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8138);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3499:2: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3500:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3500:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3501:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8159);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3525:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3526:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3527:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8195);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8205); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3534:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3537:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3538:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3538:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3538:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3538:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3539:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3544:2: ( ( ruleStaticQualifier ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==61) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3545:1: ( ruleStaticQualifier )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3545:1: ( ruleStaticQualifier )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3546:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8262);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3559:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==30) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3559:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXFeatureCall8276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3563:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3564:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3564:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3565:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8297);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3581:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==42) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3581:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall8310); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3585:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3586:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3586:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3587:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8331);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall8345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3607:3: ( ( ruleIdOrSuper ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3608:1: ( ruleIdOrSuper )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3608:1: ( ruleIdOrSuper )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3609:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8370);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3622:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3622:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3622:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3622:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3629:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3630:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8404); if (state.failed) return current;
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3643:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt62=3;
                    alt62 = dfa62.predict(input);
                    switch (alt62) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3643:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3643:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3643:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3660:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3661:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8489);
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
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3678:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3678:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3678:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3678:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3679:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3679:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3680:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8517);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3696:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==42) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3696:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall8530); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3700:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3701:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3701:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3702:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8551);
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
                            	    break loop61;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall8568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3722:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3722:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3727:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3728:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8601);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3752:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3753:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3754:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8639);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8650); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3761:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3764:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3765:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3765:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            else if ( (LA65_0==60) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3766:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8697);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3778:2: kw= 'super'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleIdOrSuper8721); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3791:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3792:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3793:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8762);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8773); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3800:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3803:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3804:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3804:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID) ) {
                    int LA66_2 = input.LA(2);

                    if ( (LA66_2==61) ) {
                        alt66=1;
                    }


                }


                switch (alt66) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3805:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8820);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,61,FOLLOW_61_in_ruleStaticQualifier8838); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3829:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3830:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3831:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8879);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8889); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3838:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3841:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3842:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3842:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3842:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3842:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3843:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXConstructorCall8935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3852:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3853:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3853:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3854:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8958);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3867:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==30) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3867:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleXConstructorCall8971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3871:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3872:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3872:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3873:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8992);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3889:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==42) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3889:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall9005); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3893:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3894:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3894:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3895:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9026);
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
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall9040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall9054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3919:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt70=3;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3919:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3919:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3919:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3936:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3937:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9126);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3954:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3954:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3954:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3954:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3955:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3955:1: (lv_arguments_10_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3956:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9154);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3972:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==42) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3972:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall9167); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3976:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3977:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3977:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3978:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9188);
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
                    	    break loop69;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall9205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3998:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3998:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4003:1: (lv_arguments_14_0= ruleXClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4004:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9236);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4028:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4029:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4030:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9273);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9283); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4037:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4040:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4041:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4041:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4041:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4041:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4042:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4047:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==63) ) {
                alt72=1;
            }
            else if ( (LA72_0==64) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4047:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXBooleanLiteral9330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4052:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4052:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4053:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4053:1: (lv_isTrue_2_0= 'true' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4054:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,64,FOLLOW_64_in_ruleXBooleanLiteral9354); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4075:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4076:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4077:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9404);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9414); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4084:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4087:28: ( ( () otherlv_1= 'null' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4088:1: ( () otherlv_1= 'null' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4088:1: ( () otherlv_1= 'null' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4088:2: () otherlv_1= 'null'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4088:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4089:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXNullLiteral9460); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4106:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4107:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4108:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9496);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9506); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4115:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4118:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4119:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4119:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4119:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4119:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4120:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4125:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4126:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4126:1: (lv_value_1_0= RULE_INT )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4127:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9557); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4151:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4152:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4153:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9598);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9608); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4160:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4163:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4164:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4164:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4164:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4164:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4165:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4170:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4171:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4171:1: (lv_value_1_0= RULE_STRING )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4172:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9659); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4196:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4197:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4198:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9700);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9710); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4205:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4208:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4209:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4209:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4209:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4209:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4210:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXTypeLiteral9756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXTypeLiteral9768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4223:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4224:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4224:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4225:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9791);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral9803); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4250:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4251:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4252:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9839);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9849); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4259:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4262:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4263:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4263:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4263:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4263:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4264:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXThrowExpression9895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4273:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4274:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4274:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4275:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9916);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4299:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4300:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4301:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9952);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9962); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4308:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4311:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4312:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4312:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4312:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4312:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4313:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXReturnExpression10008); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4322:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4322:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4327:1: (lv_expression_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4328:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10039);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4352:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4353:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4354:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10076);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10086); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4361:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4364:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4365:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4365:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4365:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4365:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4366:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression10132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4375:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4376:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4376:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4377:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10153);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4393:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==71) ) {
                alt76=1;
            }
            else if ( (LA76_0==70) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4393:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4393:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4393:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4393:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==71) ) {
                            int LA74_2 = input.LA(2);

                            if ( (synpred27_InternalSpec()) ) {
                                alt74=1;
                            }


                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4393:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4395:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4396:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10183);
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
                    	    if ( cnt74 >= 1 ) break loop74;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
                    } while (true);

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4412:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==70) ) {
                        int LA75_1 = input.LA(2);

                        if ( (synpred28_InternalSpec()) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4412:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4412:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4412:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression10205); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4417:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4418:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4418:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4419:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10227);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4436:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4436:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4436:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression10249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4440:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4441:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4441:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4442:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10270);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4466:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4467:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4468:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10308);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10318); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4475:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4478:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4479:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4479:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4479:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4479:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4479:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleXCatchClause10363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXCatchClause10376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4488:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4489:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4489:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4490:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10397);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

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
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause10409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4510:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4511:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4511:1: (lv_expression_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4512:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10430);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4536:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4537:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4538:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10467);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10478); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4545:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4548:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4549:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4549:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4550:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10525);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4560:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==13) ) {
                    int LA77_2 = input.LA(2);

                    if ( (LA77_2==RULE_ID) ) {
                        int LA77_3 = input.LA(3);

                        if ( (synpred30_InternalSpec()) ) {
                            alt77=1;
                        }


                    }


                }


                switch (alt77) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4560:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4560:2: ( ( '.' )=>kw= '.' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4560:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName10553); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10576);
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
            	    break loop77;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4587:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4588:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4589:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10623);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10633); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4596:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4599:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4600:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4600:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            else if ( (LA79_0==43||LA79_0==72) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4600:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4600:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4601:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10681);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4609:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==45) ) {
                            int LA78_2 = input.LA(2);

                            if ( (LA78_2==47) ) {
                                int LA78_3 = input.LA(3);

                                if ( (synpred31_InternalSpec()) ) {
                                    alt78=1;
                                }


                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4609:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4612:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4612:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4612:6: ()
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4613:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleJvmTypeReference10719); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleJvmTypeReference10731); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
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
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4628:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10763);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4644:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4645:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4646:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10798);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10808); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4653:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4656:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4657:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4657:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4657:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4657:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==43) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4657:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4661:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4662:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4662:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4663:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10867);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4679:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==42) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4679:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef10880); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4683:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4684:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4684:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4685:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10901);
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
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleXFunctionTypeRef10929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4709:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4710:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4710:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4711:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10950);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4735:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4736:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4737:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10986);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10996); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4744:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4747:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4748:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4748:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4748:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4748:2: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4749:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4749:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4750:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11044);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4763:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4763:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4763:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4763:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleJvmParameterizedTypeReference11065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4768:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4769:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4769:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4770:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11087);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4786:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==42) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4786:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleJvmParameterizedTypeReference11100); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4790:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4791:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4791:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4792:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11121);
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
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference11135); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4820:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4821:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4822:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11173);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11183); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4829:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4832:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4833:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4833:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID||LA84_0==43||LA84_0==72) ) {
                alt84=1;
            }
            else if ( (LA84_0==73) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4834:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11230);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4844:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11257);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4860:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4861:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4862:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11292);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11302); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4869:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4872:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4873:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4873:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4873:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4873:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4874:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleJvmWildcardTypeReference11348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4883:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt85=3;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==74) ) {
                alt85=1;
            }
            else if ( (LA85_0==60) ) {
                alt85=2;
            }
            switch (alt85) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4883:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4883:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4884:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4884:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4885:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11370);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4902:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4902:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4903:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4903:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4904:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11397);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4928:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4929:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4930:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11435);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11445); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4937:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4940:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4941:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4941:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4941:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBound11482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4945:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4946:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4946:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4947:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11503);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4971:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4972:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4973:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11539);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11549); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4980:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4983:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4984:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4984:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4984:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBoundAnded11586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4988:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4989:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4989:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4990:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11607);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5014:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5015:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5016:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11643);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11653); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5023:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5026:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5027:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5027:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5027:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleJvmLowerBound11690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5031:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5032:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5032:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5033:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11711);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5059:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5060:2: (iv_ruleValidID= ruleValidID EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5061:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11750);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11761); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5068:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5071:28: (this_ID_0= RULE_ID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5072:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11800); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSpec
    public final void synpred1_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:660:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:660:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:660:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:660:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:660:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:661:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:661:2: ( ( ruleOpMultiAssign ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:662:1: ( ruleOpMultiAssign )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:662:1: ( ruleOpMultiAssign )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:663:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSpec1426);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalSpec

    // $ANTLR start synpred2_InternalSpec
    public final void synpred2_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:788:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:788:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:788:4: ( () ( ( ruleOpOr ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:788:5: () ( ( ruleOpOr ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:788:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:789:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:789:2: ( ( ruleOpOr ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:790:1: ( ruleOpOr )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:790:1: ( ruleOpOr )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:791:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalSpec1774);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalSpec

    // $ANTLR start synpred3_InternalSpec
    public final void synpred3_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:889:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:889:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:889:4: ( () ( ( ruleOpAnd ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:889:5: () ( ( ruleOpAnd ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:889:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:890:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:890:2: ( ( ruleOpAnd ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:891:1: ( ruleOpAnd )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:891:1: ( ruleOpAnd )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:892:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalSpec2033);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalSpec

    // $ANTLR start synpred4_InternalSpec
    public final void synpred4_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:990:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:990:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:990:4: ( () ( ( ruleOpEquality ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:990:5: () ( ( ruleOpEquality ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:990:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:991:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:991:2: ( ( ruleOpEquality ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:992:1: ( ruleOpEquality )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:992:1: ( ruleOpEquality )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:993:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalSpec2292);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalSpec

    // $ANTLR start synpred5_InternalSpec
    public final void synpred5_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:4: ( ( () 'instanceof' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:5: ( () 'instanceof' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:5: ( () 'instanceof' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:6: () 'instanceof'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1098:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1099:1: 
        {
        }

        match(input,26,FOLLOW_26_in_synpred5_InternalSpec2568); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSpec

    // $ANTLR start synpred6_InternalSpec
    public final void synpred6_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:9: ( () ( ( ruleOpCompare ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:10: () ( ( ruleOpCompare ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:10: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1127:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1127:2: ( ( ruleOpCompare ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1128:1: ( ruleOpCompare )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1128:1: ( ruleOpCompare )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1129:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalSpec2641);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalSpec

    // $ANTLR start synpred7_InternalSpec
    public final void synpred7_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1248:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1248:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1248:4: ( () ( ( ruleOpOther ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1248:5: () ( ( ruleOpOther ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1248:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1249:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1249:2: ( ( ruleOpOther ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1250:1: ( ruleOpOther )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1250:1: ( ruleOpOther )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1251:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalSpec2960);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalSpec

    // $ANTLR start synpred8_InternalSpec
    public final void synpred8_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1356:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1356:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1356:4: ( () ( ( ruleOpAdd ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1356:5: () ( ( ruleOpAdd ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1356:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1357:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1357:2: ( ( ruleOpAdd ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1358:1: ( ruleOpAdd )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1358:1: ( ruleOpAdd )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1359:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalSpec3240);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalSpec

    // $ANTLR start synpred9_InternalSpec
    public final void synpred9_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:4: ( () ( ( ruleOpMulti ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:5: () ( ( ruleOpMulti ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1465:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1465:2: ( ( ruleOpMulti ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1466:1: ( ruleOpMulti )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1466:1: ( ruleOpMulti )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1467:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalSpec3520);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalSpec

    // $ANTLR start synpred10_InternalSpec
    public final void synpred10_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1697:3: ( ( () 'as' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1697:4: ( () 'as' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1697:4: ( () 'as' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1697:5: () 'as'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1697:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1698:1: 
        {
        }

        match(input,39,FOLLOW_39_in_synpred10_InternalSpec4114); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalSpec

    // $ANTLR start synpred11_InternalSpec
    public final void synpred11_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1757:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1758:1: 
        {
        }

        match(input,13,FOLLOW_13_in_synpred11_InternalSpec4268); if (state.failed) return ;
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1759:1: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1760:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1760:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1761:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalSpec4277);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalSpec4283);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSpec

    // $ANTLR start synpred12_InternalSpec
    public final void synpred12_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:10: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1816:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1816:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt86=3;
        switch ( input.LA(1) ) {
        case 13:
            {
            alt86=1;
            }
            break;
        case 40:
            {
            alt86=2;
            }
            break;
        case 41:
            {
            alt86=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 86, 0, input);

            throw nvae;
        }

        switch (alt86) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1816:4: '.'
                {
                match(input,13,FOLLOW_13_in_synpred12_InternalSpec4386); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1818:6: ( ( '?.' ) )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1818:6: ( ( '?.' ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1819:1: ( '?.' )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1819:1: ( '?.' )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1820:2: '?.'
                {
                match(input,40,FOLLOW_40_in_synpred12_InternalSpec4400); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1825:6: ( ( '*.' ) )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1825:6: ( ( '*.' ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1826:1: ( '*.' )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1826:1: ( '*.' )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1827:2: '*.'
                {
                match(input,41,FOLLOW_41_in_synpred12_InternalSpec4420); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalSpec

    // $ANTLR start synpred13_InternalSpec
    public final void synpred13_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1936:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1937:1: ( '(' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1937:1: ( '(' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1938:2: '('
        {
        match(input,43,FOLLOW_43_in_synpred13_InternalSpec4647); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSpec

    // $ANTLR start synpred14_InternalSpec
    public final void synpred14_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1958:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1958:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==43||LA88_0==72) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1958:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1958:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1959:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1959:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1960:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4699);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1962:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==42) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1962:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred14_InternalSpec4706); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1963:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1964:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1964:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1965:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4713);
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

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1967:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1968:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1968:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1969:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred14_InternalSpec4727); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSpec

    // $ANTLR start synpred15_InternalSpec
    public final void synpred15_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2036:4: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2038:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalSpec4845);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSpec

    // $ANTLR start synpred16_InternalSpec
    public final void synpred16_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2319:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2319:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2319:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2319:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2319:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==43||LA90_0==72) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2319:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2319:5: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2320:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2320:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2321:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5618);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2323:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==42) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2323:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred16_InternalSpec5625); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2324:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2325:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2325:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2326:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5632);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);


                }
                break;

        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2328:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2329:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2329:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred16_InternalSpec5646); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalSpec

    // $ANTLR start synpred18_InternalSpec
    public final void synpred18_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2689:4: ( 'else' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2689:6: 'else'
        {
        match(input,50,FOLLOW_50_in_synpred18_InternalSpec6429); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalSpec

    // $ANTLR start synpred19_InternalSpec
    public final void synpred19_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2743:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2743:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2743:3: ( ( ( ruleValidID ) ) ':' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2743:4: ( ( ruleValidID ) ) ':'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2743:4: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2744:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2744:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2745:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalSpec6569);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,52,FOLLOW_52_in_synpred19_InternalSpec6575); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSpec

    // $ANTLR start synpred20_InternalSpec
    public final void synpred20_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3318:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3318:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3318:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3318:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3318:6: ( ( ruleJvmTypeReference ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3319:1: ( ruleJvmTypeReference )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3319:1: ( ruleJvmTypeReference )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3320:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalSpec7815);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3322:2: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3323:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3323:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3324:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalSpec7824);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSpec

    // $ANTLR start synpred21_InternalSpec
    public final void synpred21_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3622:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3623:1: ( '(' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3623:1: ( '(' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3624:2: '('
        {
        match(input,43,FOLLOW_43_in_synpred21_InternalSpec8386); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSpec

    // $ANTLR start synpred22_InternalSpec
    public final void synpred22_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3643:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3643:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3643:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3643:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3643:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3644:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3644:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==43||LA94_0==72) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3644:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3644:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3645:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3645:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3646:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8438);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3648:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==42) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3648:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred22_InternalSpec8445); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3649:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3650:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3650:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3651:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8452);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop93;
                    }
                } while (true);


                }
                break;

        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3653:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3654:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3654:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3655:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred22_InternalSpec8466); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalSpec

    // $ANTLR start synpred23_InternalSpec
    public final void synpred23_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3722:4: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3723:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3723:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3724:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalSpec8584);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalSpec

    // $ANTLR start synpred24_InternalSpec
    public final void synpred24_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3919:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3919:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3919:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3919:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3919:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3920:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3920:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==43||LA96_0==72) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3920:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3920:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3921:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3921:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3922:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9075);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3924:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==42) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3924:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred24_InternalSpec9082); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3925:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3926:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3926:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3927:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9089);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3929:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3930:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3930:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3931:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred24_InternalSpec9103); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalSpec

    // $ANTLR start synpred25_InternalSpec
    public final void synpred25_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3998:2: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3999:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3999:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4000:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalSpec9219);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalSpec

    // $ANTLR start synpred26_InternalSpec
    public final void synpred26_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4322:2: ( ( ruleXExpression ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4323:1: ( ruleXExpression )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4323:1: ( ruleXExpression )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4324:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalSpec10022);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSpec

    // $ANTLR start synpred27_InternalSpec
    public final void synpred27_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4393:5: ( 'catch' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4393:7: 'catch'
        {
        match(input,71,FOLLOW_71_in_synpred27_InternalSpec10167); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalSpec

    // $ANTLR start synpred28_InternalSpec
    public final void synpred28_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4412:5: ( 'finally' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4412:7: 'finally'
        {
        match(input,70,FOLLOW_70_in_synpred28_InternalSpec10197); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalSpec

    // $ANTLR start synpred30_InternalSpec
    public final void synpred30_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4560:3: ( '.' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4561:2: '.'
        {
        match(input,13,FOLLOW_13_in_synpred30_InternalSpec10544); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalSpec

    // $ANTLR start synpred31_InternalSpec
    public final void synpred31_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4609:2: ( ( () '[' ']' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4609:3: ( () '[' ']' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4609:3: ( () '[' ']' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4609:4: () '[' ']'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4609:4: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4610:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred31_InternalSpec10696); if (state.failed) return ;
        match(input,47,FOLLOW_47_in_synpred31_InternalSpec10700); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalSpec

    // $ANTLR start synpred32_InternalSpec
    public final void synpred32_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4763:4: ( '<' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4763:6: '<'
        {
        match(input,30,FOLLOW_30_in_synpred32_InternalSpec11057); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalSpec

    // Delegated rules

    public final boolean synpred31_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String DFA33_eotS =
        "\76\uffff";
    static final String DFA33_eofS =
        "\1\2\75\uffff";
    static final String DFA33_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA33_maxS =
        "\1\110\1\0\74\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA33_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\26\2\1\1\2\2\1\uffff\16"+
            "\2\1\uffff\13\2",
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
            return "1936:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_1);
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
    static final String DFA32_eotS =
        "\34\uffff";
    static final String DFA32_eofS =
        "\34\uffff";
    static final String DFA32_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA32_maxS =
        "\1\110\2\0\31\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA32_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\5\1\1\11\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5"+
            "\4\uffff\1\2\1\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\3\uffff\3"+
            "\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1957:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_0==RULE_ID) ) {s = 1;}

                        else if ( (LA32_0==43) ) {s = 2;}

                        else if ( (LA32_0==72) && (synpred14_InternalSpec())) {s = 3;}

                        else if ( (LA32_0==46) && (synpred14_InternalSpec())) {s = 4;}

                        else if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_INT)||LA32_0==16||LA32_0==30||(LA32_0>=33 && LA32_0<=34)||LA32_0==38||LA32_0==45||LA32_0==49||LA32_0==51||(LA32_0>=55 && LA32_0<=57)||LA32_0==60||(LA32_0>=62 && LA32_0<=69)) ) {s = 5;}

                        else if ( (LA32_0==44) ) {s = 27;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\76\uffff";
    static final String DFA34_eofS =
        "\1\2\75\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA34_maxS =
        "\1\110\1\0\74\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\30\2\1\1\1\uffff\16\2"+
            "\1\uffff\13\2",
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
            return "2036:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred15_InternalSpec()) ) {s = 61;}

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
    static final String DFA40_eotS =
        "\36\uffff";
    static final String DFA40_eofS =
        "\36\uffff";
    static final String DFA40_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA40_maxS =
        "\1\110\2\0\33\uffff";
    static final String DFA40_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA40_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA40_transitionS = {
            "\2\5\1\1\11\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5"+
            "\4\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\6\5\1\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2319:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA40_0==RULE_ID) ) {s = 1;}

                        else if ( (LA40_0==43) ) {s = 2;}

                        else if ( (LA40_0==72) && (synpred16_InternalSpec())) {s = 3;}

                        else if ( (LA40_0==46) && (synpred16_InternalSpec())) {s = 4;}

                        else if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_INT)||LA40_0==16||LA40_0==30||(LA40_0>=33 && LA40_0<=34)||LA40_0==38||LA40_0==45||LA40_0==47||LA40_0==49||LA40_0==51||(LA40_0>=55 && LA40_0<=60)||(LA40_0>=62 && LA40_0<=69)) ) {s = 5;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\76\uffff";
    static final String DFA63_eofS =
        "\1\2\75\uffff";
    static final String DFA63_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA63_maxS =
        "\1\110\1\0\74\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA63_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\26\2\1\1\2\2\1\uffff\16"+
            "\2\1\uffff\13\2",
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
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3622:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\34\uffff";
    static final String DFA62_eofS =
        "\34\uffff";
    static final String DFA62_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA62_maxS =
        "\1\110\2\0\31\uffff";
    static final String DFA62_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA62_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA62_transitionS = {
            "\2\5\1\1\11\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5"+
            "\4\uffff\1\2\1\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\3\uffff\3"+
            "\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3643:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_0 = input.LA(1);

                         
                        int index62_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_0==RULE_ID) ) {s = 1;}

                        else if ( (LA62_0==43) ) {s = 2;}

                        else if ( (LA62_0==72) && (synpred22_InternalSpec())) {s = 3;}

                        else if ( (LA62_0==46) && (synpred22_InternalSpec())) {s = 4;}

                        else if ( ((LA62_0>=RULE_STRING && LA62_0<=RULE_INT)||LA62_0==16||LA62_0==30||(LA62_0>=33 && LA62_0<=34)||LA62_0==38||LA62_0==45||LA62_0==49||LA62_0==51||(LA62_0>=55 && LA62_0<=57)||LA62_0==60||(LA62_0>=62 && LA62_0<=69)) ) {s = 5;}

                        else if ( (LA62_0==44) ) {s = 27;}

                         
                        input.seek(index62_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index62_2);
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
    static final String DFA64_eotS =
        "\76\uffff";
    static final String DFA64_eofS =
        "\1\2\75\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA64_maxS =
        "\1\110\1\0\74\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA64_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\30\2\1\1\1\uffff\16\2"+
            "\1\uffff\13\2",
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
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3722:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\34\uffff";
    static final String DFA70_eofS =
        "\34\uffff";
    static final String DFA70_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA70_maxS =
        "\1\110\2\0\31\uffff";
    static final String DFA70_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA70_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA70_transitionS = {
            "\2\5\1\1\11\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5"+
            "\4\uffff\1\2\1\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\3\uffff\3"+
            "\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "3919:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_0 = input.LA(1);

                         
                        int index70_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA70_0==RULE_ID) ) {s = 1;}

                        else if ( (LA70_0==43) ) {s = 2;}

                        else if ( (LA70_0==72) && (synpred24_InternalSpec())) {s = 3;}

                        else if ( (LA70_0==46) && (synpred24_InternalSpec())) {s = 4;}

                        else if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_INT)||LA70_0==16||LA70_0==30||(LA70_0>=33 && LA70_0<=34)||LA70_0==38||LA70_0==45||LA70_0==49||LA70_0==51||(LA70_0>=55 && LA70_0<=57)||LA70_0==60||(LA70_0>=62 && LA70_0<=69)) ) {s = 5;}

                        else if ( (LA70_0==44) ) {s = 27;}

                         
                        input.seek(index70_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\76\uffff";
    static final String DFA71_eofS =
        "\1\2\75\uffff";
    static final String DFA71_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA71_maxS =
        "\1\110\1\0\74\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA71_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\30\2\1\1\1\uffff\16\2"+
            "\1\uffff\13\2",
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
            return "3998:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred25_InternalSpec()) ) {s = 61;}

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
    static final String DFA73_eotS =
        "\76\uffff";
    static final String DFA73_eofS =
        "\1\31\75\uffff";
    static final String DFA73_minS =
        "\1\4\30\0\45\uffff";
    static final String DFA73_maxS =
        "\1\110\30\0\45\uffff";
    static final String DFA73_acceptS =
        "\31\uffff\1\2\43\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\45\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\17\1\15\1\1\6\uffff\2\31\1\uffff\1\6\3\31\1\uffff\11\31"+
            "\1\10\2\31\1\4\1\3\3\31\1\2\4\31\1\30\1\31\1\12\1\uffff\2\31"+
            "\1\21\1\31\1\7\3\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13"+
            "\1\14\1\16\1\20\1\25\1\26\1\27\3\31",
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
            return "4322:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_17 = input.LA(1);

                         
                        int index73_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_24);
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
    static final String DFA83_eotS =
        "\76\uffff";
    static final String DFA83_eofS =
        "\1\2\75\uffff";
    static final String DFA83_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA83_maxS =
        "\1\110\1\0\74\uffff";
    static final String DFA83_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA83_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA83_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\11\2\1\1\17\2\1\uffff"+
            "\16\2\1\uffff\13\2",
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
            ""
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "4763:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_1 = input.LA(1);

                         
                        int index83_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index83_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSpec122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSpec143 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleSpec164 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_ruleExampleGroup_in_ruleSpec186 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport270 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard386 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildCard405 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleGroup_in_entryRuleExampleGroup460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleGroup470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleExampleGroup507 = new BitSet(new long[]{0x0000080000010050L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleExampleGroup537 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExampleGroup555 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExampleGroup573 = new BitSet(new long[]{0x0C000000000E0000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleExampleGroup594 = new BitSet(new long[]{0x0C000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleExampleGroup607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_ruleAbstractElement700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExample_in_ruleAbstractElement727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_ruleAbstractElement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleMember844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleContext926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContext943 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleContext960 = new BitSet(new long[]{0x0C000000000E0000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleContext981 = new BitSet(new long[]{0x0C000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleContext994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExample_in_entryRuleExample1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExample1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExample1077 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExample1100 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExample1118 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleExample1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1339 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1355 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1405 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1458 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpSingleAssign1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpMultiAssign1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1753 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1806 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1829 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpOr1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2012 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2065 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2088 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpAnd2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2271 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2324 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2347 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpEquality2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2551 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_26_in_ruleXRelationalExpression2587 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2612 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2673 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2696 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2939 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2992 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3015 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3219 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3272 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3295 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3499 = new BitSet(new long[]{0x0000003800004002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3552 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3575 = new BitSet(new long[]{0x0000003800004002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpMulti3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3828 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4098 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleXCastedExpression4133 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4156 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4251 = new BitSet(new long[]{0x0000030000002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall4300 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4323 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4339 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4361 = new BitSet(new long[]{0x0000030000002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall4447 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4471 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4508 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall4537 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4558 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4571 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4592 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4606 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4631 = new BitSet(new long[]{0x00002B0000002002L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4665 = new BitSet(new long[]{0xD38A784640010070L,0x000000000000013FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4750 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4778 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4791 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4812 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4829 = new BitSet(new long[]{0x0000230000002002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4862 = new BitSet(new long[]{0x0000030000002002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5601 = new BitSet(new long[]{0xDF8AE846400D0070L,0x000000000000013FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5672 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5685 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5706 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5728 = new BitSet(new long[]{0xDF8AA846400D0070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5765 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5879 = new BitSet(new long[]{0xDF8B2846400D0072L,0x000000000000003FL});
    public static final BitSet FOLLOW_48_in_ruleXExpressionInClosure5892 = new BitSet(new long[]{0xDF8A2846400D0072L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6050 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleXShortClosure6063 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6084 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ruleXShortClosure6106 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXParenthesizedExpression6225 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6247 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression6350 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression6362 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6383 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression6395 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6416 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6437 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6553 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6594 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6606 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6630 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6642 = new BitSet(new long[]{0x0050080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6663 = new BitSet(new long[]{0x0070080000020040L,0x0000000000000100L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6677 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6689 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6710 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6816 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCasePart6830 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6851 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6865 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXForLoopExpression6978 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXForLoopExpression6990 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7011 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXForLoopExpression7023 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7044 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression7056 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXWhileExpression7169 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXWhileExpression7181 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7202 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression7214 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression7327 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7348 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXDoWhileExpression7360 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXDoWhileExpression7372 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7393 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression7497 = new BitSet(new long[]{0xDF8A2846400F0070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7519 = new BitSet(new long[]{0xDF8B2846400F0070L,0x000000000000003FL});
    public static final BitSet FOLLOW_48_in_ruleXBlockExpression7532 = new BitSet(new long[]{0xDF8A2846400F0070L,0x000000000000003FL});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7766 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration7797 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7845 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7866 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7895 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleXVariableDeclaration7909 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8024 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8138 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8262 = new BitSet(new long[]{0x1000000040000040L});
    public static final BitSet FOLLOW_30_in_ruleXFeatureCall8276 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8297 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall8310 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8331 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall8345 = new BitSet(new long[]{0x1000000040000040L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8370 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8404 = new BitSet(new long[]{0xD38A784640010070L,0x000000000000013FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8489 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8517 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall8530 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8551 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall8568 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleIdOrSuper8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8820 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleStaticQualifier8838 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXConstructorCall8935 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8958 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_30_in_ruleXConstructorCall8971 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8992 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall9005 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9026 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall9040 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall9054 = new BitSet(new long[]{0xD38A784640010070L,0x000000000000013FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9126 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9154 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall9167 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9188 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall9205 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXBooleanLiteral9330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXBooleanLiteral9354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXNullLiteral9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXTypeLiteral9756 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXTypeLiteral9768 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9791 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral9803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXThrowExpression9895 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXReturnExpression10008 = new BitSet(new long[]{0xD38A284640010072L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression10132 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10153 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10183 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression10205 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression10249 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXCatchClause10363 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXCatchClause10376 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10397 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause10409 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10525 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName10553 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10576 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10681 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleJvmTypeReference10719 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleJvmTypeReference10731 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10846 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10867 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef10880 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10901 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleXFunctionTypeRef10929 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11044 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleJvmParameterizedTypeReference11065 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11087 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_42_in_ruleJvmParameterizedTypeReference11100 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11121 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmWildcardTypeReference11348 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBound11482 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBoundAnded11586 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleJvmLowerBound11690 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSpec1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalSpec1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalSpec2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalSpec2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred5_InternalSpec2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalSpec2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalSpec2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalSpec3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalSpec3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred10_InternalSpec4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred11_InternalSpec4268 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalSpec4277 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalSpec4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred12_InternalSpec4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalSpec4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalSpec4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred13_InternalSpec4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4699 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalSpec4706 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4713 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred14_InternalSpec4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalSpec4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5618 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred16_InternalSpec5625 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5632 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalSpec5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalSpec6429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalSpec6569 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred19_InternalSpec6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalSpec7815 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalSpec7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred21_InternalSpec8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8438 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred22_InternalSpec8445 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8452 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred22_InternalSpec8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalSpec8584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9075 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred24_InternalSpec9082 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9089 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred24_InternalSpec9103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalSpec9219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalSpec10022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred27_InternalSpec10167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred28_InternalSpec10197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred30_InternalSpec10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred31_InternalSpec10696 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_synpred31_InternalSpec10700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred32_InternalSpec11057 = new BitSet(new long[]{0x0000000000000002L});

}