package de.bmw.carit.jnario.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJnarioLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_TEXT_MULTI_LINE=20;
    public static final int RULE_ID=15;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int RULE_TEXT_AND_NL=21;
    public static final int T__63=63;
    public static final int T__26=26;
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
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__82=82;
    public static final int T__45=45;
    public static final int T__83=83;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_NL=19;
    public static final int RULE_SPACES=18;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=22;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_COLON=16;
    public static final int T__32=32;
    public static final int RULE_STRING=14;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int RULE_WS=24;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_AND_TEXT=10;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int RULE_FEATURE_TEXT=4;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalJnarioLexer() {;} 
    public InternalJnarioLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJnarioLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g"; }

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:11:7: ( 'package' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:11:9: 'package'
            {
            match("package"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:12:7: ( 'import' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:12:9: 'import'
            {
            match("import"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:13:7: ( 'static' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:13:9: 'static'
            {
            match("static"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:14:7: ( 'extension' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:14:9: 'extension'
            {
            match("extension"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:15:7: ( '.' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:15:9: '.'
            {
            match('.'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:16:7: ( '*' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:16:9: '*'
            {
            match('*'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:17:7: ( '|' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:17:9: '|'
            {
            match('|'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:18:7: ( '@' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:18:9: '@'
            {
            match('@'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:19:7: ( '(' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:19:9: '('
            {
            match('('); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:20:7: ( ',' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:20:9: ','
            {
            match(','); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:21:7: ( ')' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:21:9: ')'
            {
            match(')'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:22:7: ( '=' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:22:9: '='
            {
            match('='); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:23:7: ( '+' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:23:9: '+'
            {
            match('+'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:24:7: ( '{' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:24:9: '{'
            {
            match('{'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:25:7: ( '}' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:25:9: '}'
            {
            match('}'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:26:7: ( '+=' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:26:9: '+='
            {
            match("+="); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:27:7: ( '||' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:27:9: '||'
            {
            match("||"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:28:7: ( '&&' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:28:9: '&&'
            {
            match("&&"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:29:7: ( '==' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:29:9: '=='
            {
            match("=="); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:30:7: ( '!=' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:30:9: '!='
            {
            match("!="); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:31:7: ( 'instanceof' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:31:9: 'instanceof'
            {
            match("instanceof"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:32:7: ( '>=' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:32:9: '>='
            {
            match(">="); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:33:7: ( '<=' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:33:9: '<='
            {
            match("<="); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:34:7: ( '>' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:34:9: '>'
            {
            match('>'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:35:7: ( '<' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:35:9: '<'
            {
            match('<'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:36:7: ( '->' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:36:9: '->'
            {
            match("->"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:37:7: ( '..' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:37:9: '..'
            {
            match(".."); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:38:7: ( '-' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:38:9: '-'
            {
            match('-'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:39:7: ( '**' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:39:9: '**'
            {
            match("**"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:40:7: ( '/' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:40:9: '/'
            {
            match('/'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:41:7: ( '%' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:41:9: '%'
            {
            match('%'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:42:7: ( '!' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:42:9: '!'
            {
            match('!'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:43:7: ( 'as' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:43:9: 'as'
            {
            match("as"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:44:7: ( '?.' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:44:9: '?.'
            {
            match("?."); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:45:7: ( '*.' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:45:9: '*.'
            {
            match("*."); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:46:7: ( '[' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:46:9: '['
            {
            match('['); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:47:7: ( ']' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:47:9: ']'
            {
            match(']'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:48:7: ( 'if' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:48:9: 'if'
            {
            match("if"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:49:7: ( 'else' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:49:9: 'else'
            {
            match("else"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:50:7: ( 'switch' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:50:9: 'switch'
            {
            match("switch"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:51:7: ( ':' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:51:9: ':'
            {
            match(':'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:52:7: ( 'default' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:52:9: 'default'
            {
            match("default"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:53:7: ( 'case' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:53:9: 'case'
            {
            match("case"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:54:7: ( 'for' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:54:9: 'for'
            {
            match("for"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:55:7: ( 'while' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:55:9: 'while'
            {
            match("while"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:56:7: ( 'do' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:56:9: 'do'
            {
            match("do"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:57:7: ( ';' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:57:9: ';'
            {
            match(';'); 

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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:58:7: ( 'var' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:58:9: 'var'
            {
            match("var"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:59:7: ( 'val' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:59:9: 'val'
            {
            match("val"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:60:7: ( 'super' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:60:9: 'super'
            {
            match("super"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:61:7: ( '::' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:61:9: '::'
            {
            match("::"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:62:7: ( 'new' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:62:9: 'new'
            {
            match("new"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:63:7: ( 'false' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:63:9: 'false'
            {
            match("false"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:64:7: ( 'true' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:64:9: 'true'
            {
            match("true"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:65:7: ( 'null' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:65:9: 'null'
            {
            match("null"); 


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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:66:7: ( 'typeof' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:66:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:67:7: ( 'throw' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:67:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:68:7: ( 'return' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:68:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:69:7: ( 'try' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:69:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:70:7: ( 'finally' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:70:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:71:7: ( 'catch' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:71:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:72:7: ( '=>' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:72:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:73:7: ( '?' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:73:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:74:7: ( 'extends' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:74:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:75:7: ( '&' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:75:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "RULE_FEATURE_TEXT"
    public final void mRULE_FEATURE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_FEATURE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5826:19: ( 'Feature' RULE_COLON RULE_MNL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5826:21: 'Feature' RULE_COLON RULE_MNL
            {
            match("Feature"); 

            mRULE_COLON(); 
            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FEATURE_TEXT"

    // $ANTLR start "RULE_BACKGROUND_TEXT"
    public final void mRULE_BACKGROUND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_BACKGROUND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5828:22: ( 'Background' RULE_COLON RULE_MNL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5828:24: 'Background' RULE_COLON RULE_MNL
            {
            match("Background"); 

            mRULE_COLON(); 
            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKGROUND_TEXT"

    // $ANTLR start "RULE_SCENARIO_TEXT"
    public final void mRULE_SCENARIO_TEXT() throws RecognitionException {
        try {
            int _type = RULE_SCENARIO_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5830:20: ( 'Scenario' RULE_COLON RULE_MNL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5830:22: 'Scenario' RULE_COLON RULE_MNL
            {
            match("Scenario"); 

            mRULE_COLON(); 
            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCENARIO_TEXT"

    // $ANTLR start "RULE_GIVEN_TEXT"
    public final void mRULE_GIVEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_GIVEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5832:17: ( 'Given ' RULE_MNL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5832:19: 'Given ' RULE_MNL
            {
            match("Given "); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GIVEN_TEXT"

    // $ANTLR start "RULE_WHEN_TEXT"
    public final void mRULE_WHEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_WHEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5834:16: ( 'When ' RULE_MNL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5834:18: 'When ' RULE_MNL
            {
            match("When "); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHEN_TEXT"

    // $ANTLR start "RULE_THEN_TEXT"
    public final void mRULE_THEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_THEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5836:16: ( 'Then ' RULE_MNL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5836:18: 'Then ' RULE_MNL
            {
            match("Then "); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN_TEXT"

    // $ANTLR start "RULE_AND_TEXT"
    public final void mRULE_AND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_AND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5838:15: ( 'And ' RULE_MNL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5838:17: 'And ' RULE_MNL
            {
            match("And "); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_TEXT"

    // $ANTLR start "RULE_EXAMPLE_TEXT"
    public final void mRULE_EXAMPLE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5840:19: ( 'Examples' RULE_COLON RULE_MNL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5840:21: 'Examples' RULE_COLON RULE_MNL
            {
            match("Examples"); 

            mRULE_COLON(); 
            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_TEXT"

    // $ANTLR start "RULE_EXAMPLE_ROW_END"
    public final void mRULE_EXAMPLE_ROW_END() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_ROW_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5842:22: ( '|' RULE_SPACES RULE_NL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5842:24: '|' RULE_SPACES RULE_NL
            {
            match('|'); 
            mRULE_SPACES(); 
            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_ROW_END"

    // $ANTLR start "RULE_TEXT_MULTI_LINE"
    public final void mRULE_TEXT_MULTI_LINE() throws RecognitionException {
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5844:31: ( (~ ( ( '\\r' | '\\n' ) ) )* '\\\\' RULE_NL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5844:33: (~ ( ( '\\r' | '\\n' ) ) )* '\\\\' RULE_NL
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5844:33: (~ ( ( '\\r' | '\\n' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    int LA1_1 = input.LA(2);

                    if ( ((LA1_1>='\u0000' && LA1_1<='\t')||(LA1_1>='\u000B' && LA1_1<='\f')||(LA1_1>='\u000E' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5844:33: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop1;
                }
            } while (true);

            match('\\'); 
            mRULE_NL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_MULTI_LINE"

    // $ANTLR start "RULE_TEXT_AND_NL"
    public final void mRULE_TEXT_AND_NL() throws RecognitionException {
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5846:27: ( (~ ( ( '\\r' | '\\n' | '\\\\' ) ) )* RULE_NL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5846:29: (~ ( ( '\\r' | '\\n' | '\\\\' ) ) )* RULE_NL
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5846:29: (~ ( ( '\\r' | '\\n' | '\\\\' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5846:29: ~ ( ( '\\r' | '\\n' | '\\\\' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

            mRULE_NL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_AND_NL"

    // $ANTLR start "RULE_MNL"
    public final void mRULE_MNL() throws RecognitionException {
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5848:19: ( ( RULE_TEXT_MULTI_LINE )* RULE_TEXT_AND_NL )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5848:21: ( RULE_TEXT_MULTI_LINE )* RULE_TEXT_AND_NL
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5848:21: ( RULE_TEXT_MULTI_LINE )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5848:21: RULE_TEXT_MULTI_LINE
            	    {
            	    mRULE_TEXT_MULTI_LINE(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mRULE_TEXT_AND_NL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MNL"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5850:21: ( ( ' ' | '\\t' )* ':' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5850:23: ( ' ' | '\\t' )* ':'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5850:23: ( ' ' | '\\t' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(':'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5852:18: ( ( '\\r' )? ( '\\n' )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5852:20: ( '\\r' )? ( '\\n' )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5852:20: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5852:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5852:26: ( '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5852:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_SPACES"
    public final void mRULE_SPACES() throws RecognitionException {
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5854:22: ( ( ' ' | '\\t' )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5854:24: ( ' ' | '\\t' )*
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5854:24: ( ' ' | '\\t' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACES"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5856:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5856:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5856:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5856:11: '^'
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

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5856:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:
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
            	    break loop9;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5858:10: ( ( '0' .. '9' )+ )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5858:12: ( '0' .. '9' )+
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5858:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5858:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5860:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5862:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5862:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5862:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5862:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5864:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5864:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5864:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5864:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5864:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5864:41: ( '\\r' )? '\\n'
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5864:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5864:41: '\\r'
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5866:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5866:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5866:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5868:16: ( . )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:5868:18: .
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
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | RULE_FEATURE_TEXT | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_TEXT | RULE_EXAMPLE_ROW_END | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=81;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:10: T__26
                {
                mT__26(); 

                }
                break;
            case 2 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:16: T__27
                {
                mT__27(); 

                }
                break;
            case 3 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:22: T__28
                {
                mT__28(); 

                }
                break;
            case 4 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:28: T__29
                {
                mT__29(); 

                }
                break;
            case 5 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:34: T__30
                {
                mT__30(); 

                }
                break;
            case 6 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:40: T__31
                {
                mT__31(); 

                }
                break;
            case 7 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:46: T__32
                {
                mT__32(); 

                }
                break;
            case 8 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:52: T__33
                {
                mT__33(); 

                }
                break;
            case 9 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:58: T__34
                {
                mT__34(); 

                }
                break;
            case 10 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:64: T__35
                {
                mT__35(); 

                }
                break;
            case 11 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:70: T__36
                {
                mT__36(); 

                }
                break;
            case 12 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:76: T__37
                {
                mT__37(); 

                }
                break;
            case 13 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:82: T__38
                {
                mT__38(); 

                }
                break;
            case 14 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:88: T__39
                {
                mT__39(); 

                }
                break;
            case 15 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:94: T__40
                {
                mT__40(); 

                }
                break;
            case 16 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:100: T__41
                {
                mT__41(); 

                }
                break;
            case 17 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:106: T__42
                {
                mT__42(); 

                }
                break;
            case 18 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:112: T__43
                {
                mT__43(); 

                }
                break;
            case 19 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:118: T__44
                {
                mT__44(); 

                }
                break;
            case 20 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:124: T__45
                {
                mT__45(); 

                }
                break;
            case 21 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:130: T__46
                {
                mT__46(); 

                }
                break;
            case 22 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:136: T__47
                {
                mT__47(); 

                }
                break;
            case 23 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:142: T__48
                {
                mT__48(); 

                }
                break;
            case 24 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:148: T__49
                {
                mT__49(); 

                }
                break;
            case 25 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:154: T__50
                {
                mT__50(); 

                }
                break;
            case 26 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:160: T__51
                {
                mT__51(); 

                }
                break;
            case 27 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:166: T__52
                {
                mT__52(); 

                }
                break;
            case 28 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:172: T__53
                {
                mT__53(); 

                }
                break;
            case 29 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:178: T__54
                {
                mT__54(); 

                }
                break;
            case 30 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:184: T__55
                {
                mT__55(); 

                }
                break;
            case 31 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:190: T__56
                {
                mT__56(); 

                }
                break;
            case 32 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:196: T__57
                {
                mT__57(); 

                }
                break;
            case 33 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:202: T__58
                {
                mT__58(); 

                }
                break;
            case 34 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:208: T__59
                {
                mT__59(); 

                }
                break;
            case 35 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:214: T__60
                {
                mT__60(); 

                }
                break;
            case 36 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:220: T__61
                {
                mT__61(); 

                }
                break;
            case 37 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:226: T__62
                {
                mT__62(); 

                }
                break;
            case 38 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:232: T__63
                {
                mT__63(); 

                }
                break;
            case 39 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:238: T__64
                {
                mT__64(); 

                }
                break;
            case 40 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:244: T__65
                {
                mT__65(); 

                }
                break;
            case 41 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:250: T__66
                {
                mT__66(); 

                }
                break;
            case 42 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:256: T__67
                {
                mT__67(); 

                }
                break;
            case 43 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:262: T__68
                {
                mT__68(); 

                }
                break;
            case 44 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:268: T__69
                {
                mT__69(); 

                }
                break;
            case 45 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:274: T__70
                {
                mT__70(); 

                }
                break;
            case 46 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:280: T__71
                {
                mT__71(); 

                }
                break;
            case 47 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:286: T__72
                {
                mT__72(); 

                }
                break;
            case 48 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:292: T__73
                {
                mT__73(); 

                }
                break;
            case 49 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:298: T__74
                {
                mT__74(); 

                }
                break;
            case 50 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:304: T__75
                {
                mT__75(); 

                }
                break;
            case 51 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:310: T__76
                {
                mT__76(); 

                }
                break;
            case 52 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:316: T__77
                {
                mT__77(); 

                }
                break;
            case 53 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:322: T__78
                {
                mT__78(); 

                }
                break;
            case 54 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:328: T__79
                {
                mT__79(); 

                }
                break;
            case 55 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:334: T__80
                {
                mT__80(); 

                }
                break;
            case 56 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:340: T__81
                {
                mT__81(); 

                }
                break;
            case 57 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:346: T__82
                {
                mT__82(); 

                }
                break;
            case 58 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:352: T__83
                {
                mT__83(); 

                }
                break;
            case 59 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:358: T__84
                {
                mT__84(); 

                }
                break;
            case 60 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:364: T__85
                {
                mT__85(); 

                }
                break;
            case 61 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:370: T__86
                {
                mT__86(); 

                }
                break;
            case 62 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:376: T__87
                {
                mT__87(); 

                }
                break;
            case 63 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:382: T__88
                {
                mT__88(); 

                }
                break;
            case 64 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:388: T__89
                {
                mT__89(); 

                }
                break;
            case 65 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:394: T__90
                {
                mT__90(); 

                }
                break;
            case 66 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:400: RULE_FEATURE_TEXT
                {
                mRULE_FEATURE_TEXT(); 

                }
                break;
            case 67 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:418: RULE_BACKGROUND_TEXT
                {
                mRULE_BACKGROUND_TEXT(); 

                }
                break;
            case 68 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:439: RULE_SCENARIO_TEXT
                {
                mRULE_SCENARIO_TEXT(); 

                }
                break;
            case 69 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:458: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 70 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:474: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 71 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:489: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 72 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:504: RULE_AND_TEXT
                {
                mRULE_AND_TEXT(); 

                }
                break;
            case 73 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:518: RULE_EXAMPLE_TEXT
                {
                mRULE_EXAMPLE_TEXT(); 

                }
                break;
            case 74 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:536: RULE_EXAMPLE_ROW_END
                {
                mRULE_EXAMPLE_ROW_END(); 

                }
                break;
            case 75 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:557: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 76 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:565: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 77 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:574: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 78 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:586: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 79 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:602: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 80 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:618: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 81 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1:626: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA3_eotS =
        "\2\2\2\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\2\0\2\uffff";
    static final String DFA3_maxS =
        "\2\uffff\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\1\1\1\0\2\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\1\1\uffff\2\1\1\uffff\116\1\1\3\uffa3\1",
            "\12\1\1\uffff\2\1\1\uffff\116\1\1\3\uffa3\1",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    static class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 5848:21: ( RULE_TEXT_MULTI_LINE )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                        s = -1;
                        if ( ((LA3_1>='\u0000' && LA3_1<='\t')||(LA3_1>='\u000B' && LA3_1<='\f')||(LA3_1>='\u000E' && LA3_1<='[')||(LA3_1>=']' && LA3_1<='\uFFFF')) ) {s = 1;}

                        else if ( (LA3_1=='\\') ) {s = 3;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_0 = input.LA(1);

                        s = -1;
                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {s = 1;}

                        else if ( (LA3_0=='\\') ) {s = 3;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\4\65\1\77\1\102\1\104\4\uffff\1\114\1\116\2\uffff\1\122"+
        "\1\124\1\126\1\130\1\132\1\135\1\uffff\1\65\1\141\2\uffff\1\145"+
        "\4\65\1\uffff\14\65\1\63\2\uffff\2\63\2\uffff\1\65\1\uffff\2\65"+
        "\1\u0083\5\65\41\uffff\1\u0089\6\uffff\1\65\1\u008b\5\65\1\uffff"+
        "\17\65\3\uffff\3\65\1\uffff\5\65\1\uffff\1\65\1\uffff\2\65\1\u00ae"+
        "\3\65\1\u00b2\1\u00b3\1\u00b4\2\65\1\u00b7\22\65\1\u00ca\1\65\1"+
        "\u00cc\1\65\1\uffff\3\65\3\uffff\1\u00d1\1\u00d2\1\uffff\11\65\1"+
        "\uffff\6\65\1\u00e2\1\65\1\uffff\1\65\1\uffff\1\u00e6\1\u00e7\1"+
        "\65\1\u00e9\2\uffff\1\65\1\u00eb\5\65\2\uffff\2\65\1\u00f3\1\65"+
        "\1\u00f5\1\u00f6\1\uffff\3\65\2\uffff\1\65\1\uffff\1\u00fb\1\uffff"+
        "\1\u00fc\3\65\1\uffff\1\65\1\u0101\1\uffff\1\65\2\uffff\1\65\1\u0104"+
        "\1\u0105\1\u0106\2\uffff\4\65\1\uffff\2\65\4\uffff\4\65\1\u0111"+
        "\1\65\2\uffff\1\u0113\1\uffff\1\65\2\uffff";
    static final String DFA19_eofS =
        "\u0115\uffff";
    static final String DFA19_minS =
        "\1\0\1\141\1\146\1\164\1\154\1\56\1\52\1\11\4\uffff\2\75\2\uffff"+
        "\1\46\3\75\1\76\1\52\1\uffff\1\163\1\56\2\uffff\1\72\1\145\2\141"+
        "\1\150\1\uffff\1\141\1\145\1\150\2\145\1\141\1\143\1\151\2\150\1"+
        "\156\1\170\1\44\2\uffff\2\0\2\uffff\1\143\1\uffff\1\160\1\163\1"+
        "\44\1\141\1\151\1\160\1\164\1\163\41\uffff\1\44\6\uffff\1\146\1"+
        "\44\1\163\1\162\1\154\1\156\1\151\1\uffff\1\154\1\167\1\154\1\165"+
        "\1\160\1\162\1\164\1\141\1\143\1\145\1\166\2\145\1\144\1\141\3\uffff"+
        "\1\153\1\157\1\164\1\uffff\2\164\3\145\1\uffff\1\141\1\uffff\1\145"+
        "\1\143\1\44\1\163\1\141\1\154\3\44\1\154\1\145\1\44\1\145\1\157"+
        "\1\165\1\164\1\153\1\156\1\145\2\156\1\40\1\155\1\141\1\162\1\141"+
        "\1\151\1\143\1\162\1\156\1\44\1\165\1\44\1\150\1\uffff\1\145\1\154"+
        "\1\145\3\uffff\2\44\1\uffff\1\157\1\167\1\162\1\165\1\147\1\141"+
        "\1\156\2\40\1\uffff\1\160\1\147\1\164\1\156\1\143\1\150\1\44\1\144"+
        "\1\uffff\1\154\1\uffff\2\44\1\154\1\44\2\uffff\1\146\1\44\1\156"+
        "\3\162\1\40\2\uffff\1\154\1\145\1\44\1\143\2\44\1\uffff\1\151\1"+
        "\163\1\164\2\uffff\1\171\1\uffff\1\44\1\uffff\1\44\1\145\1\157\1"+
        "\151\1\uffff\1\145\1\44\1\uffff\1\145\2\uffff\1\157\3\44\2\uffff"+
        "\1\11\1\165\1\157\1\163\1\uffff\1\157\1\156\4\uffff\1\156\2\11\1"+
        "\146\1\44\1\144\2\uffff\1\44\1\uffff\1\11\2\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\141\1\156\1\167\1\170\2\56\1\174\4\uffff\1\76\1\75\2"+
        "\uffff\1\46\3\75\1\76\1\57\1\uffff\1\163\1\56\2\uffff\1\72\1\157"+
        "\1\141\1\157\1\150\1\uffff\1\141\1\165\1\171\2\145\1\141\1\143\1"+
        "\151\2\150\1\156\1\170\1\172\2\uffff\2\uffff\2\uffff\1\143\1\uffff"+
        "\1\160\1\163\1\172\1\141\1\151\1\160\1\164\1\163\41\uffff\1\172"+
        "\6\uffff\1\146\1\172\1\164\1\162\1\154\1\156\1\151\1\uffff\1\162"+
        "\1\167\1\154\1\171\1\160\1\162\1\164\1\141\1\143\1\145\1\166\2\145"+
        "\1\144\1\141\3\uffff\1\153\1\157\1\164\1\uffff\2\164\3\145\1\uffff"+
        "\1\141\1\uffff\1\145\1\143\1\172\1\163\1\141\1\154\3\172\1\154\1"+
        "\145\1\172\1\145\1\157\1\165\1\164\1\153\1\156\1\145\2\156\1\40"+
        "\1\155\1\141\1\162\1\141\1\151\1\143\1\162\1\156\1\172\1\165\1\172"+
        "\1\150\1\uffff\1\145\1\154\1\145\3\uffff\2\172\1\uffff\1\157\1\167"+
        "\1\162\1\165\1\147\1\141\1\156\2\40\1\uffff\1\160\1\147\1\164\1"+
        "\156\1\143\1\150\1\172\1\163\1\uffff\1\154\1\uffff\2\172\1\154\1"+
        "\172\2\uffff\1\146\1\172\1\156\3\162\1\40\2\uffff\1\154\1\145\1"+
        "\172\1\143\2\172\1\uffff\1\151\1\163\1\164\2\uffff\1\171\1\uffff"+
        "\1\172\1\uffff\1\172\1\145\1\157\1\151\1\uffff\1\145\1\172\1\uffff"+
        "\1\145\2\uffff\1\157\3\172\2\uffff\1\72\1\165\1\157\1\163\1\uffff"+
        "\1\157\1\156\4\uffff\1\156\2\72\1\146\1\172\1\144\2\uffff\1\172"+
        "\1\uffff\1\72\2\uffff";
    static final String DFA19_acceptS =
        "\10\uffff\1\10\1\11\1\12\1\13\2\uffff\1\16\1\17\6\uffff\1\37\2"+
        "\uffff\1\44\1\45\5\uffff\1\57\15\uffff\1\113\1\114\2\uffff\1\120"+
        "\1\121\1\uffff\1\113\10\uffff\1\33\1\5\1\35\1\43\1\6\1\21\1\7\1"+
        "\112\1\10\1\11\1\12\1\13\1\23\1\76\1\14\1\20\1\15\1\16\1\17\1\22"+
        "\1\101\1\24\1\40\1\26\1\30\1\27\1\31\1\32\1\34\1\116\1\117\1\36"+
        "\1\37\1\uffff\1\42\1\77\1\44\1\45\1\63\1\51\7\uffff\1\57\17\uffff"+
        "\1\114\1\115\1\120\3\uffff\1\46\5\uffff\1\41\1\uffff\1\56\42\uffff"+
        "\1\54\3\uffff\1\60\1\61\1\64\2\uffff\1\73\11\uffff\1\110\10\uffff"+
        "\1\47\1\uffff\1\53\4\uffff\1\67\1\66\7\uffff\1\106\1\107\6\uffff"+
        "\1\62\3\uffff\1\75\1\65\1\uffff\1\55\1\uffff\1\71\4\uffff\1\105"+
        "\2\uffff\1\2\1\uffff\1\3\1\50\4\uffff\1\70\1\72\4\uffff\1\1\2\uffff"+
        "\1\100\1\52\1\74\1\102\6\uffff\1\104\1\111\1\uffff\1\4\1\uffff\1"+
        "\25\1\103";
    static final String DFA19_specialS =
        "\1\1\57\uffff\1\0\1\2\u00e3\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\63\2\62\2\63\1\62\22\63\1\62\1\21\1\60\1\63\1\56\1\26\1"+
            "\20\1\61\1\11\1\13\1\6\1\15\1\12\1\24\1\5\1\25\12\57\1\33\1"+
            "\40\1\23\1\14\1\22\1\30\1\10\1\53\1\46\2\56\1\54\1\45\1\50\13"+
            "\56\1\47\1\52\2\56\1\51\3\56\1\31\1\63\1\32\1\55\1\56\1\63\1"+
            "\27\1\56\1\35\1\34\1\4\1\36\2\56\1\2\4\56\1\42\1\56\1\1\1\56"+
            "\1\44\1\3\1\43\1\56\1\41\1\37\3\56\1\16\1\7\1\17\uff82\63",
            "\1\64",
            "\1\70\6\uffff\1\66\1\67",
            "\1\71\1\73\1\uffff\1\72",
            "\1\75\13\uffff\1\74",
            "\1\76",
            "\1\100\3\uffff\1\101",
            "\2\105\2\uffff\1\105\22\uffff\1\105\133\uffff\1\103",
            "",
            "",
            "",
            "",
            "\1\112\1\113",
            "\1\115",
            "",
            "",
            "\1\121",
            "\1\123",
            "\1\125",
            "\1\127",
            "\1\131",
            "\1\133\4\uffff\1\134",
            "",
            "\1\137",
            "\1\140",
            "",
            "",
            "\1\144",
            "\1\146\11\uffff\1\147",
            "\1\150",
            "\1\152\7\uffff\1\153\5\uffff\1\151",
            "\1\154",
            "",
            "\1\156",
            "\1\157\17\uffff\1\160",
            "\1\163\11\uffff\1\161\6\uffff\1\162",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\65\34\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\0\176",
            "\0\176",
            "",
            "",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u008c\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0093\5\uffff\1\u0092",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\3\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00b5",
            "\1\u00b6",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00cb",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "",
            "",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00e4\16\uffff\1\u00e3",
            "",
            "\1\u00e5",
            "",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00e8",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "",
            "\1\u00ea",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00f4",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "",
            "\1\u00fa",
            "",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u0102",
            "",
            "",
            "\1\u0103",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "",
            "\1\u0107\26\uffff\1\u0107\31\uffff\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "",
            "",
            "",
            "",
            "\1\u010d",
            "\1\u010e\26\uffff\1\u010e\31\uffff\1\u010e",
            "\1\u010f\26\uffff\1\u010f\31\uffff\1\u010f",
            "\1\u0110",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "\1\u0112",
            "",
            "",
            "\1\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32"+
            "\65",
            "",
            "\1\u0114\26\uffff\1\u0114\31\uffff\1\u0114",
            "",
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
            return "1:1: Tokens : ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | RULE_FEATURE_TEXT | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_TEXT | RULE_EXAMPLE_ROW_END | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_48 = input.LA(1);

                        s = -1;
                        if ( ((LA19_48>='\u0000' && LA19_48<='\uFFFF')) ) {s = 126;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='p') ) {s = 1;}

                        else if ( (LA19_0=='i') ) {s = 2;}

                        else if ( (LA19_0=='s') ) {s = 3;}

                        else if ( (LA19_0=='e') ) {s = 4;}

                        else if ( (LA19_0=='.') ) {s = 5;}

                        else if ( (LA19_0=='*') ) {s = 6;}

                        else if ( (LA19_0=='|') ) {s = 7;}

                        else if ( (LA19_0=='@') ) {s = 8;}

                        else if ( (LA19_0=='(') ) {s = 9;}

                        else if ( (LA19_0==',') ) {s = 10;}

                        else if ( (LA19_0==')') ) {s = 11;}

                        else if ( (LA19_0=='=') ) {s = 12;}

                        else if ( (LA19_0=='+') ) {s = 13;}

                        else if ( (LA19_0=='{') ) {s = 14;}

                        else if ( (LA19_0=='}') ) {s = 15;}

                        else if ( (LA19_0=='&') ) {s = 16;}

                        else if ( (LA19_0=='!') ) {s = 17;}

                        else if ( (LA19_0=='>') ) {s = 18;}

                        else if ( (LA19_0=='<') ) {s = 19;}

                        else if ( (LA19_0=='-') ) {s = 20;}

                        else if ( (LA19_0=='/') ) {s = 21;}

                        else if ( (LA19_0=='%') ) {s = 22;}

                        else if ( (LA19_0=='a') ) {s = 23;}

                        else if ( (LA19_0=='?') ) {s = 24;}

                        else if ( (LA19_0=='[') ) {s = 25;}

                        else if ( (LA19_0==']') ) {s = 26;}

                        else if ( (LA19_0==':') ) {s = 27;}

                        else if ( (LA19_0=='d') ) {s = 28;}

                        else if ( (LA19_0=='c') ) {s = 29;}

                        else if ( (LA19_0=='f') ) {s = 30;}

                        else if ( (LA19_0=='w') ) {s = 31;}

                        else if ( (LA19_0==';') ) {s = 32;}

                        else if ( (LA19_0=='v') ) {s = 33;}

                        else if ( (LA19_0=='n') ) {s = 34;}

                        else if ( (LA19_0=='t') ) {s = 35;}

                        else if ( (LA19_0=='r') ) {s = 36;}

                        else if ( (LA19_0=='F') ) {s = 37;}

                        else if ( (LA19_0=='B') ) {s = 38;}

                        else if ( (LA19_0=='S') ) {s = 39;}

                        else if ( (LA19_0=='G') ) {s = 40;}

                        else if ( (LA19_0=='W') ) {s = 41;}

                        else if ( (LA19_0=='T') ) {s = 42;}

                        else if ( (LA19_0=='A') ) {s = 43;}

                        else if ( (LA19_0=='E') ) {s = 44;}

                        else if ( (LA19_0=='^') ) {s = 45;}

                        else if ( (LA19_0=='$'||(LA19_0>='C' && LA19_0<='D')||(LA19_0>='H' && LA19_0<='R')||(LA19_0>='U' && LA19_0<='V')||(LA19_0>='X' && LA19_0<='Z')||LA19_0=='_'||LA19_0=='b'||(LA19_0>='g' && LA19_0<='h')||(LA19_0>='j' && LA19_0<='m')||LA19_0=='o'||LA19_0=='q'||LA19_0=='u'||(LA19_0>='x' && LA19_0<='z')) ) {s = 46;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 47;}

                        else if ( (LA19_0=='\"') ) {s = 48;}

                        else if ( (LA19_0=='\'') ) {s = 49;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 50;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='#'||LA19_0=='\\'||LA19_0=='`'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_49 = input.LA(1);

                        s = -1;
                        if ( ((LA19_49>='\u0000' && LA19_49<='\uFFFF')) ) {s = 126;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}