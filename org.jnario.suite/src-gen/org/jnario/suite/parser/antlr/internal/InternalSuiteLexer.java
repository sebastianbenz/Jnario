/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSuiteLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=11;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_TEXT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int RULE_SUITE_NAME=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int RULE_WS=14;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalSuiteLexer() {;} 
    public InternalSuiteLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSuiteLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:11:7: ( 'package' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:12:7: ( ';' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:13:7: ( 'import' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:13:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:14:7: ( '.' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:15:7: ( '*' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:16:7: ( '-' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:16:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:17:7: ( '@' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:17:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:18:7: ( '(' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:19:7: ( ',' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:20:7: ( ')' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:21:7: ( '=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:22:7: ( '+' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:22:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:23:7: ( '{' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:23:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:24:7: ( '}' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:24:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:25:7: ( '+=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:25:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:26:7: ( '||' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:26:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:27:7: ( '&&' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:27:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:28:7: ( '==' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:28:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:29:7: ( '!=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:29:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:30:7: ( 'instanceof' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:30:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:31:7: ( '>=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:31:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:32:7: ( '<=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:32:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:33:7: ( '>' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:34:7: ( '<' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:34:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:35:7: ( '->' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:35:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:36:7: ( '..' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:36:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:37:7: ( '=>' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:37:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:38:7: ( '<>' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:38:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:39:7: ( '?:' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:39:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:40:7: ( '<=>' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:40:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:41:7: ( '**' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:41:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:42:7: ( '/' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:42:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:43:7: ( '%' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:43:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:44:7: ( '!' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:44:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:45:7: ( 'as' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:45:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:46:7: ( '?.' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:46:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:47:7: ( '*.' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:47:9: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:48:7: ( '[' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:48:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:49:7: ( '|' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:49:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:50:7: ( ']' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:50:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:51:7: ( 'if' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:51:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:52:7: ( 'else' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:52:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:53:7: ( 'switch' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:53:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:54:7: ( ':' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:54:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:55:7: ( 'default' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:55:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:56:7: ( 'case' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:56:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:57:7: ( 'for' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:57:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:58:7: ( 'while' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:58:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:59:7: ( 'do' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:59:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:60:7: ( 'var' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:60:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:61:7: ( 'val' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:61:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:62:7: ( 'super' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:62:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:63:7: ( '::' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:63:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:64:7: ( 'new' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:64:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:65:7: ( 'false' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:65:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:66:7: ( 'true' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:66:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:67:7: ( 'null' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:67:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:68:7: ( 'typeof' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:68:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:69:7: ( 'throw' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:69:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:70:7: ( 'return' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:70:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:71:7: ( 'try' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:71:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:72:7: ( 'finally' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:72:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:73:7: ( 'catch' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:73:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:74:7: ( '?' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:74:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:75:7: ( 'extends' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:75:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:76:7: ( '&' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:76:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "RULE_SUITE_NAME"
    public final void mRULE_SUITE_NAME() throws RecognitionException {
        try {
            int _type = RULE_SUITE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5707:17: ( ( '#' )+ ~ ( ( '-' | ' ' | '\\t' ) ) (~ ( ( '-' | '#' ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5707:19: ( '#' )+ ~ ( ( '-' | ' ' | '\\t' ) ) (~ ( ( '-' | '#' ) ) )*
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5707:19: ( '#' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='#') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='#') ) {
                        alt1=1;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='\b')||(LA1_1>='\n' && LA1_1<='\u001F')||(LA1_1>='!' && LA1_1<='\"')||(LA1_1>='$' && LA1_1<=',')||(LA1_1>='.' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5707:19: '#'
            	    {
            	    match('#'); 

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

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\n' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5707:42: (~ ( ( '-' | '#' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\"')||(LA2_0>='$' && LA2_0<=',')||(LA2_0>='.' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5707:42: ~ ( ( '-' | '#' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUITE_NAME"

    // $ANTLR start "RULE_PATTERN"
    public final void mRULE_PATTERN() throws RecognitionException {
        try {
            int _type = RULE_PATTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5709:14: ( '\\\\' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5709:16: '\\\\' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n'
            {
            match('\\'); 
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5709:21: (~ ( ( '\\r' | '\\n' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5709:21: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5709:37: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5709:37: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATTERN"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5711:11: ( ':' (~ ( ( '-' | '#' ) ) )+ )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5711:13: ':' (~ ( ( '-' | '#' ) ) )+
            {
            match(':'); 
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5711:17: (~ ( ( '-' | '#' ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\"')||(LA5_0>='$' && LA5_0<=',')||(LA5_0>='.' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5711:17: ~ ( ( '-' | '#' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5713:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5713:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5713:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5713:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5713:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='$'||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:12: ( '0x' | '0X' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='0') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='x') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='X') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='f')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='#') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='B'||LA10_0=='b') ) {
                        alt10=1;
                    }
                    else if ( (LA10_0=='L'||LA10_0=='l') ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5715:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5717:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5717:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5717:21: ( '0' .. '9' | '_' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||LA12_0=='_') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5719:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5719:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5719:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='E'||LA14_0=='e') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5719:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5719:36: ( '+' | '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='+'||LA13_0=='-') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5719:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='B'||LA15_0=='b') ) {
                alt15=1;
            }
            else if ( (LA15_0=='D'||LA15_0=='F'||LA15_0=='L'||LA15_0=='d'||LA15_0=='f'||LA15_0=='l') ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5719:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5719:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5721:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5723:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5723:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5723:24: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5723:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5725:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5725:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5725:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5725:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5725:40: ( ( '\\r' )? '\\n' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5725:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5725:41: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5725:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5727:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5727:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5727:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5729:16: ( . )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:5729:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | RULE_SUITE_NAME | RULE_PATTERN | RULE_TEXT | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=78;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:406: RULE_SUITE_NAME
                {
                mRULE_SUITE_NAME(); 

                }
                break;
            case 68 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:422: RULE_PATTERN
                {
                mRULE_PATTERN(); 

                }
                break;
            case 69 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:435: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 70 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:445: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:453: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 72 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:462: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 73 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:471: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 74 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:484: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:496: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:512: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:528: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:536: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\1\uffff\1\60\1\uffff\1\60\1\66\1\71\1\73\4\uffff\1\102\1\104\2"+
        "\uffff\1\110\1\112\1\114\1\116\1\121\1\124\1\127\1\uffff\1\60\2"+
        "\uffff\2\60\1\142\10\60\3\56\1\uffff\2\165\2\56\2\uffff\1\60\2\uffff"+
        "\2\60\1\174\32\uffff\1\176\11\uffff\1\177\2\uffff\4\60\1\u0084\2"+
        "\uffff\1\60\1\u0086\14\60\3\uffff\1\165\4\uffff\3\60\4\uffff\4\60"+
        "\1\uffff\1\60\1\uffff\2\60\1\u00a0\3\60\1\u00a4\1\u00a5\1\u00a6"+
        "\2\60\1\u00a9\6\60\1\u00b0\4\60\1\u00b5\1\60\1\uffff\3\60\3\uffff"+
        "\1\u00ba\1\u00bb\1\uffff\6\60\1\uffff\2\60\1\u00c4\1\60\1\uffff"+
        "\1\u00c6\1\u00c7\1\60\1\u00c9\2\uffff\1\60\1\u00cb\2\60\1\u00ce"+
        "\2\60\1\u00d1\1\uffff\1\60\2\uffff\1\60\1\uffff\1\u00d4\1\uffff"+
        "\1\u00d5\1\u00d6\1\uffff\1\60\1\u00d8\1\uffff\1\u00d9\1\u00da\3"+
        "\uffff\1\60\3\uffff\1\60\1\u00dd\1\uffff";
    static final String DFA24_eofS =
        "\u00de\uffff";
    static final String DFA24_minS =
        "\1\0\1\141\1\uffff\1\146\1\56\1\52\1\76\4\uffff\2\75\2\uffff\1\174"+
        "\1\46\3\75\1\56\1\52\1\uffff\1\163\2\uffff\1\154\1\165\1\0\1\145"+
        "\2\141\1\150\1\141\1\145\1\150\1\145\2\0\1\44\1\uffff\2\60\2\0\2"+
        "\uffff\1\143\2\uffff\1\160\1\163\1\44\32\uffff\1\76\11\uffff\1\44"+
        "\2\uffff\1\163\1\164\1\151\1\160\1\0\2\uffff\1\146\1\44\1\163\1"+
        "\162\1\154\1\156\1\151\1\154\1\167\1\154\1\165\1\160\1\162\1\164"+
        "\3\uffff\1\60\4\uffff\1\153\1\157\1\164\4\uffff\2\145\1\164\1\145"+
        "\1\uffff\1\141\1\uffff\1\145\1\143\1\44\1\163\1\141\1\154\3\44\1"+
        "\154\1\145\1\44\1\145\1\157\1\165\1\141\1\162\1\141\1\44\1\156\1"+
        "\143\1\162\1\165\1\44\1\150\1\uffff\1\145\1\154\1\145\3\uffff\2"+
        "\44\1\uffff\1\157\1\167\1\162\1\147\1\164\1\156\1\uffff\1\144\1"+
        "\150\1\44\1\154\1\uffff\2\44\1\154\1\44\2\uffff\1\146\1\44\1\156"+
        "\1\145\1\44\1\143\1\163\1\44\1\uffff\1\164\2\uffff\1\171\1\uffff"+
        "\1\44\1\uffff\2\44\1\uffff\1\145\1\44\1\uffff\2\44\3\uffff\1\157"+
        "\3\uffff\1\146\1\44\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\141\1\uffff\1\156\2\56\1\76\4\uffff\1\76\1\75\2\uffff"+
        "\1\174\1\46\2\75\1\76\1\72\1\57\1\uffff\1\163\2\uffff\1\170\1\167"+
        "\1\uffff\1\157\1\141\1\157\1\150\1\141\1\165\1\171\1\145\2\uffff"+
        "\1\172\1\uffff\1\170\1\154\2\uffff\2\uffff\1\143\2\uffff\1\160\1"+
        "\163\1\172\32\uffff\1\76\11\uffff\1\172\2\uffff\1\163\1\164\1\151"+
        "\1\160\1\uffff\2\uffff\1\146\1\172\1\164\1\162\1\154\1\156\1\151"+
        "\1\162\1\167\1\154\1\171\1\160\1\162\1\164\3\uffff\1\154\4\uffff"+
        "\1\153\1\157\1\164\4\uffff\2\145\1\164\1\145\1\uffff\1\141\1\uffff"+
        "\1\145\1\143\1\172\1\163\1\141\1\154\3\172\1\154\1\145\1\172\1\145"+
        "\1\157\1\165\1\141\1\162\1\141\1\172\1\156\1\143\1\162\1\165\1\172"+
        "\1\150\1\uffff\1\145\1\154\1\145\3\uffff\2\172\1\uffff\1\157\1\167"+
        "\1\162\1\147\1\164\1\156\1\uffff\1\144\1\150\1\172\1\154\1\uffff"+
        "\2\172\1\154\1\172\2\uffff\1\146\1\172\1\156\1\145\1\172\1\143\1"+
        "\163\1\172\1\uffff\1\164\2\uffff\1\171\1\uffff\1\172\1\uffff\2\172"+
        "\1\uffff\1\145\1\172\1\uffff\2\172\3\uffff\1\157\3\uffff\1\146\1"+
        "\172\1\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\4\uffff\1\7\1\10\1\11\1\12\2\uffff\1\15\1\16\7\uffff"+
        "\1\41\1\uffff\1\46\1\50\16\uffff\1\106\4\uffff\1\115\1\116\1\uffff"+
        "\1\106\1\2\3\uffff\1\32\1\4\1\37\1\45\1\5\1\31\1\6\1\7\1\10\1\11"+
        "\1\12\1\22\1\33\1\13\1\17\1\14\1\15\1\16\1\20\1\47\1\21\1\102\1"+
        "\23\1\42\1\25\1\27\1\uffff\1\34\1\30\1\35\1\44\1\100\1\113\1\114"+
        "\1\40\1\41\1\uffff\1\46\1\50\5\uffff\1\105\1\54\16\uffff\1\103\1"+
        "\104\1\107\1\uffff\1\110\1\111\1\112\1\115\3\uffff\1\51\1\36\1\26"+
        "\1\43\4\uffff\1\65\1\uffff\1\61\31\uffff\1\57\3\uffff\1\62\1\63"+
        "\1\66\2\uffff\1\75\6\uffff\1\52\4\uffff\1\56\4\uffff\1\71\1\70\10"+
        "\uffff\1\64\1\uffff\1\77\1\67\1\uffff\1\60\1\uffff\1\73\2\uffff"+
        "\1\3\2\uffff\1\53\2\uffff\1\72\1\74\1\1\1\uffff\1\101\1\55\1\76"+
        "\2\uffff\1\24";
    static final String DFA24_specialS =
        "\1\1\33\uffff\1\5\10\uffff\1\4\1\0\4\uffff\1\3\1\2\63\uffff\1\6"+
        "\175\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\21\1\53\1\45\1\50\1\26\1"+
            "\20\1\54\1\10\1\12\1\5\1\14\1\11\1\6\1\4\1\25\1\51\11\52\1\34"+
            "\1\2\1\23\1\13\1\22\1\24\1\7\32\50\1\30\1\46\1\31\1\47\1\50"+
            "\1\56\1\27\1\50\1\36\1\35\1\32\1\37\2\50\1\3\4\50\1\42\1\50"+
            "\1\1\1\50\1\44\1\33\1\43\1\50\1\41\1\40\3\50\1\15\1\17\1\16"+
            "\uff82\56",
            "\1\57",
            "",
            "\1\64\6\uffff\1\62\1\63",
            "\1\65",
            "\1\67\3\uffff\1\70",
            "\1\72",
            "",
            "",
            "",
            "",
            "\1\100\1\101",
            "\1\103",
            "",
            "",
            "\1\107",
            "\1\111",
            "\1\113",
            "\1\115",
            "\1\117\1\120",
            "\1\123\13\uffff\1\122",
            "\1\125\4\uffff\1\126",
            "",
            "\1\131",
            "",
            "",
            "\1\134\13\uffff\1\135",
            "\1\137\1\uffff\1\136",
            "\43\141\1\uffff\11\141\1\uffff\14\141\1\140\uffc5\141",
            "\1\143\11\uffff\1\144",
            "\1\145",
            "\1\147\7\uffff\1\150\5\uffff\1\146",
            "\1\151",
            "\1\152",
            "\1\153\17\uffff\1\154",
            "\1\157\11\uffff\1\155\6\uffff\1\156",
            "\1\160",
            "\11\161\1\uffff\26\161\1\uffff\14\161\1\uffff\uffd2\161",
            "\0\162",
            "\1\60\34\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\164\10\uffff\1\166\1\uffff\3\166\5\uffff\1\166\13\uffff"+
            "\1\163\6\uffff\1\164\2\uffff\1\166\1\uffff\3\166\5\uffff\1\166"+
            "\13\uffff\1\163",
            "\12\164\10\uffff\1\166\1\uffff\3\166\5\uffff\1\166\22\uffff"+
            "\1\164\2\uffff\1\166\1\uffff\3\166\5\uffff\1\166",
            "\0\167",
            "\0\167",
            "",
            "",
            "\1\171",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\175",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\43\141\1\uffff\11\141\1\uffff\uffd2\141",
            "",
            "",
            "\1\u0085",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u0087\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008e\5\uffff\1\u008d",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\3\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "",
            "\12\164\10\uffff\1\166\1\uffff\3\166\5\uffff\1\166\22\uffff"+
            "\1\164\2\uffff\1\166\1\uffff\3\166\5\uffff\1\166",
            "",
            "",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "",
            "",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u00a7",
            "\1\u00a8",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u00c5",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u00c8",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "",
            "\1\u00ca",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u00cc",
            "\1\u00cd",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u00cf",
            "\1\u00d0",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\1\u00d2",
            "",
            "",
            "\1\u00d3",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\1\u00d7",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "",
            "",
            "\1\u00db",
            "",
            "",
            "",
            "\1\u00dc",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | RULE_SUITE_NAME | RULE_PATTERN | RULE_TEXT | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_38 = input.LA(1);

                        s = -1;
                        if ( ((LA24_38>='\u0000' && LA24_38<='\uFFFF')) ) {s = 114;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='p') ) {s = 1;}

                        else if ( (LA24_0==';') ) {s = 2;}

                        else if ( (LA24_0=='i') ) {s = 3;}

                        else if ( (LA24_0=='.') ) {s = 4;}

                        else if ( (LA24_0=='*') ) {s = 5;}

                        else if ( (LA24_0=='-') ) {s = 6;}

                        else if ( (LA24_0=='@') ) {s = 7;}

                        else if ( (LA24_0=='(') ) {s = 8;}

                        else if ( (LA24_0==',') ) {s = 9;}

                        else if ( (LA24_0==')') ) {s = 10;}

                        else if ( (LA24_0=='=') ) {s = 11;}

                        else if ( (LA24_0=='+') ) {s = 12;}

                        else if ( (LA24_0=='{') ) {s = 13;}

                        else if ( (LA24_0=='}') ) {s = 14;}

                        else if ( (LA24_0=='|') ) {s = 15;}

                        else if ( (LA24_0=='&') ) {s = 16;}

                        else if ( (LA24_0=='!') ) {s = 17;}

                        else if ( (LA24_0=='>') ) {s = 18;}

                        else if ( (LA24_0=='<') ) {s = 19;}

                        else if ( (LA24_0=='?') ) {s = 20;}

                        else if ( (LA24_0=='/') ) {s = 21;}

                        else if ( (LA24_0=='%') ) {s = 22;}

                        else if ( (LA24_0=='a') ) {s = 23;}

                        else if ( (LA24_0=='[') ) {s = 24;}

                        else if ( (LA24_0==']') ) {s = 25;}

                        else if ( (LA24_0=='e') ) {s = 26;}

                        else if ( (LA24_0=='s') ) {s = 27;}

                        else if ( (LA24_0==':') ) {s = 28;}

                        else if ( (LA24_0=='d') ) {s = 29;}

                        else if ( (LA24_0=='c') ) {s = 30;}

                        else if ( (LA24_0=='f') ) {s = 31;}

                        else if ( (LA24_0=='w') ) {s = 32;}

                        else if ( (LA24_0=='v') ) {s = 33;}

                        else if ( (LA24_0=='n') ) {s = 34;}

                        else if ( (LA24_0=='t') ) {s = 35;}

                        else if ( (LA24_0=='r') ) {s = 36;}

                        else if ( (LA24_0=='#') ) {s = 37;}

                        else if ( (LA24_0=='\\') ) {s = 38;}

                        else if ( (LA24_0=='^') ) {s = 39;}

                        else if ( (LA24_0=='$'||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='b'||(LA24_0>='g' && LA24_0<='h')||(LA24_0>='j' && LA24_0<='m')||LA24_0=='o'||LA24_0=='q'||LA24_0=='u'||(LA24_0>='x' && LA24_0<='z')) ) {s = 40;}

                        else if ( (LA24_0=='0') ) {s = 41;}

                        else if ( ((LA24_0>='1' && LA24_0<='9')) ) {s = 42;}

                        else if ( (LA24_0=='\"') ) {s = 43;}

                        else if ( (LA24_0=='\'') ) {s = 44;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 45;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='`'||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_44 = input.LA(1);

                        s = -1;
                        if ( ((LA24_44>='\u0000' && LA24_44<='\uFFFF')) ) {s = 119;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_43 = input.LA(1);

                        s = -1;
                        if ( ((LA24_43>='\u0000' && LA24_43<='\uFFFF')) ) {s = 119;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_37 = input.LA(1);

                        s = -1;
                        if ( ((LA24_37>='\u0000' && LA24_37<='\b')||(LA24_37>='\n' && LA24_37<='\u001F')||(LA24_37>='!' && LA24_37<=',')||(LA24_37>='.' && LA24_37<='\uFFFF')) ) {s = 113;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_28 = input.LA(1);

                        s = -1;
                        if ( (LA24_28==':') ) {s = 96;}

                        else if ( ((LA24_28>='\u0000' && LA24_28<='\"')||(LA24_28>='$' && LA24_28<=',')||(LA24_28>='.' && LA24_28<='9')||(LA24_28>=';' && LA24_28<='\uFFFF')) ) {s = 97;}

                        else s = 98;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_96 = input.LA(1);

                        s = -1;
                        if ( ((LA24_96>='\u0000' && LA24_96<='\"')||(LA24_96>='$' && LA24_96<=',')||(LA24_96>='.' && LA24_96<='\uFFFF')) ) {s = 97;}

                        else s = 132;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}