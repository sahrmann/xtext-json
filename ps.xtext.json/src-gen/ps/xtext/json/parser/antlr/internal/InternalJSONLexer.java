package ps.xtext.json.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSONLexer extends Lexer {
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_JSONNUMBER=5;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_DIGIT=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalJSONLexer() {;} 
    public InternalJSONLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJSONLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalJSON.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSON.g:11:7: ( '{' )
            // InternalJSON.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSON.g:12:7: ( ',' )
            // InternalJSON.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSON.g:13:7: ( '}' )
            // InternalJSON.g:13:9: '}'
            {
            match('}'); 

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
            // InternalJSON.g:14:7: ( ':' )
            // InternalJSON.g:14:9: ':'
            {
            match(':'); 

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
            // InternalJSON.g:15:7: ( '[' )
            // InternalJSON.g:15:9: '['
            {
            match('['); 

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
            // InternalJSON.g:16:7: ( ']' )
            // InternalJSON.g:16:9: ']'
            {
            match(']'); 

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
            // InternalJSON.g:17:7: ( 'true' )
            // InternalJSON.g:17:9: 'true'
            {
            match("true"); 


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
            // InternalJSON.g:18:7: ( 'false' )
            // InternalJSON.g:18:9: 'false'
            {
            match("false"); 


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
            // InternalJSON.g:19:7: ( 'null' )
            // InternalJSON.g:19:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_JSONNUMBER"
    public final void mRULE_JSONNUMBER() throws RecognitionException {
        try {
            int _type = RULE_JSONNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSON.g:491:17: ( ( '-' )? ( '0' | '1' .. '9' ( RULE_DIGIT )* ) ( '.' ( RULE_DIGIT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? )
            // InternalJSON.g:491:19: ( '-' )? ( '0' | '1' .. '9' ( RULE_DIGIT )* ) ( '.' ( RULE_DIGIT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DIGIT )+ )?
            {
            // InternalJSON.g:491:19: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJSON.g:491:19: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalJSON.g:491:24: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSON.g:491:25: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalJSON.g:491:29: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalJSON.g:491:38: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalJSON.g:491:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalJSON.g:491:51: ( '.' ( RULE_DIGIT )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJSON.g:491:52: '.' ( RULE_DIGIT )+
                    {
                    match('.'); 
                    // InternalJSON.g:491:56: ( RULE_DIGIT )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJSON.g:491:56: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

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
                    break;

            }

            // InternalJSON.g:491:70: ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DIGIT )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E'||LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJSON.g:491:71: ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DIGIT )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalJSON.g:491:81: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalJSON.g:
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

                    // InternalJSON.g:491:92: ( RULE_DIGIT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalJSON.g:491:92: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSONNUMBER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalJSON.g:493:21: ( '0' .. '9' )
            // InternalJSON.g:493:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSON.g:495:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJSON.g:495:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJSON.g:495:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJSON.g:495:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalJSON.g:495:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJSON.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // InternalJSON.g:497:10: ( ( '0' .. '9' )+ )
            // InternalJSON.g:497:12: ( '0' .. '9' )+
            {
            // InternalJSON.g:497:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJSON.g:497:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalJSON.g:499:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJSON.g:499:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJSON.g:499:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalJSON.g:499:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJSON.g:499:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalJSON.g:499:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSON.g:499:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalJSON.g:499:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJSON.g:499:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalJSON.g:499:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSON.g:499:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // InternalJSON.g:501:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJSON.g:501:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJSON.g:501:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJSON.g:501:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // InternalJSON.g:503:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJSON.g:503:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJSON.g:503:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJSON.g:503:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // InternalJSON.g:503:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJSON.g:503:41: ( '\\r' )? '\\n'
                    {
                    // InternalJSON.g:503:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalJSON.g:503:41: '\\r'
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
            // InternalJSON.g:505:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJSON.g:505:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJSON.g:505:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJSON.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // InternalJSON.g:507:16: ( . )
            // InternalJSON.g:507:18: .
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
        // InternalJSON.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_JSONNUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=17;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalJSON.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalJSON.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalJSON.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalJSON.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalJSON.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalJSON.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalJSON.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalJSON.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalJSON.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalJSON.g:1:64: RULE_JSONNUMBER
                {
                mRULE_JSONNUMBER(); 

                }
                break;
            case 11 :
                // InternalJSON.g:1:80: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // InternalJSON.g:1:88: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // InternalJSON.g:1:97: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // InternalJSON.g:1:109: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // InternalJSON.g:1:125: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // InternalJSON.g:1:141: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // InternalJSON.g:1:149: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\7\uffff\3\33\1\23\2\36\1\23\1\uffff\3\23\10\uffff\1\33\1\uffff\2\33\2\uffff\1\36\4\uffff\3\33\1\53\1\33\1\55\1\uffff\1\56\2\uffff";
    static final String DFA20_eofS =
        "\57\uffff";
    static final String DFA20_minS =
        "\1\0\6\uffff\1\162\1\141\1\165\3\60\1\101\1\uffff\2\0\1\52\10\uffff\1\165\1\uffff\2\154\2\uffff\1\60\4\uffff\1\145\1\163\1\154\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA20_maxS =
        "\1\uffff\6\uffff\1\162\1\141\1\165\3\71\1\172\1\uffff\2\uffff\1\57\10\uffff\1\165\1\uffff\2\154\2\uffff\1\71\4\uffff\1\145\1\163\1\154\1\172\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\7\uffff\1\13\3\uffff\1\20\1\21\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\13\2\uffff\1\12\1\14\1\uffff\1\15\1\16\1\17\1\20\6\uffff\1\7\1\uffff\1\11\1\10";
    static final String DFA20_specialS =
        "\1\2\16\uffff\1\0\1\1\36\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\4\23\1\2\1\12\1\23\1\21\1\13\11\14\1\4\6\23\32\16\1\5\1\23\1\6\1\15\1\16\1\23\5\16\1\10\7\16\1\11\5\16\1\7\6\16\1\1\1\23\1\3\uff82\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\34",
            "\1\35",
            "\12\36",
            "\12\37",
            "\12\40",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\0\41",
            "\0\41",
            "\1\42\4\uffff\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "",
            "\1\46",
            "\1\47",
            "",
            "",
            "\12\40",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\54",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_JSONNUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_15 = input.LA(1);

                        s = -1;
                        if ( ((LA20_15>='\u0000' && LA20_15<='\uFFFF')) ) {s = 33;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_16 = input.LA(1);

                        s = -1;
                        if ( ((LA20_16>='\u0000' && LA20_16<='\uFFFF')) ) {s = 33;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='{') ) {s = 1;}

                        else if ( (LA20_0==',') ) {s = 2;}

                        else if ( (LA20_0=='}') ) {s = 3;}

                        else if ( (LA20_0==':') ) {s = 4;}

                        else if ( (LA20_0=='[') ) {s = 5;}

                        else if ( (LA20_0==']') ) {s = 6;}

                        else if ( (LA20_0=='t') ) {s = 7;}

                        else if ( (LA20_0=='f') ) {s = 8;}

                        else if ( (LA20_0=='n') ) {s = 9;}

                        else if ( (LA20_0=='-') ) {s = 10;}

                        else if ( (LA20_0=='0') ) {s = 11;}

                        else if ( ((LA20_0>='1' && LA20_0<='9')) ) {s = 12;}

                        else if ( (LA20_0=='^') ) {s = 13;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='e')||(LA20_0>='g' && LA20_0<='m')||(LA20_0>='o' && LA20_0<='s')||(LA20_0>='u' && LA20_0<='z')) ) {s = 14;}

                        else if ( (LA20_0=='\"') ) {s = 15;}

                        else if ( (LA20_0=='\'') ) {s = 16;}

                        else if ( (LA20_0=='/') ) {s = 17;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 18;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='+')||LA20_0=='.'||(LA20_0>=';' && LA20_0<='@')||LA20_0=='\\'||LA20_0=='`'||LA20_0=='|'||(LA20_0>='~' && LA20_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}