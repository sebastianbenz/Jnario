package org.jnario.feature.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureLexer extends Lexer {
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=21;
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=37;
    public static final int RULE_COMMENT_RICH_TEXT_END=23;
    public static final int EOF=-1;
    public static final int RULE_EXAMPLE_TEXT=28;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=5;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_EXAMPLE_ROW_END=31;
    public static final int RULE_SCENARIO_TEXT=12;
    public static final int RULE_RICH_TEXT_END=22;
    public static final int RULE_BACKGROUND_TEXT=11;
    public static final int RULE_MNL=25;
    public static final int RULE_DECIMAL=7;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_TEXT=10;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_PIPE_SPACES=30;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_IN_RICH_STRING=34;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=24;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__127=127;
    public static final int RULE_STRING=17;
    public static final int T__71=71;
    public static final int RULE_STEP_WITH_ARGS=27;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_RICH_TEXT_START=19;
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
    public static final int RULE_RICH_TEXT=18;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int RULE_THEN_TEXT=15;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
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
    public static final int RULE_WHEN_TEXT=14;
    public static final int RULE_GIVEN_TEXT=13;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int RULE_AT_SIGN=8;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=6;
    public static final int T__112=112;
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
    public static final int RULE_NL=33;
    public static final int RULE_SPACES=32;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=35;
    public static final int RULE_COLON=26;
    public static final int RULE_PIPE=29;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RICH_TEXT_INBETWEEN=20;
    public static final int RULE_WS=36;
    public static final int RULE_AND_TEXT=16;
    public static final int RULE_FEATURE_TEXT=9;

    // delegates
    // delegators

    public InternalFeatureLexer() {;} 
    public InternalFeatureLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFeatureLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g"; }

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:11:7: ( '=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:11:9: '='
            {
            match('='); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:12:7: ( '+=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:12:9: '+='
            {
            match("+="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:13:7: ( '||' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:13:9: '||'
            {
            match("||"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:14:7: ( '&&' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:14:9: '&&'
            {
            match("&&"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:15:7: ( 'var' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:15:9: 'var'
            {
            match("var"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:16:7: ( 'def' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:16:9: 'def'
            {
            match("def"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:17:7: ( 'throws' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:17:9: 'throws'
            {
            match("throws"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:18:7: ( 'create' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:18:9: 'create'
            {
            match("create"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:19:7: ( '==' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:19:9: '=='
            {
            match("=="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:20:7: ( '!=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:20:9: '!='
            {
            match("!="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:21:7: ( '>=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:21:9: '>='
            {
            match(">="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:22:7: ( '<=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:22:9: '<='
            {
            match("<="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:23:7: ( '>' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:23:9: '>'
            {
            match('>'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:24:7: ( '<' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:24:9: '<'
            {
            match('<'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:25:7: ( '->' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:25:9: '->'
            {
            match("->"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:26:7: ( '..' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:26:9: '..'
            {
            match(".."); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27:7: ( '=>' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27:9: '=>'
            {
            match("=>"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:28:7: ( '<>' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:28:9: '<>'
            {
            match("<>"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:29:7: ( '?:' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:29:9: '?:'
            {
            match("?:"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:30:7: ( '<=>' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:30:9: '<=>'
            {
            match("<=>"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:31:7: ( '+' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:31:9: '+'
            {
            match('+'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:32:7: ( '-' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:32:9: '-'
            {
            match('-'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:33:7: ( '*' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:33:9: '*'
            {
            match('*'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:34:7: ( '**' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:34:9: '**'
            {
            match("**"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:35:7: ( '/' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:35:9: '/'
            {
            match('/'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:36:7: ( '%' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:36:9: '%'
            {
            match('%'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:37:7: ( '!' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:37:9: '!'
            {
            match('!'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:38:7: ( '.' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:38:9: '.'
            {
            match('.'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:39:7: ( 'val' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:39:9: 'val'
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:40:7: ( 'super' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:40:9: 'super'
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:41:7: ( 'false' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:41:9: 'false'
            {
            match("false"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:42:7: ( 'public' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:42:9: 'public'
            {
            match("public"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:43:7: ( 'protected' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:43:9: 'protected'
            {
            match("protected"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:44:7: ( 'private' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:44:9: 'private'
            {
            match("private"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:45:7: ( 'package' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:45:9: 'package'
            {
            match("package"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:46:7: ( 'import' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:46:9: 'import'
            {
            match("import"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:47:7: ( ';' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:47:9: ';'
            {
            match(';'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:48:7: ( '(' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:48:9: '('
            {
            match('('); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:49:7: ( ')' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:49:9: ')'
            {
            match(')'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:50:7: ( ',' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:50:9: ','
            {
            match(','); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:51:7: ( 'should' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:51:9: 'should'
            {
            match("should"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:52:7: ( 'throw' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:52:9: 'throw'
            {
            match("throw"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:53:7: ( 'instanceof' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:53:9: 'instanceof'
            {
            match("instanceof"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:54:7: ( 'not' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:54:9: 'not'
            {
            match("not"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:55:7: ( 'assert' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:55:9: 'assert'
            {
            match("assert"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:56:7: ( 'class' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:56:9: 'class'
            {
            match("class"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:57:7: ( '{' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:57:9: '{'
            {
            match('{'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:58:7: ( '}' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:58:9: '}'
            {
            match('}'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:59:7: ( 'extends' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:59:9: 'extends'
            {
            match("extends"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:60:7: ( 'implements' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:60:9: 'implements'
            {
            match("implements"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:61:7: ( ':' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:61:9: ':'
            {
            match(':'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:62:7: ( 'FOR' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:62:9: 'FOR'
            {
            match("FOR"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:63:7: ( 'ENDFOR' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:63:9: 'ENDFOR'
            {
            match("ENDFOR"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:64:7: ( 'BEFORE' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:64:9: 'BEFORE'
            {
            match("BEFORE"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:65:7: ( 'SEPARATOR' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:65:9: 'SEPARATOR'
            {
            match("SEPARATOR"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:66:7: ( 'AFTER' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:66:9: 'AFTER'
            {
            match("AFTER"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:67:7: ( 'IF' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:67:9: 'IF'
            {
            match("IF"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:68:7: ( 'ENDIF' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:68:9: 'ENDIF'
            {
            match("ENDIF"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:69:7: ( 'ELSE' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:69:9: 'ELSE'
            {
            match("ELSE"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:70:7: ( 'ELSEIF' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:70:9: 'ELSEIF'
            {
            match("ELSEIF"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:71:7: ( 'as' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:71:9: 'as'
            {
            match("as"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:72:7: ( ']' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:72:9: ']'
            {
            match(']'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:73:8: ( '[' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:73:10: '['
            {
            match('['); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:74:8: ( 'if' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:74:10: 'if'
            {
            match("if"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:75:8: ( 'else' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:75:10: 'else'
            {
            match("else"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:76:8: ( 'switch' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:76:10: 'switch'
            {
            match("switch"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:77:8: ( 'default' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:77:10: 'default'
            {
            match("default"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:78:8: ( 'case' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:78:10: 'case'
            {
            match("case"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:79:8: ( 'for' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:79:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:80:8: ( 'while' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:80:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:81:8: ( 'do' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:81:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:82:8: ( '::' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:82:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:83:8: ( 'new' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:83:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:84:8: ( 'null' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:84:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:85:8: ( 'typeof' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:85:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:86:8: ( 'return' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:86:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:87:8: ( 'try' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:87:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:88:8: ( 'finally' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:88:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:89:8: ( 'catch' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:89:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:90:8: ( '?' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:90:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:91:8: ( '&' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:91:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:92:8: ( 'static' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:92:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:93:8: ( 'extension' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:93:10: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:94:8: ( 'override' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:94:10: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:95:8: ( 'dispatch' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:95:10: 'dispatch'
            {
            match("dispatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:96:8: ( 'abstract' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:96:10: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:97:8: ( '...' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:97:10: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:98:8: ( '?.' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:98:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:99:8: ( '*.' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:99:10: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:100:8: ( 'true' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:100:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27401:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27401:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27401:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27401:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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

    // $ANTLR start "RULE_AT_SIGN"
    public final void mRULE_AT_SIGN() throws RecognitionException {
        try {
            int _type = RULE_AT_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27403:14: ( '@' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27403:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT_SIGN"

    // $ANTLR start "RULE_BACKGROUND_TEXT"
    public final void mRULE_BACKGROUND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_BACKGROUND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27405:22: ( 'Background:' RULE_MNL )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27405:24: 'Background:' RULE_MNL
            {
            match("Background:"); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27407:20: ( 'Scenario:' RULE_MNL )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27407:22: 'Scenario:' RULE_MNL
            {
            match("Scenario:"); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCENARIO_TEXT"

    // $ANTLR start "RULE_FEATURE_TEXT"
    public final void mRULE_FEATURE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_FEATURE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27409:19: ( 'Feature' RULE_COLON ( options {greedy=false; } : . )* ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27409:21: 'Feature' RULE_COLON ( options {greedy=false; } : . )* ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT )
            {
            match("Feature"); 

            mRULE_COLON(); 
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27409:42: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27409:70: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27409:74: ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='B') ) {
                alt3=1;
            }
            else if ( (LA3_0=='S') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27409:75: RULE_BACKGROUND_TEXT
                    {
                    mRULE_BACKGROUND_TEXT(); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27409:96: RULE_SCENARIO_TEXT
                    {
                    mRULE_SCENARIO_TEXT(); 

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
    // $ANTLR end "RULE_FEATURE_TEXT"

    // $ANTLR start "RULE_GIVEN_TEXT"
    public final void mRULE_GIVEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_GIVEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27411:17: ( 'Given ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27411:19: 'Given ' RULE_STEP_WITH_ARGS
            {
            match("Given "); 

            mRULE_STEP_WITH_ARGS(); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27413:16: ( 'When ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27413:18: 'When ' RULE_STEP_WITH_ARGS
            {
            match("When "); 

            mRULE_STEP_WITH_ARGS(); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27415:16: ( 'Then ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27415:18: 'Then ' RULE_STEP_WITH_ARGS
            {
            match("Then "); 

            mRULE_STEP_WITH_ARGS(); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27417:15: ( 'And ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27417:17: 'And ' RULE_STEP_WITH_ARGS
            {
            match("And "); 

            mRULE_STEP_WITH_ARGS(); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27419:19: ( 'Examples' RULE_COLON RULE_MNL )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27419:21: 'Examples' RULE_COLON RULE_MNL
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

    // $ANTLR start "RULE_PIPE"
    public final void mRULE_PIPE() throws RecognitionException {
        try {
            int _type = RULE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27421:11: ( '|' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27421:13: '|'
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27423:18: ( RULE_PIPE ( ' ' | '\\t' )+ )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27423:20: RULE_PIPE ( ' ' | '\\t' )+
            {
            mRULE_PIPE(); 
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27423:30: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27425:22: ( ( RULE_PIPE | RULE_PIPE_SPACES ) ( '\\r' )? '\\n' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27425:24: ( RULE_PIPE | RULE_PIPE_SPACES ) ( '\\r' )? '\\n'
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27425:24: ( RULE_PIPE | RULE_PIPE_SPACES )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='|') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='\n'||LA5_1=='\r') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='\t'||LA5_1==' ') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27425:25: RULE_PIPE
                    {
                    mRULE_PIPE(); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27425:35: RULE_PIPE_SPACES
                    {
                    mRULE_PIPE_SPACES(); 

                    }
                    break;

            }

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27425:53: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27425:53: '\\r'
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

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27427:11: ( ( '____dummy____' )+ )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27427:13: ( '____dummy____' )+
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27427:13: ( '____dummy____' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='_') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27427:13: '____dummy____'
            	    {
            	    match("____dummy____"); 


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_STEP_WITH_ARGS"
    public final void mRULE_STEP_WITH_ARGS() throws RecognitionException {
        try {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27429:30: ( (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' RULE_SPACES ( RULE_STRING )? )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27429:32: (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' RULE_SPACES ( RULE_STRING )?
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27429:32: (~ ( ( '\\r' | '\\n' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27429:32: ~ ( ( '\\r' | '\\n' ) )
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

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27429:48: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27429:48: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            mRULE_SPACES(); 
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27429:71: ( RULE_STRING )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"'||LA10_0=='\'') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27429:71: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STEP_WITH_ARGS"

    // $ANTLR start "RULE_MNL"
    public final void mRULE_MNL() throws RecognitionException {
        try {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27431:19: ( (~ ( ( '\\r' | '\\n' ) ) )* RULE_NL )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27431:21: (~ ( ( '\\r' | '\\n' ) ) )* RULE_NL
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27431:21: (~ ( ( '\\r' | '\\n' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27431:21: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop11;
                }
            } while (true);

            mRULE_NL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MNL"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27433:21: ( RULE_SPACES ':' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27433:23: RULE_SPACES ':'
            {
            mRULE_SPACES(); 
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27435:18: ( ( '\\r' )? ( '\\n' )? )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27435:20: ( '\\r' )? ( '\\n' )?
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27435:20: ( '\\r' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27435:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27435:26: ( '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27435:26: '\\n'
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27437:22: ( ( ' ' | '\\t' )* )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27437:24: ( ' ' | '\\t' )*
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27437:24: ( ' ' | '\\t' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\t'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    break loop14;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACES"

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:27: ( RULE_IN_RICH_STRING )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\'') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='\'') ) {
                        int LA15_4 = input.LA(3);

                        if ( ((LA15_4>='\u0000' && LA15_4<='&')||(LA15_4>='(' && LA15_4<='\u00AA')||(LA15_4>='\u00AC' && LA15_4<='\uFFFF')) ) {
                            alt15=1;
                        }


                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='&')||(LA15_1>='(' && LA15_1<='\u00AA')||(LA15_1>='\u00AC' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='\u00AA')||(LA15_0>='\u00AC' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\'') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='\'') ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3=='\'') ) {
                        alt18=1;
                    }
                    else {
                        alt18=2;}
                }
                else {
                    alt18=2;}
            }
            else {
                alt18=2;}
            switch (alt18) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:58: ( '\\'' ( '\\'' )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\'') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:64: ( '\\'' )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0=='\'') ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27439:64: '\\''
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27441:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27441:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27441:33: ( RULE_IN_RICH_STRING )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\'') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='\'') ) {
                        int LA19_4 = input.LA(3);

                        if ( ((LA19_4>='\u0000' && LA19_4<='&')||(LA19_4>='(' && LA19_4<='\u00AA')||(LA19_4>='\u00AC' && LA19_4<='\uFFFF')) ) {
                            alt19=1;
                        }


                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='&')||(LA19_1>='(' && LA19_1<='\u00AA')||(LA19_1>='\u00AC' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='\u00AA')||(LA19_0>='\u00AC' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27441:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27441:54: ( '\\'' ( '\\'' )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\'') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27441:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27441:60: ( '\\'' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\'') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27441:60: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:20: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:22: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:31: ( RULE_IN_RICH_STRING )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\'') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='\'') ) {
                        int LA22_4 = input.LA(3);

                        if ( ((LA22_4>='\u0000' && LA22_4<='&')||(LA22_4>='(' && LA22_4<='\u00AA')||(LA22_4>='\u00AC' && LA22_4<='\uFFFF')) ) {
                            alt22=1;
                        }


                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='&')||(LA22_1>='(' && LA22_1<='\u00AA')||(LA22_1>='\u00AC' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='\u00AA')||(LA22_0>='\u00AC' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\'') ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1=='\'') ) {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3=='\'') ) {
                        alt25=1;
                    }
                    else {
                        alt25=2;}
                }
                else {
                    alt25=2;}
            }
            else {
                alt25=2;}
            switch (alt25) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:62: ( '\\'' ( '\\'' )? )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\'') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:68: ( '\\'' )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0=='\'') ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27443:68: '\\''
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27445:26: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27445:28: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27445:37: ( RULE_IN_RICH_STRING )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\'') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='\'') ) {
                        int LA26_4 = input.LA(3);

                        if ( ((LA26_4>='\u0000' && LA26_4<='&')||(LA26_4>='(' && LA26_4<='\u00AA')||(LA26_4>='\u00AC' && LA26_4<='\uFFFF')) ) {
                            alt26=1;
                        }


                    }
                    else if ( ((LA26_1>='\u0000' && LA26_1<='&')||(LA26_1>='(' && LA26_1<='\u00AA')||(LA26_1>='\u00AC' && LA26_1<='\uFFFF')) ) {
                        alt26=1;
                    }


                }
                else if ( ((LA26_0>='\u0000' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='\u00AA')||(LA26_0>='\u00AC' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27445:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27445:58: ( '\\'' ( '\\'' )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\'') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27445:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27445:64: ( '\\'' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='\'') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27445:64: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:34: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )? )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:36: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:51: (~ ( ( '\\n' | '\\r' ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:51: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop29;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:67: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\n'||LA34_0=='\r') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:68: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
                    {
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:68: ( '\\r' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='\r') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:68: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:79: ( RULE_IN_RICH_STRING )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0=='\'') ) {
                            int LA31_1 = input.LA(2);

                            if ( (LA31_1=='\'') ) {
                                int LA31_4 = input.LA(3);

                                if ( ((LA31_4>='\u0000' && LA31_4<='&')||(LA31_4>='(' && LA31_4<='\u00AA')||(LA31_4>='\u00AC' && LA31_4<='\uFFFF')) ) {
                                    alt31=1;
                                }


                            }
                            else if ( ((LA31_1>='\u0000' && LA31_1<='&')||(LA31_1>='(' && LA31_1<='\u00AA')||(LA31_1>='\u00AC' && LA31_1<='\uFFFF')) ) {
                                alt31=1;
                            }


                        }
                        else if ( ((LA31_0>='\u0000' && LA31_0<='&')||(LA31_0>='(' && LA31_0<='\u00AA')||(LA31_0>='\u00AC' && LA31_0<='\uFFFF')) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:79: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:100: ( '\\'' ( '\\'' )? )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='\'') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:101: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:106: ( '\\'' )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0=='\'') ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27447:106: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match('\u00AB'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:28: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:30: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:45: (~ ( ( '\\n' | '\\r' ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='\u0000' && LA35_0<='\t')||(LA35_0>='\u000B' && LA35_0<='\f')||(LA35_0>='\u000E' && LA35_0<='\uFFFF')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:45: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop35;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:61: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\n'||LA41_0=='\r') ) {
                alt41=1;
            }
            else {
                alt41=2;}
            switch (alt41) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:62: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:62: ( '\\r' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='\r') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:62: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:73: ( RULE_IN_RICH_STRING )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0=='\'') ) {
                            int LA37_1 = input.LA(2);

                            if ( (LA37_1=='\'') ) {
                                int LA37_4 = input.LA(3);

                                if ( ((LA37_4>='\u0000' && LA37_4<='&')||(LA37_4>='(' && LA37_4<='\u00AA')||(LA37_4>='\u00AC' && LA37_4<='\uFFFF')) ) {
                                    alt37=1;
                                }


                            }
                            else if ( ((LA37_1>='\u0000' && LA37_1<='&')||(LA37_1>='(' && LA37_1<='\u00AA')||(LA37_1>='\u00AC' && LA37_1<='\uFFFF')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0>='\u0000' && LA37_0<='&')||(LA37_0>='(' && LA37_0<='\u00AA')||(LA37_0>='\u00AC' && LA37_0<='\uFFFF')) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:73: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:94: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='\'') ) {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1=='\'') ) {
                            int LA40_3 = input.LA(3);

                            if ( (LA40_3=='\'') ) {
                                alt40=1;
                            }
                            else {
                                alt40=2;}
                        }
                        else {
                            alt40=2;}
                    }
                    else {
                        alt40=2;}
                    switch (alt40) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:95: '\\'\\'\\''
                            {
                            match("'''"); 


                            }
                            break;
                        case 2 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:104: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:104: ( '\\'' ( '\\'' )? )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0=='\'') ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:105: '\\'' ( '\\'' )?
                                    {
                                    match('\''); 
                                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:110: ( '\\'' )?
                                    int alt38=2;
                                    int LA38_0 = input.LA(1);

                                    if ( (LA38_0=='\'') ) {
                                        alt38=1;
                                    }
                                    switch (alt38) {
                                        case 1 :
                                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:110: '\\''
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
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27449:123: EOF
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27451:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27451:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27451:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\'') ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1=='\'') ) {
                    alt42=1;
                }
                else if ( ((LA42_1>='\u0000' && LA42_1<='&')||(LA42_1>='(' && LA42_1<='\u00AA')||(LA42_1>='\u00AC' && LA42_1<='\uFFFF')) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA42_0>='\u0000' && LA42_0<='&')||(LA42_0>='(' && LA42_0<='\u00AA')||(LA42_0>='\u00AC' && LA42_0<='\uFFFF')) ) {
                alt42=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27451:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27451:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27451:83: ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
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

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:12: ( '0x' | '0X' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='0') ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1=='x') ) {
                    alt43=1;
                }
                else if ( (LA43_1=='X') ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='0' && LA44_0<='9')||(LA44_0>='A' && LA44_0<='F')||LA44_0=='_'||(LA44_0>='a' && LA44_0<='f')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='#') ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0=='B'||LA45_0=='b') ) {
                        alt45=1;
                    }
                    else if ( (LA45_0=='L'||LA45_0=='l') ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:64: ( 'b' | 'B' ) ( 'i' | 'I' )
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
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27453:84: ( 'l' | 'L' )
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27455:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27455:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27455:21: ( '0' .. '9' | '_' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>='0' && LA47_0<='9')||LA47_0=='_') ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    break loop47;
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27457:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27457:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27457:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0=='E'||LA49_0=='e') ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27457:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27457:36: ( '+' | '-' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0=='+'||LA48_0=='-') ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27457:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0=='B'||LA50_0=='b') ) {
                alt50=1;
            }
            else if ( (LA50_0=='D'||LA50_0=='F'||LA50_0=='L'||LA50_0=='d'||LA50_0=='f'||LA50_0=='l') ) {
                alt50=2;
            }
            switch (alt50) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27457:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
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
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27457:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27459:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27459:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27459:11: ( '^' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0=='^') ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27459:11: '^'
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

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27459:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0=='$'||(LA52_0>='0' && LA52_0<='9')||(LA52_0>='A' && LA52_0<='Z')||LA52_0=='_'||(LA52_0>='a' && LA52_0<='z')) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    break loop52;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0=='\"') ) {
                alt55=1;
            }
            else if ( (LA55_0=='\'') ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop53:
                    do {
                        int alt53=3;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0=='\\') ) {
                            alt53=1;
                        }
                        else if ( ((LA53_0>='\u0000' && LA53_0<='!')||(LA53_0>='#' && LA53_0<='[')||(LA53_0>=']' && LA53_0<='\uFFFF')) ) {
                            alt53=2;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop53;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop54:
                    do {
                        int alt54=3;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0=='\\') ) {
                            alt54=1;
                        }
                        else if ( ((LA54_0>='\u0000' && LA54_0<='&')||(LA54_0>='(' && LA54_0<='[')||(LA54_0>=']' && LA54_0<='\uFFFF')) ) {
                            alt54=2;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27461:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop54;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27463:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27463:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27463:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>='\u0000' && LA56_0<='\t')||(LA56_0>='\u000B' && LA56_0<='\f')||(LA56_0>='\u000E' && LA56_0<='\uFFFF')) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27463:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop56;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27463:40: ( ( '\\r' )? '\\n' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0=='\n'||LA58_0=='\r') ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27463:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27463:41: ( '\\r' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0=='\r') ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27463:41: '\\r'
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27465:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27465:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27465:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>='\t' && LA59_0<='\n')||LA59_0=='\r'||LA59_0==' ') ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27467:16: ( . )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27467:18: .
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
        // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:8: ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | RULE_ML_COMMENT | RULE_AT_SIGN | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_FEATURE_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_TEXT | RULE_PIPE | RULE_PIPE_SPACES | RULE_EXAMPLE_ROW_END | RULE_TEXT | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt60=118;
        alt60 = dfa60.predict(input);
        switch (alt60) {
            case 1 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:10: T__38
                {
                mT__38(); 

                }
                break;
            case 2 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:16: T__39
                {
                mT__39(); 

                }
                break;
            case 3 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:22: T__40
                {
                mT__40(); 

                }
                break;
            case 4 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:28: T__41
                {
                mT__41(); 

                }
                break;
            case 5 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:34: T__42
                {
                mT__42(); 

                }
                break;
            case 6 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:40: T__43
                {
                mT__43(); 

                }
                break;
            case 7 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:46: T__44
                {
                mT__44(); 

                }
                break;
            case 8 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:52: T__45
                {
                mT__45(); 

                }
                break;
            case 9 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:58: T__46
                {
                mT__46(); 

                }
                break;
            case 10 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:64: T__47
                {
                mT__47(); 

                }
                break;
            case 11 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:70: T__48
                {
                mT__48(); 

                }
                break;
            case 12 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:76: T__49
                {
                mT__49(); 

                }
                break;
            case 13 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:82: T__50
                {
                mT__50(); 

                }
                break;
            case 14 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:88: T__51
                {
                mT__51(); 

                }
                break;
            case 15 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:94: T__52
                {
                mT__52(); 

                }
                break;
            case 16 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:100: T__53
                {
                mT__53(); 

                }
                break;
            case 17 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:106: T__54
                {
                mT__54(); 

                }
                break;
            case 18 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:112: T__55
                {
                mT__55(); 

                }
                break;
            case 19 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:118: T__56
                {
                mT__56(); 

                }
                break;
            case 20 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:124: T__57
                {
                mT__57(); 

                }
                break;
            case 21 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:130: T__58
                {
                mT__58(); 

                }
                break;
            case 22 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:136: T__59
                {
                mT__59(); 

                }
                break;
            case 23 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:142: T__60
                {
                mT__60(); 

                }
                break;
            case 24 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:148: T__61
                {
                mT__61(); 

                }
                break;
            case 25 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:154: T__62
                {
                mT__62(); 

                }
                break;
            case 26 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:160: T__63
                {
                mT__63(); 

                }
                break;
            case 27 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:166: T__64
                {
                mT__64(); 

                }
                break;
            case 28 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:172: T__65
                {
                mT__65(); 

                }
                break;
            case 29 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:178: T__66
                {
                mT__66(); 

                }
                break;
            case 30 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:184: T__67
                {
                mT__67(); 

                }
                break;
            case 31 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:190: T__68
                {
                mT__68(); 

                }
                break;
            case 32 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:196: T__69
                {
                mT__69(); 

                }
                break;
            case 33 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:202: T__70
                {
                mT__70(); 

                }
                break;
            case 34 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:208: T__71
                {
                mT__71(); 

                }
                break;
            case 35 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:214: T__72
                {
                mT__72(); 

                }
                break;
            case 36 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:220: T__73
                {
                mT__73(); 

                }
                break;
            case 37 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:226: T__74
                {
                mT__74(); 

                }
                break;
            case 38 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:232: T__75
                {
                mT__75(); 

                }
                break;
            case 39 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:238: T__76
                {
                mT__76(); 

                }
                break;
            case 40 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:244: T__77
                {
                mT__77(); 

                }
                break;
            case 41 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:250: T__78
                {
                mT__78(); 

                }
                break;
            case 42 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:256: T__79
                {
                mT__79(); 

                }
                break;
            case 43 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:262: T__80
                {
                mT__80(); 

                }
                break;
            case 44 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:268: T__81
                {
                mT__81(); 

                }
                break;
            case 45 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:274: T__82
                {
                mT__82(); 

                }
                break;
            case 46 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:280: T__83
                {
                mT__83(); 

                }
                break;
            case 47 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:286: T__84
                {
                mT__84(); 

                }
                break;
            case 48 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:292: T__85
                {
                mT__85(); 

                }
                break;
            case 49 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:298: T__86
                {
                mT__86(); 

                }
                break;
            case 50 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:304: T__87
                {
                mT__87(); 

                }
                break;
            case 51 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:310: T__88
                {
                mT__88(); 

                }
                break;
            case 52 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:316: T__89
                {
                mT__89(); 

                }
                break;
            case 53 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:322: T__90
                {
                mT__90(); 

                }
                break;
            case 54 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:328: T__91
                {
                mT__91(); 

                }
                break;
            case 55 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:334: T__92
                {
                mT__92(); 

                }
                break;
            case 56 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:340: T__93
                {
                mT__93(); 

                }
                break;
            case 57 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:346: T__94
                {
                mT__94(); 

                }
                break;
            case 58 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:352: T__95
                {
                mT__95(); 

                }
                break;
            case 59 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:358: T__96
                {
                mT__96(); 

                }
                break;
            case 60 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:364: T__97
                {
                mT__97(); 

                }
                break;
            case 61 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:370: T__98
                {
                mT__98(); 

                }
                break;
            case 62 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:376: T__99
                {
                mT__99(); 

                }
                break;
            case 63 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:382: T__100
                {
                mT__100(); 

                }
                break;
            case 64 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:389: T__101
                {
                mT__101(); 

                }
                break;
            case 65 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:396: T__102
                {
                mT__102(); 

                }
                break;
            case 66 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:403: T__103
                {
                mT__103(); 

                }
                break;
            case 67 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:410: T__104
                {
                mT__104(); 

                }
                break;
            case 68 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:417: T__105
                {
                mT__105(); 

                }
                break;
            case 69 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:424: T__106
                {
                mT__106(); 

                }
                break;
            case 70 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:431: T__107
                {
                mT__107(); 

                }
                break;
            case 71 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:438: T__108
                {
                mT__108(); 

                }
                break;
            case 72 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:445: T__109
                {
                mT__109(); 

                }
                break;
            case 73 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:452: T__110
                {
                mT__110(); 

                }
                break;
            case 74 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:459: T__111
                {
                mT__111(); 

                }
                break;
            case 75 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:466: T__112
                {
                mT__112(); 

                }
                break;
            case 76 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:473: T__113
                {
                mT__113(); 

                }
                break;
            case 77 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:480: T__114
                {
                mT__114(); 

                }
                break;
            case 78 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:487: T__115
                {
                mT__115(); 

                }
                break;
            case 79 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:494: T__116
                {
                mT__116(); 

                }
                break;
            case 80 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:501: T__117
                {
                mT__117(); 

                }
                break;
            case 81 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:508: T__118
                {
                mT__118(); 

                }
                break;
            case 82 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:515: T__119
                {
                mT__119(); 

                }
                break;
            case 83 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:522: T__120
                {
                mT__120(); 

                }
                break;
            case 84 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:529: T__121
                {
                mT__121(); 

                }
                break;
            case 85 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:536: T__122
                {
                mT__122(); 

                }
                break;
            case 86 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:543: T__123
                {
                mT__123(); 

                }
                break;
            case 87 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:550: T__124
                {
                mT__124(); 

                }
                break;
            case 88 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:557: T__125
                {
                mT__125(); 

                }
                break;
            case 89 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:564: T__126
                {
                mT__126(); 

                }
                break;
            case 90 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:571: T__127
                {
                mT__127(); 

                }
                break;
            case 91 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:578: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 92 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:594: RULE_AT_SIGN
                {
                mRULE_AT_SIGN(); 

                }
                break;
            case 93 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:607: RULE_BACKGROUND_TEXT
                {
                mRULE_BACKGROUND_TEXT(); 

                }
                break;
            case 94 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:628: RULE_SCENARIO_TEXT
                {
                mRULE_SCENARIO_TEXT(); 

                }
                break;
            case 95 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:647: RULE_FEATURE_TEXT
                {
                mRULE_FEATURE_TEXT(); 

                }
                break;
            case 96 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:665: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 97 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:681: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 98 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:696: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 99 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:711: RULE_AND_TEXT
                {
                mRULE_AND_TEXT(); 

                }
                break;
            case 100 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:725: RULE_EXAMPLE_TEXT
                {
                mRULE_EXAMPLE_TEXT(); 

                }
                break;
            case 101 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:743: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 102 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:753: RULE_PIPE_SPACES
                {
                mRULE_PIPE_SPACES(); 

                }
                break;
            case 103 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:770: RULE_EXAMPLE_ROW_END
                {
                mRULE_EXAMPLE_ROW_END(); 

                }
                break;
            case 104 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:791: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 105 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:801: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 106 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:816: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 107 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:837: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 108 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:856: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 109 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:881: RULE_COMMENT_RICH_TEXT_INBETWEEN
                {
                mRULE_COMMENT_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 110 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:914: RULE_COMMENT_RICH_TEXT_END
                {
                mRULE_COMMENT_RICH_TEXT_END(); 

                }
                break;
            case 111 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:941: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 112 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:950: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 113 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:959: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 114 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:972: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 115 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:980: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 116 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:992: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 117 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:1008: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 118 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:1016: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA2_eotS =
        "\26\uffff";
    static final String DFA2_eofS =
        "\26\uffff";
    static final String DFA2_minS =
        "\3\0\1\uffff\17\0\1\uffff\1\0\1\uffff";
    static final String DFA2_maxS =
        "\3\uffff\1\uffff\17\uffff\1\uffff\1\uffff\1\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\17\uffff\1\2\1\uffff\1\2";
    static final String DFA2_specialS =
        "\1\0\1\16\1\3\1\uffff\1\15\1\4\1\14\1\1\1\22\1\2\1\21\1\7\1\20\1"+
        "\10\1\17\1\5\1\13\1\6\1\12\1\uffff\1\11\1\uffff}>";
    static final String[] DFA2_transitionS = {
            "\102\3\1\1\20\3\1\2\uffac\3",
            "\141\3\1\4\uff9e\3",
            "\143\3\1\5\uff9c\3",
            "",
            "\143\3\1\6\uff9c\3",
            "\145\3\1\7\uff9a\3",
            "\153\3\1\10\uff94\3",
            "\156\3\1\11\uff91\3",
            "\147\3\1\12\uff98\3",
            "\141\3\1\13\uff9e\3",
            "\162\3\1\14\uff8d\3",
            "\162\3\1\15\uff8d\3",
            "\157\3\1\16\uff90\3",
            "\151\3\1\17\uff96\3",
            "\165\3\1\20\uff8a\3",
            "\157\3\1\21\uff90\3",
            "\156\3\1\22\uff91\3",
            "\72\3\1\23\uffc5\3",
            "\144\3\1\24\uff9b\3",
            "",
            "\72\3\1\25\uffc5\3",
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

    static class DFA2 extends DFA {

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
            return "()* loopback of 27409:42: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                        s = -1;
                        if ( (LA2_0=='B') ) {s = 1;}

                        else if ( (LA2_0=='S') ) {s = 2;}

                        else if ( ((LA2_0>='\u0000' && LA2_0<='A')||(LA2_0>='C' && LA2_0<='R')||(LA2_0>='T' && LA2_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_7 = input.LA(1);

                        s = -1;
                        if ( (LA2_7=='n') ) {s = 9;}

                        else if ( ((LA2_7>='\u0000' && LA2_7<='m')||(LA2_7>='o' && LA2_7<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_9 = input.LA(1);

                        s = -1;
                        if ( (LA2_9=='a') ) {s = 11;}

                        else if ( ((LA2_9>='\u0000' && LA2_9<='`')||(LA2_9>='b' && LA2_9<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_2 = input.LA(1);

                        s = -1;
                        if ( (LA2_2=='c') ) {s = 5;}

                        else if ( ((LA2_2>='\u0000' && LA2_2<='b')||(LA2_2>='d' && LA2_2<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                        s = -1;
                        if ( (LA2_5=='e') ) {s = 7;}

                        else if ( ((LA2_5>='\u0000' && LA2_5<='d')||(LA2_5>='f' && LA2_5<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_15 = input.LA(1);

                        s = -1;
                        if ( (LA2_15=='o') ) {s = 17;}

                        else if ( ((LA2_15>='\u0000' && LA2_15<='n')||(LA2_15>='p' && LA2_15<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_17 = input.LA(1);

                        s = -1;
                        if ( (LA2_17==':') ) {s = 19;}

                        else if ( ((LA2_17>='\u0000' && LA2_17<='9')||(LA2_17>=';' && LA2_17<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_11 = input.LA(1);

                        s = -1;
                        if ( (LA2_11=='r') ) {s = 13;}

                        else if ( ((LA2_11>='\u0000' && LA2_11<='q')||(LA2_11>='s' && LA2_11<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_13 = input.LA(1);

                        s = -1;
                        if ( (LA2_13=='i') ) {s = 15;}

                        else if ( ((LA2_13>='\u0000' && LA2_13<='h')||(LA2_13>='j' && LA2_13<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_20 = input.LA(1);

                        s = -1;
                        if ( (LA2_20==':') ) {s = 21;}

                        else if ( ((LA2_20>='\u0000' && LA2_20<='9')||(LA2_20>=';' && LA2_20<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_18 = input.LA(1);

                        s = -1;
                        if ( (LA2_18=='d') ) {s = 20;}

                        else if ( ((LA2_18>='\u0000' && LA2_18<='c')||(LA2_18>='e' && LA2_18<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_16 = input.LA(1);

                        s = -1;
                        if ( (LA2_16=='n') ) {s = 18;}

                        else if ( ((LA2_16>='\u0000' && LA2_16<='m')||(LA2_16>='o' && LA2_16<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA2_6 = input.LA(1);

                        s = -1;
                        if ( (LA2_6=='k') ) {s = 8;}

                        else if ( ((LA2_6>='\u0000' && LA2_6<='j')||(LA2_6>='l' && LA2_6<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA2_4 = input.LA(1);

                        s = -1;
                        if ( (LA2_4=='c') ) {s = 6;}

                        else if ( ((LA2_4>='\u0000' && LA2_4<='b')||(LA2_4>='d' && LA2_4<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA2_1 = input.LA(1);

                        s = -1;
                        if ( (LA2_1=='a') ) {s = 4;}

                        else if ( ((LA2_1>='\u0000' && LA2_1<='`')||(LA2_1>='b' && LA2_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA2_14 = input.LA(1);

                        s = -1;
                        if ( (LA2_14=='u') ) {s = 16;}

                        else if ( ((LA2_14>='\u0000' && LA2_14<='t')||(LA2_14>='v' && LA2_14<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA2_12 = input.LA(1);

                        s = -1;
                        if ( (LA2_12=='o') ) {s = 14;}

                        else if ( ((LA2_12>='\u0000' && LA2_12<='n')||(LA2_12>='p' && LA2_12<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA2_10 = input.LA(1);

                        s = -1;
                        if ( (LA2_10=='r') ) {s = 12;}

                        else if ( ((LA2_10>='\u0000' && LA2_10<='q')||(LA2_10>='s' && LA2_10<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA2_8 = input.LA(1);

                        s = -1;
                        if ( (LA2_8=='g') ) {s = 10;}

                        else if ( ((LA2_8>='\u0000' && LA2_8<='f')||(LA2_8>='h' && LA2_8<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\1\uffff\1\74\1\76\1\100\1\104\4\106\1\121\1\123\1\126\1\130\1\132"+
        "\1\135\1\140\1\143\1\uffff\4\106\4\uffff\2\106\2\uffff\1\106\1\u0080"+
        "\6\106\2\uffff\3\106\1\uffff\4\106\1\71\1\u009b\1\71\2\u00a0\1\71"+
        "\1\uffff\1\71\11\uffff\1\u00a3\3\uffff\1\106\1\uffff\1\106\1\u00a7"+
        "\7\106\4\uffff\1\u00b2\4\uffff\1\u00b4\13\uffff\14\106\1\u00c2\4"+
        "\uffff\3\106\1\u00c7\1\106\2\uffff\2\106\2\uffff\13\106\1\u00d6"+
        "\2\uffff\3\106\1\uffff\4\106\1\u0098\1\uffff\2\u009b\2\uffff\1\u00e4"+
        "\1\uffff\1\u00a0\4\uffff\1\u00e5\1\u00e6\1\u00e8\1\uffff\3\106\1"+
        "\u00ec\5\106\4\uffff\5\106\1\u00f7\7\106\1\uffff\1\u0100\1\u0101"+
        "\2\106\1\uffff\3\106\1\u0107\12\106\1\uffff\7\106\1\u011c\2\u009b"+
        "\1\u00e4\1\uffff\1\u0121\3\uffff\1\106\1\uffff\3\106\1\uffff\1\u0126"+
        "\2\106\1\u0129\6\106\1\uffff\10\106\2\uffff\1\u0138\3\106\1\u013c"+
        "\1\uffff\3\106\1\u0141\6\106\1\uffff\7\106\2\u011c\2\uffff\1\u009b"+
        "\2\u0121\1\uffff\2\106\1\u0156\1\106\1\uffff\1\106\1\u0159\1\uffff"+
        "\1\u015a\1\u015b\3\106\1\u015f\10\106\1\uffff\3\106\1\uffff\2\106"+
        "\1\u016e\1\106\1\uffff\5\106\1\u0175\1\u0176\3\106\2\uffff\1\106"+
        "\2\u011c\2\u0121\2\106\1\u017f\1\uffff\1\u0180\1\u0181\3\uffff\1"+
        "\u0182\1\u0183\1\u0184\1\uffff\1\106\1\u0186\3\106\1\u018a\2\106"+
        "\1\u018d\4\106\1\u0192\1\uffff\1\u0193\1\106\1\u0195\3\106\2\uffff"+
        "\1\u0199\1\106\1\uffff\1\106\1\u011c\1\u0121\1\u019c\1\106\6\uffff"+
        "\1\u019e\1\uffff\1\106\1\u01a0\1\u01a1\1\uffff\2\106\1\uffff\1\106"+
        "\1\u01a5\2\106\2\uffff\1\106\1\uffff\3\106\1\uffff\2\106\1\uffff"+
        "\1\u01ae\1\uffff\1\106\2\uffff\2\106\1\u01b2\1\uffff\1\106\1\uffff"+
        "\4\106\1\u01b8\1\106\1\uffff\1\u01ba\2\106\1\uffff\1\u01bd\1\uffff"+
        "\1\106\1\u01bf\2\uffff\1\106\1\uffff\1\u01c1\1\u01c2\1\uffff\1\106"+
        "\1\uffff\1\106\3\uffff\2\106\1\u01c7\1\uffff\1\106";
    static final String DFA60_eofS =
        "\u01c9\uffff";
    static final String DFA60_minS =
        "\1\0\2\75\1\11\1\46\1\141\1\145\1\150\1\141\3\75\1\76\2\56\2\52"+
        "\1\uffff\1\150\2\141\1\146\4\uffff\1\145\1\142\2\uffff\1\154\1\72"+
        "\1\117\1\114\2\105\2\106\2\uffff\1\150\1\145\1\166\1\uffff\1\151"+
        "\2\150\1\137\2\0\1\u00ab\2\60\1\44\1\uffff\1\0\11\uffff\1\11\3\uffff"+
        "\1\154\1\uffff\1\146\1\44\1\163\1\162\1\160\1\165\1\145\1\141\1"+
        "\163\4\uffff\1\76\4\uffff\1\56\13\uffff\1\160\1\157\1\151\1\141"+
        "\1\154\1\162\1\156\1\142\1\151\1\143\1\160\1\163\1\44\4\uffff\1"+
        "\164\1\167\1\154\1\44\1\163\2\uffff\1\164\1\163\2\uffff\1\122\1"+
        "\141\1\104\1\123\1\141\1\106\1\143\1\120\1\145\1\124\1\144\1\44"+
        "\2\uffff\1\151\1\164\1\145\1\uffff\1\166\2\145\1\137\1\47\1\uffff"+
        "\2\0\2\uffff\1\0\1\uffff\1\60\4\uffff\3\44\1\uffff\1\160\1\157\1"+
        "\145\1\44\1\145\1\141\1\163\1\145\1\143\4\uffff\1\145\1\165\2\164"+
        "\1\163\1\44\1\141\1\154\1\164\1\166\1\153\1\154\1\164\1\uffff\2"+
        "\44\1\154\1\145\1\uffff\1\164\2\145\1\44\1\164\1\106\1\105\1\155"+
        "\1\117\1\153\1\101\1\156\1\105\1\40\1\uffff\1\154\1\165\1\162\1"+
        "\145\2\156\1\137\4\0\1\12\1\0\3\uffff\1\165\1\uffff\1\141\1\167"+
        "\1\157\1\uffff\1\44\1\164\1\163\1\44\1\150\1\162\1\154\1\143\1\151"+
        "\1\145\1\uffff\1\154\1\151\1\145\2\141\1\162\1\145\1\141\2\uffff"+
        "\1\44\2\162\1\156\1\44\1\uffff\1\165\1\117\1\106\1\44\1\160\1\122"+
        "\1\147\1\122\1\141\1\122\1\uffff\1\145\2\162\1\156\2\40\1\144\2"+
        "\0\2\uffff\3\0\1\uffff\1\154\1\164\1\44\1\146\1\uffff\1\145\1\44"+
        "\1\uffff\2\44\1\144\1\150\1\143\1\44\1\154\2\143\1\164\1\147\1\164"+
        "\1\155\1\156\1\uffff\1\164\1\141\1\144\1\uffff\1\162\1\122\1\44"+
        "\1\106\1\uffff\1\154\1\105\1\162\1\101\1\162\2\44\1\156\1\151\1"+
        "\40\2\uffff\1\165\4\0\1\164\1\143\1\44\1\uffff\2\44\3\uffff\3\44"+
        "\1\uffff\1\171\1\44\1\164\2\145\1\44\1\145\1\143\1\44\1\143\1\163"+
        "\1\151\1\145\1\44\1\uffff\1\44\1\145\1\44\1\157\1\124\1\151\2\uffff"+
        "\1\44\1\144\1\uffff\1\155\2\0\1\44\1\150\6\uffff\1\44\1\uffff\1"+
        "\145\2\44\1\uffff\1\156\1\145\1\uffff\1\164\1\44\1\157\1\11\2\uffff"+
        "\1\163\1\uffff\1\165\1\117\1\157\1\uffff\1\145\1\155\1\uffff\1\44"+
        "\1\uffff\1\144\2\uffff\1\164\1\157\1\44\1\uffff\1\156\1\uffff\1"+
        "\11\1\156\1\122\1\72\1\44\1\171\1\uffff\1\44\1\163\1\146\1\uffff"+
        "\1\44\1\uffff\1\144\1\44\2\uffff\1\137\1\uffff\2\44\1\uffff\1\72"+
        "\1\uffff\1\137\3\uffff\2\137\1\44\1\uffff\1\137";
    static final String DFA60_maxS =
        "\1\uffff\1\76\1\75\1\174\1\46\1\141\1\157\1\171\1\162\2\75\2\76"+
        "\1\56\1\72\1\56\1\57\1\uffff\1\167\1\157\1\165\1\156\4\uffff\1\165"+
        "\1\163\2\uffff\1\170\1\72\1\145\1\170\1\141\1\143\1\156\1\106\2"+
        "\uffff\1\150\1\145\1\166\1\uffff\1\151\2\150\1\137\2\uffff\1\u00ab"+
        "\1\170\1\154\1\172\1\uffff\1\uffff\11\uffff\1\40\3\uffff\1\162\1"+
        "\uffff\1\146\1\172\1\163\1\162\1\160\1\171\1\145\1\141\1\164\4\uffff"+
        "\1\76\4\uffff\1\56\13\uffff\1\160\1\157\1\151\1\141\1\154\1\162"+
        "\1\156\1\142\1\157\1\143\1\160\1\163\1\172\4\uffff\1\164\1\167\1"+
        "\154\1\172\1\163\2\uffff\1\164\1\163\2\uffff\1\122\1\141\1\104\1"+
        "\123\1\141\1\106\1\143\1\120\1\145\1\124\1\144\1\172\2\uffff\1\151"+
        "\1\164\1\145\1\uffff\1\166\2\145\1\137\1\47\1\uffff\2\uffff\2\uffff"+
        "\1\uffff\1\uffff\1\154\4\uffff\3\172\1\uffff\1\160\1\157\1\145\1"+
        "\172\1\145\1\141\1\163\1\145\1\143\4\uffff\1\145\1\165\2\164\1\163"+
        "\1\172\1\141\1\154\1\164\1\166\1\153\1\157\1\164\1\uffff\2\172\1"+
        "\154\1\145\1\uffff\1\164\2\145\1\172\1\164\1\111\1\105\1\155\1\117"+
        "\1\153\1\101\1\156\1\105\1\40\1\uffff\1\154\1\165\1\162\1\145\2"+
        "\156\1\137\4\uffff\1\12\1\uffff\3\uffff\1\165\1\uffff\1\141\1\167"+
        "\1\157\1\uffff\1\172\1\164\1\163\1\172\1\150\1\162\1\154\1\143\1"+
        "\151\1\145\1\uffff\1\154\1\151\1\145\2\141\1\162\1\145\1\141\2\uffff"+
        "\1\172\2\162\1\156\1\172\1\uffff\1\165\1\117\1\106\1\172\1\160\1"+
        "\122\1\147\1\122\1\141\1\122\1\uffff\1\145\2\162\1\156\2\40\1\144"+
        "\2\uffff\2\uffff\3\uffff\1\uffff\1\154\1\164\1\172\1\146\1\uffff"+
        "\1\145\1\172\1\uffff\2\172\1\144\1\150\1\143\1\172\1\154\2\143\1"+
        "\164\1\147\1\164\1\155\1\156\1\uffff\1\164\1\141\1\163\1\uffff\1"+
        "\162\1\122\1\172\1\106\1\uffff\1\154\1\105\1\162\1\101\1\162\2\172"+
        "\1\156\1\151\1\40\2\uffff\1\165\4\uffff\1\164\1\143\1\172\1\uffff"+
        "\2\172\3\uffff\3\172\1\uffff\1\171\1\172\1\164\2\145\1\172\1\145"+
        "\1\143\1\172\1\143\1\163\1\151\1\145\1\172\1\uffff\1\172\1\145\1"+
        "\172\1\157\1\124\1\151\2\uffff\1\172\1\144\1\uffff\1\155\2\uffff"+
        "\1\172\1\150\6\uffff\1\172\1\uffff\1\145\2\172\1\uffff\1\156\1\145"+
        "\1\uffff\1\164\1\172\1\157\1\72\2\uffff\1\163\1\uffff\1\165\1\117"+
        "\1\157\1\uffff\1\145\1\155\1\uffff\1\172\1\uffff\1\144\2\uffff\1"+
        "\164\1\157\1\172\1\uffff\1\156\1\uffff\1\72\1\156\1\122\1\72\1\172"+
        "\1\171\1\uffff\1\172\1\163\1\146\1\uffff\1\172\1\uffff\1\144\1\172"+
        "\2\uffff\1\137\1\uffff\2\172\1\uffff\1\72\1\uffff\1\137\3\uffff"+
        "\2\137\1\172\1\uffff\1\137";
    static final String DFA60_acceptS =
        "\21\uffff\1\32\4\uffff\1\45\1\46\1\47\1\50\2\uffff\1\57\1\60\10"+
        "\uffff\1\76\1\77\3\uffff\1\134\12\uffff\1\162\1\uffff\1\165\1\166"+
        "\1\11\1\21\1\1\1\2\1\25\1\3\1\145\1\uffff\1\147\1\4\1\121\1\uffff"+
        "\1\162\11\uffff\1\12\1\33\1\13\1\15\1\uffff\1\22\1\16\1\17\1\26"+
        "\1\uffff\1\34\1\23\1\130\1\120\1\30\1\131\1\27\1\133\1\164\1\31"+
        "\1\32\15\uffff\1\45\1\46\1\47\1\50\5\uffff\1\57\1\60\2\uffff\1\110"+
        "\1\63\14\uffff\1\76\1\77\3\uffff\1\134\5\uffff\1\163\2\uffff\1\153"+
        "\1\154\1\uffff\1\157\1\uffff\1\160\1\161\1\165\1\146\3\uffff\1\107"+
        "\11\uffff\1\24\1\14\1\127\1\20\15\uffff\1\100\4\uffff\1\75\16\uffff"+
        "\1\71\15\uffff\1\155\1\5\1\35\1\uffff\1\6\3\uffff\1\115\12\uffff"+
        "\1\105\10\uffff\1\54\1\111\5\uffff\1\64\12\uffff\1\143\11\uffff"+
        "\1\151\1\152\3\uffff\1\156\4\uffff\1\132\2\uffff\1\104\16\uffff"+
        "\1\112\3\uffff\1\101\4\uffff\1\73\12\uffff\1\141\1\142\10\uffff"+
        "\1\52\2\uffff\1\56\1\117\1\36\3\uffff\1\37\16\uffff\1\72\6\uffff"+
        "\1\70\1\106\2\uffff\1\140\5\uffff\1\7\1\113\1\10\1\51\1\102\1\122"+
        "\1\uffff\1\40\3\uffff\1\44\2\uffff\1\55\4\uffff\1\65\1\74\1\uffff"+
        "\1\66\3\uffff\1\114\2\uffff\1\103\1\uffff\1\116\1\uffff\1\42\1\43"+
        "\3\uffff\1\61\1\uffff\1\137\6\uffff\1\125\3\uffff\1\126\1\uffff"+
        "\1\144\2\uffff\1\136\1\124\1\uffff\1\41\2\uffff\1\123\1\uffff\1"+
        "\67\1\uffff\1\62\1\53\1\135\3\uffff\1\150\1\uffff";
    static final String DFA60_specialS =
        "\1\2\57\uffff\1\23\1\6\5\uffff\1\14\141\uffff\1\16\1\11\2\uffff"+
        "\1\1\100\uffff\1\26\1\4\1\7\1\0\1\uffff\1\3\66\uffff\1\24\1\5\2"+
        "\uffff\1\10\1\25\1\17\56\uffff\1\21\1\12\1\15\1\20\50\uffff\1\13"+
        "\1\22\114\uffff}>";
    static final String[] DFA60_transitionS = {
            "\11\71\2\70\2\71\1\70\22\71\1\70\1\11\1\67\1\71\1\66\1\21\1"+
            "\4\1\60\1\27\1\30\1\17\1\2\1\31\1\14\1\15\1\20\1\63\11\64\1"+
            "\37\1\26\1\13\1\1\1\12\1\16\1\53\1\44\1\42\2\66\1\41\1\40\1"+
            "\54\1\66\1\45\11\66\1\43\1\56\2\66\1\55\3\66\1\47\1\71\1\46"+
            "\1\65\1\57\1\71\1\33\1\66\1\10\1\6\1\36\1\23\2\66\1\25\4\66"+
            "\1\32\1\52\1\24\1\66\1\51\1\22\1\7\1\66\1\5\1\50\3\66\1\34\1"+
            "\3\1\35\55\71\1\62\17\71\1\61\uff44\71",
            "\1\72\1\73",
            "\1\75",
            "\1\101\1\102\2\uffff\1\102\22\uffff\1\101\133\uffff\1\77",
            "\1\103",
            "\1\105",
            "\1\107\3\uffff\1\111\5\uffff\1\110",
            "\1\112\11\uffff\1\114\6\uffff\1\113",
            "\1\117\12\uffff\1\116\5\uffff\1\115",
            "\1\120",
            "\1\122",
            "\1\124\1\125",
            "\1\127",
            "\1\131",
            "\1\134\13\uffff\1\133",
            "\1\136\3\uffff\1\137",
            "\1\141\4\uffff\1\142",
            "",
            "\1\146\13\uffff\1\150\1\145\1\uffff\1\147",
            "\1\151\7\uffff\1\153\5\uffff\1\152",
            "\1\156\20\uffff\1\155\2\uffff\1\154",
            "\1\161\6\uffff\1\157\1\160",
            "",
            "",
            "",
            "",
            "\1\167\11\uffff\1\166\5\uffff\1\170",
            "\1\172\20\uffff\1\171",
            "",
            "",
            "\1\176\13\uffff\1\175",
            "\1\177",
            "\1\u0081\25\uffff\1\u0082",
            "\1\u0084\1\uffff\1\u0083\51\uffff\1\u0085",
            "\1\u0086\33\uffff\1\u0087",
            "\1\u0088\35\uffff\1\u0089",
            "\1\u008a\47\uffff\1\u008b",
            "\1\u008c",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\47\u0098\1\u0097\uffd8\u0098",
            "\47\u009a\1\u0099\u0083\u009a\1\u009c\uff54\u009a",
            "\1\u009d",
            "\12\u009f\10\uffff\1\u00a1\1\uffff\3\u00a1\5\uffff\1\u00a1"+
            "\13\uffff\1\u009e\6\uffff\1\u009f\2\uffff\1\u00a1\1\uffff\3"+
            "\u00a1\5\uffff\1\u00a1\13\uffff\1\u009e",
            "\12\u009f\10\uffff\1\u00a1\1\uffff\3\u00a1\5\uffff\1\u00a1"+
            "\22\uffff\1\u009f\2\uffff\1\u00a1\1\uffff\3\u00a1\5\uffff\1"+
            "\u00a1",
            "\1\106\34\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
            "",
            "\0\u0098",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101\1\102\2\uffff\1\102\22\uffff\1\101",
            "",
            "",
            "",
            "\1\u00a5\5\uffff\1\u00a4",
            "",
            "\1\u00a6",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ac\3\uffff\1\u00ab",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af\1\u00b0",
            "",
            "",
            "",
            "",
            "\1\u00b1",
            "",
            "",
            "",
            "",
            "\1\u00b3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00be\5\uffff\1\u00bd",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\22\106\1\u00c6\7\106",
            "\1\u00c8",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\47\u00e0\1\u00df\u0083\u00e0\1\u009c\uff54\u00e0",
            "\47\u009a\1\u0099\u0083\u009a\1\u009c\uff54\u009a",
            "",
            "",
            "\12\u00e1\1\u00e3\2\u00e1\1\u00e2\ufff2\u00e1",
            "",
            "\12\u009f\10\uffff\1\u00a1\1\uffff\3\u00a1\5\uffff\1\u00a1"+
            "\22\uffff\1\u009f\2\uffff\1\u00a1\1\uffff\3\u00a1\5\uffff\1"+
            "\u00a1",
            "",
            "",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\1\u00e7\31\106",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fe\2\uffff\1\u00fd",
            "\1\u00ff",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0108",
            "\1\u0109\2\uffff\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\47\u011b\1\u011a\u0083\u011b\1\u011d\uff54\u011b",
            "\47\u011e\1\uffff\u0083\u011e\1\u009c\uff54\u011e",
            "\47\u009a\1\u0099\u0083\u009a\1\u009c\uff54\u009a",
            "\12\u00e1\1\u00e3\2\u00e1\1\u00e2\ufff2\u00e1",
            "\1\u00e3",
            "\47\u0120\1\u011f\u0083\u0120\1\u00e4\uff54\u0120",
            "",
            "",
            "",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0127",
            "\1\u0128",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\106\13\uffff\12\106\7\uffff\10\106\1\u0140\21\106\4\uffff"+
            "\1\106\1\uffff\32\106",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\47\u0150\1\u014f\u0083\u0150\1\u011d\uff54\u0150",
            "\47\u011b\1\u011a\u0083\u011b\1\u011d\uff54\u011b",
            "",
            "",
            "\47\u009a\1\u0099\u0083\u009a\1\u009c\uff54\u009a",
            "\47\u0152\1\u0151\u0083\u0152\1\u00e4\uff54\u0152",
            "\47\u0120\1\u011f\u0083\u0120\1\u00e4\uff54\u0120",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\22\106\1\u0155\7\106",
            "\1\u0157",
            "",
            "\1\u0158",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a\16\uffff\1\u016b",
            "",
            "\1\u016c",
            "\1\u016d",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u016f",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "",
            "",
            "\1\u017a",
            "\47\u017b\1\uffff\u0083\u017b\1\u011d\uff54\u017b",
            "\47\u011b\1\u011a\u0083\u011b\1\u011d\uff54\u011b",
            "\47\u017c\1\uffff\u0083\u017c\1\u00e4\uff54\u017c",
            "\47\u0120\1\u011f\u0083\u0120\1\u00e4\uff54\u0120",
            "\1\u017d",
            "\1\u017e",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u0185",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u018b",
            "\1\u018c",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0194",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u019a",
            "",
            "\1\u019b",
            "\47\u011b\1\u011a\u0083\u011b\1\u011d\uff54\u011b",
            "\47\u0120\1\u011f\u0083\u0120\1\u00e4\uff54\u0120",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u019d",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u019f",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u01a2",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u01a6",
            "\1\u01a7\26\uffff\1\u01a7\31\uffff\1\u01a7",
            "",
            "",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u01af",
            "",
            "",
            "\1\u01b0",
            "\1\u01b1",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u01b3",
            "",
            "\1\u01b4\26\uffff\1\u01b4\31\uffff\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u01b9",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u01bb",
            "\1\u01bc",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u01be",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "\1\u01c0",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u01c3",
            "",
            "\1\u01c4",
            "",
            "",
            "",
            "\1\u01c5",
            "\1\u01c6",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\u01c8\1\uffff"+
            "\32\106",
            "",
            "\1\u0096"
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | RULE_ML_COMMENT | RULE_AT_SIGN | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_FEATURE_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_TEXT | RULE_PIPE | RULE_PIPE_SPACES | RULE_EXAMPLE_ROW_END | RULE_TEXT | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_225 = input.LA(1);

                        s = -1;
                        if ( (LA60_225=='\r') ) {s = 226;}

                        else if ( (LA60_225=='\n') ) {s = 227;}

                        else if ( ((LA60_225>='\u0000' && LA60_225<='\t')||(LA60_225>='\u000B' && LA60_225<='\f')||(LA60_225>='\u000E' && LA60_225<='\uFFFF')) ) {s = 225;}

                        else s = 228;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_157 = input.LA(1);

                        s = -1;
                        if ( ((LA60_157>='\u0000' && LA60_157<='\t')||(LA60_157>='\u000B' && LA60_157<='\f')||(LA60_157>='\u000E' && LA60_157<='\uFFFF')) ) {s = 225;}

                        else if ( (LA60_157=='\r') ) {s = 226;}

                        else if ( (LA60_157=='\n') ) {s = 227;}

                        else s = 228;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_0 = input.LA(1);

                        s = -1;
                        if ( (LA60_0=='=') ) {s = 1;}

                        else if ( (LA60_0=='+') ) {s = 2;}

                        else if ( (LA60_0=='|') ) {s = 3;}

                        else if ( (LA60_0=='&') ) {s = 4;}

                        else if ( (LA60_0=='v') ) {s = 5;}

                        else if ( (LA60_0=='d') ) {s = 6;}

                        else if ( (LA60_0=='t') ) {s = 7;}

                        else if ( (LA60_0=='c') ) {s = 8;}

                        else if ( (LA60_0=='!') ) {s = 9;}

                        else if ( (LA60_0=='>') ) {s = 10;}

                        else if ( (LA60_0=='<') ) {s = 11;}

                        else if ( (LA60_0=='-') ) {s = 12;}

                        else if ( (LA60_0=='.') ) {s = 13;}

                        else if ( (LA60_0=='?') ) {s = 14;}

                        else if ( (LA60_0=='*') ) {s = 15;}

                        else if ( (LA60_0=='/') ) {s = 16;}

                        else if ( (LA60_0=='%') ) {s = 17;}

                        else if ( (LA60_0=='s') ) {s = 18;}

                        else if ( (LA60_0=='f') ) {s = 19;}

                        else if ( (LA60_0=='p') ) {s = 20;}

                        else if ( (LA60_0=='i') ) {s = 21;}

                        else if ( (LA60_0==';') ) {s = 22;}

                        else if ( (LA60_0=='(') ) {s = 23;}

                        else if ( (LA60_0==')') ) {s = 24;}

                        else if ( (LA60_0==',') ) {s = 25;}

                        else if ( (LA60_0=='n') ) {s = 26;}

                        else if ( (LA60_0=='a') ) {s = 27;}

                        else if ( (LA60_0=='{') ) {s = 28;}

                        else if ( (LA60_0=='}') ) {s = 29;}

                        else if ( (LA60_0=='e') ) {s = 30;}

                        else if ( (LA60_0==':') ) {s = 31;}

                        else if ( (LA60_0=='F') ) {s = 32;}

                        else if ( (LA60_0=='E') ) {s = 33;}

                        else if ( (LA60_0=='B') ) {s = 34;}

                        else if ( (LA60_0=='S') ) {s = 35;}

                        else if ( (LA60_0=='A') ) {s = 36;}

                        else if ( (LA60_0=='I') ) {s = 37;}

                        else if ( (LA60_0==']') ) {s = 38;}

                        else if ( (LA60_0=='[') ) {s = 39;}

                        else if ( (LA60_0=='w') ) {s = 40;}

                        else if ( (LA60_0=='r') ) {s = 41;}

                        else if ( (LA60_0=='o') ) {s = 42;}

                        else if ( (LA60_0=='@') ) {s = 43;}

                        else if ( (LA60_0=='G') ) {s = 44;}

                        else if ( (LA60_0=='W') ) {s = 45;}

                        else if ( (LA60_0=='T') ) {s = 46;}

                        else if ( (LA60_0=='_') ) {s = 47;}

                        else if ( (LA60_0=='\'') ) {s = 48;}

                        else if ( (LA60_0=='\u00BB') ) {s = 49;}

                        else if ( (LA60_0=='\u00AB') ) {s = 50;}

                        else if ( (LA60_0=='0') ) {s = 51;}

                        else if ( ((LA60_0>='1' && LA60_0<='9')) ) {s = 52;}

                        else if ( (LA60_0=='^') ) {s = 53;}

                        else if ( (LA60_0=='$'||(LA60_0>='C' && LA60_0<='D')||LA60_0=='H'||(LA60_0>='J' && LA60_0<='R')||(LA60_0>='U' && LA60_0<='V')||(LA60_0>='X' && LA60_0<='Z')||LA60_0=='b'||(LA60_0>='g' && LA60_0<='h')||(LA60_0>='j' && LA60_0<='m')||LA60_0=='q'||LA60_0=='u'||(LA60_0>='x' && LA60_0<='z')) ) {s = 54;}

                        else if ( (LA60_0=='\"') ) {s = 55;}

                        else if ( ((LA60_0>='\t' && LA60_0<='\n')||LA60_0=='\r'||LA60_0==' ') ) {s = 56;}

                        else if ( ((LA60_0>='\u0000' && LA60_0<='\b')||(LA60_0>='\u000B' && LA60_0<='\f')||(LA60_0>='\u000E' && LA60_0<='\u001F')||LA60_0=='#'||LA60_0=='\\'||LA60_0=='`'||(LA60_0>='~' && LA60_0<='\u00AA')||(LA60_0>='\u00AC' && LA60_0<='\u00BA')||(LA60_0>='\u00BC' && LA60_0<='\uFFFF')) ) {s = 57;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA60_227 = input.LA(1);

                        s = -1;
                        if ( (LA60_227=='\'') ) {s = 287;}

                        else if ( ((LA60_227>='\u0000' && LA60_227<='&')||(LA60_227>='(' && LA60_227<='\u00AA')||(LA60_227>='\u00AC' && LA60_227<='\uFFFF')) ) {s = 288;}

                        else if ( (LA60_227=='\u00AB') ) {s = 228;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA60_223 = input.LA(1);

                        s = -1;
                        if ( ((LA60_223>='\u0000' && LA60_223<='&')||(LA60_223>='(' && LA60_223<='\u00AA')||(LA60_223>='\u00AC' && LA60_223<='\uFFFF')) ) {s = 286;}

                        else if ( (LA60_223=='\u00AB') ) {s = 156;}

                        else s = 155;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA60_283 = input.LA(1);

                        s = -1;
                        if ( (LA60_283=='\'') ) {s = 282;}

                        else if ( ((LA60_283>='\u0000' && LA60_283<='&')||(LA60_283>='(' && LA60_283<='\u00AA')||(LA60_283>='\u00AC' && LA60_283<='\uFFFF')) ) {s = 283;}

                        else if ( (LA60_283=='\u00AB') ) {s = 285;}

                        else s = 284;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA60_49 = input.LA(1);

                        s = -1;
                        if ( (LA60_49=='\'') ) {s = 153;}

                        else if ( ((LA60_49>='\u0000' && LA60_49<='&')||(LA60_49>='(' && LA60_49<='\u00AA')||(LA60_49>='\u00AC' && LA60_49<='\uFFFF')) ) {s = 154;}

                        else if ( (LA60_49=='\u00AB') ) {s = 156;}

                        else s = 155;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA60_224 = input.LA(1);

                        s = -1;
                        if ( (LA60_224=='\'') ) {s = 153;}

                        else if ( ((LA60_224>='\u0000' && LA60_224<='&')||(LA60_224>='(' && LA60_224<='\u00AA')||(LA60_224>='\u00AC' && LA60_224<='\uFFFF')) ) {s = 154;}

                        else if ( (LA60_224=='\u00AB') ) {s = 156;}

                        else s = 155;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA60_286 = input.LA(1);

                        s = -1;
                        if ( (LA60_286=='\'') ) {s = 153;}

                        else if ( (LA60_286=='\u00AB') ) {s = 156;}

                        else if ( ((LA60_286>='\u0000' && LA60_286<='&')||(LA60_286>='(' && LA60_286<='\u00AA')||(LA60_286>='\u00AC' && LA60_286<='\uFFFF')) ) {s = 154;}

                        else s = 155;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA60_154 = input.LA(1);

                        s = -1;
                        if ( (LA60_154=='\'') ) {s = 153;}

                        else if ( (LA60_154=='\u00AB') ) {s = 156;}

                        else if ( ((LA60_154>='\u0000' && LA60_154<='&')||(LA60_154>='(' && LA60_154<='\u00AA')||(LA60_154>='\u00AC' && LA60_154<='\uFFFF')) ) {s = 154;}

                        else s = 155;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA60_336 = input.LA(1);

                        s = -1;
                        if ( (LA60_336=='\'') ) {s = 282;}

                        else if ( (LA60_336=='\u00AB') ) {s = 285;}

                        else if ( ((LA60_336>='\u0000' && LA60_336<='&')||(LA60_336>='(' && LA60_336<='\u00AA')||(LA60_336>='\u00AC' && LA60_336<='\uFFFF')) ) {s = 283;}

                        else s = 284;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA60_379 = input.LA(1);

                        s = -1;
                        if ( (LA60_379=='\'') ) {s = 282;}

                        else if ( (LA60_379=='\u00AB') ) {s = 285;}

                        else if ( ((LA60_379>='\u0000' && LA60_379<='&')||(LA60_379>='(' && LA60_379<='\u00AA')||(LA60_379>='\u00AC' && LA60_379<='\uFFFF')) ) {s = 283;}

                        else s = 284;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA60_55 = input.LA(1);

                        s = -1;
                        if ( ((LA60_55>='\u0000' && LA60_55<='\uFFFF')) ) {s = 152;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA60_337 = input.LA(1);

                        s = -1;
                        if ( ((LA60_337>='\u0000' && LA60_337<='&')||(LA60_337>='(' && LA60_337<='\u00AA')||(LA60_337>='\u00AC' && LA60_337<='\uFFFF')) ) {s = 380;}

                        else if ( (LA60_337=='\u00AB') ) {s = 228;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA60_153 = input.LA(1);

                        s = -1;
                        if ( (LA60_153=='\'') ) {s = 223;}

                        else if ( ((LA60_153>='\u0000' && LA60_153<='&')||(LA60_153>='(' && LA60_153<='\u00AA')||(LA60_153>='\u00AC' && LA60_153<='\uFFFF')) ) {s = 224;}

                        else if ( (LA60_153=='\u00AB') ) {s = 156;}

                        else s = 155;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA60_288 = input.LA(1);

                        s = -1;
                        if ( (LA60_288=='\'') ) {s = 287;}

                        else if ( ((LA60_288>='\u0000' && LA60_288<='&')||(LA60_288>='(' && LA60_288<='\u00AA')||(LA60_288>='\u00AC' && LA60_288<='\uFFFF')) ) {s = 288;}

                        else if ( (LA60_288=='\u00AB') ) {s = 228;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA60_338 = input.LA(1);

                        s = -1;
                        if ( (LA60_338=='\'') ) {s = 287;}

                        else if ( (LA60_338=='\u00AB') ) {s = 228;}

                        else if ( ((LA60_338>='\u0000' && LA60_338<='&')||(LA60_338>='(' && LA60_338<='\u00AA')||(LA60_338>='\u00AC' && LA60_338<='\uFFFF')) ) {s = 288;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA60_335 = input.LA(1);

                        s = -1;
                        if ( ((LA60_335>='\u0000' && LA60_335<='&')||(LA60_335>='(' && LA60_335<='\u00AA')||(LA60_335>='\u00AC' && LA60_335<='\uFFFF')) ) {s = 379;}

                        else if ( (LA60_335=='\u00AB') ) {s = 285;}

                        else s = 284;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA60_380 = input.LA(1);

                        s = -1;
                        if ( (LA60_380=='\'') ) {s = 287;}

                        else if ( (LA60_380=='\u00AB') ) {s = 228;}

                        else if ( ((LA60_380>='\u0000' && LA60_380<='&')||(LA60_380>='(' && LA60_380<='\u00AA')||(LA60_380>='\u00AC' && LA60_380<='\uFFFF')) ) {s = 288;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA60_48 = input.LA(1);

                        s = -1;
                        if ( (LA60_48=='\'') ) {s = 151;}

                        else if ( ((LA60_48>='\u0000' && LA60_48<='&')||(LA60_48>='(' && LA60_48<='\uFFFF')) ) {s = 152;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA60_282 = input.LA(1);

                        s = -1;
                        if ( (LA60_282=='\'') ) {s = 335;}

                        else if ( ((LA60_282>='\u0000' && LA60_282<='&')||(LA60_282>='(' && LA60_282<='\u00AA')||(LA60_282>='\u00AC' && LA60_282<='\uFFFF')) ) {s = 336;}

                        else if ( (LA60_282=='\u00AB') ) {s = 285;}

                        else s = 284;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA60_287 = input.LA(1);

                        s = -1;
                        if ( (LA60_287=='\'') ) {s = 337;}

                        else if ( ((LA60_287>='\u0000' && LA60_287<='&')||(LA60_287>='(' && LA60_287<='\u00AA')||(LA60_287>='\u00AC' && LA60_287<='\uFFFF')) ) {s = 338;}

                        else if ( (LA60_287=='\u00AB') ) {s = 228;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA60_222 = input.LA(1);

                        s = -1;
                        if ( (LA60_222=='\'') ) {s = 282;}

                        else if ( ((LA60_222>='\u0000' && LA60_222<='&')||(LA60_222>='(' && LA60_222<='\u00AA')||(LA60_222>='\u00AC' && LA60_222<='\uFFFF')) ) {s = 283;}

                        else if ( (LA60_222=='\u00AB') ) {s = 285;}

                        else s = 284;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}