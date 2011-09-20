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
    public static final int RULE_SENTENCE_ENDING=12;
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
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_THEN_TEXT=9;
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
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int RULE_WHEN_TEXT=8;
    public static final int RULE_GIVEN_TEXT=7;
    public static final int RULE_SCENARIO_TEXT=6;
    public static final int T__59=59;
    public static final int RULE_INT=10;
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
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=11;
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
    public static final int RULE_WS=15;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_FEATURE_TEXT=5;

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

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
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
    // $ANTLR end "T__76"

    // $ANTLR start "RULE_FEATURE_TEXT"
    public final void mRULE_FEATURE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_FEATURE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14184:19: ( 'Feature ' ( options {greedy=false; } : . )* ':' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14184:21: 'Feature ' ( options {greedy=false; } : . )* ':'
            {
            match("Feature "); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14184:32: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==':') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='9')||(LA1_0>=';' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14184:60: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(':'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14186:20: ( 'Scenario ' ( options {greedy=false; } : . )* ':' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14186:22: 'Scenario ' ( options {greedy=false; } : . )* ':'
            {
            match("Scenario "); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14186:34: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==':') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='9')||(LA2_0>=';' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14186:62: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(':'); 

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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14188:17: ( 'Given ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14188:19: 'Given ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING
            {
            match("Given "); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14188:28: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14188:56: .
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
    // $ANTLR end "RULE_GIVEN_TEXT"

    // $ANTLR start "RULE_WHEN_TEXT"
    public final void mRULE_WHEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_WHEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14190:16: ( 'When ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14190:18: 'When ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING
            {
            match("When "); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14190:26: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14190:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14192:16: ( 'Then ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14192:18: 'Then ' ( options {greedy=false; } : . )* RULE_SENTENCE_ENDING
            {
            match("Then "); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14192:26: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14192:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14194:31: ( '.' ( ' ' | '\\t' )* ( '\\r' )? '\\n' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14194:33: '.' ( ' ' | '\\t' )* ( '\\r' )? '\\n'
            {
            match('.'); 
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14194:37: ( ' ' | '\\t' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
                }
            } while (true);

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14194:49: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14194:49: '\\r'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14196:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14196:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14196:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14196:11: '^'
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

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14196:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14198:10: ( ( '0' .. '9' )+ )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14198:12: ( '0' .. '9' )+
            {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14198:12: ( '0' .. '9' )+
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
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14198:13: '0' .. '9'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14200:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14202:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14202:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14202:24: ( options {greedy=false; } : . )*
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
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14202:52: .
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14204:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14204:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14204:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14204:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14204:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14204:41: ( '\\r' )? '\\n'
                    {
                    // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14204:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14204:41: '\\r'
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14206:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14206:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14206:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14208:16: ( . )
            // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:14208:18: .
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
        // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | RULE_FEATURE_TEXT | RULE_SCENARIO_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=72;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:364: T__76
                {
                mT__76(); 

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
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:453: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 67 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:461: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 68 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:470: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 69 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:482: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 70 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:498: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 71 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:514: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 72 :
                // ../de.bmw.carit.jnario.ui/src-gen/de/bmw/carit/jnario/ui/contentassist/antlr/internal/InternalJnario.g:1:522: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA19 dfa19 = new DFA19(this);
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
        "\1\1\1\3\1\uffff\1\0\1\2\1\uffff}>";
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
            return "()* loopback of 14188:28: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_3 = input.LA(1);

                        s = -1;
                        if ( ((LA3_3>='\u0000' && LA3_3<='\b')||(LA3_3>='\u000B' && LA3_3<='\f')||(LA3_3>='\u000E' && LA3_3<='\u001F')||(LA3_3>='!' && LA3_3<='\uFFFF')) ) {s = 2;}

                        else if ( (LA3_3=='\r') ) {s = 4;}

                        else if ( (LA3_3=='\n') ) {s = 5;}

                        else if ( (LA3_3=='\t'||LA3_3==' ') ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_0 = input.LA(1);

                        s = -1;
                        if ( (LA3_0=='.') ) {s = 1;}

                        else if ( ((LA3_0>='\u0000' && LA3_0<='-')||(LA3_0>='/' && LA3_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_4 = input.LA(1);

                        s = -1;
                        if ( (LA3_4=='\n') ) {s = 5;}

                        else if ( ((LA3_4>='\u0000' && LA3_4<='\t')||(LA3_4>='\u000B' && LA3_4<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_1 = input.LA(1);

                        s = -1;
                        if ( ((LA3_1>='\u0000' && LA3_1<='\b')||(LA3_1>='\u000B' && LA3_1<='\f')||(LA3_1>='\u000E' && LA3_1<='\u001F')||(LA3_1>='!' && LA3_1<='\uFFFF')) ) {s = 2;}

                        else if ( (LA3_1=='\t'||LA3_1==' ') ) {s = 3;}

                        else if ( (LA3_1=='\r') ) {s = 4;}

                        else if ( (LA3_1=='\n') ) {s = 5;}

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
        "\6\uffff";
    static final String DFA4_eofS =
        "\6\uffff";
    static final String DFA4_minS =
        "\2\0\1\uffff\2\0\1\uffff";
    static final String DFA4_maxS =
        "\2\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\2\uffff\1\2";
    static final String DFA4_specialS =
        "\1\1\1\2\1\uffff\1\0\1\3\1\uffff}>";
    static final String[] DFA4_transitionS = {
            "\56\2\1\1\uffd1\2",
            "\11\2\1\3\1\5\2\2\1\4\22\2\1\3\uffdf\2",
            "",
            "\11\2\1\3\1\5\2\2\1\4\22\2\1\3\uffdf\2",
            "\12\2\1\5\ufff5\2",
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
            return "()* loopback of 14190:26: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_3 = input.LA(1);

                        s = -1;
                        if ( ((LA4_3>='\u0000' && LA4_3<='\b')||(LA4_3>='\u000B' && LA4_3<='\f')||(LA4_3>='\u000E' && LA4_3<='\u001F')||(LA4_3>='!' && LA4_3<='\uFFFF')) ) {s = 2;}

                        else if ( (LA4_3=='\r') ) {s = 4;}

                        else if ( (LA4_3=='\n') ) {s = 5;}

                        else if ( (LA4_3=='\t'||LA4_3==' ') ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_0 = input.LA(1);

                        s = -1;
                        if ( (LA4_0=='.') ) {s = 1;}

                        else if ( ((LA4_0>='\u0000' && LA4_0<='-')||(LA4_0>='/' && LA4_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_1 = input.LA(1);

                        s = -1;
                        if ( ((LA4_1>='\u0000' && LA4_1<='\b')||(LA4_1>='\u000B' && LA4_1<='\f')||(LA4_1>='\u000E' && LA4_1<='\u001F')||(LA4_1>='!' && LA4_1<='\uFFFF')) ) {s = 2;}

                        else if ( (LA4_1=='\t'||LA4_1==' ') ) {s = 3;}

                        else if ( (LA4_1=='\r') ) {s = 4;}

                        else if ( (LA4_1=='\n') ) {s = 5;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                        s = -1;
                        if ( (LA4_4=='\n') ) {s = 5;}

                        else if ( ((LA4_4>='\u0000' && LA4_4<='\t')||(LA4_4>='\u000B' && LA4_4<='\uFFFF')) ) {s = 2;}

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
        "\6\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\2\0\1\uffff\2\0\1\uffff";
    static final String DFA5_maxS =
        "\2\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\2\uffff\1\2";
    static final String DFA5_specialS =
        "\1\1\1\3\1\uffff\1\0\1\2\1\uffff}>";
    static final String[] DFA5_transitionS = {
            "\56\2\1\1\uffd1\2",
            "\11\2\1\3\1\5\2\2\1\4\22\2\1\3\uffdf\2",
            "",
            "\11\2\1\3\1\5\2\2\1\4\22\2\1\3\uffdf\2",
            "\12\2\1\5\ufff5\2",
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
            return "()* loopback of 14192:26: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_3 = input.LA(1);

                        s = -1;
                        if ( ((LA5_3>='\u0000' && LA5_3<='\b')||(LA5_3>='\u000B' && LA5_3<='\f')||(LA5_3>='\u000E' && LA5_3<='\u001F')||(LA5_3>='!' && LA5_3<='\uFFFF')) ) {s = 2;}

                        else if ( (LA5_3=='\r') ) {s = 4;}

                        else if ( (LA5_3=='\n') ) {s = 5;}

                        else if ( (LA5_3=='\t'||LA5_3==' ') ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='.') ) {s = 1;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='-')||(LA5_0>='/' && LA5_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_4 = input.LA(1);

                        s = -1;
                        if ( ((LA5_4>='\u0000' && LA5_4<='\t')||(LA5_4>='\u000B' && LA5_4<='\uFFFF')) ) {s = 2;}

                        else if ( (LA5_4=='\n') ) {s = 5;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_1 = input.LA(1);

                        s = -1;
                        if ( ((LA5_1>='\u0000' && LA5_1<='\b')||(LA5_1>='\u000B' && LA5_1<='\f')||(LA5_1>='\u000E' && LA5_1<='\u001F')||(LA5_1>='!' && LA5_1<='\uFFFF')) ) {s = 2;}

                        else if ( (LA5_1=='\t'||LA5_1==' ') ) {s = 3;}

                        else if ( (LA5_1=='\r') ) {s = 4;}

                        else if ( (LA5_1=='\n') ) {s = 5;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\1\61\1\63\1\65\1\67\1\71\1\73\1\75\1\77\1\101\1\104\1"+
        "\107\1\uffff\5\112\5\uffff\1\112\2\uffff\1\135\3\112\1\uffff\3\112"+
        "\1\152\5\112\1\56\2\uffff\2\56\34\uffff\1\112\1\uffff\6\112\1\173"+
        "\1\174\5\uffff\2\112\4\uffff\1\112\1\u0080\2\112\1\uffff\6\112\2"+
        "\uffff\5\112\3\uffff\1\u0090\1\u0091\3\112\1\u0095\2\112\2\uffff"+
        "\3\112\1\uffff\3\112\1\u009e\3\112\1\u00a2\7\112\2\uffff\3\112\1"+
        "\uffff\2\112\1\u00af\2\112\1\u00b2\2\112\1\uffff\1\u00b5\2\112\1"+
        "\uffff\1\u00b8\6\112\1\u00bf\1\112\1\u00c1\2\112\1\uffff\2\112\1"+
        "\uffff\1\u00c6\1\u00c7\1\uffff\1\112\1\u00c9\1\uffff\4\112\3\uffff"+
        "\1\u00ce\1\uffff\4\112\2\uffff\1\u00d3\1\uffff\1\u00d4\2\112\2\uffff"+
        "\1\u00d7\1\112\1\u00d9\1\u00da\2\uffff\2\112\1\uffff\1\112\3\uffff"+
        "\2\112\1\uffff\1\u00e0\1\uffff";
    static final String DFA19_eofS =
        "\u00e1\uffff";
    static final String DFA19_minS =
        "\1\0\2\75\1\174\1\46\3\75\1\76\1\56\2\52\1\uffff\1\141\1\165\1"+
        "\141\1\146\1\163\5\uffff\1\154\2\uffff\1\72\1\145\1\141\1\150\1"+
        "\uffff\1\145\1\150\1\145\1\56\1\145\1\143\1\151\2\150\1\44\2\uffff"+
        "\2\0\34\uffff\1\154\1\uffff\1\160\1\151\1\154\1\162\1\156\1\163"+
        "\2\44\5\uffff\1\163\1\164\4\uffff\1\146\1\44\1\163\1\151\1\uffff"+
        "\1\167\1\154\1\160\1\162\1\165\1\164\2\uffff\1\141\1\145\1\166\2"+
        "\145\3\uffff\2\44\1\145\1\164\1\163\1\44\1\141\1\164\2\uffff\2\145"+
        "\1\141\1\uffff\1\145\1\143\1\154\1\44\1\154\1\145\1\157\1\44\1\145"+
        "\1\165\1\164\1\156\1\145\2\156\2\uffff\1\162\1\143\1\145\1\uffff"+
        "\1\154\1\141\1\44\1\156\1\165\1\44\1\150\1\145\1\uffff\1\44\1\157"+
        "\1\167\1\uffff\1\44\1\162\1\165\1\141\1\156\2\40\1\44\1\150\1\44"+
        "\1\154\1\156\1\uffff\1\144\1\154\1\uffff\2\44\1\uffff\1\146\1\44"+
        "\1\uffff\1\156\2\162\1\40\3\uffff\1\44\1\uffff\1\171\1\143\1\163"+
        "\1\164\2\uffff\1\44\1\uffff\1\44\1\145\1\151\2\uffff\1\44\1\145"+
        "\2\44\2\uffff\1\40\1\157\1\uffff\1\157\3\uffff\1\40\1\146\1\uffff"+
        "\1\44\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\76\1\75\1\174\1\46\3\75\1\76\2\56\1\57\1\uffff\1\141"+
        "\1\167\1\157\1\156\1\163\5\uffff\1\170\2\uffff\1\72\1\157\1\141"+
        "\1\150\1\uffff\1\165\1\171\1\145\1\56\1\145\1\143\1\151\2\150\1"+
        "\172\2\uffff\2\uffff\34\uffff\1\162\1\uffff\1\160\1\151\1\154\1"+
        "\162\1\156\1\163\2\172\5\uffff\1\163\1\164\4\uffff\1\146\1\172\1"+
        "\164\1\151\1\uffff\1\167\1\154\1\160\1\162\1\171\1\164\2\uffff\1"+
        "\141\1\145\1\166\2\145\3\uffff\2\172\1\145\1\164\1\163\1\172\1\141"+
        "\1\164\2\uffff\2\145\1\141\1\uffff\1\145\1\143\1\154\1\172\1\154"+
        "\1\145\1\157\1\172\1\145\1\165\1\164\1\156\1\145\2\156\2\uffff\1"+
        "\162\1\143\1\145\1\uffff\1\154\1\141\1\172\1\156\1\165\1\172\1\150"+
        "\1\145\1\uffff\1\172\1\157\1\167\1\uffff\1\172\1\162\1\165\1\141"+
        "\1\156\2\40\1\172\1\150\1\172\1\154\1\156\1\uffff\1\144\1\154\1"+
        "\uffff\2\172\1\uffff\1\146\1\172\1\uffff\1\156\2\162\1\40\3\uffff"+
        "\1\172\1\uffff\1\171\1\143\1\163\1\164\2\uffff\1\172\1\uffff\1\172"+
        "\1\145\1\151\2\uffff\1\172\1\145\2\172\2\uffff\1\40\1\157\1\uffff"+
        "\1\157\3\uffff\1\40\1\146\1\uffff\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\14\uffff\1\22\5\uffff\1\32\1\33\1\34\1\36\1\37\1\uffff\1\43\1"+
        "\44\4\uffff\1\53\12\uffff\1\102\1\103\2\uffff\1\107\1\110\1\5\1"+
        "\65\1\1\1\2\1\15\1\3\1\35\1\4\1\70\1\6\1\23\1\7\1\11\1\10\1\12\1"+
        "\13\1\16\1\14\1\24\1\20\1\72\1\17\1\105\1\106\1\21\1\22\1\uffff"+
        "\1\102\10\uffff\1\32\1\33\1\34\1\36\1\37\2\uffff\1\43\1\44\1\54"+
        "\1\45\4\uffff\1\53\6\uffff\1\71\1\66\5\uffff\1\103\1\104\1\107\10"+
        "\uffff\1\40\1\31\3\uffff\1\52\17\uffff\1\25\1\73\3\uffff\1\50\10"+
        "\uffff\1\55\3\uffff\1\62\14\uffff\1\41\2\uffff\1\47\2\uffff\1\56"+
        "\2\uffff\1\74\4\uffff\1\100\1\101\1\26\1\uffff\1\27\4\uffff\1\64"+
        "\1\51\1\uffff\1\60\3\uffff\1\77\1\42\4\uffff\1\57\1\61\2\uffff\1"+
        "\63\1\uffff\1\67\1\46\1\75\2\uffff\1\76\1\uffff\1\30";
    static final String DFA19_specialS =
        "\1\2\52\uffff\1\1\1\0\u00b4\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\5\1\53\1\56\1\51\1\14\1"+
            "\4\1\54\1\26\1\23\1\12\1\2\1\22\1\10\1\11\1\13\12\52\1\32\1"+
            "\36\1\7\1\1\1\6\1\42\1\56\5\51\1\43\1\45\13\51\1\44\1\47\2\51"+
            "\1\46\3\51\1\24\1\56\1\25\1\50\1\51\1\56\1\21\1\51\1\34\1\33"+
            "\1\27\1\17\2\51\1\20\4\51\1\37\3\51\1\41\1\16\1\40\1\51\1\15"+
            "\1\35\3\51\1\30\1\3\1\31\uff82\56",
            "\1\57\1\60",
            "\1\62",
            "\1\64",
            "\1\66",
            "\1\70",
            "\1\72",
            "\1\74",
            "\1\76",
            "\1\100",
            "\1\102\3\uffff\1\103",
            "\1\105\4\uffff\1\106",
            "",
            "\1\111",
            "\1\113\1\uffff\1\114",
            "\1\115\7\uffff\1\117\5\uffff\1\116",
            "\1\121\7\uffff\1\120",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\130\13\uffff\1\131",
            "",
            "",
            "\1\134",
            "\1\136\11\uffff\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\143\17\uffff\1\144",
            "\1\146\11\uffff\1\147\6\uffff\1\145",
            "\1\150",
            "\1\151",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\112\34\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "",
            "\0\161",
            "\0\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\163\5\uffff\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "",
            "",
            "",
            "",
            "",
            "\1\175",
            "\1\176",
            "",
            "",
            "",
            "",
            "\1\177",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u0081\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0089\3\uffff\1\u0088",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u0096",
            "\1\u0097",
            "",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u00b0",
            "\1\u00b1",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u00c0",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "",
            "\1\u00c8",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "",
            "",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u00d8",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "",
            "",
            "",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\112\13\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | RULE_FEATURE_TEXT | RULE_SCENARIO_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_44 = input.LA(1);

                        s = -1;
                        if ( ((LA19_44>='\u0000' && LA19_44<='\uFFFF')) ) {s = 113;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_43 = input.LA(1);

                        s = -1;
                        if ( ((LA19_43>='\u0000' && LA19_43<='\uFFFF')) ) {s = 113;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='=') ) {s = 1;}

                        else if ( (LA19_0=='+') ) {s = 2;}

                        else if ( (LA19_0=='|') ) {s = 3;}

                        else if ( (LA19_0=='&') ) {s = 4;}

                        else if ( (LA19_0=='!') ) {s = 5;}

                        else if ( (LA19_0=='>') ) {s = 6;}

                        else if ( (LA19_0=='<') ) {s = 7;}

                        else if ( (LA19_0=='-') ) {s = 8;}

                        else if ( (LA19_0=='.') ) {s = 9;}

                        else if ( (LA19_0=='*') ) {s = 10;}

                        else if ( (LA19_0=='/') ) {s = 11;}

                        else if ( (LA19_0=='%') ) {s = 12;}

                        else if ( (LA19_0=='v') ) {s = 13;}

                        else if ( (LA19_0=='s') ) {s = 14;}

                        else if ( (LA19_0=='f') ) {s = 15;}

                        else if ( (LA19_0=='i') ) {s = 16;}

                        else if ( (LA19_0=='a') ) {s = 17;}

                        else if ( (LA19_0==',') ) {s = 18;}

                        else if ( (LA19_0==')') ) {s = 19;}

                        else if ( (LA19_0=='[') ) {s = 20;}

                        else if ( (LA19_0==']') ) {s = 21;}

                        else if ( (LA19_0=='(') ) {s = 22;}

                        else if ( (LA19_0=='e') ) {s = 23;}

                        else if ( (LA19_0=='{') ) {s = 24;}

                        else if ( (LA19_0=='}') ) {s = 25;}

                        else if ( (LA19_0==':') ) {s = 26;}

                        else if ( (LA19_0=='d') ) {s = 27;}

                        else if ( (LA19_0=='c') ) {s = 28;}

                        else if ( (LA19_0=='w') ) {s = 29;}

                        else if ( (LA19_0==';') ) {s = 30;}

                        else if ( (LA19_0=='n') ) {s = 31;}

                        else if ( (LA19_0=='t') ) {s = 32;}

                        else if ( (LA19_0=='r') ) {s = 33;}

                        else if ( (LA19_0=='?') ) {s = 34;}

                        else if ( (LA19_0=='F') ) {s = 35;}

                        else if ( (LA19_0=='S') ) {s = 36;}

                        else if ( (LA19_0=='G') ) {s = 37;}

                        else if ( (LA19_0=='W') ) {s = 38;}

                        else if ( (LA19_0=='T') ) {s = 39;}

                        else if ( (LA19_0=='^') ) {s = 40;}

                        else if ( (LA19_0=='$'||(LA19_0>='A' && LA19_0<='E')||(LA19_0>='H' && LA19_0<='R')||(LA19_0>='U' && LA19_0<='V')||(LA19_0>='X' && LA19_0<='Z')||LA19_0=='_'||LA19_0=='b'||(LA19_0>='g' && LA19_0<='h')||(LA19_0>='j' && LA19_0<='m')||(LA19_0>='o' && LA19_0<='q')||LA19_0=='u'||(LA19_0>='x' && LA19_0<='z')) ) {s = 41;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 42;}

                        else if ( (LA19_0=='\"') ) {s = 43;}

                        else if ( (LA19_0=='\'') ) {s = 44;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 45;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='#'||LA19_0=='@'||LA19_0=='\\'||LA19_0=='`'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 46;}

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