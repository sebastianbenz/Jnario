/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.jnario.suite.services.SuiteGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSuiteParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SUITE_NAME", "RULE_PATTERN", "RULE_STRING", "RULE_TEXT", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'*'", "'-'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=11;
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
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_PATTERN=5;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=8;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=9;
    public static final int RULE_DECIMAL=10;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_TEXT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int RULE_SUITE_NAME=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalSuiteParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSuiteParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSuiteParser.tokenNames; }
    public String getGrammarFileName() { return "../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g"; }



     	private SuiteGrammarAccess grammarAccess;
     	
        public InternalSuiteParser(TokenStream input, SuiteGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SuiteFile";	
       	}
       	
       	@Override
       	protected SuiteGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSuiteFile"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:67:1: entryRuleSuiteFile returns [EObject current=null] : iv_ruleSuiteFile= ruleSuiteFile EOF ;
    public final EObject entryRuleSuiteFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuiteFile = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:68:2: (iv_ruleSuiteFile= ruleSuiteFile EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:69:2: iv_ruleSuiteFile= ruleSuiteFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuiteFileRule()); 
            }
            pushFollow(FOLLOW_ruleSuiteFile_in_entryRuleSuiteFile75);
            iv_ruleSuiteFile=ruleSuiteFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuiteFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuiteFile85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuiteFile"


    // $ANTLR start "ruleSuiteFile"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:76:1: ruleSuiteFile returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_xtendClasses_4_0= ruleSuite ) )* ) ;
    public final EObject ruleSuiteFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_package_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_xtendClasses_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:79:28: ( ( (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_xtendClasses_4_0= ruleSuite ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:80:1: ( (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_xtendClasses_4_0= ruleSuite ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:80:1: ( (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_xtendClasses_4_0= ruleSuite ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:80:2: (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_xtendClasses_4_0= ruleSuite ) )*
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:80:2: (otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:80:4: otherlv_0= 'package' ( (lv_package_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )?
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSuiteFile123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getSuiteFileAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:84:1: ( (lv_package_1_0= ruleQualifiedName ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:85:1: (lv_package_1_0= ruleQualifiedName )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:85:1: (lv_package_1_0= ruleQualifiedName )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:86:3: lv_package_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSuiteFileAccess().getPackageQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSuiteFile144);
                    lv_package_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSuiteFileRule());
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

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:102:2: (otherlv_2= ';' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==17) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:102:4: otherlv_2= ';'
                            {
                            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSuiteFile157); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getSuiteFileAccess().getSemicolonKeyword_0_2());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:106:5: ( (lv_imports_3_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:107:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:107:1: (lv_imports_3_0= ruleImport )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:108:3: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSuiteFileAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleSuiteFile182);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSuiteFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_3_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:124:3: ( (lv_xtendClasses_4_0= ruleSuite ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SUITE_NAME) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:125:1: (lv_xtendClasses_4_0= ruleSuite )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:125:1: (lv_xtendClasses_4_0= ruleSuite )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:126:3: lv_xtendClasses_4_0= ruleSuite
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSuiteFileAccess().getXtendClassesSuiteParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSuite_in_ruleSuiteFile204);
            	    lv_xtendClasses_4_0=ruleSuite();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSuiteFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"xtendClasses",
            	              		lv_xtendClasses_4_0, 
            	              		"Suite");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleSuiteFile"


    // $ANTLR start "entryRuleImport"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:150:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:151:2: (iv_ruleImport= ruleImport EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:152:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport251); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:159:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:162:28: ( (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) ) (otherlv_3= ';' )? ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:163:1: (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) ) (otherlv_3= ';' )? )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:163:1: (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) ) (otherlv_3= ';' )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:163:3: otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) ) (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleImport288); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:167:1: ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:167:2: ( ( ruleQualifiedName ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:167:2: ( ( ruleQualifiedName ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:168:1: ( ruleQualifiedName )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:168:1: ( ruleQualifiedName )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:169:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedTypeJvmTypeCrossReference_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport312);
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
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:183:6: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:183:6: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:184:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:184:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:185:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport339);
                    lv_importedNamespace_2_0=ruleQualifiedNameWithWildCard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_2_0, 
                              		"QualifiedNameWithWildCard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:201:3: (otherlv_3= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:201:5: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleImport353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                          
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:213:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:214:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:215:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard392);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard403); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:222:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:225:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:226:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:226:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:227:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard450);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedNameWithWildCard468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedNameWithWildCard481); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSuite"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:257:1: entryRuleSuite returns [EObject current=null] : iv_ruleSuite= ruleSuite EOF ;
    public final EObject entryRuleSuite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuite = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:258:2: (iv_ruleSuite= ruleSuite EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:259:2: iv_ruleSuite= ruleSuite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuiteRule()); 
            }
            pushFollow(FOLLOW_ruleSuite_in_entryRuleSuite521);
            iv_ruleSuite=ruleSuite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuite; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuite531); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuite"


    // $ANTLR start "ruleSuite"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:266:1: ruleSuite returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_SUITE_NAME ) ) ( (lv_specs_2_0= ruleReference ) )* ) ;
    public final EObject ruleSuite() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_specs_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:269:28: ( ( () ( (lv_name_1_0= RULE_SUITE_NAME ) ) ( (lv_specs_2_0= ruleReference ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:270:1: ( () ( (lv_name_1_0= RULE_SUITE_NAME ) ) ( (lv_specs_2_0= ruleReference ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:270:1: ( () ( (lv_name_1_0= RULE_SUITE_NAME ) ) ( (lv_specs_2_0= ruleReference ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:270:2: () ( (lv_name_1_0= RULE_SUITE_NAME ) ) ( (lv_specs_2_0= ruleReference ) )*
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:270:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:271:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuiteAccess().getSuiteAction_0(),
                          current);
                  
            }

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:276:2: ( (lv_name_1_0= RULE_SUITE_NAME ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:277:1: (lv_name_1_0= RULE_SUITE_NAME )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:277:1: (lv_name_1_0= RULE_SUITE_NAME )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:278:3: lv_name_1_0= RULE_SUITE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_SUITE_NAME,FOLLOW_RULE_SUITE_NAME_in_ruleSuite582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSuiteAccess().getNameSUITE_NAMETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSuiteRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"SUITE_NAME");
              	    
            }

            }


            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:294:2: ( (lv_specs_2_0= ruleReference ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:295:1: (lv_specs_2_0= ruleReference )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:295:1: (lv_specs_2_0= ruleReference )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:296:3: lv_specs_2_0= ruleReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSuiteAccess().getSpecsReferenceParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReference_in_ruleSuite608);
            	    lv_specs_2_0=ruleReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSuiteRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"specs",
            	              		lv_specs_2_0, 
            	              		"Reference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleSuite"


    // $ANTLR start "entryRuleReference"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:320:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:321:2: (iv_ruleReference= ruleReference EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:322:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference645);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference655); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:329:1: ruleReference returns [EObject current=null] : (otherlv_0= '-' (this_SpecReference_1= ruleSpecReference | this_PatternReference_2= rulePatternReference ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_SpecReference_1 = null;

        EObject this_PatternReference_2 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:332:28: ( (otherlv_0= '-' (this_SpecReference_1= ruleSpecReference | this_PatternReference_2= rulePatternReference ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:333:1: (otherlv_0= '-' (this_SpecReference_1= ruleSpecReference | this_PatternReference_2= rulePatternReference ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:333:1: (otherlv_0= '-' (this_SpecReference_1= ruleSpecReference | this_PatternReference_2= rulePatternReference ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:333:3: otherlv_0= '-' (this_SpecReference_1= ruleSpecReference | this_PatternReference_2= rulePatternReference )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleReference692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getHyphenMinusKeyword_0());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:337:1: (this_SpecReference_1= ruleSpecReference | this_PatternReference_2= rulePatternReference )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_PATTERN) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:338:5: this_SpecReference_1= ruleSpecReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReferenceAccess().getSpecReferenceParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecReference_in_ruleReference715);
                    this_SpecReference_1=ruleSpecReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SpecReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:348:5: this_PatternReference_2= rulePatternReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReferenceAccess().getPatternReferenceParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePatternReference_in_ruleReference742);
                    this_PatternReference_2=rulePatternReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PatternReference_2; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRulePatternReference"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:364:1: entryRulePatternReference returns [EObject current=null] : iv_rulePatternReference= rulePatternReference EOF ;
    public final EObject entryRulePatternReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternReference = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:365:2: (iv_rulePatternReference= rulePatternReference EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:366:2: iv_rulePatternReference= rulePatternReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternReferenceRule()); 
            }
            pushFollow(FOLLOW_rulePatternReference_in_entryRulePatternReference778);
            iv_rulePatternReference=rulePatternReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternReference788); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternReference"


    // $ANTLR start "rulePatternReference"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:373:1: rulePatternReference returns [EObject current=null] : ( (lv_pattern_0_0= RULE_PATTERN ) ) ;
    public final EObject rulePatternReference() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:376:28: ( ( (lv_pattern_0_0= RULE_PATTERN ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:377:1: ( (lv_pattern_0_0= RULE_PATTERN ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:377:1: ( (lv_pattern_0_0= RULE_PATTERN ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:378:1: (lv_pattern_0_0= RULE_PATTERN )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:378:1: (lv_pattern_0_0= RULE_PATTERN )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:379:3: lv_pattern_0_0= RULE_PATTERN
            {
            lv_pattern_0_0=(Token)match(input,RULE_PATTERN,FOLLOW_RULE_PATTERN_in_rulePatternReference829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_pattern_0_0, grammarAccess.getPatternReferenceAccess().getPatternPATTERNTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPatternReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"pattern",
                      		lv_pattern_0_0, 
                      		"PATTERN");
              	    
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
    // $ANTLR end "rulePatternReference"


    // $ANTLR start "entryRuleSpecReference"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:403:1: entryRuleSpecReference returns [EObject current=null] : iv_ruleSpecReference= ruleSpecReference EOF ;
    public final EObject entryRuleSpecReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecReference = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:404:2: (iv_ruleSpecReference= ruleSpecReference EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:405:2: iv_ruleSpecReference= ruleSpecReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSpecReference_in_entryRuleSpecReference869);
            iv_ruleSpecReference=ruleSpecReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecReference879); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecReference"


    // $ANTLR start "ruleSpecReference"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:412:1: ruleSpecReference returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) ( (lv_text_1_0= RULE_TEXT ) )? ) ;
    public final EObject ruleSpecReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:415:28: ( ( ( (otherlv_0= RULE_STRING ) ) ( (lv_text_1_0= RULE_TEXT ) )? ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:416:1: ( ( (otherlv_0= RULE_STRING ) ) ( (lv_text_1_0= RULE_TEXT ) )? )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:416:1: ( ( (otherlv_0= RULE_STRING ) ) ( (lv_text_1_0= RULE_TEXT ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:416:2: ( (otherlv_0= RULE_STRING ) ) ( (lv_text_1_0= RULE_TEXT ) )?
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:416:2: ( (otherlv_0= RULE_STRING ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:417:1: (otherlv_0= RULE_STRING )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:417:1: (otherlv_0= RULE_STRING )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:418:3: otherlv_0= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSpecReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecReference924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getSpecReferenceAccess().getSpecSpecificationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:429:2: ( (lv_text_1_0= RULE_TEXT ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_TEXT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:430:1: (lv_text_1_0= RULE_TEXT )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:430:1: (lv_text_1_0= RULE_TEXT )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:431:3: lv_text_1_0= RULE_TEXT
                    {
                    lv_text_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleSpecReference941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_text_1_0, grammarAccess.getSpecReferenceAccess().getTextTEXTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSpecReferenceRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"text",
                              		lv_text_1_0, 
                              		"TEXT");
                      	    
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
    // $ANTLR end "ruleSpecReference"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:455:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:456:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:457:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName984);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName995); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:464:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:467:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:468:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:468:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:469:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName1042);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:479:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_ID) ) {
                        int LA10_3 = input.LA(3);

                        if ( (synpred1_InternalSuite()) ) {
                            alt10=1;
                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:479:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:479:2: ( ( '.' )=>kw= '.' )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:479:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedName1070); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName1093);
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleXExpression"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:506:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:507:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:508:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1140);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1150); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:515:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:518:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:520:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1196);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:536:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:537:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:538:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1230);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1240); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:545:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:548:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:549:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:549:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_STRING||(LA12_1>=RULE_HEX && LA12_1<=RULE_ID)||LA12_1==17||(LA12_1>=19 && LA12_1<=21)||(LA12_1>=23 && LA12_1<=50)||(LA12_1>=52 && LA12_1<=77)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==22) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_STRING||(LA12_0>=RULE_HEX && LA12_0<=RULE_DECIMAL)||LA12_0==21||LA12_0==32||LA12_0==39||LA12_0==43||LA12_0==48||LA12_0==50||LA12_0==53||LA12_0==55||LA12_0==57||(LA12_0>=61 && LA12_0<=63)||LA12_0==66||(LA12_0>=68 && LA12_0<=75)) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:549:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:549:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:549:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:549:3: ()
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:550:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:555:2: ( ( ruleValidID ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:556:1: ( ruleValidID )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:556:1: ( ruleValidID )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:557:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1298);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1314);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:578:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:579:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:579:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:580:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1334);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:597:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:597:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:598:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1364);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:606:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==23) ) {
                        int LA11_1 = input.LA(2);

                        if ( (synpred2_InternalSuite()) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:606:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:606:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:606:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:611:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:611:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:611:7: ()
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:612:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:617:2: ( ( ruleOpMultiAssign ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:618:1: ( ruleOpMultiAssign )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:618:1: ( ruleOpMultiAssign )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:619:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1417);
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

                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:632:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:633:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:633:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:634:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1440);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:658:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:659:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:660:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1480);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1491); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:667:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:670:28: (kw= '=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:672:2: kw= '='
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpSingleAssign1528); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:685:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:686:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:687:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1568);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1579); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:694:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:697:28: (kw= '+=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:699:2: kw= '+='
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpMultiAssign1616); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:712:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:713:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:714:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1655);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1665); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:721:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:724:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:725:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:725:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:726:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1712);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:734:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalSuite()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:734:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:734:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:734:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:739:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:739:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:739:7: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:740:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:745:2: ( ( ruleOpOr ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:746:1: ( ruleOpOr )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:746:1: ( ruleOpOr )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:747:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1765);
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

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:760:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:761:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:761:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:762:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1788);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:786:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:787:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:788:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1827);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1838); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:795:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:798:28: (kw= '||' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:800:2: kw= '||'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOr1875); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:813:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:814:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:815:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1914);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1924); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:822:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:825:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:826:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:826:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:827:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1971);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:835:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalSuite()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:835:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:835:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:835:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:840:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:840:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:840:7: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:841:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:846:2: ( ( ruleOpAnd ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:847:1: ( ruleOpAnd )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:847:1: ( ruleOpAnd )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:848:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2024);
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

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:861:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:862:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:862:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:863:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2047);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:887:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:888:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:889:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2086);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2097); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:896:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:899:28: (kw= '&&' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:901:2: kw= '&&'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpAnd2134); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:914:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:915:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:916:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2173);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2183); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:923:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:926:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:927:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:927:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:928:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2230);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:936:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred5_InternalSuite()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==27) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred5_InternalSuite()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:936:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:936:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:936:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:941:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:941:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:941:7: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:942:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:947:2: ( ( ruleOpEquality ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:948:1: ( ruleOpEquality )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:948:1: ( ruleOpEquality )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:949:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2283);
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

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:962:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:963:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:963:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:964:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2306);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:988:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:989:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:990:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2345);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2356); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:997:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1000:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1001:1: (kw= '==' | kw= '!=' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1001:1: (kw= '==' | kw= '!=' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1002:2: kw= '=='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpEquality2394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1009:2: kw= '!='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpEquality2413); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1022:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1023:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1024:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2453);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2463); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1031:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1034:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1035:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1035:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1036:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2510);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop17:
            do {
                int alt17=3;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred7_InternalSuite()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred7_InternalSuite()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred6_InternalSuite()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred7_InternalSuite()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA17_6 = input.LA(2);

                    if ( (synpred7_InternalSuite()) ) {
                        alt17=2;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1046:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1046:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1046:6: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1047:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXRelationalExpression2546); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1056:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1057:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1057:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1058:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2569);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
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


            	    }
            	    break;
            	case 2 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1075:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1075:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1075:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1075:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1075:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1080:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1080:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1080:7: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1081:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1086:2: ( ( ruleOpCompare ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1087:1: ( ruleOpCompare )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1087:1: ( ruleOpCompare )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1088:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2630);
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

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1101:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1102:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1102:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1103:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2653);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1127:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1128:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1129:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2693);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2704); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1136:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1139:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1140:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1140:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1141:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1148:2: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1155:2: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare2780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1162:2: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare2799); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1175:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1176:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1177:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2839);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2849); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1184:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1187:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1188:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1188:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1189:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2896);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1197:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1197:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1197:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1197:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1202:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1202:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1202:7: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1203:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1208:2: ( ( ruleOpOther ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1209:1: ( ruleOpOther )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1209:1: ( ruleOpOther )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1210:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2949);
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

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1223:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1224:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1224:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1225:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2972);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1249:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1250:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1251:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3011);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3022); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1258:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1261:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1262:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1262:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt22=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt22=1;
                }
                break;
            case 34:
                {
                alt22=2;
                }
                break;
            case 35:
                {
                alt22=3;
                }
                break;
            case 31:
                {
                alt22=4;
                }
                break;
            case 32:
                {
                alt22=5;
                }
                break;
            case 36:
                {
                alt22=6;
                }
                break;
            case 37:
                {
                alt22=7;
                }
                break;
            case 38:
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1263:2: kw= '->'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther3060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1270:2: kw= '..'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther3079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1277:2: kw= '=>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1283:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1283:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1284:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1289:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==31) ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1==EOF||LA20_1==RULE_STRING||(LA20_1>=RULE_HEX && LA20_1<=RULE_ID)||LA20_1==21||LA20_1==32||LA20_1==39||LA20_1==43||LA20_1==48||LA20_1==50||LA20_1==53||LA20_1==55||LA20_1==57||(LA20_1>=61 && LA20_1<=63)||LA20_1==66||(LA20_1>=68 && LA20_1<=75)) ) {
                            alt20=2;
                        }
                        else if ( (LA20_1==31) && (synpred9_InternalSuite())) {
                            alt20=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1289:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1289:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1289:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1293:5: (kw= '>' kw= '>' )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1294:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3149); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3162); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1307:2: kw= '>'
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3183); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1313:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1313:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1314:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1319:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==32) ) {
                        int LA21_1 = input.LA(2);

                        if ( (synpred10_InternalSuite()) ) {
                            alt21=1;
                        }
                        else if ( (true) ) {
                            alt21=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1319:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1319:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1319:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1323:5: (kw= '<' kw= '<' )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1324:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3236); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3249); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1337:2: kw= '<'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3270); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1344:2: kw= '<>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1351:2: kw= '?:'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1358:2: kw= '<=>'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1371:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1372:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1373:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3369);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3379); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1380:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1383:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1384:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1384:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1385:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3426);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1393:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==39) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred11_InternalSuite()) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==21) ) {
                    int LA23_3 = input.LA(2);

                    if ( (synpred11_InternalSuite()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1393:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1393:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1393:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1398:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1398:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1398:7: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1399:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1404:2: ( ( ruleOpAdd ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1405:1: ( ruleOpAdd )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1405:1: ( ruleOpAdd )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1406:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3479);
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

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1419:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1420:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1420:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1421:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3502);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1445:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1446:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1447:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3541);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3552); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1454:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1457:28: ( (kw= '+' | kw= '-' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1458:1: (kw= '+' | kw= '-' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1458:1: (kw= '+' | kw= '-' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            else if ( (LA24_0==21) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1459:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpAdd3590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1466:2: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpAdd3609); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1479:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1480:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1481:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3649);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3659); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1488:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1491:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1492:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1492:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1493:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3706);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1501:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (synpred12_InternalSuite()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (synpred12_InternalSuite()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA25_4 = input.LA(2);

                    if ( (synpred12_InternalSuite()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA25_5 = input.LA(2);

                    if ( (synpred12_InternalSuite()) ) {
                        alt25=1;
                    }


                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1501:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1501:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1501:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1506:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1506:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1506:7: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1507:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1512:2: ( ( ruleOpMulti ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1513:1: ( ruleOpMulti )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1513:1: ( ruleOpMulti )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1514:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3759);
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

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1527:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1528:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1528:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1529:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3782);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1553:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1554:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1555:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3821);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3832); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1562:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1565:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1566:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1566:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt26=1;
                }
                break;
            case 40:
                {
                alt26=2;
                }
                break;
            case 41:
                {
                alt26=3;
                }
                break;
            case 42:
                {
                alt26=4;
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1567:2: kw= '*'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpMulti3870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1574:2: kw= '**'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1581:2: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1588:2: kw= '%'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti3927); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1601:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1602:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1603:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3967);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3977); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1610:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1613:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1614:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1614:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21||LA27_0==39||LA27_0==43) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_STRING||(LA27_0>=RULE_HEX && LA27_0<=RULE_ID)||LA27_0==32||LA27_0==48||LA27_0==50||LA27_0==53||LA27_0==55||LA27_0==57||(LA27_0>=61 && LA27_0<=63)||LA27_0==66||(LA27_0>=68 && LA27_0<=75)) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1614:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1614:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1614:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1614:3: ()
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1615:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1620:2: ( ( ruleOpUnary ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1621:1: ( ruleOpUnary )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1621:1: ( ruleOpUnary )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1622:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4035);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1635:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1636:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1636:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1637:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4056);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1655:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4085);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1671:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1672:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1673:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4121);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4132); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1680:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1683:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1684:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1684:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt28=1;
                }
                break;
            case 21:
                {
                alt28=2;
                }
                break;
            case 39:
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1685:2: kw= '!'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary4170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1692:2: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpUnary4189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1699:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary4208); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1712:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1713:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1714:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4248);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4258); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1721:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1724:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1725:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1725:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1726:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4305);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1734:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==44) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred13_InternalSuite()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1734:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1734:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1734:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1736:5: ( () otherlv_2= 'as' )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1736:6: () otherlv_2= 'as'
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1736:6: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1737:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXCastedExpression4340); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1746:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1747:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1747:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1748:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4363);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1772:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1773:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1774:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4401);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4411); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1781:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1784:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1785:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1785:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1786:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4458);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop37:
            do {
                int alt37=3;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred14_InternalSuite()) ) {
                        alt37=1;
                    }
                    else if ( (synpred15_InternalSuite()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred15_InternalSuite()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred15_InternalSuite()) ) {
                        alt37=2;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1800:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1800:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1800:26: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1801:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall4507); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1810:1: ( ( ruleValidID ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1811:1: ( ruleValidID )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1811:1: ( ruleValidID )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1812:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4530);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4546);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1833:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1834:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1834:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1835:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4568);
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
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1852:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1852:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1852:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1852:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1852:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1868:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1868:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1868:8: ()
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1869:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1874:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt30=3;
            	    switch ( input.LA(1) ) {
            	    case 19:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt30=3;
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
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1874:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall4654); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1879:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1879:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1880:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1880:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1881:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4678); if (state.failed) return current;
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
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1895:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1895:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1896:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1896:1: (lv_spreading_9_0= '*.' )
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1897:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4715); if (state.failed) return current;
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

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1910:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==32) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1910:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall4744); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1914:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1915:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1915:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1916:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4765);
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

            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1932:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==47) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1932:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4778); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1936:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1937:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1937:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1938:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4799);
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
            	            	    break loop31;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall4813); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1958:3: ( ( ruleValidID ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1959:1: ( ruleValidID )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1959:1: ( ruleValidID )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1960:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4838);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1973:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1973:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1973:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1973:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1980:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1981:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4872); if (state.failed) return current;
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

            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1994:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt34=3;
            	            alt34 = dfa34.predict(input);
            	            switch (alt34) {
            	                case 1 :
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1994:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1994:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1994:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2011:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2012:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4957);
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
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2029:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2029:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2029:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2029:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2030:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2030:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2031:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4985);
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

            	                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2047:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop33:
            	                    do {
            	                        int alt33=2;
            	                        int LA33_0 = input.LA(1);

            	                        if ( (LA33_0==47) ) {
            	                            alt33=1;
            	                        }


            	                        switch (alt33) {
            	                    	case 1 :
            	                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2047:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4998); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2051:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2052:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2052:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2053:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5019);
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
            	                    	    break loop33;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall5036); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2073:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt36=2;
            	    alt36 = dfa36.predict(input);
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2073:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2076:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2077:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5071);
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2101:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2102:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2103:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5111);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5121); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2110:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2113:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2114:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2114:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt38=13;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2115:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5168);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2125:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5195);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2135:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5222);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2145:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5249);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2155:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5276);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2165:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5303);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2175:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5330);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2185:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5357);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2195:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5384);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2205:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5411);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2215:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5438);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2225:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5465);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2235:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5492);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2251:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2252:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2253:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5527);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5537); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2260:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2263:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2264:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2264:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt39=6;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) && (synpred19_InternalSuite())) {
                alt39=1;
            }
            else if ( ((LA39_0>=69 && LA39_0<=70)) ) {
                alt39=2;
            }
            else if ( ((LA39_0>=RULE_HEX && LA39_0<=RULE_DECIMAL)) ) {
                alt39=3;
            }
            else if ( (LA39_0==71) ) {
                alt39=4;
            }
            else if ( (LA39_0==RULE_STRING) ) {
                alt39=5;
            }
            else if ( (LA39_0==72) ) {
                alt39=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2264:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2264:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2264:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5597);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2277:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5625);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2287:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5652);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2297:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5679);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2307:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5706);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2317:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5733);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2333:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2334:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2335:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5768);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5778); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2342:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2345:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2346:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2346:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2346:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2346:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2346:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2348:5: ( () otherlv_1= '[' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2348:6: () otherlv_1= '['
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2348:6: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2349:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2358:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2358:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2373:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2373:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2373:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID||LA41_0==35||LA41_0==48) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2373:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2373:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2374:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2374:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2375:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5911);
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

                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2391:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==47) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2391:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5924); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2395:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2396:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2396:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2397:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5945);
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
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2413:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2414:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2414:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2415:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
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

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2428:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2429:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2429:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2430:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6004);
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

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXClosure6016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2458:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2459:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2460:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6052);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6062); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2467:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2470:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2471:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2471:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2471:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2471:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2472:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2477:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_STRING||(LA44_0>=RULE_HEX && LA44_0<=RULE_ID)||LA44_0==21||LA44_0==32||LA44_0==39||LA44_0==43||LA44_0==48||LA44_0==50||LA44_0==53||LA44_0==55||LA44_0==57||(LA44_0>=61 && LA44_0<=66)||(LA44_0>=68 && LA44_0<=75)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2477:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2477:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2478:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2478:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2479:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6118);
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

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2495:2: (otherlv_2= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==17) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2495:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXExpressionInClosure6131); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2507:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2508:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2509:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6171);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6181); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2516:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2519:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2520:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2520:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2520:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2520:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2520:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2536:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2536:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2536:7: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2537:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2542:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==35||LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2542:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2542:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2543:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2543:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2544:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6289);
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

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2560:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==47) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2560:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure6302); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2564:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2565:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2565:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2566:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6323);
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2582:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2583:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2583:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2584:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,51,FOLLOW_51_in_ruleXShortClosure6345); if (state.failed) return current;
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

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2597:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2598:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2598:1: (lv_expression_5_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2599:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6381);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2623:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2624:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2625:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6417);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6427); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2632:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2635:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2636:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2636:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2636:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXParenthesizedExpression6464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6486);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXParenthesizedExpression6497); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2661:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2662:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2663:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6533);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6543); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2670:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2673:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2674:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2674:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2674:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2674:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2675:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression6589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression6601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2688:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2689:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2689:1: (lv_if_3_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2690:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6622);
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

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression6634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2710:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2711:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2711:1: (lv_then_5_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2712:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6655);
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

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2728:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==54) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred23_InternalSuite()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2728:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2728:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2728:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2733:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2734:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2734:1: (lv_else_7_0= ruleXExpression )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2735:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6698);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2759:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2760:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2761:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6736);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6746); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2768:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2771:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2772:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2772:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2772:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2772:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2773:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING||(LA49_0>=RULE_HEX && LA49_0<=RULE_ID)||LA49_0==21||LA49_0==32||LA49_0==39||LA49_0==43||LA49_0==50||LA49_0==53||LA49_0==55||LA49_0==57||(LA49_0>=61 && LA49_0<=63)||LA49_0==66||(LA49_0>=68 && LA49_0<=75)) ) {
                alt49=1;
            }
            else if ( (LA49_0==48) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==RULE_ID) ) {
                    int LA49_3 = input.LA(3);

                    if ( ((LA49_3>=19 && LA49_3<=42)||(LA49_3>=44 && LA49_3<=46)||(LA49_3>=48 && LA49_3<=50)||LA49_3==67) ) {
                        alt49=1;
                    }
                    else if ( (LA49_3==56) && (synpred25_InternalSuite())) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA49_2==RULE_STRING||(LA49_2>=RULE_HEX && LA49_2<=RULE_DECIMAL)||LA49_2==21||LA49_2==32||LA49_2==39||LA49_2==43||LA49_2==48||LA49_2==50||LA49_2==53||LA49_2==55||LA49_2==57||(LA49_2>=61 && LA49_2<=63)||LA49_2==66||(LA49_2>=68 && LA49_2<=75)) ) {
                    alt49=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID) ) {
                        int LA48_1 = input.LA(2);

                        if ( (LA48_1==56) && (synpred24_InternalSuite())) {
                            alt48=1;
                        }
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2787:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2787:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2787:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2788:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2788:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2789:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6835);
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

                            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6847); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2809:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2810:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2810:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2811:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6871);
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


                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2828:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2828:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2828:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2828:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2828:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2834:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2834:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2838:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2839:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2839:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2840:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6936);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2860:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2861:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2861:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2862:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6971);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2886:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID||LA50_0==35||LA50_0==48||LA50_0==56||LA50_0==60) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2887:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2887:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2888:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7018);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
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

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2904:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==58) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2904:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression7032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression7044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2912:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2913:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2913:1: (lv_default_14_0= ruleXExpression )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2914:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7065);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression7079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2942:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2943:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2944:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7115);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7125); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2951:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2954:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2955:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2955:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2955:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2955:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==35||LA52_0==48) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2956:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2956:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2957:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7171);
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

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2973:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==60) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2973:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXCasePart7185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2977:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2978:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2978:1: (lv_case_2_0= ruleXExpression )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2979:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7206);
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

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart7220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2999:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3000:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3000:1: (lv_then_4_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3001:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7241);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3025:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3026:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3027:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7277);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7287); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3034:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3037:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3038:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3038:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3038:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3038:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3039:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXForLoopExpression7333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression7345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3052:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3053:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3053:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3054:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7366);
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

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression7378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3074:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3075:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3075:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3076:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7399);
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

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXForLoopExpression7411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3096:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3097:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3097:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3098:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7432);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3122:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3123:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3124:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7468);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7478); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3131:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3134:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3135:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3135:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3135:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3135:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3136:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXWhileExpression7524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXWhileExpression7536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3149:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3150:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3150:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3151:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7557);
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

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXWhileExpression7569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3171:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3172:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3172:1: (lv_body_5_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3173:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7590);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3197:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3198:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3199:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7626);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7636); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3206:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3209:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3210:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3210:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3210:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3210:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3211:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression7682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3220:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3221:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3221:1: (lv_body_2_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3222:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7703);
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

            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXDoWhileExpression7727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3246:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3247:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3247:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3248:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7748);
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

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXDoWhileExpression7760); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3276:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3277:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3278:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7796);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7806); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3285:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3288:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3289:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3289:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3289:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3289:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3290:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXBlockExpression7852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3299:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_STRING||(LA55_0>=RULE_HEX && LA55_0<=RULE_ID)||LA55_0==21||LA55_0==32||LA55_0==39||LA55_0==43||LA55_0==48||LA55_0==50||LA55_0==53||LA55_0==55||LA55_0==57||(LA55_0>=61 && LA55_0<=66)||(LA55_0>=68 && LA55_0<=75)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3299:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3299:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3300:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3300:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3301:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7874);
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

            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3317:2: (otherlv_3= ';' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==17) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3317:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7887); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleXBlockExpression7903); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3333:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3334:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3335:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7939);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7949); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3342:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3345:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3346:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3346:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=64 && LA56_0<=65)) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_STRING||(LA56_0>=RULE_HEX && LA56_0<=RULE_ID)||LA56_0==21||LA56_0==32||LA56_0==39||LA56_0==43||LA56_0==48||LA56_0==50||LA56_0==53||LA56_0==55||LA56_0==57||(LA56_0>=61 && LA56_0<=63)||LA56_0==66||(LA56_0>=68 && LA56_0<=75)) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3347:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7996);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3357:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8023);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3373:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3374:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3375:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8058);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8068); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3382:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3385:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3386:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3386:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3386:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3386:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3387:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3392:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==64) ) {
                alt57=1;
            }
            else if ( (LA57_0==65) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3392:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3392:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3393:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3393:1: (lv_writeable_1_0= 'var' )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3394:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration8121); if (state.failed) return current;
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3408:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration8152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3412:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred26_InternalSuite()) ) {
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
            else if ( (LA58_0==48) && (synpred26_InternalSuite())) {
                alt58=1;
            }
            else if ( (LA58_0==35) && (synpred26_InternalSuite())) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3412:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3412:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3412:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3420:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3420:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3420:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3421:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3421:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3422:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8200);
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

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3438:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3439:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3439:1: (lv_name_4_0= ruleValidID )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3440:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8221);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3457:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3457:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3458:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3458:1: (lv_name_5_0= ruleValidID )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3459:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8250);
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

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3475:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==22) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3475:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleXVariableDeclaration8264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3479:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3480:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3480:1: (lv_right_7_0= ruleXExpression )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3481:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8285);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3505:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3506:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3507:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8323);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8333); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3514:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3517:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3518:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3518:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3518:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3518:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==RULE_ID||LA60_1==19||LA60_1==32||LA60_1==50) ) {
                    alt60=1;
                }
            }
            else if ( (LA60_0==35||LA60_0==48) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3519:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3519:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3520:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8379);
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

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3536:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3537:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3537:1: (lv_name_1_0= ruleValidID )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3538:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8401);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3562:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3563:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3564:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8437);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8447); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3571:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3574:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3575:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3575:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3575:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3575:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3576:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3576:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3577:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8493);
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

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3593:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3594:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3594:1: (lv_name_1_0= ruleValidID )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3595:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8514);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3619:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3620:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3621:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8550);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8560); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3628:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3631:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3632:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3632:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3632:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3632:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3633:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3638:2: ( ( ruleStaticQualifier ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==67) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3639:1: ( ruleStaticQualifier )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3639:1: ( ruleStaticQualifier )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3640:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8617);
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

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3653:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==32) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3653:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXFeatureCall8631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3657:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3658:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3658:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3659:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8652);
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

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3675:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==47) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3675:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8665); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3679:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3680:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3680:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3681:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8686);
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

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall8700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3701:3: ( ( ruleIdOrSuper ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3702:1: ( ruleIdOrSuper )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3702:1: ( ruleIdOrSuper )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3703:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8725);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3716:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3716:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3716:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3716:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3723:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3724:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall8759); if (state.failed) return current;
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

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3737:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt65=3;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3737:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3737:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3737:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3754:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3755:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8844);
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
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3772:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3772:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3772:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3772:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3773:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3773:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3774:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8872);
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

                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3790:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==47) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3790:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8885); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3794:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3795:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3795:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3796:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8906);
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

                    otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleXFeatureCall8923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3816:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3816:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3819:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3820:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8958);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3844:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3845:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3846:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8996);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9007); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3853:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3856:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3857:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3857:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==66) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3858:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9054);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3870:2: kw= 'super'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleIdOrSuper9078); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3883:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3884:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3885:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9119);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9130); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3892:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3895:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3896:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3896:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    int LA69_2 = input.LA(2);

                    if ( (LA69_2==67) ) {
                        alt69=1;
                    }


                }


                switch (alt69) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3897:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9177);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,67,FOLLOW_67_in_ruleStaticQualifier9195); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3921:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3922:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3923:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9236);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9246); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3930:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3933:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3934:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3934:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3934:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3934:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3935:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXConstructorCall9292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3944:1: ( ( ruleQualifiedName ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3945:1: ( ruleQualifiedName )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3945:1: ( ruleQualifiedName )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3946:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9315);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3959:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3959:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3959:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3959:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleXConstructorCall9336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3964:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3965:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3965:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3966:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9358);
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

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3982:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==47) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3982:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall9371); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3986:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3987:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3987:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3988:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9392);
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

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleXConstructorCall9406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4008:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4008:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4008:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4008:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall9429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4013:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt73=3;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4013:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4013:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4013:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4030:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4031:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9502);
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
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4048:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4048:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4048:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4048:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4049:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4049:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4050:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9530);
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

                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4066:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==47) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4066:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall9543); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4070:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4071:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4071:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4072:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9564);
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

                    otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleXConstructorCall9581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4092:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4092:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4095:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4096:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9616);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4120:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4121:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4122:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9653);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9663); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4129:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4132:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4133:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4133:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4133:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4133:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4134:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4139:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==69) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4139:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXBooleanLiteral9710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4144:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4144:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4145:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4145:1: (lv_isTrue_2_0= 'true' )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4146:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9734); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4167:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4168:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4169:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9784);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9794); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4176:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4179:28: ( ( () otherlv_1= 'null' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4180:1: ( () otherlv_1= 'null' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4180:1: ( () otherlv_1= 'null' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4180:2: () otherlv_1= 'null'
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4180:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4181:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXNullLiteral9840); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4198:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4199:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4200:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9876);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9886); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4207:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4210:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4211:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4211:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4211:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4211:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4212:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4217:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4218:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4218:1: (lv_value_1_0= ruleNumber )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4219:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9941);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4243:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4244:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4245:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9977);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9987); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4252:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4255:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4256:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4256:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4256:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4256:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4257:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4262:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4263:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4263:1: (lv_value_1_0= RULE_STRING )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4264:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10038); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4288:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4289:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4290:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10079);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10089); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4297:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4300:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4301:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4301:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4301:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4301:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4302:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTypeLiteral10135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXTypeLiteral10147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4315:1: ( ( ruleQualifiedName ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4316:1: ( ruleQualifiedName )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4316:1: ( ruleQualifiedName )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4317:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10170);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXTypeLiteral10182); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4342:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4343:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4344:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10218);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10228); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4351:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4354:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4355:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4355:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4355:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4355:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4356:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXThrowExpression10274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4365:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4366:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4366:1: (lv_expression_2_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4367:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10295);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4391:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4392:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4393:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10331);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10341); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4400:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4403:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4404:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4404:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4404:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4404:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4405:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXReturnExpression10387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4414:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4414:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4419:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4420:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10418);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4444:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4445:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4446:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10455);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10465); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4453:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4456:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4457:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4457:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4457:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4457:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4458:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4467:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4468:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4468:1: (lv_expression_2_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4469:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10532);
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

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4485:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==77) ) {
                alt80=1;
            }
            else if ( (LA80_0==76) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4485:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4485:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4485:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4485:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==77) ) {
                            int LA78_2 = input.LA(2);

                            if ( (synpred35_InternalSuite()) ) {
                                alt78=1;
                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4485:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4487:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4488:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10562);
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
                    	    if ( cnt78 >= 1 ) break loop78;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(78, input);
                                throw eee;
                        }
                        cnt78++;
                    } while (true);

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4504:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==76) ) {
                        int LA79_1 = input.LA(2);

                        if ( (synpred36_InternalSuite()) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4504:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4504:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4504:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10584); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4509:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4510:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4510:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4511:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10606);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4528:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4528:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4528:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4532:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4533:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4533:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4534:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10649);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4558:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4559:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4560:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10687);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10697); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4567:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4570:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4571:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4571:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4571:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4571:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4571:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleXCatchClause10742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXCatchClause10755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4580:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4581:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4581:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4582:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10776);
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

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXCatchClause10788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4602:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4603:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4603:1: (lv_expression_4_0= ruleXExpression )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4604:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10809);
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


    // $ANTLR start "entryRuleNumber"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4628:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4632:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4633:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10852);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10863); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4643:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4647:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4648:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4648:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_HEX) ) {
                alt84=1;
            }
            else if ( ((LA84_0>=RULE_INT && LA84_0<=RULE_DECIMAL)) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4648:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4656:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4656:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4656:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4656:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_INT) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==RULE_DECIMAL) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4656:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10935); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4664:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10961); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4671:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==19) ) {
                        int LA83_1 = input.LA(2);

                        if ( ((LA83_1>=RULE_INT && LA83_1<=RULE_DECIMAL)) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4672:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,19,FOLLOW_19_in_ruleNumber10981); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4677:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==RULE_INT) ) {
                                alt82=1;
                            }
                            else if ( (LA82_0==RULE_DECIMAL) ) {
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
                                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4677:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10997); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4685:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11023); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4703:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4704:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4705:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11076);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11086); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4712:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4715:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4716:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4716:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            else if ( (LA86_0==35||LA86_0==48) ) {
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4716:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4716:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4717:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11134);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4725:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==50) ) {
                            int LA85_2 = input.LA(2);

                            if ( (LA85_2==52) ) {
                                int LA85_3 = input.LA(3);

                                if ( (synpred38_InternalSuite()) ) {
                                    alt85=1;
                                }


                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4725:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4728:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4728:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4728:6: ()
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4729:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleJvmTypeReference11172); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleJvmTypeReference11184); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4744:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11216);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4760:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4761:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4762:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11251);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11261); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4769:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4772:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4773:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4773:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4773:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4773:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==48) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4773:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXFunctionTypeRef11299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4777:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_ID||LA88_0==35||LA88_0==48) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4777:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4777:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4778:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4778:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4779:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11321);
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

                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4795:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==47) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4795:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef11334); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4799:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4800:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4800:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4801:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11355);
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


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXFunctionTypeRef11371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleXFunctionTypeRef11385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4825:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4826:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4826:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4827:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11406);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4851:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4852:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4853:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11442);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11452); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4860:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4863:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4864:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4864:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4864:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4864:2: ( ( ruleQualifiedName ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4865:1: ( ruleQualifiedName )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4865:1: ( ruleQualifiedName )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4866:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11500);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4879:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4879:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4879:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4879:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleJvmParameterizedTypeReference11521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4884:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4885:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4885:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4886:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11543);
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

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4902:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==47) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4902:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleJvmParameterizedTypeReference11556); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4906:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4907:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4907:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4908:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11577);
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
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleJvmParameterizedTypeReference11591); if (state.failed) return current;
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4936:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4937:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4938:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11629);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11639); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4945:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4948:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4949:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4949:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID||LA92_0==35||LA92_0==48) ) {
                alt92=1;
            }
            else if ( (LA92_0==78) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4950:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11686);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4960:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11713);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4976:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4977:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4978:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11748);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11758); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4985:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4988:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4989:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4989:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4989:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4989:2: ()
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4990:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleJvmWildcardTypeReference11804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4999:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==79) ) {
                alt93=1;
            }
            else if ( (LA93_0==66) ) {
                alt93=2;
            }
            switch (alt93) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4999:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4999:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5000:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5000:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5001:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11826);
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
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5018:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5018:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5019:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5019:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5020:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11853);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5044:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5045:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5046:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11891);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11901); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5053:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5056:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5057:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5057:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5057:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBound11938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5061:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5062:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5062:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5063:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11959);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5087:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5088:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5089:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11995);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12005); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5096:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5099:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5100:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5100:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5100:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBoundAnded12042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5104:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5105:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5105:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5106:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12063);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5130:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5131:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5132:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12099);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12109); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5139:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5142:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5143:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5143:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5143:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleJvmLowerBound12146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5147:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5148:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5148:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5149:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12167);
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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5175:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5176:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5177:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12206);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12217); if (state.failed) return current;

            }

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
    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5184:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5187:28: (this_ID_0= RULE_ID )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5188:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12256); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSuite
    public final void synpred1_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:479:3: ( '.' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:480:2: '.'
        {
        match(input,19,FOLLOW_19_in_synpred1_InternalSuite1061); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSuite

    // $ANTLR start synpred2_InternalSuite
    public final void synpred2_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:606:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:606:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:606:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:606:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:606:5: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:607:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:607:2: ( ( ruleOpMultiAssign ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:608:1: ( ruleOpMultiAssign )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:608:1: ( ruleOpMultiAssign )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:609:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred2_InternalSuite1385);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalSuite

    // $ANTLR start synpred3_InternalSuite
    public final void synpred3_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:734:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:734:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:734:4: ( () ( ( ruleOpOr ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:734:5: () ( ( ruleOpOr ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:734:5: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:735:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:735:2: ( ( ruleOpOr ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:736:1: ( ruleOpOr )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:736:1: ( ruleOpOr )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:737:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred3_InternalSuite1733);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalSuite

    // $ANTLR start synpred4_InternalSuite
    public final void synpred4_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:835:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:835:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:835:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:835:5: () ( ( ruleOpAnd ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:835:5: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:836:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:836:2: ( ( ruleOpAnd ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:837:1: ( ruleOpAnd )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:837:1: ( ruleOpAnd )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:838:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred4_InternalSuite1992);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalSuite

    // $ANTLR start synpred5_InternalSuite
    public final void synpred5_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:936:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:936:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:936:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:936:5: () ( ( ruleOpEquality ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:936:5: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:937:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:937:2: ( ( ruleOpEquality ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:938:1: ( ruleOpEquality )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:938:1: ( ruleOpEquality )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:939:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred5_InternalSuite2251);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalSuite

    // $ANTLR start synpred6_InternalSuite
    public final void synpred6_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:4: ( ( () 'instanceof' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:5: ( () 'instanceof' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:5: ( () 'instanceof' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:6: () 'instanceof'
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1044:6: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1045:1: 
        {
        }

        match(input,28,FOLLOW_28_in_synpred6_InternalSuite2527); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalSuite

    // $ANTLR start synpred7_InternalSuite
    public final void synpred7_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1075:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1075:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1075:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1075:10: () ( ( ruleOpCompare ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1075:10: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1076:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1076:2: ( ( ruleOpCompare ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1077:1: ( ruleOpCompare )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1077:1: ( ruleOpCompare )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1078:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred7_InternalSuite2598);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalSuite

    // $ANTLR start synpred8_InternalSuite
    public final void synpred8_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1197:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1197:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1197:4: ( () ( ( ruleOpOther ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1197:5: () ( ( ruleOpOther ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1197:5: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1198:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1198:2: ( ( ruleOpOther ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1199:1: ( ruleOpOther )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1199:1: ( ruleOpOther )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1200:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred8_InternalSuite2917);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalSuite

    // $ANTLR start synpred9_InternalSuite
    public final void synpred9_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1289:3: ( ( '>' '>' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1289:4: ( '>' '>' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1289:4: ( '>' '>' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1290:2: '>' '>'
        {
        match(input,31,FOLLOW_31_in_synpred9_InternalSuite3133); if (state.failed) return ;
        match(input,31,FOLLOW_31_in_synpred9_InternalSuite3138); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalSuite

    // $ANTLR start synpred10_InternalSuite
    public final void synpred10_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1319:3: ( ( '<' '<' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1319:4: ( '<' '<' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1319:4: ( '<' '<' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1320:2: '<' '<'
        {
        match(input,32,FOLLOW_32_in_synpred10_InternalSuite3220); if (state.failed) return ;
        match(input,32,FOLLOW_32_in_synpred10_InternalSuite3225); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalSuite

    // $ANTLR start synpred11_InternalSuite
    public final void synpred11_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1393:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1393:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1393:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1393:5: () ( ( ruleOpAdd ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1393:5: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1394:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1394:2: ( ( ruleOpAdd ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1395:1: ( ruleOpAdd )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1395:1: ( ruleOpAdd )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1396:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred11_InternalSuite3447);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalSuite

    // $ANTLR start synpred12_InternalSuite
    public final void synpred12_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1501:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1501:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1501:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1501:5: () ( ( ruleOpMulti ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1501:5: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1502:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1502:2: ( ( ruleOpMulti ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1503:1: ( ruleOpMulti )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1503:1: ( ruleOpMulti )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1504:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred12_InternalSuite3727);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalSuite

    // $ANTLR start synpred13_InternalSuite
    public final void synpred13_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1734:3: ( ( () 'as' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1734:4: ( () 'as' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1734:4: ( () 'as' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1734:5: () 'as'
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1734:5: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1735:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred13_InternalSuite4321); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSuite

    // $ANTLR start synpred14_InternalSuite
    public final void synpred14_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1794:6: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1795:1: 
        {
        }

        match(input,19,FOLLOW_19_in_synpred14_InternalSuite4475); if (state.failed) return ;
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1796:1: ( ( ruleValidID ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1797:1: ( ruleValidID )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1797:1: ( ruleValidID )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1798:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred14_InternalSuite4484);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred14_InternalSuite4490);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalSuite

    // $ANTLR start synpred15_InternalSuite
    public final void synpred15_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1852:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1852:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1852:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1852:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1852:10: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1853:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1853:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt94=3;
        switch ( input.LA(1) ) {
        case 19:
            {
            alt94=1;
            }
            break;
        case 45:
            {
            alt94=2;
            }
            break;
        case 46:
            {
            alt94=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 94, 0, input);

            throw nvae;
        }

        switch (alt94) {
            case 1 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1853:4: '.'
                {
                match(input,19,FOLLOW_19_in_synpred15_InternalSuite4593); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1855:6: ( ( '?.' ) )
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1855:6: ( ( '?.' ) )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1856:1: ( '?.' )
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1856:1: ( '?.' )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1857:2: '?.'
                {
                match(input,45,FOLLOW_45_in_synpred15_InternalSuite4607); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1862:6: ( ( '*.' ) )
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1862:6: ( ( '*.' ) )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1863:1: ( '*.' )
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1863:1: ( '*.' )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1864:2: '*.'
                {
                match(input,46,FOLLOW_46_in_synpred15_InternalSuite4627); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalSuite

    // $ANTLR start synpred16_InternalSuite
    public final void synpred16_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1973:4: ( ( '(' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1974:1: ( '(' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1974:1: ( '(' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1975:2: '('
        {
        match(input,48,FOLLOW_48_in_synpred16_InternalSuite4854); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalSuite

    // $ANTLR start synpred17_InternalSuite
    public final void synpred17_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1994:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1994:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1994:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1994:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1994:6: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1995:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1995:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==35||LA96_0==48) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1995:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1995:3: ( ( ruleJvmFormalParameter ) )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1996:1: ( ruleJvmFormalParameter )
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1996:1: ( ruleJvmFormalParameter )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1997:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred17_InternalSuite4906);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1999:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==47) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1999:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred17_InternalSuite4913); if (state.failed) return ;
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2000:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2001:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2001:1: ( ruleJvmFormalParameter )
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2002:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred17_InternalSuite4920);
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

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2004:6: ( ( '|' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2005:1: ( '|' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2005:1: ( '|' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2006:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred17_InternalSuite4934); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalSuite

    // $ANTLR start synpred18_InternalSuite
    public final void synpred18_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2073:4: ( ( () '[' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2073:5: ( () '[' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2073:5: ( () '[' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2073:6: () '['
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2073:6: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2074:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred18_InternalSuite5054); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalSuite

    // $ANTLR start synpred19_InternalSuite
    public final void synpred19_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2264:3: ( ( () '[' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2264:4: ( () '[' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2264:4: ( () '[' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2264:5: () '['
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2264:5: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2265:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred19_InternalSuite5578); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSuite

    // $ANTLR start synpred21_InternalSuite
    public final void synpred21_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2358:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2358:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2358:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2358:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2358:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==35||LA98_0==48) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2358:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2358:7: ( ( ruleJvmFormalParameter ) )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2359:1: ( ruleJvmFormalParameter )
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2359:1: ( ruleJvmFormalParameter )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2360:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalSuite5857);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2362:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==47) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2362:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred21_InternalSuite5864); if (state.failed) return ;
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2363:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2364:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2364:1: ( ruleJvmFormalParameter )
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2365:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalSuite5871);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2367:6: ( ( '|' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2368:1: ( '|' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2368:1: ( '|' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2369:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred21_InternalSuite5885); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalSuite

    // $ANTLR start synpred23_InternalSuite
    public final void synpred23_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2728:4: ( 'else' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2728:6: 'else'
        {
        match(input,54,FOLLOW_54_in_synpred23_InternalSuite6668); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalSuite

    // $ANTLR start synpred24_InternalSuite
    public final void synpred24_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2782:6: ( ( ruleValidID ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2783:1: ( ruleValidID )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2783:1: ( ruleValidID )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2784:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalSuite6810);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,56,FOLLOW_56_in_synpred24_InternalSuite6816); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalSuite

    // $ANTLR start synpred25_InternalSuite
    public final void synpred25_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2828:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2828:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2828:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2828:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,48,FOLLOW_48_in_synpred25_InternalSuite6892); if (state.failed) return ;
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2829:1: ( ( ruleValidID ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2830:1: ( ruleValidID )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2830:1: ( ruleValidID )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:2831:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalSuite6899);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,56,FOLLOW_56_in_synpred25_InternalSuite6905); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalSuite

    // $ANTLR start synpred26_InternalSuite
    public final void synpred26_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3412:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3412:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3412:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3412:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3412:6: ( ( ruleJvmTypeReference ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3413:1: ( ruleJvmTypeReference )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3413:1: ( ruleJvmTypeReference )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3414:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred26_InternalSuite8170);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3416:2: ( ( ruleValidID ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3417:1: ( ruleValidID )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3417:1: ( ruleValidID )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3418:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred26_InternalSuite8179);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred26_InternalSuite

    // $ANTLR start synpred27_InternalSuite
    public final void synpred27_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3716:4: ( ( '(' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3717:1: ( '(' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3717:1: ( '(' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3718:2: '('
        {
        match(input,48,FOLLOW_48_in_synpred27_InternalSuite8741); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalSuite

    // $ANTLR start synpred28_InternalSuite
    public final void synpred28_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3737:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3737:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3737:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3737:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3737:6: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3738:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3738:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==35||LA102_0==48) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3738:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3738:3: ( ( ruleJvmFormalParameter ) )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3739:1: ( ruleJvmFormalParameter )
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3739:1: ( ruleJvmFormalParameter )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3740:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalSuite8793);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3742:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==47) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3742:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred28_InternalSuite8800); if (state.failed) return ;
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3743:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3744:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3744:1: ( ruleJvmFormalParameter )
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3745:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalSuite8807);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop101;
                    }
                } while (true);


                }
                break;

        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3747:6: ( ( '|' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3748:1: ( '|' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3748:1: ( '|' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3749:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred28_InternalSuite8821); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred28_InternalSuite

    // $ANTLR start synpred29_InternalSuite
    public final void synpred29_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3816:4: ( ( () '[' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3816:5: ( () '[' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3816:5: ( () '[' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3816:6: () '['
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3816:6: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3817:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred29_InternalSuite8941); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalSuite

    // $ANTLR start synpred30_InternalSuite
    public final void synpred30_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3959:4: ( '<' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:3959:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred30_InternalSuite9328); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalSuite

    // $ANTLR start synpred31_InternalSuite
    public final void synpred31_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4008:5: ( '(' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4008:7: '('
        {
        match(input,48,FOLLOW_48_in_synpred31_InternalSuite9421); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalSuite

    // $ANTLR start synpred32_InternalSuite
    public final void synpred32_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4013:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4013:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4013:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4013:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4013:6: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4014:1: 
        {
        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4014:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==35||LA104_0==48) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4014:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4014:3: ( ( ruleJvmFormalParameter ) )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4015:1: ( ruleJvmFormalParameter )
                {
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4015:1: ( ruleJvmFormalParameter )
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4016:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalSuite9451);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4018:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==47) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4018:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred32_InternalSuite9458); if (state.failed) return ;
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4019:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4020:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4020:1: ( ruleJvmFormalParameter )
                	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4021:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalSuite9465);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop103;
                    }
                } while (true);


                }
                break;

        }

        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4023:6: ( ( '|' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4024:1: ( '|' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4024:1: ( '|' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4025:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred32_InternalSuite9479); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred32_InternalSuite

    // $ANTLR start synpred33_InternalSuite
    public final void synpred33_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4092:4: ( ( () '[' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4092:5: ( () '[' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4092:5: ( () '[' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4092:6: () '['
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4092:6: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4093:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred33_InternalSuite9599); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalSuite

    // $ANTLR start synpred34_InternalSuite
    public final void synpred34_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4414:2: ( ( ruleXExpression ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4415:1: ( ruleXExpression )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4415:1: ( ruleXExpression )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4416:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred34_InternalSuite10401);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalSuite

    // $ANTLR start synpred35_InternalSuite
    public final void synpred35_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4485:5: ( 'catch' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4485:7: 'catch'
        {
        match(input,77,FOLLOW_77_in_synpred35_InternalSuite10546); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalSuite

    // $ANTLR start synpred36_InternalSuite
    public final void synpred36_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4504:5: ( 'finally' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4504:7: 'finally'
        {
        match(input,76,FOLLOW_76_in_synpred36_InternalSuite10576); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalSuite

    // $ANTLR start synpred38_InternalSuite
    public final void synpred38_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4725:2: ( ( () '[' ']' ) )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4725:3: ( () '[' ']' )
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4725:3: ( () '[' ']' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4725:4: () '[' ']'
        {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4725:4: ()
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4726:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred38_InternalSuite11149); if (state.failed) return ;
        match(input,52,FOLLOW_52_in_synpred38_InternalSuite11153); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalSuite

    // $ANTLR start synpred39_InternalSuite
    public final void synpred39_InternalSuite_fragment() throws RecognitionException {   
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4879:4: ( '<' )
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:4879:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred39_InternalSuite11513); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalSuite

    // Delegated rules

    public final boolean synpred36_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSuite_fragment(); // can never throw exception
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
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\1\uffff\1\3\2\uffff\1\3\1\uffff";
    static final String DFA5_minS =
        "\1\13\1\4\1\13\1\uffff\1\4\1\uffff";
    static final String DFA5_maxS =
        "\1\13\1\23\1\24\1\uffff\1\23\1\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\uffff\1\2";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\14\uffff\2\3\1\2",
            "\1\4\10\uffff\1\5",
            "",
            "\1\3\14\uffff\2\3\1\2",
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
            return "167:1: ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )";
        }
    }
    static final String DFA19_eotS =
        "\13\uffff";
    static final String DFA19_eofS =
        "\1\1\12\uffff";
    static final String DFA19_minS =
        "\1\6\1\uffff\10\0\1\uffff";
    static final String DFA19_maxS =
        "\1\115\1\uffff\10\0\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA19_specialS =
        "\2\uffff\1\3\1\6\1\2\1\0\1\1\1\7\1\5\1\4\1\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\1\uffff\4\1\5\uffff\1\1\1\uffff\3\1\1\uffff\10\1\1\2\1"+
            "\3\1\4\1\5\1\6\1\7\1\10\1\11\14\1\1\uffff\17\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 1197:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_6 = input.LA(1);

                         
                        int index19_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_4 = input.LA(1);

                         
                        int index19_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_9 = input.LA(1);

                         
                        int index19_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_7 = input.LA(1);

                         
                        int index19_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\101\uffff";
    static final String DFA35_eofS =
        "\1\2\100\uffff";
    static final String DFA35_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA35_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\2\1\uffff\4\2\5\uffff\1\2\1\uffff\3\2\1\uffff\31\2\1\1\2"+
            "\2\1\uffff\17\2\1\uffff\12\2",
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
            return "1973:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred16_InternalSuite()) ) {s = 64;}

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
    static final String DFA34_eotS =
        "\36\uffff";
    static final String DFA34_eofS =
        "\36\uffff";
    static final String DFA34_minS =
        "\1\6\2\0\33\uffff";
    static final String DFA34_maxS =
        "\1\113\2\0\33\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\5\1\uffff\3\5\1\1\11\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\1\5\3\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5"+
            "\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10"+
            "\5",
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
            return "1994:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==RULE_ID) ) {s = 1;}

                        else if ( (LA34_0==48) ) {s = 2;}

                        else if ( (LA34_0==35) && (synpred17_InternalSuite())) {s = 3;}

                        else if ( (LA34_0==51) && (synpred17_InternalSuite())) {s = 4;}

                        else if ( (LA34_0==RULE_STRING||(LA34_0>=RULE_HEX && LA34_0<=RULE_DECIMAL)||LA34_0==21||LA34_0==32||LA34_0==39||LA34_0==43||LA34_0==50||LA34_0==53||LA34_0==55||LA34_0==57||(LA34_0>=61 && LA34_0<=63)||LA34_0==66||(LA34_0>=68 && LA34_0<=75)) ) {s = 5;}

                        else if ( (LA34_0==49) ) {s = 29;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_2);
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
    static final String DFA36_eotS =
        "\101\uffff";
    static final String DFA36_eofS =
        "\1\2\100\uffff";
    static final String DFA36_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA36_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA36_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\2\1\uffff\4\2\5\uffff\1\2\1\uffff\3\2\1\uffff\33\2\1\1\1"+
            "\uffff\17\2\1\uffff\12\2",
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
            return "2073:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred18_InternalSuite()) ) {s = 64;}

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
    static final String DFA38_eotS =
        "\16\uffff";
    static final String DFA38_eofS =
        "\16\uffff";
    static final String DFA38_minS =
        "\1\6\15\uffff";
    static final String DFA38_maxS =
        "\1\113\15\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA38_specialS =
        "\16\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\5\1\uffff\3\5\1\4\24\uffff\1\4\17\uffff\1\15\1\uffff\1\5"+
            "\2\uffff\1\6\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2"+
            "\uffff\1\4\1\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "2114:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA42_eotS =
        "\40\uffff";
    static final String DFA42_eofS =
        "\40\uffff";
    static final String DFA42_minS =
        "\1\6\2\0\35\uffff";
    static final String DFA42_maxS =
        "\1\113\2\0\35\uffff";
    static final String DFA42_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA42_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\5\1\uffff\3\5\1\1\11\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\1\5\3\uffff\1\5\4\uffff\1\2\1\uffff\1\5\1\4\2\5\1\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\6\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "2358:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_0 = input.LA(1);

                         
                        int index42_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA42_0==RULE_ID) ) {s = 1;}

                        else if ( (LA42_0==48) ) {s = 2;}

                        else if ( (LA42_0==35) && (synpred21_InternalSuite())) {s = 3;}

                        else if ( (LA42_0==51) && (synpred21_InternalSuite())) {s = 4;}

                        else if ( (LA42_0==RULE_STRING||(LA42_0>=RULE_HEX && LA42_0<=RULE_DECIMAL)||LA42_0==21||LA42_0==32||LA42_0==39||LA42_0==43||LA42_0==50||(LA42_0>=52 && LA42_0<=53)||LA42_0==55||LA42_0==57||(LA42_0>=61 && LA42_0<=66)||(LA42_0>=68 && LA42_0<=75)) ) {s = 5;}

                         
                        input.seek(index42_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\101\uffff";
    static final String DFA66_eofS =
        "\1\2\100\uffff";
    static final String DFA66_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA66_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\2\1\uffff\4\2\5\uffff\1\2\1\uffff\3\2\1\uffff\31\2\1\1\2"+
            "\2\1\uffff\17\2\1\uffff\12\2",
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
            return "3716:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred27_InternalSuite()) ) {s = 64;}

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
        "\36\uffff";
    static final String DFA65_eofS =
        "\36\uffff";
    static final String DFA65_minS =
        "\1\6\2\0\33\uffff";
    static final String DFA65_maxS =
        "\1\113\2\0\33\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA65_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\5\1\uffff\3\5\1\1\11\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\1\5\3\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5"+
            "\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10"+
            "\5",
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
            return "3737:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA65_0==48) ) {s = 2;}

                        else if ( (LA65_0==35) && (synpred28_InternalSuite())) {s = 3;}

                        else if ( (LA65_0==51) && (synpred28_InternalSuite())) {s = 4;}

                        else if ( (LA65_0==RULE_STRING||(LA65_0>=RULE_HEX && LA65_0<=RULE_DECIMAL)||LA65_0==21||LA65_0==32||LA65_0==39||LA65_0==43||LA65_0==50||LA65_0==53||LA65_0==55||LA65_0==57||(LA65_0>=61 && LA65_0<=63)||LA65_0==66||(LA65_0>=68 && LA65_0<=75)) ) {s = 5;}

                        else if ( (LA65_0==49) ) {s = 29;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSuite()) ) {s = 4;}

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
        "\101\uffff";
    static final String DFA67_eofS =
        "\1\2\100\uffff";
    static final String DFA67_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA67_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\2\1\uffff\4\2\5\uffff\1\2\1\uffff\3\2\1\uffff\33\2\1\1\1"+
            "\uffff\17\2\1\uffff\12\2",
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
            return "3816:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred29_InternalSuite()) ) {s = 64;}

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
    static final String DFA71_eotS =
        "\101\uffff";
    static final String DFA71_eofS =
        "\1\2\100\uffff";
    static final String DFA71_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA71_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\2\1\uffff\4\2\5\uffff\1\2\1\uffff\3\2\1\uffff\11\2\1\1\22"+
            "\2\1\uffff\17\2\1\uffff\12\2",
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
            return "3959:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred30_InternalSuite()) ) {s = 64;}

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
    static final String DFA74_eotS =
        "\101\uffff";
    static final String DFA74_eofS =
        "\1\2\100\uffff";
    static final String DFA74_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA74_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\2\1\uffff\4\2\5\uffff\1\2\1\uffff\3\2\1\uffff\31\2\1\1\2"+
            "\2\1\uffff\17\2\1\uffff\12\2",
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
            return "4008:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred31_InternalSuite()) ) {s = 64;}

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
        "\36\uffff";
    static final String DFA73_eofS =
        "\36\uffff";
    static final String DFA73_minS =
        "\1\6\2\0\33\uffff";
    static final String DFA73_maxS =
        "\1\113\2\0\33\uffff";
    static final String DFA73_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA73_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\5\1\uffff\3\5\1\1\11\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\1\5\3\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5"+
            "\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10"+
            "\5",
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
            return "4013:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA73_0==48) ) {s = 2;}

                        else if ( (LA73_0==35) && (synpred32_InternalSuite())) {s = 3;}

                        else if ( (LA73_0==51) && (synpred32_InternalSuite())) {s = 4;}

                        else if ( (LA73_0==RULE_STRING||(LA73_0>=RULE_HEX && LA73_0<=RULE_DECIMAL)||LA73_0==21||LA73_0==32||LA73_0==39||LA73_0==43||LA73_0==50||LA73_0==53||LA73_0==55||LA73_0==57||(LA73_0>=61 && LA73_0<=63)||LA73_0==66||(LA73_0>=68 && LA73_0<=75)) ) {s = 5;}

                        else if ( (LA73_0==49) ) {s = 29;}

                         
                        input.seek(index73_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSuite()) ) {s = 4;}

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
        "\101\uffff";
    static final String DFA75_eofS =
        "\1\2\100\uffff";
    static final String DFA75_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA75_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\2\1\uffff\4\2\5\uffff\1\2\1\uffff\3\2\1\uffff\33\2\1\1\1"+
            "\uffff\17\2\1\uffff\12\2",
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
            return "4092:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred33_InternalSuite()) ) {s = 64;}

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
    static final String DFA77_eotS =
        "\101\uffff";
    static final String DFA77_eofS =
        "\1\33\100\uffff";
    static final String DFA77_minS =
        "\1\6\32\0\46\uffff";
    static final String DFA77_maxS =
        "\1\115\32\0\46\uffff";
    static final String DFA77_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\46\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\21\1\uffff\1\15\1\16\1\17\1\1\5\uffff\1\33\1\uffff\2\33\1"+
            "\3\1\uffff\11\33\1\10\6\33\1\4\3\33\1\2\4\33\1\32\1\33\1\12"+
            "\1\uffff\1\33\1\23\1\33\1\7\1\33\1\6\3\33\1\24\1\25\1\26\2\33"+
            "\1\11\1\uffff\1\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
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
            return "4414:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_3 = input.LA(1);

                         
                        int index77_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA77_4 = input.LA(1);

                         
                        int index77_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA77_5 = input.LA(1);

                         
                        int index77_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA77_6 = input.LA(1);

                         
                        int index77_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA77_7 = input.LA(1);

                         
                        int index77_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA77_8 = input.LA(1);

                         
                        int index77_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA77_9 = input.LA(1);

                         
                        int index77_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA77_10 = input.LA(1);

                         
                        int index77_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA77_11 = input.LA(1);

                         
                        int index77_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA77_12 = input.LA(1);

                         
                        int index77_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA77_13 = input.LA(1);

                         
                        int index77_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA77_14 = input.LA(1);

                         
                        int index77_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA77_15 = input.LA(1);

                         
                        int index77_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA77_16 = input.LA(1);

                         
                        int index77_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA77_17 = input.LA(1);

                         
                        int index77_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA77_18 = input.LA(1);

                         
                        int index77_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA77_19 = input.LA(1);

                         
                        int index77_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA77_20 = input.LA(1);

                         
                        int index77_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA77_21 = input.LA(1);

                         
                        int index77_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA77_22 = input.LA(1);

                         
                        int index77_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA77_23 = input.LA(1);

                         
                        int index77_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA77_24 = input.LA(1);

                         
                        int index77_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA77_25 = input.LA(1);

                         
                        int index77_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA77_26 = input.LA(1);

                         
                        int index77_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_26);
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
    static final String DFA91_eotS =
        "\101\uffff";
    static final String DFA91_eofS =
        "\1\2\100\uffff";
    static final String DFA91_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA91_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA91_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\2\1\uffff\4\2\5\uffff\1\2\1\uffff\3\2\1\uffff\11\2\1\1\22"+
            "\2\1\uffff\17\2\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "4879:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalSuite()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleSuiteFile_in_entryRuleSuiteFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuiteFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSuiteFile123 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSuiteFile144 = new BitSet(new long[]{0x0000000000060012L});
    public static final BitSet FOLLOW_17_in_ruleSuiteFile157 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_ruleImport_in_ruleSuiteFile182 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_ruleSuite_in_ruleSuiteFile204 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImport288 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport312 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport339 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleImport353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard450 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedNameWithWildCard468 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedNameWithWildCard481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuite_in_entryRuleSuite521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuite531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SUITE_NAME_in_ruleSuite582 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleSuite608 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleReference692 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleSpecReference_in_ruleReference715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternReference_in_ruleReference742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternReference_in_entryRulePatternReference778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternReference788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATTERN_in_rulePatternReference829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecReference_in_entryRuleSpecReference869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecReference879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecReference924 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleSpecReference941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName1042 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedName1070 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName1093 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1298 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1314 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1364 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1417 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpSingleAssign1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpMultiAssign1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1712 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1765 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1788 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOr1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1971 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2024 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2047 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpAnd2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2230 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2283 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2306 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpEquality2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2510 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_28_in_ruleXRelationalExpression2546 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2569 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2630 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2653 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2896 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2949 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2972 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3118 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3149 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3205 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3236 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3426 = new BitSet(new long[]{0x0000008000200002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3479 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3502 = new BitSet(new long[]{0x0000008000200002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpAdd3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAdd3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3706 = new BitSet(new long[]{0x0000070000100002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3759 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3782 = new BitSet(new long[]{0x0000070000100002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpMulti3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4035 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpUnary4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4305 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXCastedExpression4340 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4363 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4458 = new BitSet(new long[]{0x0000600000080002L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall4507 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4530 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4546 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4568 = new BitSet(new long[]{0x0000600000080002L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall4654 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4678 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4715 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall4744 = new BitSet(new long[]{0x0001000800000800L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4765 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4778 = new BitSet(new long[]{0x0001000800000800L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4799 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall4813 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4838 = new BitSet(new long[]{0x0005600000080002L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4872 = new BitSet(new long[]{0xE2AF088900200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4957 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4985 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4998 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5019 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall5036 = new BitSet(new long[]{0x0004600000080002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5071 = new BitSet(new long[]{0x0000600000080002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5838 = new BitSet(new long[]{0xE2BD088900200F40L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5911 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5924 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5945 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5967 = new BitSet(new long[]{0xE2B5088100200F40L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6004 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6118 = new BitSet(new long[]{0xE2A5088100220F42L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_17_in_ruleXExpressionInClosure6131 = new BitSet(new long[]{0xE2A5088100200F42L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6289 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure6302 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6323 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_ruleXShortClosure6345 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXParenthesizedExpression6464 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6486 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXParenthesizedExpression6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression6589 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression6601 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6622 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression6634 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6655 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6676 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6792 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6835 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6847 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6871 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6915 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6936 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6948 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6971 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6983 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6997 = new BitSet(new long[]{0x1101000800000800L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7018 = new BitSet(new long[]{0x1D01000800000800L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression7032 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression7044 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7065 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7171 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXCasePart7185 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7206 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart7220 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXForLoopExpression7333 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression7345 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7366 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression7378 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7399 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXForLoopExpression7411 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXWhileExpression7524 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXWhileExpression7536 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7557 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXWhileExpression7569 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression7682 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7703 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7715 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXDoWhileExpression7727 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7748 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXDoWhileExpression7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXBlockExpression7852 = new BitSet(new long[]{0xEAA5088100200F40L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7874 = new BitSet(new long[]{0xEAA5088100220F40L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7887 = new BitSet(new long[]{0xEAA5088100200F40L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_59_in_ruleXBlockExpression7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration8121 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration8152 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8200 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8221 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8250 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleXVariableDeclaration8264 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8379 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8493 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8617 = new BitSet(new long[]{0x0000000100000800L,0x0000000000000004L});
    public static final BitSet FOLLOW_32_in_ruleXFeatureCall8631 = new BitSet(new long[]{0x0001000800000800L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8652 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8665 = new BitSet(new long[]{0x0001000800000800L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8686 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall8700 = new BitSet(new long[]{0x0000000100000800L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8725 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall8759 = new BitSet(new long[]{0xE2AF088900200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8844 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8872 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8885 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8906 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXFeatureCall8923 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIdOrSuper9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleStaticQualifier9195 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXConstructorCall9292 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9315 = new BitSet(new long[]{0x0005000100000002L});
    public static final BitSet FOLLOW_32_in_ruleXConstructorCall9336 = new BitSet(new long[]{0x0001000800000800L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9358 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall9371 = new BitSet(new long[]{0x0001000800000800L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9392 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_31_in_ruleXConstructorCall9406 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall9429 = new BitSet(new long[]{0xE2AF088900200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9502 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9530 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall9543 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9564 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXConstructorCall9581 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBooleanLiteral9710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXNullLiteral9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTypeLiteral10135 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXTypeLiteral10147 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10170 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXTypeLiteral10182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXThrowExpression10274 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXReturnExpression10387 = new BitSet(new long[]{0xE2A5088100200F42L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10511 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10584 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10628 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXCatchClause10742 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCatchClause10755 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10776 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCatchClause10788 = new BitSet(new long[]{0xE2A5088100200F40L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10935 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10961 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleNumber10981 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11134 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleJvmTypeReference11172 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleJvmTypeReference11184 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXFunctionTypeRef11299 = new BitSet(new long[]{0x0003000800000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11321 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef11334 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11355 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXFunctionTypeRef11371 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleXFunctionTypeRef11385 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11500 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleJvmParameterizedTypeReference11521 = new BitSet(new long[]{0x0001000800000800L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11543 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_47_in_ruleJvmParameterizedTypeReference11556 = new BitSet(new long[]{0x0001000800000800L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11577 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_31_in_ruleJvmParameterizedTypeReference11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmWildcardTypeReference11804 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008004L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBound11938 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBoundAnded12042 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleJvmLowerBound12146 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred1_InternalSuite1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred2_InternalSuite1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred3_InternalSuite1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred4_InternalSuite1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred5_InternalSuite2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred6_InternalSuite2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred7_InternalSuite2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred8_InternalSuite2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred9_InternalSuite3133 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred9_InternalSuite3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred10_InternalSuite3220 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred10_InternalSuite3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred11_InternalSuite3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred12_InternalSuite3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred13_InternalSuite4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred14_InternalSuite4475 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred14_InternalSuite4484 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred14_InternalSuite4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred15_InternalSuite4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred15_InternalSuite4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred15_InternalSuite4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred16_InternalSuite4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred17_InternalSuite4906 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred17_InternalSuite4913 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred17_InternalSuite4920 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred17_InternalSuite4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalSuite5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred19_InternalSuite5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalSuite5857 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred21_InternalSuite5864 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalSuite5871 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred21_InternalSuite5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred23_InternalSuite6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalSuite6810 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred24_InternalSuite6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred25_InternalSuite6892 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalSuite6899 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred25_InternalSuite6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred26_InternalSuite8170 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred26_InternalSuite8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred27_InternalSuite8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalSuite8793 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred28_InternalSuite8800 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalSuite8807 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred28_InternalSuite8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred29_InternalSuite8941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred30_InternalSuite9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred31_InternalSuite9421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalSuite9451 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred32_InternalSuite9458 = new BitSet(new long[]{0x0001000800000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalSuite9465 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred32_InternalSuite9479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred33_InternalSuite9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred34_InternalSuite10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred35_InternalSuite10546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred36_InternalSuite10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred38_InternalSuite11149 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred38_InternalSuite11153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred39_InternalSuite11513 = new BitSet(new long[]{0x0000000000000002L});

}