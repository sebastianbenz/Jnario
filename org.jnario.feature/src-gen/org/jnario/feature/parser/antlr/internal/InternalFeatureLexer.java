package org.jnario.feature.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureLexer extends Lexer {
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=21;
    public static final int RULE_ID=16;
    public static final int RULE_ANY_OTHER=36;
    public static final int RULE_COMMENT_RICH_TEXT_END=23;
    public static final int EOF=-1;
    public static final int RULE_EXAMPLE_TEXT=12;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=24;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_EXAMPLE_ROW_END=13;
    public static final int RULE_SCENARIO_TEXT=7;
    public static final int RULE_RICH_TEXT_END=22;
    public static final int RULE_BACKGROUND_TEXT=6;
    public static final int RULE_MNL=27;
    public static final int RULE_DECIMAL=26;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_TEXT=5;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_PIPE_SPACES=15;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_IN_RICH_STRING=32;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=33;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__127=127;
    public static final int RULE_STRING=17;
    public static final int T__71=71;
    public static final int RULE_STEP_WITH_ARGS=29;
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
    public static final int RULE_THEN_TEXT=10;
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
    public static final int RULE_WHEN_TEXT=9;
    public static final int RULE_GIVEN_TEXT=8;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=25;
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
    public static final int RULE_NL=31;
    public static final int RULE_SPACES=30;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=34;
    public static final int RULE_COLON=28;
    public static final int RULE_PIPE=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RICH_TEXT_INBETWEEN=20;
    public static final int RULE_WS=35;
    public static final int RULE_AND_TEXT=11;
    public static final int RULE_FEATURE_TEXT=4;

    // delegates
    // delegators

    public InternalFeatureLexer() {;} 
    public InternalFeatureLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFeatureLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g"; }

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:11:7: ( 'package' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:11:9: 'package'
            {
            match("package"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:12:7: ( 'import' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:12:9: 'import'
            {
            match("import"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:13:7: ( 'static' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:13:9: 'static'
            {
            match("static"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:14:7: ( 'extension' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:14:9: 'extension'
            {
            match("extension"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:15:7: ( '.' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:15:9: '.'
            {
            match('.'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:16:7: ( '*' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:16:9: '*'
            {
            match('*'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:17:7: ( ';' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:17:9: ';'
            {
            match(';'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:18:7: ( '@' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:18:9: '@'
            {
            match('@'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:19:7: ( '(' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:19:9: '('
            {
            match('('); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:20:7: ( ',' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:20:9: ','
            {
            match(','); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:21:7: ( ')' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:21:9: ')'
            {
            match(')'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:22:7: ( 'should' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:22:9: 'should'
            {
            match("should"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:23:7: ( 'throw' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:23:9: 'throw'
            {
            match("throw"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:24:7: ( 'throws' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:24:9: 'throws'
            {
            match("throws"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:25:7: ( 'instanceof' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:25:9: 'instanceof'
            {
            match("instanceof"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:26:7: ( 'not' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:26:9: 'not'
            {
            match("not"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:27:7: ( 'assert' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:27:9: 'assert'
            {
            match("assert"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:28:7: ( '#' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:28:9: '#'
            {
            match('#'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:29:7: ( '[' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:29:9: '['
            {
            match('['); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:30:7: ( ']' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:30:9: ']'
            {
            match(']'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:31:7: ( 'public' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:31:9: 'public'
            {
            match("public"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:32:7: ( 'abstract' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:32:9: 'abstract'
            {
            match("abstract"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:33:7: ( 'class' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:33:9: 'class'
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:34:7: ( '<' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:34:9: '<'
            {
            match('<'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:35:7: ( '>' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:35:9: '>'
            {
            match('>'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:36:7: ( 'extends' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:36:9: 'extends'
            {
            match("extends"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:37:7: ( 'implements' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:37:9: 'implements'
            {
            match("implements"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:38:7: ( '{' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:38:9: '{'
            {
            match('{'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:39:7: ( '}' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:39:9: '}'
            {
            match('}'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:40:7: ( 'val' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:40:9: 'val'
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:41:7: ( 'var' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:41:9: 'var'
            {
            match("var"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:42:7: ( '=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:42:9: '='
            {
            match('='); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:43:7: ( 'def' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:43:9: 'def'
            {
            match("def"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:44:7: ( 'override' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:44:9: 'override'
            {
            match("override"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:45:7: ( 'dispatch' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:45:9: 'dispatch'
            {
            match("dispatch"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:46:7: ( 'new' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:46:9: 'new'
            {
            match("new"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:47:7: ( 'create' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:47:9: 'create'
            {
            match("create"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:48:7: ( ':' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:48:9: ':'
            {
            match(':'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:49:7: ( '...' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:49:9: '...'
            {
            match("..."); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:50:7: ( 'FOR' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:50:9: 'FOR'
            {
            match("FOR"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:51:7: ( 'BEFORE' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:51:9: 'BEFORE'
            {
            match("BEFORE"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:52:7: ( 'SEPARATOR' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:52:9: 'SEPARATOR'
            {
            match("SEPARATOR"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:53:7: ( 'AFTER' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:53:9: 'AFTER'
            {
            match("AFTER"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:54:7: ( 'ENDFOR' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:54:9: 'ENDFOR'
            {
            match("ENDFOR"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:55:7: ( 'IF' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:55:9: 'IF'
            {
            match("IF"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:56:7: ( 'ELSE' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:56:9: 'ELSE'
            {
            match("ELSE"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:57:7: ( 'ENDIF' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:57:9: 'ENDIF'
            {
            match("ENDIF"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:58:7: ( 'ELSEIF' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:58:9: 'ELSEIF'
            {
            match("ELSEIF"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:59:7: ( '+' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:59:9: '+'
            {
            match('+'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:60:7: ( '+=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:60:9: '+='
            {
            match("+="); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:61:7: ( '||' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:61:9: '||'
            {
            match("||"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:62:7: ( '&&' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:62:9: '&&'
            {
            match("&&"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:63:7: ( '==' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:63:9: '=='
            {
            match("=="); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:64:7: ( '!=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:64:9: '!='
            {
            match("!="); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:65:7: ( '>=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:65:9: '>='
            {
            match(">="); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:66:7: ( '<=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:66:9: '<='
            {
            match("<="); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:67:7: ( '->' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:67:9: '->'
            {
            match("->"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:68:7: ( '..' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:68:9: '..'
            {
            match(".."); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:69:7: ( '=>' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:69:9: '=>'
            {
            match("=>"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:70:7: ( '?:' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:70:9: '?:'
            {
            match("?:"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:71:7: ( '<=>' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:71:9: '<=>'
            {
            match("<=>"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:72:7: ( '-' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:72:9: '-'
            {
            match('-'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:73:7: ( '**' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:73:9: '**'
            {
            match("**"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:74:8: ( '/' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:74:10: '/'
            {
            match('/'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:75:8: ( '%' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:75:10: '%'
            {
            match('%'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:76:8: ( '!' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:76:10: '!'
            {
            match('!'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:77:8: ( 'as' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:77:10: 'as'
            {
            match("as"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:78:8: ( '?.' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:78:10: '?.'
            {
            match("?."); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:79:8: ( '*.' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:79:10: '*.'
            {
            match("*."); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:80:8: ( 'if' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:80:10: 'if'
            {
            match("if"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:81:8: ( 'else' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:81:10: 'else'
            {
            match("else"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:82:8: ( 'switch' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:82:10: 'switch'
            {
            match("switch"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:83:8: ( 'default' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:83:10: 'default'
            {
            match("default"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:84:8: ( 'case' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:84:10: 'case'
            {
            match("case"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:85:8: ( 'for' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:85:10: 'for'
            {
            match("for"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:86:8: ( 'while' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:86:10: 'while'
            {
            match("while"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:87:8: ( 'do' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:87:10: 'do'
            {
            match("do"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:88:8: ( 'super' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:88:10: 'super'
            {
            match("super"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:89:8: ( '::' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:89:10: '::'
            {
            match("::"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:90:8: ( 'false' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:90:10: 'false'
            {
            match("false"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:91:8: ( 'true' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:91:10: 'true'
            {
            match("true"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:92:8: ( 'null' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:92:10: 'null'
            {
            match("null"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:93:8: ( 'typeof' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:93:10: 'typeof'
            {
            match("typeof"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:94:8: ( 'return' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:94:10: 'return'
            {
            match("return"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:95:8: ( 'try' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:95:10: 'try'
            {
            match("try"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:96:8: ( 'finally' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:96:10: 'finally'
            {
            match("finally"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:97:8: ( 'catch' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:97:10: 'catch'
            {
            match("catch"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:98:8: ( '?' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:98:10: '?'
            {
            match('?'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:99:8: ( '&' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:99:10: '&'
            {
            match('&'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:100:8: ( 'protected' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:100:10: 'protected'
            {
            match("protected"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:101:8: ( 'private' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:101:10: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "RULE_BACKGROUND_TEXT"
    public final void mRULE_BACKGROUND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_BACKGROUND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9443:22: ( 'Background:' RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9443:24: 'Background:' RULE_MNL
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9445:20: ( 'Scenario:' RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9445:22: 'Scenario:' RULE_MNL
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9447:19: ( 'Feature' RULE_COLON ( options {greedy=false; } : . )* ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9447:21: 'Feature' RULE_COLON ( options {greedy=false; } : . )* ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT )
            {
            match("Feature"); 

            mRULE_COLON(); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9447:42: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9447:70: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9447:74: ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='B') ) {
                alt2=1;
            }
            else if ( (LA2_0=='S') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9447:75: RULE_BACKGROUND_TEXT
                    {
                    mRULE_BACKGROUND_TEXT(); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9447:96: RULE_SCENARIO_TEXT
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9449:17: ( 'Given ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9449:19: 'Given ' RULE_STEP_WITH_ARGS
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9451:16: ( 'When ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9451:18: 'When ' RULE_STEP_WITH_ARGS
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9453:16: ( 'Then ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9453:18: 'Then ' RULE_STEP_WITH_ARGS
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9455:15: ( 'And ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9455:17: 'And ' RULE_STEP_WITH_ARGS
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9457:19: ( 'Examples' RULE_COLON RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9457:21: 'Examples' RULE_COLON RULE_MNL
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9459:11: ( '|' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9459:13: '|'
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9461:18: ( RULE_PIPE ( ' ' | '\\t' )+ )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9461:20: RULE_PIPE ( ' ' | '\\t' )+
            {
            mRULE_PIPE(); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9461:30: ( ' ' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9463:22: ( ( RULE_PIPE | RULE_PIPE_SPACES ) ( '\\r' )? '\\n' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9463:24: ( RULE_PIPE | RULE_PIPE_SPACES ) ( '\\r' )? '\\n'
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9463:24: ( RULE_PIPE | RULE_PIPE_SPACES )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='|') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\t'||LA4_1==' ') ) {
                    alt4=2;
                }
                else if ( (LA4_1=='\n'||LA4_1=='\r') ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9463:25: RULE_PIPE
                    {
                    mRULE_PIPE(); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9463:35: RULE_PIPE_SPACES
                    {
                    mRULE_PIPE_SPACES(); 

                    }
                    break;

            }

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9463:53: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9463:53: '\\r'
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9465:11: ( ( '____dummy____' )+ )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9465:13: ( '____dummy____' )+
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9465:13: ( '____dummy____' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='_') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9465:13: '____dummy____'
            	    {
            	    match("____dummy____"); 


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9467:30: ( (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' RULE_SPACES ( RULE_STRING )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9467:32: (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' RULE_SPACES ( RULE_STRING )?
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9467:32: (~ ( ( '\\r' | '\\n' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9467:32: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop7;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9467:48: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9467:48: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            mRULE_SPACES(); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9467:71: ( RULE_STRING )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"'||LA9_0=='\'') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9467:71: RULE_STRING
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9469:19: ( (~ ( ( '\\r' | '\\n' ) ) )* RULE_NL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9469:21: (~ ( ( '\\r' | '\\n' ) ) )* RULE_NL
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9469:21: (~ ( ( '\\r' | '\\n' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9469:21: ~ ( ( '\\r' | '\\n' ) )
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9471:21: ( RULE_SPACES ':' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9471:23: RULE_SPACES ':'
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9473:18: ( ( '\\r' )? ( '\\n' )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9473:20: ( '\\r' )? ( '\\n' )?
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9473:20: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9473:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9473:26: ( '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9473:26: '\\n'
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9475:22: ( ( ' ' | '\\t' )* )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9475:24: ( ' ' | '\\t' )*
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9475:24: ( ' ' | '\\t' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\t'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
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
            	    break loop13;
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:27: ( RULE_IN_RICH_STRING )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\'') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='\'') ) {
                        int LA14_4 = input.LA(3);

                        if ( ((LA14_4>='\u0000' && LA14_4<='&')||(LA14_4>='(' && LA14_4<='\u00AA')||(LA14_4>='\u00AC' && LA14_4<='\uFFFF')) ) {
                            alt14=1;
                        }


                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='&')||(LA14_1>='(' && LA14_1<='\u00AA')||(LA14_1>='\u00AC' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='\u00AA')||(LA14_0>='\u00AC' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
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
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:58: ( '\\'' ( '\\'' )? )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\'') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:64: ( '\\'' )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='\'') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9477:64: '\\''
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9479:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9479:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9479:33: ( RULE_IN_RICH_STRING )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\'') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='\'') ) {
                        int LA18_4 = input.LA(3);

                        if ( ((LA18_4>='\u0000' && LA18_4<='&')||(LA18_4>='(' && LA18_4<='\u00AA')||(LA18_4>='\u00AC' && LA18_4<='\uFFFF')) ) {
                            alt18=1;
                        }


                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='&')||(LA18_1>='(' && LA18_1<='\u00AA')||(LA18_1>='\u00AC' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='\u00AA')||(LA18_0>='\u00AC' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9479:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9479:54: ( '\\'' ( '\\'' )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\'') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9479:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9479:60: ( '\\'' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\'') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9479:60: '\\''
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:20: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:22: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:31: ( RULE_IN_RICH_STRING )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\'') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='\'') ) {
                        int LA21_4 = input.LA(3);

                        if ( ((LA21_4>='\u0000' && LA21_4<='&')||(LA21_4>='(' && LA21_4<='\u00AA')||(LA21_4>='\u00AC' && LA21_4<='\uFFFF')) ) {
                            alt21=1;
                        }


                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='&')||(LA21_1>='(' && LA21_1<='\u00AA')||(LA21_1>='\u00AC' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='\u00AA')||(LA21_0>='\u00AC' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\'') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='\'') ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3=='\'') ) {
                        alt24=1;
                    }
                    else {
                        alt24=2;}
                }
                else {
                    alt24=2;}
            }
            else {
                alt24=2;}
            switch (alt24) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:62: ( '\\'' ( '\\'' )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\'') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:68: ( '\\'' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0=='\'') ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9481:68: '\\''
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9483:26: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9483:28: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9483:37: ( RULE_IN_RICH_STRING )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\'') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='\'') ) {
                        int LA25_4 = input.LA(3);

                        if ( ((LA25_4>='\u0000' && LA25_4<='&')||(LA25_4>='(' && LA25_4<='\u00AA')||(LA25_4>='\u00AC' && LA25_4<='\uFFFF')) ) {
                            alt25=1;
                        }


                    }
                    else if ( ((LA25_1>='\u0000' && LA25_1<='&')||(LA25_1>='(' && LA25_1<='\u00AA')||(LA25_1>='\u00AC' && LA25_1<='\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='\u00AA')||(LA25_0>='\u00AC' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9483:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9483:58: ( '\\'' ( '\\'' )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\'') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9483:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9483:64: ( '\\'' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\'') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9483:64: '\\''
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:34: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:36: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:51: (~ ( ( '\\n' | '\\r' ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:51: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop28;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:67: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\n'||LA33_0=='\r') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:68: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:68: ( '\\r' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\r') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:68: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:79: ( RULE_IN_RICH_STRING )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='\'') ) {
                            int LA30_1 = input.LA(2);

                            if ( (LA30_1=='\'') ) {
                                int LA30_4 = input.LA(3);

                                if ( ((LA30_4>='\u0000' && LA30_4<='&')||(LA30_4>='(' && LA30_4<='\u00AA')||(LA30_4>='\u00AC' && LA30_4<='\uFFFF')) ) {
                                    alt30=1;
                                }


                            }
                            else if ( ((LA30_1>='\u0000' && LA30_1<='&')||(LA30_1>='(' && LA30_1<='\u00AA')||(LA30_1>='\u00AC' && LA30_1<='\uFFFF')) ) {
                                alt30=1;
                            }


                        }
                        else if ( ((LA30_0>='\u0000' && LA30_0<='&')||(LA30_0>='(' && LA30_0<='\u00AA')||(LA30_0>='\u00AC' && LA30_0<='\uFFFF')) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:79: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:100: ( '\\'' ( '\\'' )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0=='\'') ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:101: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:106: ( '\\'' )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0=='\'') ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9485:106: '\\''
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:28: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:30: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:45: (~ ( ( '\\n' | '\\r' ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='\u0000' && LA34_0<='\t')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:45: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop34;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:61: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='\n'||LA40_0=='\r') ) {
                alt40=1;
            }
            else {
                alt40=2;}
            switch (alt40) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:62: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:62: ( '\\r' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='\r') ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:62: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:73: ( RULE_IN_RICH_STRING )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0=='\'') ) {
                            int LA36_1 = input.LA(2);

                            if ( (LA36_1=='\'') ) {
                                int LA36_4 = input.LA(3);

                                if ( ((LA36_4>='\u0000' && LA36_4<='&')||(LA36_4>='(' && LA36_4<='\u00AA')||(LA36_4>='\u00AC' && LA36_4<='\uFFFF')) ) {
                                    alt36=1;
                                }


                            }
                            else if ( ((LA36_1>='\u0000' && LA36_1<='&')||(LA36_1>='(' && LA36_1<='\u00AA')||(LA36_1>='\u00AC' && LA36_1<='\uFFFF')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0>='\u0000' && LA36_0<='&')||(LA36_0>='(' && LA36_0<='\u00AA')||(LA36_0>='\u00AC' && LA36_0<='\uFFFF')) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:73: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:94: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0=='\'') ) {
                        int LA39_1 = input.LA(2);

                        if ( (LA39_1=='\'') ) {
                            int LA39_3 = input.LA(3);

                            if ( (LA39_3=='\'') ) {
                                alt39=1;
                            }
                            else {
                                alt39=2;}
                        }
                        else {
                            alt39=2;}
                    }
                    else {
                        alt39=2;}
                    switch (alt39) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:95: '\\'\\'\\''
                            {
                            match("'''"); 


                            }
                            break;
                        case 2 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:104: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:104: ( '\\'' ( '\\'' )? )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0=='\'') ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:105: '\\'' ( '\\'' )?
                                    {
                                    match('\''); 
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:110: ( '\\'' )?
                                    int alt37=2;
                                    int LA37_0 = input.LA(1);

                                    if ( (LA37_0=='\'') ) {
                                        alt37=1;
                                    }
                                    switch (alt37) {
                                        case 1 :
                                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:110: '\\''
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
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9487:123: EOF
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9489:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9489:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9489:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\'') ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1=='\'') ) {
                    alt41=1;
                }
                else if ( ((LA41_1>='\u0000' && LA41_1<='&')||(LA41_1>='(' && LA41_1<='\u00AA')||(LA41_1>='\u00AC' && LA41_1<='\uFFFF')) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA41_0>='\u0000' && LA41_0<='&')||(LA41_0>='(' && LA41_0<='\u00AA')||(LA41_0>='\u00AC' && LA41_0<='\uFFFF')) ) {
                alt41=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9489:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
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
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9489:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
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
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9489:83: ~ ( ( '\\u00AB' | '\\'' ) )
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:12: ( '0x' | '0X' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='0') ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1=='x') ) {
                    alt42=1;
                }
                else if ( (LA42_1=='X') ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>='0' && LA43_0<='9')||(LA43_0>='A' && LA43_0<='F')||LA43_0=='_'||(LA43_0>='a' && LA43_0<='f')) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
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
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='#') ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0=='B'||LA44_0=='b') ) {
                        alt44=1;
                    }
                    else if ( (LA44_0=='L'||LA44_0=='l') ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:64: ( 'b' | 'B' ) ( 'i' | 'I' )
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
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9491:84: ( 'l' | 'L' )
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9493:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9493:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9493:21: ( '0' .. '9' | '_' )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>='0' && LA46_0<='9')||LA46_0=='_') ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
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
            	    break loop46;
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9495:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9495:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9495:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0=='E'||LA48_0=='e') ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9495:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9495:36: ( '+' | '-' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0=='+'||LA47_0=='-') ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
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

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9495:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0=='B'||LA49_0=='b') ) {
                alt49=1;
            }
            else if ( (LA49_0=='D'||LA49_0=='F'||LA49_0=='L'||LA49_0=='d'||LA49_0=='f'||LA49_0=='l') ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9495:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
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
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9495:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9497:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9497:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9497:11: ( '^' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0=='^') ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9497:11: '^'
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

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9497:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0=='$'||(LA51_0>='0' && LA51_0<='9')||(LA51_0>='A' && LA51_0<='Z')||LA51_0=='_'||(LA51_0>='a' && LA51_0<='z')) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
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
            	    break loop51;
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0=='\"') ) {
                alt54=1;
            }
            else if ( (LA54_0=='\'') ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop52:
                    do {
                        int alt52=3;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0=='\\') ) {
                            alt52=1;
                        }
                        else if ( ((LA52_0>='\u0000' && LA52_0<='!')||(LA52_0>='#' && LA52_0<='[')||(LA52_0>=']' && LA52_0<='\uFFFF')) ) {
                            alt52=2;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop52;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop53:
                    do {
                        int alt53=3;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0=='\\') ) {
                            alt53=1;
                        }
                        else if ( ((LA53_0>='\u0000' && LA53_0<='&')||(LA53_0>='(' && LA53_0<='[')||(LA53_0>=']' && LA53_0<='\uFFFF')) ) {
                            alt53=2;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9499:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop53;
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9501:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9501:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9501:24: ( options {greedy=false; } : . )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0=='*') ) {
                    int LA55_1 = input.LA(2);

                    if ( (LA55_1=='/') ) {
                        alt55=2;
                    }
                    else if ( ((LA55_1>='\u0000' && LA55_1<='.')||(LA55_1>='0' && LA55_1<='\uFFFF')) ) {
                        alt55=1;
                    }


                }
                else if ( ((LA55_0>='\u0000' && LA55_0<=')')||(LA55_0>='+' && LA55_0<='\uFFFF')) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9501:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop55;
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9503:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9503:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9503:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>='\u0000' && LA56_0<='\t')||(LA56_0>='\u000B' && LA56_0<='\f')||(LA56_0>='\u000E' && LA56_0<='\uFFFF')) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9503:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9503:40: ( ( '\\r' )? '\\n' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0=='\n'||LA58_0=='\r') ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9503:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9503:41: ( '\\r' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0=='\r') ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9503:41: '\\r'
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9505:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9505:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9505:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9507:16: ( . )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9507:18: .
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
        // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:8: ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_FEATURE_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_TEXT | RULE_PIPE | RULE_PIPE_SPACES | RULE_EXAMPLE_ROW_END | RULE_TEXT | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt60=118;
        alt60 = dfa60.predict(input);
        switch (alt60) {
            case 1 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:10: T__37
                {
                mT__37(); 

                }
                break;
            case 2 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:16: T__38
                {
                mT__38(); 

                }
                break;
            case 3 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:22: T__39
                {
                mT__39(); 

                }
                break;
            case 4 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:28: T__40
                {
                mT__40(); 

                }
                break;
            case 5 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:34: T__41
                {
                mT__41(); 

                }
                break;
            case 6 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:40: T__42
                {
                mT__42(); 

                }
                break;
            case 7 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:46: T__43
                {
                mT__43(); 

                }
                break;
            case 8 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:52: T__44
                {
                mT__44(); 

                }
                break;
            case 9 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:58: T__45
                {
                mT__45(); 

                }
                break;
            case 10 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:64: T__46
                {
                mT__46(); 

                }
                break;
            case 11 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:70: T__47
                {
                mT__47(); 

                }
                break;
            case 12 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:76: T__48
                {
                mT__48(); 

                }
                break;
            case 13 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:82: T__49
                {
                mT__49(); 

                }
                break;
            case 14 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:88: T__50
                {
                mT__50(); 

                }
                break;
            case 15 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:94: T__51
                {
                mT__51(); 

                }
                break;
            case 16 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:100: T__52
                {
                mT__52(); 

                }
                break;
            case 17 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:106: T__53
                {
                mT__53(); 

                }
                break;
            case 18 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:112: T__54
                {
                mT__54(); 

                }
                break;
            case 19 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:118: T__55
                {
                mT__55(); 

                }
                break;
            case 20 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:124: T__56
                {
                mT__56(); 

                }
                break;
            case 21 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:130: T__57
                {
                mT__57(); 

                }
                break;
            case 22 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:136: T__58
                {
                mT__58(); 

                }
                break;
            case 23 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:142: T__59
                {
                mT__59(); 

                }
                break;
            case 24 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:148: T__60
                {
                mT__60(); 

                }
                break;
            case 25 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:154: T__61
                {
                mT__61(); 

                }
                break;
            case 26 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:160: T__62
                {
                mT__62(); 

                }
                break;
            case 27 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:166: T__63
                {
                mT__63(); 

                }
                break;
            case 28 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:172: T__64
                {
                mT__64(); 

                }
                break;
            case 29 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:178: T__65
                {
                mT__65(); 

                }
                break;
            case 30 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:184: T__66
                {
                mT__66(); 

                }
                break;
            case 31 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:190: T__67
                {
                mT__67(); 

                }
                break;
            case 32 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:196: T__68
                {
                mT__68(); 

                }
                break;
            case 33 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:202: T__69
                {
                mT__69(); 

                }
                break;
            case 34 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:208: T__70
                {
                mT__70(); 

                }
                break;
            case 35 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:214: T__71
                {
                mT__71(); 

                }
                break;
            case 36 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:220: T__72
                {
                mT__72(); 

                }
                break;
            case 37 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:226: T__73
                {
                mT__73(); 

                }
                break;
            case 38 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:232: T__74
                {
                mT__74(); 

                }
                break;
            case 39 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:238: T__75
                {
                mT__75(); 

                }
                break;
            case 40 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:244: T__76
                {
                mT__76(); 

                }
                break;
            case 41 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:250: T__77
                {
                mT__77(); 

                }
                break;
            case 42 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:256: T__78
                {
                mT__78(); 

                }
                break;
            case 43 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:262: T__79
                {
                mT__79(); 

                }
                break;
            case 44 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:268: T__80
                {
                mT__80(); 

                }
                break;
            case 45 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:274: T__81
                {
                mT__81(); 

                }
                break;
            case 46 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:280: T__82
                {
                mT__82(); 

                }
                break;
            case 47 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:286: T__83
                {
                mT__83(); 

                }
                break;
            case 48 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:292: T__84
                {
                mT__84(); 

                }
                break;
            case 49 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:298: T__85
                {
                mT__85(); 

                }
                break;
            case 50 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:304: T__86
                {
                mT__86(); 

                }
                break;
            case 51 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:310: T__87
                {
                mT__87(); 

                }
                break;
            case 52 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:316: T__88
                {
                mT__88(); 

                }
                break;
            case 53 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:322: T__89
                {
                mT__89(); 

                }
                break;
            case 54 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:328: T__90
                {
                mT__90(); 

                }
                break;
            case 55 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:334: T__91
                {
                mT__91(); 

                }
                break;
            case 56 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:340: T__92
                {
                mT__92(); 

                }
                break;
            case 57 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:346: T__93
                {
                mT__93(); 

                }
                break;
            case 58 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:352: T__94
                {
                mT__94(); 

                }
                break;
            case 59 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:358: T__95
                {
                mT__95(); 

                }
                break;
            case 60 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:364: T__96
                {
                mT__96(); 

                }
                break;
            case 61 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:370: T__97
                {
                mT__97(); 

                }
                break;
            case 62 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:376: T__98
                {
                mT__98(); 

                }
                break;
            case 63 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:382: T__99
                {
                mT__99(); 

                }
                break;
            case 64 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:388: T__100
                {
                mT__100(); 

                }
                break;
            case 65 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:395: T__101
                {
                mT__101(); 

                }
                break;
            case 66 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:402: T__102
                {
                mT__102(); 

                }
                break;
            case 67 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:409: T__103
                {
                mT__103(); 

                }
                break;
            case 68 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:416: T__104
                {
                mT__104(); 

                }
                break;
            case 69 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:423: T__105
                {
                mT__105(); 

                }
                break;
            case 70 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:430: T__106
                {
                mT__106(); 

                }
                break;
            case 71 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:437: T__107
                {
                mT__107(); 

                }
                break;
            case 72 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:444: T__108
                {
                mT__108(); 

                }
                break;
            case 73 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:451: T__109
                {
                mT__109(); 

                }
                break;
            case 74 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:458: T__110
                {
                mT__110(); 

                }
                break;
            case 75 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:465: T__111
                {
                mT__111(); 

                }
                break;
            case 76 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:472: T__112
                {
                mT__112(); 

                }
                break;
            case 77 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:479: T__113
                {
                mT__113(); 

                }
                break;
            case 78 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:486: T__114
                {
                mT__114(); 

                }
                break;
            case 79 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:493: T__115
                {
                mT__115(); 

                }
                break;
            case 80 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:500: T__116
                {
                mT__116(); 

                }
                break;
            case 81 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:507: T__117
                {
                mT__117(); 

                }
                break;
            case 82 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:514: T__118
                {
                mT__118(); 

                }
                break;
            case 83 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:521: T__119
                {
                mT__119(); 

                }
                break;
            case 84 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:528: T__120
                {
                mT__120(); 

                }
                break;
            case 85 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:535: T__121
                {
                mT__121(); 

                }
                break;
            case 86 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:542: T__122
                {
                mT__122(); 

                }
                break;
            case 87 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:549: T__123
                {
                mT__123(); 

                }
                break;
            case 88 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:556: T__124
                {
                mT__124(); 

                }
                break;
            case 89 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:563: T__125
                {
                mT__125(); 

                }
                break;
            case 90 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:570: T__126
                {
                mT__126(); 

                }
                break;
            case 91 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:577: T__127
                {
                mT__127(); 

                }
                break;
            case 92 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:584: RULE_BACKGROUND_TEXT
                {
                mRULE_BACKGROUND_TEXT(); 

                }
                break;
            case 93 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:605: RULE_SCENARIO_TEXT
                {
                mRULE_SCENARIO_TEXT(); 

                }
                break;
            case 94 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:624: RULE_FEATURE_TEXT
                {
                mRULE_FEATURE_TEXT(); 

                }
                break;
            case 95 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:642: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 96 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:658: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 97 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:673: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 98 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:688: RULE_AND_TEXT
                {
                mRULE_AND_TEXT(); 

                }
                break;
            case 99 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:702: RULE_EXAMPLE_TEXT
                {
                mRULE_EXAMPLE_TEXT(); 

                }
                break;
            case 100 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:720: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 101 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:730: RULE_PIPE_SPACES
                {
                mRULE_PIPE_SPACES(); 

                }
                break;
            case 102 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:747: RULE_EXAMPLE_ROW_END
                {
                mRULE_EXAMPLE_ROW_END(); 

                }
                break;
            case 103 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:768: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 104 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:778: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 105 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:793: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 106 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:814: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 107 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:833: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 108 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:858: RULE_COMMENT_RICH_TEXT_INBETWEEN
                {
                mRULE_COMMENT_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 109 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:891: RULE_COMMENT_RICH_TEXT_END
                {
                mRULE_COMMENT_RICH_TEXT_END(); 

                }
                break;
            case 110 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:918: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 111 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:927: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 112 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:936: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 113 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:949: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 114 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:957: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 115 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:969: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 116 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:985: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 117 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:1001: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 118 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:1009: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA1_eotS =
        "\26\uffff";
    static final String DFA1_eofS =
        "\26\uffff";
    static final String DFA1_minS =
        "\3\0\1\uffff\17\0\1\uffff\1\0\1\uffff";
    static final String DFA1_maxS =
        "\3\uffff\1\uffff\17\uffff\1\uffff\1\uffff\1\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\1\17\uffff\1\2\1\uffff\1\2";
    static final String DFA1_specialS =
        "\1\7\1\12\1\1\1\uffff\1\21\1\0\1\22\1\11\1\17\1\10\1\20\1\6\1\15"+
        "\1\5\1\16\1\4\1\13\1\3\1\14\1\uffff\1\2\1\uffff}>";
    static final String[] DFA1_transitionS = {
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

    static class DFA1 extends DFA {

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
            return "()* loopback of 9447:42: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_5 = input.LA(1);

                        s = -1;
                        if ( (LA1_5=='e') ) {s = 7;}

                        else if ( ((LA1_5>='\u0000' && LA1_5<='d')||(LA1_5>='f' && LA1_5<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                        s = -1;
                        if ( (LA1_2=='c') ) {s = 5;}

                        else if ( ((LA1_2>='\u0000' && LA1_2<='b')||(LA1_2>='d' && LA1_2<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_20 = input.LA(1);

                        s = -1;
                        if ( (LA1_20==':') ) {s = 21;}

                        else if ( ((LA1_20>='\u0000' && LA1_20<='9')||(LA1_20>=';' && LA1_20<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_17 = input.LA(1);

                        s = -1;
                        if ( (LA1_17==':') ) {s = 19;}

                        else if ( ((LA1_17>='\u0000' && LA1_17<='9')||(LA1_17>=';' && LA1_17<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_15 = input.LA(1);

                        s = -1;
                        if ( (LA1_15=='o') ) {s = 17;}

                        else if ( ((LA1_15>='\u0000' && LA1_15<='n')||(LA1_15>='p' && LA1_15<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_13 = input.LA(1);

                        s = -1;
                        if ( (LA1_13=='i') ) {s = 15;}

                        else if ( ((LA1_13>='\u0000' && LA1_13<='h')||(LA1_13>='j' && LA1_13<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_11 = input.LA(1);

                        s = -1;
                        if ( (LA1_11=='r') ) {s = 13;}

                        else if ( ((LA1_11>='\u0000' && LA1_11<='q')||(LA1_11>='s' && LA1_11<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_0 = input.LA(1);

                        s = -1;
                        if ( (LA1_0=='B') ) {s = 1;}

                        else if ( (LA1_0=='S') ) {s = 2;}

                        else if ( ((LA1_0>='\u0000' && LA1_0<='A')||(LA1_0>='C' && LA1_0<='R')||(LA1_0>='T' && LA1_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                        s = -1;
                        if ( (LA1_9=='a') ) {s = 11;}

                        else if ( ((LA1_9>='\u0000' && LA1_9<='`')||(LA1_9>='b' && LA1_9<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_7 = input.LA(1);

                        s = -1;
                        if ( (LA1_7=='n') ) {s = 9;}

                        else if ( ((LA1_7>='\u0000' && LA1_7<='m')||(LA1_7>='o' && LA1_7<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_1 = input.LA(1);

                        s = -1;
                        if ( (LA1_1=='a') ) {s = 4;}

                        else if ( ((LA1_1>='\u0000' && LA1_1<='`')||(LA1_1>='b' && LA1_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_16 = input.LA(1);

                        s = -1;
                        if ( (LA1_16=='n') ) {s = 18;}

                        else if ( ((LA1_16>='\u0000' && LA1_16<='m')||(LA1_16>='o' && LA1_16<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_18 = input.LA(1);

                        s = -1;
                        if ( (LA1_18=='d') ) {s = 20;}

                        else if ( ((LA1_18>='\u0000' && LA1_18<='c')||(LA1_18>='e' && LA1_18<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_12 = input.LA(1);

                        s = -1;
                        if ( (LA1_12=='o') ) {s = 14;}

                        else if ( ((LA1_12>='\u0000' && LA1_12<='n')||(LA1_12>='p' && LA1_12<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_14 = input.LA(1);

                        s = -1;
                        if ( (LA1_14=='u') ) {s = 16;}

                        else if ( ((LA1_14>='\u0000' && LA1_14<='t')||(LA1_14>='v' && LA1_14<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_8 = input.LA(1);

                        s = -1;
                        if ( (LA1_8=='g') ) {s = 10;}

                        else if ( ((LA1_8>='\u0000' && LA1_8<='f')||(LA1_8>='h' && LA1_8<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA1_10 = input.LA(1);

                        s = -1;
                        if ( (LA1_10=='r') ) {s = 12;}

                        else if ( ((LA1_10>='\u0000' && LA1_10<='q')||(LA1_10>='s' && LA1_10<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA1_4 = input.LA(1);

                        s = -1;
                        if ( (LA1_4=='c') ) {s = 6;}

                        else if ( ((LA1_4>='\u0000' && LA1_4<='b')||(LA1_4>='d' && LA1_4<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA1_6 = input.LA(1);

                        s = -1;
                        if ( (LA1_6=='k') ) {s = 8;}

                        else if ( ((LA1_6>='\u0000' && LA1_6<='j')||(LA1_6>='l' && LA1_6<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\1\uffff\4\76\1\111\1\114\5\uffff\3\76\3\uffff\1\76\1\141\1\143"+
        "\2\uffff\1\76\1\151\2\76\1\157\6\76\1\175\1\177\1\u0083\1\u0085"+
        "\1\u0087\1\u008a\1\u008d\1\uffff\7\76\1\72\1\u009c\1\72\2\u00a0"+
        "\1\72\1\uffff\1\72\2\uffff\3\76\1\uffff\2\76\1\u00aa\6\76\1\u00b2"+
        "\11\uffff\6\76\1\u00bb\1\76\3\uffff\3\76\1\u00c2\5\uffff\1\76\3"+
        "\uffff\2\76\1\u00c7\1\76\2\uffff\13\76\1\u00d4\4\uffff\1\u00d5\16"+
        "\uffff\11\76\1\u0099\1\uffff\2\u009c\2\uffff\1\u00e5\2\uffff\1\u00a0"+
        "\2\uffff\6\76\1\uffff\6\76\2\uffff\2\76\1\u00f5\1\76\1\u00f7\1\u00f8"+
        "\2\76\1\uffff\5\76\2\uffff\1\u0100\1\u0101\1\u0103\1\76\1\uffff"+
        "\1\76\1\u0106\12\76\2\uffff\1\u0112\10\76\1\u011d\2\u009c\1\u00e5"+
        "\1\uffff\1\u0122\1\uffff\14\76\1\u012f\1\76\1\u0131\1\uffff\1\76"+
        "\2\uffff\1\u0133\4\76\1\u0138\1\76\2\uffff\1\76\1\uffff\2\76\1\uffff"+
        "\6\76\1\uffff\2\76\1\u0146\1\76\1\uffff\10\76\2\u011d\2\uffff\1"+
        "\u009c\2\u0122\1\uffff\12\76\1\u015e\1\76\1\uffff\1\u0162\1\uffff"+
        "\1\76\1\uffff\2\76\1\u0166\1\76\1\uffff\1\u0168\10\76\1\u0171\1"+
        "\76\1\u0173\1\76\1\uffff\1\76\1\u0176\1\76\1\u0178\2\76\2\uffff"+
        "\1\76\2\u011d\2\u0122\1\76\1\u017f\2\76\1\u0182\2\76\1\u0185\1\u0186"+
        "\1\u0187\1\uffff\2\76\1\u018a\1\uffff\1\u018b\1\u018c\1\76\1\uffff"+
        "\1\u018e\1\uffff\4\76\1\u0193\3\76\1\uffff\1\u0197\1\uffff\1\u0198"+
        "\1\76\1\uffff\1\76\1\uffff\1\u019b\1\uffff\1\76\1\u011d\1\u0122"+
        "\1\u019d\1\uffff\1\76\1\u019f\1\uffff\2\76\3\uffff\1\76\1\u01a3"+
        "\3\uffff\1\76\1\uffff\1\u01a5\3\76\1\uffff\3\76\2\uffff\1\76\1\u01ad"+
        "\1\uffff\1\76\1\uffff\1\76\1\uffff\3\76\1\uffff\1\u01b3\1\uffff"+
        "\1\u01b4\1\u01b5\1\uffff\4\76\1\uffff\1\76\1\u01bb\2\76\1\u01be"+
        "\3\uffff\1\76\1\u01c0\2\uffff\1\76\1\uffff\1\u01c2\1\u01c3\1\uffff"+
        "\1\76\1\uffff\1\76\3\uffff\2\76\1\u01c8\1\uffff\1\76";
    static final String DFA60_eofS =
        "\u01ca\uffff";
    static final String DFA60_minS =
        "\1\0\1\141\1\146\1\150\1\154\1\56\1\52\5\uffff\1\150\1\145\1\142"+
        "\3\uffff\1\141\2\75\2\uffff\1\141\1\75\1\145\1\166\1\72\1\117\2"+
        "\105\1\106\1\114\1\106\1\75\1\11\1\46\1\75\1\76\1\56\1\52\1\uffff"+
        "\1\141\1\150\1\145\1\151\2\150\1\137\2\0\1\u00ab\2\60\1\44\1\uffff"+
        "\1\0\2\uffff\1\143\1\142\1\151\1\uffff\1\160\1\163\1\44\1\141\1"+
        "\157\1\151\1\160\1\164\1\163\1\56\11\uffff\1\162\1\165\1\160\1\164"+
        "\1\167\1\154\1\44\1\163\3\uffff\1\141\1\145\1\163\1\76\5\uffff\1"+
        "\154\3\uffff\1\146\1\163\1\44\1\145\2\uffff\1\122\1\141\1\106\1"+
        "\143\1\120\1\145\1\124\1\144\1\104\1\123\1\141\1\44\4\uffff\1\11"+
        "\16\uffff\1\162\1\154\1\156\1\151\1\164\1\166\2\145\1\137\1\47\1"+
        "\uffff\2\0\2\uffff\1\0\2\uffff\1\60\2\uffff\1\153\1\154\1\164\1"+
        "\166\1\154\1\164\1\uffff\1\164\1\165\1\164\3\145\2\uffff\1\157\1"+
        "\145\1\44\1\145\2\44\1\154\1\145\1\uffff\1\164\1\163\1\141\1\145"+
        "\1\143\2\uffff\3\44\1\160\1\uffff\1\162\1\44\1\164\1\117\1\153\1"+
        "\101\1\156\1\105\1\40\1\106\1\105\1\155\2\uffff\1\44\1\163\1\141"+
        "\1\154\1\165\1\145\2\156\1\137\4\0\1\12\1\0\1\uffff\1\141\1\151"+
        "\1\145\1\141\1\162\1\145\1\141\1\151\1\154\1\143\1\162\1\156\1\44"+
        "\1\167\1\44\1\uffff\1\157\2\uffff\1\44\2\162\1\163\1\164\1\44\1"+
        "\150\2\uffff\1\165\1\uffff\1\141\1\162\1\uffff\1\165\1\122\1\147"+
        "\1\122\1\141\1\122\1\uffff\1\117\1\106\1\44\1\160\1\uffff\1\145"+
        "\1\154\1\145\1\162\1\156\2\40\1\144\2\0\2\uffff\3\0\1\uffff\1\147"+
        "\2\143\2\164\1\155\1\156\1\143\1\144\1\150\1\44\1\144\1\uffff\1"+
        "\44\1\uffff\1\146\1\uffff\1\164\1\141\1\44\1\145\1\uffff\1\44\1"+
        "\154\1\164\1\151\1\162\1\105\1\162\1\101\1\162\1\44\1\122\1\44\1"+
        "\106\1\uffff\1\154\1\44\1\154\1\44\1\156\1\40\2\uffff\1\165\4\0"+
        "\1\145\1\44\1\164\1\145\1\44\1\145\1\143\3\44\1\uffff\1\151\1\163"+
        "\1\44\1\uffff\2\44\1\143\1\uffff\1\44\1\uffff\1\164\1\143\1\144"+
        "\1\145\1\44\1\157\1\124\1\151\1\uffff\1\44\1\uffff\1\44\1\145\1"+
        "\uffff\1\171\1\uffff\1\44\1\uffff\1\155\2\0\1\44\1\uffff\1\145\1"+
        "\44\1\uffff\1\156\1\145\3\uffff\1\157\1\44\3\uffff\1\164\1\uffff"+
        "\1\44\1\150\1\145\1\11\1\uffff\1\165\1\117\1\157\2\uffff\1\163\1"+
        "\44\1\uffff\1\155\1\uffff\1\144\1\uffff\1\164\1\157\1\156\1\uffff"+
        "\1\44\1\uffff\2\44\1\uffff\1\156\1\122\1\72\1\11\1\uffff\1\171\1"+
        "\44\1\163\1\146\1\44\3\uffff\1\144\1\44\2\uffff\1\137\1\uffff\2"+
        "\44\1\uffff\1\72\1\uffff\1\137\3\uffff\2\137\1\44\1\uffff\1\137";
    static final String DFA60_maxS =
        "\1\uffff\1\165\1\156\1\167\1\170\2\56\5\uffff\1\171\1\165\1\163"+
        "\3\uffff\1\162\2\75\2\uffff\1\141\1\76\1\157\1\166\1\72\1\145\1"+
        "\141\1\143\1\156\1\170\1\106\1\75\1\174\1\46\1\75\1\76\1\72\1\57"+
        "\1\uffff\1\157\1\150\1\145\1\151\2\150\1\137\2\uffff\1\u00ab\1\170"+
        "\1\154\1\172\1\uffff\1\uffff\2\uffff\1\143\1\142\1\157\1\uffff\1"+
        "\160\1\163\1\172\1\141\1\157\1\151\1\160\1\164\1\163\1\56\11\uffff"+
        "\1\162\1\171\1\160\1\164\1\167\1\154\1\172\1\163\3\uffff\1\141\1"+
        "\145\1\164\1\76\5\uffff\1\162\3\uffff\1\146\1\163\1\172\1\145\2"+
        "\uffff\1\122\1\141\1\106\1\143\1\120\1\145\1\124\1\144\1\104\1\123"+
        "\1\141\1\172\4\uffff\1\40\16\uffff\1\162\1\154\1\156\1\151\1\164"+
        "\1\166\2\145\1\137\1\47\1\uffff\2\uffff\2\uffff\1\uffff\2\uffff"+
        "\1\154\2\uffff\1\153\1\154\1\164\1\166\1\157\1\164\1\uffff\1\164"+
        "\1\165\1\164\3\145\2\uffff\1\157\1\145\1\172\1\145\2\172\1\154\1"+
        "\145\1\uffff\1\164\1\163\1\141\1\145\1\143\2\uffff\3\172\1\160\1"+
        "\uffff\1\162\1\172\1\164\1\117\1\153\1\101\1\156\1\105\1\40\1\111"+
        "\1\105\1\155\2\uffff\1\172\1\163\1\141\1\154\1\165\1\145\2\156\1"+
        "\137\4\uffff\1\12\1\uffff\1\uffff\1\141\1\151\1\145\1\141\1\162"+
        "\1\145\1\141\1\151\1\154\1\143\1\162\1\156\1\172\1\167\1\172\1\uffff"+
        "\1\157\2\uffff\1\172\2\162\1\163\1\164\1\172\1\150\2\uffff\1\165"+
        "\1\uffff\1\141\1\162\1\uffff\1\165\1\122\1\147\1\122\1\141\1\122"+
        "\1\uffff\1\117\1\106\1\172\1\160\1\uffff\1\145\1\154\1\145\1\162"+
        "\1\156\2\40\1\144\2\uffff\2\uffff\3\uffff\1\uffff\1\147\2\143\2"+
        "\164\1\155\1\156\1\143\1\144\1\150\1\172\1\163\1\uffff\1\172\1\uffff"+
        "\1\146\1\uffff\1\164\1\141\1\172\1\145\1\uffff\1\172\1\154\1\164"+
        "\1\151\1\162\1\105\1\162\1\101\1\162\1\172\1\122\1\172\1\106\1\uffff"+
        "\1\154\1\172\1\154\1\172\1\156\1\40\2\uffff\1\165\4\uffff\1\145"+
        "\1\172\1\164\1\145\1\172\1\145\1\143\3\172\1\uffff\1\151\1\163\1"+
        "\172\1\uffff\2\172\1\143\1\uffff\1\172\1\uffff\1\164\1\143\1\144"+
        "\1\145\1\172\1\157\1\124\1\151\1\uffff\1\172\1\uffff\1\172\1\145"+
        "\1\uffff\1\171\1\uffff\1\172\1\uffff\1\155\2\uffff\1\172\1\uffff"+
        "\1\145\1\172\1\uffff\1\156\1\145\3\uffff\1\157\1\172\3\uffff\1\164"+
        "\1\uffff\1\172\1\150\1\145\1\72\1\uffff\1\165\1\117\1\157\2\uffff"+
        "\1\163\1\172\1\uffff\1\155\1\uffff\1\144\1\uffff\1\164\1\157\1\156"+
        "\1\uffff\1\172\1\uffff\2\172\1\uffff\1\156\1\122\2\72\1\uffff\1"+
        "\171\1\172\1\163\1\146\1\172\3\uffff\1\144\1\172\2\uffff\1\137\1"+
        "\uffff\2\172\1\uffff\1\72\1\uffff\1\137\3\uffff\2\137\1\172\1\uffff"+
        "\1\137";
    static final String DFA60_acceptS =
        "\7\uffff\1\7\1\10\1\11\1\12\1\13\3\uffff\1\22\1\23\1\24\3\uffff"+
        "\1\34\1\35\22\uffff\1\101\15\uffff\1\161\1\uffff\1\165\1\166\3\uffff"+
        "\1\161\12\uffff\1\5\1\77\1\105\1\6\1\7\1\10\1\11\1\12\1\13\10\uffff"+
        "\1\22\1\23\1\24\4\uffff\1\30\1\67\1\31\1\34\1\35\1\uffff\1\65\1"+
        "\73\1\40\4\uffff\1\117\1\46\14\uffff\1\62\1\61\1\63\1\144\1\uffff"+
        "\1\146\1\64\1\131\1\66\1\102\1\71\1\76\1\74\1\104\1\130\1\163\1"+
        "\164\1\100\1\101\12\uffff\1\162\2\uffff\1\152\1\153\1\uffff\1\156"+
        "\1\157\1\uffff\1\160\1\165\6\uffff\1\106\6\uffff\1\47\1\72\10\uffff"+
        "\1\103\5\uffff\1\75\1\70\4\uffff\1\115\14\uffff\1\55\1\145\17\uffff"+
        "\1\154\17\uffff\1\125\1\uffff\1\20\1\44\7\uffff\1\36\1\37\1\uffff"+
        "\1\41\2\uffff\1\50\6\uffff\1\142\4\uffff\1\113\12\uffff\1\150\1"+
        "\151\3\uffff\1\155\14\uffff\1\107\1\uffff\1\121\1\uffff\1\122\4"+
        "\uffff\1\112\15\uffff\1\56\6\uffff\1\140\1\141\17\uffff\1\116\3"+
        "\uffff\1\15\3\uffff\1\27\1\uffff\1\127\10\uffff\1\53\1\uffff\1\57"+
        "\2\uffff\1\120\1\uffff\1\114\1\uffff\1\137\4\uffff\1\25\2\uffff"+
        "\1\2\2\uffff\1\3\1\14\1\110\2\uffff\1\16\1\123\1\21\1\uffff\1\45"+
        "\4\uffff\1\51\3\uffff\1\54\1\60\2\uffff\1\124\1\uffff\1\1\1\uffff"+
        "\1\133\3\uffff\1\32\1\uffff\1\111\2\uffff\1\136\4\uffff\1\126\5"+
        "\uffff\1\26\1\43\1\42\2\uffff\1\135\1\143\1\uffff\1\132\2\uffff"+
        "\1\4\1\uffff\1\52\1\uffff\1\33\1\17\1\134\3\uffff\1\147\1\uffff";
    static final String DFA60_specialS =
        "\1\25\60\uffff\1\17\1\23\5\uffff\1\6\141\uffff\1\15\1\5\2\uffff"+
        "\1\21\100\uffff\1\12\1\16\1\4\1\22\1\uffff\1\10\66\uffff\1\24\1"+
        "\1\2\uffff\1\3\1\20\1\11\56\uffff\1\26\1\2\1\7\1\13\50\uffff\1\0"+
        "\1\14\114\uffff}>";
    static final String[] DFA60_transitionS = {
            "\11\72\2\71\2\72\1\71\22\72\1\71\1\45\1\70\1\17\1\67\1\51\1"+
            "\44\1\61\1\11\1\13\1\6\1\42\1\12\1\46\1\5\1\50\1\64\11\65\1"+
            "\33\1\7\1\23\1\30\1\24\1\47\1\10\1\37\1\35\2\67\1\40\1\34\1"+
            "\55\1\67\1\41\11\67\1\36\1\57\2\67\1\56\3\67\1\20\1\72\1\21"+
            "\1\66\1\60\1\72\1\16\1\67\1\22\1\31\1\4\1\52\2\67\1\2\4\67\1"+
            "\15\1\32\1\1\1\67\1\54\1\3\1\14\1\67\1\27\1\53\3\67\1\25\1\43"+
            "\1\26\55\72\1\63\17\72\1\62\uff44\72",
            "\1\73\20\uffff\1\75\2\uffff\1\74",
            "\1\101\6\uffff\1\77\1\100",
            "\1\103\13\uffff\1\102\1\105\1\uffff\1\104",
            "\1\107\13\uffff\1\106",
            "\1\110",
            "\1\112\3\uffff\1\113",
            "",
            "",
            "",
            "",
            "",
            "\1\122\11\uffff\1\123\6\uffff\1\124",
            "\1\126\11\uffff\1\125\5\uffff\1\127",
            "\1\131\20\uffff\1\130",
            "",
            "",
            "",
            "\1\137\12\uffff\1\135\5\uffff\1\136",
            "\1\140",
            "\1\142",
            "",
            "",
            "\1\146",
            "\1\147\1\150",
            "\1\152\3\uffff\1\153\5\uffff\1\154",
            "\1\155",
            "\1\156",
            "\1\160\25\uffff\1\161",
            "\1\162\33\uffff\1\163",
            "\1\164\35\uffff\1\165",
            "\1\166\47\uffff\1\167",
            "\1\171\1\uffff\1\170\51\uffff\1\172",
            "\1\173",
            "\1\174",
            "\1\u0080\1\u0081\2\uffff\1\u0081\22\uffff\1\u0080\133\uffff"+
            "\1\176",
            "\1\u0082",
            "\1\u0084",
            "\1\u0086",
            "\1\u0089\13\uffff\1\u0088",
            "\1\u008b\4\uffff\1\u008c",
            "",
            "\1\u0090\7\uffff\1\u0091\5\uffff\1\u008f",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\47\u0099\1\u0098\uffd8\u0099",
            "\47\u009b\1\u009a\u0083\u009b\1\u009d\uff54\u009b",
            "\1\u009e",
            "\12\u00a1\10\uffff\1\u00a2\1\uffff\3\u00a2\5\uffff\1\u00a2"+
            "\13\uffff\1\u009f\6\uffff\1\u00a1\2\uffff\1\u00a2\1\uffff\3"+
            "\u00a2\5\uffff\1\u00a2\13\uffff\1\u009f",
            "\12\u00a1\10\uffff\1\u00a2\1\uffff\3\u00a2\5\uffff\1\u00a2"+
            "\22\uffff\1\u00a1\2\uffff\1\u00a2\1\uffff\3\u00a2\5\uffff\1"+
            "\u00a2",
            "\1\76\34\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\0\u0099",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a7\5\uffff\1\u00a6",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b3",
            "\1\u00b4\3\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\22"+
            "\76\1\u00ba\7\76",
            "\1\u00bc",
            "",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf\1\u00c0",
            "\1\u00c1",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c3\5\uffff\1\u00c4",
            "",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u00c8",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "",
            "",
            "",
            "\1\u0080\1\u0081\2\uffff\1\u0081\22\uffff\1\u0080",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "\47\u00e1\1\u00e0\u0083\u00e1\1\u009d\uff54\u00e1",
            "\47\u009b\1\u009a\u0083\u009b\1\u009d\uff54\u009b",
            "",
            "",
            "\12\u00e2\1\u00e4\2\u00e2\1\u00e3\ufff2\u00e2",
            "",
            "",
            "\12\u00a1\10\uffff\1\u00a2\1\uffff\3\u00a2\5\uffff\1\u00a2"+
            "\22\uffff\1\u00a1\2\uffff\1\u00a2\1\uffff\3\u00a2\5\uffff\1"+
            "\u00a2",
            "",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00eb\2\uffff\1\u00ea",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u00f6",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\1\u0102"+
            "\31\76",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e\2\uffff\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\47\u011c\1\u011b\u0083\u011c\1\u011e\uff54\u011c",
            "\47\u011f\1\uffff\u0083\u011f\1\u009d\uff54\u011f",
            "\47\u009b\1\u009a\u0083\u009b\1\u009d\uff54\u009b",
            "\12\u00e2\1\u00e4\2\u00e2\1\u00e3\ufff2\u00e2",
            "\1\u00e4",
            "\47\u0121\1\u0120\u0083\u0121\1\u00e5\uff54\u0121",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0130",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\u0132",
            "",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0139",
            "",
            "",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\76\13\uffff\12\76\7\uffff\10\76\1\u0145\21\76\4\uffff\1"+
            "\76\1\uffff\32\76",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\47\u0151\1\u0150\u0083\u0151\1\u011e\uff54\u0151",
            "\47\u011c\1\u011b\u0083\u011c\1\u011e\uff54\u011c",
            "",
            "",
            "\47\u009b\1\u009a\u0083\u009b\1\u009d\uff54\u009b",
            "\47\u0153\1\u0152\u0083\u0153\1\u00e5\uff54\u0153",
            "\47\u0121\1\u0120\u0083\u0121\1\u00e5\uff54\u0121",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0160\16\uffff\1\u015f",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\22"+
            "\76\1\u0161\7\76",
            "",
            "\1\u0163",
            "",
            "\1\u0164",
            "\1\u0165",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0167",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0172",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0177",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0179",
            "\1\u017a",
            "",
            "",
            "\1\u017b",
            "\47\u017c\1\uffff\u0083\u017c\1\u011e\uff54\u017c",
            "\47\u011c\1\u011b\u0083\u011c\1\u011e\uff54\u011c",
            "\47\u017d\1\uffff\u0083\u017d\1\u00e5\uff54\u017d",
            "\47\u0121\1\u0120\u0083\u0121\1\u00e5\uff54\u0121",
            "\1\u017e",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0180",
            "\1\u0181",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0183",
            "\1\u0184",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u018d",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u0199",
            "",
            "\1\u019a",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\u019c",
            "\47\u011c\1\u011b\u0083\u011c\1\u011e\uff54\u011c",
            "\47\u0121\1\u0120\u0083\u0121\1\u00e5\uff54\u0121",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\u019e",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\u01a0",
            "\1\u01a1",
            "",
            "",
            "",
            "\1\u01a2",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "",
            "",
            "\1\u01a4",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8\26\uffff\1\u01a8\31\uffff\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "",
            "\1\u01ac",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\u01ae",
            "",
            "\1\u01af",
            "",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9\26\uffff\1\u01b9\31\uffff\1\u01b9",
            "",
            "\1\u01ba",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\u01bc",
            "\1\u01bd",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "",
            "",
            "\1\u01bf",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "",
            "\1\u01c1",
            "",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32"+
            "\76",
            "",
            "\1\u01c4",
            "",
            "\1\u01c5",
            "",
            "",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "\1\76\13\uffff\12\76\7\uffff\32\76\4\uffff\1\u01c9\1\uffff"+
            "\32\76",
            "",
            "\1\u0097"
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
            return "1:1: Tokens : ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_FEATURE_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_TEXT | RULE_PIPE | RULE_PIPE_SPACES | RULE_EXAMPLE_ROW_END | RULE_TEXT | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_380 = input.LA(1);

                        s = -1;
                        if ( (LA60_380=='\'') ) {s = 283;}

                        else if ( (LA60_380=='\u00AB') ) {s = 286;}

                        else if ( ((LA60_380>='\u0000' && LA60_380<='&')||(LA60_380>='(' && LA60_380<='\u00AA')||(LA60_380>='\u00AC' && LA60_380<='\uFFFF')) ) {s = 284;}

                        else s = 285;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_284 = input.LA(1);

                        s = -1;
                        if ( (LA60_284=='\'') ) {s = 283;}

                        else if ( ((LA60_284>='\u0000' && LA60_284<='&')||(LA60_284>='(' && LA60_284<='\u00AA')||(LA60_284>='\u00AC' && LA60_284<='\uFFFF')) ) {s = 284;}

                        else if ( (LA60_284=='\u00AB') ) {s = 286;}

                        else s = 285;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_337 = input.LA(1);

                        s = -1;
                        if ( (LA60_337=='\'') ) {s = 283;}

                        else if ( ((LA60_337>='\u0000' && LA60_337<='&')||(LA60_337>='(' && LA60_337<='\u00AA')||(LA60_337>='\u00AC' && LA60_337<='\uFFFF')) ) {s = 284;}

                        else if ( (LA60_337=='\u00AB') ) {s = 286;}

                        else s = 285;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA60_287 = input.LA(1);

                        s = -1;
                        if ( (LA60_287=='\'') ) {s = 154;}

                        else if ( (LA60_287=='\u00AB') ) {s = 157;}

                        else if ( ((LA60_287>='\u0000' && LA60_287<='&')||(LA60_287>='(' && LA60_287<='\u00AA')||(LA60_287>='\u00AC' && LA60_287<='\uFFFF')) ) {s = 155;}

                        else s = 156;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA60_225 = input.LA(1);

                        s = -1;
                        if ( (LA60_225=='\'') ) {s = 154;}

                        else if ( ((LA60_225>='\u0000' && LA60_225<='&')||(LA60_225>='(' && LA60_225<='\u00AA')||(LA60_225>='\u00AC' && LA60_225<='\uFFFF')) ) {s = 155;}

                        else if ( (LA60_225=='\u00AB') ) {s = 157;}

                        else s = 156;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA60_155 = input.LA(1);

                        s = -1;
                        if ( (LA60_155=='\'') ) {s = 154;}

                        else if ( (LA60_155=='\u00AB') ) {s = 157;}

                        else if ( ((LA60_155>='\u0000' && LA60_155<='&')||(LA60_155>='(' && LA60_155<='\u00AA')||(LA60_155>='\u00AC' && LA60_155<='\uFFFF')) ) {s = 155;}

                        else s = 156;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA60_56 = input.LA(1);

                        s = -1;
                        if ( ((LA60_56>='\u0000' && LA60_56<='\uFFFF')) ) {s = 153;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA60_338 = input.LA(1);

                        s = -1;
                        if ( ((LA60_338>='\u0000' && LA60_338<='&')||(LA60_338>='(' && LA60_338<='\u00AA')||(LA60_338>='\u00AC' && LA60_338<='\uFFFF')) ) {s = 381;}

                        else if ( (LA60_338=='\u00AB') ) {s = 229;}

                        else s = 290;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA60_228 = input.LA(1);

                        s = -1;
                        if ( (LA60_228=='\'') ) {s = 288;}

                        else if ( ((LA60_228>='\u0000' && LA60_228<='&')||(LA60_228>='(' && LA60_228<='\u00AA')||(LA60_228>='\u00AC' && LA60_228<='\uFFFF')) ) {s = 289;}

                        else if ( (LA60_228=='\u00AB') ) {s = 229;}

                        else s = 290;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA60_289 = input.LA(1);

                        s = -1;
                        if ( (LA60_289=='\'') ) {s = 288;}

                        else if ( ((LA60_289>='\u0000' && LA60_289<='&')||(LA60_289>='(' && LA60_289<='\u00AA')||(LA60_289>='\u00AC' && LA60_289<='\uFFFF')) ) {s = 289;}

                        else if ( (LA60_289=='\u00AB') ) {s = 229;}

                        else s = 290;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA60_223 = input.LA(1);

                        s = -1;
                        if ( (LA60_223=='\'') ) {s = 283;}

                        else if ( ((LA60_223>='\u0000' && LA60_223<='&')||(LA60_223>='(' && LA60_223<='\u00AA')||(LA60_223>='\u00AC' && LA60_223<='\uFFFF')) ) {s = 284;}

                        else if ( (LA60_223=='\u00AB') ) {s = 286;}

                        else s = 285;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA60_339 = input.LA(1);

                        s = -1;
                        if ( (LA60_339=='\'') ) {s = 288;}

                        else if ( (LA60_339=='\u00AB') ) {s = 229;}

                        else if ( ((LA60_339>='\u0000' && LA60_339<='&')||(LA60_339>='(' && LA60_339<='\u00AA')||(LA60_339>='\u00AC' && LA60_339<='\uFFFF')) ) {s = 289;}

                        else s = 290;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA60_381 = input.LA(1);

                        s = -1;
                        if ( (LA60_381=='\'') ) {s = 288;}

                        else if ( ((LA60_381>='\u0000' && LA60_381<='&')||(LA60_381>='(' && LA60_381<='\u00AA')||(LA60_381>='\u00AC' && LA60_381<='\uFFFF')) ) {s = 289;}

                        else if ( (LA60_381=='\u00AB') ) {s = 229;}

                        else s = 290;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA60_154 = input.LA(1);

                        s = -1;
                        if ( (LA60_154=='\'') ) {s = 224;}

                        else if ( ((LA60_154>='\u0000' && LA60_154<='&')||(LA60_154>='(' && LA60_154<='\u00AA')||(LA60_154>='\u00AC' && LA60_154<='\uFFFF')) ) {s = 225;}

                        else if ( (LA60_154=='\u00AB') ) {s = 157;}

                        else s = 156;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA60_224 = input.LA(1);

                        s = -1;
                        if ( ((LA60_224>='\u0000' && LA60_224<='&')||(LA60_224>='(' && LA60_224<='\u00AA')||(LA60_224>='\u00AC' && LA60_224<='\uFFFF')) ) {s = 287;}

                        else if ( (LA60_224=='\u00AB') ) {s = 157;}

                        else s = 156;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA60_49 = input.LA(1);

                        s = -1;
                        if ( (LA60_49=='\'') ) {s = 152;}

                        else if ( ((LA60_49>='\u0000' && LA60_49<='&')||(LA60_49>='(' && LA60_49<='\uFFFF')) ) {s = 153;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA60_288 = input.LA(1);

                        s = -1;
                        if ( (LA60_288=='\'') ) {s = 338;}

                        else if ( ((LA60_288>='\u0000' && LA60_288<='&')||(LA60_288>='(' && LA60_288<='\u00AA')||(LA60_288>='\u00AC' && LA60_288<='\uFFFF')) ) {s = 339;}

                        else if ( (LA60_288=='\u00AB') ) {s = 229;}

                        else s = 290;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA60_158 = input.LA(1);

                        s = -1;
                        if ( ((LA60_158>='\u0000' && LA60_158<='\t')||(LA60_158>='\u000B' && LA60_158<='\f')||(LA60_158>='\u000E' && LA60_158<='\uFFFF')) ) {s = 226;}

                        else if ( (LA60_158=='\r') ) {s = 227;}

                        else if ( (LA60_158=='\n') ) {s = 228;}

                        else s = 229;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA60_226 = input.LA(1);

                        s = -1;
                        if ( (LA60_226=='\r') ) {s = 227;}

                        else if ( (LA60_226=='\n') ) {s = 228;}

                        else if ( ((LA60_226>='\u0000' && LA60_226<='\t')||(LA60_226>='\u000B' && LA60_226<='\f')||(LA60_226>='\u000E' && LA60_226<='\uFFFF')) ) {s = 226;}

                        else s = 229;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA60_50 = input.LA(1);

                        s = -1;
                        if ( (LA60_50=='\'') ) {s = 154;}

                        else if ( ((LA60_50>='\u0000' && LA60_50<='&')||(LA60_50>='(' && LA60_50<='\u00AA')||(LA60_50>='\u00AC' && LA60_50<='\uFFFF')) ) {s = 155;}

                        else if ( (LA60_50=='\u00AB') ) {s = 157;}

                        else s = 156;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA60_283 = input.LA(1);

                        s = -1;
                        if ( (LA60_283=='\'') ) {s = 336;}

                        else if ( ((LA60_283>='\u0000' && LA60_283<='&')||(LA60_283>='(' && LA60_283<='\u00AA')||(LA60_283>='\u00AC' && LA60_283<='\uFFFF')) ) {s = 337;}

                        else if ( (LA60_283=='\u00AB') ) {s = 286;}

                        else s = 285;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA60_0 = input.LA(1);

                        s = -1;
                        if ( (LA60_0=='p') ) {s = 1;}

                        else if ( (LA60_0=='i') ) {s = 2;}

                        else if ( (LA60_0=='s') ) {s = 3;}

                        else if ( (LA60_0=='e') ) {s = 4;}

                        else if ( (LA60_0=='.') ) {s = 5;}

                        else if ( (LA60_0=='*') ) {s = 6;}

                        else if ( (LA60_0==';') ) {s = 7;}

                        else if ( (LA60_0=='@') ) {s = 8;}

                        else if ( (LA60_0=='(') ) {s = 9;}

                        else if ( (LA60_0==',') ) {s = 10;}

                        else if ( (LA60_0==')') ) {s = 11;}

                        else if ( (LA60_0=='t') ) {s = 12;}

                        else if ( (LA60_0=='n') ) {s = 13;}

                        else if ( (LA60_0=='a') ) {s = 14;}

                        else if ( (LA60_0=='#') ) {s = 15;}

                        else if ( (LA60_0=='[') ) {s = 16;}

                        else if ( (LA60_0==']') ) {s = 17;}

                        else if ( (LA60_0=='c') ) {s = 18;}

                        else if ( (LA60_0=='<') ) {s = 19;}

                        else if ( (LA60_0=='>') ) {s = 20;}

                        else if ( (LA60_0=='{') ) {s = 21;}

                        else if ( (LA60_0=='}') ) {s = 22;}

                        else if ( (LA60_0=='v') ) {s = 23;}

                        else if ( (LA60_0=='=') ) {s = 24;}

                        else if ( (LA60_0=='d') ) {s = 25;}

                        else if ( (LA60_0=='o') ) {s = 26;}

                        else if ( (LA60_0==':') ) {s = 27;}

                        else if ( (LA60_0=='F') ) {s = 28;}

                        else if ( (LA60_0=='B') ) {s = 29;}

                        else if ( (LA60_0=='S') ) {s = 30;}

                        else if ( (LA60_0=='A') ) {s = 31;}

                        else if ( (LA60_0=='E') ) {s = 32;}

                        else if ( (LA60_0=='I') ) {s = 33;}

                        else if ( (LA60_0=='+') ) {s = 34;}

                        else if ( (LA60_0=='|') ) {s = 35;}

                        else if ( (LA60_0=='&') ) {s = 36;}

                        else if ( (LA60_0=='!') ) {s = 37;}

                        else if ( (LA60_0=='-') ) {s = 38;}

                        else if ( (LA60_0=='?') ) {s = 39;}

                        else if ( (LA60_0=='/') ) {s = 40;}

                        else if ( (LA60_0=='%') ) {s = 41;}

                        else if ( (LA60_0=='f') ) {s = 42;}

                        else if ( (LA60_0=='w') ) {s = 43;}

                        else if ( (LA60_0=='r') ) {s = 44;}

                        else if ( (LA60_0=='G') ) {s = 45;}

                        else if ( (LA60_0=='W') ) {s = 46;}

                        else if ( (LA60_0=='T') ) {s = 47;}

                        else if ( (LA60_0=='_') ) {s = 48;}

                        else if ( (LA60_0=='\'') ) {s = 49;}

                        else if ( (LA60_0=='\u00BB') ) {s = 50;}

                        else if ( (LA60_0=='\u00AB') ) {s = 51;}

                        else if ( (LA60_0=='0') ) {s = 52;}

                        else if ( ((LA60_0>='1' && LA60_0<='9')) ) {s = 53;}

                        else if ( (LA60_0=='^') ) {s = 54;}

                        else if ( (LA60_0=='$'||(LA60_0>='C' && LA60_0<='D')||LA60_0=='H'||(LA60_0>='J' && LA60_0<='R')||(LA60_0>='U' && LA60_0<='V')||(LA60_0>='X' && LA60_0<='Z')||LA60_0=='b'||(LA60_0>='g' && LA60_0<='h')||(LA60_0>='j' && LA60_0<='m')||LA60_0=='q'||LA60_0=='u'||(LA60_0>='x' && LA60_0<='z')) ) {s = 55;}

                        else if ( (LA60_0=='\"') ) {s = 56;}

                        else if ( ((LA60_0>='\t' && LA60_0<='\n')||LA60_0=='\r'||LA60_0==' ') ) {s = 57;}

                        else if ( ((LA60_0>='\u0000' && LA60_0<='\b')||(LA60_0>='\u000B' && LA60_0<='\f')||(LA60_0>='\u000E' && LA60_0<='\u001F')||LA60_0=='\\'||LA60_0=='`'||(LA60_0>='~' && LA60_0<='\u00AA')||(LA60_0>='\u00AC' && LA60_0<='\u00BA')||(LA60_0>='\u00BC' && LA60_0<='\uFFFF')) ) {s = 58;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA60_336 = input.LA(1);

                        s = -1;
                        if ( ((LA60_336>='\u0000' && LA60_336<='&')||(LA60_336>='(' && LA60_336<='\u00AA')||(LA60_336>='\u00AC' && LA60_336<='\uFFFF')) ) {s = 380;}

                        else if ( (LA60_336=='\u00AB') ) {s = 286;}

                        else s = 285;

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