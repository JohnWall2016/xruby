// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-05-15 09:58:22

package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.Expression;
import org.antlr.runtime.*;

public class Rubyv3Lexer extends BaseLexer {
    public static final int COMMA=106;
    public static final int GREATER_THAN=48;
    public static final int LOGICAL_AND_ASSIGN=98;
    public static final int MINUS=56;
    public static final int ESCAPE_INT=75;
    public static final int ARRAY=63;
    public static final int HASH=64;
    public static final int HEX_PART=71;
    public static final int LOGICAL_OR=39;
    public static final int LESS_THAN=47;
    public static final int META_PART=73;
    public static final int LEADING0_NUMBER=78;
    public static final int BOR=52;
    public static final int BINARY=70;
    public static final int COLON2=108;
    public static final int EMPTY_ARRAY=105;
    public static final int LCURLY=83;
    public static final int LINE_BREAK=33;
    public static final int T114=114;
    public static final int LEFT_SHIFT=12;
    public static final int IF_MODIFIER=27;
    public static final int MULTIPLE_ASSIGN=17;
    public static final int ESCAPE_INT_PART=74;
    public static final int REGEX=66;
    public static final int SYMBOL=15;
    public static final int CONTROL_PART=72;
    public static final int RPAREN=102;
    public static final int T118=118;
    public static final int STAR_ASSIGN=89;
    public static final int DOUBLE_QUOTE_STRING=80;
    public static final int PLUS=55;
    public static final int ASSIGNMENT=14;
    public static final int T117=117;
    public static final int HEREDOC_INDENT_BEGIN=86;
    public static final int BODY=9;
    public static final int UNLESS_MODIFIER=28;
    public static final int CASE_EQUAL=43;
    public static final int MINUS_ASSIGN=88;
    public static final int GREATER_OR_EQUAL=50;
    public static final int EXCLUSIVE_RANGE=38;
    public static final int T113=113;
    public static final int T109=109;
    public static final int RANGE=65;
    public static final int POWER_ASSIGN=92;
    public static final int MOD_ASSIGN=91;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=20;
    public static final int T120=120;
    public static final int T115=115;
    public static final int WS=34;
    public static final int STRING=24;
    public static final int DOUBLE_STRING_CHAR=82;
    public static final int T121=121;
    public static final int RIGHT_SHIFT_ASSIGN=97;
    public static final int NON_LEADING0_NUMBER=76;
    public static final int SINGLE_QUOTE_STRING=79;
    public static final int T123=123;
    public static final int HEREDOC_BEGIN=85;
    public static final int LBRACK=103;
    public static final int SEMI=32;
    public static final int DIV_ASSIGN=90;
    public static final int MRHS=21;
    public static final int BLOCK_ARG=19;
    public static final int EQUAL=42;
    public static final int LOGICAL_AND=40;
    public static final int T119=119;
    public static final int COLON=107;
    public static final int DIV=25;
    public static final int T122=122;
    public static final int HEX=69;
    public static final int SINGLETON_METHOD=23;
    public static final int STATEMENT_LIST=4;
    public static final int STATEMENT=5;
    public static final int INCLUSIVE_RANGE=37;
    public static final int BNOT=59;
    public static final int LOGICAL_OR_ASSIGN=99;
    public static final int ASSOC=100;
    public static final int FLOAT=62;
    public static final int OCTAL=67;
    public static final int MOD=26;
    public static final int PLUS_ASSIGN=87;
    public static final int QUESTION=36;
    public static final int DECIMAL=68;
    public static final int UNTIL_MODIFIER=30;
    public static final int BLOCK=16;
    public static final int RCURLY=84;
    public static final int T116=116;
    public static final int INT=61;
    public static final int BOR_ASSIGN=95;
    public static final int LESS_OR_EQUAL=49;
    public static final int LPAREN=101;
    public static final int T111=111;
    public static final int BAND=53;
    public static final int T112=112;
    public static final int HEREDOC_STRING=13;
    public static final int NOT_MATCH=46;
    public static final int ID=35;
    public static final int NOT_EQUAL=44;
    public static final int BAND_ASSIGN=93;
    public static final int RIGHT_SHIFT=54;
    public static final int POWER=58;
    public static final int T110=110;
    public static final int BXOR_ASSIGN=94;
    public static final int NESTED_LHS=22;
    public static final int LEFT_SHIFT_ASSIGN=96;
    public static final int MATCH=45;
    public static final int WHILE_MODIFIER=29;
    public static final int EXP_PART=77;
    public static final int COMPARE=41;
    public static final int IF=7;
    public static final int ARG=11;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=18;
    public static final int EOF=-1;
    public static final int CALL=10;
    public static final int Tokens=124;
    public static final int RBRACK=104;
    public static final int RESCUE_MODIFIER=31;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int STAR=57;
    public static final int BXOR=51;
    public static final int NOT=60;
    public static final int SINGLE_STRING_CHAR=81;
    
    
        static final int STR_FUNC_ESCAPE=0x01;
        static final int STR_FUNC_EXPAND=0x02;
        static final int STR_FUNC_REGEXP=0x04;
        static final int STR_FUNC_QWORDS=0x08;
        static final int STR_FUNC_SYMBOL=0x10;
        static final int STR_FUNC_INDENT=0x20;
    
        private final int str_squote = 0;
        private final int str_dquote = STR_FUNC_EXPAND;
        private final int str_xquote = STR_FUNC_EXPAND;
        private final int str_regexp = STR_FUNC_REGEXP | STR_FUNC_ESCAPE | STR_FUNC_EXPAND;
        private final int str_ssym   = STR_FUNC_SYMBOL;
        private final int str_dsym   = STR_FUNC_SYMBOL | STR_FUNC_EXPAND;
        
        public int lex_state = 0;
        public static final int IN_HEREDOC_STRING = 1;
            /** Override this method to change where error messages go */
            public void emitErrorMessage(String msg) {
    		System.err.println(msg);
    	}
    	private Rubyv3Parser parser;
    	public void setParser(Rubyv3Parser parser) {
            this.parser = parser;
            }
            public Rubyv3Parser getParser() {
              return this.parser;
            }
            
            private Expression expression;
            public void reset() {
    		super.reset(); // reset all recognizer state variables
    		expression = null;
    	}
            public Token emit() {
    	    MyToken t =
    	        new MyToken(input, type, channel,
    	                    tokenStartCharIndex, getCharIndex()-1);
    	    t.setLine(tokenStartLine);
    	    t.setText(text);
    	    t.setCharPositionInLine(tokenStartCharPositionInLine);
    	    t.expression = expression;
    	    expression = null; //clear out expression
    	    emit(t);
    	    return t;
           }
           private static final boolean isIdentifierChar(int c) {
            return Character.isLetterOrDigit(c) || c == '_';
           }
            public static int nesting = 0;
    
    	private int determineBegin(int begin) {
            int result = 0; //if collide with EOF, then we can use other value like -3,-7 
            if (begin == '[' || begin == '{' || begin == '(' || begin == '<') {
                result = begin;
            } 
            return result;
            }
            private int determineEnd(int begin) {
                    int end = 0;
                    if(begin == '[') {
                        end = ']';
                    } else if(begin == '{') {
                        end = '}';
                    } else if(begin == '(') {
                        end = ')';
                    } else if(begin == '<'){
                        end = '>';
                    } else {
                        end = begin;
                    }
                    return end;
            }
            
            //hand written lexer matcher
            public Expression mHEREDOC_CONTENT(boolean indent) {
                String delimiter = null;int func = 0;StringBuffer tokens = new StringBuffer();
                expression = null;
                int c= input.LA(1);
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='_' && input.LA(1)<='z') ) {
                        input.consume();
    
                    }
                    else {
                        return expression; //not match heredoc
                    }
    
    
                            int end;
                            if (c == '\'' || c == '"' || c == '`') {
                                if (c == '\'') {
                                    func |= str_squote;
                                } else if (c == '"') {
                                    func |= str_dquote;
                                } else {
                                    func |= str_xquote;
                                }
    
    
                                end = c;
                                while ((c = input.LT(1)) != EOF && c != end) {
                                    tokens.append((char)c);
                                    input.consume();
                                }
                                if (c == EOF) {
                                    throw new SyntaxException("unterminated here document identifier");
                                }
                                input.consume(); //consume the end character.
                            } else {
                                /*if (!isIdentifierChar(c)) {
                                    throw new SyntaxException("shouldn't happen");
                                }*/
    
                                func |= str_dquote;
                                tokens.append((char)c);
                                while(true) {
                                c = input.LT(1);
                                if(c == Token.EOF || !isIdentifierChar(c)) {
                                    break;
                                }
                                tokens.append((char)c);
                                input.consume();
                                }
    
                             } //we already consume the last character.
    
                           expression = new HeredocParser(this.parser, input, func, tokens.toString(), indent).parseString();
                           return expression;
            }

    public Rubyv3Lexer() {;} 
    public Rubyv3Lexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g"; }

    // $ANTLR start T109
    public final void mT109() throws RecognitionException {
        try {
            int _type = T109;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:145:8: ( 'begin' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:145:8: 'begin'
            {
            match("begin"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T109

    // $ANTLR start T110
    public final void mT110() throws RecognitionException {
        try {
            int _type = T110;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:146:8: ( 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:146:8: 'end'
            {
            match("end"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T110

    // $ANTLR start T111
    public final void mT111() throws RecognitionException {
        try {
            int _type = T111;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:8: ( 'false' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:8: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T111

    // $ANTLR start T112
    public final void mT112() throws RecognitionException {
        try {
            int _type = T112;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:148:8: ( 'nil' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:148:8: 'nil'
            {
            match("nil"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T112

    // $ANTLR start T113
    public final void mT113() throws RecognitionException {
        try {
            int _type = T113;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:149:8: ( 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:149:8: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T113

    // $ANTLR start T114
    public final void mT114() throws RecognitionException {
        try {
            int _type = T114;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:150:8: ( 'elsif' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:150:8: 'elsif'
            {
            match("elsif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T114

    // $ANTLR start T115
    public final void mT115() throws RecognitionException {
        try {
            int _type = T115;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:8: ( 'else' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:8: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T115

    // $ANTLR start T116
    public final void mT116() throws RecognitionException {
        try {
            int _type = T116;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:152:8: ( 'then' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:152:8: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T116

    // $ANTLR start T117
    public final void mT117() throws RecognitionException {
        try {
            int _type = T117;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:8: ( 'and' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:8: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T117

    // $ANTLR start T118
    public final void mT118() throws RecognitionException {
        try {
            int _type = T118;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: ( 'or' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T118

    // $ANTLR start T119
    public final void mT119() throws RecognitionException {
        try {
            int _type = T119;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:8: ( 'not' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:8: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T119

    // $ANTLR start T120
    public final void mT120() throws RecognitionException {
        try {
            int _type = T120;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:8: ( 'expression0' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:8: 'expression0'
            {
            match("expression0"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T120

    // $ANTLR start T121
    public final void mT121() throws RecognitionException {
        try {
            int _type = T121;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:8: ( 'expression1' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:8: 'expression1'
            {
            match("expression1"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T121

    // $ANTLR start T122
    public final void mT122() throws RecognitionException {
        try {
            int _type = T122;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:8: ( 'expression2' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:8: 'expression2'
            {
            match("expression2"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T122

    // $ANTLR start T123
    public final void mT123() throws RecognitionException {
        try {
            int _type = T123;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:159:8: ( '=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:159:8: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T123

    // $ANTLR start IF_MODIFIER
    public final void mIF_MODIFIER() throws RecognitionException {
        try {
            int _type = IF_MODIFIER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:254:20: ( 'if' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:254:20: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF_MODIFIER

    // $ANTLR start UNLESS_MODIFIER
    public final void mUNLESS_MODIFIER() throws RecognitionException {
        try {
            int _type = UNLESS_MODIFIER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:255:20: ( 'unless' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:255:20: 'unless'
            {
            match("unless"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UNLESS_MODIFIER

    // $ANTLR start WHILE_MODIFIER
    public final void mWHILE_MODIFIER() throws RecognitionException {
        try {
            int _type = WHILE_MODIFIER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:256:20: ( 'while' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:256:20: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHILE_MODIFIER

    // $ANTLR start UNTIL_MODIFIER
    public final void mUNTIL_MODIFIER() throws RecognitionException {
        try {
            int _type = UNTIL_MODIFIER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:257:20: ( 'until' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:257:20: 'until'
            {
            match("until"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UNTIL_MODIFIER

    // $ANTLR start RESCUE_MODIFIER
    public final void mRESCUE_MODIFIER() throws RecognitionException {
        try {
            int _type = RESCUE_MODIFIER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:20: ( 'resuce' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:20: 'resuce'
            {
            match("resuce"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RESCUE_MODIFIER

    // $ANTLR start SEMI
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:7: ( ';' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMI

    // $ANTLR start LINE_BREAK
    public final void mLINE_BREAK() throws RecognitionException {
        try {
            int _type = LINE_BREAK;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:3: ( ( '\\r' )? '\\n' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:3: ( '\\r' )? '\\n'
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:3: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:3: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_BREAK

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:6: ( ( ' ' | '\\t' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:6: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

             skip(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:28: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:29: ( 'a' .. 'z' | 'A' .. 'Z' )
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:53: ( '0' .. '9' )
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:53: ( '0' .. '9' )
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:54: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:4: ( ( '-' )? ( OCTAL | DECIMAL | HEX | BINARY ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:4: ( '-' )? ( OCTAL | DECIMAL | HEX | BINARY )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:4: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:8: ( OCTAL | DECIMAL | HEX | BINARY )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'b':
                    {
                    alt4=4;
                    }
                    break;
                case 'd':
                    {
                    alt4=2;
                    }
                    break;
                case 'x':
                    {
                    alt4=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '_':
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("490:8: ( OCTAL | DECIMAL | HEX | BINARY )", 4, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("490:8: ( OCTAL | DECIMAL | HEX | BINARY )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:9: OCTAL
                    {
                    mOCTAL(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:15: DECIMAL
                    {
                    mDECIMAL(); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:23: HEX
                    {
                    mHEX(); 

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:27: BINARY
                    {
                    mBINARY(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start OCTAL
    public final void mOCTAL() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:9: ( '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:9: '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )*
            {
            match('0'); 
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:13: ( '_' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='_') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:13: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:18: ( '0' .. '7' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:19: '0' .. '7'
            {
            matchRange('0','7'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:29: ( ( '_' )? '0' .. '7' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='7')||LA7_0=='_') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:30: ( '_' )? '0' .. '7'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:30: ( '_' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0=='_') ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:30: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','7'); 

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
    // $ANTLR end OCTAL

    // $ANTLR start DECIMAL
    public final void mDECIMAL() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:1: ( ( '0d' )? ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:1: ( '0d' )? ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:1: ( '0d' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='0') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:2: '0d'
                    {
                    match("0d"); 


                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:8: ( '1' .. '9' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:9: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:19: ( ( '_' )? '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||LA10_0=='_') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:20: ( '_' )? '0' .. '9'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:20: ( '_' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0=='_') ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:20: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end DECIMAL

    // $ANTLR start HEX
    public final void mHEX() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:7: ( '0x' HEX_PART ( ( '_' )? HEX_PART )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:7: '0x' HEX_PART ( ( '_' )? HEX_PART )*
            {
            match("0x"); 

            mHEX_PART(); 
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:21: ( ( '_' )? HEX_PART )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='F')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='f')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:22: ( '_' )? HEX_PART
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:22: ( '_' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0=='_') ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:22: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mHEX_PART(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end HEX

    // $ANTLR start HEX_PART
    public final void mHEX_PART() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:501:4: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:501:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HEX_PART

    // $ANTLR start BINARY
    public final void mBINARY() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:10: ( '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:10: '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )*
            {
            match("0b"); 

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:14: ( '0' .. '1' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:15: '0' .. '1'
            {
            matchRange('0','1'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:25: ( ( '_' )? '0' .. '1' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='1')||LA14_0=='_') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:26: ( '_' )? '0' .. '1'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:26: ( '_' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0=='_') ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:26: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','1'); 

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
    // $ANTLR end BINARY

    // $ANTLR start ESCAPE_INT
    public final void mESCAPE_INT() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:23: ( ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:23: ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:23: ( CONTROL_PART | META_PART )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\\') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='C'||LA15_1=='c') ) {
                        alt15=1;
                    }
                    else if ( (LA15_1=='M') ) {
                        alt15=2;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:24: CONTROL_PART
            	    {
            	    mCONTROL_PART(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:37: META_PART
            	    {
            	    mMETA_PART(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\\') ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>='\u0000' && LA16_1<='B')||(LA16_1>='D' && LA16_1<='L')||(LA16_1>='N' && LA16_1<='b')||(LA16_1>='d' && LA16_1<='\uFFFE')) ) {
                    alt16=3;
                }
                else {
                    alt16=1;}
            }
            else if ( ((LA16_0>='\u0093' && LA16_0<='\u0255')) ) {
                alt16=2;
            }
            else if ( ((LA16_0>='\u0000' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\u0091')) ) {
                alt16=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("509:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:50: '\\u0000' .. '\\u0091'
                    {
                    matchRange('\u0000','\u0091'); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:73: '\\u0093' .. '\\u0255'
                    {
                    matchRange('\u0093','\u0255'); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:94: ESCAPE_INT_PART
                    {
                    mESCAPE_INT_PART(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ESCAPE_INT

    // $ANTLR start CONTROL_PART
    public final void mCONTROL_PART() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:513:4: ( ( '\\\\C-' | '\\\\c' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:513:4: ( '\\\\C-' | '\\\\c' )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:513:4: ( '\\\\C-' | '\\\\c' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\\') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='c') ) {
                    alt17=2;
                }
                else if ( (LA17_1=='C') ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("513:4: ( '\\\\C-' | '\\\\c' )", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("513:4: ( '\\\\C-' | '\\\\c' )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:513:5: '\\\\C-'
                    {
                    match("\\C-"); 


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:513:12: '\\\\c'
                    {
                    match("\\c"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end CONTROL_PART

    // $ANTLR start META_PART
    public final void mMETA_PART() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:4: ( '\\\\M-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:4: '\\\\M-'
            {
            match("\\M-"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end META_PART

    // $ANTLR start FLOAT
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:9: ( ( '-' )? ( NON_LEADING0_NUMBER | '0' ) ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:9: ( '-' )? ( NON_LEADING0_NUMBER | '0' ) ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:9: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:9: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:13: ( NON_LEADING0_NUMBER | '0' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='1' && LA19_0<='9')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='0') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("520:13: ( NON_LEADING0_NUMBER | '0' )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:15: NON_LEADING0_NUMBER
                    {
                    mNON_LEADING0_NUMBER(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:37: '0'
                    {
                    match('0'); 

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:42: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='E'||LA21_0=='e') ) {
                alt21=1;
            }
            else if ( (LA21_0=='.') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("520:42: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:43: EXP_PART
                    {
                    mEXP_PART(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:54: '.' LEADING0_NUMBER ( EXP_PART )?
                    {
                    match('.'); 
                    mLEADING0_NUMBER(); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:74: ( EXP_PART )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:74: EXP_PART
                            {
                            mEXP_PART(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOAT

    // $ANTLR start NON_LEADING0_NUMBER
    public final void mNON_LEADING0_NUMBER() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:3: ( ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:3: ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:3: ( '1' .. '9' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:4: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:14: ( ( '_' )? '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||LA23_0=='_') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:15: ( '_' )? '0' .. '9'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:15: ( '_' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0=='_') ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:15: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end NON_LEADING0_NUMBER

    // $ANTLR start LEADING0_NUMBER
    public final void mLEADING0_NUMBER() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:3: ( ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:3: ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:3: ( '0' .. '9' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:14: ( ( '_' )? '0' .. '9' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||LA25_0=='_') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:15: ( '_' )? '0' .. '9'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:15: ( '_' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0=='_') ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:15: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end LEADING0_NUMBER

    // $ANTLR start EXP_PART
    public final void mEXP_PART() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:528:11: ( ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:528:11: ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:528:23: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='-') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:528:23: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mLEADING0_NUMBER(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end EXP_PART

    // $ANTLR start SINGLE_QUOTE_STRING
    public final void mSINGLE_QUOTE_STRING() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTE_STRING;
            int end=0; int nested=0;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:35: ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' | '%q' begin= . (tmp= . )* )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\'') ) {
                alt29=1;
            }
            else if ( (LA29_0=='%') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("532:1: SINGLE_QUOTE_STRING : ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' | '%q' begin= . (tmp= . )* );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:35: '\\'' ( SINGLE_STRING_CHAR )* '\\''
                    {
                    match('\''); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:40: ( SINGLE_STRING_CHAR )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>='\u0000' && LA27_0<='&')||(LA27_0>='(' && LA27_0<='\uFFFE')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:40: SINGLE_STRING_CHAR
                    	    {
                    	    mSINGLE_STRING_CHAR(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:4: '%q' begin= . (tmp= . )*
                    {
                    match("%q"); 

                    int begin = input.LA(1);
                    matchAny(); 
                    System.out.println(begin); end=determineEnd(begin);begin=determineBegin(begin); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:103: (tmp= . )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>='\u0000' && LA28_0<='\uFFFE')) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:104: tmp= .
                    	    {
                    	    int tmp = input.LA(1);
                    	    matchAny(); 
                    	    System.out.println(tmp);
                    	    	                    if(tmp == EOF) {
                    	    	                      throw new SyntaxException("unterminated string meets end of file");
                    	    	                    } else if(tmp == '\\') {
                    	    	                      int c = input.LA(1);
                    	    	                      if(c == EOF) {
                    	    	                         throw new SyntaxException("unterminated string meets end of file");
                    	    	                      } else if (c == begin || c == end || c == '\\') {
                    	    	                         //tokens.add();
                    	    	                         input.consume();
                    	    	                      }
                    	    	                    }else if(tmp==begin) {
                    	                                    nested ++;
                    	                                } else if(tmp==end)  {
                    	                                    
                    	                                    if(nested == 0) {
                    	                                    this.type=SINGLE_QUOTE_STRING;
                    	                                    return;
                    	                                    }
                    	                                    nested --;
                    	                                }
                    	                                

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SINGLE_QUOTE_STRING

    // $ANTLR start SINGLE_STRING_CHAR
    public final void mSINGLE_STRING_CHAR() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:6: ( '\\\\' . | ~ ( '\\\\' | '\\'' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\\') ) {
                alt30=1;
            }
            else if ( ((LA30_0>='\u0000' && LA30_0<='&')||(LA30_0>='(' && LA30_0<='[')||(LA30_0>=']' && LA30_0<='\uFFFE')) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("556:1: fragment SINGLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\\'' ) );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:6: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:15: ~ ( '\\\\' | '\\'' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end SINGLE_STRING_CHAR

    // $ANTLR start DOUBLE_STRING_CHAR
    public final void mDOUBLE_STRING_CHAR() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:561:4: ( '\\\\' . | ~ ( '\\\\' | '\"' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\\') ) {
                alt31=1;
            }
            else if ( ((LA31_0>='\u0000' && LA31_0<='!')||(LA31_0>='#' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\uFFFE')) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("559:1: fragment DOUBLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\"' ) );", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:561:4: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:561:13: ~ ( '\\\\' | '\"' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE_STRING_CHAR

    // $ANTLR start DOUBLE_QUOTE_STRING
    public final void mDOUBLE_QUOTE_STRING() throws RecognitionException {
        try {
            int _type = DOUBLE_QUOTE_STRING;
            int end=0; int nested=0;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:35: (s= ( '\"' | '%Q' begin= . ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:35: s= ( '\"' | '%Q' begin= . )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:37: ( '\"' | '%Q' begin= . )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\"') ) {
                alt32=1;
            }
            else if ( (LA32_0=='%') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("563:37: ( '\"' | '%Q' begin= . )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:38: '\"'
                    {
                    match('\"'); 
                    expression = new DoubleStringParser(this.parser, input, '"', 0).parseString();

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:126: '%Q' begin= .
                    {
                    match("%Q"); 

                    int begin = input.LA(1);
                    matchAny(); 
                    end=determineEnd(begin);begin=determineBegin(begin); 
                    	expression = new DoubleStringParser(this.parser, input, end, begin).parseString(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE_QUOTE_STRING

    // $ANTLR start LCURLY
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:11: ( '{' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:11: '{'
            {
            match('{'); 
            nesting++; System.out.println("meeting LCURLY with nesting:" + nesting);

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LCURLY

    // $ANTLR start RCURLY
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:11: ( '}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:11: '}'
            {
            match('}'); 
            
                      if ( nesting<=0 ) {
                            token=Token.EOF_TOKEN;
                            System.out.println("exiting embedded simple with nesting:" + nesting);
                      }
                      else {
                            nesting--;
                      }
                      

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCURLY

    // $ANTLR start ESCAPE_INT_PART
    public final void mESCAPE_INT_PART() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:4: ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\\') ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1=='x') ) {
                    alt35=2;
                }
                else if ( ((LA35_1>='\u0000' && LA35_1<='/')||(LA35_1>='8' && LA35_1<='B')||(LA35_1>='D' && LA35_1<='L')||(LA35_1>='N' && LA35_1<='b')||(LA35_1>='d' && LA35_1<='w')||(LA35_1>='y' && LA35_1<='\uFFFE')) ) {
                    alt35=3;
                }
                else if ( ((LA35_1>='0' && LA35_1<='7')) ) {
                    alt35=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("584:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("584:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:4: '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    int alt33=3;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>='0' && LA33_0<='7')) ) {
                        int LA33_1 = input.LA(2);

                        if ( ((LA33_1>='0' && LA33_1<='7')) ) {
                            int LA33_2 = input.LA(3);

                            if ( ((LA33_2>='0' && LA33_2<='7')) ) {
                                alt33=3;
                            }
                            else {
                                alt33=2;}
                        }
                        else {
                            alt33=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("586:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:10: '0' .. '7'
                            {
                            matchRange('0','7'); 

                            }
                            break;
                        case 2 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:21: '0' .. '7' '0' .. '7'
                            {
                            matchRange('0','7'); 
                            matchRange('0','7'); 

                            }
                            break;
                        case 3 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:41: '0' .. '7' '0' .. '7' '0' .. '7'
                            {
                            matchRange('0','7'); 
                            matchRange('0','7'); 
                            matchRange('0','7'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:10: '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART )
                    {
                    match('\\'); 
                    match('x'); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:19: ( HEX_PART | HEX_PART HEX_PART )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>='0' && LA34_0<='9')||(LA34_0>='A' && LA34_0<='F')||(LA34_0>='a' && LA34_0<='f')) ) {
                        int LA34_1 = input.LA(2);

                        if ( ((LA34_1>='0' && LA34_1<='9')||(LA34_1>='A' && LA34_1<='F')||(LA34_1>='a' && LA34_1<='f')) ) {
                            alt34=2;
                        }
                        else {
                            alt34=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("587:19: ( HEX_PART | HEX_PART HEX_PART )", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:20: HEX_PART
                            {
                            mHEX_PART(); 

                            }
                            break;
                        case 2 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:29: HEX_PART HEX_PART
                            {
                            mHEX_PART(); 
                            mHEX_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:10: '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' )
                    {
                    match('\\'); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='/')||(input.LA(1)>='8' && input.LA(1)<='B')||(input.LA(1)>='D' && input.LA(1)<='L')||(input.LA(1)>='N' && input.LA(1)<='b')||(input.LA(1)>='d' && input.LA(1)<='w')||(input.LA(1)>='y' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end ESCAPE_INT_PART

    // $ANTLR start HEREDOC_BEGIN
    public final void mHEREDOC_BEGIN() throws RecognitionException {
        try {
            int _type = HEREDOC_BEGIN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:4: ( '<<' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:4: '<<'
            {
            match("<<"); 

            if(Character.isWhitespace(input.LT(1))) {_type = LEFT_SHIFT;}

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HEREDOC_BEGIN

    // $ANTLR start HEREDOC_INDENT_BEGIN
    public final void mHEREDOC_INDENT_BEGIN() throws RecognitionException {
        try {
            int _type = HEREDOC_INDENT_BEGIN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:4: ( '<<-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:4: '<<-'
            {
            match("<<-"); 

            if(Character.isWhitespace(input.LT(1))) {_type = LEFT_SHIFT;}

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HEREDOC_INDENT_BEGIN

    // $ANTLR start ARRAY
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:9: ( '[]' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:9: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ARRAY

    // $ANTLR start HASH
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:601:8: ( '{}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:601:8: '{}'
            {
            match("{}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HASH

    // $ANTLR start RANGE
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:9: ( 'a..b' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:9: 'a..b'
            {
            match("a..b"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RANGE

    // $ANTLR start REGEX
    public final void mREGEX() throws RecognitionException {
        try {
            int _type = REGEX;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:603:9: ( '/abc/' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:603:9: '/abc/'
            {
            match("/abc/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end REGEX

    // $ANTLR start SYMBOL
    public final void mSYMBOL() throws RecognitionException {
        try {
            int _type = SYMBOL;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:10: ( ':abc' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:10: ':abc'
            {
            match(":abc"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SYMBOL

    // $ANTLR start PLUS_ASSIGN
    public final void mPLUS_ASSIGN() throws RecognitionException {
        try {
            int _type = PLUS_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:606:17: ( '+=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:606:17: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS_ASSIGN

    // $ANTLR start MINUS_ASSIGN
    public final void mMINUS_ASSIGN() throws RecognitionException {
        try {
            int _type = MINUS_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:607:17: ( '-=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:607:17: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS_ASSIGN

    // $ANTLR start STAR_ASSIGN
    public final void mSTAR_ASSIGN() throws RecognitionException {
        try {
            int _type = STAR_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:608:17: ( '*=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:608:17: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR_ASSIGN

    // $ANTLR start DIV_ASSIGN
    public final void mDIV_ASSIGN() throws RecognitionException {
        try {
            int _type = DIV_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:15: ( '/=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:15: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV_ASSIGN

    // $ANTLR start MOD_ASSIGN
    public final void mMOD_ASSIGN() throws RecognitionException {
        try {
            int _type = MOD_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:15: ( '%=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:15: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD_ASSIGN

    // $ANTLR start POWER_ASSIGN
    public final void mPOWER_ASSIGN() throws RecognitionException {
        try {
            int _type = POWER_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:17: ( '**=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:17: '**='
            {
            match("**="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end POWER_ASSIGN

    // $ANTLR start BAND_ASSIGN
    public final void mBAND_ASSIGN() throws RecognitionException {
        try {
            int _type = BAND_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:612:17: ( '&=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:612:17: '&='
            {
            match("&="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BAND_ASSIGN

    // $ANTLR start BXOR_ASSIGN
    public final void mBXOR_ASSIGN() throws RecognitionException {
        try {
            int _type = BXOR_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:17: ( '^=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:17: '^='
            {
            match("^="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BXOR_ASSIGN

    // $ANTLR start BOR_ASSIGN
    public final void mBOR_ASSIGN() throws RecognitionException {
        try {
            int _type = BOR_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:614:16: ( '|=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:614:16: '|='
            {
            match("|="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BOR_ASSIGN

    // $ANTLR start LEFT_SHIFT_ASSIGN
    public final void mLEFT_SHIFT_ASSIGN() throws RecognitionException {
        try {
            int _type = LEFT_SHIFT_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:21: ( '<<=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:21: '<<='
            {
            match("<<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFT_SHIFT_ASSIGN

    // $ANTLR start RIGHT_SHIFT_ASSIGN
    public final void mRIGHT_SHIFT_ASSIGN() throws RecognitionException {
        try {
            int _type = RIGHT_SHIFT_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:22: ( '>>=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:22: '>>='
            {
            match(">>="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHT_SHIFT_ASSIGN

    // $ANTLR start LOGICAL_AND_ASSIGN
    public final void mLOGICAL_AND_ASSIGN() throws RecognitionException {
        try {
            int _type = LOGICAL_AND_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:22: ( '&&=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:22: '&&='
            {
            match("&&="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOGICAL_AND_ASSIGN

    // $ANTLR start LOGICAL_OR_ASSIGN
    public final void mLOGICAL_OR_ASSIGN() throws RecognitionException {
        try {
            int _type = LOGICAL_OR_ASSIGN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:21: ( '||=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:21: '||='
            {
            match("||="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOGICAL_OR_ASSIGN

    // $ANTLR start INCLUSIVE_RANGE
    public final void mINCLUSIVE_RANGE() throws RecognitionException {
        try {
            int _type = INCLUSIVE_RANGE;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:619:23: ( '..' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:619:23: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INCLUSIVE_RANGE

    // $ANTLR start EXCLUSIVE_RANGE
    public final void mEXCLUSIVE_RANGE() throws RecognitionException {
        try {
            int _type = EXCLUSIVE_RANGE;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:23: ( '...' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:23: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXCLUSIVE_RANGE

    // $ANTLR start ASSOC
    public final void mASSOC() throws RecognitionException {
        try {
            int _type = ASSOC;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:12: ( '=>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:12: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASSOC

    // $ANTLR start LOGICAL_AND
    public final void mLOGICAL_AND() throws RecognitionException {
        try {
            int _type = LOGICAL_AND;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:17: ( '&&' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:17: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOGICAL_AND

    // $ANTLR start LOGICAL_OR
    public final void mLOGICAL_OR() throws RecognitionException {
        try {
            int _type = LOGICAL_OR;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:16: ( '||' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:16: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOGICAL_OR

    // $ANTLR start QUESTION
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:14: ( '?' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:14: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QUESTION

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:627:13: ( '(' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:627:13: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:628:13: ( ')' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:628:13: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LBRACK
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:13: ( '[' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:13: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LBRACK

    // $ANTLR start RBRACK
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:13: ( ']' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:13: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RBRACK

    // $ANTLR start EMPTY_ARRAY
    public final void mEMPTY_ARRAY() throws RecognitionException {
        try {
            int _type = EMPTY_ARRAY;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:631:16: ( '[]' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:631:16: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EMPTY_ARRAY

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:634:12: ( ',' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:634:12: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:635:12: ( ':' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:635:12: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start COLON2
    public final void mCOLON2() throws RecognitionException {
        try {
            int _type = COLON2;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:13: ( '::' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:13: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON2

    // $ANTLR start NOT
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:638:11: ( '!' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:638:11: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT

    // $ANTLR start BNOT
    public final void mBNOT() throws RecognitionException {
        try {
            int _type = BNOT;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:11: ( '~' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:11: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BNOT

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:11: ( '+' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:11: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:642:12: ( '-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:642:12: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start STAR
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:644:11: ( '*' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:644:11: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR

    // $ANTLR start LESS_THAN
    public final void mLESS_THAN() throws RecognitionException {
        try {
            int _type = LESS_THAN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:15: ( '<' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:15: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESS_THAN

    // $ANTLR start GREATER_THAN
    public final void mGREATER_THAN() throws RecognitionException {
        try {
            int _type = GREATER_THAN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:646:17: ( '>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:646:17: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATER_THAN

    // $ANTLR start BXOR
    public final void mBXOR() throws RecognitionException {
        try {
            int _type = BXOR;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:647:11: ( '^' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:647:11: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BXOR

    // $ANTLR start BOR
    public final void mBOR() throws RecognitionException {
        try {
            int _type = BOR;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:11: ( '|' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:11: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BOR

    // $ANTLR start BAND
    public final void mBAND() throws RecognitionException {
        try {
            int _type = BAND;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:649:11: ( '&' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:649:11: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BAND

    // $ANTLR start POWER
    public final void mPOWER() throws RecognitionException {
        try {
            int _type = POWER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:650:12: ( '**' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:650:12: '**'
            {
            match("**"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end POWER

    // $ANTLR start COMPARE
    public final void mCOMPARE() throws RecognitionException {
        try {
            int _type = COMPARE;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:651:14: ( '<=>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:651:14: '<=>'
            {
            match("<=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMPARE

    // $ANTLR start GREATER_OR_EQUAL
    public final void mGREATER_OR_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_OR_EQUAL;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:652:20: ( '>=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:652:20: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATER_OR_EQUAL

    // $ANTLR start LESS_OR_EQUAL
    public final void mLESS_OR_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_OR_EQUAL;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:653:18: ( '<=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:653:18: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESS_OR_EQUAL

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:654:12: ( '==' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:654:12: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start CASE_EQUAL
    public final void mCASE_EQUAL() throws RecognitionException {
        try {
            int _type = CASE_EQUAL;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:655:16: ( '===' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:655:16: '==='
            {
            match("==="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CASE_EQUAL

    // $ANTLR start NOT_EQUAL
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:656:15: ( '!=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:656:15: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT_EQUAL

    // $ANTLR start MATCH
    public final void mMATCH() throws RecognitionException {
        try {
            int _type = MATCH;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:12: ( '=~' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:12: '=~'
            {
            match("=~"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MATCH

    // $ANTLR start NOT_MATCH
    public final void mNOT_MATCH() throws RecognitionException {
        try {
            int _type = NOT_MATCH;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:15: ( '!~' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:15: '!~'
            {
            match("!~"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT_MATCH

    // $ANTLR start RIGHT_SHIFT
    public final void mRIGHT_SHIFT() throws RecognitionException {
        try {
            int _type = RIGHT_SHIFT;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:660:17: ( '>>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:660:17: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHT_SHIFT

    public void mTokens() throws RecognitionException {
        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: ( T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | ID | INT | FLOAT | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | HASH | RANGE | REGEX | SYMBOL | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | COLON2 | NOT | BNOT | PLUS | MINUS | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT )
        int alt36=84;
        alt36 = dfa36.predict(input);
        switch (alt36) {
            case 1 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: T109
                {
                mT109(); 

                }
                break;
            case 2 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:15: T110
                {
                mT110(); 

                }
                break;
            case 3 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:20: T111
                {
                mT111(); 

                }
                break;
            case 4 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:25: T112
                {
                mT112(); 

                }
                break;
            case 5 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:30: T113
                {
                mT113(); 

                }
                break;
            case 6 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:35: T114
                {
                mT114(); 

                }
                break;
            case 7 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:40: T115
                {
                mT115(); 

                }
                break;
            case 8 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:45: T116
                {
                mT116(); 

                }
                break;
            case 9 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:50: T117
                {
                mT117(); 

                }
                break;
            case 10 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:55: T118
                {
                mT118(); 

                }
                break;
            case 11 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:60: T119
                {
                mT119(); 

                }
                break;
            case 12 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:65: T120
                {
                mT120(); 

                }
                break;
            case 13 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:70: T121
                {
                mT121(); 

                }
                break;
            case 14 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:75: T122
                {
                mT122(); 

                }
                break;
            case 15 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:80: T123
                {
                mT123(); 

                }
                break;
            case 16 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:85: IF_MODIFIER
                {
                mIF_MODIFIER(); 

                }
                break;
            case 17 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:97: UNLESS_MODIFIER
                {
                mUNLESS_MODIFIER(); 

                }
                break;
            case 18 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:113: WHILE_MODIFIER
                {
                mWHILE_MODIFIER(); 

                }
                break;
            case 19 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:128: UNTIL_MODIFIER
                {
                mUNTIL_MODIFIER(); 

                }
                break;
            case 20 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:143: RESCUE_MODIFIER
                {
                mRESCUE_MODIFIER(); 

                }
                break;
            case 21 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:159: SEMI
                {
                mSEMI(); 

                }
                break;
            case 22 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:164: LINE_BREAK
                {
                mLINE_BREAK(); 

                }
                break;
            case 23 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:175: WS
                {
                mWS(); 

                }
                break;
            case 24 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:178: ID
                {
                mID(); 

                }
                break;
            case 25 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:181: INT
                {
                mINT(); 

                }
                break;
            case 26 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:185: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 27 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:191: SINGLE_QUOTE_STRING
                {
                mSINGLE_QUOTE_STRING(); 

                }
                break;
            case 28 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:211: DOUBLE_QUOTE_STRING
                {
                mDOUBLE_QUOTE_STRING(); 

                }
                break;
            case 29 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:231: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 30 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:238: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 31 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:245: HEREDOC_BEGIN
                {
                mHEREDOC_BEGIN(); 

                }
                break;
            case 32 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:259: HEREDOC_INDENT_BEGIN
                {
                mHEREDOC_INDENT_BEGIN(); 

                }
                break;
            case 33 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:280: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 34 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:286: HASH
                {
                mHASH(); 

                }
                break;
            case 35 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:291: RANGE
                {
                mRANGE(); 

                }
                break;
            case 36 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:297: REGEX
                {
                mREGEX(); 

                }
                break;
            case 37 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:303: SYMBOL
                {
                mSYMBOL(); 

                }
                break;
            case 38 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:310: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); 

                }
                break;
            case 39 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:322: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); 

                }
                break;
            case 40 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:335: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); 

                }
                break;
            case 41 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:347: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 

                }
                break;
            case 42 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:358: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 

                }
                break;
            case 43 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:369: POWER_ASSIGN
                {
                mPOWER_ASSIGN(); 

                }
                break;
            case 44 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:382: BAND_ASSIGN
                {
                mBAND_ASSIGN(); 

                }
                break;
            case 45 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:394: BXOR_ASSIGN
                {
                mBXOR_ASSIGN(); 

                }
                break;
            case 46 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:406: BOR_ASSIGN
                {
                mBOR_ASSIGN(); 

                }
                break;
            case 47 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:417: LEFT_SHIFT_ASSIGN
                {
                mLEFT_SHIFT_ASSIGN(); 

                }
                break;
            case 48 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:435: RIGHT_SHIFT_ASSIGN
                {
                mRIGHT_SHIFT_ASSIGN(); 

                }
                break;
            case 49 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:454: LOGICAL_AND_ASSIGN
                {
                mLOGICAL_AND_ASSIGN(); 

                }
                break;
            case 50 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:473: LOGICAL_OR_ASSIGN
                {
                mLOGICAL_OR_ASSIGN(); 

                }
                break;
            case 51 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:491: INCLUSIVE_RANGE
                {
                mINCLUSIVE_RANGE(); 

                }
                break;
            case 52 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:507: EXCLUSIVE_RANGE
                {
                mEXCLUSIVE_RANGE(); 

                }
                break;
            case 53 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:523: ASSOC
                {
                mASSOC(); 

                }
                break;
            case 54 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:529: LOGICAL_AND
                {
                mLOGICAL_AND(); 

                }
                break;
            case 55 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:541: LOGICAL_OR
                {
                mLOGICAL_OR(); 

                }
                break;
            case 56 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:552: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 57 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:561: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 58 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:568: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 59 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:575: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 60 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:582: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 61 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:589: EMPTY_ARRAY
                {
                mEMPTY_ARRAY(); 

                }
                break;
            case 62 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:601: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 63 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:607: COLON
                {
                mCOLON(); 

                }
                break;
            case 64 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:613: COLON2
                {
                mCOLON2(); 

                }
                break;
            case 65 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:620: NOT
                {
                mNOT(); 

                }
                break;
            case 66 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:624: BNOT
                {
                mBNOT(); 

                }
                break;
            case 67 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:629: PLUS
                {
                mPLUS(); 

                }
                break;
            case 68 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:634: MINUS
                {
                mMINUS(); 

                }
                break;
            case 69 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:640: STAR
                {
                mSTAR(); 

                }
                break;
            case 70 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:645: LESS_THAN
                {
                mLESS_THAN(); 

                }
                break;
            case 71 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:655: GREATER_THAN
                {
                mGREATER_THAN(); 

                }
                break;
            case 72 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:668: BXOR
                {
                mBXOR(); 

                }
                break;
            case 73 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:673: BOR
                {
                mBOR(); 

                }
                break;
            case 74 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:677: BAND
                {
                mBAND(); 

                }
                break;
            case 75 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:682: POWER
                {
                mPOWER(); 

                }
                break;
            case 76 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:688: COMPARE
                {
                mCOMPARE(); 

                }
                break;
            case 77 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:696: GREATER_OR_EQUAL
                {
                mGREATER_OR_EQUAL(); 

                }
                break;
            case 78 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:713: LESS_OR_EQUAL
                {
                mLESS_OR_EQUAL(); 

                }
                break;
            case 79 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:727: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 80 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:733: CASE_EQUAL
                {
                mCASE_EQUAL(); 

                }
                break;
            case 81 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:744: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 82 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:754: MATCH
                {
                mMATCH(); 

                }
                break;
            case 83 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:760: NOT_MATCH
                {
                mNOT_MATCH(); 

                }
                break;
            case 84 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:770: RIGHT_SHIFT
                {
                mRIGHT_SHIFT(); 

                }
                break;

        }

    }


    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA36_eotS =
        "\1\uffff\7\20\1\72\4\20\4\uffff\1\100\1\uffff\1\101\3\uffff\1\107"+
        "\1\uffff\1\112\1\114\1\uffff\1\121\1\123\1\126\1\131\1\133\1\136"+
        "\1\141\6\uffff\1\145\1\uffff\11\20\1\uffff\1\20\1\160\1\uffff\1"+
        "\162\2\uffff\1\163\3\20\5\uffff\1\101\3\uffff\1\171\1\174\12\uffff"+
        "\1\177\3\uffff\1\u0081\3\uffff\1\u0083\3\uffff\1\u0085\1\uffff\1"+
        "\u0087\3\uffff\1\20\1\u0089\3\20\1\u008e\1\u008f\2\20\1\u0092\4"+
        "\uffff\4\20\20\uffff\1\20\1\uffff\2\20\1\u009a\1\20\2\uffff\1\u009c"+
        "\1\u009d\1\uffff\4\20\1\u00a2\1\20\1\u00a4\1\uffff\1\u00a5\2\uffff"+
        "\1\20\1\u00a7\1\u00a8\1\20\1\uffff\1\20\2\uffff\1\u00ab\2\uffff"+
        "\1\u00ac\1\20\2\uffff\3\20\1\u00b3\1\u00b4\1\u00b5\3\uffff";
    static final String DFA36_eofS =
        "\u00b6\uffff";
    static final String DFA36_minS =
        "\1\11\1\145\1\154\1\141\1\151\1\150\1\56\1\162\1\75\1\146\1\156"+
        "\1\150\1\145\4\uffff\1\60\2\56\1\uffff\1\75\1\uffff\1\175\1\uffff"+
        "\1\74\1\135\1\75\1\72\1\75\1\52\1\46\3\75\1\56\5\uffff\1\75\1\uffff"+
        "\1\147\1\144\1\160\1\163\1\154\1\164\1\154\1\165\1\145\1\uffff\1"+
        "\144\1\60\1\uffff\1\75\2\uffff\1\60\1\154\1\151\1\163\4\uffff\1"+
        "\60\1\56\3\uffff\1\76\1\55\12\uffff\1\75\3\uffff\1\75\3\uffff\1"+
        "\75\3\uffff\1\75\1\uffff\1\56\3\uffff\1\151\1\60\1\162\1\145\1\163"+
        "\2\60\1\145\1\156\1\60\4\uffff\1\145\1\151\1\154\1\165\20\uffff"+
        "\1\156\1\uffff\1\145\1\146\1\60\1\145\2\uffff\2\60\1\uffff\1\163"+
        "\1\154\1\145\1\143\1\60\1\163\1\60\1\uffff\1\60\2\uffff\1\163\2"+
        "\60\1\145\1\uffff\1\163\2\uffff\1\60\2\uffff\1\60\1\151\2\uffff"+
        "\1\157\1\156\4\60\3\uffff";
    static final String DFA36_maxS =
        "\1\176\1\145\1\170\1\141\1\157\1\162\1\156\1\162\1\176\1\146\1\156"+
        "\1\150\1\145\4\uffff\1\75\1\170\1\145\1\uffff\1\161\1\uffff\1\175"+
        "\1\uffff\1\75\1\135\2\141\4\75\1\174\1\76\1\56\5\uffff\1\176\1\uffff"+
        "\1\147\1\144\1\160\1\163\1\154\1\164\1\154\1\165\1\145\1\uffff\1"+
        "\144\1\172\1\uffff\1\75\2\uffff\1\172\1\164\1\151\1\163\4\uffff"+
        "\1\71\1\145\3\uffff\1\76\1\75\12\uffff\1\75\3\uffff\1\75\3\uffff"+
        "\1\75\3\uffff\1\75\1\uffff\1\56\3\uffff\1\151\1\172\1\162\1\151"+
        "\1\163\2\172\1\145\1\156\1\172\4\uffff\1\145\1\151\1\154\1\165\20"+
        "\uffff\1\156\1\uffff\1\145\1\146\1\172\1\145\2\uffff\2\172\1\uffff"+
        "\1\163\1\154\1\145\1\143\1\172\1\163\1\172\1\uffff\1\172\2\uffff"+
        "\1\163\2\172\1\145\1\uffff\1\163\2\uffff\1\172\2\uffff\1\172\1\151"+
        "\2\uffff\1\157\1\156\1\62\3\172\3\uffff";
    static final String DFA36_acceptS =
        "\15\uffff\1\25\1\26\1\27\1\30\3\uffff\1\33\1\uffff\1\34\1\uffff"+
        "\1\36\13\uffff\1\70\1\71\1\72\1\74\1\76\1\uffff\1\102\11\uffff\1"+
        "\43\2\uffff\1\65\1\uffff\1\122\1\17\4\uffff\1\47\1\104\1\31\1\32"+
        "\2\uffff\1\52\1\42\1\35\2\uffff\1\106\1\41\1\73\1\51\1\44\1\100"+
        "\1\45\1\77\1\46\1\103\1\uffff\1\50\1\105\1\54\1\uffff\1\112\1\55"+
        "\1\110\1\uffff\1\56\1\111\1\115\1\uffff\1\107\1\uffff\1\123\1\121"+
        "\1\101\12\uffff\1\12\1\120\1\117\1\20\4\uffff\1\114\1\116\1\57\1"+
        "\40\1\37\1\41\1\53\1\113\1\61\1\66\1\62\1\67\1\60\1\124\1\64\1\63"+
        "\1\uffff\1\2\4\uffff\1\13\1\4\2\uffff\1\11\7\uffff\1\7\1\uffff\1"+
        "\5\1\10\4\uffff\1\1\1\uffff\1\6\1\3\1\uffff\1\23\1\22\2\uffff\1"+
        "\21\1\24\6\uffff\1\15\1\16\1\14";
    static final String DFA36_specialS =
        "\u00b6\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\17\1\16\2\uffff\1\16\22\uffff\1\17\1\51\1\26\2\uffff\1\25"+
            "\1\37\1\24\1\45\1\46\1\36\1\35\1\50\1\21\1\43\1\33\1\22\11\23"+
            "\1\34\1\15\1\31\1\10\1\42\1\44\1\uffff\32\20\1\32\1\uffff\1"+
            "\47\1\40\2\uffff\1\6\1\1\2\20\1\2\1\3\2\20\1\11\4\20\1\4\1\7"+
            "\2\20\1\14\1\20\1\5\1\12\1\20\1\13\3\20\1\27\1\41\1\30\1\52",
            "\1\53",
            "\1\56\1\uffff\1\54\11\uffff\1\55",
            "\1\57",
            "\1\61\5\uffff\1\60",
            "\1\63\11\uffff\1\62",
            "\1\64\77\uffff\1\65",
            "\1\66",
            "\1\70\1\67\77\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "\1\22\11\23\3\uffff\1\77",
            "\1\102\1\uffff\10\101\15\uffff\1\102\31\uffff\1\101\2\uffff"+
            "\1\101\1\uffff\1\101\1\102\22\uffff\1\101",
            "\1\102\1\uffff\12\104\13\uffff\1\102\31\uffff\1\103\5\uffff"+
            "\1\102",
            "",
            "\1\105\23\uffff\1\26\37\uffff\1\24",
            "",
            "\1\106",
            "",
            "\1\111\1\110",
            "\1\113",
            "\1\115\43\uffff\1\116",
            "\1\117\46\uffff\1\120",
            "\1\122",
            "\1\124\22\uffff\1\125",
            "\1\130\26\uffff\1\127",
            "\1\132",
            "\1\135\76\uffff\1\134",
            "\1\137\1\140",
            "\1\142",
            "",
            "",
            "",
            "",
            "",
            "\1\144\100\uffff\1\143",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "\1\161",
            "",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\164\7\uffff\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "",
            "\12\104",
            "\1\102\1\uffff\12\104\13\uffff\1\102\31\uffff\1\103\5\uffff"+
            "\1\102",
            "",
            "",
            "",
            "\1\170",
            "\1\173\17\uffff\1\172",
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
            "\1\176",
            "",
            "",
            "",
            "\1\u0080",
            "",
            "",
            "",
            "\1\u0082",
            "",
            "",
            "",
            "\1\u0084",
            "",
            "\1\u0086",
            "",
            "",
            "",
            "\1\u0088",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\u008a",
            "\1\u008c\3\uffff\1\u008b",
            "\1\u008d",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\u0090",
            "\1\u0091",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
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
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\u009b",
            "",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\u00a3",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "",
            "\1\u00a6",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\u00ad",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b2\1\u00b0\1\u00b1",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | ID | INT | FLOAT | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | HASH | RANGE | REGEX | SYMBOL | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | COLON2 | NOT | BNOT | PLUS | MINUS | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT );";
        }
    }
 

}