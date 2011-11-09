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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.'", "'*'", "'describes'", "'{'", "'}'", "'='", "'context'", "'it'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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
        	return "SpecFile";	
       	}
       	
       	@Override
       	protected SpecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSpecFile"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:67:1: entryRuleSpecFile returns [EObject current=null] : iv_ruleSpecFile= ruleSpecFile EOF ;
    public final EObject entryRuleSpecFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecFile = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:68:2: (iv_ruleSpecFile= ruleSpecFile EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:69:2: iv_ruleSpecFile= ruleSpecFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecFileRule()); 
            }
            pushFollow(FOLLOW_ruleSpecFile_in_entryRuleSpecFile75);
            iv_ruleSpecFile=ruleSpecFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecFile85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecFile"


    // $ANTLR start "ruleSpecFile"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:76:1: ruleSpecFile returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* ) ;
    public final EObject ruleSpecFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:79:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSpecFile122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSpecFileAccess().getPackageKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:84:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:86:3: lv_packageName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSpecFileAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSpecFile143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSpecFileRule());
              	        }
                     		set(
                     			current, 
                     			"packageName",
                      		lv_packageName_1_0, 
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
            	       
            	      	        newCompositeNode(grammarAccess.getSpecFileAccess().getImportsImportParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleSpecFile164);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecFileRule());
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
            	       
            	      	        newCompositeNode(grammarAccess.getSpecFileAccess().getElementsExampleGroupParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExampleGroup_in_ruleSpecFile186);
            	    lv_elements_3_0=ruleExampleGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecFileRule());
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
    // $ANTLR end "ruleSpecFile"


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

                if ( (LA6_0==RULE_ID||(LA6_0>=19 && LA6_0<=20)||LA6_0==43||LA6_0==72) ) {
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
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case 43:
            case 72:
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:385:1: ruleMember returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:388:28: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:389:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:389:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:389:2: ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:389:2: ( (lv_type_0_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:390:1: (lv_type_0_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:390:1: (lv_type_0_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:391:3: lv_type_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMemberAccess().getTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember845);
            lv_type_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMemberRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:407:2: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:408:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:408:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:409:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMemberAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleMember866);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMemberRule());
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:425:2: (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:425:4: otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMember879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:429:1: ( (lv_right_3_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:430:1: (lv_right_3_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:430:1: (lv_right_3_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:431:3: lv_right_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getRightXExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleMember900);
                    lv_right_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleContext"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:455:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:456:2: (iv_ruleContext= ruleContext EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:457:2: iv_ruleContext= ruleContext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextRule()); 
            }
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext938);
            iv_ruleContext=ruleContext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContext; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext948); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:464:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:467:28: ( (otherlv_0= 'context' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:468:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:468:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:468:3: otherlv_0= 'context' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleContext985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:472:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:473:1: (lv_name_1_0= RULE_STRING )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:473:1: (lv_name_1_0= RULE_STRING )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:474:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContext1002); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleContext1019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:494:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=19 && LA9_0<=20)||LA9_0==43||LA9_0==72) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:495:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:495:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:496:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContextAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleContext1040);
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
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleContext1053); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:524:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:525:2: (iv_ruleExample= ruleExample EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:526:2: iv_ruleExample= ruleExample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleRule()); 
            }
            pushFollow(FOLLOW_ruleExample_in_entryRuleExample1089);
            iv_ruleExample=ruleExample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExample; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExample1099); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:533:1: ruleExample returns [EObject current=null] : (otherlv_0= 'it' ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:536:28: ( (otherlv_0= 'it' ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:537:1: (otherlv_0= 'it' ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:537:1: (otherlv_0= 'it' ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:537:3: otherlv_0= 'it' ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleExample1136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExampleAccess().getItKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:541:1: ( ( ruleValidID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:542:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:542:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:543:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExampleAccess().getFeatureJvmIdentifiableElementCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleExample1159);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:556:3: ( (lv_name_2_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:557:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:557:1: (lv_name_2_0= RULE_STRING )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:558:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExample1177); if (state.failed) return current;
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:574:3: ( (lv_body_3_0= ruleXBlockExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:575:1: (lv_body_3_0= ruleXBlockExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:575:1: (lv_body_3_0= ruleXBlockExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:576:3: lv_body_3_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExampleAccess().getBodyXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleExample1204);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:600:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:601:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:602:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1240);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1250); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:609:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:612:28: (this_XAssignment_0= ruleXAssignment )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:614:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1296);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:630:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:631:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:632:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1330);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1340); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:639:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:642:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:643:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:643:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==18) ) {
                    alt13=1;
                }
                else if ( (LA13_1==EOF||(LA13_1>=RULE_STRING && LA13_1<=RULE_ID)||(LA13_1>=13 && LA13_1<=14)||(LA13_1>=16 && LA13_1<=17)||(LA13_1>=19 && LA13_1<=45)||(LA13_1>=47 && LA13_1<=72)) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_INT)||LA13_0==16||LA13_0==30||(LA13_0>=33 && LA13_0<=34)||LA13_0==38||LA13_0==43||LA13_0==45||LA13_0==49||LA13_0==51||(LA13_0>=55 && LA13_0<=57)||LA13_0==60||(LA13_0>=62 && LA13_0<=69)) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:643:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:643:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:643:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:643:3: ()
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:644:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:649:2: ( ( ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:650:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:650:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:651:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1398);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1414);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:672:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:673:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:673:1: (lv_value_3_0= ruleXAssignment )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:674:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1434);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:691:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:691:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:692:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1464);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:700:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==21) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred1_InternalSpec()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:700:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:700:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:700:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:705:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:705:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:705:7: ()
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:706:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:711:2: ( ( ruleOpMultiAssign ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:712:1: ( ruleOpMultiAssign )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:712:1: ( ruleOpMultiAssign )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:713:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1517);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:726:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:727:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:727:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:728:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1540);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:752:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:753:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:754:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1580);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1591); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:761:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:764:28: (kw= '=' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:766:2: kw= '='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpSingleAssign1628); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:779:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:780:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:781:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1668);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1679); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:788:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:791:28: (kw= '+=' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:793:2: kw= '+='
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpMultiAssign1716); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:806:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:807:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:808:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1755);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1765); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:815:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:818:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:819:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:819:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:820:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1812);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:828:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred2_InternalSpec()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:828:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:828:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:828:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:833:6: ( () ( ( ruleOpOr ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:833:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:833:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:834:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:839:2: ( ( ruleOpOr ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:840:1: ( ruleOpOr )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:840:1: ( ruleOpOr )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:841:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1865);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:854:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:855:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:855:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:856:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1888);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:880:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:881:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:882:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1927);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1938); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:889:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:892:28: (kw= '||' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:894:2: kw= '||'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpOr1975); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:907:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:908:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:909:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2014);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2024); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:916:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:919:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:920:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:920:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:921:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2071);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:929:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred3_InternalSpec()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:929:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:929:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:929:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:934:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:934:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:934:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:935:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:940:2: ( ( ruleOpAnd ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:941:1: ( ruleOpAnd )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:941:1: ( ruleOpAnd )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:942:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2124);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:955:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:956:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:956:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:957:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2147);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:981:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:982:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:983:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2186);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2197); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:990:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:993:28: (kw= '&&' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:995:2: kw= '&&'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpAnd2234); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1008:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1009:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1010:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2273);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2283); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1017:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1020:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1021:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1021:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1022:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2330);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1030:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred4_InternalSpec()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==25) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred4_InternalSpec()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1030:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1030:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1030:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1035:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1035:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1035:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1036:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1041:2: ( ( ruleOpEquality ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1042:1: ( ruleOpEquality )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1042:1: ( ruleOpEquality )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1043:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2383);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1056:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1057:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1057:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1058:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2406);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1082:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1083:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1084:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2445);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2456); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1091:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1094:28: ( (kw= '==' | kw= '!=' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1095:1: (kw= '==' | kw= '!=' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1095:1: (kw= '==' | kw= '!=' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            else if ( (LA17_0==25) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1096:2: kw= '=='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality2494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1103:2: kw= '!='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpEquality2513); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1116:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1117:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1118:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2553);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2563); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1125:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1128:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1129:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1129:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1130:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2610);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop18:
            do {
                int alt18=3;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred5_InternalSpec()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA18_6 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt18=2;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:5: ( () otherlv_2= 'instanceof' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:6: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1141:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXRelationalExpression2646); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1150:3: ( ( ruleQualifiedName ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1151:1: ( ruleQualifiedName )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1151:1: ( ruleQualifiedName )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1152:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2671);
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
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1171:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1171:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1171:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1172:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1177:2: ( ( ruleOpCompare ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1178:1: ( ruleOpCompare )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1178:1: ( ruleOpCompare )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1179:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2732);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1192:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1193:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1193:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1194:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2755);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1218:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1219:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1220:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2795);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2806); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1227:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1230:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1231:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1231:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt19=1;
                }
                break;
            case 28:
                {
                alt19=2;
                }
                break;
            case 29:
                {
                alt19=3;
                }
                break;
            case 30:
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1232:2: kw= '>='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1239:2: kw= '<='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1246:2: kw= '>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1253:2: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2901); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1266:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1267:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1268:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2941);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2951); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1275:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1278:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1279:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1279:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1280:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2998);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1288:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred7_InternalSpec()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==32) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred7_InternalSpec()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1288:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1288:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1288:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1293:6: ( () ( ( ruleOpOther ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1293:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1293:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1294:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1299:2: ( ( ruleOpOther ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1300:1: ( ruleOpOther )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1300:1: ( ruleOpOther )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1301:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3051);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1314:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1315:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1315:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1316:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3074);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1340:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1341:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1342:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3113);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3124); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1349:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1352:28: ( (kw= '->' | kw= '..' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1353:1: (kw= '->' | kw= '..' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1353:1: (kw= '->' | kw= '..' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==32) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1354:2: kw= '->'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:2: kw= '..'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3181); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1374:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1375:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1376:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3221);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3231); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1383:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1386:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1387:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1387:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1388:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3278);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1396:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred8_InternalSpec()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==34) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred8_InternalSpec()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1396:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1396:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1396:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1401:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1401:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1401:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1402:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1407:2: ( ( ruleOpAdd ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1408:1: ( ruleOpAdd )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1408:1: ( ruleOpAdd )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1409:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3331);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1422:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1423:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1423:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1424:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3354);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1448:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1449:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1450:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3393);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3404); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1457:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1460:28: ( (kw= '+' | kw= '-' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1461:1: (kw= '+' | kw= '-' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1461:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            else if ( (LA23_0==34) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1462:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd3442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1469:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd3461); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1482:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1483:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1484:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3501);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3511); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1491:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1494:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1495:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1495:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1496:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3558);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1504:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1504:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1504:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1504:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1509:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1509:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1509:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1510:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1515:2: ( ( ruleOpMulti ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1516:1: ( ruleOpMulti )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1516:1: ( ruleOpMulti )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1517:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3611);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1530:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1531:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1531:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1532:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3634);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1556:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1557:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1558:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3673);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3684); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1565:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1568:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1569:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1569:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 14:
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1570:2: kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleOpMulti3722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1577:2: kw= '**'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1584:2: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1591:2: kw= '%'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3779); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1604:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1605:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1606:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3819);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3829); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1613:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1616:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1617:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1617:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=33 && LA26_0<=34)||LA26_0==38) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||LA26_0==16||LA26_0==30||LA26_0==43||LA26_0==45||LA26_0==49||LA26_0==51||(LA26_0>=55 && LA26_0<=57)||LA26_0==60||(LA26_0>=62 && LA26_0<=69)) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1617:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1617:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1617:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1617:3: ()
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1618:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1623:2: ( ( ruleOpUnary ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1624:1: ( ruleOpUnary )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1624:1: ( ruleOpUnary )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1625:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3887);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1638:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1639:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1639:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1640:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3908);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1658:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3937);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1674:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1675:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1676:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3973);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3984); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1683:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1686:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1687:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1687:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt27=1;
                }
                break;
            case 34:
                {
                alt27=2;
                }
                break;
            case 33:
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1688:2: kw= '!'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary4022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1695:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary4041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1702:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary4060); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1715:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1716:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1717:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4100);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4110); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1724:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1727:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1728:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1728:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1729:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4157);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1737:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred10_InternalSpec()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1737:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1737:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1737:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1739:5: ( () otherlv_2= 'as' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1739:6: () otherlv_2= 'as'
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1739:6: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1740:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXCastedExpression4192); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1749:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1750:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1750:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1751:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4215);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1775:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1776:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1777:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4253);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4263); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1784:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1787:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1788:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1788:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1789:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4310);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop36:
            do {
                int alt36=3;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred11_InternalSpec()) ) {
                        alt36=1;
                    }
                    else if ( (synpred12_InternalSpec()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred12_InternalSpec()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred12_InternalSpec()) ) {
                        alt36=2;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1803:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1803:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1803:26: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1804:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall4359); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1813:1: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1814:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1814:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1815:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4382);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4398);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1836:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1837:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1837:1: (lv_value_5_0= ruleXAssignment )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1838:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4420);
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
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1855:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1855:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1855:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1855:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1855:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1871:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1871:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1871:8: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1872:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1877:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 13:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 41:
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
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1877:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall4506); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1882:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1882:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1883:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1883:1: (lv_nullSafe_8_0= '?.' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1884:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4530); if (state.failed) return current;
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
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1898:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1898:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1899:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1899:1: (lv_spreading_9_0= '*.' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1900:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4567); if (state.failed) return current;
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1913:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==30) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1913:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleXMemberFeatureCall4596); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1917:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1918:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1918:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1919:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4617);
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

            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1935:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==42) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1935:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4630); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1939:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1940:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1940:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1941:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4651);
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

            	            otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4665); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1961:3: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1962:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1962:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1963:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4690);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1976:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1976:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1976:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1976:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1983:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1984:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4724); if (state.failed) return current;
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

            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1997:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1997:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1997:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1997:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2014:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2015:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4809);
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
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2032:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2032:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2032:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2032:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2033:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2033:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2034:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4837);
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

            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2050:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==42) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2050:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4850); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2054:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2055:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2055:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2056:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4871);
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

            	            otherlv_21=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4888); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2076:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2076:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2081:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2082:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4921);
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
            	    break loop36;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2106:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2107:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2108:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4961);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4971); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2115:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2118:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2119:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2119:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt37=13;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt37=1;
                }
                break;
            case 16:
                {
                alt37=2;
                }
                break;
            case 51:
                {
                alt37=3;
                }
                break;
            case RULE_ID:
            case 30:
            case 60:
                {
                alt37=4;
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
                alt37=5;
                }
                break;
            case 49:
                {
                alt37=6;
                }
                break;
            case 55:
                {
                alt37=7;
                }
                break;
            case 56:
                {
                alt37=8;
                }
                break;
            case 57:
                {
                alt37=9;
                }
                break;
            case 67:
                {
                alt37=10;
                }
                break;
            case 68:
                {
                alt37=11;
                }
                break;
            case 69:
                {
                alt37=12;
                }
                break;
            case 43:
                {
                alt37=13;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2120:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5018);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2130:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5045);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2140:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5072);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2150:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5099);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2160:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5126);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2170:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5153);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2180:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5180);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2190:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5207);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2200:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5234);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2210:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5261);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2220:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5288);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2230:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5315);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2240:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5342);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2256:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2257:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2258:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5377);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5387); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2265:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2268:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2269:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2269:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt38=1;
                }
                break;
            case 63:
            case 64:
                {
                alt38=2;
                }
                break;
            case RULE_INT:
                {
                alt38=3;
                }
                break;
            case 65:
                {
                alt38=4;
                }
                break;
            case RULE_STRING:
                {
                alt38=5;
                }
                break;
            case 66:
                {
                alt38=6;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5434);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2280:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5461);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2290:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5488);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2300:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5515);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2310:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5542);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2320:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5569);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2336:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2337:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2338:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5604);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5614); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2345:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2348:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2349:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2349:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2349:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2349:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2350:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5660); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2359:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2359:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2374:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2374:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2374:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==43||LA40_0==72) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2374:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2374:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2375:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2375:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2376:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5731);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2392:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==42) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2392:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5744); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2396:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2397:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2397:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2398:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5765);
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
                            	    break loop39;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2414:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2415:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2415:1: (lv_explicitSyntax_5_0= '|' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2416:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5787); if (state.failed) return current;
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2429:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2430:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2430:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2431:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5824);
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

            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5836); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2459:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2460:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2461:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5872);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5882); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2468:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2471:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2472:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2472:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2472:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2472:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2473:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2478:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||LA43_0==16||LA43_0==30||(LA43_0>=33 && LA43_0<=34)||LA43_0==38||LA43_0==43||LA43_0==45||LA43_0==49||LA43_0==51||(LA43_0>=55 && LA43_0<=60)||(LA43_0>=62 && LA43_0<=69)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2478:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2478:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2479:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2479:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2480:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5938);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2496:2: (otherlv_2= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==48) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2496:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXExpressionInClosure5951); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2508:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2509:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2510:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5991);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6001); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2517:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2520:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2521:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2521:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2521:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2521:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2521:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2537:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2537:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2537:7: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2538:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2543:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==43||LA45_0==72) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2543:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2543:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2544:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2544:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2545:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6109);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2561:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==42) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2561:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXShortClosure6122); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2565:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2566:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2566:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2567:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6143);
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
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2583:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2584:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2584:1: (lv_explicitSyntax_4_0= '|' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2585:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,46,FOLLOW_46_in_ruleXShortClosure6165); if (state.failed) return current;
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2598:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2599:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2599:1: (lv_expression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2600:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6201);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2624:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2625:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2626:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6237);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6247); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2633:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2636:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2637:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2637:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2637:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleXParenthesizedExpression6284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6306);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression6317); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2662:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2663:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2664:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6353);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6363); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2671:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2674:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2675:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2675:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2675:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2675:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2676:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression6409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression6421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2689:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2690:1: (lv_if_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2690:1: (lv_if_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2691:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6442);
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

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression6454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2711:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2712:1: (lv_then_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2712:1: (lv_then_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2713:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6475);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2729:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred18_InternalSpec()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2729:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2729:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2729:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2734:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2735:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2735:1: (lv_else_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2736:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6518);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2760:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2761:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2762:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6556);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6566); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2769:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2772:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2773:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2773:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2773:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2773:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2774:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2783:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==52) && (synpred19_InternalSpec())) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2783:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2788:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2788:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2788:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2789:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2789:1: (lv_localVarName_2_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2790:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6653);
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

                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2810:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2811:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2811:1: (lv_switch_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2812:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6689);
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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2832:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID||LA48_0==43||LA48_0==52||LA48_0==54||LA48_0==72) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2833:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2833:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2834:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6722);
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
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2850:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==53) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2850:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2858:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2859:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2859:1: (lv_default_9_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2860:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6769);
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

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6783); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2888:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2889:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2890:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6819);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6829); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2897:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2900:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2901:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2901:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2901:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2901:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==43||LA50_0==72) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2902:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2902:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2903:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6875);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2919:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2919:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXCasePart6889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2923:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2924:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2924:1: (lv_case_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2925:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6910);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2945:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2946:1: (lv_then_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2946:1: (lv_then_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2947:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6945);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2971:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2972:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2973:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6981);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6991); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2980:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2983:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2984:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2984:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2984:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2984:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2985:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXForLoopExpression7037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXForLoopExpression7049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2998:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2999:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2999:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3000:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7070);
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

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXForLoopExpression7082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3020:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3021:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3021:1: (lv_forExpression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3022:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7103);
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

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression7115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3042:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3043:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3043:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3044:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7136);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3068:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3069:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3070:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7172);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7182); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3077:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3080:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3081:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3081:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3081:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3081:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3082:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXWhileExpression7228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXWhileExpression7240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3095:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3096:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3096:1: (lv_predicate_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3097:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7261);
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

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression7273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3117:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3118:1: (lv_body_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3118:1: (lv_body_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3119:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7294);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3143:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3144:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3145:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7330);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7340); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3152:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3155:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3156:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3156:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3156:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3156:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3157:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression7386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3166:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3167:1: (lv_body_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3167:1: (lv_body_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3168:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7407);
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

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXDoWhileExpression7419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXDoWhileExpression7431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3192:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3193:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3193:1: (lv_predicate_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3194:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7452);
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

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression7464); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3222:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3223:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3224:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7500);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7510); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3231:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3234:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3235:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3235:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3235:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3235:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3236:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression7556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3245:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)||LA53_0==16||LA53_0==30||(LA53_0>=33 && LA53_0<=34)||LA53_0==38||LA53_0==43||LA53_0==45||LA53_0==49||LA53_0==51||(LA53_0>=55 && LA53_0<=60)||(LA53_0>=62 && LA53_0<=69)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3245:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3245:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3246:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3246:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3247:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7578);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3263:2: (otherlv_3= ';' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==48) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3263:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXBlockExpression7591); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7607); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3279:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3280:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3281:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7643);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7653); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3288:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3291:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3292:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3292:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=58 && LA54_0<=59)) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)||LA54_0==16||LA54_0==30||(LA54_0>=33 && LA54_0<=34)||LA54_0==38||LA54_0==43||LA54_0==45||LA54_0==49||LA54_0==51||(LA54_0>=55 && LA54_0<=57)||LA54_0==60||(LA54_0>=62 && LA54_0<=69)) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3293:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7700);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3303:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7727);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3319:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3320:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3321:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7762);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7772); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3328:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3331:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3333:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3338:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==58) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3338:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3338:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3339:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3339:1: (lv_writeable_1_0= 'var' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3340:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7825); if (state.failed) return current;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3354:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration7856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3358:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred20_InternalSpec()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA56_0==43) && (synpred20_InternalSpec())) {
                alt56=1;
            }
            else if ( (LA56_0==72) && (synpred20_InternalSpec())) {
                alt56=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3358:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3358:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3358:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3366:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3366:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3366:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3367:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3367:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3368:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7904);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3384:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3385:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3385:1: (lv_name_4_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3386:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7925);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3403:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3403:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3404:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3404:1: (lv_name_5_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3405:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7954);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3421:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==18) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3421:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration7968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3425:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3426:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3426:1: (lv_right_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3427:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7989);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3451:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3452:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3453:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8027);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8037); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3460:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3463:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3464:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3464:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3464:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3464:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==RULE_ID||LA58_1==13||LA58_1==30||LA58_1==45) ) {
                    alt58=1;
                }
            }
            else if ( (LA58_0==43||LA58_0==72) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3465:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3465:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3466:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8083);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3482:3: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3483:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3483:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3484:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8105);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3508:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3509:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3510:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8141);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8151); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3517:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3520:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3521:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3521:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3521:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3521:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3522:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3522:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3523:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8197);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3539:2: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3540:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3540:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3541:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8218);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3565:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3566:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3567:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8254);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8264); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3574:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3577:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3578:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3578:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3578:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3578:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3579:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3584:2: ( ( ruleStaticQualifier ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==61) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3585:1: ( ruleStaticQualifier )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3585:1: ( ruleStaticQualifier )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3586:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8321);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3599:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==30) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3599:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXFeatureCall8335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3603:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3604:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3604:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3605:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8356);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3621:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==42) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3621:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall8369); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3625:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3626:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3626:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3627:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8390);
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
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall8404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3647:3: ( ( ruleIdOrSuper ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3648:1: ( ruleIdOrSuper )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3648:1: ( ruleIdOrSuper )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3649:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8429);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3662:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3662:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3662:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3662:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3669:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3670:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8463); if (state.failed) return current;
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3683:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt63=3;
                    alt63 = dfa63.predict(input);
                    switch (alt63) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3683:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3683:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3683:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3700:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3701:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8548);
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
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3718:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3718:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3718:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3718:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3719:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3719:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3720:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8576);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3736:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==42) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3736:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall8589); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3740:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3741:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3741:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3742:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8610);
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
                            	    break loop62;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall8627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3762:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3762:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3767:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3768:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8660);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3792:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3793:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3794:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8698);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8709); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3801:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3804:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3805:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3805:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            else if ( (LA66_0==60) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3806:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8756);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3818:2: kw= 'super'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleIdOrSuper8780); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3831:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3832:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3833:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8821);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8832); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3840:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3843:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3844:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3844:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID) ) {
                    int LA67_2 = input.LA(2);

                    if ( (LA67_2==61) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3845:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8879);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,61,FOLLOW_61_in_ruleStaticQualifier8897); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3869:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3870:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3871:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8938);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8948); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3878:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3881:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3882:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3882:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3882:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3882:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3883:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXConstructorCall8994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3892:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3893:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3893:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3894:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9017);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3907:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==30) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3907:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleXConstructorCall9030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3911:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3912:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3912:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3913:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9051);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3929:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==42) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3929:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall9064); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3933:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3934:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3934:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3935:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9085);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall9099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall9113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt71=3;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3976:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3977:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9185);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3994:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3994:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3994:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3994:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3995:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3995:1: (lv_arguments_10_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3996:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9213);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4012:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==42) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4012:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall9226); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4016:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4017:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4017:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4018:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9247);
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
                    	    break loop70;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall9264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4038:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4038:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4043:1: (lv_arguments_14_0= ruleXClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4044:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9295);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4068:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4069:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4070:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9332);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9342); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4077:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4080:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4081:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4081:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4081:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4081:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4082:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4087:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==63) ) {
                alt73=1;
            }
            else if ( (LA73_0==64) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4087:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXBooleanLiteral9389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4092:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4092:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4093:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4093:1: (lv_isTrue_2_0= 'true' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4094:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,64,FOLLOW_64_in_ruleXBooleanLiteral9413); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4115:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4116:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4117:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9463);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9473); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4124:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4127:28: ( ( () otherlv_1= 'null' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4128:1: ( () otherlv_1= 'null' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4128:1: ( () otherlv_1= 'null' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4128:2: () otherlv_1= 'null'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4128:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4129:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXNullLiteral9519); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4146:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4147:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4148:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9555);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9565); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4155:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4158:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4159:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4159:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4159:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4159:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4160:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4165:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4166:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4166:1: (lv_value_1_0= RULE_INT )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4167:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9616); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4191:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4192:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4193:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9657);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9667); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4200:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4203:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4204:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4204:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4204:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4204:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4205:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4210:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4211:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4211:1: (lv_value_1_0= RULE_STRING )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4212:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9718); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4236:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4237:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4238:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9759);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9769); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4245:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4248:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4249:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4249:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4249:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4249:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4250:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXTypeLiteral9815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXTypeLiteral9827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4263:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4264:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4264:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4265:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9850);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral9862); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4290:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4291:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4292:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9898);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9908); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4299:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4302:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4303:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4303:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4303:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4303:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4304:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXThrowExpression9954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4313:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4314:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4314:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4315:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9975);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4339:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4340:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4341:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10011);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10021); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4348:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4351:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4352:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4352:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4352:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4352:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4353:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXReturnExpression10067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4362:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4362:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4367:1: (lv_expression_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4368:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10098);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4392:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4393:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4394:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10135);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10145); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4401:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4404:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4405:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4405:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4405:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4405:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4406:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression10191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4415:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4416:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4416:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4417:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10212);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4433:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==71) ) {
                alt77=1;
            }
            else if ( (LA77_0==70) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4433:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4433:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4433:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4433:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==71) ) {
                            int LA75_2 = input.LA(2);

                            if ( (synpred27_InternalSpec()) ) {
                                alt75=1;
                            }


                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4433:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4435:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4436:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10242);
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
                    	    if ( cnt75 >= 1 ) break loop75;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4452:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==70) ) {
                        int LA76_1 = input.LA(2);

                        if ( (synpred28_InternalSpec()) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4452:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4452:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4452:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression10264); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4457:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4458:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4458:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4459:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10286);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4476:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4476:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4476:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression10308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4480:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4481:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4481:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4482:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10329);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4506:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4507:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4508:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10367);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10377); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4515:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4518:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4519:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4519:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4519:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4519:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4519:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleXCatchClause10422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXCatchClause10435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4528:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4529:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4529:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4530:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10456);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause10468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4550:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4551:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4551:1: (lv_expression_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4552:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10489);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4576:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4577:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4578:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10526);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10537); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4585:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4588:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4589:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4589:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4590:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10584);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4600:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==13) ) {
                    int LA78_2 = input.LA(2);

                    if ( (LA78_2==RULE_ID) ) {
                        int LA78_3 = input.LA(3);

                        if ( (synpred30_InternalSpec()) ) {
                            alt78=1;
                        }


                    }


                }


                switch (alt78) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4600:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4600:2: ( ( '.' )=>kw= '.' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4600:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName10612); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10635);
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
            	    break loop78;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4627:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4628:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4629:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10682);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10692); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4636:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4639:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4640:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4640:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                alt80=1;
            }
            else if ( (LA80_0==43||LA80_0==72) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4640:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4640:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4641:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10740);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4649:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==45) ) {
                            int LA79_2 = input.LA(2);

                            if ( (LA79_2==47) ) {
                                int LA79_3 = input.LA(3);

                                if ( (synpred31_InternalSpec()) ) {
                                    alt79=1;
                                }


                            }


                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4649:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4652:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4652:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4652:6: ()
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4653:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleJvmTypeReference10778); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleJvmTypeReference10790); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4668:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10822);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4684:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4685:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4686:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10857);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10867); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4693:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4696:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4697:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4697:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4697:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4697:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==43) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4697:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10905); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4701:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4702:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4702:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4703:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10926);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4719:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==42) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4719:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef10939); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4723:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4724:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4724:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4725:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10960);
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
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleXFunctionTypeRef10988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4749:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4750:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4750:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4751:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11009);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4775:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4776:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4777:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11045);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11055); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4784:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4787:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4788:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4788:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4788:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4788:2: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4789:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4789:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4790:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11103);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4803:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4803:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4803:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4803:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleJvmParameterizedTypeReference11124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4808:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4809:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4809:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4810:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11146);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4826:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==42) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4826:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleJvmParameterizedTypeReference11159); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4830:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4831:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4831:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4832:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11180);
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
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference11194); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4860:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4861:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4862:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11232);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11242); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4869:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4872:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4873:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4873:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID||LA85_0==43||LA85_0==72) ) {
                alt85=1;
            }
            else if ( (LA85_0==73) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4874:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11289);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4884:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11316);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4900:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4901:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4902:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11351);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11361); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4909:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4912:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4913:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4913:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4913:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4913:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4914:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleJvmWildcardTypeReference11407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4923:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==74) ) {
                alt86=1;
            }
            else if ( (LA86_0==60) ) {
                alt86=2;
            }
            switch (alt86) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4923:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4923:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4924:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4924:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4925:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11429);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4942:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4942:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4943:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4943:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4944:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11456);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4968:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4969:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4970:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11494);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11504); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4977:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4980:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4981:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4981:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4981:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBound11541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4985:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4986:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4986:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4987:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11562);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5011:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5012:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5013:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11598);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11608); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5020:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5023:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5024:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5024:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5024:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBoundAnded11645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5028:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5029:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5029:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5030:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11666);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5054:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5055:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5056:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11702);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11712); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5063:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5066:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5067:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5067:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5067:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleJvmLowerBound11749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5071:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5072:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5072:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5073:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11770);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5099:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5100:2: (iv_ruleValidID= ruleValidID EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5101:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11809);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11820); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5108:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5111:28: (this_ID_0= RULE_ID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5112:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11859); if (state.failed) return current;
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:700:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:700:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:700:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:700:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:700:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:701:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:701:2: ( ( ruleOpMultiAssign ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:702:1: ( ruleOpMultiAssign )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:702:1: ( ruleOpMultiAssign )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:703:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSpec1485);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:828:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:828:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:828:4: ( () ( ( ruleOpOr ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:828:5: () ( ( ruleOpOr ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:828:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:829:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:829:2: ( ( ruleOpOr ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:830:1: ( ruleOpOr )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:830:1: ( ruleOpOr )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:831:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalSpec1833);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:929:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:929:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:929:4: ( () ( ( ruleOpAnd ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:929:5: () ( ( ruleOpAnd ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:929:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:930:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:930:2: ( ( ruleOpAnd ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:931:1: ( ruleOpAnd )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:931:1: ( ruleOpAnd )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:932:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalSpec2092);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1030:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1030:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1030:4: ( () ( ( ruleOpEquality ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1030:5: () ( ( ruleOpEquality ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1030:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1031:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1031:2: ( ( ruleOpEquality ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1032:1: ( ruleOpEquality )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1032:1: ( ruleOpEquality )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1033:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalSpec2351);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:4: ( ( () 'instanceof' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:5: ( () 'instanceof' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:5: ( () 'instanceof' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:6: () 'instanceof'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1138:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1139:1: 
        {
        }

        match(input,26,FOLLOW_26_in_synpred5_InternalSpec2627); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSpec

    // $ANTLR start synpred6_InternalSpec
    public final void synpred6_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:9: ( () ( ( ruleOpCompare ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:10: () ( ( ruleOpCompare ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:10: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1167:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1167:2: ( ( ruleOpCompare ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1168:1: ( ruleOpCompare )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1168:1: ( ruleOpCompare )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1169:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalSpec2700);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1288:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1288:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1288:4: ( () ( ( ruleOpOther ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1288:5: () ( ( ruleOpOther ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1288:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1289:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1289:2: ( ( ruleOpOther ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1290:1: ( ruleOpOther )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1290:1: ( ruleOpOther )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1291:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalSpec3019);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1396:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1396:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1396:4: ( () ( ( ruleOpAdd ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1396:5: () ( ( ruleOpAdd ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1396:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1397:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1397:2: ( ( ruleOpAdd ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1398:1: ( ruleOpAdd )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1398:1: ( ruleOpAdd )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1399:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalSpec3299);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1504:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1504:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1504:4: ( () ( ( ruleOpMulti ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1504:5: () ( ( ruleOpMulti ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1504:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1505:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1505:2: ( ( ruleOpMulti ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1506:1: ( ruleOpMulti )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1506:1: ( ruleOpMulti )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1507:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalSpec3579);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1737:3: ( ( () 'as' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1737:4: ( () 'as' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1737:4: ( () 'as' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1737:5: () 'as'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1737:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1738:1: 
        {
        }

        match(input,39,FOLLOW_39_in_synpred10_InternalSpec4173); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalSpec

    // $ANTLR start synpred11_InternalSpec
    public final void synpred11_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1797:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1798:1: 
        {
        }

        match(input,13,FOLLOW_13_in_synpred11_InternalSpec4327); if (state.failed) return ;
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1799:1: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1800:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1800:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1801:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalSpec4336);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalSpec4342);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSpec

    // $ANTLR start synpred12_InternalSpec
    public final void synpred12_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1855:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1855:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1855:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1855:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1855:10: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1856:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1856:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt87=3;
        switch ( input.LA(1) ) {
        case 13:
            {
            alt87=1;
            }
            break;
        case 40:
            {
            alt87=2;
            }
            break;
        case 41:
            {
            alt87=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 87, 0, input);

            throw nvae;
        }

        switch (alt87) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1856:4: '.'
                {
                match(input,13,FOLLOW_13_in_synpred12_InternalSpec4445); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1858:6: ( ( '?.' ) )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1858:6: ( ( '?.' ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1859:1: ( '?.' )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1859:1: ( '?.' )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1860:2: '?.'
                {
                match(input,40,FOLLOW_40_in_synpred12_InternalSpec4459); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1865:6: ( ( '*.' ) )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1865:6: ( ( '*.' ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1866:1: ( '*.' )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1866:1: ( '*.' )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1867:2: '*.'
                {
                match(input,41,FOLLOW_41_in_synpred12_InternalSpec4479); if (state.failed) return ;

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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1976:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1977:1: ( '(' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1977:1: ( '(' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1978:2: '('
        {
        match(input,43,FOLLOW_43_in_synpred13_InternalSpec4706); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSpec

    // $ANTLR start synpred14_InternalSpec
    public final void synpred14_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1997:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1997:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1997:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1997:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1997:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1998:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1998:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_ID||LA89_0==43||LA89_0==72) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1998:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1998:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1999:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1999:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2000:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4758);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2002:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop88:
                do {
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==42) ) {
                        alt88=1;
                    }


                    switch (alt88) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2002:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred14_InternalSpec4765); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2003:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2004:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2004:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2005:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4772);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop88;
                    }
                } while (true);


                }
                break;

        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2007:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2008:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2008:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2009:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred14_InternalSpec4786); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSpec

    // $ANTLR start synpred15_InternalSpec
    public final void synpred15_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2076:4: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2077:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2077:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2078:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalSpec4904);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSpec

    // $ANTLR start synpred16_InternalSpec
    public final void synpred16_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2359:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2359:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2359:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2359:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2359:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==43||LA91_0==72) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2359:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2359:5: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2360:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2360:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2361:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5677);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2363:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==42) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2363:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred16_InternalSpec5684); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2364:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2365:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2365:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2366:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5691);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop90;
                    }
                } while (true);


                }
                break;

        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2368:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2369:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2369:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2370:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred16_InternalSpec5705); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalSpec

    // $ANTLR start synpred18_InternalSpec
    public final void synpred18_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2729:4: ( 'else' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2729:6: 'else'
        {
        match(input,50,FOLLOW_50_in_synpred18_InternalSpec6488); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalSpec

    // $ANTLR start synpred19_InternalSpec
    public final void synpred19_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2783:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2783:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2783:3: ( ( ( ruleValidID ) ) ':' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2783:4: ( ( ruleValidID ) ) ':'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2783:4: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2784:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2784:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2785:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalSpec6628);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,52,FOLLOW_52_in_synpred19_InternalSpec6634); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSpec

    // $ANTLR start synpred20_InternalSpec
    public final void synpred20_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3358:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3358:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3358:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3358:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3358:6: ( ( ruleJvmTypeReference ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3359:1: ( ruleJvmTypeReference )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3359:1: ( ruleJvmTypeReference )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3360:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalSpec7874);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3362:2: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3363:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3363:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3364:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalSpec7883);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3662:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3663:1: ( '(' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3663:1: ( '(' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3664:2: '('
        {
        match(input,43,FOLLOW_43_in_synpred21_InternalSpec8445); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSpec

    // $ANTLR start synpred22_InternalSpec
    public final void synpred22_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3683:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3683:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3683:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3683:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3683:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3684:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3684:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==43||LA95_0==72) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3684:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3684:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3685:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3685:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3686:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8497);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3688:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==42) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3688:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred22_InternalSpec8504); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3689:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3690:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3690:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3691:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8511);
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

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3693:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3694:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3694:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3695:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred22_InternalSpec8525); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalSpec

    // $ANTLR start synpred23_InternalSpec
    public final void synpred23_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3762:4: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3763:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3763:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3764:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalSpec8643);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalSpec

    // $ANTLR start synpred24_InternalSpec
    public final void synpred24_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3960:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3960:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==43||LA97_0==72) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3960:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3960:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3961:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3961:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3962:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9134);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3964:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==42) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3964:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred24_InternalSpec9141); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3965:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3966:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3966:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3967:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9148);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3969:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3970:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3970:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3971:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred24_InternalSpec9162); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalSpec

    // $ANTLR start synpred25_InternalSpec
    public final void synpred25_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4038:2: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4039:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4039:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4040:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalSpec9278);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalSpec

    // $ANTLR start synpred26_InternalSpec
    public final void synpred26_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4362:2: ( ( ruleXExpression ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4363:1: ( ruleXExpression )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4363:1: ( ruleXExpression )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4364:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalSpec10081);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSpec

    // $ANTLR start synpred27_InternalSpec
    public final void synpred27_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4433:5: ( 'catch' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4433:7: 'catch'
        {
        match(input,71,FOLLOW_71_in_synpred27_InternalSpec10226); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalSpec

    // $ANTLR start synpred28_InternalSpec
    public final void synpred28_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4452:5: ( 'finally' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4452:7: 'finally'
        {
        match(input,70,FOLLOW_70_in_synpred28_InternalSpec10256); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalSpec

    // $ANTLR start synpred30_InternalSpec
    public final void synpred30_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4600:3: ( '.' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4601:2: '.'
        {
        match(input,13,FOLLOW_13_in_synpred30_InternalSpec10603); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalSpec

    // $ANTLR start synpred31_InternalSpec
    public final void synpred31_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4649:2: ( ( () '[' ']' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4649:3: ( () '[' ']' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4649:3: ( () '[' ']' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4649:4: () '[' ']'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4649:4: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4650:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred31_InternalSpec10755); if (state.failed) return ;
        match(input,47,FOLLOW_47_in_synpred31_InternalSpec10759); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalSpec

    // $ANTLR start synpred32_InternalSpec
    public final void synpred32_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4803:4: ( '<' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4803:6: '<'
        {
        match(input,30,FOLLOW_30_in_synpred32_InternalSpec11116); if (state.failed) return ;

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


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA84 dfa84 = new DFA84(this);
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
            "\3\2\6\uffff\2\2\1\uffff\2\2\1\uffff\30\2\1\1\2\2\1\uffff\16"+
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
            return "1976:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred13_InternalSpec()) ) {s = 61;}

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
        "\1\4\2\0\31\uffff";
    static final String DFA33_maxS =
        "\1\110\2\0\31\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\5\1\1\11\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "1997:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA33_0==43) ) {s = 2;}

                        else if ( (LA33_0==72) && (synpred14_InternalSpec())) {s = 3;}

                        else if ( (LA33_0==46) && (synpred14_InternalSpec())) {s = 4;}

                        else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_INT)||LA33_0==16||LA33_0==30||(LA33_0>=33 && LA33_0<=34)||LA33_0==38||LA33_0==45||LA33_0==49||LA33_0==51||(LA33_0>=55 && LA33_0<=57)||LA33_0==60||(LA33_0>=62 && LA33_0<=69)) ) {s = 5;}

                        else if ( (LA33_0==44) ) {s = 27;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpec()) ) {s = 4;}

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
    static final String DFA35_eotS =
        "\76\uffff";
    static final String DFA35_eofS =
        "\1\2\75\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA35_maxS =
        "\1\110\1\0\74\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA35_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\2\2\1\uffff\32\2\1\1\1\uffff\16\2\1"+
            "\uffff\13\2",
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2076:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\36\uffff";
    static final String DFA41_eofS =
        "\36\uffff";
    static final String DFA41_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA41_maxS =
        "\1\110\2\0\33\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\5\1\1\11\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2359:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==RULE_ID) ) {s = 1;}

                        else if ( (LA41_0==43) ) {s = 2;}

                        else if ( (LA41_0==72) && (synpred16_InternalSpec())) {s = 3;}

                        else if ( (LA41_0==46) && (synpred16_InternalSpec())) {s = 4;}

                        else if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_INT)||LA41_0==16||LA41_0==30||(LA41_0>=33 && LA41_0<=34)||LA41_0==38||LA41_0==45||LA41_0==47||LA41_0==49||LA41_0==51||(LA41_0>=55 && LA41_0<=60)||(LA41_0>=62 && LA41_0<=69)) ) {s = 5;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
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
            "\3\2\6\uffff\2\2\1\uffff\2\2\1\uffff\30\2\1\1\2\2\1\uffff\16"+
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
            return "3662:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred21_InternalSpec()) ) {s = 61;}

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
    static final String DFA63_eotS =
        "\34\uffff";
    static final String DFA63_eofS =
        "\34\uffff";
    static final String DFA63_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA63_maxS =
        "\1\110\2\0\31\uffff";
    static final String DFA63_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA63_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA63_transitionS = {
            "\2\5\1\1\11\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3683:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_0 = input.LA(1);

                         
                        int index63_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA63_0==RULE_ID) ) {s = 1;}

                        else if ( (LA63_0==43) ) {s = 2;}

                        else if ( (LA63_0==72) && (synpred22_InternalSpec())) {s = 3;}

                        else if ( (LA63_0==46) && (synpred22_InternalSpec())) {s = 4;}

                        else if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_INT)||LA63_0==16||LA63_0==30||(LA63_0>=33 && LA63_0<=34)||LA63_0==38||LA63_0==45||LA63_0==49||LA63_0==51||(LA63_0>=55 && LA63_0<=57)||LA63_0==60||(LA63_0>=62 && LA63_0<=69)) ) {s = 5;}

                        else if ( (LA63_0==44) ) {s = 27;}

                         
                        input.seek(index63_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_2);
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
    static final String DFA65_eotS =
        "\76\uffff";
    static final String DFA65_eofS =
        "\1\2\75\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA65_maxS =
        "\1\110\1\0\74\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA65_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\2\2\1\uffff\32\2\1\1\1\uffff\16\2\1"+
            "\uffff\13\2",
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

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3762:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\34\uffff";
    static final String DFA71_eofS =
        "\34\uffff";
    static final String DFA71_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA71_maxS =
        "\1\110\2\0\31\uffff";
    static final String DFA71_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA71_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA71_transitionS = {
            "\2\5\1\1\11\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3959:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_0 = input.LA(1);

                         
                        int index71_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA71_0==RULE_ID) ) {s = 1;}

                        else if ( (LA71_0==43) ) {s = 2;}

                        else if ( (LA71_0==72) && (synpred24_InternalSpec())) {s = 3;}

                        else if ( (LA71_0==46) && (synpred24_InternalSpec())) {s = 4;}

                        else if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_INT)||LA71_0==16||LA71_0==30||(LA71_0>=33 && LA71_0<=34)||LA71_0==38||LA71_0==45||LA71_0==49||LA71_0==51||(LA71_0>=55 && LA71_0<=57)||LA71_0==60||(LA71_0>=62 && LA71_0<=69)) ) {s = 5;}

                        else if ( (LA71_0==44) ) {s = 27;}

                         
                        input.seek(index71_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index71_2);
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
    static final String DFA72_eotS =
        "\76\uffff";
    static final String DFA72_eofS =
        "\1\2\75\uffff";
    static final String DFA72_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA72_maxS =
        "\1\110\1\0\74\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA72_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\2\2\1\uffff\32\2\1\1\1\uffff\16\2\1"+
            "\uffff\13\2",
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
            return "4038:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index72_1);
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
    static final String DFA74_eotS =
        "\76\uffff";
    static final String DFA74_eofS =
        "\1\31\75\uffff";
    static final String DFA74_minS =
        "\1\4\30\0\45\uffff";
    static final String DFA74_maxS =
        "\1\110\30\0\45\uffff";
    static final String DFA74_acceptS =
        "\31\uffff\1\2\43\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\45\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\17\1\15\1\1\6\uffff\2\31\1\uffff\1\6\1\31\1\uffff\13\31\1"+
            "\10\2\31\1\4\1\3\3\31\1\2\4\31\1\30\1\31\1\12\1\uffff\2\31\1"+
            "\21\1\31\1\7\3\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13"+
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

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4362:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_6 = input.LA(1);

                         
                        int index74_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA74_9 = input.LA(1);

                         
                        int index74_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA74_10 = input.LA(1);

                         
                        int index74_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA74_11 = input.LA(1);

                         
                        int index74_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA74_12 = input.LA(1);

                         
                        int index74_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA74_13 = input.LA(1);

                         
                        int index74_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA74_14 = input.LA(1);

                         
                        int index74_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA74_15 = input.LA(1);

                         
                        int index74_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA74_16 = input.LA(1);

                         
                        int index74_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA74_17 = input.LA(1);

                         
                        int index74_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA74_18 = input.LA(1);

                         
                        int index74_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA74_19 = input.LA(1);

                         
                        int index74_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA74_20 = input.LA(1);

                         
                        int index74_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA74_21 = input.LA(1);

                         
                        int index74_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA74_22 = input.LA(1);

                         
                        int index74_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA74_23 = input.LA(1);

                         
                        int index74_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA74_24 = input.LA(1);

                         
                        int index74_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA84_eotS =
        "\76\uffff";
    static final String DFA84_eofS =
        "\1\2\75\uffff";
    static final String DFA84_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA84_maxS =
        "\1\110\1\0\74\uffff";
    static final String DFA84_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA84_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA84_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\2\2\1\uffff\13\2\1\1\17\2\1\uffff\16"+
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

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "4803:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSpec()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecFile_in_entryRuleSpecFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSpecFile122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSpecFile143 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleSpecFile164 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_ruleExampleGroup_in_ruleSpecFile186 = new BitSet(new long[]{0x0000000000008002L});
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
    public static final BitSet FOLLOW_16_in_ruleExampleGroup573 = new BitSet(new long[]{0x00000800001A0040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleExampleGroup594 = new BitSet(new long[]{0x00000800001A0040L,0x0000000000000100L});
    public static final BitSet FOLLOW_17_in_ruleExampleGroup607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_ruleAbstractElement700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExample_in_ruleAbstractElement727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_ruleAbstractElement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember845 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember866 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleMember879 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleMember900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleContext985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContext1002 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleContext1019 = new BitSet(new long[]{0x00000800001A0040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleContext1040 = new BitSet(new long[]{0x00000800001A0040L,0x0000000000000100L});
    public static final BitSet FOLLOW_17_in_ruleContext1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExample_in_entryRuleExample1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExample1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleExample1136 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExample1159 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExample1177 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleExample1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1398 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1414 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1464 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1517 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpSingleAssign1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpMultiAssign1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1812 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1865 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1888 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpOr1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2071 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2124 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2147 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpAnd2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2330 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2383 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2406 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpEquality2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2610 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_26_in_ruleXRelationalExpression2646 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2671 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2732 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2755 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2998 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3051 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3074 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3278 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3331 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3354 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3558 = new BitSet(new long[]{0x0000003800004002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3611 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3634 = new BitSet(new long[]{0x0000003800004002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpMulti3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3887 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4157 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleXCastedExpression4192 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4215 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4310 = new BitSet(new long[]{0x0000030000002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall4359 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4382 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4398 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4420 = new BitSet(new long[]{0x0000030000002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall4506 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4530 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4567 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall4596 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4617 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4630 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4651 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4665 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4690 = new BitSet(new long[]{0x00002B0000002002L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4724 = new BitSet(new long[]{0xD38A784640010070L,0x000000000000013FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4809 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4837 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4850 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4871 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4888 = new BitSet(new long[]{0x0000230000002002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4921 = new BitSet(new long[]{0x0000030000002002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5660 = new BitSet(new long[]{0xDF8AE84640010070L,0x000000000000013FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5731 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5744 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5765 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5787 = new BitSet(new long[]{0xDF8AA84640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5824 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5938 = new BitSet(new long[]{0xDF8B284640010072L,0x000000000000003FL});
    public static final BitSet FOLLOW_48_in_ruleXExpressionInClosure5951 = new BitSet(new long[]{0xDF8A284640010072L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6109 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleXShortClosure6122 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6143 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ruleXShortClosure6165 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXParenthesizedExpression6284 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6306 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression6409 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression6421 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6442 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression6454 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6475 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6496 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6612 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6653 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6665 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6689 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6701 = new BitSet(new long[]{0x0050080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6722 = new BitSet(new long[]{0x0070080000020040L,0x0000000000000100L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6736 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6748 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6769 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6875 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCasePart6889 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6910 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6924 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXForLoopExpression7037 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXForLoopExpression7049 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7070 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXForLoopExpression7082 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7103 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression7115 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXWhileExpression7228 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXWhileExpression7240 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7261 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression7273 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression7386 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7407 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXDoWhileExpression7419 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXDoWhileExpression7431 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7452 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression7556 = new BitSet(new long[]{0xDF8A284640030070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7578 = new BitSet(new long[]{0xDF8B284640030070L,0x000000000000003FL});
    public static final BitSet FOLLOW_48_in_ruleXBlockExpression7591 = new BitSet(new long[]{0xDF8A284640030070L,0x000000000000003FL});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7825 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration7856 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7904 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7925 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7954 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration7968 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8083 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8197 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8321 = new BitSet(new long[]{0x1000000040000040L});
    public static final BitSet FOLLOW_30_in_ruleXFeatureCall8335 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8356 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall8369 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8390 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall8404 = new BitSet(new long[]{0x1000000040000040L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8429 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8463 = new BitSet(new long[]{0xD38A784640010070L,0x000000000000013FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8548 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8576 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall8589 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8610 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall8627 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleIdOrSuper8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8879 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleStaticQualifier8897 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXConstructorCall8994 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9017 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_30_in_ruleXConstructorCall9030 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9051 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall9064 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9085 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall9099 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall9113 = new BitSet(new long[]{0xD38A784640010070L,0x000000000000013FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9185 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9213 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall9226 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9247 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall9264 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXBooleanLiteral9389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXBooleanLiteral9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXNullLiteral9519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXTypeLiteral9815 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXTypeLiteral9827 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9850 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral9862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXThrowExpression9954 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXReturnExpression10067 = new BitSet(new long[]{0xD38A284640010072L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression10191 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10212 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10242 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression10264 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression10308 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXCatchClause10422 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXCatchClause10435 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10456 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause10468 = new BitSet(new long[]{0xD38A284640010070L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10584 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName10612 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10635 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10740 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleJvmTypeReference10778 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleJvmTypeReference10790 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10905 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10926 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef10939 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10960 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleXFunctionTypeRef10988 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11103 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleJvmParameterizedTypeReference11124 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11146 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_42_in_ruleJvmParameterizedTypeReference11159 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11180 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference11194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmWildcardTypeReference11407 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBound11541 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBoundAnded11645 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleJvmLowerBound11749 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSpec1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalSpec1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalSpec2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalSpec2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred5_InternalSpec2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalSpec2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalSpec3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalSpec3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalSpec3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred10_InternalSpec4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred11_InternalSpec4327 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalSpec4336 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalSpec4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred12_InternalSpec4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalSpec4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalSpec4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred13_InternalSpec4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4758 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalSpec4765 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4772 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred14_InternalSpec4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalSpec4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5677 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred16_InternalSpec5684 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5691 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalSpec5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalSpec6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalSpec6628 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred19_InternalSpec6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalSpec7874 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalSpec7883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred21_InternalSpec8445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8497 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred22_InternalSpec8504 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8511 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred22_InternalSpec8525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalSpec8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9134 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred24_InternalSpec9141 = new BitSet(new long[]{0x0000080000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9148 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred24_InternalSpec9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalSpec9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalSpec10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred27_InternalSpec10226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred28_InternalSpec10256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred30_InternalSpec10603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred31_InternalSpec10755 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_synpred31_InternalSpec10759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred32_InternalSpec11116 = new BitSet(new long[]{0x0000000000000002L});

}