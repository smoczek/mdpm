package com.lowcoupling.mdpm.lng.pbs.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.eclipse.xtext.parser.antlr.Lexer;

@SuppressWarnings("all")
public class InternalPBSLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_STRING=10;
    public static final int T__15=15;
    public static final int RULE_CLOSEDCURLY=7;
    public static final int T__14=14;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_OPENCURLY=6;
    public static final int RULE_INT=9;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ENDLINE=8;
    public static final int RULE_ML_COMMENT=4;

    // delegates
    // delegators

    public InternalPBSLexer() {;} 
    public InternalPBSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPBSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:11:7: ( 'Product ' )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:11:9: 'Product '
            {
            match("Product "); 


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
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:12:7: ( 'Part ' )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:12:9: 'Part '
            {
            match("Part "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "RULE_ENDLINE"
    public final void mRULE_ENDLINE() throws RecognitionException {
        try {
            int _type = RULE_ENDLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:275:14: ( ';' )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:275:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDLINE"

    // $ANTLR start "RULE_OPENCURLY"
    public final void mRULE_OPENCURLY() throws RecognitionException {
        try {
            int _type = RULE_OPENCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:277:16: ( '{' )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:277:18: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPENCURLY"

    // $ANTLR start "RULE_CLOSEDCURLY"
    public final void mRULE_CLOSEDCURLY() throws RecognitionException {
        try {
            int _type = RULE_CLOSEDCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:279:18: ( '}' )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:279:20: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSEDCURLY"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:281:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:281:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:281:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:281:11: '^'
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

            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:281:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:283:10: ( ( '0' .. '9' )+ )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:283:12: ( '0' .. '9' )+
            {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:283:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:283:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:285:137: ~ ( ( '\\\\' | '\\'' ) )
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:287:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:287:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:287:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:287:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:289:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:289:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:289:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:289:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:289:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:289:41: ( '\\r' )? '\\n'
                    {
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:289:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:289:41: '\\r'
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
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:291:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:291:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:291:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:293:16: ( . )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:293:18: .
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
        // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:8: ( T__14 | T__15 | RULE_ENDLINE | RULE_OPENCURLY | RULE_CLOSEDCURLY | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=12;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:22: RULE_ENDLINE
                {
                mRULE_ENDLINE(); 

                }
                break;
            case 4 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:35: RULE_OPENCURLY
                {
                mRULE_OPENCURLY(); 

                }
                break;
            case 5 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:50: RULE_CLOSEDCURLY
                {
                mRULE_CLOSEDCURLY(); 

                }
                break;
            case 6 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:67: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:75: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:84: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:96: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:112: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:128: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:1:136: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\17\3\uffff\1\14\2\uffff\3\14\2\uffff\2\17\11\uffff\5"+
        "\17\1\uffff\2\17\1\uffff";
    static final String DFA12_eofS =
        "\41\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\3\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\157\1\162\11"+
        "\uffff\1\144\1\164\1\165\1\40\1\143\1\uffff\1\164\1\40\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\3\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\157"+
        "\1\162\11\uffff\1\144\1\164\1\165\1\40\1\143\1\uffff\1\164\1\40"+
        "\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\uffff\1\6\1\7\3\uffff\1\13\1\14\2\uffff"+
        "\1\6\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\5\uffff\1\2\2\uffff\1\1";
    static final String DFA12_specialS =
        "\1\1\7\uffff\1\0\1\2\27\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\14\2\13\2\14\1\13\22\14\1\13\1\14\1\10\4\14\1\11\7\14\1"+
            "\12\12\7\1\14\1\2\5\14\17\6\1\1\12\6\3\14\1\5\1\6\1\14\32\6"+
            "\1\3\1\14\1\4\uff82\14",
            "\1\16\20\uffff\1\15",
            "",
            "",
            "",
            "\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            "\0\24",
            "\0\24",
            "\1\25\4\uffff\1\26",
            "",
            "",
            "\1\30",
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "\1\37",
            "\1\40",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | RULE_ENDLINE | RULE_OPENCURLY | RULE_CLOSEDCURLY | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_8 = input.LA(1);

                        s = -1;
                        if ( ((LA12_8>='\u0000' && LA12_8<='\uFFFF')) ) {s = 20;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='P') ) {s = 1;}

                        else if ( (LA12_0==';') ) {s = 2;}

                        else if ( (LA12_0=='{') ) {s = 3;}

                        else if ( (LA12_0=='}') ) {s = 4;}

                        else if ( (LA12_0=='^') ) {s = 5;}

                        else if ( ((LA12_0>='A' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 6;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 7;}

                        else if ( (LA12_0=='\"') ) {s = 8;}

                        else if ( (LA12_0=='\'') ) {s = 9;}

                        else if ( (LA12_0=='/') ) {s = 10;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 11;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_9 = input.LA(1);

                        s = -1;
                        if ( ((LA12_9>='\u0000' && LA12_9<='\uFFFF')) ) {s = 20;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}