/* The following code was generated by JFlex 1.4.3 on 17/08/16 08:14 PM */

package examples.while_ut1.parser;

import java_cup.runtime.Symbol;
import java.util.*;
import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 17/08/16 08:14 PM from the specification file
 * <tt>/Users/nachogarrone/IdeaProjects/while_ut1/src/main/resources/Lexer.lex</tt>
 */
class Lexer implements java_cup.runtime.Scanner, Tokens {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\42\1\36\1\0\2\42\22\0\1\42\1\1\1\35\3\0"+
    "\1\2\1\0\1\3\1\4\1\5\1\6\1\0\1\7\1\0\1\44"+
    "\12\40\1\0\1\10\1\11\1\12\3\0\32\41\1\0\1\37\2\0"+
    "\1\41\1\0\1\21\2\41\1\13\1\15\1\20\1\41\1\26\1\22"+
    "\1\41\1\23\1\16\1\41\1\27\1\14\1\24\1\41\1\30\1\17"+
    "\1\25\1\31\1\43\1\32\3\41\1\33\1\0\1\34\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\1\1\11\10\12\1\13\1\14\1\1"+
    "\1\15\1\16\1\12\1\1\1\17\1\20\1\21\1\22"+
    "\3\12\1\23\3\12\1\0\1\24\3\0\6\12\2\0"+
    "\1\15\1\25\1\26\1\12\1\27\1\30\1\12\1\0"+
    "\1\15\1\31\1\32";

  private static int [] zzUnpackAction() {
    int [] result = new int[62];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\45\0\112\0\45\0\45\0\45\0\45"+
    "\0\45\0\45\0\157\0\224\0\271\0\336\0\u0103\0\u0128"+
    "\0\u014d\0\u0172\0\u0197\0\u01bc\0\45\0\45\0\u01e1\0\u0206"+
    "\0\u022b\0\u0250\0\u0275\0\45\0\45\0\45\0\336\0\u029a"+
    "\0\u02bf\0\u02e4\0\336\0\u0309\0\u032e\0\u0353\0\u01e1\0\45"+
    "\0\u0378\0\u039d\0\u03c2\0\u03e7\0\u040c\0\u0431\0\u0456\0\u047b"+
    "\0\u04a0\0\u04c5\0\u04ea\0\45\0\336\0\336\0\u050f\0\336"+
    "\0\336\0\u0534\0\u0559\0\u04c5\0\336\0\336";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[62];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\16\1\20"+
    "\1\21\1\16\1\22\2\16\1\23\4\16\1\24\1\25"+
    "\1\26\1\27\1\30\1\2\1\31\1\16\1\30\1\32"+
    "\1\33\47\0\1\34\54\0\1\35\44\0\1\36\45\0"+
    "\1\16\1\37\16\16\5\0\2\16\1\0\1\16\14\0"+
    "\20\16\5\0\2\16\1\0\1\16\14\0\3\16\1\40"+
    "\14\16\5\0\2\16\1\0\1\16\14\0\10\16\1\41"+
    "\7\16\5\0\2\16\1\0\1\16\14\0\6\16\1\42"+
    "\11\16\5\0\2\16\1\0\1\16\14\0\5\16\1\43"+
    "\12\16\5\0\2\16\1\0\1\16\14\0\13\16\1\44"+
    "\1\16\1\45\2\16\5\0\2\16\1\0\1\16\14\0"+
    "\13\16\1\46\4\16\5\0\2\16\1\0\1\16\1\0"+
    "\35\47\1\50\1\0\1\51\5\47\36\0\1\30\3\0"+
    "\2\30\41\0\1\31\17\0\20\16\3\0\1\30\1\0"+
    "\2\16\1\30\1\32\6\0\1\52\36\0\1\53\13\0"+
    "\4\16\1\54\13\16\5\0\2\16\1\0\1\16\14\0"+
    "\7\16\1\55\10\16\5\0\2\16\1\0\1\16\14\0"+
    "\3\16\1\56\14\16\5\0\2\16\1\0\1\16\14\0"+
    "\2\16\1\57\15\16\5\0\2\16\1\0\1\16\14\0"+
    "\16\16\1\60\1\16\5\0\2\16\1\0\1\16\14\0"+
    "\7\16\1\61\10\16\5\0\2\16\1\0\1\16\1\0"+
    "\36\47\1\0\6\47\5\62\1\63\37\62\36\53\1\64"+
    "\6\53\13\0\2\16\1\65\15\16\5\0\2\16\1\0"+
    "\1\16\14\0\11\16\1\66\6\16\5\0\2\16\1\0"+
    "\1\16\14\0\4\16\1\67\13\16\5\0\2\16\1\0"+
    "\1\16\14\0\14\16\1\70\3\16\5\0\2\16\1\0"+
    "\1\16\14\0\2\16\1\71\15\16\5\0\2\16\1\0"+
    "\1\16\14\0\3\16\1\72\14\16\5\0\2\16\1\0"+
    "\1\16\1\0\5\62\1\73\44\62\1\63\36\62\1\74"+
    "\13\0\2\16\1\75\15\16\5\0\2\16\1\0\1\16"+
    "\14\0\2\16\1\76\15\16\5\0\2\16\1\0\1\16"+
    "\1\0\5\62\1\63\36\62\1\64";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1406];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\6\11\12\1\2\11\5\1\3\11"+
    "\10\1\1\0\1\11\3\0\6\1\2\0\1\11\6\1"+
    "\1\0\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[62];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

	public static List<Symbol> tokens(Reader input) throws IOException {
		Lexer lexer = new Lexer(input);
		List<Symbol> result = new ArrayList<Symbol>();
		for (Symbol token = lexer.next_token(); token.sym != Tokens.EOF; token = lexer.next_token()) {
			result.add(token);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		Lexer lexer;
		if (args.length < 1) args = new String[]{ "" };
		for (int i = 0; i < args.length; ++i) {
			lexer = new Lexer(new InputStreamReader(args[i].length() > 0 ? new FileInputStream(args[i]) : System.in, "UTF8"));
			System.out.println(args[i] +":");
			for (Symbol token = lexer.next_token(); token.sym != Tokens.EOF; token = lexer.next_token()) {
				System.out.println("\t#"+ token.sym +" "+ token.value);
			}
		}
	}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 118) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { return new Symbol(IF, yyline, yycolumn, yytext());
          }
        case 27: break;
        case 17: 
          { return new Symbol(DOUBLE_EQUALS_SIGN, yyline, yycolumn, yytext());
          }
        case 28: break;
        case 13: 
          { /* Ignore */
          }
        case 29: break;
        case 3: 
          { return new Symbol(LEFT_PARENTHESIS, yyline, yycolumn, yytext());
          }
        case 30: break;
        case 25: 
          { return new Symbol(FALSE, yyline, yycolumn, yytext());
          }
        case 31: break;
        case 26: 
          { return new Symbol(WHILE, yyline, yycolumn, yytext());
          }
        case 32: break;
        case 7: 
          { return new Symbol(HYPHEN_MINUS, yyline, yycolumn, yytext());
          }
        case 33: break;
        case 23: 
          { return new Symbol(THEN, yyline, yycolumn, yytext());
          }
        case 34: break;
        case 12: 
          { return new Symbol(RIGHT_CURLY_BRACKET, yyline, yycolumn, yytext());
          }
        case 35: break;
        case 4: 
          { return new Symbol(RIGHT_PARENTHESIS, yyline, yycolumn, yytext());
          }
        case 36: break;
        case 8: 
          { return new Symbol(SEMICOLON, yyline, yycolumn, yytext());
          }
        case 37: break;
        case 9: 
          { return new Symbol(EQUALS_SIGN, yyline, yycolumn, yytext());
          }
        case 38: break;
        case 5: 
          { return new Symbol(ASTERISK, yyline, yycolumn, yytext());
          }
        case 39: break;
        case 20: 
          { String $1 = yytext(); String $0;
        $0 = $1.substring(1,$1.length()-1);
      return new Symbol(STRING, yyline, yycolumn, $0);
          }
        case 40: break;
        case 15: 
          { return new Symbol(DOUBLE_AMPERSAND, yyline, yycolumn, yytext());
          }
        case 41: break;
        case 18: 
          { return new Symbol(DO, yyline, yycolumn, yytext());
          }
        case 42: break;
        case 24: 
          { return new Symbol(TRUE, yyline, yycolumn, yytext());
          }
        case 43: break;
        case 10: 
          { String $1 = yytext(); String $0;
	  $0 = $1;
	  return new Symbol(ID, yyline, yycolumn, $0);
          }
        case 44: break;
        case 21: 
          { return new Symbol(ELSE, yyline, yycolumn, yytext());
          }
        case 45: break;
        case 6: 
          { return new Symbol(PLUS_SIGN, yyline, yycolumn, yytext());
          }
        case 46: break;
        case 14: 
          { String $1 = yytext(); Double $0 = Double.parseDouble($1);
	  return new Symbol(NUM, yyline, yycolumn, $0);
          }
        case 47: break;
        case 11: 
          { return new Symbol(LEFT_CURLY_BRACKET, yyline, yycolumn, yytext());
          }
        case 48: break;
        case 1: 
          { return new Symbol(error, yyline, yycolumn, "Unexpected input <"+ yytext() +">!");
          }
        case 49: break;
        case 16: 
          { return new Symbol(LESS_THAN_OR_EQUAL, yyline, yycolumn, yytext());
          }
        case 50: break;
        case 22: 
          { return new Symbol(SKIP, yyline, yycolumn, yytext());
          }
        case 51: break;
        case 2: 
          { return new Symbol(EXCLAMATION_MARK, yyline, yycolumn, yytext());
          }
        case 52: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(Tokens.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}