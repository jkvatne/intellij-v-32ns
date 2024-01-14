/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.vlang.lang.vmod;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static org.vlang.vmod.psi.VmodTokenTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>vmod.flex</tt>
 */
public class _VmodLexer implements FlexLexer, VmodTypes {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int MAYBE_SEMICOLON = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 14336 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\2\11\1\14\1\36\3\11\1\37\10\11\1\40\1\41\5\14\1\42\1\43"+
    "\11\11\1\44\2\11\1\45\5\11\1\46\4\11\1\47\1\50\4\11\51\14\1\51\3\14\1\52\1"+
    "\53\4\14\1\54\12\11\1\55\u0381\11");

  /* The ZZ_CMAP_Y table has 2944 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\10\1\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\24\12\13\1\25"+
    "\1\13\1\26\1\25\1\13\1\27\4\1\1\13\1\30\1\31\2\1\2\13\1\30\1\1\1\32\1\25\5"+
    "\13\1\33\1\34\1\35\1\1\1\36\1\13\1\1\1\37\5\13\1\40\1\41\1\42\1\13\1\30\1"+
    "\43\1\13\1\44\1\45\1\1\1\13\1\46\4\1\1\13\1\47\4\1\1\50\2\13\1\51\1\1\1\52"+
    "\1\53\1\25\1\54\1\55\1\56\1\57\1\60\1\61\1\53\1\16\1\62\1\55\1\56\1\63\1\1"+
    "\1\64\1\65\1\66\1\67\1\22\1\56\1\70\1\1\1\71\1\53\1\72\1\73\1\55\1\56\1\70"+
    "\1\1\1\61\1\53\1\41\1\74\1\75\1\76\1\77\1\1\1\71\1\65\1\1\1\100\1\36\1\56"+
    "\1\51\1\1\1\101\1\53\1\1\1\102\1\36\1\56\1\103\1\1\1\60\1\53\1\104\1\100\1"+
    "\36\1\13\1\105\1\60\1\106\1\53\1\107\1\110\1\111\1\13\1\112\1\113\1\1\1\65"+
    "\1\1\1\25\2\13\1\114\1\113\1\115\2\1\1\116\1\117\1\120\1\121\1\122\1\123\2"+
    "\1\1\71\1\1\1\115\1\1\1\124\1\13\1\125\1\1\1\126\7\1\2\13\1\30\1\127\1\115"+
    "\1\130\1\131\1\132\1\133\1\115\2\13\1\134\2\13\1\135\24\13\1\136\1\137\2\13"+
    "\1\136\2\13\1\140\1\141\1\14\3\13\1\141\3\13\1\30\2\1\1\13\1\1\5\13\1\142"+
    "\1\25\45\13\1\143\1\13\1\25\1\30\4\13\1\30\1\144\1\145\1\16\1\13\1\16\1\13"+
    "\1\16\1\145\1\71\3\13\1\146\1\1\1\147\1\115\2\1\1\115\5\13\1\27\1\150\1\13"+
    "\1\151\4\13\1\40\1\13\1\152\2\1\1\65\1\13\1\153\1\154\2\13\1\155\1\13\1\77"+
    "\1\115\2\1\1\13\1\113\3\13\1\154\2\1\2\115\1\156\5\1\1\110\2\13\1\146\1\157"+
    "\1\115\2\1\1\160\1\13\1\161\1\42\2\13\1\40\1\1\2\13\1\146\1\1\1\162\1\42\1"+
    "\13\1\153\1\46\5\1\1\163\1\164\14\13\4\1\21\13\1\142\2\13\1\142\1\165\1\13"+
    "\1\153\3\13\1\166\1\167\1\170\1\125\1\167\2\1\1\171\4\1\1\172\1\1\1\125\6"+
    "\1\1\173\1\174\1\175\1\176\1\177\3\1\1\200\147\1\2\13\1\152\2\13\1\152\10"+
    "\13\1\201\1\202\2\13\1\134\3\13\1\203\1\1\1\13\1\113\4\204\4\1\1\127\35\1"+
    "\1\205\2\1\1\206\1\25\4\13\1\207\1\25\4\13\1\135\1\110\1\13\1\153\1\25\4\13"+
    "\1\152\1\1\1\13\1\30\3\1\1\13\40\1\133\13\1\40\4\1\135\13\1\40\2\1\10\13\1"+
    "\125\4\1\2\13\1\153\20\13\1\125\1\13\1\210\1\1\2\13\1\152\1\127\1\13\1\153"+
    "\4\13\1\40\2\1\1\211\1\212\5\13\1\213\1\13\1\152\1\27\3\1\1\211\1\214\1\13"+
    "\1\31\1\1\3\13\1\146\1\212\2\13\1\146\1\1\1\115\1\1\1\215\1\42\1\13\1\40\1"+
    "\13\1\113\1\1\1\13\1\125\1\50\2\13\1\31\1\127\1\115\1\216\1\217\2\13\1\46"+
    "\1\1\1\220\1\115\1\13\1\221\3\13\1\222\1\223\1\224\1\30\1\66\1\225\1\226\1"+
    "\204\2\13\1\135\1\40\7\13\1\31\1\115\72\13\1\146\1\13\1\227\2\13\1\155\20"+
    "\1\26\13\1\153\6\13\1\77\2\1\1\113\1\230\1\56\1\231\1\232\6\13\1\16\1\1\1"+
    "\160\25\13\1\153\1\1\4\13\1\212\2\13\1\27\2\1\1\155\7\1\1\216\7\13\1\125\1"+
    "\1\1\115\1\25\1\30\1\25\1\30\1\233\4\13\1\152\1\234\1\235\2\1\1\236\1\13\1"+
    "\14\1\237\2\153\2\1\7\13\1\30\30\1\1\13\1\125\3\13\1\71\2\1\2\13\1\1\1\13"+
    "\1\240\2\13\1\40\1\13\1\153\2\13\1\241\3\1\11\13\1\153\1\115\2\13\1\241\1"+
    "\13\1\155\2\13\1\27\3\13\1\146\11\1\23\13\1\113\1\13\1\40\1\27\11\1\1\242"+
    "\2\13\1\243\1\13\1\40\1\13\1\113\1\13\1\152\4\1\1\13\1\244\1\13\1\40\1\13"+
    "\1\77\4\1\3\13\1\245\4\1\1\71\1\246\1\13\1\146\2\1\1\13\1\125\1\13\1\125\2"+
    "\1\1\124\1\13\1\154\1\1\3\13\1\40\1\13\1\40\1\13\1\31\1\13\1\16\6\1\4\13\1"+
    "\46\3\1\3\13\1\31\3\13\1\31\60\1\1\160\2\13\1\27\2\1\1\65\1\1\1\160\2\13\2"+
    "\1\1\13\1\46\1\115\1\160\1\13\1\113\1\65\1\1\2\13\1\247\1\160\2\13\1\31\1"+
    "\250\1\251\2\1\1\13\1\22\1\155\5\1\1\252\1\253\1\46\2\13\1\152\1\1\1\115\1"+
    "\73\1\55\1\56\1\70\1\1\1\254\1\16\11\1\3\13\1\154\1\255\1\115\2\1\3\13\1\1"+
    "\1\256\1\115\12\1\2\13\1\152\2\1\1\257\2\1\3\13\1\1\1\260\1\115\2\1\2\13\1"+
    "\30\1\1\1\115\3\1\1\13\1\77\1\1\1\115\26\1\4\13\1\115\1\127\34\1\3\13\1\46"+
    "\20\1\1\56\1\13\1\152\1\1\1\71\1\115\1\1\1\212\1\13\67\1\71\13\1\77\16\1\14"+
    "\13\1\146\53\1\2\13\1\152\75\1\44\13\1\113\33\1\43\13\1\46\1\13\1\152\1\115"+
    "\6\1\1\13\1\153\1\1\3\13\1\1\1\146\1\115\1\160\1\261\1\13\67\1\4\13\1\154"+
    "\1\71\3\1\1\160\4\1\1\71\1\1\76\13\1\125\1\1\57\13\1\31\20\1\1\16\77\1\6\13"+
    "\1\30\1\125\1\46\1\77\66\1\5\13\1\216\3\13\1\145\1\262\1\263\1\264\3\13\1"+
    "\265\1\266\1\13\1\267\1\270\1\36\24\13\1\271\1\13\1\36\1\135\1\13\1\135\1"+
    "\13\1\216\1\13\1\216\1\152\1\13\1\152\1\13\1\56\1\13\1\56\1\13\1\272\3\273"+
    "\14\13\1\154\3\1\4\13\1\146\1\115\112\1\1\264\1\13\1\274\1\275\1\276\1\277"+
    "\1\300\1\301\1\302\1\155\1\303\1\155\24\1\55\13\1\113\2\1\103\13\1\154\15"+
    "\13\1\153\150\13\1\16\25\1\41\13\1\153\36\1");

  /* The ZZ_CMAP_A table has 3136 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\1\1\32\1\2\1\4\22\0\1\2\6\0\1\10\1\26\1\27\1\5\1\0\1\31\2\0\1"+
    "\3\11\13\1\7\1\30\6\0\14\6\1\14\7\6\1\12\5\6\1\24\1\11\1\25\1\0\1\6\1\0\2"+
    "\12\1\6\1\16\1\21\1\12\5\6\1\20\1\6\1\12\1\15\2\6\1\12\1\6\1\12\1\17\1\12"+
    "\1\6\1\12\2\6\1\22\1\0\1\23\7\0\1\32\24\0\1\6\12\0\1\6\4\0\1\6\5\0\27\6\1"+
    "\0\12\6\4\0\14\6\16\0\5\6\7\0\1\6\1\0\1\6\1\0\5\6\1\0\2\6\2\0\4\6\1\0\1\6"+
    "\6\0\1\6\1\0\3\6\1\0\1\6\1\0\4\6\1\0\23\6\1\0\13\6\10\0\6\6\1\0\26\6\2\0\1"+
    "\6\6\0\10\6\10\0\13\6\5\0\3\6\15\0\12\7\4\0\6\6\1\0\1\6\17\0\2\6\7\0\2\6\12"+
    "\7\3\6\2\0\2\6\1\0\16\6\15\0\11\6\13\0\1\6\16\0\12\7\6\6\4\0\2\6\4\0\1\6\5"+
    "\0\6\6\4\0\1\6\11\0\1\6\3\0\1\6\7\0\11\6\7\0\5\6\1\0\10\6\6\0\26\6\3\0\1\6"+
    "\2\0\1\6\7\0\12\6\4\0\12\7\1\6\4\0\10\6\2\0\2\6\2\0\26\6\1\0\7\6\1\0\1\6\3"+
    "\0\4\6\3\0\1\6\20\0\1\6\15\0\2\6\1\0\1\6\5\0\6\6\4\0\2\6\1\0\2\6\1\0\2\6\1"+
    "\0\2\6\17\0\4\6\1\0\1\6\7\0\12\7\2\0\3\6\20\0\11\6\1\0\2\6\1\0\2\6\1\0\5\6"+
    "\3\0\1\6\2\0\1\6\30\0\1\6\13\0\10\6\2\0\1\6\3\0\1\6\1\0\6\6\3\0\3\6\1\0\4"+
    "\6\3\0\2\6\1\0\1\6\1\0\2\6\3\0\2\6\3\0\3\6\3\0\14\6\13\0\10\6\1\0\2\6\10\0"+
    "\3\6\5\0\1\6\4\0\10\6\1\0\6\6\1\0\5\6\3\0\1\6\3\0\2\6\15\0\13\6\2\0\1\6\6"+
    "\0\3\6\10\0\1\6\12\0\6\6\5\0\22\6\3\0\10\6\1\0\11\6\1\0\1\6\2\0\7\6\11\0\1"+
    "\6\1\0\2\6\14\0\12\7\7\0\2\6\1\0\1\6\2\0\2\6\1\0\1\6\2\0\1\6\6\0\4\6\1\0\7"+
    "\6\1\0\3\6\1\0\1\6\1\0\1\6\2\0\2\6\1\0\4\6\1\0\2\6\11\0\1\6\2\0\5\6\1\0\1"+
    "\6\11\0\12\7\2\0\14\6\1\0\24\6\13\0\5\6\22\0\7\6\4\0\4\6\3\0\1\6\3\0\2\6\7"+
    "\0\3\6\4\0\15\6\14\0\1\6\1\0\6\6\1\0\1\6\5\0\1\6\2\0\13\6\1\0\15\6\1\0\4\6"+
    "\2\0\7\6\1\0\1\6\1\0\4\6\2\0\1\6\1\0\4\6\2\0\7\6\1\0\1\6\1\0\4\6\2\0\16\6"+
    "\2\0\6\6\2\0\15\6\2\0\1\6\1\0\10\6\7\0\15\6\1\0\6\6\23\0\1\6\4\0\1\6\3\0\5"+
    "\6\2\0\22\6\1\0\1\6\5\0\17\6\1\0\16\6\2\0\5\6\13\0\14\6\13\0\1\6\15\0\7\6"+
    "\7\0\16\6\15\0\2\6\12\7\3\0\3\6\11\0\4\6\1\0\4\6\3\0\2\6\11\0\10\6\1\0\1\6"+
    "\1\0\1\6\1\0\1\6\1\0\6\6\1\0\7\6\1\0\1\6\3\0\3\6\1\0\7\6\3\0\4\6\2\0\6\6\14"+
    "\0\2\32\7\0\1\6\15\0\1\6\2\0\1\6\4\0\1\6\2\0\12\6\1\0\1\6\3\0\5\6\6\0\1\6"+
    "\1\0\1\6\1\0\1\6\1\0\4\6\1\0\13\6\2\0\4\6\5\0\5\6\4\0\1\6\4\0\2\6\13\0\5\6"+
    "\6\0\4\6\3\0\2\6\14\0\10\6\7\0\10\6\1\0\7\6\6\0\2\6\12\0\5\6\5\0\2\6\3\0\7"+
    "\6\6\0\3\6\12\7\2\6\13\0\11\6\2\0\27\6\2\0\7\6\1\0\3\6\1\0\4\6\1\0\4\6\2\0"+
    "\6\6\3\0\1\6\1\0\1\6\2\0\5\6\1\0\12\6\12\7\5\6\1\0\3\6\1\0\10\6\4\0\7\6\3"+
    "\0\1\6\3\0\2\6\1\0\1\6\3\0\2\6\2\0\5\6\2\0\1\6\1\0\1\6\30\0\3\6\3\0\6\6\2"+
    "\0\6\6\2\0\6\6\11\0\7\6\4\0\5\6\3\0\5\6\5\0\1\6\1\0\10\6\1\0\5\6\1\0\1\6\1"+
    "\0\2\6\1\0\2\6\1\0\12\6\6\0\12\6\2\0\6\6\2\0\6\6\2\0\6\6\2\0\3\6\3\0\14\6"+
    "\1\0\16\6\1\0\2\6\1\0\2\6\1\0\10\6\6\0\4\6\4\0\16\6\2\0\1\6\1\0\14\6\1\0\2"+
    "\6\3\0\1\6\2\0\4\6\1\0\2\6\12\0\10\6\6\0\6\6\1\0\3\6\1\0\12\6\3\0\1\6\12\0"+
    "\4\6\13\0\12\7\1\6\1\0\1\6\3\0\7\6\1\0\1\6\1\0\4\6\1\0\17\6\1\0\2\6\14\0\3"+
    "\6\7\0\4\6\11\0\2\6\1\0\1\6\20\0\4\6\10\0\1\6\13\0\10\6\5\0\3\6\2\0\1\6\2"+
    "\0\2\6\2\0\4\6\1\0\14\6\1\0\1\6\1\0\7\6\1\0\21\6\1\0\4\6\2\0\10\6\1\0\7\6"+
    "\1\0\14\6\1\0\4\6\1\0\5\6\1\0\1\6\3\0\14\6\2\0\13\6\1\0\10\6\2\0\22\7\1\0"+
    "\2\6\1\0\1\6\2\0\1\6\1\0\12\6\1\0\4\6\1\0\1\6\1\0\1\6\6\0\1\6\4\0\1\6\1\0"+
    "\1\6\1\0\1\6\1\0\3\6\1\0\2\6\1\0\1\6\2\0\1\6\1\0\1\6\1\0\1\6\1\0\1\6\1\0\1"+
    "\6\1\0\2\6\1\0\1\6\2\0\4\6\1\0\7\6\1\0\4\6\1\0\4\6\1\0\1\6\1\0\12\6\1\0\5"+
    "\6\1\0\3\6\1\0\5\6\1\0\5\6");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\1\1\4\1\5\1\4"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\16\1\20\1\21\1\0\1\22\1\0"+
    "\1\4\1\21\1\4\1\21\1\0\2\4\1\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[33];
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
    "\0\0\0\33\0\66\0\121\0\66\0\154\0\207\0\242"+
    "\0\275\0\66\0\66\0\66\0\66\0\66\0\66\0\66"+
    "\0\66\0\66\0\66\0\154\0\330\0\363\0\242\0\66"+
    "\0\u010e\0\u0129\0\u0144\0\u015f\0\66\0\u0144\0\u017a\0\u0195"+
    "\0\207";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[33];
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
    "\1\3\1\4\1\5\1\6\1\0\1\3\1\7\1\3"+
    "\1\10\1\3\1\7\1\3\1\11\5\7\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\0\1\22"+
    "\1\23\1\5\1\24\1\0\25\22\35\0\1\4\34\0"+
    "\1\25\1\0\1\26\33\0\2\7\2\0\10\7\11\0"+
    "\10\27\1\30\1\31\21\27\6\0\2\7\2\0\3\7"+
    "\1\32\4\7\11\0\1\25\1\0\2\25\1\0\26\25"+
    "\5\26\1\33\25\26\10\0\4\27\3\0\1\27\1\0"+
    "\1\27\17\0\2\7\2\0\4\7\1\34\3\7\11\0"+
    "\3\26\1\35\1\26\1\36\25\26\6\0\2\7\2\0"+
    "\5\7\1\37\2\7\17\0\2\7\2\0\6\7\1\40"+
    "\1\7\17\0\2\7\2\0\7\7\1\41\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[432];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\4\1\12\11\3\1\1\0"+
    "\1\11\1\0\3\1\1\11\1\0\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[33];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _VmodLexer() {
    this((java.io.Reader)null);
 }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _VmodLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 20: break;
          case 2: 
            { return NLS;
            } 
            // fall through
          case 21: break;
          case 3: 
            { return WS;
            } 
            // fall through
          case 22: break;
          case 4: 
            { yybegin(MAYBE_SEMICOLON); return IDENTIFIER;
            } 
            // fall through
          case 23: break;
          case 5: 
            { return SINGLE_QUOTE;
            } 
            // fall through
          case 24: break;
          case 6: 
            { return LBRACE;
            } 
            // fall through
          case 25: break;
          case 7: 
            { return RBRACE;
            } 
            // fall through
          case 26: break;
          case 8: 
            { return LBRACK;
            } 
            // fall through
          case 27: break;
          case 9: 
            { yybegin(MAYBE_SEMICOLON); return RBRACK;
            } 
            // fall through
          case 28: break;
          case 10: 
            { return LPAREN;
            } 
            // fall through
          case 29: break;
          case 11: 
            { yybegin(MAYBE_SEMICOLON); return RPAREN;
            } 
            // fall through
          case 30: break;
          case 12: 
            { yybegin(MAYBE_SEMICOLON); return COLON;
            } 
            // fall through
          case 31: break;
          case 13: 
            { return COMMA;
            } 
            // fall through
          case 32: break;
          case 14: 
            { yybegin(YYINITIAL); yypushback(yytext().length());
            } 
            // fall through
          case 33: break;
          case 15: 
            { yybegin(YYINITIAL); yypushback(yytext().length()); return SEMICOLON_SYNTHETIC;
            } 
            // fall through
          case 34: break;
          case 16: 
            { return LINE_COMMENT;
            } 
            // fall through
          case 35: break;
          case 17: 
            { return MULTILINE_COMMENT;
            } 
            // fall through
          case 36: break;
          case 18: 
            { yybegin(MAYBE_SEMICOLON); return STRING;
            } 
            // fall through
          case 37: break;
          case 19: 
            { return MODULE;
            } 
            // fall through
          case 38: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
