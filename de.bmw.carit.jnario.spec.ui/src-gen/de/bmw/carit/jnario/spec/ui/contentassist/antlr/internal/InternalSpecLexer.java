package de.bmw.carit.jnario.spec.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecLexer extends Lexer {
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=12;
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__21=21;
    public static final int RULE_COMMENT_RICH_TEXT_END=14;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_EXAMPLE_ROW_END=7;
    public static final int RULE_RICH_TEXT_END=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int RULE_PIPE_SPACES=5;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_IN_RICH_STRING=16;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=17;
    public static final int RULE_STRING=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_RICH_TEXT_START=10;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int RULE_RICH_TEXT=9;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_INT=15;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=18;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_PIPE=4;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RICH_TEXT_INBETWEEN=11;
    public static final int RULE_WS=19;

    // delegates
    // delegators

    public InternalSpecLexer() {;} 
    public InternalSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:11:7: ( '=' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:11:9: '='
            {
            match('='); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:12:7: ( '+=' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:12:9: '+='
            {
            match("+="); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:13:7: ( '||' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:13:9: '||'
            {
            match("||"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:14:7: ( '&&' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:14:9: '&&'
            {
            match("&&"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:15:7: ( 'extends' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:15:9: 'extends'
            {
            match("extends"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:16:7: ( 'super' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:16:9: 'super'
            {
            match("super"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:17:7: ( 'def' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:17:9: 'def'
            {
            match("def"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:18:7: ( 'create' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:18:9: 'create'
            {
            match("create"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:19:7: ( '==' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:19:9: '=='
            {
            match("=="); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:20:7: ( '!=' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:20:9: '!='
            {
            match("!="); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:21:7: ( '>=' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:21:9: '>='
            {
            match(">="); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:22:7: ( '<=' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:22:9: '<='
            {
            match("<="); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:23:7: ( '>' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:23:9: '>'
            {
            match('>'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:24:7: ( '<' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:24:9: '<'
            {
            match('<'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25:7: ( '->' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25:9: '->'
            {
            match("->"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:26:7: ( '..' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:26:9: '..'
            {
            match(".."); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27:7: ( '+' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27:9: '+'
            {
            match('+'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:28:7: ( '-' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:28:9: '-'
            {
            match('-'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:29:7: ( '*' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:29:9: '*'
            {
            match('*'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:30:7: ( '**' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:30:9: '**'
            {
            match("**"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:31:7: ( '/' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:31:9: '/'
            {
            match('/'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32:7: ( '%' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32:9: '%'
            {
            match('%'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:33:7: ( '!' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:33:9: '!'
            {
            match('!'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:34:7: ( '.' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:34:9: '.'
            {
            match('.'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:35:7: ( 'val' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:35:9: 'val'
            {
            match("val"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:36:7: ( 'false' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:36:9: 'false'
            {
            match("false"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:37:7: ( 'package' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:37:9: 'package'
            {
            match("package"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:38:7: ( '{' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:38:9: '{'
            {
            match('{'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:39:7: ( '}' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:39:9: '}'
            {
            match('}'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:40:7: ( '(' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:40:9: '('
            {
            match('('); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:41:7: ( ')' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:41:9: ')'
            {
            match(')'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:42:7: ( ',' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:42:9: ','
            {
            match(','); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:43:7: ( '[]' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:43:9: '[]'
            {
            match("[]"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:44:7: ( '?' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:44:9: '?'
            {
            match('?'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:45:7: ( 'throws' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:45:9: 'throws'
            {
            match("throws"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:46:7: ( 'example' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:46:9: 'example'
            {
            match("example"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:47:7: ( 'import' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:47:9: 'import'
            {
            match("import"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:48:7: ( 'public' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:48:9: 'public'
            {
            match("public"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:49:7: ( 'class' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:49:9: 'class'
            {
            match("class"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:50:7: ( 'implements' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:50:9: 'implements'
            {
            match("implements"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:51:7: ( ':' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:51:9: ':'
            {
            match(':'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:52:7: ( 'FOR' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:52:9: 'FOR'
            {
            match("FOR"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:53:7: ( 'ENDFOR' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:53:9: 'ENDFOR'
            {
            match("ENDFOR"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:54:7: ( 'BEFORE' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:54:9: 'BEFORE'
            {
            match("BEFORE"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:55:7: ( 'SEPARATOR' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:55:9: 'SEPARATOR'
            {
            match("SEPARATOR"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:56:7: ( 'AFTER' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:56:9: 'AFTER'
            {
            match("AFTER"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:57:7: ( 'IF' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:57:9: 'IF'
            {
            match("IF"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:58:7: ( 'ENDIF' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:58:9: 'ENDIF'
            {
            match("ENDIF"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:59:7: ( 'ELSE' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:59:9: 'ELSE'
            {
            match("ELSE"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:60:7: ( 'ELSEIF' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:60:9: 'ELSEIF'
            {
            match("ELSEIF"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:61:7: ( '@' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:61:9: '@'
            {
            match('@'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:62:7: ( 'instanceof' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:62:9: 'instanceof'
            {
            match("instanceof"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:63:7: ( 'as' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:63:9: 'as'
            {
            match("as"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:64:7: ( '[' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:64:9: '['
            {
            match('['); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:65:7: ( ']' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:65:9: ']'
            {
            match(']'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:66:7: ( ';' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:66:9: ';'
            {
            match(';'); 

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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:67:7: ( 'if' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:67:9: 'if'
            {
            match("if"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:68:7: ( 'else' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:68:9: 'else'
            {
            match("else"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:69:7: ( 'switch' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:69:9: 'switch'
            {
            match("switch"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:70:7: ( 'default' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:70:9: 'default'
            {
            match("default"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:71:7: ( 'case' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:71:9: 'case'
            {
            match("case"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:72:7: ( 'for' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:72:9: 'for'
            {
            match("for"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:73:7: ( 'while' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:73:9: 'while'
            {
            match("while"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:74:7: ( 'do' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:74:9: 'do'
            {
            match("do"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:75:7: ( '::' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:75:9: '::'
            {
            match("::"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:76:7: ( 'new' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:76:9: 'new'
            {
            match("new"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:77:7: ( 'null' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:77:9: 'null'
            {
            match("null"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:78:7: ( 'typeof' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:78:9: 'typeof'
            {
            match("typeof"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:79:7: ( 'throw' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:79:9: 'throw'
            {
            match("throw"); 


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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:80:7: ( 'return' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:80:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:81:7: ( 'try' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:81:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:82:7: ( 'finally' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:82:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:83:7: ( 'catch' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:83:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:84:7: ( '=>' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:84:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:85:7: ( '&' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:85:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:86:7: ( 'describe' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:86:9: 'describe'
            {
            match("describe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:87:7: ( 'it' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:87:9: 'it'
            {
            match("it"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:88:7: ( 'context' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:88:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:89:7: ( 'extension' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:89:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:90:8: ( 'static' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:90:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:91:8: ( 'override' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:91:10: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:92:8: ( 'dispatch' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:92:10: 'dispatch'
            {
            match("dispatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:93:8: ( '?.' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:93:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:94:8: ( '*.' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:94:10: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:95:8: ( 'var' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:95:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:96:8: ( 'true' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:96:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "RULE_PIPE"
    public final void mRULE_PIPE() throws RecognitionException {
        try {
            int _type = RULE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25405:11: ( '|' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25405:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE"

    // $ANTLR start "RULE_PIPE_SPACES"
    public final void mRULE_PIPE_SPACES() throws RecognitionException {
        try {
            int _type = RULE_PIPE_SPACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25407:18: ( RULE_PIPE ( ' ' | '\\t' )+ )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25407:20: RULE_PIPE ( ' ' | '\\t' )+
            {
            mRULE_PIPE(); 
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25407:30: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE_SPACES"

    // $ANTLR start "RULE_EXAMPLE_ROW_END"
    public final void mRULE_EXAMPLE_ROW_END() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_ROW_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25409:22: ( ( RULE_PIPE | RULE_PIPE_SPACES ) ( '\\r' )? '\\n' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25409:24: ( RULE_PIPE | RULE_PIPE_SPACES ) ( '\\r' )? '\\n'
            {
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25409:24: ( RULE_PIPE | RULE_PIPE_SPACES )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='|') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\t'||LA2_1==' ') ) {
                    alt2=2;
                }
                else if ( (LA2_1=='\n'||LA2_1=='\r') ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25409:25: RULE_PIPE
                    {
                    mRULE_PIPE(); 

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25409:35: RULE_PIPE_SPACES
                    {
                    mRULE_PIPE_SPACES(); 

                    }
                    break;

            }

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25409:53: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25409:53: '\\r'
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
    // $ANTLR end "RULE_EXAMPLE_ROW_END"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25411:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:27: ( RULE_IN_RICH_STRING )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\'') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='\'') ) {
                        int LA7_4 = input.LA(3);

                        if ( ((LA7_4>='\u0000' && LA7_4<='&')||(LA7_4>='(' && LA7_4<='\u00B3')||(LA7_4>='\u00B5' && LA7_4<='\uFFFF')) ) {
                            alt7=1;
                        }


                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='&')||(LA7_1>='(' && LA7_1<='\u00B3')||(LA7_1>='\u00B5' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='\u00B3')||(LA7_0>='\u00B5' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\'') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='\'') ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3=='\'') ) {
                        alt10=1;
                    }
                    else {
                        alt10=2;}
                }
                else {
                    alt10=2;}
            }
            else {
                alt10=2;}
            switch (alt10) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:58: ( '\\'' ( '\\'' )? )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\'') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:64: ( '\\'' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='\'') ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25413:64: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

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
    // $ANTLR end "RULE_RICH_TEXT"

    // $ANTLR start "RULE_RICH_TEXT_START"
    public final void mRULE_RICH_TEXT_START() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25415:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00B4' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25415:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00B4'
            {
            match("'''"); 

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25415:33: ( RULE_IN_RICH_STRING )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\'') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='\'') ) {
                        int LA11_4 = input.LA(3);

                        if ( ((LA11_4>='\u0000' && LA11_4<='&')||(LA11_4>='(' && LA11_4<='\u00B3')||(LA11_4>='\u00B5' && LA11_4<='\uFFFF')) ) {
                            alt11=1;
                        }


                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='&')||(LA11_1>='(' && LA11_1<='\u00B3')||(LA11_1>='\u00B5' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='\u00B3')||(LA11_0>='\u00B5' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25415:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25415:54: ( '\\'' ( '\\'' )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\'') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25415:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25415:60: ( '\\'' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\'') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25415:60: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00B4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_START"

    // $ANTLR start "RULE_RICH_TEXT_END"
    public final void mRULE_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:20: ( '\\u00AA' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:22: '\\u00AA' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00AA'); 
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:31: ( RULE_IN_RICH_STRING )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\'') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='\'') ) {
                        int LA14_4 = input.LA(3);

                        if ( ((LA14_4>='\u0000' && LA14_4<='&')||(LA14_4>='(' && LA14_4<='\u00B3')||(LA14_4>='\u00B5' && LA14_4<='\uFFFF')) ) {
                            alt14=1;
                        }


                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='&')||(LA14_1>='(' && LA14_1<='\u00B3')||(LA14_1>='\u00B5' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='\u00B3')||(LA14_0>='\u00B5' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\'') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='\'') ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3=='\'') ) {
                        alt17=1;
                    }
                    else {
                        alt17=2;}
                }
                else {
                    alt17=2;}
            }
            else {
                alt17=2;}
            switch (alt17) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:62: ( '\\'' ( '\\'' )? )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\'') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:68: ( '\\'' )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='\'') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25417:68: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

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
    // $ANTLR end "RULE_RICH_TEXT_END"

    // $ANTLR start "RULE_RICH_TEXT_INBETWEEN"
    public final void mRULE_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25419:26: ( '\\u00AA' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00B4' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25419:28: '\\u00AA' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00B4'
            {
            match('\u00AA'); 
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25419:37: ( RULE_IN_RICH_STRING )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\'') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='\'') ) {
                        int LA18_4 = input.LA(3);

                        if ( ((LA18_4>='\u0000' && LA18_4<='&')||(LA18_4>='(' && LA18_4<='\u00B3')||(LA18_4>='\u00B5' && LA18_4<='\uFFFF')) ) {
                            alt18=1;
                        }


                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='&')||(LA18_1>='(' && LA18_1<='\u00B3')||(LA18_1>='\u00B5' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='\u00B3')||(LA18_0>='\u00B5' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25419:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25419:58: ( '\\'' ( '\\'' )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\'') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25419:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25419:64: ( '\\'' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\'') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25419:64: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00B4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_INBETWEEN"
    public final void mRULE_COMMENT_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:34: ( '\\u00B4\\u00B4' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00B4' )? )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:36: '\\u00B4\\u00B4' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00B4' )?
            {
            match("\u00B4\u00B4"); 

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:51: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:51: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
                }
            } while (true);

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:67: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00B4' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\n'||LA26_0=='\r') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:68: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00B4'
                    {
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:68: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:68: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:79: ( RULE_IN_RICH_STRING )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\'') ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1=='\'') ) {
                                int LA23_4 = input.LA(3);

                                if ( ((LA23_4>='\u0000' && LA23_4<='&')||(LA23_4>='(' && LA23_4<='\u00B3')||(LA23_4>='\u00B5' && LA23_4<='\uFFFF')) ) {
                                    alt23=1;
                                }


                            }
                            else if ( ((LA23_1>='\u0000' && LA23_1<='&')||(LA23_1>='(' && LA23_1<='\u00B3')||(LA23_1>='\u00B5' && LA23_1<='\uFFFF')) ) {
                                alt23=1;
                            }


                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='&')||(LA23_0>='(' && LA23_0<='\u00B3')||(LA23_0>='\u00B5' && LA23_0<='\uFFFF')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:79: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:100: ( '\\'' ( '\\'' )? )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='\'') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:101: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:106: ( '\\'' )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0=='\'') ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25421:106: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match('\u00B4'); 

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
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_END"
    public final void mRULE_COMMENT_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:28: ( '\\u00B4\\u00B4' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:30: '\\u00B4\\u00B4' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00B4\u00B4"); 

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:45: (~ ( ( '\\n' | '\\r' ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:45: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop27;
                }
            } while (true);

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:61: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\n'||LA33_0=='\r') ) {
                alt33=1;
            }
            else {
                alt33=2;}
            switch (alt33) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:62: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:62: ( '\\r' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='\r') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:62: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:73: ( RULE_IN_RICH_STRING )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\'') ) {
                            int LA29_1 = input.LA(2);

                            if ( (LA29_1=='\'') ) {
                                int LA29_4 = input.LA(3);

                                if ( ((LA29_4>='\u0000' && LA29_4<='&')||(LA29_4>='(' && LA29_4<='\u00B3')||(LA29_4>='\u00B5' && LA29_4<='\uFFFF')) ) {
                                    alt29=1;
                                }


                            }
                            else if ( ((LA29_1>='\u0000' && LA29_1<='&')||(LA29_1>='(' && LA29_1<='\u00B3')||(LA29_1>='\u00B5' && LA29_1<='\uFFFF')) ) {
                                alt29=1;
                            }


                        }
                        else if ( ((LA29_0>='\u0000' && LA29_0<='&')||(LA29_0>='(' && LA29_0<='\u00B3')||(LA29_0>='\u00B5' && LA29_0<='\uFFFF')) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:73: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:94: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0=='\'') ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1=='\'') ) {
                            int LA32_3 = input.LA(3);

                            if ( (LA32_3=='\'') ) {
                                alt32=1;
                            }
                            else {
                                alt32=2;}
                        }
                        else {
                            alt32=2;}
                    }
                    else {
                        alt32=2;}
                    switch (alt32) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:95: '\\'\\'\\''
                            {
                            match("'''"); 


                            }
                            break;
                        case 2 :
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:104: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:104: ( '\\'' ( '\\'' )? )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0=='\'') ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:105: '\\'' ( '\\'' )?
                                    {
                                    match('\''); 
                                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:110: ( '\\'' )?
                                    int alt30=2;
                                    int LA30_0 = input.LA(1);

                                    if ( (LA30_0=='\'') ) {
                                        alt30=1;
                                    }
                                    switch (alt30) {
                                        case 1 :
                                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:110: '\\''
                                            {
                                            match('\''); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            match(EOF); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25423:123: EOF
                    {
                    match(EOF); 

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
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_END"

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        try {
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25425:30: ( ( '\\'\\'' ~ ( ( '\\u00B4' | '\\'' ) ) | '\\'' ~ ( ( '\\u00B4' | '\\'' ) ) | ~ ( ( '\\u00B4' | '\\'' ) ) ) )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25425:32: ( '\\'\\'' ~ ( ( '\\u00B4' | '\\'' ) ) | '\\'' ~ ( ( '\\u00B4' | '\\'' ) ) | ~ ( ( '\\u00B4' | '\\'' ) ) )
            {
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25425:32: ( '\\'\\'' ~ ( ( '\\u00B4' | '\\'' ) ) | '\\'' ~ ( ( '\\u00B4' | '\\'' ) ) | ~ ( ( '\\u00B4' | '\\'' ) ) )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\'') ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1=='\'') ) {
                    alt34=1;
                }
                else if ( ((LA34_1>='\u0000' && LA34_1<='&')||(LA34_1>='(' && LA34_1<='\u00B3')||(LA34_1>='\u00B5' && LA34_1<='\uFFFF')) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA34_0>='\u0000' && LA34_0<='&')||(LA34_0>='(' && LA34_0<='\u00B3')||(LA34_0>='\u00B5' && LA34_0<='\uFFFF')) ) {
                alt34=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25425:33: '\\'\\'' ~ ( ( '\\u00B4' | '\\'' ) )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00B3')||(input.LA(1)>='\u00B5' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25425:59: '\\'' ~ ( ( '\\u00B4' | '\\'' ) )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00B3')||(input.LA(1)>='\u00B5' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25425:83: ~ ( ( '\\u00B4' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00B3')||(input.LA(1)>='\u00B5' && input.LA(1)<='\uFFFF') ) {
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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_RICH_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25427:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25427:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25427:11: ( '^' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='^') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25427:11: '^'
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

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25427:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='$'||(LA36_0>='0' && LA36_0<='9')||(LA36_0>='A' && LA36_0<='Z')||LA36_0=='_'||(LA36_0>='a' && LA36_0<='z')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
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
            	    break loop36;
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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25429:10: ( ( '0' .. '9' )+ )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25429:12: ( '0' .. '9' )+
            {
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25429:12: ( '0' .. '9' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='0' && LA37_0<='9')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25429:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25431:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25431:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25431:24: ( options {greedy=false; } : . )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0=='*') ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1=='/') ) {
                        alt38=2;
                    }
                    else if ( ((LA38_1>='\u0000' && LA38_1<='.')||(LA38_1>='0' && LA38_1<='\uFFFF')) ) {
                        alt38=1;
                    }


                }
                else if ( ((LA38_0>='\u0000' && LA38_0<=')')||(LA38_0>='+' && LA38_0<='\uFFFF')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25431:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop38;
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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25433:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25433:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25433:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='\u0000' && LA39_0<='\t')||(LA39_0>='\u000B' && LA39_0<='\f')||(LA39_0>='\u000E' && LA39_0<='\uFFFF')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25433:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop39;
                }
            } while (true);

            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25433:40: ( ( '\\r' )? '\\n' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\n'||LA41_0=='\r') ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25433:41: ( '\\r' )? '\\n'
                    {
                    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25433:41: ( '\\r' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='\r') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25433:41: '\\r'
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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25435:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25435:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25435:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='\t' && LA42_0<='\n')||LA42_0=='\r'||LA42_0==' ') ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
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
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
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
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25437:16: ( . )
            // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25437:18: .
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
        // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | RULE_PIPE | RULE_PIPE_SPACES | RULE_EXAMPLE_ROW_END | RULE_STRING | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt43=102;
        alt43 = dfa43.predict(input);
        switch (alt43) {
            case 1 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:166: T__47
                {
                mT__47(); 

                }
                break;
            case 28 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:172: T__48
                {
                mT__48(); 

                }
                break;
            case 29 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:178: T__49
                {
                mT__49(); 

                }
                break;
            case 30 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:184: T__50
                {
                mT__50(); 

                }
                break;
            case 31 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:190: T__51
                {
                mT__51(); 

                }
                break;
            case 32 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:196: T__52
                {
                mT__52(); 

                }
                break;
            case 33 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:202: T__53
                {
                mT__53(); 

                }
                break;
            case 34 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:208: T__54
                {
                mT__54(); 

                }
                break;
            case 35 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:214: T__55
                {
                mT__55(); 

                }
                break;
            case 36 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:220: T__56
                {
                mT__56(); 

                }
                break;
            case 37 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:226: T__57
                {
                mT__57(); 

                }
                break;
            case 38 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:232: T__58
                {
                mT__58(); 

                }
                break;
            case 39 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:238: T__59
                {
                mT__59(); 

                }
                break;
            case 40 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:244: T__60
                {
                mT__60(); 

                }
                break;
            case 41 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:250: T__61
                {
                mT__61(); 

                }
                break;
            case 42 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:256: T__62
                {
                mT__62(); 

                }
                break;
            case 43 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:262: T__63
                {
                mT__63(); 

                }
                break;
            case 44 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:268: T__64
                {
                mT__64(); 

                }
                break;
            case 45 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:274: T__65
                {
                mT__65(); 

                }
                break;
            case 46 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:280: T__66
                {
                mT__66(); 

                }
                break;
            case 47 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:286: T__67
                {
                mT__67(); 

                }
                break;
            case 48 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:292: T__68
                {
                mT__68(); 

                }
                break;
            case 49 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:298: T__69
                {
                mT__69(); 

                }
                break;
            case 50 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:304: T__70
                {
                mT__70(); 

                }
                break;
            case 51 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:310: T__71
                {
                mT__71(); 

                }
                break;
            case 52 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:316: T__72
                {
                mT__72(); 

                }
                break;
            case 53 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:322: T__73
                {
                mT__73(); 

                }
                break;
            case 54 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:328: T__74
                {
                mT__74(); 

                }
                break;
            case 55 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:334: T__75
                {
                mT__75(); 

                }
                break;
            case 56 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:340: T__76
                {
                mT__76(); 

                }
                break;
            case 57 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:346: T__77
                {
                mT__77(); 

                }
                break;
            case 58 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:352: T__78
                {
                mT__78(); 

                }
                break;
            case 59 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:358: T__79
                {
                mT__79(); 

                }
                break;
            case 60 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:364: T__80
                {
                mT__80(); 

                }
                break;
            case 61 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:370: T__81
                {
                mT__81(); 

                }
                break;
            case 62 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:376: T__82
                {
                mT__82(); 

                }
                break;
            case 63 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:382: T__83
                {
                mT__83(); 

                }
                break;
            case 64 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:388: T__84
                {
                mT__84(); 

                }
                break;
            case 65 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:394: T__85
                {
                mT__85(); 

                }
                break;
            case 66 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:400: T__86
                {
                mT__86(); 

                }
                break;
            case 67 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:406: T__87
                {
                mT__87(); 

                }
                break;
            case 68 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:412: T__88
                {
                mT__88(); 

                }
                break;
            case 69 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:418: T__89
                {
                mT__89(); 

                }
                break;
            case 70 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:424: T__90
                {
                mT__90(); 

                }
                break;
            case 71 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:430: T__91
                {
                mT__91(); 

                }
                break;
            case 72 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:436: T__92
                {
                mT__92(); 

                }
                break;
            case 73 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:442: T__93
                {
                mT__93(); 

                }
                break;
            case 74 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:448: T__94
                {
                mT__94(); 

                }
                break;
            case 75 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:454: T__95
                {
                mT__95(); 

                }
                break;
            case 76 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:460: T__96
                {
                mT__96(); 

                }
                break;
            case 77 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:466: T__97
                {
                mT__97(); 

                }
                break;
            case 78 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:472: T__98
                {
                mT__98(); 

                }
                break;
            case 79 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:478: T__99
                {
                mT__99(); 

                }
                break;
            case 80 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:484: T__100
                {
                mT__100(); 

                }
                break;
            case 81 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:491: T__101
                {
                mT__101(); 

                }
                break;
            case 82 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:498: T__102
                {
                mT__102(); 

                }
                break;
            case 83 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:505: T__103
                {
                mT__103(); 

                }
                break;
            case 84 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:512: T__104
                {
                mT__104(); 

                }
                break;
            case 85 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:519: T__105
                {
                mT__105(); 

                }
                break;
            case 86 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:526: T__106
                {
                mT__106(); 

                }
                break;
            case 87 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:533: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 88 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:543: RULE_PIPE_SPACES
                {
                mRULE_PIPE_SPACES(); 

                }
                break;
            case 89 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:560: RULE_EXAMPLE_ROW_END
                {
                mRULE_EXAMPLE_ROW_END(); 

                }
                break;
            case 90 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:581: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 91 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:593: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 92 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:608: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 93 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:629: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 94 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:648: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 95 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:673: RULE_COMMENT_RICH_TEXT_INBETWEEN
                {
                mRULE_COMMENT_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 96 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:706: RULE_COMMENT_RICH_TEXT_END
                {
                mRULE_COMMENT_RICH_TEXT_END(); 

                }
                break;
            case 97 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:733: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 98 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:741: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 99 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:750: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 100 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:766: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 101 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:782: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 102 :
                // ../de.bmw.carit.jnario.spec.ui/src-gen/de/bmw/carit/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:790: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA43_eotS =
        "\1\uffff\1\67\1\71\1\73\1\77\4\102\1\116\1\120\1\122\1\124\1\126"+
        "\1\131\1\134\1\uffff\3\102\5\uffff\1\152\1\154\2\102\1\165\6\102"+
        "\1\uffff\1\102\2\uffff\4\102\2\64\1\u008b\2\64\13\uffff\1\u008f"+
        "\3\uffff\2\102\1\uffff\4\102\1\u0098\5\102\21\uffff\6\102\11\uffff"+
        "\5\102\1\u00ac\1\u00ad\2\uffff\6\102\1\u00b4\1\uffff\1\u00b5\2\uffff"+
        "\5\102\1\uffff\1\u0086\2\u008b\2\uffff\1\u00c1\3\uffff\6\102\1\u00c9"+
        "\1\102\1\uffff\6\102\1\u00d1\1\u00d2\1\102\1\u00d4\5\102\1\u00da"+
        "\3\102\2\uffff\1\u00df\5\102\2\uffff\1\102\1\u00e7\3\102\1\u00ed"+
        "\2\u008b\1\u00c1\1\uffff\1\u00f2\1\uffff\2\102\1\u00f5\4\102\1\uffff"+
        "\4\102\1\u00fe\2\102\2\uffff\1\102\1\uffff\5\102\1\uffff\1\u0107"+
        "\3\102\1\uffff\2\102\1\u010e\4\102\1\uffff\1\u0113\2\102\2\u00ed"+
        "\2\uffff\1\u008b\2\u00f2\1\uffff\2\102\1\uffff\1\u011d\6\102\1\u0124"+
        "\1\uffff\1\u0125\1\102\1\u0127\3\102\1\u012c\1\102\1\uffff\4\102"+
        "\1\u0132\1\102\1\uffff\2\102\1\u0136\1\u0137\1\uffff\2\102\2\u00ed"+
        "\2\u00f2\3\102\1\uffff\1\u013f\1\u0140\3\102\1\u0144\2\uffff\1\102"+
        "\1\uffff\2\102\1\u0148\1\u0149\1\uffff\1\u014a\1\u014b\2\102\1\u014e"+
        "\1\uffff\1\u014f\1\u0150\1\102\2\uffff\1\u0152\1\102\1\u00ed\1\u00f2"+
        "\1\u0154\1\102\1\u0156\2\uffff\1\u0157\2\102\1\uffff\1\u015a\1\u015b"+
        "\1\u015c\4\uffff\2\102\3\uffff\1\102\1\uffff\1\102\1\uffff\1\102"+
        "\2\uffff\1\u0162\1\u0163\3\uffff\3\102\1\u0167\1\u0168\2\uffff\2"+
        "\102\1\u016b\2\uffff\1\u016c\1\u016d\3\uffff";
    static final String DFA43_eofS =
        "\u016e\uffff";
    static final String DFA43_minS =
        "\1\0\2\75\1\11\1\46\1\154\1\164\1\145\1\141\3\75\1\76\1\56\2\52"+
        "\1\uffff\3\141\5\uffff\1\135\1\56\1\150\1\146\1\72\1\117\1\114\2"+
        "\105\2\106\1\uffff\1\163\2\uffff\1\150\2\145\1\166\3\0\1\u00b4\1"+
        "\44\13\uffff\1\11\3\uffff\1\141\1\163\1\uffff\1\160\1\151\1\141"+
        "\1\146\1\44\1\163\1\145\1\141\1\163\1\156\21\uffff\2\154\1\162\1"+
        "\156\1\143\1\142\11\uffff\1\162\1\160\1\165\1\160\1\163\2\44\2\uffff"+
        "\1\122\1\104\1\123\1\106\1\120\1\124\1\44\1\uffff\1\44\2\uffff\1"+
        "\151\1\167\1\154\1\164\1\145\1\uffff\1\47\2\0\2\uffff\1\0\3\uffff"+
        "\1\145\1\155\2\145\2\164\1\44\1\143\1\uffff\1\160\1\141\1\163\1"+
        "\145\1\143\1\164\2\44\1\163\1\44\1\141\1\153\1\154\1\157\1\145\1"+
        "\44\1\145\1\154\1\164\2\uffff\1\44\1\106\1\105\1\117\1\101\1\105"+
        "\2\uffff\1\154\1\44\1\154\1\165\1\162\4\0\1\12\1\0\1\uffff\1\156"+
        "\1\160\1\44\1\162\1\143\1\151\1\165\1\uffff\1\162\1\141\1\164\1"+
        "\163\1\44\1\150\1\145\2\uffff\1\145\1\uffff\1\154\1\141\1\151\1"+
        "\167\1\157\1\uffff\1\44\1\162\1\145\1\141\1\uffff\1\117\1\106\1"+
        "\44\3\122\1\145\1\uffff\1\44\2\162\2\0\2\uffff\3\0\1\uffff\1\144"+
        "\1\154\1\uffff\1\44\1\150\1\143\1\154\1\151\1\164\1\145\1\44\1\uffff"+
        "\1\44\1\170\1\44\1\154\1\147\1\143\1\44\1\146\1\uffff\1\164\1\155"+
        "\1\156\1\122\1\44\1\106\1\uffff\1\105\1\101\2\44\1\uffff\1\156\1"+
        "\151\4\0\1\163\1\151\1\145\1\uffff\2\44\1\164\1\142\1\143\1\44\2"+
        "\uffff\1\164\1\uffff\1\171\1\145\2\44\1\uffff\2\44\1\145\1\143\1"+
        "\44\1\uffff\2\44\1\124\2\uffff\1\44\1\144\2\0\1\44\1\157\1\44\2"+
        "\uffff\1\44\1\145\1\150\1\uffff\3\44\4\uffff\1\156\1\145\3\uffff"+
        "\1\117\1\uffff\1\145\1\uffff\1\156\2\uffff\2\44\3\uffff\1\164\1"+
        "\157\1\122\2\44\2\uffff\1\163\1\146\1\44\2\uffff\2\44\3\uffff";
    static final String DFA43_maxS =
        "\1\uffff\1\76\1\75\1\174\1\46\1\170\1\167\1\157\1\162\3\75\1\76"+
        "\2\56\1\57\1\uffff\1\141\1\157\1\165\5\uffff\1\135\1\56\1\171\1"+
        "\164\1\72\1\117\1\116\2\105\2\106\1\uffff\1\163\2\uffff\1\150\1"+
        "\165\1\145\1\166\3\uffff\1\u00b4\1\172\13\uffff\1\40\3\uffff\1\164"+
        "\1\163\1\uffff\1\160\1\151\1\141\1\163\1\172\1\163\1\145\1\141\1"+
        "\164\1\156\21\uffff\1\162\1\154\1\162\1\156\1\143\1\142\11\uffff"+
        "\1\162\1\160\1\171\1\160\1\163\2\172\2\uffff\1\122\1\104\1\123\1"+
        "\106\1\120\1\124\1\172\1\uffff\1\172\2\uffff\1\151\1\167\1\154\1"+
        "\164\1\145\1\uffff\1\47\2\uffff\2\uffff\1\uffff\3\uffff\1\145\1"+
        "\155\2\145\2\164\1\172\1\143\1\uffff\1\160\1\141\1\163\1\145\1\143"+
        "\1\164\2\172\1\163\1\172\1\141\1\153\1\154\1\157\1\145\1\172\1\145"+
        "\1\157\1\164\2\uffff\1\172\1\111\1\105\1\117\1\101\1\105\2\uffff"+
        "\1\154\1\172\1\154\1\165\1\162\4\uffff\1\12\1\uffff\1\uffff\1\156"+
        "\1\160\1\172\1\162\1\143\1\151\1\165\1\uffff\1\162\1\141\1\164\1"+
        "\163\1\172\1\150\1\145\2\uffff\1\145\1\uffff\1\154\1\141\1\151\1"+
        "\167\1\157\1\uffff\1\172\1\162\1\145\1\141\1\uffff\1\117\1\106\1"+
        "\172\3\122\1\145\1\uffff\1\172\2\162\2\uffff\2\uffff\3\uffff\1\uffff"+
        "\1\163\1\154\1\uffff\1\172\1\150\1\143\1\154\1\151\1\164\1\145\1"+
        "\172\1\uffff\1\172\1\170\1\172\1\154\1\147\1\143\1\172\1\146\1\uffff"+
        "\1\164\1\155\1\156\1\122\1\172\1\106\1\uffff\1\105\1\101\2\172\1"+
        "\uffff\1\156\1\151\4\uffff\1\163\1\151\1\145\1\uffff\2\172\1\164"+
        "\1\142\1\143\1\172\2\uffff\1\164\1\uffff\1\171\1\145\2\172\1\uffff"+
        "\2\172\1\145\1\143\1\172\1\uffff\2\172\1\124\2\uffff\1\172\1\144"+
        "\2\uffff\1\172\1\157\1\172\2\uffff\1\172\1\145\1\150\1\uffff\3\172"+
        "\4\uffff\1\156\1\145\3\uffff\1\117\1\uffff\1\145\1\uffff\1\156\2"+
        "\uffff\2\172\3\uffff\1\164\1\157\1\122\2\172\2\uffff\1\163\1\146"+
        "\1\172\2\uffff\2\172\3\uffff";
    static final String DFA43_acceptS =
        "\20\uffff\1\26\3\uffff\1\34\1\35\1\36\1\37\1\40\13\uffff\1\63\1"+
        "\uffff\1\67\1\70\11\uffff\1\141\1\142\1\145\1\146\1\11\1\112\1\1"+
        "\1\2\1\21\1\3\1\127\1\uffff\1\131\1\4\1\113\2\uffff\1\141\12\uffff"+
        "\1\12\1\27\1\13\1\15\1\14\1\16\1\17\1\22\1\20\1\30\1\24\1\124\1"+
        "\23\1\143\1\144\1\25\1\26\6\uffff\1\34\1\35\1\36\1\37\1\40\1\41"+
        "\1\66\1\123\1\42\7\uffff\1\101\1\51\7\uffff\1\63\1\uffff\1\67\1"+
        "\70\5\uffff\1\132\3\uffff\1\136\1\135\1\uffff\1\142\1\145\1\130"+
        "\10\uffff\1\100\23\uffff\1\71\1\115\6\uffff\1\57\1\65\13\uffff\1"+
        "\137\7\uffff\1\7\7\uffff\1\31\1\125\1\uffff\1\76\5\uffff\1\107\4"+
        "\uffff\1\52\7\uffff\1\102\5\uffff\1\133\1\134\3\uffff\1\140\2\uffff"+
        "\1\72\10\uffff\1\75\10\uffff\1\126\6\uffff\1\61\4\uffff\1\103\11"+
        "\uffff\1\6\6\uffff\1\47\1\111\1\uffff\1\32\4\uffff\1\105\5\uffff"+
        "\1\60\3\uffff\1\56\1\77\7\uffff\1\73\1\120\3\uffff\1\10\3\uffff"+
        "\1\46\1\43\1\104\1\45\2\uffff\1\53\1\62\1\54\1\uffff\1\106\1\uffff"+
        "\1\5\1\uffff\1\44\1\74\2\uffff\1\116\1\110\1\33\5\uffff\1\114\1"+
        "\122\3\uffff\1\121\1\117\2\uffff\1\55\1\50\1\64";
    static final String DFA43_specialS =
        "\1\11\53\uffff\1\26\1\12\1\25\131\uffff\1\16\1\21\2\uffff\1\22\56"+
        "\uffff\1\24\1\13\1\20\1\2\1\uffff\1\14\52\uffff\1\4\1\23\2\uffff"+
        "\1\15\1\17\1\0\44\uffff\1\7\1\10\1\6\1\3\40\uffff\1\5\1\1\62\uffff}>";
    static final String[] DFA43_transitionS = {
            "\11\64\2\63\2\64\1\63\22\64\1\63\1\11\1\54\1\64\1\61\1\20\1"+
            "\4\1\55\1\26\1\27\1\16\1\2\1\30\1\14\1\15\1\17\12\62\1\35\1"+
            "\47\1\13\1\1\1\12\1\32\1\44\1\42\1\40\2\61\1\37\1\36\2\61\1"+
            "\43\11\61\1\41\7\61\1\31\1\64\1\46\1\60\1\61\1\64\1\45\1\61"+
            "\1\10\1\7\1\5\1\22\2\61\1\34\4\61\1\51\1\53\1\23\1\61\1\52\1"+
            "\6\1\33\1\61\1\21\1\50\3\61\1\24\1\3\1\25\54\64\1\56\11\64\1"+
            "\57\uff4b\64",
            "\1\65\1\66",
            "\1\70",
            "\1\74\1\75\2\uffff\1\75\22\uffff\1\74\133\uffff\1\72",
            "\1\76",
            "\1\101\13\uffff\1\100",
            "\1\105\1\103\1\uffff\1\104",
            "\1\106\3\uffff\1\110\5\uffff\1\107",
            "\1\113\12\uffff\1\112\2\uffff\1\114\2\uffff\1\111",
            "\1\115",
            "\1\117",
            "\1\121",
            "\1\123",
            "\1\125",
            "\1\127\3\uffff\1\130",
            "\1\132\4\uffff\1\133",
            "",
            "\1\136",
            "\1\137\7\uffff\1\141\5\uffff\1\140",
            "\1\142\23\uffff\1\143",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\153",
            "\1\155\11\uffff\1\157\6\uffff\1\156",
            "\1\162\6\uffff\1\160\1\161\5\uffff\1\163",
            "\1\164",
            "\1\166",
            "\1\170\1\uffff\1\167",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\176",
            "",
            "",
            "\1\u0081",
            "\1\u0082\17\uffff\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\0\u0086",
            "\47\u0086\1\u0087\uffd8\u0086",
            "\47\u0089\1\u0088\u008c\u0089\1\u008a\uff4b\u0089",
            "\1\u008c",
            "\1\102\34\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\2\uffff\1\75\22\uffff\1\74",
            "",
            "",
            "",
            "\1\u0091\22\uffff\1\u0090",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\14\uffff\1\u0097",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c\1\u009d",
            "\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009f\5\uffff\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a9\3\uffff\1\u00a8",
            "\1\u00aa",
            "\1\u00ab",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\47\u00bd\1\u00bc\u008c\u00bd\1\u008a\uff4b\u00bd",
            "\47\u0089\1\u0088\u008c\u0089\1\u008a\uff4b\u0089",
            "",
            "",
            "\12\u00be\1\u00c0\2\u00be\1\u00bf\ufff2\u00be",
            "",
            "",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\1\u00c8\31\102",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u00d3",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u00db",
            "\1\u00dd\2\uffff\1\u00dc",
            "\1\u00de",
            "",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u00e0\2\uffff\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "",
            "\1\u00e6",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\47\u00ec\1\u00eb\u008c\u00ec\1\u00ee\uff4b\u00ec",
            "\47\u00ef\1\uffff\u008c\u00ef\1\u008a\uff4b\u00ef",
            "\47\u0089\1\u0088\u008c\u0089\1\u008a\uff4b\u0089",
            "\12\u00be\1\u00c0\2\u00be\1\u00bf\ufff2\u00be",
            "\1\u00c0",
            "\47\u00f1\1\u00f0\u008c\u00f1\1\u00c1\uff4b\u00f1",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u00ff",
            "\1\u0100",
            "",
            "",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\102\13\uffff\12\102\7\uffff\10\102\1\u010d\21\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0114",
            "\1\u0115",
            "\47\u0117\1\u0116\u008c\u0117\1\u00ee\uff4b\u0117",
            "\47\u00ec\1\u00eb\u008c\u00ec\1\u00ee\uff4b\u00ec",
            "",
            "",
            "\47\u0089\1\u0088\u008c\u0089\1\u008a\uff4b\u0089",
            "\47\u0119\1\u0118\u008c\u0119\1\u00c1\uff4b\u0119",
            "\47\u00f1\1\u00f0\u008c\u00f1\1\u00c1\uff4b\u00f1",
            "",
            "\1\u011a\16\uffff\1\u011b",
            "\1\u011c",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0126",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\22\102\1\u012b\7\102",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u0138",
            "\1\u0139",
            "\47\u013a\1\uffff\u008c\u013a\1\u00ee\uff4b\u013a",
            "\47\u00ec\1\u00eb\u008c\u00ec\1\u00ee\uff4b\u00ec",
            "\47\u013b\1\uffff\u008c\u013b\1\u00c1\uff4b\u013b",
            "\47\u00f1\1\u00f0\u008c\u00f1\1\u00c1\uff4b\u00f1",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u014c",
            "\1\u014d",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0151",
            "",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0153",
            "\47\u00ec\1\u00eb\u008c\u00ec\1\u00ee\uff4b\u00ec",
            "\47\u00f1\1\u00f0\u008c\u00f1\1\u00c1\uff4b\u00f1",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0155",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0158",
            "\1\u0159",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "",
            "",
            "\1\u015d",
            "\1\u015e",
            "",
            "",
            "",
            "\1\u015f",
            "",
            "\1\u0160",
            "",
            "\1\u0161",
            "",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\13\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
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
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | RULE_PIPE | RULE_PIPE_SPACES | RULE_EXAMPLE_ROW_END | RULE_STRING | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_241 = input.LA(1);

                        s = -1;
                        if ( (LA43_241=='\'') ) {s = 240;}

                        else if ( ((LA43_241>='\u0000' && LA43_241<='&')||(LA43_241>='(' && LA43_241<='\u00B3')||(LA43_241>='\u00B5' && LA43_241<='\uFFFF')) ) {s = 241;}

                        else if ( (LA43_241=='\u00B4') ) {s = 193;}

                        else s = 242;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_315 = input.LA(1);

                        s = -1;
                        if ( (LA43_315=='\'') ) {s = 240;}

                        else if ( (LA43_315=='\u00B4') ) {s = 193;}

                        else if ( ((LA43_315>='\u0000' && LA43_315<='&')||(LA43_315>='(' && LA43_315<='\u00B3')||(LA43_315>='\u00B5' && LA43_315<='\uFFFF')) ) {s = 241;}

                        else s = 242;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_190 = input.LA(1);

                        s = -1;
                        if ( (LA43_190=='\r') ) {s = 191;}

                        else if ( (LA43_190=='\n') ) {s = 192;}

                        else if ( ((LA43_190>='\u0000' && LA43_190<='\t')||(LA43_190>='\u000B' && LA43_190<='\f')||(LA43_190>='\u000E' && LA43_190<='\uFFFF')) ) {s = 190;}

                        else s = 193;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_281 = input.LA(1);

                        s = -1;
                        if ( (LA43_281=='\'') ) {s = 240;}

                        else if ( (LA43_281=='\u00B4') ) {s = 193;}

                        else if ( ((LA43_281>='\u0000' && LA43_281<='&')||(LA43_281>='(' && LA43_281<='\u00B3')||(LA43_281>='\u00B5' && LA43_281<='\uFFFF')) ) {s = 241;}

                        else s = 242;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_235 = input.LA(1);

                        s = -1;
                        if ( (LA43_235=='\'') ) {s = 278;}

                        else if ( ((LA43_235>='\u0000' && LA43_235<='&')||(LA43_235>='(' && LA43_235<='\u00B3')||(LA43_235>='\u00B5' && LA43_235<='\uFFFF')) ) {s = 279;}

                        else if ( (LA43_235=='\u00B4') ) {s = 238;}

                        else s = 237;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_314 = input.LA(1);

                        s = -1;
                        if ( (LA43_314=='\'') ) {s = 235;}

                        else if ( (LA43_314=='\u00B4') ) {s = 238;}

                        else if ( ((LA43_314>='\u0000' && LA43_314<='&')||(LA43_314>='(' && LA43_314<='\u00B3')||(LA43_314>='\u00B5' && LA43_314<='\uFFFF')) ) {s = 236;}

                        else s = 237;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_280 = input.LA(1);

                        s = -1;
                        if ( ((LA43_280>='\u0000' && LA43_280<='&')||(LA43_280>='(' && LA43_280<='\u00B3')||(LA43_280>='\u00B5' && LA43_280<='\uFFFF')) ) {s = 315;}

                        else if ( (LA43_280=='\u00B4') ) {s = 193;}

                        else s = 242;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA43_278 = input.LA(1);

                        s = -1;
                        if ( ((LA43_278>='\u0000' && LA43_278<='&')||(LA43_278>='(' && LA43_278<='\u00B3')||(LA43_278>='\u00B5' && LA43_278<='\uFFFF')) ) {s = 314;}

                        else if ( (LA43_278=='\u00B4') ) {s = 238;}

                        else s = 237;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA43_279 = input.LA(1);

                        s = -1;
                        if ( (LA43_279=='\'') ) {s = 235;}

                        else if ( (LA43_279=='\u00B4') ) {s = 238;}

                        else if ( ((LA43_279>='\u0000' && LA43_279<='&')||(LA43_279>='(' && LA43_279<='\u00B3')||(LA43_279>='\u00B5' && LA43_279<='\uFFFF')) ) {s = 236;}

                        else s = 237;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA43_0 = input.LA(1);

                        s = -1;
                        if ( (LA43_0=='=') ) {s = 1;}

                        else if ( (LA43_0=='+') ) {s = 2;}

                        else if ( (LA43_0=='|') ) {s = 3;}

                        else if ( (LA43_0=='&') ) {s = 4;}

                        else if ( (LA43_0=='e') ) {s = 5;}

                        else if ( (LA43_0=='s') ) {s = 6;}

                        else if ( (LA43_0=='d') ) {s = 7;}

                        else if ( (LA43_0=='c') ) {s = 8;}

                        else if ( (LA43_0=='!') ) {s = 9;}

                        else if ( (LA43_0=='>') ) {s = 10;}

                        else if ( (LA43_0=='<') ) {s = 11;}

                        else if ( (LA43_0=='-') ) {s = 12;}

                        else if ( (LA43_0=='.') ) {s = 13;}

                        else if ( (LA43_0=='*') ) {s = 14;}

                        else if ( (LA43_0=='/') ) {s = 15;}

                        else if ( (LA43_0=='%') ) {s = 16;}

                        else if ( (LA43_0=='v') ) {s = 17;}

                        else if ( (LA43_0=='f') ) {s = 18;}

                        else if ( (LA43_0=='p') ) {s = 19;}

                        else if ( (LA43_0=='{') ) {s = 20;}

                        else if ( (LA43_0=='}') ) {s = 21;}

                        else if ( (LA43_0=='(') ) {s = 22;}

                        else if ( (LA43_0==')') ) {s = 23;}

                        else if ( (LA43_0==',') ) {s = 24;}

                        else if ( (LA43_0=='[') ) {s = 25;}

                        else if ( (LA43_0=='?') ) {s = 26;}

                        else if ( (LA43_0=='t') ) {s = 27;}

                        else if ( (LA43_0=='i') ) {s = 28;}

                        else if ( (LA43_0==':') ) {s = 29;}

                        else if ( (LA43_0=='F') ) {s = 30;}

                        else if ( (LA43_0=='E') ) {s = 31;}

                        else if ( (LA43_0=='B') ) {s = 32;}

                        else if ( (LA43_0=='S') ) {s = 33;}

                        else if ( (LA43_0=='A') ) {s = 34;}

                        else if ( (LA43_0=='I') ) {s = 35;}

                        else if ( (LA43_0=='@') ) {s = 36;}

                        else if ( (LA43_0=='a') ) {s = 37;}

                        else if ( (LA43_0==']') ) {s = 38;}

                        else if ( (LA43_0==';') ) {s = 39;}

                        else if ( (LA43_0=='w') ) {s = 40;}

                        else if ( (LA43_0=='n') ) {s = 41;}

                        else if ( (LA43_0=='r') ) {s = 42;}

                        else if ( (LA43_0=='o') ) {s = 43;}

                        else if ( (LA43_0=='\"') ) {s = 44;}

                        else if ( (LA43_0=='\'') ) {s = 45;}

                        else if ( (LA43_0=='\u00AA') ) {s = 46;}

                        else if ( (LA43_0=='\u00B4') ) {s = 47;}

                        else if ( (LA43_0=='^') ) {s = 48;}

                        else if ( (LA43_0=='$'||(LA43_0>='C' && LA43_0<='D')||(LA43_0>='G' && LA43_0<='H')||(LA43_0>='J' && LA43_0<='R')||(LA43_0>='T' && LA43_0<='Z')||LA43_0=='_'||LA43_0=='b'||(LA43_0>='g' && LA43_0<='h')||(LA43_0>='j' && LA43_0<='m')||LA43_0=='q'||LA43_0=='u'||(LA43_0>='x' && LA43_0<='z')) ) {s = 49;}

                        else if ( ((LA43_0>='0' && LA43_0<='9')) ) {s = 50;}

                        else if ( ((LA43_0>='\t' && LA43_0<='\n')||LA43_0=='\r'||LA43_0==' ') ) {s = 51;}

                        else if ( ((LA43_0>='\u0000' && LA43_0<='\b')||(LA43_0>='\u000B' && LA43_0<='\f')||(LA43_0>='\u000E' && LA43_0<='\u001F')||LA43_0=='#'||LA43_0=='\\'||LA43_0=='`'||(LA43_0>='~' && LA43_0<='\u00A9')||(LA43_0>='\u00AB' && LA43_0<='\u00B3')||(LA43_0>='\u00B5' && LA43_0<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA43_45 = input.LA(1);

                        s = -1;
                        if ( (LA43_45=='\'') ) {s = 135;}

                        else if ( ((LA43_45>='\u0000' && LA43_45<='&')||(LA43_45>='(' && LA43_45<='\uFFFF')) ) {s = 134;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA43_188 = input.LA(1);

                        s = -1;
                        if ( ((LA43_188>='\u0000' && LA43_188<='&')||(LA43_188>='(' && LA43_188<='\u00B3')||(LA43_188>='\u00B5' && LA43_188<='\uFFFF')) ) {s = 239;}

                        else if ( (LA43_188=='\u00B4') ) {s = 138;}

                        else s = 139;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA43_192 = input.LA(1);

                        s = -1;
                        if ( (LA43_192=='\'') ) {s = 240;}

                        else if ( ((LA43_192>='\u0000' && LA43_192<='&')||(LA43_192>='(' && LA43_192<='\u00B3')||(LA43_192>='\u00B5' && LA43_192<='\uFFFF')) ) {s = 241;}

                        else if ( (LA43_192=='\u00B4') ) {s = 193;}

                        else s = 242;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA43_239 = input.LA(1);

                        s = -1;
                        if ( (LA43_239=='\'') ) {s = 136;}

                        else if ( ((LA43_239>='\u0000' && LA43_239<='&')||(LA43_239>='(' && LA43_239<='\u00B3')||(LA43_239>='\u00B5' && LA43_239<='\uFFFF')) ) {s = 137;}

                        else if ( (LA43_239=='\u00B4') ) {s = 138;}

                        else s = 139;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA43_136 = input.LA(1);

                        s = -1;
                        if ( (LA43_136=='\'') ) {s = 188;}

                        else if ( ((LA43_136>='\u0000' && LA43_136<='&')||(LA43_136>='(' && LA43_136<='\u00B3')||(LA43_136>='\u00B5' && LA43_136<='\uFFFF')) ) {s = 189;}

                        else if ( (LA43_136=='\u00B4') ) {s = 138;}

                        else s = 139;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA43_240 = input.LA(1);

                        s = -1;
                        if ( (LA43_240=='\'') ) {s = 280;}

                        else if ( ((LA43_240>='\u0000' && LA43_240<='&')||(LA43_240>='(' && LA43_240<='\u00B3')||(LA43_240>='\u00B5' && LA43_240<='\uFFFF')) ) {s = 281;}

                        else if ( (LA43_240=='\u00B4') ) {s = 193;}

                        else s = 242;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA43_189 = input.LA(1);

                        s = -1;
                        if ( (LA43_189=='\'') ) {s = 136;}

                        else if ( ((LA43_189>='\u0000' && LA43_189<='&')||(LA43_189>='(' && LA43_189<='\u00B3')||(LA43_189>='\u00B5' && LA43_189<='\uFFFF')) ) {s = 137;}

                        else if ( (LA43_189=='\u00B4') ) {s = 138;}

                        else s = 139;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA43_137 = input.LA(1);

                        s = -1;
                        if ( (LA43_137=='\'') ) {s = 136;}

                        else if ( ((LA43_137>='\u0000' && LA43_137<='&')||(LA43_137>='(' && LA43_137<='\u00B3')||(LA43_137>='\u00B5' && LA43_137<='\uFFFF')) ) {s = 137;}

                        else if ( (LA43_137=='\u00B4') ) {s = 138;}

                        else s = 139;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA43_140 = input.LA(1);

                        s = -1;
                        if ( ((LA43_140>='\u0000' && LA43_140<='\t')||(LA43_140>='\u000B' && LA43_140<='\f')||(LA43_140>='\u000E' && LA43_140<='\uFFFF')) ) {s = 190;}

                        else if ( (LA43_140=='\r') ) {s = 191;}

                        else if ( (LA43_140=='\n') ) {s = 192;}

                        else s = 193;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA43_236 = input.LA(1);

                        s = -1;
                        if ( (LA43_236=='\'') ) {s = 235;}

                        else if ( (LA43_236=='\u00B4') ) {s = 238;}

                        else if ( ((LA43_236>='\u0000' && LA43_236<='&')||(LA43_236>='(' && LA43_236<='\u00B3')||(LA43_236>='\u00B5' && LA43_236<='\uFFFF')) ) {s = 236;}

                        else s = 237;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA43_187 = input.LA(1);

                        s = -1;
                        if ( (LA43_187=='\'') ) {s = 235;}

                        else if ( ((LA43_187>='\u0000' && LA43_187<='&')||(LA43_187>='(' && LA43_187<='\u00B3')||(LA43_187>='\u00B5' && LA43_187<='\uFFFF')) ) {s = 236;}

                        else if ( (LA43_187=='\u00B4') ) {s = 238;}

                        else s = 237;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA43_46 = input.LA(1);

                        s = -1;
                        if ( (LA43_46=='\'') ) {s = 136;}

                        else if ( ((LA43_46>='\u0000' && LA43_46<='&')||(LA43_46>='(' && LA43_46<='\u00B3')||(LA43_46>='\u00B5' && LA43_46<='\uFFFF')) ) {s = 137;}

                        else if ( (LA43_46=='\u00B4') ) {s = 138;}

                        else s = 139;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA43_44 = input.LA(1);

                        s = -1;
                        if ( ((LA43_44>='\u0000' && LA43_44<='\uFFFF')) ) {s = 134;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}