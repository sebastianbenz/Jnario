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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'static'", "'extension'", "'.'", "'*'", "'describe'", "'{'", "'}'", "'='", "'it'", "'@'", "'('", "','", "')'", "'+'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__77=77;

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:76:1: ruleSpecFile returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* ) ;
    public final EObject ruleSpecFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:79:28: ( ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:1: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:1: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:2: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleExampleGroup ) )*
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:2: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:80:4: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSpecFile123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getSpecFileAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:84:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:86:3: lv_packageName_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSpecFileAccess().getPackageNameQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSpecFile144);
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


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:102:4: ( (lv_imports_2_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecFileAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleSpecFile167);
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
            	    break loop2;
                }
            } while (true);

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:120:3: ( (lv_elements_3_0= ruleExampleGroup ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:121:1: (lv_elements_3_0= ruleExampleGroup )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:121:1: (lv_elements_3_0= ruleExampleGroup )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:122:3: lv_elements_3_0= ruleExampleGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecFileAccess().getElementsExampleGroupParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExampleGroup_in_ruleSpecFile189);
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
            	    break loop3;
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
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport226);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport236); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:158:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:159:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:159:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:159:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:163:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:163:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:163:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:163:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:163:3: ( (lv_static_1_0= 'static' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:164:1: (lv_static_1_0= 'static' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:164:1: (lv_static_1_0= 'static' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:165:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,13,FOLLOW_13_in_ruleImport293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getImportAccess().getStaticStaticKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:178:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:179:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:179:1: (lv_extension_2_0= 'extension' )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:180:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,14,FOLLOW_14_in_ruleImport324); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getImportAccess().getExtensionExtensionKeyword_1_0_1_0());
                                  
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:193:3: ( ( ruleQualifiedName ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:194:1: ( ruleQualifiedName )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:194:1: ( ruleQualifiedName )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:195:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedTypeJvmTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport361);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleImport373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getImportAccess().getFullStopKeyword_1_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleImport385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getImportAccess().getAsteriskKeyword_1_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:217:6: ( ( ruleQualifiedName ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:217:6: ( ( ruleQualifiedName ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:218:1: ( ruleQualifiedName )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:218:1: ( ruleQualifiedName )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:219:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedTypeJvmTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport415);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:233:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:233:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:234:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:234:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:235:3: lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport442);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildCard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_7_0, 
                              		"QualifiedNameWithWildCard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:259:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:260:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:261:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard480);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard491); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:268:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:271:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:272:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:272:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:273:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard538);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildCard569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_2()); 
                  
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:303:1: entryRuleExampleGroup returns [EObject current=null] : iv_ruleExampleGroup= ruleExampleGroup EOF ;
    public final EObject entryRuleExampleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleGroup = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:304:2: (iv_ruleExampleGroup= ruleExampleGroup EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:305:2: iv_ruleExampleGroup= ruleExampleGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleGroupRule()); 
            }
            pushFollow(FOLLOW_ruleExampleGroup_in_entryRuleExampleGroup609);
            iv_ruleExampleGroup=ruleExampleGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExampleGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleGroup619); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:312:1: ruleExampleGroup returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_preamble_2_0= 'describe' ) ) ( ( ruleQualifiedName ) )? ( (lv_name_4_0= RULE_STRING ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleMember ) )* otherlv_7= '}' ) ;
    public final EObject ruleExampleGroup() throws RecognitionException {
        EObject current = null;

        Token lv_preamble_2_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:315:28: ( ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_preamble_2_0= 'describe' ) ) ( ( ruleQualifiedName ) )? ( (lv_name_4_0= RULE_STRING ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleMember ) )* otherlv_7= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:316:1: ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_preamble_2_0= 'describe' ) ) ( ( ruleQualifiedName ) )? ( (lv_name_4_0= RULE_STRING ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleMember ) )* otherlv_7= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:316:1: ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_preamble_2_0= 'describe' ) ) ( ( ruleQualifiedName ) )? ( (lv_name_4_0= RULE_STRING ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleMember ) )* otherlv_7= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:316:2: () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_preamble_2_0= 'describe' ) ) ( ( ruleQualifiedName ) )? ( (lv_name_4_0= RULE_STRING ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleMember ) )* otherlv_7= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:316:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:317:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExampleGroupAccess().getExampleGroupAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:322:2: ( (lv_annotations_1_0= ruleXAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:323:1: (lv_annotations_1_0= ruleXAnnotation )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:323:1: (lv_annotations_1_0= ruleXAnnotation )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:324:3: lv_annotations_1_0= ruleXAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExampleGroupAccess().getAnnotationsXAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAnnotation_in_ruleExampleGroup674);
            	    lv_annotations_1_0=ruleXAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExampleGroupRule());
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
            	    break loop6;
                }
            } while (true);

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:340:3: ( (lv_preamble_2_0= 'describe' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:341:1: (lv_preamble_2_0= 'describe' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:341:1: (lv_preamble_2_0= 'describe' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:342:3: lv_preamble_2_0= 'describe'
            {
            lv_preamble_2_0=(Token)match(input,17,FOLLOW_17_in_ruleExampleGroup693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_preamble_2_0, grammarAccess.getExampleGroupAccess().getPreambleDescribeKeyword_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExampleGroupRule());
              	        }
                     		setWithLastConsumed(current, "preamble", lv_preamble_2_0, "describe");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:355:2: ( ( ruleQualifiedName ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:356:1: ( ruleQualifiedName )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:356:1: ( ruleQualifiedName )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:357:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleGroupRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExampleGroupAccess().getTargetJvmIdentifiableElementCrossReference_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleExampleGroup729);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:370:3: ( (lv_name_4_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:371:1: (lv_name_4_0= RULE_STRING )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:371:1: (lv_name_4_0= RULE_STRING )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:372:3: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExampleGroup747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_4_0, grammarAccess.getExampleGroupAccess().getNameSTRINGTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleGroupRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleExampleGroup765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExampleGroupAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:392:1: ( (lv_elements_6_0= ruleMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==17||(LA9_0>=21 && LA9_0<=23)||LA9_0==74) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:393:1: (lv_elements_6_0= ruleMember )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:393:1: (lv_elements_6_0= ruleMember )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:394:3: lv_elements_6_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExampleGroupAccess().getElementsMemberParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMember_in_ruleExampleGroup786);
            	    lv_elements_6_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExampleGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_6_0, 
            	              		"Member");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleExampleGroup799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getExampleGroupAccess().getRightCurlyBracketKeyword_7());
                  
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


    // $ANTLR start "entryRuleMember"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:422:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:423:2: (iv_ruleMember= ruleMember EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:424:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember835);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember845); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:431:1: ruleMember returns [EObject current=null] : (this_Example_0= ruleExample | this_Field_1= ruleField | this_ExampleGroup_2= ruleExampleGroup ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Example_0 = null;

        EObject this_Field_1 = null;

        EObject this_ExampleGroup_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:434:28: ( (this_Example_0= ruleExample | this_Field_1= ruleField | this_ExampleGroup_2= ruleExampleGroup ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:435:1: (this_Example_0= ruleExample | this_Field_1= ruleField | this_ExampleGroup_2= ruleExampleGroup )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:435:1: (this_Example_0= ruleExample | this_Field_1= ruleField | this_ExampleGroup_2= ruleExampleGroup )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
            case 23:
            case 74:
                {
                alt10=2;
                }
                break;
            case 17:
            case 22:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:436:5: this_Example_0= ruleExample
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberAccess().getExampleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExample_in_ruleMember892);
                    this_Example_0=ruleExample();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Example_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:446:5: this_Field_1= ruleField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleField_in_ruleMember919);
                    this_Field_1=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Field_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:456:5: this_ExampleGroup_2= ruleExampleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberAccess().getExampleGroupParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExampleGroup_in_ruleMember946);
                    this_ExampleGroup_2=ruleExampleGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExampleGroup_2; 
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:472:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:473:2: (iv_ruleField= ruleField EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:474:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField981);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField991); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:481:1: ruleField returns [EObject current=null] : ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:484:28: ( ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:485:1: ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:485:1: ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:485:2: () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:485:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:486:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFieldAccess().getFieldAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:491:2: ( (lv_type_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:492:1: (lv_type_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:492:1: (lv_type_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:493:3: lv_type_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getTypeJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleField1046);
            lv_type_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:509:2: ( (lv_name_2_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:510:1: (lv_name_2_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:510:1: (lv_name_2_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:511:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleField1067);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:527:2: (otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:527:4: otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleField1080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:531:1: ( (lv_right_4_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:532:1: (lv_right_4_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:532:1: (lv_right_4_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:533:3: lv_right_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleField1101);
                    lv_right_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_4_0, 
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleExample"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:557:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:558:2: (iv_ruleExample= ruleExample EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:559:2: iv_ruleExample= ruleExample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleRule()); 
            }
            pushFollow(FOLLOW_ruleExample_in_entryRuleExample1139);
            iv_ruleExample=ruleExample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExample; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExample1149); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:566:1: ruleExample returns [EObject current=null] : ( () ( (lv_preamble_1_0= 'it' ) ) ( ( ruleValidID ) )? ( (lv_name_3_0= RULE_STRING ) )? ( (lv_body_4_0= ruleXBlockExpression ) )? ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token lv_preamble_1_0=null;
        Token lv_name_3_0=null;
        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:569:28: ( ( () ( (lv_preamble_1_0= 'it' ) ) ( ( ruleValidID ) )? ( (lv_name_3_0= RULE_STRING ) )? ( (lv_body_4_0= ruleXBlockExpression ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:570:1: ( () ( (lv_preamble_1_0= 'it' ) ) ( ( ruleValidID ) )? ( (lv_name_3_0= RULE_STRING ) )? ( (lv_body_4_0= ruleXBlockExpression ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:570:1: ( () ( (lv_preamble_1_0= 'it' ) ) ( ( ruleValidID ) )? ( (lv_name_3_0= RULE_STRING ) )? ( (lv_body_4_0= ruleXBlockExpression ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:570:2: () ( (lv_preamble_1_0= 'it' ) ) ( ( ruleValidID ) )? ( (lv_name_3_0= RULE_STRING ) )? ( (lv_body_4_0= ruleXBlockExpression ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:570:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:571:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExampleAccess().getExampleAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:576:2: ( (lv_preamble_1_0= 'it' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:577:1: (lv_preamble_1_0= 'it' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:577:1: (lv_preamble_1_0= 'it' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:578:3: lv_preamble_1_0= 'it'
            {
            lv_preamble_1_0=(Token)match(input,21,FOLLOW_21_in_ruleExample1201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_preamble_1_0, grammarAccess.getExampleAccess().getPreambleItKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExampleRule());
              	        }
                     		setWithLastConsumed(current, "preamble", lv_preamble_1_0, "it");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:591:2: ( ( ruleValidID ) )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:592:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:592:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:593:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExampleAccess().getFeatureJvmIdentifiableElementCrossReference_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleExample1237);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:606:3: ( (lv_name_3_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:607:1: (lv_name_3_0= RULE_STRING )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:607:1: (lv_name_3_0= RULE_STRING )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:608:3: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExample1255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getExampleAccess().getNameSTRINGTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleRule());
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:624:3: ( (lv_body_4_0= ruleXBlockExpression ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:625:1: (lv_body_4_0= ruleXBlockExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:625:1: (lv_body_4_0= ruleXBlockExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:626:3: lv_body_4_0= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExampleAccess().getBodyXBlockExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleExample1282);
                    lv_body_4_0=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExampleRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_4_0, 
                              		"XBlockExpression");
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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleXAnnotation"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:652:1: entryRuleXAnnotation returns [EObject current=null] : iv_ruleXAnnotation= ruleXAnnotation EOF ;
    public final EObject entryRuleXAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotation = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:653:2: (iv_ruleXAnnotation= ruleXAnnotation EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:654:2: iv_ruleXAnnotation= ruleXAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleXAnnotation_in_entryRuleXAnnotation1321);
            iv_ruleXAnnotation=ruleXAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAnnotation1331); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:661:1: ruleXAnnotation returns [EObject current=null] : ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:664:28: ( ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:665:1: ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:665:1: ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:665:2: () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:665:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:666:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXAnnotationAccess().getXAnnotationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleXAnnotation1377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAnnotationAccess().getCommercialAtKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:675:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:676:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:676:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:677:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXAnnotationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationAccess().getAnnotationTypeJvmAnnotationTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXAnnotation1400);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:690:2: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) && (synpred1_InternalSpec())) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:690:3: ( ( '(' )=>otherlv_3= '(' ) ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )? otherlv_8= ')'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:690:3: ( ( '(' )=>otherlv_3= '(' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:690:4: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXAnnotation1421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:695:2: ( ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValue ) ) )?
                    int alt16=3;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==25||LA16_1==63) ) {
                            alt16=2;
                        }
                        else if ( (LA16_1==20) ) {
                            alt16=1;
                        }
                    }
                    else if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_INT)||LA16_0==18||(LA16_0>=22 && LA16_0<=23)||LA16_0==62||(LA16_0>=65 && LA16_0<=66)||LA16_0==68) ) {
                        alt16=2;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:695:3: ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:695:3: ( ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:695:4: ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )*
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:695:4: ( (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:696:1: (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:696:1: (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:697:3: lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAnnotationAccess().getElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation1445);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:713:2: (otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==24) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:713:4: otherlv_5= ',' ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleXAnnotation1458); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getXAnnotationAccess().getCommaKeyword_3_1_0_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:717:1: ( (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:718:1: (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair )
                            	    {
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:718:1: (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:719:3: lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXAnnotationAccess().getElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation1479);
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
                            	    break loop15;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:736:6: ( (lv_value_7_0= ruleXAnnotationElementValue ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:736:6: ( (lv_value_7_0= ruleXAnnotationElementValue ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:737:1: (lv_value_7_0= ruleXAnnotationElementValue )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:737:1: (lv_value_7_0= ruleXAnnotationElementValue )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:738:3: lv_value_7_0= ruleXAnnotationElementValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAnnotationAccess().getValueXAnnotationElementValueParserRuleCall_3_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotation1509);
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

                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleXAnnotation1523); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:766:1: entryRuleXAnnotationElementValuePair returns [EObject current=null] : iv_ruleXAnnotationElementValuePair= ruleXAnnotationElementValuePair EOF ;
    public final EObject entryRuleXAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationElementValuePair = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:767:2: (iv_ruleXAnnotationElementValuePair= ruleXAnnotationElementValuePair EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:768:2: iv_ruleXAnnotationElementValuePair= ruleXAnnotationElementValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationElementValuePairRule()); 
            }
            pushFollow(FOLLOW_ruleXAnnotationElementValuePair_in_entryRuleXAnnotationElementValuePair1561);
            iv_ruleXAnnotationElementValuePair=ruleXAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationElementValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAnnotationElementValuePair1571); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:775:1: ruleXAnnotationElementValuePair returns [EObject current=null] : ( ( ( ruleValidID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXAnnotationElementValue ) ) ) ;
    public final EObject ruleXAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:778:28: ( ( ( ( ruleValidID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXAnnotationElementValue ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:779:1: ( ( ( ruleValidID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXAnnotationElementValue ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:779:1: ( ( ( ruleValidID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXAnnotationElementValue ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:779:2: ( ( ruleValidID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleXAnnotationElementValue ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:779:2: ( ( ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:780:1: ( ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:780:1: ( ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:781:3: ruleValidID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXAnnotationElementValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationElementValuePairAccess().getElementJvmOperationCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleXAnnotationElementValuePair1619);
            ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleXAnnotationElementValuePair1631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAnnotationElementValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:798:1: ( (lv_value_2_0= ruleXAnnotationElementValue ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:799:1: (lv_value_2_0= ruleXAnnotationElementValue )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:799:1: (lv_value_2_0= ruleXAnnotationElementValue )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:800:3: lv_value_2_0= ruleXAnnotationElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationElementValuePairAccess().getValueXAnnotationElementValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValuePair1652);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:824:1: entryRuleXAnnotationElementValueStringConcatenation returns [EObject current=null] : iv_ruleXAnnotationElementValueStringConcatenation= ruleXAnnotationElementValueStringConcatenation EOF ;
    public final EObject entryRuleXAnnotationElementValueStringConcatenation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationElementValueStringConcatenation = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:825:2: (iv_ruleXAnnotationElementValueStringConcatenation= ruleXAnnotationElementValueStringConcatenation EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:826:2: iv_ruleXAnnotationElementValueStringConcatenation= ruleXAnnotationElementValueStringConcatenation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationElementValueStringConcatenationRule()); 
            }
            pushFollow(FOLLOW_ruleXAnnotationElementValueStringConcatenation_in_entryRuleXAnnotationElementValueStringConcatenation1688);
            iv_ruleXAnnotationElementValueStringConcatenation=ruleXAnnotationElementValueStringConcatenation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationElementValueStringConcatenation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAnnotationElementValueStringConcatenation1698); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:833:1: ruleXAnnotationElementValueStringConcatenation returns [EObject current=null] : (this_XAnnotationElementValue_0= ruleXAnnotationElementValue ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )* ) ;
    public final EObject ruleXAnnotationElementValueStringConcatenation() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_XAnnotationElementValue_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:836:28: ( (this_XAnnotationElementValue_0= ruleXAnnotationElementValue ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:837:1: (this_XAnnotationElementValue_0= ruleXAnnotationElementValue ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:837:1: (this_XAnnotationElementValue_0= ruleXAnnotationElementValue ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:838:5: this_XAnnotationElementValue_0= ruleXAnnotationElementValue ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValueStringConcatenation1745);
            this_XAnnotationElementValue_0=ruleXAnnotationElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAnnotationElementValue_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:846:1: ( () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:846:2: () ( (lv_operator_2_0= '+' ) ) ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:846:2: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:847:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueBinaryOperationLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:852:2: ( (lv_operator_2_0= '+' ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:853:1: (lv_operator_2_0= '+' )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:853:1: (lv_operator_2_0= '+' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:854:3: lv_operator_2_0= '+'
            	    {
            	    lv_operator_2_0=(Token)match(input,26,FOLLOW_26_in_ruleXAnnotationElementValueStringConcatenation1772); if (state.failed) return current;
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:867:2: ( (lv_rightOperand_3_0= ruleXAnnotationElementValue ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:868:1: (lv_rightOperand_3_0= ruleXAnnotationElementValue )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:868:1: (lv_rightOperand_3_0= ruleXAnnotationElementValue )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:869:3: lv_rightOperand_3_0= ruleXAnnotationElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getRightOperandXAnnotationElementValueParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValueStringConcatenation1806);
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
    // $ANTLR end "ruleXAnnotationElementValueStringConcatenation"


    // $ANTLR start "entryRuleXAnnotationElementValue"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:893:1: entryRuleXAnnotationElementValue returns [EObject current=null] : iv_ruleXAnnotationElementValue= ruleXAnnotationElementValue EOF ;
    public final EObject entryRuleXAnnotationElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationElementValue = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:894:2: (iv_ruleXAnnotationElementValue= ruleXAnnotationElementValue EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:895:2: iv_ruleXAnnotationElementValue= ruleXAnnotationElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationElementValueRule()); 
            }
            pushFollow(FOLLOW_ruleXAnnotationElementValue_in_entryRuleXAnnotationElementValue1844);
            iv_ruleXAnnotationElementValue=ruleXAnnotationElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationElementValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAnnotationElementValue1854); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:902:1: ruleXAnnotationElementValue returns [EObject current=null] : (this_XAnnotation_0= ruleXAnnotation | this_XAnnotationValueArray_1= ruleXAnnotationValueArray | this_XStringLiteral_2= ruleXStringLiteral | this_XBooleanLiteral_3= ruleXBooleanLiteral | this_XIntLiteral_4= ruleXIntLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XAnnotationValueFieldReference_6= ruleXAnnotationValueFieldReference | (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:905:28: ( (this_XAnnotation_0= ruleXAnnotation | this_XAnnotationValueArray_1= ruleXAnnotationValueArray | this_XStringLiteral_2= ruleXStringLiteral | this_XBooleanLiteral_3= ruleXBooleanLiteral | this_XIntLiteral_4= ruleXIntLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XAnnotationValueFieldReference_6= ruleXAnnotationValueFieldReference | (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:906:1: (this_XAnnotation_0= ruleXAnnotation | this_XAnnotationValueArray_1= ruleXAnnotationValueArray | this_XStringLiteral_2= ruleXStringLiteral | this_XBooleanLiteral_3= ruleXBooleanLiteral | this_XIntLiteral_4= ruleXIntLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XAnnotationValueFieldReference_6= ruleXAnnotationValueFieldReference | (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:906:1: (this_XAnnotation_0= ruleXAnnotation | this_XAnnotationValueArray_1= ruleXAnnotationValueArray | this_XStringLiteral_2= ruleXStringLiteral | this_XBooleanLiteral_3= ruleXBooleanLiteral | this_XIntLiteral_4= ruleXIntLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XAnnotationValueFieldReference_6= ruleXAnnotationValueFieldReference | (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' ) )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt19=1;
                }
                break;
            case 18:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            case 65:
            case 66:
                {
                alt19=4;
                }
                break;
            case RULE_INT:
                {
                alt19=5;
                }
                break;
            case 68:
                {
                alt19=6;
                }
                break;
            case RULE_ID:
            case 62:
                {
                alt19=7;
                }
                break;
            case 23:
                {
                alt19=8;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:907:5: this_XAnnotation_0= ruleXAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXAnnotation_in_ruleXAnnotationElementValue1901);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:917:5: this_XAnnotationValueArray_1= ruleXAnnotationValueArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXAnnotationValueArrayParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXAnnotationValueArray_in_ruleXAnnotationElementValue1928);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:927:5: this_XStringLiteral_2= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXAnnotationElementValue1955);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:937:5: this_XBooleanLiteral_3= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXAnnotationElementValue1982);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:947:5: this_XIntLiteral_4= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXIntLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXAnnotationElementValue2009);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:957:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXAnnotationElementValue2036);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:967:5: this_XAnnotationValueFieldReference_6= ruleXAnnotationValueFieldReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXAnnotationValueFieldReferenceParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXAnnotationValueFieldReference_in_ruleXAnnotationElementValue2063);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:976:6: (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:976:6: (otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:976:8: otherlv_7= '(' this_XAnnotationElementValueStringConcatenation_8= ruleXAnnotationElementValueStringConcatenation otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleXAnnotationElementValue2081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXAnnotationElementValueAccess().getLeftParenthesisKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXAnnotationElementValueStringConcatenationParserRuleCall_7_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXAnnotationElementValueStringConcatenation_in_ruleXAnnotationElementValue2103);
                    this_XAnnotationElementValueStringConcatenation_8=ruleXAnnotationElementValueStringConcatenation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAnnotationElementValueStringConcatenation_8; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleXAnnotationElementValue2114); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1001:1: entryRuleXAnnotationValueFieldReference returns [EObject current=null] : iv_ruleXAnnotationValueFieldReference= ruleXAnnotationValueFieldReference EOF ;
    public final EObject entryRuleXAnnotationValueFieldReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationValueFieldReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1002:2: (iv_ruleXAnnotationValueFieldReference= ruleXAnnotationValueFieldReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1003:2: iv_ruleXAnnotationValueFieldReference= ruleXAnnotationValueFieldReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationValueFieldReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleXAnnotationValueFieldReference_in_entryRuleXAnnotationValueFieldReference2151);
            iv_ruleXAnnotationValueFieldReference=ruleXAnnotationValueFieldReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationValueFieldReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAnnotationValueFieldReference2161); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1010:1: ruleXAnnotationValueFieldReference returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? ( ( ruleIdOrSuper ) ) ) ;
    public final EObject ruleXAnnotationValueFieldReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1013:28: ( ( () ( ( ruleStaticQualifier ) )? ( ( ruleIdOrSuper ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1014:1: ( () ( ( ruleStaticQualifier ) )? ( ( ruleIdOrSuper ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1014:1: ( () ( ( ruleStaticQualifier ) )? ( ( ruleIdOrSuper ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1014:2: () ( ( ruleStaticQualifier ) )? ( ( ruleIdOrSuper ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1014:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1015:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXAnnotationValueFieldReferenceAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1020:2: ( ( ruleStaticQualifier ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==63) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1021:1: ( ruleStaticQualifier )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1021:1: ( ruleStaticQualifier )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1022:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAnnotationValueFieldReferenceRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAnnotationValueFieldReferenceAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXAnnotationValueFieldReference2218);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1035:3: ( ( ruleIdOrSuper ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1036:1: ( ruleIdOrSuper )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1036:1: ( ruleIdOrSuper )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1037:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXAnnotationValueFieldReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationValueFieldReferenceAccess().getFeatureJvmIdentifiableElementCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXAnnotationValueFieldReference2242);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1058:1: entryRuleXAnnotationValueArray returns [EObject current=null] : iv_ruleXAnnotationValueArray= ruleXAnnotationValueArray EOF ;
    public final EObject entryRuleXAnnotationValueArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationValueArray = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1059:2: (iv_ruleXAnnotationValueArray= ruleXAnnotationValueArray EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1060:2: iv_ruleXAnnotationValueArray= ruleXAnnotationValueArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationValueArrayRule()); 
            }
            pushFollow(FOLLOW_ruleXAnnotationValueArray_in_entryRuleXAnnotationValueArray2278);
            iv_ruleXAnnotationValueArray=ruleXAnnotationValueArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationValueArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAnnotationValueArray2288); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1067:1: ruleXAnnotationValueArray returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_values_2_0= ruleXAnnotationElementValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleXAnnotationValueArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1070:28: ( ( () otherlv_1= '{' ( (lv_values_2_0= ruleXAnnotationElementValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )* otherlv_5= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1071:1: ( () otherlv_1= '{' ( (lv_values_2_0= ruleXAnnotationElementValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )* otherlv_5= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1071:1: ( () otherlv_1= '{' ( (lv_values_2_0= ruleXAnnotationElementValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )* otherlv_5= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1071:2: () otherlv_1= '{' ( (lv_values_2_0= ruleXAnnotationElementValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )* otherlv_5= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1071:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1072:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXAnnotationValueArrayAccess().getXAnnotationValueArrayAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXAnnotationValueArray2334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAnnotationValueArrayAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1081:1: ( (lv_values_2_0= ruleXAnnotationElementValue ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1082:1: (lv_values_2_0= ruleXAnnotationElementValue )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1082:1: (lv_values_2_0= ruleXAnnotationElementValue )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1083:3: lv_values_2_0= ruleXAnnotationElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationValueArrayAccess().getValuesXAnnotationElementValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationValueArray2355);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1099:2: (otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1099:4: otherlv_3= ',' ( (lv_values_4_0= ruleXAnnotationElementValue ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXAnnotationValueArray2368); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getXAnnotationValueArrayAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1103:1: ( (lv_values_4_0= ruleXAnnotationElementValue ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1104:1: (lv_values_4_0= ruleXAnnotationElementValue )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1104:1: (lv_values_4_0= ruleXAnnotationElementValue )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1105:3: lv_values_4_0= ruleXAnnotationElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAnnotationValueArrayAccess().getValuesXAnnotationElementValueParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationValueArray2389);
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
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXAnnotationValueArray2403); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1133:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1134:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1135:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression2439);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression2449); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1142:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1145:28: (this_XAssignment_0= ruleXAssignment )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1147:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression2495);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1163:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1164:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1165:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2529);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2539); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1172:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1175:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1176:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1176:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||(LA23_1>=RULE_STRING && LA23_1<=RULE_ID)||(LA23_1>=15 && LA23_1<=19)||(LA23_1>=21 && LA23_1<=47)||(LA23_1>=49 && LA23_1<=74)) ) {
                    alt23=2;
                }
                else if ( (LA23_1==20) ) {
                    alt23=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_INT)||LA23_0==18||LA23_0==23||LA23_0==26||LA23_0==36||LA23_0==39||LA23_0==43||LA23_0==47||LA23_0==51||LA23_0==53||(LA23_0>=57 && LA23_0<=59)||LA23_0==62||(LA23_0>=64 && LA23_0<=71)) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1176:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1176:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1176:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1176:3: ()
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1177:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1182:2: ( ( ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1183:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1183:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1184:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2597);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2613);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1205:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1206:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1206:1: (lv_value_3_0= ruleXAssignment )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1207:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2633);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1224:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1224:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1225:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2663);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1233:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==27) ) {
                        int LA22_1 = input.LA(2);

                        if ( (synpred2_InternalSpec()) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1233:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1233:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1233:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1238:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1238:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1238:7: ()
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1239:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1244:2: ( ( ruleOpMultiAssign ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1245:1: ( ruleOpMultiAssign )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1245:1: ( ruleOpMultiAssign )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1246:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2716);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1259:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1260:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1260:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1261:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2739);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1285:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1286:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1287:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2779);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2790); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1294:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1297:28: (kw= '=' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1299:2: kw= '='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpSingleAssign2827); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1312:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1313:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1314:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2867);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2878); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1321:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1324:28: (kw= '+=' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1326:2: kw= '+='
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpMultiAssign2915); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1339:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1340:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1341:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2954);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2964); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1348:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1351:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1352:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1352:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1353:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3011);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==28) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred3_InternalSpec()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1366:6: ( () ( ( ruleOpOr ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1366:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1366:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1367:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1372:2: ( ( ruleOpOr ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1373:1: ( ruleOpOr )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1373:1: ( ruleOpOr )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1374:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression3064);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1387:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1388:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1388:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1389:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3087);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1413:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1414:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1415:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr3126);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr3137); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1422:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1425:28: (kw= '||' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1427:2: kw= '||'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOr3174); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1440:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1441:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1442:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3213);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression3223); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1449:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1452:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1453:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1453:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1454:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3270);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1462:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred4_InternalSpec()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1462:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1462:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1462:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1467:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1467:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1467:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1468:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1473:2: ( ( ruleOpAnd ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1474:1: ( ruleOpAnd )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1474:1: ( ruleOpAnd )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1475:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression3323);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1488:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1489:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1489:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1490:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3346);
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
            	    break loop25;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1514:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1515:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1516:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd3385);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd3396); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1523:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1526:28: (kw= '&&' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1528:2: kw= '&&'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAnd3433); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1541:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1542:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1543:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3472);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression3482); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1550:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1553:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1554:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1554:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1555:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3529);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1563:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred5_InternalSpec()) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==31) ) {
                    int LA26_3 = input.LA(2);

                    if ( (synpred5_InternalSpec()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1563:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1563:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1563:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1568:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1568:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1568:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1569:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1574:2: ( ( ruleOpEquality ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1575:1: ( ruleOpEquality )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1575:1: ( ruleOpEquality )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1576:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3582);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1589:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1590:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1590:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1591:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3605);
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
            	    break loop26;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1615:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1616:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1617:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3644);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3655); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1624:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1627:28: ( (kw= '==' | kw= '!=' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1628:1: (kw= '==' | kw= '!=' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1628:1: (kw= '==' | kw= '!=' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            else if ( (LA27_0==31) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1629:2: kw= '=='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpEquality3693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1636:2: kw= '!='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality3712); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1649:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1650:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1651:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3752);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3762); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1658:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1661:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1662:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1662:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1663:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3809);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop28:
            do {
                int alt28=3;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred7_InternalSpec()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred7_InternalSpec()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA28_5 = input.LA(2);

                    if ( (synpred7_InternalSpec()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA28_6 = input.LA(2);

                    if ( (synpred7_InternalSpec()) ) {
                        alt28=2;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1673:5: ( () otherlv_2= 'instanceof' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1673:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1673:6: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1674:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXRelationalExpression3845); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1683:3: ( ( ruleQualifiedName ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1684:1: ( ruleQualifiedName )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1684:1: ( ruleQualifiedName )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1685:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3870);
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
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1704:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1704:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1704:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1705:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1710:2: ( ( ruleOpCompare ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:1: ( ruleOpCompare )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:1: ( ruleOpCompare )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1712:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3931);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1725:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1726:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1726:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1727:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3954);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1751:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1752:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1753:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3994);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare4005); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1760:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1763:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1764:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1764:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt29=1;
                }
                break;
            case 34:
                {
                alt29=2;
                }
                break;
            case 35:
                {
                alt29=3;
                }
                break;
            case 36:
                {
                alt29=4;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1765:2: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare4043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1772:2: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare4062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1779:2: kw= '>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare4081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1786:2: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare4100); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1799:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1800:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1801:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4140);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4150); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1808:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1811:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1812:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1812:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1813:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4197);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1821:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==37) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred8_InternalSpec()) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==38) ) {
                    int LA30_3 = input.LA(2);

                    if ( (synpred8_InternalSpec()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1821:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1821:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1821:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1826:6: ( () ( ( ruleOpOther ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1826:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1826:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1827:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1832:2: ( ( ruleOpOther ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1833:1: ( ruleOpOther )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1833:1: ( ruleOpOther )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1834:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4250);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1847:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1848:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1848:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1849:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4273);
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
            	    break loop30;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1873:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1874:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1875:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther4312);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther4323); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1882:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1885:28: ( (kw= '->' | kw= '..' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1886:1: (kw= '->' | kw= '..' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1886:1: (kw= '->' | kw= '..' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            else if ( (LA31_0==38) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1887:2: kw= '->'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther4361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1894:2: kw= '..'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther4380); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1907:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1908:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1909:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4420);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4430); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1916:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1919:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1920:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1920:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1921:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4477);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1929:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==39) ) {
                    int LA32_3 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1929:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1929:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1929:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1934:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1934:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1934:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1935:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1940:2: ( ( ruleOpAdd ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1941:1: ( ruleOpAdd )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1941:1: ( ruleOpAdd )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1942:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4530);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1955:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1956:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1956:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4553);
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
            	    break loop32;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1981:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1982:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1983:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4592);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4603); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1990:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1993:28: ( (kw= '+' | kw= '-' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1994:1: (kw= '+' | kw= '-' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1994:1: (kw= '+' | kw= '-' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            else if ( (LA33_0==39) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1995:2: kw= '+'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpAdd4641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2002:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpAdd4660); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2015:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2016:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2017:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4700);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4710); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2024:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2027:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2028:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2028:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2029:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4757);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA34_2 = input.LA(2);

                    if ( (synpred10_InternalSpec()) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA34_3 = input.LA(2);

                    if ( (synpred10_InternalSpec()) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA34_4 = input.LA(2);

                    if ( (synpred10_InternalSpec()) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA34_5 = input.LA(2);

                    if ( (synpred10_InternalSpec()) ) {
                        alt34=1;
                    }


                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2042:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2042:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2042:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2043:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2048:2: ( ( ruleOpMulti ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2049:1: ( ruleOpMulti )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2049:1: ( ruleOpMulti )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2050:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4810);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2063:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2064:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2064:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2065:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4833);
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
            	    break loop34;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2089:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2090:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2091:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4872);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4883); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2098:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2101:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2102:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2102:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt35=1;
                }
                break;
            case 40:
                {
                alt35=2;
                }
                break;
            case 41:
                {
                alt35=3;
                }
                break;
            case 42:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2103:2: kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleOpMulti4921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2110:2: kw= '**'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti4940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2117:2: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti4959); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2124:2: kw= '%'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti4978); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2137:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2138:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2139:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5018);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation5028); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2146:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2149:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2150:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2150:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26||LA36_0==39||LA36_0==43) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)||LA36_0==18||LA36_0==23||LA36_0==36||LA36_0==47||LA36_0==51||LA36_0==53||(LA36_0>=57 && LA36_0<=59)||LA36_0==62||(LA36_0>=64 && LA36_0<=71)) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2150:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2150:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2150:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2150:3: ()
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2151:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2156:2: ( ( ruleOpUnary ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2157:1: ( ruleOpUnary )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2157:1: ( ruleOpUnary )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2158:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5086);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2171:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2172:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2172:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2173:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5107);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2191:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5136);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2207:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2208:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2209:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary5172);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary5183); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2216:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2219:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2220:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2220:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt37=1;
                }
                break;
            case 39:
                {
                alt37=2;
                }
                break;
            case 26:
                {
                alt37=3;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2221:2: kw= '!'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary5221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2228:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary5240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2235:2: kw= '+'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpUnary5259); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2248:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2249:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2250:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5299);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5309); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2257:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2260:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2261:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2261:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2262:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5356);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==44) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred11_InternalSpec()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2272:5: ( () otherlv_2= 'as' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2272:6: () otherlv_2= 'as'
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2272:6: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2273:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXCastedExpression5391); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2282:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2283:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2283:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2284:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5414);
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
            	    break loop38;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2308:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2309:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2310:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5452);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall5462); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2317:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2320:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2321:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2321:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2322:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5509);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop46:
            do {
                int alt46=3;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA46_2 = input.LA(2);

                    if ( (synpred12_InternalSpec()) ) {
                        alt46=1;
                    }
                    else if ( (synpred13_InternalSpec()) ) {
                        alt46=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA46_3 = input.LA(2);

                    if ( (synpred13_InternalSpec()) ) {
                        alt46=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA46_4 = input.LA(2);

                    if ( (synpred13_InternalSpec()) ) {
                        alt46=2;
                    }


                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2336:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2336:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2336:26: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2337:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall5558); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2346:1: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2347:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2347:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2348:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5581);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5597);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2369:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2370:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2370:1: (lv_value_5_0= ruleXAssignment )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2371:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5619);
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
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2404:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2404:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2404:8: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2405:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2410:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt39=3;
            	    switch ( input.LA(1) ) {
            	    case 15:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2410:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall5705); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2415:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2415:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2416:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2416:1: (lv_nullSafe_8_0= '?.' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2417:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall5729); if (state.failed) return current;
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
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2431:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2431:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2432:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2432:1: (lv_spreading_9_0= '*.' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2433:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall5766); if (state.failed) return current;
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2446:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==36) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2446:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall5795); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2450:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2451:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2451:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2452:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5816);
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

            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2468:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop40:
            	            do {
            	                int alt40=2;
            	                int LA40_0 = input.LA(1);

            	                if ( (LA40_0==24) ) {
            	                    alt40=1;
            	                }


            	                switch (alt40) {
            	            	case 1 :
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2468:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall5829); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2472:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2473:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2473:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2474:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5850);
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
            	            	    break loop40;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall5864); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2494:3: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2495:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2495:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2496:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5889);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2509:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt44=2;
            	    alt44 = dfa44.predict(input);
            	    switch (alt44) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2509:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2509:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2509:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2516:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2517:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall5923); if (state.failed) return current;
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

            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2530:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt43=3;
            	            alt43 = dfa43.predict(input);
            	            switch (alt43) {
            	                case 1 :
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2530:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2530:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2530:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2547:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2548:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6008);
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
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2565:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2565:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2565:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2565:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2566:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2566:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2567:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6036);
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

            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2583:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop42:
            	                    do {
            	                        int alt42=2;
            	                        int LA42_0 = input.LA(1);

            	                        if ( (LA42_0==24) ) {
            	                            alt42=1;
            	                        }


            	                        switch (alt42) {
            	                    	case 1 :
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2583:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall6049); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2587:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2588:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2588:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2589:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6070);
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
            	                    	    break loop42;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall6087); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2609:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt45=2;
            	    alt45 = dfa45.predict(input);
            	    switch (alt45) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2609:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2614:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2615:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall6120);
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
            	    break loop46;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2639:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2640:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2641:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6160);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression6170); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2648:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2651:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2652:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2652:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt47=13;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt47=1;
                }
                break;
            case 18:
                {
                alt47=2;
                }
                break;
            case 53:
                {
                alt47=3;
                }
                break;
            case RULE_ID:
            case 36:
            case 62:
                {
                alt47=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 47:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt47=5;
                }
                break;
            case 51:
                {
                alt47=6;
                }
                break;
            case 57:
                {
                alt47=7;
                }
                break;
            case 58:
                {
                alt47=8;
                }
                break;
            case 59:
                {
                alt47=9;
                }
                break;
            case 69:
                {
                alt47=10;
                }
                break;
            case 70:
                {
                alt47=11;
                }
                break;
            case 71:
                {
                alt47=12;
                }
                break;
            case 23:
                {
                alt47=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2653:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6217);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2663:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6244);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2673:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6271);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2683:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6298);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2693:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6325);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2703:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6352);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2713:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6379);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2723:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6406);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2733:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6433);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2743:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6460);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2753:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6487);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2763:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6514);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2773:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6541);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2789:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2790:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2791:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral6576);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral6586); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2798:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2801:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2802:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2802:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt48=1;
                }
                break;
            case 65:
            case 66:
                {
                alt48=2;
                }
                break;
            case RULE_INT:
                {
                alt48=3;
                }
                break;
            case 67:
                {
                alt48=4;
                }
                break;
            case RULE_STRING:
                {
                alt48=5;
                }
                break;
            case 68:
                {
                alt48=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2803:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral6633);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2813:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6660);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2823:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral6687);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2833:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6714);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2843:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6741);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2853:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6768);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2869:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2870:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2871:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6803);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6813); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2878:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2881:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2882:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2882:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2882:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2882:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2883:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXClosure6859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2892:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2892:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2907:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2907:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2907:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_ID||LA50_0==23||LA50_0==74) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2907:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2907:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2908:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2908:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2909:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6930);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2925:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==24) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2925:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXClosure6943); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2929:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2930:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2930:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2931:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6964);
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
                            	    break loop49;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2947:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2948:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2948:1: (lv_explicitSyntax_5_0= '|' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2949:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,48,FOLLOW_48_in_ruleXClosure6986); if (state.failed) return current;
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2962:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2963:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2963:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2964:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure7023);
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

            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleXClosure7035); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2992:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2993:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2994:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure7071);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure7081); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3001:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3004:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3005:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3005:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3005:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3005:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3006:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3011:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)||LA53_0==18||LA53_0==23||LA53_0==26||LA53_0==36||LA53_0==39||LA53_0==43||LA53_0==47||LA53_0==51||LA53_0==53||(LA53_0>=57 && LA53_0<=62)||(LA53_0>=64 && LA53_0<=71)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3011:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3011:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3012:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3012:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3013:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure7137);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3029:2: (otherlv_2= ';' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==50) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3029:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXExpressionInClosure7150); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3041:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3042:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3043:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7190);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure7200); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3050:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3053:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3054:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3054:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3054:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3054:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3054:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3070:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3070:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3070:7: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3071:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3076:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||LA55_0==23||LA55_0==74) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3076:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3076:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3077:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3077:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3078:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7308);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3094:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==24) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3094:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXShortClosure7321); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3098:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3099:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3099:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3100:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7342);
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
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3116:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3117:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3117:1: (lv_explicitSyntax_4_0= '|' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3118:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,48,FOLLOW_48_in_ruleXShortClosure7364); if (state.failed) return current;
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3131:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3132:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3132:1: (lv_expression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3133:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7400);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3157:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3158:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3159:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7436);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression7446); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3166:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3169:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3170:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3170:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3170:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleXParenthesizedExpression7483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7505);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXParenthesizedExpression7516); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3195:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3196:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3197:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7552);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7562); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3204:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3207:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3208:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3208:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3208:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3208:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3209:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression7608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXIfExpression7620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3222:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3223:1: (lv_if_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3223:1: (lv_if_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3224:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7641);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXIfExpression7653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3244:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3245:1: (lv_then_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3245:1: (lv_then_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3246:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7674);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3262:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==52) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred19_InternalSpec()) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3262:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3262:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3262:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression7695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3267:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3268:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3268:1: (lv_else_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3269:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7717);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3293:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3294:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3295:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7755);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7765); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3302:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3305:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3306:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3306:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3306:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3306:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3307:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression7811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3316:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==54) && (synpred20_InternalSpec())) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3316:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3321:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3321:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3321:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3322:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3322:1: (lv_localVarName_2_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3323:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7852);
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

                    otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression7864); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3343:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3344:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3344:1: (lv_switch_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3345:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7888);
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression7900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3365:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||LA58_0==23||LA58_0==54||LA58_0==56||LA58_0==74) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3366:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3366:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3367:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7921);
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
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3383:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==55) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3383:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression7947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3391:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3392:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3392:1: (lv_default_9_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3393:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7968);
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

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression7982); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3421:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3422:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3423:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart8018);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart8028); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3430:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3433:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3434:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3434:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3434:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3434:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID||LA60_0==23||LA60_0==74) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3435:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3435:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3436:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8074);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3452:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==56) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3452:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart8088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3456:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3457:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3457:1: (lv_case_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3458:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8109);
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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXCasePart8123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3478:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3479:1: (lv_then_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3479:1: (lv_then_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3480:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8144);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3504:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3505:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3506:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8180);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression8190); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3513:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3516:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3517:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3517:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3517:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3517:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3518:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression8236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXForLoopExpression8248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3531:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3532:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3532:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3533:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8269);
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

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression8281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3553:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3554:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3554:1: (lv_forExpression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3555:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8302);
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

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXForLoopExpression8314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3575:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3576:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3576:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3577:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8335);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3601:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3602:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3603:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8371);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8381); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3610:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3613:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3614:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3614:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3614:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3614:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3615:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXWhileExpression8427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXWhileExpression8439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3628:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3629:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3629:1: (lv_predicate_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3630:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8460);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXWhileExpression8472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3650:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3651:1: (lv_body_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3651:1: (lv_body_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3652:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8493);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3676:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3677:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3678:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8529);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8539); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3685:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3688:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3689:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3689:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3689:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3689:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3690:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression8585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3699:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3700:1: (lv_body_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3700:1: (lv_body_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3701:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8606);
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

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression8618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXDoWhileExpression8630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3725:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3726:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3726:1: (lv_predicate_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3727:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8651);
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

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXDoWhileExpression8663); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3755:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3756:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3757:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8699);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8709); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3764:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3767:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3768:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3768:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3768:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3768:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3769:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXBlockExpression8755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3778:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_ID)||LA63_0==18||LA63_0==23||LA63_0==26||LA63_0==36||LA63_0==39||LA63_0==43||LA63_0==47||LA63_0==51||LA63_0==53||(LA63_0>=57 && LA63_0<=62)||(LA63_0>=64 && LA63_0<=71)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3778:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3778:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3779:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3779:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3780:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8777);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3796:2: (otherlv_3= ';' )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==50) ) {
            	        alt62=1;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3796:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXBlockExpression8790); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXBlockExpression8806); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3812:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3813:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3814:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8842);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8852); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3821:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3824:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3825:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3825:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=60 && LA64_0<=61)) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_ID)||LA64_0==18||LA64_0==23||LA64_0==26||LA64_0==36||LA64_0==39||LA64_0==43||LA64_0==47||LA64_0==51||LA64_0==53||(LA64_0>=57 && LA64_0<=59)||LA64_0==62||(LA64_0>=64 && LA64_0<=71)) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3826:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8899);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3836:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8926);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3852:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3853:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3854:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8961);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8971); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3861:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3864:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3865:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3865:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3865:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3865:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3866:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3871:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==60) ) {
                alt65=1;
            }
            else if ( (LA65_0==61) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3871:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3871:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3872:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3872:1: (lv_writeable_1_0= 'var' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3873:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration9024); if (state.failed) return current;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3887:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration9055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3891:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (synpred21_InternalSpec()) ) {
                    alt66=1;
                }
                else if ( (true) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA66_0==23) && (synpred21_InternalSpec())) {
                alt66=1;
            }
            else if ( (LA66_0==74) && (synpred21_InternalSpec())) {
                alt66=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3891:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3891:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3891:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3899:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3899:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3899:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3900:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3900:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3901:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9103);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3917:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3918:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3918:1: (lv_name_4_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3919:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration9124);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3936:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3936:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3937:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3937:1: (lv_name_5_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3938:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration9153);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3954:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==20) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3954:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleXVariableDeclaration9167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3958:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3959:1: (lv_right_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3960:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9188);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3984:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3985:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3986:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9226);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter9236); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3993:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3996:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3997:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3997:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3997:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3997:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==RULE_ID||LA68_1==15||LA68_1==36||LA68_1==47) ) {
                    alt68=1;
                }
            }
            else if ( (LA68_0==23||LA68_0==74) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3998:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3998:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3999:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9282);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4015:3: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4016:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4016:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4017:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter9304);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4041:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4042:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4043:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter9340);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter9350); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4050:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4053:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4054:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4054:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4054:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4054:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4055:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4055:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4056:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9396);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4072:2: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4073:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4073:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4074:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9417);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4098:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4099:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4100:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9453);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall9463); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4107:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4110:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4111:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4111:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4111:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4111:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4112:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4117:2: ( ( ruleStaticQualifier ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==63) ) {
                    alt69=1;
                }
            }
            switch (alt69) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4118:1: ( ruleStaticQualifier )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4118:1: ( ruleStaticQualifier )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4119:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9520);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4132:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==36) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4132:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall9534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4136:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4137:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4137:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4138:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9555);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4154:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==24) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4154:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall9568); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4158:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4159:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4159:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4160:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9589);
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
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleXFeatureCall9603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4180:3: ( ( ruleIdOrSuper ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4181:1: ( ruleIdOrSuper )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4181:1: ( ruleIdOrSuper )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4182:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9628);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4195:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4195:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4195:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4195:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4202:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4203:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall9662); if (state.failed) return current;
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4216:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt73=3;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4216:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4216:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4216:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4233:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4234:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9747);
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
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4251:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4251:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4251:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4251:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4252:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4252:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4253:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9775);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4269:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==24) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4269:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall9788); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4273:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4274:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4274:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4275:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9809);
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
                            	    break loop72;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall9826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4295:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4295:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4300:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4301:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9859);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4325:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4326:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4327:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9897);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9908); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4334:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4337:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4338:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4338:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            else if ( (LA76_0==62) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4339:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9955);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4351:2: kw= 'super'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleIdOrSuper9979); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4364:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4365:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4366:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10020);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier10031); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4373:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4376:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4377:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4377:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_ID) ) {
                    int LA77_1 = input.LA(2);

                    if ( (LA77_1==63) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4378:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier10078);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,63,FOLLOW_63_in_ruleStaticQualifier10096); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4402:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4403:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4404:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10137);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall10147); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4411:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4414:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4415:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4415:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4415:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4415:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4416:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXConstructorCall10193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4425:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4426:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4426:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4427:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10216);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4440:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==36) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4440:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall10229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4444:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4445:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4445:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4446:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10250);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4462:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==24) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4462:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall10263); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4466:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4467:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4467:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4468:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10284);
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
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleXConstructorCall10298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall10312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4492:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt81=3;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4492:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4492:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4492:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4509:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4510:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10384);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4527:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4527:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4527:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4527:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4528:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4528:1: (lv_arguments_10_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4529:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10412);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4545:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==24) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4545:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall10425); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4549:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4550:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4550:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4551:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10446);
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
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall10463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4571:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4571:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4576:1: (lv_arguments_14_0= ruleXClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4577:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall10494);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4601:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4602:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4603:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10531);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10541); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4610:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4613:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4614:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4614:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4614:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4614:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4615:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4620:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==65) ) {
                alt83=1;
            }
            else if ( (LA83_0==66) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4620:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral10588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4625:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4625:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4626:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4626:1: (lv_isTrue_2_0= 'true' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4627:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral10612); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4648:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4649:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4650:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10662);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10672); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4657:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4660:28: ( ( () otherlv_1= 'null' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4661:1: ( () otherlv_1= 'null' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4661:1: ( () otherlv_1= 'null' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4661:2: () otherlv_1= 'null'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4661:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4662:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXNullLiteral10718); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4679:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4680:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4681:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10754);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral10764); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4688:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4691:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4692:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4692:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4692:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4692:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4693:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4698:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4699:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4699:1: (lv_value_1_0= RULE_INT )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4700:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral10815); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4724:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4725:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4726:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10856);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10866); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4733:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4736:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4737:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4737:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4737:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4737:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4738:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4743:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4744:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4744:1: (lv_value_1_0= RULE_STRING )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4745:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10917); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4769:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4770:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4771:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10958);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10968); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4778:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4781:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4782:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4782:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4782:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4782:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4783:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTypeLiteral11014); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXTypeLiteral11026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4796:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4797:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4797:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4798:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11049);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXTypeLiteral11061); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4823:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4824:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4825:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11097);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression11107); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4832:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4835:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4836:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4836:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4836:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4836:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4837:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXThrowExpression11153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4846:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4847:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4847:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4848:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression11174);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4872:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4873:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4874:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11210);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression11220); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4881:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4884:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4885:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4885:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4885:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4885:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4886:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXReturnExpression11266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4895:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4895:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4900:1: (lv_expression_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4901:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression11297);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4925:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4926:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4927:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11334);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11344); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4934:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4937:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4938:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4938:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4938:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4938:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4939:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression11390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4948:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4949:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4949:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4950:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11411);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4966:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==73) ) {
                alt87=1;
            }
            else if ( (LA87_0==72) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4966:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4966:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4966:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4966:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==73) ) {
                            int LA85_2 = input.LA(2);

                            if ( (synpred28_InternalSpec()) ) {
                                alt85=1;
                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4966:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4968:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4969:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11441);
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
                    	    if ( cnt85 >= 1 ) break loop85;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4985:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==72) ) {
                        int LA86_1 = input.LA(2);

                        if ( (synpred29_InternalSpec()) ) {
                            alt86=1;
                        }
                    }
                    switch (alt86) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4985:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4985:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4985:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression11463); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4990:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4991:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4991:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4992:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11485);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5009:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5009:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5009:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression11507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5013:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5014:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5014:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5015:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11528);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5039:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5040:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5041:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11566);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11576); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5048:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5051:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5052:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5052:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5052:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5052:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5052:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleXCatchClause11621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleXCatchClause11634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5061:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5062:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5062:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5063:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11655);
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXCatchClause11667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5083:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5084:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5084:1: (lv_expression_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5085:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11688);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5109:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5110:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5111:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11725);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11736); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5118:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5121:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5122:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5122:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5123:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11783);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5133:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==15) ) {
                    int LA88_2 = input.LA(2);

                    if ( (LA88_2==RULE_ID) ) {
                        int LA88_3 = input.LA(3);

                        if ( (synpred31_InternalSpec()) ) {
                            alt88=1;
                        }


                    }


                }


                switch (alt88) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5133:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5133:2: ( ( '.' )=>kw= '.' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5133:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName11811); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11834);
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
            	    break loop88;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5160:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5161:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5162:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11881);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11891); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5169:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5172:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5173:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5173:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID) ) {
                alt90=1;
            }
            else if ( (LA90_0==23||LA90_0==74) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5173:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5173:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5174:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11939);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5182:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==47) ) {
                            int LA89_2 = input.LA(2);

                            if ( (LA89_2==49) ) {
                                int LA89_3 = input.LA(3);

                                if ( (synpred32_InternalSpec()) ) {
                                    alt89=1;
                                }


                            }


                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5182:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5185:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5185:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5185:6: ()
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5186:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleJvmTypeReference11977); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleJvmTypeReference11989); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5201:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12021);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5217:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5218:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5219:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12056);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef12066); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5226:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5229:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5230:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5230:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5230:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5230:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==23) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5230:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleXFunctionTypeRef12104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5234:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5235:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5235:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5236:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12125);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5252:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==24) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5252:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXFunctionTypeRef12138); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5256:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5257:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5257:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5258:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12159);
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
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXFunctionTypeRef12173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleXFunctionTypeRef12187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5282:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5283:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5283:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5284:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12208);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5308:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5309:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5310:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12244);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12254); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5317:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5320:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5321:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5321:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5321:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5321:2: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5322:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5322:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5323:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12302);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5336:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt94=2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5336:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5336:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5336:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference12323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5341:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5342:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5342:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5343:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12345);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5359:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==24) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5359:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference12358); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5363:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5364:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5364:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5365:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12379);
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
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleJvmParameterizedTypeReference12393); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5393:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5394:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5395:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12431);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12441); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5402:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5405:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5406:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5406:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID||LA95_0==23||LA95_0==74) ) {
                alt95=1;
            }
            else if ( (LA95_0==75) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5407:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12488);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5417:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12515);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5433:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5434:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5435:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12550);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12560); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5442:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5445:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5446:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5446:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5446:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5446:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5447:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleJvmWildcardTypeReference12606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5456:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt96=3;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==76) ) {
                alt96=1;
            }
            else if ( (LA96_0==62) ) {
                alt96=2;
            }
            switch (alt96) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5456:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5456:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5457:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5457:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5458:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12628);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5475:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5475:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5476:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5476:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5477:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12655);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5501:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5502:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5503:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12693);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12703); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5510:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5513:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5514:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5514:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5514:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBound12740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5518:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5519:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5519:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5520:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12761);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5544:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5545:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5546:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12797);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12807); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5553:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5556:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5557:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5557:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5557:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBoundAnded12844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5561:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5562:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5562:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5563:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12865);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5587:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5588:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5589:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12901);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12911); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5596:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5599:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5600:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5600:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5600:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleJvmLowerBound12948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5604:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5605:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5605:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5606:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12969);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5632:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5633:2: (iv_ruleValidID= ruleValidID EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5634:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID13008);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID13019); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5641:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5644:28: (this_ID_0= RULE_ID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5645:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID13058); if (state.failed) return current;
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:690:4: ( '(' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:690:6: '('
        {
        match(input,23,FOLLOW_23_in_synpred1_InternalSpec1413); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSpec

    // $ANTLR start synpred2_InternalSpec
    public final void synpred2_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1233:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1233:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1233:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1233:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1233:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1234:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1234:2: ( ( ruleOpMultiAssign ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1235:1: ( ruleOpMultiAssign )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1235:1: ( ruleOpMultiAssign )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1236:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred2_InternalSpec2684);
        ruleOpMultiAssign();

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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:4: ( () ( ( ruleOpOr ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:5: () ( ( ruleOpOr ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1362:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1362:2: ( ( ruleOpOr ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1363:1: ( ruleOpOr )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1363:1: ( ruleOpOr )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1364:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred3_InternalSpec3032);
        ruleOpOr();

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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1462:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1462:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1462:4: ( () ( ( ruleOpAnd ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1462:5: () ( ( ruleOpAnd ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1462:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1463:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1463:2: ( ( ruleOpAnd ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:1: ( ruleOpAnd )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1464:1: ( ruleOpAnd )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1465:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred4_InternalSpec3291);
        ruleOpAnd();

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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1563:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1563:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1563:4: ( () ( ( ruleOpEquality ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1563:5: () ( ( ruleOpEquality ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1563:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1564:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1564:2: ( ( ruleOpEquality ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1565:1: ( ruleOpEquality )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1565:1: ( ruleOpEquality )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1566:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred5_InternalSpec3550);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalSpec

    // $ANTLR start synpred6_InternalSpec
    public final void synpred6_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:4: ( ( () 'instanceof' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:5: ( () 'instanceof' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:5: ( () 'instanceof' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:6: () 'instanceof'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1671:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1672:1: 
        {
        }

        match(input,32,FOLLOW_32_in_synpred6_InternalSpec3826); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalSpec

    // $ANTLR start synpred7_InternalSpec
    public final void synpred7_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:9: ( () ( ( ruleOpCompare ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:10: () ( ( ruleOpCompare ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1699:10: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1700:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1700:2: ( ( ruleOpCompare ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1701:1: ( ruleOpCompare )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1701:1: ( ruleOpCompare )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1702:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred7_InternalSpec3899);
        ruleOpCompare();

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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1821:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1821:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1821:4: ( () ( ( ruleOpOther ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1821:5: () ( ( ruleOpOther ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1821:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1822:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1822:2: ( ( ruleOpOther ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1823:1: ( ruleOpOther )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1823:1: ( ruleOpOther )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1824:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred8_InternalSpec4218);
        ruleOpOther();

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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1929:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1929:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1929:4: ( () ( ( ruleOpAdd ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1929:5: () ( ( ruleOpAdd ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1929:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1930:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1930:2: ( ( ruleOpAdd ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1931:1: ( ruleOpAdd )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1931:1: ( ruleOpAdd )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1932:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred9_InternalSpec4498);
        ruleOpAdd();

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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:4: ( () ( ( ruleOpMulti ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:5: () ( ( ruleOpMulti ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2037:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2038:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2038:2: ( ( ruleOpMulti ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2039:1: ( ruleOpMulti )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2039:1: ( ruleOpMulti )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2040:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred10_InternalSpec4778);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalSpec

    // $ANTLR start synpred11_InternalSpec
    public final void synpred11_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:3: ( ( () 'as' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:4: ( () 'as' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:4: ( () 'as' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:5: () 'as'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2270:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2271:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred11_InternalSpec5372); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSpec

    // $ANTLR start synpred12_InternalSpec
    public final void synpred12_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2330:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2331:1: 
        {
        }

        match(input,15,FOLLOW_15_in_synpred12_InternalSpec5526); if (state.failed) return ;
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2332:1: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2334:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred12_InternalSpec5535);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred12_InternalSpec5541);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalSpec

    // $ANTLR start synpred13_InternalSpec
    public final void synpred13_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:10: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2389:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2389:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt97=3;
        switch ( input.LA(1) ) {
        case 15:
            {
            alt97=1;
            }
            break;
        case 45:
            {
            alt97=2;
            }
            break;
        case 46:
            {
            alt97=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 97, 0, input);

            throw nvae;
        }

        switch (alt97) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2389:4: '.'
                {
                match(input,15,FOLLOW_15_in_synpred13_InternalSpec5644); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2391:6: ( ( '?.' ) )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2391:6: ( ( '?.' ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2392:1: ( '?.' )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2392:1: ( '?.' )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2393:2: '?.'
                {
                match(input,45,FOLLOW_45_in_synpred13_InternalSpec5658); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2398:6: ( ( '*.' ) )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2398:6: ( ( '*.' ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2399:1: ( '*.' )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2399:1: ( '*.' )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2400:2: '*.'
                {
                match(input,46,FOLLOW_46_in_synpred13_InternalSpec5678); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalSpec

    // $ANTLR start synpred14_InternalSpec
    public final void synpred14_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2509:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2510:1: ( '(' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2510:1: ( '(' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2511:2: '('
        {
        match(input,23,FOLLOW_23_in_synpred14_InternalSpec5905); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalSpec

    // $ANTLR start synpred15_InternalSpec
    public final void synpred15_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2530:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2530:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2530:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2530:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2530:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2531:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2531:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==23||LA99_0==74) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2531:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2531:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2532:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2532:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2533:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalSpec5957);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2535:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==24) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2535:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred15_InternalSpec5964); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2536:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2537:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2537:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2538:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalSpec5971);
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

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2540:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2541:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2541:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2542:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred15_InternalSpec5985); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalSpec

    // $ANTLR start synpred16_InternalSpec
    public final void synpred16_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2609:4: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2610:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2610:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2611:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred16_InternalSpec6103);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalSpec

    // $ANTLR start synpred17_InternalSpec
    public final void synpred17_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2892:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2892:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2892:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2892:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2892:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==23||LA101_0==74) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2892:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2892:5: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2893:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2893:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2894:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred17_InternalSpec6876);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2896:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==24) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2896:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred17_InternalSpec6883); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2897:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2898:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2898:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2899:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred17_InternalSpec6890);
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

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2901:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2902:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2902:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2903:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred17_InternalSpec6904); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalSpec

    // $ANTLR start synpred19_InternalSpec
    public final void synpred19_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3262:4: ( 'else' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3262:6: 'else'
        {
        match(input,52,FOLLOW_52_in_synpred19_InternalSpec7687); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalSpec

    // $ANTLR start synpred20_InternalSpec
    public final void synpred20_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3316:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3316:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3316:3: ( ( ( ruleValidID ) ) ':' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3316:4: ( ( ruleValidID ) ) ':'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3316:4: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3317:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3317:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3318:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalSpec7827);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,54,FOLLOW_54_in_synpred20_InternalSpec7833); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalSpec

    // $ANTLR start synpred21_InternalSpec
    public final void synpred21_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3891:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3891:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3891:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3891:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3891:6: ( ( ruleJvmTypeReference ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3892:1: ( ruleJvmTypeReference )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3892:1: ( ruleJvmTypeReference )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3893:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred21_InternalSpec9073);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3895:2: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3896:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3896:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3897:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalSpec9082);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalSpec

    // $ANTLR start synpred22_InternalSpec
    public final void synpred22_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4195:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4196:1: ( '(' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4196:1: ( '(' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4197:2: '('
        {
        match(input,23,FOLLOW_23_in_synpred22_InternalSpec9644); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalSpec

    // $ANTLR start synpred23_InternalSpec
    public final void synpred23_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4216:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4216:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4216:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4216:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4216:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4217:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4217:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==RULE_ID||LA105_0==23||LA105_0==74) ) {
            alt105=1;
        }
        switch (alt105) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4217:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4217:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4218:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4218:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4219:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalSpec9696);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4221:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop104:
                do {
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==24) ) {
                        alt104=1;
                    }


                    switch (alt104) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4221:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred23_InternalSpec9703); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4222:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4223:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4223:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4224:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalSpec9710);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop104;
                    }
                } while (true);


                }
                break;

        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4226:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4227:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4227:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4228:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred23_InternalSpec9724); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalSpec

    // $ANTLR start synpred24_InternalSpec
    public final void synpred24_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4295:4: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4296:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4296:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4297:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred24_InternalSpec9842);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalSpec

    // $ANTLR start synpred25_InternalSpec
    public final void synpred25_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4492:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4492:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4492:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4492:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4492:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4493:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4493:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt107=2;
        int LA107_0 = input.LA(1);

        if ( (LA107_0==RULE_ID||LA107_0==23||LA107_0==74) ) {
            alt107=1;
        }
        switch (alt107) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4493:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4493:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4494:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4494:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4495:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalSpec10333);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4497:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop106:
                do {
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==24) ) {
                        alt106=1;
                    }


                    switch (alt106) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4497:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred25_InternalSpec10340); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4498:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4499:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4499:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4500:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalSpec10347);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop106;
                    }
                } while (true);


                }
                break;

        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4502:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4503:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4503:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4504:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred25_InternalSpec10361); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalSpec

    // $ANTLR start synpred26_InternalSpec
    public final void synpred26_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4571:2: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4572:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4572:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4573:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred26_InternalSpec10477);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSpec

    // $ANTLR start synpred27_InternalSpec
    public final void synpred27_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4895:2: ( ( ruleXExpression ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4896:1: ( ruleXExpression )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4896:1: ( ruleXExpression )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4897:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred27_InternalSpec11280);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalSpec

    // $ANTLR start synpred28_InternalSpec
    public final void synpred28_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4966:5: ( 'catch' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4966:7: 'catch'
        {
        match(input,73,FOLLOW_73_in_synpred28_InternalSpec11425); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalSpec

    // $ANTLR start synpred29_InternalSpec
    public final void synpred29_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4985:5: ( 'finally' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4985:7: 'finally'
        {
        match(input,72,FOLLOW_72_in_synpred29_InternalSpec11455); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalSpec

    // $ANTLR start synpred31_InternalSpec
    public final void synpred31_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5133:3: ( '.' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5134:2: '.'
        {
        match(input,15,FOLLOW_15_in_synpred31_InternalSpec11802); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalSpec

    // $ANTLR start synpred32_InternalSpec
    public final void synpred32_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5182:2: ( ( () '[' ']' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5182:3: ( () '[' ']' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5182:3: ( () '[' ']' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5182:4: () '[' ']'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5182:4: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5183:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred32_InternalSpec11954); if (state.failed) return ;
        match(input,49,FOLLOW_49_in_synpred32_InternalSpec11958); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalSpec

    // $ANTLR start synpred33_InternalSpec
    public final void synpred33_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5336:4: ( '<' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5336:6: '<'
        {
        match(input,36,FOLLOW_36_in_synpred33_InternalSpec12315); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalSpec

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
    public final boolean synpred17_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSpec_fragment(); // can never throw exception
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
    public final boolean synpred33_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSpec_fragment(); // can never throw exception
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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA94 dfa94 = new DFA94(this);
    static final String DFA5_eotS =
        "\7\uffff";
    static final String DFA5_eofS =
        "\2\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String DFA5_minS =
        "\1\6\1\uffff\1\14\1\6\1\uffff\1\14\1\uffff";
    static final String DFA5_maxS =
        "\1\15\1\uffff\1\26\1\20\1\uffff\1\26\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String DFA5_specialS =
        "\7\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\6\uffff\1\1",
            "",
            "\1\4\2\uffff\1\3\1\uffff\1\4\4\uffff\1\4",
            "\1\5\11\uffff\1\6",
            "",
            "\1\4\2\uffff\1\3\1\uffff\1\4\4\uffff\1\4",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "163:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) )";
        }
    }
    static final String DFA12_eotS =
        "\6\uffff";
    static final String DFA12_eofS =
        "\1\2\1\4\4\uffff";
    static final String DFA12_minS =
        "\2\4\1\uffff\1\6\1\uffff\1\6";
    static final String DFA12_maxS =
        "\2\112\1\uffff\1\112\1\uffff\1\112";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA12_specialS =
        "\6\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\1\1\12\uffff\3\2\1\uffff\3\2\62\uffff\1\2",
            "\1\4\1\uffff\1\3\10\uffff\1\2\1\uffff\3\4\1\uffff\3\4\14\uffff"+
            "\1\2\12\uffff\1\2\32\uffff\1\4",
            "",
            "\1\5\10\uffff\1\4\1\uffff\1\2\1\uffff\5\2\14\uffff\1\4\12\uffff"+
            "\1\4\32\uffff\1\2",
            "",
            "\1\3\10\uffff\1\2\1\uffff\1\4\1\uffff\5\4\14\uffff\1\2\12\uffff"+
            "\1\2\32\uffff\1\4"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "591:2: ( ( ruleValidID ) )?";
        }
    }
    static final String DFA44_eotS =
        "\77\uffff";
    static final String DFA44_eofS =
        "\1\2\76\uffff";
    static final String DFA44_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA44_maxS =
        "\1\112\1\0\75\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA44_transitionS = {
            "\3\2\10\uffff\5\2\1\uffff\2\2\1\1\30\2\1\uffff\16\2\1\uffff"+
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

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "2509:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\34\uffff";
    static final String DFA43_eofS =
        "\34\uffff";
    static final String DFA43_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA43_maxS =
        "\1\112\2\0\31\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA43_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\5\1\1\13\uffff\1\5\4\uffff\1\2\1\uffff\1\33\1\5\11\uffff"+
            "\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "2530:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_0==RULE_ID) ) {s = 1;}

                        else if ( (LA43_0==23) ) {s = 2;}

                        else if ( (LA43_0==74) && (synpred15_InternalSpec())) {s = 3;}

                        else if ( (LA43_0==48) && (synpred15_InternalSpec())) {s = 4;}

                        else if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_INT)||LA43_0==18||LA43_0==26||LA43_0==36||LA43_0==39||LA43_0==43||LA43_0==47||LA43_0==51||LA43_0==53||(LA43_0>=57 && LA43_0<=59)||LA43_0==62||(LA43_0>=64 && LA43_0<=71)) ) {s = 5;}

                        else if ( (LA43_0==25) ) {s = 27;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA45_eotS =
        "\77\uffff";
    static final String DFA45_eofS =
        "\1\2\76\uffff";
    static final String DFA45_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA45_maxS =
        "\1\112\1\0\75\uffff";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA45_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA45_transitionS = {
            "\3\2\10\uffff\5\2\1\uffff\32\2\1\1\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "2609:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\36\uffff";
    static final String DFA51_eofS =
        "\36\uffff";
    static final String DFA51_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA51_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA51_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA51_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\5\1\1\13\uffff\1\5\4\uffff\1\2\2\uffff\1\5\11\uffff\1\5\2"+
            "\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\6\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "2892:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_0 = input.LA(1);

                         
                        int index51_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA51_0==RULE_ID) ) {s = 1;}

                        else if ( (LA51_0==23) ) {s = 2;}

                        else if ( (LA51_0==74) && (synpred17_InternalSpec())) {s = 3;}

                        else if ( (LA51_0==48) && (synpred17_InternalSpec())) {s = 4;}

                        else if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_INT)||LA51_0==18||LA51_0==26||LA51_0==36||LA51_0==39||LA51_0==43||LA51_0==47||LA51_0==49||LA51_0==51||LA51_0==53||(LA51_0>=57 && LA51_0<=62)||(LA51_0>=64 && LA51_0<=71)) ) {s = 5;}

                         
                        input.seek(index51_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_2 = input.LA(1);

                         
                        int index51_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\77\uffff";
    static final String DFA74_eofS =
        "\1\2\76\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA74_maxS =
        "\1\112\1\0\75\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA74_transitionS = {
            "\3\2\10\uffff\5\2\1\uffff\2\2\1\1\30\2\1\uffff\16\2\1\uffff"+
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
            return "4195:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred22_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
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
    static final String DFA73_eotS =
        "\34\uffff";
    static final String DFA73_eofS =
        "\34\uffff";
    static final String DFA73_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA73_maxS =
        "\1\112\2\0\31\uffff";
    static final String DFA73_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA73_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA73_transitionS = {
            "\2\5\1\1\13\uffff\1\5\4\uffff\1\2\1\uffff\1\33\1\5\11\uffff"+
            "\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "4216:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_0 = input.LA(1);

                         
                        int index73_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA73_0==RULE_ID) ) {s = 1;}

                        else if ( (LA73_0==23) ) {s = 2;}

                        else if ( (LA73_0==74) && (synpred23_InternalSpec())) {s = 3;}

                        else if ( (LA73_0==48) && (synpred23_InternalSpec())) {s = 4;}

                        else if ( ((LA73_0>=RULE_STRING && LA73_0<=RULE_INT)||LA73_0==18||LA73_0==26||LA73_0==36||LA73_0==39||LA73_0==43||LA73_0==47||LA73_0==51||LA73_0==53||(LA73_0>=57 && LA73_0<=59)||LA73_0==62||(LA73_0>=64 && LA73_0<=71)) ) {s = 5;}

                        else if ( (LA73_0==25) ) {s = 27;}

                         
                        input.seek(index73_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_2);
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
    static final String DFA75_eotS =
        "\77\uffff";
    static final String DFA75_eofS =
        "\1\2\76\uffff";
    static final String DFA75_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA75_maxS =
        "\1\112\1\0\75\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA75_transitionS = {
            "\3\2\10\uffff\5\2\1\uffff\32\2\1\1\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "4295:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\34\uffff";
    static final String DFA81_eofS =
        "\34\uffff";
    static final String DFA81_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA81_maxS =
        "\1\112\2\0\31\uffff";
    static final String DFA81_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA81_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA81_transitionS = {
            "\2\5\1\1\13\uffff\1\5\4\uffff\1\2\1\uffff\1\33\1\5\11\uffff"+
            "\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "4492:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_0 = input.LA(1);

                         
                        int index81_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA81_0==RULE_ID) ) {s = 1;}

                        else if ( (LA81_0==23) ) {s = 2;}

                        else if ( (LA81_0==74) && (synpred25_InternalSpec())) {s = 3;}

                        else if ( (LA81_0==48) && (synpred25_InternalSpec())) {s = 4;}

                        else if ( ((LA81_0>=RULE_STRING && LA81_0<=RULE_INT)||LA81_0==18||LA81_0==26||LA81_0==36||LA81_0==39||LA81_0==43||LA81_0==47||LA81_0==51||LA81_0==53||(LA81_0>=57 && LA81_0<=59)||LA81_0==62||(LA81_0>=64 && LA81_0<=71)) ) {s = 5;}

                        else if ( (LA81_0==25) ) {s = 27;}

                         
                        input.seek(index81_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_2 = input.LA(1);

                         
                        int index81_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index81_2);
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
    static final String DFA82_eotS =
        "\77\uffff";
    static final String DFA82_eofS =
        "\1\2\76\uffff";
    static final String DFA82_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA82_maxS =
        "\1\112\1\0\75\uffff";
    static final String DFA82_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA82_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA82_transitionS = {
            "\3\2\10\uffff\5\2\1\uffff\32\2\1\1\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "4571:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_1 = input.LA(1);

                         
                        int index82_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index82_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA84_eotS =
        "\77\uffff";
    static final String DFA84_eofS =
        "\1\31\76\uffff";
    static final String DFA84_minS =
        "\1\4\30\0\46\uffff";
    static final String DFA84_maxS =
        "\1\112\30\0\46\uffff";
    static final String DFA84_acceptS =
        "\31\uffff\1\2\44\uffff\1\1";
    static final String DFA84_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\46\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\17\1\15\1\1\10\uffff\3\31\1\6\1\31\1\uffff\2\31\1\30\2\31"+
            "\1\4\11\31\1\10\2\31\1\3\3\31\1\2\3\31\1\12\1\uffff\2\31\1\21"+
            "\1\31\1\7\3\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13\1\14"+
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
            return "4895:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA84_2 = input.LA(1);

                         
                        int index84_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA84_3 = input.LA(1);

                         
                        int index84_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA84_4 = input.LA(1);

                         
                        int index84_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA84_5 = input.LA(1);

                         
                        int index84_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA84_6 = input.LA(1);

                         
                        int index84_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA84_7 = input.LA(1);

                         
                        int index84_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA84_8 = input.LA(1);

                         
                        int index84_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA84_9 = input.LA(1);

                         
                        int index84_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA84_10 = input.LA(1);

                         
                        int index84_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA84_11 = input.LA(1);

                         
                        int index84_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA84_12 = input.LA(1);

                         
                        int index84_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA84_13 = input.LA(1);

                         
                        int index84_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA84_14 = input.LA(1);

                         
                        int index84_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA84_15 = input.LA(1);

                         
                        int index84_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA84_16 = input.LA(1);

                         
                        int index84_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA84_17 = input.LA(1);

                         
                        int index84_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA84_18 = input.LA(1);

                         
                        int index84_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA84_19 = input.LA(1);

                         
                        int index84_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA84_20 = input.LA(1);

                         
                        int index84_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA84_21 = input.LA(1);

                         
                        int index84_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA84_22 = input.LA(1);

                         
                        int index84_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA84_23 = input.LA(1);

                         
                        int index84_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA84_24 = input.LA(1);

                         
                        int index84_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_24);
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
    static final String DFA94_eotS =
        "\77\uffff";
    static final String DFA94_eofS =
        "\1\2\76\uffff";
    static final String DFA94_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA94_maxS =
        "\1\112\1\0\75\uffff";
    static final String DFA94_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA94_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA94_transitionS = {
            "\3\2\10\uffff\5\2\1\uffff\17\2\1\1\13\2\1\uffff\16\2\1\uffff"+
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

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "5336:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_1 = input.LA(1);

                         
                        int index94_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSpec()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index94_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecFile_in_entryRuleSpecFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSpecFile123 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSpecFile144 = new BitSet(new long[]{0x0000000000421002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleSpecFile167 = new BitSet(new long[]{0x0000000000421002L});
    public static final BitSet FOLLOW_ruleExampleGroup_in_ruleSpecFile189 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport273 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_13_in_ruleImport293 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_14_in_ruleImport324 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport361 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport373 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImport385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard538 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard556 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildCard569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleGroup_in_entryRuleExampleGroup609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleGroup619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotation_in_ruleExampleGroup674 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleExampleGroup693 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleExampleGroup729 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExampleGroup747 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExampleGroup765 = new BitSet(new long[]{0x0000000000EA0040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleMember_in_ruleExampleGroup786 = new BitSet(new long[]{0x0000000000EA0040L,0x0000000000000400L});
    public static final BitSet FOLLOW_19_in_ruleExampleGroup799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExample_in_ruleMember892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleMember919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleGroup_in_ruleMember946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleField1046 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleField1067 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleField1080 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleField1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExample_in_entryRuleExample1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExample1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleExample1201 = new BitSet(new long[]{0x0000000000040052L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExample1237 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExample1255 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleExample1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotation_in_entryRuleXAnnotation1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotation1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleXAnnotation1377 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXAnnotation1400 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleXAnnotation1421 = new BitSet(new long[]{0x4000801002C40070L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation1445 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleXAnnotation1458 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation1479 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotation1509 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXAnnotation1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotationElementValuePair_in_entryRuleXAnnotationElementValuePair1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotationElementValuePair1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAnnotationElementValuePair1619 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXAnnotationElementValuePair1631 = new BitSet(new long[]{0x4000801000C40070L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValuePair1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotationElementValueStringConcatenation_in_entryRuleXAnnotationElementValueStringConcatenation1688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotationElementValueStringConcatenation1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValueStringConcatenation1745 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleXAnnotationElementValueStringConcatenation1772 = new BitSet(new long[]{0x4000801000C40070L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValueStringConcatenation1806 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_entryRuleXAnnotationElementValue1844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotationElementValue1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotation_in_ruleXAnnotationElementValue1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotationValueArray_in_ruleXAnnotationElementValue1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXAnnotationElementValue1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXAnnotationElementValue1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXAnnotationElementValue2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXAnnotationElementValue2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotationValueFieldReference_in_ruleXAnnotationElementValue2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleXAnnotationElementValue2081 = new BitSet(new long[]{0x4000801000C40070L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleXAnnotationElementValueStringConcatenation_in_ruleXAnnotationElementValue2103 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXAnnotationElementValue2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotationValueFieldReference_in_entryRuleXAnnotationValueFieldReference2151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotationValueFieldReference2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXAnnotationValueFieldReference2218 = new BitSet(new long[]{0x4000001000000040L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXAnnotationValueFieldReference2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotationValueArray_in_entryRuleXAnnotationValueArray2278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAnnotationValueArray2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXAnnotationValueArray2334 = new BitSet(new long[]{0x4000801000C40070L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationValueArray2355 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_24_in_ruleXAnnotationValueArray2368 = new BitSet(new long[]{0x4000801000C40070L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationValueArray2389 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleXAnnotationValueArray2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression2439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2597 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2613 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2663 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2716 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpSingleAssign2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpMultiAssign2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3011 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression3064 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3087 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr3126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOr3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3270 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression3323 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3346 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd3385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAnd3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3529 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3582 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3605 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpEquality3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3809 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_32_in_ruleXRelationalExpression3845 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3870 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3931 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3954 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4197 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4250 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4273 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther4312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4477 = new BitSet(new long[]{0x0000008004000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4530 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4553 = new BitSet(new long[]{0x0000008004000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpAdd4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpAdd4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4757 = new BitSet(new long[]{0x0000070000010002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4810 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4833 = new BitSet(new long[]{0x0000070000010002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpMulti4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5086 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary5172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpUnary5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5356 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXCastedExpression5391 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5414 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5509 = new BitSet(new long[]{0x0000600000008002L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall5558 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5581 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5597 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5619 = new BitSet(new long[]{0x0000600000008002L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall5705 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall5729 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall5766 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall5795 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5816 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall5829 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5850 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall5864 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5889 = new BitSet(new long[]{0x0000E00000808002L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall5923 = new BitSet(new long[]{0x4E29889006840070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6008 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6036 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall6049 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6070 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall6087 = new BitSet(new long[]{0x0000E00000008002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall6120 = new BitSet(new long[]{0x0000600000008002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral6576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXClosure6859 = new BitSet(new long[]{0x7E2B889004840070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6930 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXClosure6943 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6964 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure6986 = new BitSet(new long[]{0x7E2A889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure7023 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure7071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure7137 = new BitSet(new long[]{0x7E2C889004840072L,0x00000000000000FFL});
    public static final BitSet FOLLOW_50_in_ruleXExpressionInClosure7150 = new BitSet(new long[]{0x7E28889004840072L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure7200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7308 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXShortClosure7321 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7342 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_48_in_ruleXShortClosure7364 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleXParenthesizedExpression7483 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7505 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXParenthesizedExpression7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression7608 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXIfExpression7620 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7641 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXIfExpression7653 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7674 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression7695 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression7811 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7852 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression7864 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7888 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression7900 = new BitSet(new long[]{0x0140000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7921 = new BitSet(new long[]{0x01C0000000880040L,0x0000000000000400L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7935 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression7947 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7968 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart8018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8074 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart8088 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8109 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCasePart8123 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression8236 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXForLoopExpression8248 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8269 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression8281 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8302 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXForLoopExpression8314 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXWhileExpression8427 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXWhileExpression8439 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8460 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXWhileExpression8472 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression8585 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8606 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression8618 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXDoWhileExpression8630 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8651 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXDoWhileExpression8663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXBlockExpression8755 = new BitSet(new long[]{0x7E288890048C0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8777 = new BitSet(new long[]{0x7E2C8890048C0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_50_in_ruleXBlockExpression8790 = new BitSet(new long[]{0x7E288890048C0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_19_in_ruleXBlockExpression8806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration9024 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration9055 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9103 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9124 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9153 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleXVariableDeclaration9167 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9282 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter9340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter9350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9396 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall9463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9520 = new BitSet(new long[]{0x4000001000000040L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall9534 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9555 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall9568 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9589 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_35_in_ruleXFeatureCall9603 = new BitSet(new long[]{0x4000001000000040L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9628 = new BitSet(new long[]{0x0000800000800002L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall9662 = new BitSet(new long[]{0x4E29889006840070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9747 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9775 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall9788 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9809 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall9826 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleIdOrSuper9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier10031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier10078 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleStaticQualifier10096 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall10147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXConstructorCall10193 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10216 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall10229 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10250 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall10263 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10284 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_35_in_ruleXConstructorCall10298 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall10312 = new BitSet(new long[]{0x4E29889006840070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10384 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10412 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall10425 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10446 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall10463 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral10588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral10612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXNullLiteral10718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral10764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral10815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTypeLiteral11014 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXTypeLiteral11026 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11049 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXTypeLiteral11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXThrowExpression11153 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression11174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXReturnExpression11266 = new BitSet(new long[]{0x4E28889004840072L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression11297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression11390 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11441 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression11463 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression11507 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXCatchClause11621 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXCatchClause11634 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11655 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXCatchClause11667 = new BitSet(new long[]{0x4E28889004840070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11783 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName11811 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11834 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11939 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleJvmTypeReference11977 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleJvmTypeReference11989 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef12066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleXFunctionTypeRef12104 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12125 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleXFunctionTypeRef12138 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12159 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleXFunctionTypeRef12173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleXFunctionTypeRef12187 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12302 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference12323 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12345 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference12358 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12379 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_35_in_ruleJvmParameterizedTypeReference12393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmWildcardTypeReference12606 = new BitSet(new long[]{0x4000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBound12740 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBoundAnded12844 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleJvmLowerBound12948 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID13008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID13019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred1_InternalSpec1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred2_InternalSpec2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred3_InternalSpec3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred4_InternalSpec3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred5_InternalSpec3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred6_InternalSpec3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred7_InternalSpec3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred8_InternalSpec4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred9_InternalSpec4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred10_InternalSpec4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred11_InternalSpec5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred12_InternalSpec5526 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred12_InternalSpec5535 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred12_InternalSpec5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred13_InternalSpec5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred13_InternalSpec5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred13_InternalSpec5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred14_InternalSpec5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalSpec5957 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_24_in_synpred15_InternalSpec5964 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalSpec5971 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_48_in_synpred15_InternalSpec5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred16_InternalSpec6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred17_InternalSpec6876 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_24_in_synpred17_InternalSpec6883 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred17_InternalSpec6890 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_48_in_synpred17_InternalSpec6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred19_InternalSpec7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalSpec7827 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred20_InternalSpec7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred21_InternalSpec9073 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalSpec9082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred22_InternalSpec9644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalSpec9696 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_24_in_synpred23_InternalSpec9703 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalSpec9710 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_48_in_synpred23_InternalSpec9724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred24_InternalSpec9842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalSpec10333 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_24_in_synpred25_InternalSpec10340 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalSpec10347 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_48_in_synpred25_InternalSpec10361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred26_InternalSpec10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred27_InternalSpec11280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred28_InternalSpec11425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred29_InternalSpec11455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred31_InternalSpec11802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred32_InternalSpec11954 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred32_InternalSpec11958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred33_InternalSpec12315 = new BitSet(new long[]{0x0000000000000002L});

}