package de.bmw.carit.xspec.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXSpecLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int RULE_SENTENCE_ENDING=10;
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
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_THEN_TEXT=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__32=32;
    public static final int RULE_STRING=9;
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
    public static final int RULE_WS=13;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators

    public InternalXSpecLexer() {;} 
    public InternalXSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:11:7: ( '{' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:12:7: ( '}' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:12:9: '}'
            {
            match('}'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:13:7: ( '=' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:13:9: '='
            {
            match('='); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:14:7: ( '+=' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:14:9: '+='
            {
            match("+="); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:15:7: ( '||' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:15:9: '||'
            {
            match("||"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:16:7: ( '&&' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:16:9: '&&'
            {
            match("&&"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:17:7: ( '==' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:17:9: '=='
            {
            match("=="); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:18:7: ( '!=' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:18:9: '!='
            {
            match("!="); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:19:7: ( 'instanceof' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:19:9: 'instanceof'
            {
            match("instanceof"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:20:7: ( '>=' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:20:9: '>='
            {
            match(">="); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:21:7: ( '<=' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:21:9: '<='
            {
            match("<="); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:22:7: ( '>' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:22:9: '>'
            {
            match('>'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:23:7: ( '<' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:23:9: '<'
            {
            match('<'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:24:7: ( '->' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:24:9: '->'
            {
            match("->"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:25:7: ( '..' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:25:9: '..'
            {
            match(".."); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:26:7: ( '+' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:26:9: '+'
            {
            match('+'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:27:7: ( '-' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:27:9: '-'
            {
            match('-'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:28:7: ( '*' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:28:9: '*'
            {
            match('*'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:29:7: ( '**' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:29:9: '**'
            {
            match("**"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:30:7: ( '/' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:30:9: '/'
            {
            match('/'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:31:7: ( '%' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:31:9: '%'
            {
            match('%'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:32:7: ( '!' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:32:9: '!'
            {
            match('!'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:33:7: ( 'as' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:33:9: 'as'
            {
            match("as"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:34:7: ( '.' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:34:9: '.'
            {
            match('.'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:35:7: ( '?.' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:35:9: '?.'
            {
            match("?."); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:36:7: ( '*.' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:36:9: '*.'
            {
            match("*."); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:37:7: ( ',' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:37:9: ','
            {
            match(','); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:38:7: ( '(' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:38:9: '('
            {
            match('('); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:39:7: ( ')' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:39:9: ')'
            {
            match(')'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:40:7: ( '[' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:40:9: '['
            {
            match('['); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:41:7: ( '|' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:41:9: '|'
            {
            match('|'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:42:7: ( ']' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:42:9: ']'
            {
            match(']'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:43:7: ( 'if' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:43:9: 'if'
            {
            match("if"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:44:7: ( 'else' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:44:9: 'else'
            {
            match("else"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:45:7: ( 'switch' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:45:9: 'switch'
            {
            match("switch"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:46:7: ( ':' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:46:9: ':'
            {
            match(':'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:47:7: ( 'default' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:47:9: 'default'
            {
            match("default"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:48:7: ( 'case' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:48:9: 'case'
            {
            match("case"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:49:7: ( 'for' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:49:9: 'for'
            {
            match("for"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:50:7: ( 'while' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:50:9: 'while'
            {
            match("while"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:51:7: ( 'do' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:51:9: 'do'
            {
            match("do"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:52:7: ( ';' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:52:9: ';'
            {
            match(';'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:53:7: ( 'var' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:53:9: 'var'
            {
            match("var"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:54:7: ( 'val' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:54:9: 'val'
            {
            match("val"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:55:7: ( 'super' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:55:9: 'super'
            {
            match("super"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:56:7: ( '::' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:56:9: '::'
            {
            match("::"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:57:7: ( 'new' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:57:9: 'new'
            {
            match("new"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:58:7: ( 'false' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:58:9: 'false'
            {
            match("false"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:59:7: ( 'true' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:59:9: 'true'
            {
            match("true"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:60:7: ( 'null' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:60:9: 'null'
            {
            match("null"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:61:7: ( 'typeof' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:61:9: 'typeof'
            {
            match("typeof"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:62:7: ( 'throw' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:62:9: 'throw'
            {
            match("throw"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:63:7: ( 'return' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:63:9: 'return'
            {
            match("return"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:64:7: ( 'try' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:64:9: 'try'
            {
            match("try"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:65:7: ( 'finally' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:65:9: 'finally'
            {
            match("finally"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:66:7: ( 'catch' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:66:9: 'catch'
            {
            match("catch"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:67:7: ( '=>' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:67:9: '=>'
            {
            match("=>"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:68:7: ( '?' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:68:9: '?'
            {
            match('?'); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:69:7: ( 'extends' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:69:9: 'extends'
            {
            match("extends"); 


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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:70:7: ( '&' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:70:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "RULE_GIVEN_TEXT"
    public final void mRULE_GIVEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_GIVEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4694:17: ( 'Given ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4694:19: 'Given ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING
            {
            match("Given "); 

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4694:28: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4694:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mRULE_SENTENCE_ENDING(); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4696:16: ( 'When ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4696:18: 'When ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING
            {
            match("When "); 

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4696:26: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4696:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mRULE_SENTENCE_ENDING(); 

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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4698:16: ( 'Then ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4698:18: 'Then ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING
            {
            match("Then "); 

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4698:26: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4698:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mRULE_SENTENCE_ENDING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN_TEXT"

    // $ANTLR start "RULE_SENTENCE_ENDING"
    public final void mRULE_SENTENCE_ENDING() throws RecognitionException {
        try {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4700:31: ( '.' ( ' ' | '\\t' )* ( '\\r' )? '\\n' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4700:33: '.' ( ' ' | '\\t' )* ( '\\r' )? '\\n'
            {
            match('.'); 
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4700:37: ( ' ' | '\\t' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:
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

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4700:49: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4700:49: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SENTENCE_ENDING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4702:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4702:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4702:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4702:11: '^'
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

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4702:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='$'||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4704:10: ( ( '0' .. '9' )+ )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4704:12: ( '0' .. '9' )+
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4704:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4704:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4706:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4708:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4708:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4708:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4708:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4710:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4710:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4710:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4710:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4710:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4710:41: ( '\\r' )? '\\n'
                    {
                    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4710:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4710:41: '\\r'
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4712:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4712:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4712:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4714:16: ( . )
            // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:4714:18: .
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
        // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=70;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:370: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 62 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:386: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 63 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:401: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 64 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:416: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 65 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:424: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 66 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:433: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 67 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:445: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 68 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:461: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 69 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:477: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 70 :
                // ../de.bmw.carit.xspec/src-gen/de/bmw/carit/xspec/parser/antlr/internal/InternalXSpec.g:1:485: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA1_eotS =
        "\6\uffff";
    static final String DFA1_eofS =
        "\6\uffff";
    static final String DFA1_minS =
        "\2\0\1\uffff\2\0\1\uffff";
    static final String DFA1_maxS =
        "\2\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\2\uffff\1\2";
    static final String DFA1_specialS =
        "\1\2\1\0\1\uffff\1\3\1\1\1\uffff}>";
    static final String[] DFA1_transitionS = {
            "\56\2\1\1\uffd1\2",
            "\11\2\1\3\1\5\2\2\1\4\22\2\1\3\uffdf\2",
            "",
            "\11\2\1\3\1\5\2\2\1\4\22\2\1\3\uffdf\2",
            "\12\2\1\5\ufff5\2",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 4694:28: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                        s = -1;
                        if ( (LA1_1=='\t'||LA1_1==' ') ) {s = 3;}

                        else if ( (LA1_1=='\r') ) {s = 4;}

                        else if ( (LA1_1=='\n') ) {s = 5;}

                        else if ( ((LA1_1>='\u0000' && LA1_1<='\b')||(LA1_1>='\u000B' && LA1_1<='\f')||(LA1_1>='\u000E' && LA1_1<='\u001F')||(LA1_1>='!' && LA1_1<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_4 = input.LA(1);

                        s = -1;
                        if ( (LA1_4=='\n') ) {s = 5;}

                        else if ( ((LA1_4>='\u0000' && LA1_4<='\t')||(LA1_4>='\u000B' && LA1_4<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_0 = input.LA(1);

                        s = -1;
                        if ( (LA1_0=='.') ) {s = 1;}

                        else if ( ((LA1_0>='\u0000' && LA1_0<='-')||(LA1_0>='/' && LA1_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_3 = input.LA(1);

                        s = -1;
                        if ( ((LA1_3>='\u0000' && LA1_3<='\b')||(LA1_3>='\u000B' && LA1_3<='\f')||(LA1_3>='\u000E' && LA1_3<='\u001F')||(LA1_3>='!' && LA1_3<='\uFFFF')) ) {s = 2;}

                        else if ( (LA1_3=='\r') ) {s = 4;}

                        else if ( (LA1_3=='\n') ) {s = 5;}

                        else if ( (LA1_3=='\t'||LA1_3==' ') ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA2_eotS =
        "\6\uffff";
    static final String DFA2_eofS =
        "\6\uffff";
    static final String DFA2_minS =
        "\2\0\1\uffff\2\0\1\uffff";
    static final String DFA2_maxS =
        "\2\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\2\uffff\1\2";
    static final String DFA2_specialS =
        "\1\1\1\3\1\uffff\1\2\1\0\1\uffff}>";
    static final String[] DFA2_transitionS = {
            "\56\2\1\1\uffd1\2",
            "\11\2\1\3\1\5\2\2\1\4\22\2\1\3\uffdf\2",
            "",
            "\11\2\1\3\1\5\2\2\1\4\22\2\1\3\uffdf\2",
            "\12\2\1\5\ufff5\2",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 4696:26: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_4 = input.LA(1);

                        s = -1;
                        if ( (LA2_4=='\n') ) {s = 5;}

                        else if ( ((LA2_4>='\u0000' && LA2_4<='\t')||(LA2_4>='\u000B' && LA2_4<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_0 = input.LA(1);

                        s = -1;
                        if ( (LA2_0=='.') ) {s = 1;}

                        else if ( ((LA2_0>='\u0000' && LA2_0<='-')||(LA2_0>='/' && LA2_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                        s = -1;
                        if ( (LA2_3=='\r') ) {s = 4;}

                        else if ( (LA2_3=='\n') ) {s = 5;}

                        else if ( (LA2_3=='\t'||LA2_3==' ') ) {s = 3;}

                        else if ( ((LA2_3>='\u0000' && LA2_3<='\b')||(LA2_3>='\u000B' && LA2_3<='\f')||(LA2_3>='\u000E' && LA2_3<='\u001F')||(LA2_3>='!' && LA2_3<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_1 = input.LA(1);

                        s = -1;
                        if ( (LA2_1=='\t'||LA2_1==' ') ) {s = 3;}

                        else if ( (LA2_1=='\r') ) {s = 4;}

                        else if ( (LA2_1=='\n') ) {s = 5;}

                        else if ( ((LA2_1>='\u0000' && LA2_1<='\b')||(LA2_1>='\u000B' && LA2_1<='\f')||(LA2_1>='\u000E' && LA2_1<='\u001F')||(LA2_1>='!' && LA2_1<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\2\0\1\uffff\2\0\1\uffff";
    static final String DFA3_maxS =
        "\2\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\2\uffff\1\2";
    static final String DFA3_specialS =
        "\1\2\1\0\1\uffff\1\3\1\1\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\56\2\1\1\uffd1\2",
            "\11\2\1\3\1\5\2\2\1\4\22\2\1\3\uffdf\2",
            "",
            "\11\2\1\3\1\5\2\2\1\4\22\2\1\3\uffdf\2",
            "\12\2\1\5\ufff5\2",
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

    class DFA3 extends DFA {

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
            return "()* loopback of 4698:26: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                        s = -1;
                        if ( (LA3_1=='\t'||LA3_1==' ') ) {s = 3;}

                        else if ( (LA3_1=='\r') ) {s = 4;}

                        else if ( (LA3_1=='\n') ) {s = 5;}

                        else if ( ((LA3_1>='\u0000' && LA3_1<='\b')||(LA3_1>='\u000B' && LA3_1<='\f')||(LA3_1>='\u000E' && LA3_1<='\u001F')||(LA3_1>='!' && LA3_1<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_4 = input.LA(1);

                        s = -1;
                        if ( (LA3_4=='\n') ) {s = 5;}

                        else if ( ((LA3_4>='\u0000' && LA3_4<='\t')||(LA3_4>='\u000B' && LA3_4<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_0 = input.LA(1);

                        s = -1;
                        if ( (LA3_0=='.') ) {s = 1;}

                        else if ( ((LA3_0>='\u0000' && LA3_0<='-')||(LA3_0>='/' && LA3_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_3 = input.LA(1);

                        s = -1;
                        if ( (LA3_3=='\r') ) {s = 4;}

                        else if ( (LA3_3=='\n') ) {s = 5;}

                        else if ( (LA3_3=='\t'||LA3_3==' ') ) {s = 3;}

                        else if ( ((LA3_3>='\u0000' && LA3_3<='\b')||(LA3_3>='\u000B' && LA3_3<='\f')||(LA3_3>='\u000E' && LA3_3<='\u001F')||(LA3_3>='!' && LA3_3<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\3\uffff\1\61\1\63\1\65\1\67\1\71\1\74\1\76\1\100\1\102\1\104\1"+
        "\107\1\112\1\uffff\1\74\1\116\5\uffff\2\74\1\131\4\74\1\uffff\7"+
        "\74\1\54\2\uffff\2\54\17\uffff\1\74\1\160\20\uffff\1\161\7\uffff"+
        "\4\74\2\uffff\1\74\1\167\5\74\1\uffff\12\74\3\uffff\1\74\2\uffff"+
        "\5\74\1\uffff\2\74\1\u0092\3\74\1\u0096\1\u0097\1\u0098\2\74\1\u009b"+
        "\7\74\1\u00a3\4\74\1\u00a8\1\74\1\uffff\3\74\3\uffff\1\u00ad\1\u00ae"+
        "\1\uffff\7\74\1\uffff\2\74\1\u00b8\1\74\1\uffff\1\u00ba\1\u00bb"+
        "\1\74\1\u00bd\2\uffff\1\74\1\u00bf\2\74\2\uffff\2\74\1\u00c4\1\uffff"+
        "\1\74\2\uffff\1\74\1\uffff\1\u00c7\1\uffff\1\u00c8\1\uffff\1\74"+
        "\1\u00ca\1\uffff\1\u00cb\1\u00cc\2\uffff\1\74\3\uffff\1\74\1\u00cf"+
        "\1\uffff";
    static final String DFA17_eofS =
        "\u00d0\uffff";
    static final String DFA17_minS =
        "\1\0\2\uffff\2\75\1\174\1\46\1\75\1\146\2\75\1\76\1\56\2\52\1\uffff"+
        "\1\163\1\56\5\uffff\1\154\1\165\1\72\1\145\2\141\1\150\1\uffff\1"+
        "\141\1\145\1\150\1\145\1\151\2\150\1\44\2\uffff\2\0\17\uffff\1\163"+
        "\1\44\20\uffff\1\44\7\uffff\1\163\1\164\1\151\1\160\2\uffff\1\146"+
        "\1\44\1\163\1\162\1\154\1\156\1\151\1\uffff\1\154\1\167\1\154\1"+
        "\165\1\160\1\162\1\164\1\166\2\145\3\uffff\1\164\2\uffff\2\145\1"+
        "\164\1\145\1\141\1\uffff\1\145\1\143\1\44\1\163\1\141\1\154\3\44"+
        "\1\154\1\145\1\44\1\145\1\157\1\165\1\145\2\156\1\141\1\44\1\156"+
        "\1\143\1\162\1\165\1\44\1\150\1\uffff\1\145\1\154\1\145\3\uffff"+
        "\2\44\1\uffff\1\157\1\167\1\162\1\156\2\40\1\156\1\uffff\1\144\1"+
        "\150\1\44\1\154\1\uffff\2\44\1\154\1\44\2\uffff\1\146\1\44\1\156"+
        "\1\40\2\uffff\1\143\1\163\1\44\1\uffff\1\164\2\uffff\1\171\1\uffff"+
        "\1\44\1\uffff\1\44\1\uffff\1\145\1\44\1\uffff\2\44\2\uffff\1\157"+
        "\3\uffff\1\146\1\44\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\2\uffff\1\76\1\75\1\174\1\46\1\75\1\156\2\75\1\76\2\56"+
        "\1\57\1\uffff\1\163\1\56\5\uffff\1\170\1\167\1\72\1\157\1\141\1"+
        "\157\1\150\1\uffff\1\141\1\165\1\171\1\145\1\151\2\150\1\172\2\uffff"+
        "\2\uffff\17\uffff\1\163\1\172\20\uffff\1\172\7\uffff\1\163\1\164"+
        "\1\151\1\160\2\uffff\1\146\1\172\1\164\1\162\1\154\1\156\1\151\1"+
        "\uffff\1\162\1\167\1\154\1\171\1\160\1\162\1\164\1\166\2\145\3\uffff"+
        "\1\164\2\uffff\2\145\1\164\1\145\1\141\1\uffff\1\145\1\143\1\172"+
        "\1\163\1\141\1\154\3\172\1\154\1\145\1\172\1\145\1\157\1\165\1\145"+
        "\2\156\1\141\1\172\1\156\1\143\1\162\1\165\1\172\1\150\1\uffff\1"+
        "\145\1\154\1\145\3\uffff\2\172\1\uffff\1\157\1\167\1\162\1\156\2"+
        "\40\1\156\1\uffff\1\144\1\150\1\172\1\154\1\uffff\2\172\1\154\1"+
        "\172\2\uffff\1\146\1\172\1\156\1\40\2\uffff\1\143\1\163\1\172\1"+
        "\uffff\1\164\2\uffff\1\171\1\uffff\1\172\1\uffff\1\172\1\uffff\1"+
        "\145\1\172\1\uffff\2\172\2\uffff\1\157\3\uffff\1\146\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\14\uffff\1\25\2\uffff\1\33\1\34\1\35\1\36\1\40"+
        "\7\uffff\1\52\10\uffff\1\100\1\101\2\uffff\1\105\1\106\1\1\1\2\1"+
        "\7\1\71\1\3\1\4\1\20\1\5\1\37\1\6\1\74\1\10\1\26\2\uffff\1\100\1"+
        "\12\1\14\1\13\1\15\1\16\1\21\1\17\1\30\1\23\1\32\1\22\1\103\1\104"+
        "\1\24\1\25\1\uffff\1\31\1\72\1\33\1\34\1\35\1\36\1\40\4\uffff\1"+
        "\56\1\44\7\uffff\1\52\12\uffff\1\101\1\102\1\105\1\uffff\1\41\1"+
        "\27\5\uffff\1\51\32\uffff\1\47\3\uffff\1\53\1\54\1\57\2\uffff\1"+
        "\66\7\uffff\1\42\4\uffff\1\46\4\uffff\1\62\1\61\4\uffff\1\76\1\77"+
        "\3\uffff\1\55\1\uffff\1\70\1\60\1\uffff\1\50\1\uffff\1\64\1\uffff"+
        "\1\75\2\uffff\1\43\2\uffff\1\63\1\65\1\uffff\1\73\1\45\1\67\2\uffff"+
        "\1\11";
    static final String DFA17_specialS =
        "\1\0\50\uffff\1\2\1\1\u00a5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\7\1\51\1\54\1\47\1\17\1"+
            "\6\1\52\1\23\1\24\1\15\1\4\1\22\1\13\1\14\1\16\12\50\1\31\1"+
            "\36\1\12\1\3\1\11\1\21\1\54\6\47\1\43\14\47\1\45\2\47\1\44\3"+
            "\47\1\25\1\54\1\26\1\46\1\47\1\54\1\20\1\47\1\33\1\32\1\27\1"+
            "\34\2\47\1\10\4\47\1\40\3\47\1\42\1\30\1\41\1\47\1\37\1\35\3"+
            "\47\1\1\1\5\1\2\uff82\54",
            "",
            "",
            "\1\57\1\60",
            "\1\62",
            "\1\64",
            "\1\66",
            "\1\70",
            "\1\73\7\uffff\1\72",
            "\1\75",
            "\1\77",
            "\1\101",
            "\1\103",
            "\1\105\3\uffff\1\106",
            "\1\110\4\uffff\1\111",
            "",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "\1\124\13\uffff\1\125",
            "\1\127\1\uffff\1\126",
            "\1\130",
            "\1\132\11\uffff\1\133",
            "\1\134",
            "\1\136\7\uffff\1\137\5\uffff\1\135",
            "\1\140",
            "",
            "\1\142",
            "\1\143\17\uffff\1\144",
            "\1\147\11\uffff\1\145\6\uffff\1\146",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\74\34\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\0\155",
            "\0\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "",
            "\1\166",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\170\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\177\5\uffff\1\176",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\3\uffff\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "",
            "",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0099",
            "\1\u009a",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00b9",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00bc",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "\1\u00be",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u00c5",
            "",
            "",
            "\1\u00c6",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u00c9",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "\1\u00cd",
            "",
            "",
            "",
            "\1\u00ce",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='{') ) {s = 1;}

                        else if ( (LA17_0=='}') ) {s = 2;}

                        else if ( (LA17_0=='=') ) {s = 3;}

                        else if ( (LA17_0=='+') ) {s = 4;}

                        else if ( (LA17_0=='|') ) {s = 5;}

                        else if ( (LA17_0=='&') ) {s = 6;}

                        else if ( (LA17_0=='!') ) {s = 7;}

                        else if ( (LA17_0=='i') ) {s = 8;}

                        else if ( (LA17_0=='>') ) {s = 9;}

                        else if ( (LA17_0=='<') ) {s = 10;}

                        else if ( (LA17_0=='-') ) {s = 11;}

                        else if ( (LA17_0=='.') ) {s = 12;}

                        else if ( (LA17_0=='*') ) {s = 13;}

                        else if ( (LA17_0=='/') ) {s = 14;}

                        else if ( (LA17_0=='%') ) {s = 15;}

                        else if ( (LA17_0=='a') ) {s = 16;}

                        else if ( (LA17_0=='?') ) {s = 17;}

                        else if ( (LA17_0==',') ) {s = 18;}

                        else if ( (LA17_0=='(') ) {s = 19;}

                        else if ( (LA17_0==')') ) {s = 20;}

                        else if ( (LA17_0=='[') ) {s = 21;}

                        else if ( (LA17_0==']') ) {s = 22;}

                        else if ( (LA17_0=='e') ) {s = 23;}

                        else if ( (LA17_0=='s') ) {s = 24;}

                        else if ( (LA17_0==':') ) {s = 25;}

                        else if ( (LA17_0=='d') ) {s = 26;}

                        else if ( (LA17_0=='c') ) {s = 27;}

                        else if ( (LA17_0=='f') ) {s = 28;}

                        else if ( (LA17_0=='w') ) {s = 29;}

                        else if ( (LA17_0==';') ) {s = 30;}

                        else if ( (LA17_0=='v') ) {s = 31;}

                        else if ( (LA17_0=='n') ) {s = 32;}

                        else if ( (LA17_0=='t') ) {s = 33;}

                        else if ( (LA17_0=='r') ) {s = 34;}

                        else if ( (LA17_0=='G') ) {s = 35;}

                        else if ( (LA17_0=='W') ) {s = 36;}

                        else if ( (LA17_0=='T') ) {s = 37;}

                        else if ( (LA17_0=='^') ) {s = 38;}

                        else if ( (LA17_0=='$'||(LA17_0>='A' && LA17_0<='F')||(LA17_0>='H' && LA17_0<='S')||(LA17_0>='U' && LA17_0<='V')||(LA17_0>='X' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='b'||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='m')||(LA17_0>='o' && LA17_0<='q')||LA17_0=='u'||(LA17_0>='x' && LA17_0<='z')) ) {s = 39;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 40;}

                        else if ( (LA17_0=='\"') ) {s = 41;}

                        else if ( (LA17_0=='\'') ) {s = 42;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 43;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='#'||LA17_0=='@'||LA17_0=='\\'||LA17_0=='`'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_42 = input.LA(1);

                        s = -1;
                        if ( ((LA17_42>='\u0000' && LA17_42<='\uFFFF')) ) {s = 109;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_41 = input.LA(1);

                        s = -1;
                        if ( ((LA17_41>='\u0000' && LA17_41<='\uFFFF')) ) {s = 109;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}