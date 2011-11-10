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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.'", "'*'", "'describe'", "'context'", "'{'", "'}'", "'='", "'specify'", "'it'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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

                if ( ((LA3_0>=15 && LA3_0<=16)) ) {
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
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport273); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport294);
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
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard331);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard342); if (state.failed) return current;

            }

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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard389);
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
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:214:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildCard408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard421); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleExampleGroup_in_entryRuleExampleGroup463);
            iv_ruleExampleGroup=ruleExampleGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExampleGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleGroup473); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:242:1: ruleExampleGroup returns [EObject current=null] : ( ( ( (lv_preamble_0_1= 'describe' | lv_preamble_0_2= 'context' ) ) ) ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleExampleGroup() throws RecognitionException {
        EObject current = null;

        Token lv_preamble_0_1=null;
        Token lv_preamble_0_2=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:245:28: ( ( ( ( (lv_preamble_0_1= 'describe' | lv_preamble_0_2= 'context' ) ) ) ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:246:1: ( ( ( (lv_preamble_0_1= 'describe' | lv_preamble_0_2= 'context' ) ) ) ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:246:1: ( ( ( (lv_preamble_0_1= 'describe' | lv_preamble_0_2= 'context' ) ) ) ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:246:2: ( ( (lv_preamble_0_1= 'describe' | lv_preamble_0_2= 'context' ) ) ) ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:246:2: ( ( (lv_preamble_0_1= 'describe' | lv_preamble_0_2= 'context' ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:247:1: ( (lv_preamble_0_1= 'describe' | lv_preamble_0_2= 'context' ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:247:1: ( (lv_preamble_0_1= 'describe' | lv_preamble_0_2= 'context' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:248:1: (lv_preamble_0_1= 'describe' | lv_preamble_0_2= 'context' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:248:1: (lv_preamble_0_1= 'describe' | lv_preamble_0_2= 'context' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:249:3: lv_preamble_0_1= 'describe'
                    {
                    lv_preamble_0_1=(Token)match(input,15,FOLLOW_15_in_ruleExampleGroup518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_preamble_0_1, grammarAccess.getExampleGroupAccess().getPreambleDescribeKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleGroupRule());
                      	        }
                             		setWithLastConsumed(current, "preamble", lv_preamble_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:261:8: lv_preamble_0_2= 'context'
                    {
                    lv_preamble_0_2=(Token)match(input,16,FOLLOW_16_in_ruleExampleGroup547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_preamble_0_2, grammarAccess.getExampleGroupAccess().getPreambleContextKeyword_0_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleGroupRule());
                      	        }
                             		setWithLastConsumed(current, "preamble", lv_preamble_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:276:2: ( ( ruleValidID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:277:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:277:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:278:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleGroupRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExampleGroupAccess().getTargetJvmIdentifiableElementCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleExampleGroup586);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:291:3: ( (lv_name_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:292:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:292:1: (lv_name_2_0= RULE_STRING )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:293:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExampleGroup604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getExampleGroupAccess().getNameSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleGroupRule());
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleExampleGroup622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExampleGroupAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:313:1: ( (lv_elements_4_0= ruleAbstractElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=15 && LA8_0<=16)||(LA8_0>=20 && LA8_0<=21)||LA8_0==44||LA8_0==73) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:314:1: (lv_elements_4_0= ruleAbstractElement )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:314:1: (lv_elements_4_0= ruleAbstractElement )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:315:3: lv_elements_4_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExampleGroupAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleExampleGroup643);
            	    lv_elements_4_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExampleGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_4_0, 
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleExampleGroup656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExampleGroupAccess().getRightCurlyBracketKeyword_5());
                  
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:343:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:344:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:345:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement692);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement702); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:352:1: ruleAbstractElement returns [EObject current=null] : (this_Example_0= ruleExample | this_Member_1= ruleMember | this_ExampleGroup_2= ruleExampleGroup ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Example_0 = null;

        EObject this_Member_1 = null;

        EObject this_ExampleGroup_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:355:28: ( (this_Example_0= ruleExample | this_Member_1= ruleMember | this_ExampleGroup_2= ruleExampleGroup ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:356:1: (this_Example_0= ruleExample | this_Member_1= ruleMember | this_ExampleGroup_2= ruleExampleGroup )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:356:1: (this_Example_0= ruleExample | this_Member_1= ruleMember | this_ExampleGroup_2= ruleExampleGroup )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
            case 44:
            case 73:
                {
                alt9=2;
                }
                break;
            case 15:
            case 16:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:357:5: this_Example_0= ruleExample
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getExampleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExample_in_ruleAbstractElement749);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:367:5: this_Member_1= ruleMember
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getMemberParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMember_in_ruleAbstractElement776);
                    this_Member_1=ruleMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Member_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:377:5: this_ExampleGroup_2= ruleExampleGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getExampleGroupParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExampleGroup_in_ruleAbstractElement803);
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleMember"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:393:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:394:2: (iv_ruleMember= ruleMember EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:395:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember838);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember848); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:402:1: ruleMember returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:405:28: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:406:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:406:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:406:2: ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:406:2: ( (lv_type_0_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:407:1: (lv_type_0_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:407:1: (lv_type_0_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:408:3: lv_type_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMemberAccess().getTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember894);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:424:2: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:425:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:425:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:426:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMemberAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleMember915);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:442:2: (otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:442:4: otherlv_2= '=' ( (lv_right_3_0= ruleXExpression ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMember928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:446:1: ( (lv_right_3_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:447:1: (lv_right_3_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:447:1: (lv_right_3_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:448:3: lv_right_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getRightXExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleMember949);
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


    // $ANTLR start "entryRuleExample"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:472:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:473:2: (iv_ruleExample= ruleExample EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:474:2: iv_ruleExample= ruleExample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleRule()); 
            }
            pushFollow(FOLLOW_ruleExample_in_entryRuleExample987);
            iv_ruleExample=ruleExample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExample; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExample997); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:481:1: ruleExample returns [EObject current=null] : ( ( ( (lv_preamble_0_1= 'specify' | lv_preamble_0_2= 'it' ) ) ) ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token lv_preamble_0_1=null;
        Token lv_preamble_0_2=null;
        Token lv_name_2_0=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:484:28: ( ( ( ( (lv_preamble_0_1= 'specify' | lv_preamble_0_2= 'it' ) ) ) ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:485:1: ( ( ( (lv_preamble_0_1= 'specify' | lv_preamble_0_2= 'it' ) ) ) ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:485:1: ( ( ( (lv_preamble_0_1= 'specify' | lv_preamble_0_2= 'it' ) ) ) ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:485:2: ( ( (lv_preamble_0_1= 'specify' | lv_preamble_0_2= 'it' ) ) ) ( ( ruleValidID ) )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_body_3_0= ruleXBlockExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:485:2: ( ( (lv_preamble_0_1= 'specify' | lv_preamble_0_2= 'it' ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:486:1: ( (lv_preamble_0_1= 'specify' | lv_preamble_0_2= 'it' ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:486:1: ( (lv_preamble_0_1= 'specify' | lv_preamble_0_2= 'it' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:487:1: (lv_preamble_0_1= 'specify' | lv_preamble_0_2= 'it' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:487:1: (lv_preamble_0_1= 'specify' | lv_preamble_0_2= 'it' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:488:3: lv_preamble_0_1= 'specify'
                    {
                    lv_preamble_0_1=(Token)match(input,20,FOLLOW_20_in_ruleExample1042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_preamble_0_1, grammarAccess.getExampleAccess().getPreambleSpecifyKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleRule());
                      	        }
                             		setWithLastConsumed(current, "preamble", lv_preamble_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:500:8: lv_preamble_0_2= 'it'
                    {
                    lv_preamble_0_2=(Token)match(input,21,FOLLOW_21_in_ruleExample1071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_preamble_0_2, grammarAccess.getExampleAccess().getPreambleItKeyword_0_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleRule());
                      	        }
                             		setWithLastConsumed(current, "preamble", lv_preamble_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:515:2: ( ( ruleValidID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:516:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:516:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:517:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExampleRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExampleAccess().getFeatureJvmIdentifiableElementCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleExample1110);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:530:3: ( (lv_name_2_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:531:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:531:1: (lv_name_2_0= RULE_STRING )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:532:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExample1128); if (state.failed) return current;
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:548:3: ( (lv_body_3_0= ruleXBlockExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:549:1: (lv_body_3_0= ruleXBlockExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:549:1: (lv_body_3_0= ruleXBlockExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:550:3: lv_body_3_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExampleAccess().getBodyXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleExample1155);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:574:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:575:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:576:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1191);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1201); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:583:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:586:28: (this_XAssignment_0= ruleXAssignment )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:588:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1247);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:604:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:605:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:606:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1281);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1291); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:613:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:616:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:617:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:617:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||(LA15_1>=RULE_STRING && LA15_1<=RULE_ID)||(LA15_1>=13 && LA15_1<=18)||(LA15_1>=20 && LA15_1<=46)||(LA15_1>=48 && LA15_1<=73)) ) {
                    alt15=2;
                }
                else if ( (LA15_1==19) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_INT)||LA15_0==17||LA15_0==31||(LA15_0>=34 && LA15_0<=35)||LA15_0==39||LA15_0==44||LA15_0==46||LA15_0==50||LA15_0==52||(LA15_0>=56 && LA15_0<=58)||LA15_0==61||(LA15_0>=63 && LA15_0<=70)) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:617:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:617:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:617:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:617:3: ()
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:618:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:623:2: ( ( ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:624:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:624:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:625:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1349);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1365);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:646:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:647:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:647:1: (lv_value_3_0= ruleXAssignment )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:648:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1385);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:665:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:665:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:666:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1415);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:674:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==22) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred1_InternalSpec()) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:674:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:674:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:674:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:679:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:679:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:679:7: ()
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:680:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:685:2: ( ( ruleOpMultiAssign ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:686:1: ( ruleOpMultiAssign )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:686:1: ( ruleOpMultiAssign )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:687:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1468);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:700:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:701:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:701:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:702:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1491);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:726:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:727:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:728:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1531);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1542); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:735:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:738:28: (kw= '=' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:740:2: kw= '='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpSingleAssign1579); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:753:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:754:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:755:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1619);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1630); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:762:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:765:28: (kw= '+=' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:767:2: kw= '+='
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpMultiAssign1667); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:780:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:781:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:782:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1706);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1716); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:789:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:792:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:793:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:793:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:794:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1763);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:802:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred2_InternalSpec()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:802:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:802:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:802:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:807:6: ( () ( ( ruleOpOr ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:807:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:807:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:808:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:813:2: ( ( ruleOpOr ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:814:1: ( ruleOpOr )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:814:1: ( ruleOpOr )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:815:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1816);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:828:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:829:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:829:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:830:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1839);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:854:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:855:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:856:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1878);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1889); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:863:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:866:28: (kw= '||' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:868:2: kw= '||'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpOr1926); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:881:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:882:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:883:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1965);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1975); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:890:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:893:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:894:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:894:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:895:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2022);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:903:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred3_InternalSpec()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:903:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:903:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:903:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:908:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:908:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:908:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:909:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:914:2: ( ( ruleOpAnd ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:915:1: ( ruleOpAnd )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:915:1: ( ruleOpAnd )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:916:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2075);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:929:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:930:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:930:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:931:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2098);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:955:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:956:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:957:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2137);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2148); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:964:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:967:28: (kw= '&&' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:969:2: kw= '&&'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpAnd2185); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:982:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:983:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:984:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2224);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2234); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:991:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:994:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:995:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:995:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:996:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2281);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1004:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred4_InternalSpec()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==26) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred4_InternalSpec()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1004:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1004:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1004:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1009:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1009:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1009:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1010:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1015:2: ( ( ruleOpEquality ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1016:1: ( ruleOpEquality )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1016:1: ( ruleOpEquality )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1017:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2334);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1030:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1031:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1031:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1032:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2357);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1056:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1057:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1058:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2396);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2407); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1065:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1068:28: ( (kw= '==' | kw= '!=' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1069:1: (kw= '==' | kw= '!=' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1069:1: (kw= '==' | kw= '!=' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            else if ( (LA19_0==26) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1070:2: kw= '=='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpEquality2445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1077:2: kw= '!='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpEquality2464); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1090:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1091:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1092:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2504);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2514); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1099:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1102:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1103:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1103:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1104:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2561);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop20:
            do {
                int alt20=3;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred5_InternalSpec()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt20=2;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt20=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt20=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA20_6 = input.LA(2);

                    if ( (synpred6_InternalSpec()) ) {
                        alt20=2;
                    }


                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1114:5: ( () otherlv_2= 'instanceof' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1114:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1114:6: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1115:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXRelationalExpression2597); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1124:3: ( ( ruleQualifiedName ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1125:1: ( ruleQualifiedName )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1125:1: ( ruleQualifiedName )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1126:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2622);
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
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1145:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1145:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1145:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1146:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1151:2: ( ( ruleOpCompare ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1152:1: ( ruleOpCompare )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1152:1: ( ruleOpCompare )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1153:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2683);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1166:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1167:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1167:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1168:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2706);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1192:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1193:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1194:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2746);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2757); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1201:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1204:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1205:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1205:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt21=1;
                }
                break;
            case 29:
                {
                alt21=2;
                }
                break;
            case 30:
                {
                alt21=3;
                }
                break;
            case 31:
                {
                alt21=4;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1206:2: kw= '>='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1213:2: kw= '<='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1220:2: kw= '>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1227:2: kw= '<'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare2852); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1240:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1241:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1242:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2892);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2902); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1249:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1252:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1253:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1253:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1254:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2949);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1262:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred7_InternalSpec()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==33) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred7_InternalSpec()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1262:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1262:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1262:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1267:6: ( () ( ( ruleOpOther ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1267:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1267:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1268:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1273:2: ( ( ruleOpOther ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1274:1: ( ruleOpOther )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1274:1: ( ruleOpOther )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1275:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3002);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1288:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1289:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1289:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1290:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3025);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1314:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1315:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1316:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3064);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3075); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1323:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1326:28: ( (kw= '->' | kw= '..' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1327:1: (kw= '->' | kw= '..' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1327:1: (kw= '->' | kw= '..' )
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1328:2: kw= '->'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1335:2: kw= '..'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther3132); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1348:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1349:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1350:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3172);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3182); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1357:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1360:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1361:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1362:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3229);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1370:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred8_InternalSpec()) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==35) ) {
                    int LA24_3 = input.LA(2);

                    if ( (synpred8_InternalSpec()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1370:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1370:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1370:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1375:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1375:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1375:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1376:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1381:2: ( ( ruleOpAdd ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1382:1: ( ruleOpAdd )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1382:1: ( ruleOpAdd )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1383:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3282);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1396:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1397:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1397:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1398:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3305);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1422:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1423:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1424:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3344);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3355); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1431:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1434:28: ( (kw= '+' | kw= '-' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1435:1: (kw= '+' | kw= '-' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1435:1: (kw= '+' | kw= '-' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            else if ( (LA25_0==35) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1436:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd3393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1443:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd3412); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1456:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1457:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1458:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3452);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3462); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1465:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1468:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1469:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1469:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1470:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3509);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1478:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA26_4 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA26_5 = input.LA(2);

                    if ( (synpred9_InternalSpec()) ) {
                        alt26=1;
                    }


                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1478:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1478:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1478:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1483:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1483:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1483:7: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1484:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1489:2: ( ( ruleOpMulti ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1490:1: ( ruleOpMulti )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1490:1: ( ruleOpMulti )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1491:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3562);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1504:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1505:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1505:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1506:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3585);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1530:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1531:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1532:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3624);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3635); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1539:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1542:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1543:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1543:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt27=1;
                }
                break;
            case 36:
                {
                alt27=2;
                }
                break;
            case 37:
                {
                alt27=3;
                }
                break;
            case 38:
                {
                alt27=4;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1544:2: kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleOpMulti3673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1551:2: kw= '**'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1558:2: kw= '/'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1565:2: kw= '%'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3730); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1578:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1579:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1580:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3770);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3780); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1587:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1590:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1591:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1591:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=34 && LA28_0<=35)||LA28_0==39) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||LA28_0==17||LA28_0==31||LA28_0==44||LA28_0==46||LA28_0==50||LA28_0==52||(LA28_0>=56 && LA28_0<=58)||LA28_0==61||(LA28_0>=63 && LA28_0<=70)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1591:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1591:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1591:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1591:3: ()
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1592:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1597:2: ( ( ruleOpUnary ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1598:1: ( ruleOpUnary )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1598:1: ( ruleOpUnary )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1599:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3838);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1612:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1613:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1613:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1614:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3859);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1632:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3888);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1648:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1649:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1650:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3924);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3935); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1657:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1660:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1661:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1661:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt29=1;
                }
                break;
            case 35:
                {
                alt29=2;
                }
                break;
            case 34:
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1662:2: kw= '!'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary3973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1669:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1676:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary4011); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1689:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1690:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1691:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4051);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4061); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1698:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1701:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1702:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1702:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1703:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4108);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==40) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred10_InternalSpec()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1713:5: ( () otherlv_2= 'as' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1713:6: () otherlv_2= 'as'
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1713:6: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1714:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXCastedExpression4143); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1723:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1724:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1724:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1725:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4166);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1749:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1750:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1751:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4204);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4214); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1758:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1761:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1762:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1762:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1763:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4261);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop38:
            do {
                int alt38=3;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    int LA38_2 = input.LA(2);

                    if ( (synpred11_InternalSpec()) ) {
                        alt38=1;
                    }
                    else if ( (synpred12_InternalSpec()) ) {
                        alt38=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA38_3 = input.LA(2);

                    if ( (synpred12_InternalSpec()) ) {
                        alt38=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA38_4 = input.LA(2);

                    if ( (synpred12_InternalSpec()) ) {
                        alt38=2;
                    }


                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1777:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1777:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1777:26: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1778:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall4310); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1787:1: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1788:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1788:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1789:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4333);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4349);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1810:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1811:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1811:1: (lv_value_5_0= ruleXAssignment )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1812:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4371);
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
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1829:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1829:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1829:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1829:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1829:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1845:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1845:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1845:8: ()
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1846:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1851:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case 13:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt31=3;
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
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1851:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall4457); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1856:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1856:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1857:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1857:1: (lv_nullSafe_8_0= '?.' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1858:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4481); if (state.failed) return current;
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
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1872:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1872:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1873:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1873:1: (lv_spreading_9_0= '*.' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1874:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4518); if (state.failed) return current;
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1887:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==31) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1887:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall4547); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1891:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1892:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1892:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1893:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4568);
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

            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1909:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==43) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1909:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4581); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1913:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1914:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1914:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1915:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4602);
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
            	            	    break loop32;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleXMemberFeatureCall4616); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1935:3: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1936:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1936:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1937:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4641);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1950:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt36=2;
            	    alt36 = dfa36.predict(input);
            	    switch (alt36) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1950:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1950:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1950:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1957:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1958:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4675); if (state.failed) return current;
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

            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1971:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt35=3;
            	            alt35 = dfa35.predict(input);
            	            switch (alt35) {
            	                case 1 :
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1971:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1971:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1971:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1988:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1989:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4760);
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
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2006:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2006:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2006:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2006:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2007:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2007:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2008:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4788);
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

            	                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2024:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop34:
            	                    do {
            	                        int alt34=2;
            	                        int LA34_0 = input.LA(1);

            	                        if ( (LA34_0==43) ) {
            	                            alt34=1;
            	                        }


            	                        switch (alt34) {
            	                    	case 1 :
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2024:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4801); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2028:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2029:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2029:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2030:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4822);
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
            	                    	    break loop34;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4839); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2050:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt37=2;
            	    alt37 = dfa37.predict(input);
            	    switch (alt37) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2050:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2055:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2056:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4872);
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2080:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2081:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2082:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4912);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4922); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2089:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2092:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2093:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2093:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt39=13;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt39=1;
                }
                break;
            case 17:
                {
                alt39=2;
                }
                break;
            case 52:
                {
                alt39=3;
                }
                break;
            case RULE_ID:
            case 31:
            case 61:
                {
                alt39=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 46:
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt39=5;
                }
                break;
            case 50:
                {
                alt39=6;
                }
                break;
            case 56:
                {
                alt39=7;
                }
                break;
            case 57:
                {
                alt39=8;
                }
                break;
            case 58:
                {
                alt39=9;
                }
                break;
            case 68:
                {
                alt39=10;
                }
                break;
            case 69:
                {
                alt39=11;
                }
                break;
            case 70:
                {
                alt39=12;
                }
                break;
            case 44:
                {
                alt39=13;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2094:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4969);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2104:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4996);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2114:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5023);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2124:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5050);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2134:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5077);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2144:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5104);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2154:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5131);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2164:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5158);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2174:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5185);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2184:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5212);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2194:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5239);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2204:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5266);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2214:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5293);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2230:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2231:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2232:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5328);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5338); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2239:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2242:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2243:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2243:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt40=1;
                }
                break;
            case 64:
            case 65:
                {
                alt40=2;
                }
                break;
            case RULE_INT:
                {
                alt40=3;
                }
                break;
            case 66:
                {
                alt40=4;
                }
                break;
            case RULE_STRING:
                {
                alt40=5;
                }
                break;
            case 67:
                {
                alt40=6;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2244:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5385);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2254:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5412);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2264:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5439);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2274:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5466);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2284:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5493);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2294:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5520);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2310:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2311:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2312:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5555);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5565); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2319:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2322:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2323:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2323:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2323:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2323:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2324:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2348:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2348:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2348:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID||LA42_0==44||LA42_0==73) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2348:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2348:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2349:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2349:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2350:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5682);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2366:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==43) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2366:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5695); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2370:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2371:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2371:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2372:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5716);
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
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2388:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2389:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2389:1: (lv_explicitSyntax_5_0= '|' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2390:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5738); if (state.failed) return current;
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2403:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2404:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2404:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2405:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5775);
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

            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5787); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2433:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2434:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2435:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5823);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5833); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2442:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2445:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2446:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2446:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2446:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2446:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2447:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2452:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||LA45_0==17||LA45_0==31||(LA45_0>=34 && LA45_0<=35)||LA45_0==39||LA45_0==44||LA45_0==46||LA45_0==50||LA45_0==52||(LA45_0>=56 && LA45_0<=61)||(LA45_0>=63 && LA45_0<=70)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2452:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2452:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2453:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2453:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2454:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5889);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2470:2: (otherlv_2= ';' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==49) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2470:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXExpressionInClosure5902); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2482:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2483:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2484:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5942);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5952); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2491:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2494:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2495:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2495:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2495:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2495:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2495:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2511:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2511:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2511:7: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2512:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2517:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==44||LA47_0==73) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2517:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2517:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2518:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2518:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2519:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6060);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2535:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==43) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2535:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure6073); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2539:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2540:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2540:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2541:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6094);
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
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2557:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2558:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2558:1: (lv_explicitSyntax_4_0= '|' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2559:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure6116); if (state.failed) return current;
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2572:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2573:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2573:1: (lv_expression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2574:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6152);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2598:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2599:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2600:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6188);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6198); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2607:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2610:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2611:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2611:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2611:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression6235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6257);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression6268); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2636:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2637:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2638:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6304);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6314); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2645:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2648:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2649:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2649:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2649:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2649:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2650:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression6372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2663:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2664:1: (lv_if_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2664:1: (lv_if_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2665:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6393);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression6405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2685:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2686:1: (lv_then_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2686:1: (lv_then_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2687:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6426);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2703:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred18_InternalSpec()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2703:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2703:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2703:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression6447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2708:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2709:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2709:1: (lv_else_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2710:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6469);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2734:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2735:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2736:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6507);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6517); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2743:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2746:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2747:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2747:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2747:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2747:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2748:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2757:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==53) && (synpred19_InternalSpec())) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2757:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2762:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2762:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2762:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2763:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2763:1: (lv_localVarName_2_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2764:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6604);
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

                    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2784:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2785:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2785:1: (lv_switch_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2786:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6640);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2806:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID||LA50_0==44||LA50_0==53||LA50_0==55||LA50_0==73) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2807:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2807:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2808:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6673);
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
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2824:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2824:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2832:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2833:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2833:1: (lv_default_9_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2834:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6720);
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

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression6734); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2862:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2863:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2864:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6770);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6780); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2871:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2874:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2875:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2875:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2875:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2875:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==44||LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2876:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2876:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2877:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6826);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2893:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2893:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXCasePart6840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2897:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2898:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2898:1: (lv_case_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2899:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6861);
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

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXCasePart6875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2919:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2920:1: (lv_then_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2920:1: (lv_then_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2921:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6896);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2945:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2946:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2947:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6932);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6942); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2954:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2957:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2958:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2958:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2958:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2958:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2959:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression6988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression7000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2972:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2973:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2973:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2974:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7021);
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

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression7033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2994:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2995:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2995:1: (lv_forExpression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2996:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7054);
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

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXForLoopExpression7066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3016:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3017:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3017:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3018:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7087);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3042:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3043:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3044:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7123);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7133); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3051:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3054:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3055:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3055:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3055:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3055:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3056:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXWhileExpression7179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression7191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3069:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3070:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3070:1: (lv_predicate_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3071:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7212);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXWhileExpression7224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3091:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3092:1: (lv_body_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3092:1: (lv_body_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3093:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7245);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3117:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3118:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3119:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7281);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7291); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3126:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3129:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3130:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3130:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3130:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3130:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3131:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression7337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3140:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3141:1: (lv_body_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3141:1: (lv_body_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3142:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7358);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression7370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression7382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3166:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3167:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3167:1: (lv_predicate_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3168:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7403);
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

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXDoWhileExpression7415); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3196:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3197:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3198:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7451);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7461); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3205:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3208:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3209:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3209:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3209:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3209:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3210:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3219:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)||LA55_0==17||LA55_0==31||(LA55_0>=34 && LA55_0<=35)||LA55_0==39||LA55_0==44||LA55_0==46||LA55_0==50||LA55_0==52||(LA55_0>=56 && LA55_0<=61)||(LA55_0>=63 && LA55_0<=70)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3219:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3219:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3220:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3220:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3221:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7529);
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

            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3237:2: (otherlv_3= ';' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==49) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3237:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression7542); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXBlockExpression7558); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3253:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3254:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3255:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7594);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7604); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3262:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3265:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3266:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3266:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=59 && LA56_0<=60)) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_ID)||LA56_0==17||LA56_0==31||(LA56_0>=34 && LA56_0<=35)||LA56_0==39||LA56_0==44||LA56_0==46||LA56_0==50||LA56_0==52||(LA56_0>=56 && LA56_0<=58)||LA56_0==61||(LA56_0>=63 && LA56_0<=70)) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3267:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7651);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3277:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7678);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3293:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3294:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3295:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7713);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7723); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3302:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3305:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3306:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3306:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3306:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3306:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3307:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3312:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==59) ) {
                alt57=1;
            }
            else if ( (LA57_0==60) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3312:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3312:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3313:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3313:1: (lv_writeable_1_0= 'var' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3314:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration7776); if (state.failed) return current;
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3328:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration7807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred20_InternalSpec()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA58_0==44) && (synpred20_InternalSpec())) {
                alt58=1;
            }
            else if ( (LA58_0==73) && (synpred20_InternalSpec())) {
                alt58=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3340:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3340:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3340:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3341:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3341:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3342:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7855);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3358:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3359:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3359:1: (lv_name_4_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3360:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7876);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3377:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3377:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3378:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3378:1: (lv_name_5_0= ruleValidID )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3379:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7905);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3395:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==19) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3395:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleXVariableDeclaration7919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3399:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3400:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3400:1: (lv_right_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3401:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7940);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3425:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3426:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3427:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7978);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7988); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3434:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3437:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3438:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3438:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3438:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3438:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==RULE_ID||LA60_1==13||LA60_1==31||LA60_1==46) ) {
                    alt60=1;
                }
            }
            else if ( (LA60_0==44||LA60_0==73) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3439:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3439:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3440:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8034);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3456:3: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3457:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3457:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3458:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8056);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3482:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3483:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3484:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8092);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8102); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3491:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3494:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3495:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3495:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3495:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3495:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3496:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3496:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3497:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8148);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3513:2: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3514:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3514:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3515:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8169);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3539:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3540:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3541:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8205);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8215); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3548:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3551:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3552:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3552:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3552:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3552:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3553:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3558:2: ( ( ruleStaticQualifier ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==62) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3559:1: ( ruleStaticQualifier )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3559:1: ( ruleStaticQualifier )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3560:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8272);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3573:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==31) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3573:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall8286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3577:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3578:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3578:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3579:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8307);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3595:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==43) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3595:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8320); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3599:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3600:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3600:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3601:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8341);
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleXFeatureCall8355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3621:3: ( ( ruleIdOrSuper ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3622:1: ( ruleIdOrSuper )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3622:1: ( ruleIdOrSuper )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3623:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8380);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3636:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3636:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3636:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3636:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3643:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3644:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall8414); if (state.failed) return current;
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3657:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt65=3;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3657:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3657:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3657:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3674:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3675:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8499);
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
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3692:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3692:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3692:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3692:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3693:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3693:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3694:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8527);
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

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3710:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==43) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3710:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8540); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3714:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3715:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3715:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3716:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8561);
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
                            	    break loop64;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3736:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3736:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3741:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3742:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8611);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3766:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3767:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3768:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8649);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8660); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3775:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3778:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3779:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3779:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==61) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3780:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8707);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3792:2: kw= 'super'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleIdOrSuper8731); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3805:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3806:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3807:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8772);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8783); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3814:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3817:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3818:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3818:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    int LA69_2 = input.LA(2);

                    if ( (LA69_2==62) ) {
                        alt69=1;
                    }


                }


                switch (alt69) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3819:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8830);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleStaticQualifier8848); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3843:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3844:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3845:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8889);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8899); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3852:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3855:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3856:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3856:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3856:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3856:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3857:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXConstructorCall8945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3866:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3867:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3867:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3868:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8968);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3881:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==31) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3881:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleXConstructorCall8981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3885:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3886:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3886:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3887:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9002);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3903:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==43) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3903:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall9015); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3907:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3908:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3908:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3909:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9036);
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
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleXConstructorCall9050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall9064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3933:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt73=3;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3933:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3933:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3933:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3950:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3951:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9136);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3968:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3968:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3968:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3968:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3969:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3969:1: (lv_arguments_10_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3970:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9164);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3986:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==43) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3986:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall9177); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3990:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3991:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3991:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3992:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9198);
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
                    	    break loop72;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall9215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4012:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4012:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4017:1: (lv_arguments_14_0= ruleXClosure )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4018:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9246);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4042:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4043:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4044:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9283);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9293); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4051:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4054:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4055:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4055:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4055:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4055:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4056:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4061:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==64) ) {
                alt75=1;
            }
            else if ( (LA75_0==65) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4061:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXBooleanLiteral9340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4066:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4066:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4067:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4067:1: (lv_isTrue_2_0= 'true' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4068:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral9364); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4089:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4090:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4091:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9414);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9424); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4098:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4101:28: ( ( () otherlv_1= 'null' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4102:1: ( () otherlv_1= 'null' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4102:1: ( () otherlv_1= 'null' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4102:2: () otherlv_1= 'null'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4102:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4103:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXNullLiteral9470); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4120:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4121:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4122:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9506);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9516); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4129:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4132:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4133:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4133:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4133:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4133:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4134:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4139:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4140:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4140:1: (lv_value_1_0= RULE_INT )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4141:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9567); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4165:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4166:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4167:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9608);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9618); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4174:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4177:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4178:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4178:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4178:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4178:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4179:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4184:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4185:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4185:1: (lv_value_1_0= RULE_STRING )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4186:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9669); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4210:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4211:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4212:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9710);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9720); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4219:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4222:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4223:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4223:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4223:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4223:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4224:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTypeLiteral9766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral9778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4237:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4238:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4238:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4239:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9801);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXTypeLiteral9813); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4264:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4265:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4266:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9849);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9859); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4273:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4276:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4277:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4277:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4277:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4277:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4278:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXThrowExpression9905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4287:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4288:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4288:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4289:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9926);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4313:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4314:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4315:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9962);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9972); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4322:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4325:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4326:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4326:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4326:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4326:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4327:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXReturnExpression10018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4336:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4336:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4341:1: (lv_expression_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4342:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10049);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4366:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4367:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4368:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10086);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10096); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4375:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4378:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4379:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4379:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4379:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4379:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4380:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression10142); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4389:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4390:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4390:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4391:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10163);
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

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4407:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==72) ) {
                alt79=1;
            }
            else if ( (LA79_0==71) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4407:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4407:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4407:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4407:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==72) ) {
                            int LA77_2 = input.LA(2);

                            if ( (synpred27_InternalSpec()) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4407:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4409:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4410:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10193);
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
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4426:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==71) ) {
                        int LA78_1 = input.LA(2);

                        if ( (synpred28_InternalSpec()) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4426:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4426:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4426:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression10215); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4431:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4432:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4432:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4433:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10237);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4450:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4450:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4450:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression10259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4454:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4455:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4455:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4456:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10280);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4480:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4481:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4482:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10318);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10328); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4489:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4492:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4493:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4493:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4493:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4493:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4493:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleXCatchClause10373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause10386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4502:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4503:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4503:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4504:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10407);
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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXCatchClause10419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4524:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4525:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4525:1: (lv_expression_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4526:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10440);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4550:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4551:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4552:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10477);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10488); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4559:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4562:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4563:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4563:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4564:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10535);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4574:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==13) ) {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==RULE_ID) ) {
                        int LA80_3 = input.LA(3);

                        if ( (synpred30_InternalSpec()) ) {
                            alt80=1;
                        }


                    }


                }


                switch (alt80) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4574:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4574:2: ( ( '.' )=>kw= '.' )
            	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4574:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName10563); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10586);
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
            	    break loop80;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4601:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4602:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4603:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10633);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10643); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4610:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4613:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4614:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4614:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                alt82=1;
            }
            else if ( (LA82_0==44||LA82_0==73) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4614:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4614:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4615:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10691);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4623:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==46) ) {
                            int LA81_2 = input.LA(2);

                            if ( (LA81_2==48) ) {
                                int LA81_3 = input.LA(3);

                                if ( (synpred31_InternalSpec()) ) {
                                    alt81=1;
                                }


                            }


                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4623:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4626:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4626:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4626:6: ()
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4627:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleJvmTypeReference10729); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleJvmTypeReference10741); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4642:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10773);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4658:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4659:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4660:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10808);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10818); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4667:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4670:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4671:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4671:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4671:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4671:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==44) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4671:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4675:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4676:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4676:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4677:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10877);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4693:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==43) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4693:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10890); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4697:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4698:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4698:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4699:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10911);
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
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef10925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleXFunctionTypeRef10939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4723:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4724:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4724:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4725:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10960);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4749:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4750:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4751:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10996);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11006); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4758:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4761:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4762:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4762:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4762:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4762:2: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4763:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4763:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4764:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11054);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4777:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4777:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4777:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4777:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleJvmParameterizedTypeReference11075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4782:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4783:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4783:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4784:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11097);
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

                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4800:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==43) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4800:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleJvmParameterizedTypeReference11110); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4804:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4805:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4805:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4806:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11131);
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
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleJvmParameterizedTypeReference11145); if (state.failed) return current;
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4834:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4835:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4836:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11183);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11193); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4843:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4846:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4847:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4847:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID||LA87_0==44||LA87_0==73) ) {
                alt87=1;
            }
            else if ( (LA87_0==74) ) {
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4848:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11240);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4858:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11267);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4874:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4875:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4876:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11302);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11312); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4883:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4886:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4887:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4887:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4887:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4887:2: ()
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4888:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleJvmWildcardTypeReference11358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4897:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==75) ) {
                alt88=1;
            }
            else if ( (LA88_0==61) ) {
                alt88=2;
            }
            switch (alt88) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4897:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4897:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4898:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4898:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4899:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11380);
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
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4916:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4916:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4917:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4917:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4918:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11407);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4942:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4943:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4944:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11445);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11455); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4951:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4954:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4955:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4955:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4955:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBound11492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4959:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4960:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4960:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4961:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11513);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4985:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4986:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4987:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11549);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11559); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4994:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4997:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4998:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4998:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4998:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBoundAnded11596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5002:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5003:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5003:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5004:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11617);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5028:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5029:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5030:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11653);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11663); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5037:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5040:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5041:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5041:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5041:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleJvmLowerBound11700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5045:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5046:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5046:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5047:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11721);
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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5073:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5074:2: (iv_ruleValidID= ruleValidID EOF )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5075:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11760);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11771); if (state.failed) return current;

            }

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
    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5082:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5085:28: (this_ID_0= RULE_ID )
            // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:5086:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11810); if (state.failed) return current;
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:674:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:674:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:674:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:674:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:674:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:675:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:675:2: ( ( ruleOpMultiAssign ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:676:1: ( ruleOpMultiAssign )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:676:1: ( ruleOpMultiAssign )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:677:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSpec1436);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:802:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:802:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:802:4: ( () ( ( ruleOpOr ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:802:5: () ( ( ruleOpOr ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:802:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:803:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:803:2: ( ( ruleOpOr ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:804:1: ( ruleOpOr )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:804:1: ( ruleOpOr )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:805:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalSpec1784);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:903:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:903:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:903:4: ( () ( ( ruleOpAnd ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:903:5: () ( ( ruleOpAnd ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:903:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:904:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:904:2: ( ( ruleOpAnd ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:905:1: ( ruleOpAnd )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:905:1: ( ruleOpAnd )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:906:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalSpec2043);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1004:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1004:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1004:4: ( () ( ( ruleOpEquality ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1004:5: () ( ( ruleOpEquality ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1004:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1005:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1005:2: ( ( ruleOpEquality ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1006:1: ( ruleOpEquality )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1006:1: ( ruleOpEquality )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1007:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalSpec2302);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:4: ( ( () 'instanceof' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:5: ( () 'instanceof' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:5: ( () 'instanceof' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:6: () 'instanceof'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1112:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1113:1: 
        {
        }

        match(input,27,FOLLOW_27_in_synpred5_InternalSpec2578); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSpec

    // $ANTLR start synpred6_InternalSpec
    public final void synpred6_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:9: ( () ( ( ruleOpCompare ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:10: () ( ( ruleOpCompare ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1140:10: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1141:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1141:2: ( ( ruleOpCompare ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1142:1: ( ruleOpCompare )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1142:1: ( ruleOpCompare )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1143:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalSpec2651);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1262:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1262:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1262:4: ( () ( ( ruleOpOther ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1262:5: () ( ( ruleOpOther ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1262:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1263:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1263:2: ( ( ruleOpOther ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1264:1: ( ruleOpOther )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1264:1: ( ruleOpOther )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1265:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalSpec2970);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1370:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1370:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1370:4: ( () ( ( ruleOpAdd ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1370:5: () ( ( ruleOpAdd ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1370:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1371:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1371:2: ( ( ruleOpAdd ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1372:1: ( ruleOpAdd )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1372:1: ( ruleOpAdd )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1373:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalSpec3250);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1478:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1478:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1478:4: ( () ( ( ruleOpMulti ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1478:5: () ( ( ruleOpMulti ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1478:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1479:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1479:2: ( ( ruleOpMulti ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1480:1: ( ruleOpMulti )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1480:1: ( ruleOpMulti )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1481:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalSpec3530);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:3: ( ( () 'as' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:4: ( () 'as' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:4: ( () 'as' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:5: () 'as'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1711:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1712:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred10_InternalSpec4124); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalSpec

    // $ANTLR start synpred11_InternalSpec
    public final void synpred11_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1771:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1772:1: 
        {
        }

        match(input,13,FOLLOW_13_in_synpred11_InternalSpec4278); if (state.failed) return ;
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1773:1: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1774:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1774:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1775:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalSpec4287);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalSpec4293);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSpec

    // $ANTLR start synpred12_InternalSpec
    public final void synpred12_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1829:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1829:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1829:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1829:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1829:10: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1830:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1830:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt89=3;
        switch ( input.LA(1) ) {
        case 13:
            {
            alt89=1;
            }
            break;
        case 41:
            {
            alt89=2;
            }
            break;
        case 42:
            {
            alt89=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 89, 0, input);

            throw nvae;
        }

        switch (alt89) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1830:4: '.'
                {
                match(input,13,FOLLOW_13_in_synpred12_InternalSpec4396); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1832:6: ( ( '?.' ) )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1832:6: ( ( '?.' ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1833:1: ( '?.' )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1833:1: ( '?.' )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1834:2: '?.'
                {
                match(input,41,FOLLOW_41_in_synpred12_InternalSpec4410); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1839:6: ( ( '*.' ) )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1839:6: ( ( '*.' ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1840:1: ( '*.' )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1840:1: ( '*.' )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1841:2: '*.'
                {
                match(input,42,FOLLOW_42_in_synpred12_InternalSpec4430); if (state.failed) return ;

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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1950:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1951:1: ( '(' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1951:1: ( '(' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1952:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred13_InternalSpec4657); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSpec

    // $ANTLR start synpred14_InternalSpec
    public final void synpred14_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1971:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1971:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1971:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1971:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1971:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1972:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1972:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==44||LA91_0==73) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1972:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1972:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1973:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1973:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1974:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4709);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1976:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==43) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1976:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred14_InternalSpec4716); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1977:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1978:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1978:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1979:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4723);
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

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1981:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1982:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1982:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:1983:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred14_InternalSpec4737); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSpec

    // $ANTLR start synpred15_InternalSpec
    public final void synpred15_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2050:4: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2051:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2051:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2052:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalSpec4855);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSpec

    // $ANTLR start synpred16_InternalSpec
    public final void synpred16_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==44||LA93_0==73) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2333:5: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2334:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2334:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2335:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5628);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2337:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==43) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2337:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred16_InternalSpec5635); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2338:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2339:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2339:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2340:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5642);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2342:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2343:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2343:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2344:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred16_InternalSpec5656); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalSpec

    // $ANTLR start synpred18_InternalSpec
    public final void synpred18_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2703:4: ( 'else' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2703:6: 'else'
        {
        match(input,51,FOLLOW_51_in_synpred18_InternalSpec6439); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalSpec

    // $ANTLR start synpred19_InternalSpec
    public final void synpred19_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2757:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2757:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2757:3: ( ( ( ruleValidID ) ) ':' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2757:4: ( ( ruleValidID ) ) ':'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2757:4: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2758:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2758:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:2759:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalSpec6579);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,53,FOLLOW_53_in_synpred19_InternalSpec6585); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSpec

    // $ANTLR start synpred20_InternalSpec
    public final void synpred20_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3332:6: ( ( ruleJvmTypeReference ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3333:1: ( ruleJvmTypeReference )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3333:1: ( ruleJvmTypeReference )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3334:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalSpec7825);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3336:2: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3337:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3337:1: ( ruleValidID )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3338:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalSpec7834);
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
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3636:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3637:1: ( '(' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3637:1: ( '(' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3638:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred21_InternalSpec8396); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSpec

    // $ANTLR start synpred22_InternalSpec
    public final void synpred22_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3657:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3657:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3657:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3657:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3657:6: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3658:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3658:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==44||LA97_0==73) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3658:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3658:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3659:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3659:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3660:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8448);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3662:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==43) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3662:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred22_InternalSpec8455); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3663:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3664:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3664:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3665:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8462);
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

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3667:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3668:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3668:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3669:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred22_InternalSpec8476); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalSpec

    // $ANTLR start synpred23_InternalSpec
    public final void synpred23_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3736:4: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3737:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3737:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3738:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalSpec8594);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalSpec

    // $ANTLR start synpred24_InternalSpec
    public final void synpred24_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3933:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3933:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3933:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3933:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3933:5: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3934:1: 
        {
        }

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3934:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==44||LA99_0==73) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3934:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3934:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3935:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3935:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3936:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9085);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3938:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==43) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3938:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred24_InternalSpec9092); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3939:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3940:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3940:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3941:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9099);
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

        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3943:6: ( ( '|' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3944:1: ( '|' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3944:1: ( '|' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:3945:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred24_InternalSpec9113); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalSpec

    // $ANTLR start synpred25_InternalSpec
    public final void synpred25_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4012:2: ( ( ruleXClosure ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4013:1: ( ruleXClosure )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4013:1: ( ruleXClosure )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4014:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalSpec9229);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalSpec

    // $ANTLR start synpred26_InternalSpec
    public final void synpred26_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4336:2: ( ( ruleXExpression ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4337:1: ( ruleXExpression )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4337:1: ( ruleXExpression )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4338:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalSpec10032);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSpec

    // $ANTLR start synpred27_InternalSpec
    public final void synpred27_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4407:5: ( 'catch' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4407:7: 'catch'
        {
        match(input,72,FOLLOW_72_in_synpred27_InternalSpec10177); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalSpec

    // $ANTLR start synpred28_InternalSpec
    public final void synpred28_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4426:5: ( 'finally' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4426:7: 'finally'
        {
        match(input,71,FOLLOW_71_in_synpred28_InternalSpec10207); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalSpec

    // $ANTLR start synpred30_InternalSpec
    public final void synpred30_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4574:3: ( '.' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4575:2: '.'
        {
        match(input,13,FOLLOW_13_in_synpred30_InternalSpec10554); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalSpec

    // $ANTLR start synpred31_InternalSpec
    public final void synpred31_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4623:2: ( ( () '[' ']' ) )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4623:3: ( () '[' ']' )
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4623:3: ( () '[' ']' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4623:4: () '[' ']'
        {
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4623:4: ()
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4624:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred31_InternalSpec10706); if (state.failed) return ;
        match(input,48,FOLLOW_48_in_synpred31_InternalSpec10710); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalSpec

    // $ANTLR start synpred32_InternalSpec
    public final void synpred32_InternalSpec_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4777:4: ( '<' )
        // ../de.bmw.carit.jnario.spec/src-gen/de/bmw/carit/jnario/spec/parser/antlr/internal/InternalSpec.g:4777:6: '<'
        {
        match(input,31,FOLLOW_31_in_synpred32_InternalSpec11067); if (state.failed) return ;

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


    protected DFA36 dfa36 = new DFA36(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String DFA36_eotS =
        "\100\uffff";
    static final String DFA36_eofS =
        "\1\2\77\uffff";
    static final String DFA36_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA36_maxS =
        "\1\111\1\0\76\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA36_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA36_transitionS = {
            "\3\2\6\uffff\6\2\1\uffff\30\2\1\1\2\2\1\uffff\16\2\1\uffff"+
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1950:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\34\uffff";
    static final String DFA35_eofS =
        "\34\uffff";
    static final String DFA35_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA35_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA35_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\5\1\1\12\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5"+
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
            return "1971:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==RULE_ID) ) {s = 1;}

                        else if ( (LA35_0==44) ) {s = 2;}

                        else if ( (LA35_0==73) && (synpred14_InternalSpec())) {s = 3;}

                        else if ( (LA35_0==47) && (synpred14_InternalSpec())) {s = 4;}

                        else if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_INT)||LA35_0==17||LA35_0==31||(LA35_0>=34 && LA35_0<=35)||LA35_0==39||LA35_0==46||LA35_0==50||LA35_0==52||(LA35_0>=56 && LA35_0<=58)||LA35_0==61||(LA35_0>=63 && LA35_0<=70)) ) {s = 5;}

                        else if ( (LA35_0==45) ) {s = 27;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
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
    static final String DFA37_eotS =
        "\100\uffff";
    static final String DFA37_eofS =
        "\1\2\77\uffff";
    static final String DFA37_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA37_maxS =
        "\1\111\1\0\76\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA37_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA37_transitionS = {
            "\3\2\6\uffff\6\2\1\uffff\32\2\1\1\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "2050:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\36\uffff";
    static final String DFA43_eofS =
        "\36\uffff";
    static final String DFA43_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA43_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA43_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\5\1\1\12\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5"+
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
            return "2333:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA43_0==44) ) {s = 2;}

                        else if ( (LA43_0==73) && (synpred16_InternalSpec())) {s = 3;}

                        else if ( (LA43_0==47) && (synpred16_InternalSpec())) {s = 4;}

                        else if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_INT)||LA43_0==17||LA43_0==31||(LA43_0>=34 && LA43_0<=35)||LA43_0==39||LA43_0==46||LA43_0==48||LA43_0==50||LA43_0==52||(LA43_0>=56 && LA43_0<=61)||(LA43_0>=63 && LA43_0<=70)) ) {s = 5;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSpec()) ) {s = 4;}

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
    static final String DFA66_eotS =
        "\100\uffff";
    static final String DFA66_eofS =
        "\1\2\77\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA66_maxS =
        "\1\111\1\0\76\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA66_transitionS = {
            "\3\2\6\uffff\6\2\1\uffff\30\2\1\1\2\2\1\uffff\16\2\1\uffff"+
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
            return "3636:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
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
    static final String DFA65_eotS =
        "\34\uffff";
    static final String DFA65_eofS =
        "\34\uffff";
    static final String DFA65_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA65_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA65_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA65_transitionS = {
            "\2\5\1\1\12\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5"+
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
            return "3657:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_0 = input.LA(1);

                         
                        int index65_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_0==RULE_ID) ) {s = 1;}

                        else if ( (LA65_0==44) ) {s = 2;}

                        else if ( (LA65_0==73) && (synpred22_InternalSpec())) {s = 3;}

                        else if ( (LA65_0==47) && (synpred22_InternalSpec())) {s = 4;}

                        else if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_INT)||LA65_0==17||LA65_0==31||(LA65_0>=34 && LA65_0<=35)||LA65_0==39||LA65_0==46||LA65_0==50||LA65_0==52||(LA65_0>=56 && LA65_0<=58)||LA65_0==61||(LA65_0>=63 && LA65_0<=70)) ) {s = 5;}

                        else if ( (LA65_0==45) ) {s = 27;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_2);
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
    static final String DFA67_eotS =
        "\100\uffff";
    static final String DFA67_eofS =
        "\1\2\77\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA67_maxS =
        "\1\111\1\0\76\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA67_transitionS = {
            "\3\2\6\uffff\6\2\1\uffff\32\2\1\1\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3736:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
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
        "\1\111\2\0\31\uffff";
    static final String DFA73_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA73_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA73_transitionS = {
            "\2\5\1\1\12\uffff\1\5\15\uffff\1\5\2\uffff\2\5\3\uffff\1\5"+
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
            return "3933:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA73_0==44) ) {s = 2;}

                        else if ( (LA73_0==73) && (synpred24_InternalSpec())) {s = 3;}

                        else if ( (LA73_0==47) && (synpred24_InternalSpec())) {s = 4;}

                        else if ( ((LA73_0>=RULE_STRING && LA73_0<=RULE_INT)||LA73_0==17||LA73_0==31||(LA73_0>=34 && LA73_0<=35)||LA73_0==39||LA73_0==46||LA73_0==50||LA73_0==52||(LA73_0>=56 && LA73_0<=58)||LA73_0==61||(LA73_0>=63 && LA73_0<=70)) ) {s = 5;}

                        else if ( (LA73_0==45) ) {s = 27;}

                         
                        input.seek(index73_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSpec()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSpec()) ) {s = 4;}

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
    static final String DFA74_eotS =
        "\100\uffff";
    static final String DFA74_eofS =
        "\1\2\77\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA74_maxS =
        "\1\111\1\0\76\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA74_transitionS = {
            "\3\2\6\uffff\6\2\1\uffff\32\2\1\1\1\uffff\16\2\1\uffff\13\2",
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
            return "4012:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred25_InternalSpec()) ) {s = 63;}

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
    static final String DFA76_eotS =
        "\100\uffff";
    static final String DFA76_eofS =
        "\1\31\77\uffff";
    static final String DFA76_minS =
        "\1\4\30\0\47\uffff";
    static final String DFA76_maxS =
        "\1\111\30\0\47\uffff";
    static final String DFA76_acceptS =
        "\31\uffff\1\2\45\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\47\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\17\1\15\1\1\6\uffff\4\31\1\6\1\31\1\uffff\13\31\1\10\2\31"+
            "\1\4\1\3\3\31\1\2\4\31\1\30\1\31\1\12\1\uffff\2\31\1\21\1\31"+
            "\1\7\3\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13\1\14\1\16"+
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
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "4336:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_4 = input.LA(1);

                         
                        int index76_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_6 = input.LA(1);

                         
                        int index76_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_7 = input.LA(1);

                         
                        int index76_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_8 = input.LA(1);

                         
                        int index76_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_9 = input.LA(1);

                         
                        int index76_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_10 = input.LA(1);

                         
                        int index76_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_11 = input.LA(1);

                         
                        int index76_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_12 = input.LA(1);

                         
                        int index76_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_13 = input.LA(1);

                         
                        int index76_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_14 = input.LA(1);

                         
                        int index76_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_15 = input.LA(1);

                         
                        int index76_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_16 = input.LA(1);

                         
                        int index76_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_17 = input.LA(1);

                         
                        int index76_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA76_18 = input.LA(1);

                         
                        int index76_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA76_19 = input.LA(1);

                         
                        int index76_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA76_20 = input.LA(1);

                         
                        int index76_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA76_24 = input.LA(1);

                         
                        int index76_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA86_eotS =
        "\100\uffff";
    static final String DFA86_eofS =
        "\1\2\77\uffff";
    static final String DFA86_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA86_maxS =
        "\1\111\1\0\76\uffff";
    static final String DFA86_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA86_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA86_transitionS = {
            "\3\2\6\uffff\6\2\1\uffff\13\2\1\1\17\2\1\uffff\16\2\1\uffff"+
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

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "4777:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSpec()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecFile_in_entryRuleSpecFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSpecFile123 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSpecFile144 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleSpecFile167 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_ruleExampleGroup_in_ruleSpecFile189 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport273 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard389 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildCard408 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleGroup_in_entryRuleExampleGroup463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleGroup473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleExampleGroup518 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_16_in_ruleExampleGroup547 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExampleGroup586 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExampleGroup604 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExampleGroup622 = new BitSet(new long[]{0x0000100000358040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleExampleGroup643 = new BitSet(new long[]{0x0000100000358040L,0x0000000000000200L});
    public static final BitSet FOLLOW_18_in_ruleExampleGroup656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExample_in_ruleAbstractElement749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_ruleAbstractElement776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleGroup_in_ruleAbstractElement803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember894 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember915 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleMember928 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleMember949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExample_in_entryRuleExample987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExample997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleExample1042 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_21_in_ruleExample1071 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExample1110 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExample1128 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleExample1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1349 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1365 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1415 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1468 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpSingleAssign1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpMultiAssign1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1763 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1816 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1839 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpOr1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2022 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2075 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2098 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpAnd2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2281 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2334 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2357 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpEquality2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpEquality2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2561 = new BitSet(new long[]{0x00000000F8000002L});
    public static final BitSet FOLLOW_27_in_ruleXRelationalExpression2597 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2622 = new BitSet(new long[]{0x00000000F8000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2683 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2706 = new BitSet(new long[]{0x00000000F8000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2949 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3002 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3025 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3229 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3282 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3305 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3509 = new BitSet(new long[]{0x0000007000004002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3562 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3585 = new BitSet(new long[]{0x0000007000004002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpMulti3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3838 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4108 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXCastedExpression4143 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4166 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4261 = new BitSet(new long[]{0x0000060000002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall4310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4333 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4349 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4371 = new BitSet(new long[]{0x0000060000002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall4457 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4481 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4518 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall4547 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4568 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4581 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4602 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall4616 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4641 = new BitSet(new long[]{0x0000560000002002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4675 = new BitSet(new long[]{0xA714F08C80020070L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4760 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4788 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4801 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4822 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4839 = new BitSet(new long[]{0x0000460000002002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4872 = new BitSet(new long[]{0x0000060000002002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5611 = new BitSet(new long[]{0xBF15D08C80020070L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5682 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5695 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5716 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5738 = new BitSet(new long[]{0xBF15508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5775 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5889 = new BitSet(new long[]{0xBF16508C80020072L,0x000000000000007FL});
    public static final BitSet FOLLOW_49_in_ruleXExpressionInClosure5902 = new BitSet(new long[]{0xBF14508C80020072L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6060 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure6073 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6094 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure6116 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression6235 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6257 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6360 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression6372 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6393 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression6405 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6426 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression6447 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6563 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6604 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6616 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6640 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6652 = new BitSet(new long[]{0x00A0100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6673 = new BitSet(new long[]{0x00E0100000040040L,0x0000000000000200L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6687 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6699 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6720 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6826 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXCasePart6840 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6861 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXCasePart6875 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression6988 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression7000 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7021 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression7033 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7054 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXForLoopExpression7066 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXWhileExpression7179 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression7191 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7212 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXWhileExpression7224 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression7337 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7358 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression7370 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression7382 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7403 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXDoWhileExpression7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7507 = new BitSet(new long[]{0xBF14508C80060070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7529 = new BitSet(new long[]{0xBF16508C80060070L,0x000000000000007FL});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression7542 = new BitSet(new long[]{0xBF14508C80060070L,0x000000000000007FL});
    public static final BitSet FOLLOW_18_in_ruleXBlockExpression7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration7776 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration7807 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7855 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7876 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7905 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXVariableDeclaration7919 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8034 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8148 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8272 = new BitSet(new long[]{0x2000000080000040L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall8286 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8307 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8320 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8341 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_30_in_ruleXFeatureCall8355 = new BitSet(new long[]{0x2000000080000040L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8380 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall8414 = new BitSet(new long[]{0xA714F08C80020070L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8499 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8527 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8540 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8561 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8578 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleIdOrSuper8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8830 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStaticQualifier8848 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXConstructorCall8945 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8968 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_31_in_ruleXConstructorCall8981 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9002 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall9015 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9036 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_30_in_ruleXConstructorCall9050 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall9064 = new BitSet(new long[]{0xA714F08C80020070L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9136 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9164 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall9177 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9198 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall9215 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXBooleanLiteral9340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXNullLiteral9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTypeLiteral9766 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral9778 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9801 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXTypeLiteral9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXThrowExpression9905 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXReturnExpression10018 = new BitSet(new long[]{0xA714508C80020072L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression10142 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10193 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression10215 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression10259 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXCatchClause10373 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause10386 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10407 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCatchClause10419 = new BitSet(new long[]{0xA714508C80020070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10535 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName10563 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10586 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10691 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleJvmTypeReference10729 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleJvmTypeReference10741 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10856 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10877 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10890 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10911 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef10925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleXFunctionTypeRef10939 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11054 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleJvmParameterizedTypeReference11075 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11097 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_43_in_ruleJvmParameterizedTypeReference11110 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11131 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_30_in_ruleJvmParameterizedTypeReference11145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmWildcardTypeReference11358 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBound11492 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBoundAnded11596 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleJvmLowerBound11700 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSpec1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalSpec1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalSpec2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalSpec2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred5_InternalSpec2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalSpec2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalSpec2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalSpec3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalSpec3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred10_InternalSpec4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred11_InternalSpec4278 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalSpec4287 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalSpec4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred12_InternalSpec4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalSpec4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred12_InternalSpec4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred13_InternalSpec4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4709 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalSpec4716 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpec4723 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred14_InternalSpec4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalSpec4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5628 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred16_InternalSpec5635 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpec5642 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalSpec5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred18_InternalSpec6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalSpec6579 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred19_InternalSpec6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalSpec7825 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalSpec7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred21_InternalSpec8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8448 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred22_InternalSpec8455 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpec8462 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred22_InternalSpec8476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalSpec8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9085 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred24_InternalSpec9092 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpec9099 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred24_InternalSpec9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalSpec9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalSpec10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred27_InternalSpec10177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred28_InternalSpec10207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred30_InternalSpec10554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred31_InternalSpec10706 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_synpred31_InternalSpec10710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred32_InternalSpec11067 = new BitSet(new long[]{0x0000000000000002L});

}