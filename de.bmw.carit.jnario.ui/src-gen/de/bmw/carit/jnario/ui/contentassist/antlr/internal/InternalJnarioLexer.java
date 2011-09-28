package de.bmw.carit.jnario.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJnarioLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
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
    public static final int RULE_NEW_LINE=14;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_THEN_TEXT=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_WHEN_TEXT=9;
    public static final int RULE_GIVEN_TEXT=7;
    public static final int RULE_SCENARIO_TEXT=6;
    public static final int T__59=59;
    public static final int RULE_INT=11;
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
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=12;
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
    public static final int RULE_MULTI_LINE=13;
    public static final int RULE_WS=17;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_AND_TEXT=8;
    public static final int T__78=78;
    public static final int RULE_FEATURE_TEXT=5;
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
    public String getGrammarFileName() { return "../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:11:7: ( '=' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:11:9: '='
            {
            match('='); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:12:7: ( '+=' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:12:9: '+='
            {
            match("+="); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:13:7: ( '||' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:13:9: '||'
            {
            match("||"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14:7: ( '&&' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14:9: '&&'
            {
            match("&&"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:15:7: ( '==' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:15:9: '=='
            {
            match("=="); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:16:7: ( '!=' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:16:9: '!='
            {
            match("!="); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:17:7: ( '>=' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:17:9: '>='
            {
            match(">="); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:18:7: ( '<=' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:18:9: '<='
            {
            match("<="); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:19:7: ( '>' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:19:9: '>'
            {
            match('>'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:20:7: ( '<' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:20:9: '<'
            {
            match('<'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:21:7: ( '->' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:21:9: '->'
            {
            match("->"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:22:7: ( '..' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:22:9: '..'
            {
            match(".."); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:23:7: ( '+' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:23:9: '+'
            {
            match('+'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:24:7: ( '-' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:24:9: '-'
            {
            match('-'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:25:7: ( '*' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:25:9: '*'
            {
            match('*'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:26:7: ( '**' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:26:9: '**'
            {
            match("**"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:27:7: ( '/' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:27:9: '/'
            {
            match('/'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:28:7: ( '%' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:28:9: '%'
            {
            match('%'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:29:7: ( '!' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:29:9: '!'
            {
            match('!'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:30:7: ( '.' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:30:9: '.'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:31:7: ( 'val' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:31:9: 'val'
            {
            match("val"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:32:7: ( 'super' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:32:9: 'super'
            {
            match("super"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:33:7: ( 'false' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:33:9: 'false'
            {
            match("false"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:34:7: ( 'instanceof' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:34:9: 'instanceof'
            {
            match("instanceof"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:35:7: ( 'as' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:35:9: 'as'
            {
            match("as"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:36:7: ( ',' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:36:9: ','
            {
            match(','); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:37:7: ( ')' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:37:9: ')'
            {
            match(')'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:38:7: ( '[' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:38:9: '['
            {
            match('['); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:39:7: ( '|' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:39:9: '|'
            {
            match('|'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:40:7: ( ']' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:40:9: ']'
            {
            match(']'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:41:7: ( '(' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:41:9: '('
            {
            match('('); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:42:7: ( 'if' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:42:9: 'if'
            {
            match("if"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:43:7: ( 'else' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:43:9: 'else'
            {
            match("else"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:44:7: ( 'switch' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:44:9: 'switch'
            {
            match("switch"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:45:7: ( '{' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:45:9: '{'
            {
            match('{'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:46:7: ( '}' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:46:9: '}'
            {
            match('}'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:47:7: ( ':' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:47:9: ':'
            {
            match(':'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:48:7: ( 'default' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:48:9: 'default'
            {
            match("default"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:49:7: ( 'case' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:49:9: 'case'
            {
            match("case"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:50:7: ( 'for' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:50:9: 'for'
            {
            match("for"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:51:7: ( 'while' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:51:9: 'while'
            {
            match("while"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:52:7: ( 'do' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:52:9: 'do'
            {
            match("do"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:53:7: ( ';' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:53:9: ';'
            {
            match(';'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:54:7: ( '::' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:54:9: '::'
            {
            match("::"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:55:7: ( 'new' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:55:9: 'new'
            {
            match("new"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:56:7: ( 'null' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:56:9: 'null'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:57:7: ( 'typeof' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:57:9: 'typeof'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:58:7: ( 'throw' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:58:9: 'throw'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:59:7: ( 'return' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:59:9: 'return'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:60:7: ( 'try' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:60:9: 'try'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:61:7: ( 'finally' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:61:9: 'finally'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:62:7: ( 'catch' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:62:9: 'catch'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:63:7: ( '=>' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:63:9: '=>'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:64:7: ( '?' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:64:9: '?'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:65:7: ( 'extends' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:65:9: 'extends'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:66:7: ( '&' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:66:9: '&'
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

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:67:7: ( '?.' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:67:9: '?.'
            {
            match("?."); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:68:7: ( '*.' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:68:9: '*.'
            {
            match("*."); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:69:7: ( 'var' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:69:9: 'var'
            {
            match("var"); 


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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:70:7: ( 'true' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:70:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "RULE_FEATURE_TEXT"
    public final void mRULE_FEATURE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_FEATURE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14476:19: ( 'Feature' ( ' ' | '\\t' )* ':' ( RULE_MULTI_LINE )* RULE_NEW_LINE )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14476:21: 'Feature' ( ' ' | '\\t' )* ':' ( RULE_MULTI_LINE )* RULE_NEW_LINE
            {
            match("Feature"); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14476:31: ( ' ' | '\\t' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:
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
            	    break loop1;
                }
            } while (true);

            match(':'); 
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14476:47: ( RULE_MULTI_LINE )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14476:47: RULE_MULTI_LINE
            	    {
            	    mRULE_MULTI_LINE(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mRULE_NEW_LINE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FEATURE_TEXT"

    // $ANTLR start "RULE_SCENARIO_TEXT"
    public final void mRULE_SCENARIO_TEXT() throws RecognitionException {
        try {
            int _type = RULE_SCENARIO_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14478:20: ( 'Scenario: ' ( RULE_MULTI_LINE )* RULE_NEW_LINE )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14478:22: 'Scenario: ' ( RULE_MULTI_LINE )* RULE_NEW_LINE
            {
            match("Scenario: "); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14478:35: ( RULE_MULTI_LINE )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14478:35: RULE_MULTI_LINE
            	    {
            	    mRULE_MULTI_LINE(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mRULE_NEW_LINE(); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14480:17: ( 'Given ' ( RULE_MULTI_LINE )* RULE_NEW_LINE )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14480:19: 'Given ' ( RULE_MULTI_LINE )* RULE_NEW_LINE
            {
            match("Given "); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14480:28: ( RULE_MULTI_LINE )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14480:28: RULE_MULTI_LINE
            	    {
            	    mRULE_MULTI_LINE(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            mRULE_NEW_LINE(); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14482:16: ( 'When ' ( RULE_MULTI_LINE )* RULE_NEW_LINE )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14482:18: 'When ' ( RULE_MULTI_LINE )* RULE_NEW_LINE
            {
            match("When "); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14482:26: ( RULE_MULTI_LINE )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14482:26: RULE_MULTI_LINE
            	    {
            	    mRULE_MULTI_LINE(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            mRULE_NEW_LINE(); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14484:16: ( 'Then ' ( RULE_MULTI_LINE )* RULE_NEW_LINE )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14484:18: 'Then ' ( RULE_MULTI_LINE )* RULE_NEW_LINE
            {
            match("Then "); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14484:26: ( RULE_MULTI_LINE )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14484:26: RULE_MULTI_LINE
            	    {
            	    mRULE_MULTI_LINE(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            mRULE_NEW_LINE(); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14486:15: ( 'And ' ( RULE_MULTI_LINE )* RULE_NEW_LINE )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14486:17: 'And ' ( RULE_MULTI_LINE )* RULE_NEW_LINE
            {
            match("And "); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14486:24: ( RULE_MULTI_LINE )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14486:24: RULE_MULTI_LINE
            	    {
            	    mRULE_MULTI_LINE(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            mRULE_NEW_LINE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_TEXT"

    // $ANTLR start "RULE_MULTI_LINE"
    public final void mRULE_MULTI_LINE() throws RecognitionException {
        try {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14488:26: ( (~ ( ( '\\r' | '\\n' ) ) )* '\\\\' ( '\\r' )? '\\n' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14488:28: (~ ( ( '\\r' | '\\n' ) ) )* '\\\\' ( '\\r' )? '\\n'
            {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14488:28: (~ ( ( '\\r' | '\\n' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    int LA8_1 = input.LA(2);

                    if ( ((LA8_1>='\u0000' && LA8_1<='\t')||(LA8_1>='\u000B' && LA8_1<='\f')||(LA8_1>='\u000E' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14488:28: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop8;
                }
            } while (true);

            match('\\'); 
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14488:49: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14488:49: '\\r'
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
    // $ANTLR end "RULE_MULTI_LINE"

    // $ANTLR start "RULE_NEW_LINE"
    public final void mRULE_NEW_LINE() throws RecognitionException {
        try {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14490:24: ( (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14490:26: (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n'
            {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14490:26: (~ ( ( '\\r' | '\\n' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14490:26: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14490:42: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14490:42: '\\r'
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
    // $ANTLR end "RULE_NEW_LINE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14492:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14492:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14492:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14492:11: '^'
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

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14492:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='$'||(LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:
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
            	    break loop13;
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14494:10: ( ( '0' .. '9' )+ )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14494:12: ( '0' .. '9' )+
            {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14494:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14494:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14496:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop16;
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14498:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14498:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14498:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14498:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14500:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14500:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14500:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14500:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop19;
                }
            } while (true);

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14500:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14500:41: ( '\\r' )? '\\n'
                    {
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14500:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14500:41: '\\r'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14502:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14502:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14502:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14504:16: ( . )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14504:18: .
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
        // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | RULE_FEATURE_TEXT | RULE_SCENARIO_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=73;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:178: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:184: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:190: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:196: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:202: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:208: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:214: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:220: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:226: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:232: T__56
                {
                mT__56(); 

                }
                break;
            case 39 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:238: T__57
                {
                mT__57(); 

                }
                break;
            case 40 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:244: T__58
                {
                mT__58(); 

                }
                break;
            case 41 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:250: T__59
                {
                mT__59(); 

                }
                break;
            case 42 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:256: T__60
                {
                mT__60(); 

                }
                break;
            case 43 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:262: T__61
                {
                mT__61(); 

                }
                break;
            case 44 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:268: T__62
                {
                mT__62(); 

                }
                break;
            case 45 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:274: T__63
                {
                mT__63(); 

                }
                break;
            case 46 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:280: T__64
                {
                mT__64(); 

                }
                break;
            case 47 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:286: T__65
                {
                mT__65(); 

                }
                break;
            case 48 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:292: T__66
                {
                mT__66(); 

                }
                break;
            case 49 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:298: T__67
                {
                mT__67(); 

                }
                break;
            case 50 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:304: T__68
                {
                mT__68(); 

                }
                break;
            case 51 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:310: T__69
                {
                mT__69(); 

                }
                break;
            case 52 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:316: T__70
                {
                mT__70(); 

                }
                break;
            case 53 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:322: T__71
                {
                mT__71(); 

                }
                break;
            case 54 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:328: T__72
                {
                mT__72(); 

                }
                break;
            case 55 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:334: T__73
                {
                mT__73(); 

                }
                break;
            case 56 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:340: T__74
                {
                mT__74(); 

                }
                break;
            case 57 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:346: T__75
                {
                mT__75(); 

                }
                break;
            case 58 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:352: T__76
                {
                mT__76(); 

                }
                break;
            case 59 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:358: T__77
                {
                mT__77(); 

                }
                break;
            case 60 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:364: T__78
                {
                mT__78(); 

                }
                break;
            case 61 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:370: RULE_FEATURE_TEXT
                {
                mRULE_FEATURE_TEXT(); 

                }
                break;
            case 62 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:388: RULE_SCENARIO_TEXT
                {
                mRULE_SCENARIO_TEXT(); 

                }
                break;
            case 63 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:407: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 64 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:423: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 65 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:438: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 66 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:453: RULE_AND_TEXT
                {
                mRULE_AND_TEXT(); 

                }
                break;
            case 67 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:467: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:475: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 69 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:484: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 70 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:496: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 71 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:512: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:528: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:536: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA2_eotS =
        "\5\uffff\1\2\1\uffff";
    static final String DFA2_eofS =
        "\7\uffff";
    static final String DFA2_minS =
        "\2\0\1\uffff\1\0\1\12\1\0\1\uffff";
    static final String DFA2_maxS =
        "\2\uffff\1\uffff\1\uffff\1\12\1\uffff\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\3\uffff\1\1";
    static final String DFA2_specialS =
        "\1\1\1\0\1\uffff\1\3\1\uffff\1\2\1\uffff}>";
    static final String[] DFA2_transitionS = {
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\12\3\1\5\2\3\1\4\116\3\1\1\uffa3\3",
            "",
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\1\5",
            "\0\6",
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
            return "()* loopback of 14476:47: ( RULE_MULTI_LINE )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                        s = -1;
                        if ( (LA2_1=='\r') ) {s = 4;}

                        else if ( (LA2_1=='\n') ) {s = 5;}

                        else if ( (LA2_1=='\\') ) {s = 1;}

                        else if ( ((LA2_1>='\u0000' && LA2_1<='\t')||(LA2_1>='\u000B' && LA2_1<='\f')||(LA2_1>='\u000E' && LA2_1<='[')||(LA2_1>=']' && LA2_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_0 = input.LA(1);

                        s = -1;
                        if ( (LA2_0=='\\') ) {s = 1;}

                        else if ( (LA2_0=='\n'||LA2_0=='\r') ) {s = 2;}

                        else if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_5 = input.LA(1);

                        s = -1;
                        if ( ((LA2_5>='\u0000' && LA2_5<='\uFFFF')) ) {s = 6;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_3 = input.LA(1);

                        s = -1;
                        if ( (LA2_3=='\n'||LA2_3=='\r') ) {s = 2;}

                        else if ( (LA2_3=='\\') ) {s = 1;}

                        else if ( ((LA2_3>='\u0000' && LA2_3<='\t')||(LA2_3>='\u000B' && LA2_3<='\f')||(LA2_3>='\u000E' && LA2_3<='[')||(LA2_3>=']' && LA2_3<='\uFFFF')) ) {s = 3;}

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
        "\5\uffff\1\2\1\uffff";
    static final String DFA3_eofS =
        "\7\uffff";
    static final String DFA3_minS =
        "\2\0\1\uffff\1\0\1\12\1\0\1\uffff";
    static final String DFA3_maxS =
        "\2\uffff\1\uffff\1\uffff\1\12\1\uffff\1\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\3\uffff\1\1";
    static final String DFA3_specialS =
        "\1\2\1\0\1\uffff\1\3\1\uffff\1\1\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\12\3\1\5\2\3\1\4\116\3\1\1\uffa3\3",
            "",
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\1\5",
            "\0\6",
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
            return "()* loopback of 14478:35: ( RULE_MULTI_LINE )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                        s = -1;
                        if ( (LA3_1=='\r') ) {s = 4;}

                        else if ( (LA3_1=='\n') ) {s = 5;}

                        else if ( (LA3_1=='\\') ) {s = 1;}

                        else if ( ((LA3_1>='\u0000' && LA3_1<='\t')||(LA3_1>='\u000B' && LA3_1<='\f')||(LA3_1>='\u000E' && LA3_1<='[')||(LA3_1>=']' && LA3_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_5 = input.LA(1);

                        s = -1;
                        if ( ((LA3_5>='\u0000' && LA3_5<='\uFFFF')) ) {s = 6;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_0 = input.LA(1);

                        s = -1;
                        if ( (LA3_0=='\\') ) {s = 1;}

                        else if ( (LA3_0=='\n'||LA3_0=='\r') ) {s = 2;}

                        else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_3 = input.LA(1);

                        s = -1;
                        if ( (LA3_3=='\n'||LA3_3=='\r') ) {s = 2;}

                        else if ( (LA3_3=='\\') ) {s = 1;}

                        else if ( ((LA3_3>='\u0000' && LA3_3<='\t')||(LA3_3>='\u000B' && LA3_3<='\f')||(LA3_3>='\u000E' && LA3_3<='[')||(LA3_3>=']' && LA3_3<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA4_eotS =
        "\5\uffff\1\2\1\uffff";
    static final String DFA4_eofS =
        "\7\uffff";
    static final String DFA4_minS =
        "\2\0\1\uffff\1\0\1\12\1\0\1\uffff";
    static final String DFA4_maxS =
        "\2\uffff\1\uffff\1\uffff\1\12\1\uffff\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\3\uffff\1\1";
    static final String DFA4_specialS =
        "\1\2\1\0\1\uffff\1\3\1\uffff\1\1\1\uffff}>";
    static final String[] DFA4_transitionS = {
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\12\3\1\5\2\3\1\4\116\3\1\1\uffa3\3",
            "",
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\1\5",
            "\0\6",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 14480:28: ( RULE_MULTI_LINE )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                        s = -1;
                        if ( (LA4_1=='\r') ) {s = 4;}

                        else if ( (LA4_1=='\n') ) {s = 5;}

                        else if ( (LA4_1=='\\') ) {s = 1;}

                        else if ( ((LA4_1>='\u0000' && LA4_1<='\t')||(LA4_1>='\u000B' && LA4_1<='\f')||(LA4_1>='\u000E' && LA4_1<='[')||(LA4_1>=']' && LA4_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_5 = input.LA(1);

                        s = -1;
                        if ( ((LA4_5>='\u0000' && LA4_5<='\uFFFF')) ) {s = 6;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_0 = input.LA(1);

                        s = -1;
                        if ( (LA4_0=='\\') ) {s = 1;}

                        else if ( (LA4_0=='\n'||LA4_0=='\r') ) {s = 2;}

                        else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_3 = input.LA(1);

                        s = -1;
                        if ( (LA4_3=='\n'||LA4_3=='\r') ) {s = 2;}

                        else if ( (LA4_3=='\\') ) {s = 1;}

                        else if ( ((LA4_3>='\u0000' && LA4_3<='\t')||(LA4_3>='\u000B' && LA4_3<='\f')||(LA4_3>='\u000E' && LA4_3<='[')||(LA4_3>=']' && LA4_3<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA5_eotS =
        "\5\uffff\1\2\1\uffff";
    static final String DFA5_eofS =
        "\7\uffff";
    static final String DFA5_minS =
        "\2\0\1\uffff\1\0\1\12\1\0\1\uffff";
    static final String DFA5_maxS =
        "\2\uffff\1\uffff\1\uffff\1\12\1\uffff\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\3\uffff\1\1";
    static final String DFA5_specialS =
        "\1\2\1\0\1\uffff\1\3\1\uffff\1\1\1\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\12\3\1\5\2\3\1\4\116\3\1\1\uffa3\3",
            "",
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\1\5",
            "\0\6",
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
            return "()* loopback of 14482:26: ( RULE_MULTI_LINE )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_1 = input.LA(1);

                        s = -1;
                        if ( (LA5_1=='\r') ) {s = 4;}

                        else if ( (LA5_1=='\n') ) {s = 5;}

                        else if ( (LA5_1=='\\') ) {s = 1;}

                        else if ( ((LA5_1>='\u0000' && LA5_1<='\t')||(LA5_1>='\u000B' && LA5_1<='\f')||(LA5_1>='\u000E' && LA5_1<='[')||(LA5_1>=']' && LA5_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_5 = input.LA(1);

                        s = -1;
                        if ( ((LA5_5>='\u0000' && LA5_5<='\uFFFF')) ) {s = 6;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='\\') ) {s = 1;}

                        else if ( (LA5_0=='\n'||LA5_0=='\r') ) {s = 2;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_3 = input.LA(1);

                        s = -1;
                        if ( (LA5_3=='\n'||LA5_3=='\r') ) {s = 2;}

                        else if ( (LA5_3=='\\') ) {s = 1;}

                        else if ( ((LA5_3>='\u0000' && LA5_3<='\t')||(LA5_3>='\u000B' && LA5_3<='\f')||(LA5_3>='\u000E' && LA5_3<='[')||(LA5_3>=']' && LA5_3<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA6_eotS =
        "\5\uffff\1\2\1\uffff";
    static final String DFA6_eofS =
        "\7\uffff";
    static final String DFA6_minS =
        "\2\0\1\uffff\1\0\1\12\1\0\1\uffff";
    static final String DFA6_maxS =
        "\2\uffff\1\uffff\1\uffff\1\12\1\uffff\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\3\uffff\1\1";
    static final String DFA6_specialS =
        "\1\1\1\0\1\uffff\1\2\1\uffff\1\3\1\uffff}>";
    static final String[] DFA6_transitionS = {
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\12\3\1\5\2\3\1\4\116\3\1\1\uffa3\3",
            "",
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\1\5",
            "\0\6",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 14484:26: ( RULE_MULTI_LINE )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                        s = -1;
                        if ( (LA6_1=='\r') ) {s = 4;}

                        else if ( (LA6_1=='\n') ) {s = 5;}

                        else if ( (LA6_1=='\\') ) {s = 1;}

                        else if ( ((LA6_1>='\u0000' && LA6_1<='\t')||(LA6_1>='\u000B' && LA6_1<='\f')||(LA6_1>='\u000E' && LA6_1<='[')||(LA6_1>=']' && LA6_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='\\') ) {s = 1;}

                        else if ( (LA6_0=='\n'||LA6_0=='\r') ) {s = 2;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_3 = input.LA(1);

                        s = -1;
                        if ( (LA6_3=='\n'||LA6_3=='\r') ) {s = 2;}

                        else if ( (LA6_3=='\\') ) {s = 1;}

                        else if ( ((LA6_3>='\u0000' && LA6_3<='\t')||(LA6_3>='\u000B' && LA6_3<='\f')||(LA6_3>='\u000E' && LA6_3<='[')||(LA6_3>=']' && LA6_3<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_5 = input.LA(1);

                        s = -1;
                        if ( ((LA6_5>='\u0000' && LA6_5<='\uFFFF')) ) {s = 6;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\5\uffff\1\2\1\uffff";
    static final String DFA7_eofS =
        "\7\uffff";
    static final String DFA7_minS =
        "\2\0\1\uffff\1\0\1\12\1\0\1\uffff";
    static final String DFA7_maxS =
        "\2\uffff\1\uffff\1\uffff\1\12\1\uffff\1\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\3\uffff\1\1";
    static final String DFA7_specialS =
        "\1\1\1\0\1\uffff\1\3\1\uffff\1\2\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\12\3\1\5\2\3\1\4\116\3\1\1\uffa3\3",
            "",
            "\12\3\1\2\2\3\1\2\116\3\1\1\uffa3\3",
            "\1\5",
            "\0\6",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 14486:24: ( RULE_MULTI_LINE )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                        s = -1;
                        if ( (LA7_1=='\r') ) {s = 4;}

                        else if ( (LA7_1=='\n') ) {s = 5;}

                        else if ( (LA7_1=='\\') ) {s = 1;}

                        else if ( ((LA7_1>='\u0000' && LA7_1<='\t')||(LA7_1>='\u000B' && LA7_1<='\f')||(LA7_1>='\u000E' && LA7_1<='[')||(LA7_1>=']' && LA7_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_0 = input.LA(1);

                        s = -1;
                        if ( (LA7_0=='\\') ) {s = 1;}

                        else if ( (LA7_0=='\n'||LA7_0=='\r') ) {s = 2;}

                        else if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_5 = input.LA(1);

                        s = -1;
                        if ( ((LA7_5>='\u0000' && LA7_5<='\uFFFF')) ) {s = 6;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_3 = input.LA(1);

                        s = -1;
                        if ( (LA7_3=='\n'||LA7_3=='\r') ) {s = 2;}

                        else if ( (LA7_3=='\\') ) {s = 1;}

                        else if ( ((LA7_3>='\u0000' && LA7_3<='\t')||(LA7_3>='\u000B' && LA7_3<='\f')||(LA7_3>='\u000E' && LA7_3<='[')||(LA7_3>=']' && LA7_3<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\1\uffff\1\62\1\64\1\66\1\70\1\72\1\74\1\76\1\100\1\102\1\105\1"+
        "\110\1\uffff\5\113\5\uffff\1\113\2\uffff\1\136\3\113\1\uffff\3\113"+
        "\1\153\6\113\1\57\2\uffff\2\57\34\uffff\1\113\1\uffff\6\113\1\175"+
        "\1\176\5\uffff\2\113\4\uffff\1\113\1\u0082\2\113\1\uffff\6\113\2"+
        "\uffff\6\113\3\uffff\1\u0093\1\u0094\3\113\1\u0098\2\113\2\uffff"+
        "\3\113\1\uffff\3\113\1\u00a1\3\113\1\u00a5\10\113\2\uffff\3\113"+
        "\1\uffff\2\113\1\u00b3\2\113\1\u00b6\2\113\1\uffff\1\u00b9\2\113"+
        "\1\uffff\1\u00bc\6\113\1\uffff\1\u00c3\1\113\1\u00c5\2\113\1\uffff"+
        "\2\113\1\uffff\1\u00ca\1\u00cb\1\uffff\1\113\1\u00cd\1\uffff\4\113"+
        "\3\uffff\1\u00d2\1\uffff\4\113\2\uffff\1\u00d7\1\uffff\1\u00d8\2"+
        "\113\2\uffff\1\u00db\1\113\1\u00dd\1\u00de\2\uffff\2\113\1\uffff"+
        "\1\113\3\uffff\2\113\1\uffff\1\u00e4\1\uffff";
    static final String DFA23_eofS =
        "\u00e5\uffff";
    static final String DFA23_minS =
        "\1\0\2\75\1\174\1\46\3\75\1\76\1\56\2\52\1\uffff\1\141\1\165\1"+
        "\141\1\146\1\163\5\uffff\1\154\2\uffff\1\72\1\145\1\141\1\150\1"+
        "\uffff\1\145\1\150\1\145\1\56\1\145\1\143\1\151\2\150\1\156\1\44"+
        "\2\uffff\2\0\34\uffff\1\154\1\uffff\1\160\1\151\1\154\1\162\1\156"+
        "\1\163\2\44\5\uffff\1\163\1\164\4\uffff\1\146\1\44\1\163\1\151\1"+
        "\uffff\1\167\1\154\1\160\1\162\1\165\1\164\2\uffff\1\141\1\145\1"+
        "\166\2\145\1\144\3\uffff\2\44\1\145\1\164\1\163\1\44\1\141\1\164"+
        "\2\uffff\2\145\1\141\1\uffff\1\145\1\143\1\154\1\44\1\154\1\145"+
        "\1\157\1\44\1\145\1\165\1\164\1\156\1\145\2\156\1\40\2\uffff\1\162"+
        "\1\143\1\145\1\uffff\1\154\1\141\1\44\1\156\1\165\1\44\1\150\1\145"+
        "\1\uffff\1\44\1\157\1\167\1\uffff\1\44\1\162\1\165\1\141\1\156\2"+
        "\40\1\uffff\1\44\1\150\1\44\1\154\1\156\1\uffff\1\144\1\154\1\uffff"+
        "\2\44\1\uffff\1\146\1\44\1\uffff\1\156\2\162\1\40\3\uffff\1\44\1"+
        "\uffff\1\171\1\143\1\163\1\164\2\uffff\1\44\1\uffff\1\44\1\145\1"+
        "\151\2\uffff\1\44\1\145\2\44\2\uffff\1\11\1\157\1\uffff\1\157\3"+
        "\uffff\1\72\1\146\1\uffff\1\44\1\uffff";
    static final String DFA23_maxS =
        "\1\uffff\1\76\1\75\1\174\1\46\3\75\1\76\2\56\1\57\1\uffff\1\141"+
        "\1\167\1\157\1\156\1\163\5\uffff\1\170\2\uffff\1\72\1\157\1\141"+
        "\1\150\1\uffff\1\165\1\171\1\145\1\56\1\145\1\143\1\151\2\150\1"+
        "\156\1\172\2\uffff\2\uffff\34\uffff\1\162\1\uffff\1\160\1\151\1"+
        "\154\1\162\1\156\1\163\2\172\5\uffff\1\163\1\164\4\uffff\1\146\1"+
        "\172\1\164\1\151\1\uffff\1\167\1\154\1\160\1\162\1\171\1\164\2\uffff"+
        "\1\141\1\145\1\166\2\145\1\144\3\uffff\2\172\1\145\1\164\1\163\1"+
        "\172\1\141\1\164\2\uffff\2\145\1\141\1\uffff\1\145\1\143\1\154\1"+
        "\172\1\154\1\145\1\157\1\172\1\145\1\165\1\164\1\156\1\145\2\156"+
        "\1\40\2\uffff\1\162\1\143\1\145\1\uffff\1\154\1\141\1\172\1\156"+
        "\1\165\1\172\1\150\1\145\1\uffff\1\172\1\157\1\167\1\uffff\1\172"+
        "\1\162\1\165\1\141\1\156\2\40\1\uffff\1\172\1\150\1\172\1\154\1"+
        "\156\1\uffff\1\144\1\154\1\uffff\2\172\1\uffff\1\146\1\172\1\uffff"+
        "\1\156\2\162\1\40\3\uffff\1\172\1\uffff\1\171\1\143\1\163\1\164"+
        "\2\uffff\1\172\1\uffff\1\172\1\145\1\151\2\uffff\1\172\1\145\2\172"+
        "\2\uffff\1\72\1\157\1\uffff\1\157\3\uffff\1\72\1\146\1\uffff\1\172"+
        "\1\uffff";
    static final String DFA23_acceptS =
        "\14\uffff\1\22\5\uffff\1\32\1\33\1\34\1\36\1\37\1\uffff\1\43\1"+
        "\44\4\uffff\1\53\13\uffff\1\103\1\104\2\uffff\1\110\1\111\1\5\1"+
        "\65\1\1\1\2\1\15\1\3\1\35\1\4\1\70\1\6\1\23\1\7\1\11\1\10\1\12\1"+
        "\13\1\16\1\14\1\24\1\20\1\72\1\17\1\106\1\107\1\21\1\22\1\uffff"+
        "\1\103\10\uffff\1\32\1\33\1\34\1\36\1\37\2\uffff\1\43\1\44\1\54"+
        "\1\45\4\uffff\1\53\6\uffff\1\71\1\66\6\uffff\1\104\1\105\1\110\10"+
        "\uffff\1\40\1\31\3\uffff\1\52\20\uffff\1\25\1\73\3\uffff\1\50\10"+
        "\uffff\1\55\3\uffff\1\62\7\uffff\1\102\5\uffff\1\41\2\uffff\1\47"+
        "\2\uffff\1\56\2\uffff\1\74\4\uffff\1\100\1\101\1\26\1\uffff\1\27"+
        "\4\uffff\1\64\1\51\1\uffff\1\60\3\uffff\1\77\1\42\4\uffff\1\57\1"+
        "\61\2\uffff\1\63\1\uffff\1\67\1\46\1\75\2\uffff\1\76\1\uffff\1\30";
    static final String DFA23_specialS =
        "\1\2\53\uffff\1\0\1\1\u00b7\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\5\1\54\1\57\1\52\1\14\1"+
            "\4\1\55\1\26\1\23\1\12\1\2\1\22\1\10\1\11\1\13\12\53\1\32\1"+
            "\36\1\7\1\1\1\6\1\42\1\57\1\50\4\52\1\43\1\45\13\52\1\44\1\47"+
            "\2\52\1\46\3\52\1\24\1\57\1\25\1\51\1\52\1\57\1\21\1\52\1\34"+
            "\1\33\1\27\1\17\2\52\1\20\4\52\1\37\3\52\1\41\1\16\1\40\1\52"+
            "\1\15\1\35\3\52\1\30\1\3\1\31\uff82\57",
            "\1\60\1\61",
            "\1\63",
            "\1\65",
            "\1\67",
            "\1\71",
            "\1\73",
            "\1\75",
            "\1\77",
            "\1\101",
            "\1\103\3\uffff\1\104",
            "\1\106\4\uffff\1\107",
            "",
            "\1\112",
            "\1\114\1\uffff\1\115",
            "\1\116\7\uffff\1\120\5\uffff\1\117",
            "\1\122\7\uffff\1\121",
            "\1\123",
            "",
            "",
            "",
            "",
            "",
            "\1\131\13\uffff\1\132",
            "",
            "",
            "\1\135",
            "\1\137\11\uffff\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\144\17\uffff\1\145",
            "\1\147\11\uffff\1\150\6\uffff\1\146",
            "\1\151",
            "\1\152",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\113\34\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
            "",
            "",
            "\0\163",
            "\0\163",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\165\5\uffff\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "",
            "",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "",
            "",
            "\1\u0081",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u0083\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008b\3\uffff\1\u008a",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00b4",
            "\1\u00b5",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00c4",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u00cc",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00d9",
            "\1\u00da",
            "",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00dc",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "",
            "\1\u00df\26\uffff\1\u00df\31\uffff\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "",
            "",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | RULE_FEATURE_TEXT | RULE_SCENARIO_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_44 = input.LA(1);

                        s = -1;
                        if ( ((LA23_44>='\u0000' && LA23_44<='\uFFFF')) ) {s = 115;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_45 = input.LA(1);

                        s = -1;
                        if ( ((LA23_45>='\u0000' && LA23_45<='\uFFFF')) ) {s = 115;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0=='=') ) {s = 1;}

                        else if ( (LA23_0=='+') ) {s = 2;}

                        else if ( (LA23_0=='|') ) {s = 3;}

                        else if ( (LA23_0=='&') ) {s = 4;}

                        else if ( (LA23_0=='!') ) {s = 5;}

                        else if ( (LA23_0=='>') ) {s = 6;}

                        else if ( (LA23_0=='<') ) {s = 7;}

                        else if ( (LA23_0=='-') ) {s = 8;}

                        else if ( (LA23_0=='.') ) {s = 9;}

                        else if ( (LA23_0=='*') ) {s = 10;}

                        else if ( (LA23_0=='/') ) {s = 11;}

                        else if ( (LA23_0=='%') ) {s = 12;}

                        else if ( (LA23_0=='v') ) {s = 13;}

                        else if ( (LA23_0=='s') ) {s = 14;}

                        else if ( (LA23_0=='f') ) {s = 15;}

                        else if ( (LA23_0=='i') ) {s = 16;}

                        else if ( (LA23_0=='a') ) {s = 17;}

                        else if ( (LA23_0==',') ) {s = 18;}

                        else if ( (LA23_0==')') ) {s = 19;}

                        else if ( (LA23_0=='[') ) {s = 20;}

                        else if ( (LA23_0==']') ) {s = 21;}

                        else if ( (LA23_0=='(') ) {s = 22;}

                        else if ( (LA23_0=='e') ) {s = 23;}

                        else if ( (LA23_0=='{') ) {s = 24;}

                        else if ( (LA23_0=='}') ) {s = 25;}

                        else if ( (LA23_0==':') ) {s = 26;}

                        else if ( (LA23_0=='d') ) {s = 27;}

                        else if ( (LA23_0=='c') ) {s = 28;}

                        else if ( (LA23_0=='w') ) {s = 29;}

                        else if ( (LA23_0==';') ) {s = 30;}

                        else if ( (LA23_0=='n') ) {s = 31;}

                        else if ( (LA23_0=='t') ) {s = 32;}

                        else if ( (LA23_0=='r') ) {s = 33;}

                        else if ( (LA23_0=='?') ) {s = 34;}

                        else if ( (LA23_0=='F') ) {s = 35;}

                        else if ( (LA23_0=='S') ) {s = 36;}

                        else if ( (LA23_0=='G') ) {s = 37;}

                        else if ( (LA23_0=='W') ) {s = 38;}

                        else if ( (LA23_0=='T') ) {s = 39;}

                        else if ( (LA23_0=='A') ) {s = 40;}

                        else if ( (LA23_0=='^') ) {s = 41;}

                        else if ( (LA23_0=='$'||(LA23_0>='B' && LA23_0<='E')||(LA23_0>='H' && LA23_0<='R')||(LA23_0>='U' && LA23_0<='V')||(LA23_0>='X' && LA23_0<='Z')||LA23_0=='_'||LA23_0=='b'||(LA23_0>='g' && LA23_0<='h')||(LA23_0>='j' && LA23_0<='m')||(LA23_0>='o' && LA23_0<='q')||LA23_0=='u'||(LA23_0>='x' && LA23_0<='z')) ) {s = 42;}

                        else if ( ((LA23_0>='0' && LA23_0<='9')) ) {s = 43;}

                        else if ( (LA23_0=='\"') ) {s = 44;}

                        else if ( (LA23_0=='\'') ) {s = 45;}

                        else if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 46;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||LA23_0=='#'||LA23_0=='@'||LA23_0=='\\'||LA23_0=='`'||(LA23_0>='~' && LA23_0<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}