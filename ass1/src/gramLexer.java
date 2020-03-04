// Generated from E:/Work/languages and compilers/ass1/src\gram.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, TRUE=3, FALSE=4, PLUS=5, MINUS=6, EQUALS=7, MULTI=8, DIV=9, 
		POW=10, SCOL=11, LBRAC=12, RBRAC=13, OCBRAC=14, CCBRAC=15, SOBRAC=16, 
		SCBRAC=17, IF=18, ELSE=19, NOT=20, AND=21, OR=22, EQ=23, NEQ=24, GT=25, 
		LT=26, GTEQ=27, LTEQ=28, VAR=29, WHITESPACE=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "TRUE", "FALSE", "PLUS", "MINUS", "EQUALS", "MULTI", 
			"DIV", "POW", "SCOL", "LBRAC", "RBRAC", "OCBRAC", "CCBRAC", "SOBRAC", 
			"SCBRAC", "IF", "ELSE", "NOT", "AND", "OR", "EQ", "NEQ", "GT", "LT", 
			"GTEQ", "LTEQ", "VAR", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'true'", "'false'", "'+'", "'-'", "'='", "'*'", "'/'", 
			"'**'", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'if'", "'else'", 
			"'!'", "'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "TRUE", "FALSE", "PLUS", "MINUS", "EQUALS", "MULTI", 
			"DIV", "POW", "SCOL", "LBRAC", "RBRAC", "OCBRAC", "CCBRAC", "SOBRAC", 
			"SCBRAC", "IF", "ELSE", "NOT", "AND", "OR", "EQ", "NEQ", "GT", "LT", 
			"GTEQ", "LTEQ", "VAR", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public gramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2A"+
		"\n\2\r\2\16\2B\3\3\6\3F\n\3\r\3\16\3G\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3"+
		"\3\3\3\3\6\3S\n\3\r\3\16\3T\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\7\36\u00a1\n\36\f\36\16\36\u00a4\13\36\3\37\6"+
		"\37\u00a7\n\37\r\37\16\37\u00a8\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\6\3\2\62;\5\2C"+
		"\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00b2\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3@\3"+
		"\2\2\2\5V\3\2\2\2\7X\3\2\2\2\t]\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2"+
		"\2\2\21i\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33t\3"+
		"\2\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'\u0081\3"+
		"\2\2\2)\u0086\3\2\2\2+\u0088\3\2\2\2-\u008b\3\2\2\2/\u008e\3\2\2\2\61"+
		"\u0091\3\2\2\2\63\u0094\3\2\2\2\65\u0096\3\2\2\2\67\u0098\3\2\2\29\u009b"+
		"\3\2\2\2;\u009e\3\2\2\2=\u00a6\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B"+
		"@\3\2\2\2BC\3\2\2\2C\4\3\2\2\2DF\t\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2HI\3\2\2\2IM\7\60\2\2JL\t\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2NW\3\2\2\2OM\3\2\2\2PR\7\60\2\2QS\t\2\2\2RQ\3\2\2\2ST\3\2"+
		"\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VE\3\2\2\2VP\3\2\2\2W\6\3\2\2\2XY\7"+
		"v\2\2YZ\7t\2\2Z[\7w\2\2[\\\7g\2\2\\\b\3\2\2\2]^\7h\2\2^_\7c\2\2_`\7n\2"+
		"\2`a\7u\2\2ab\7g\2\2b\n\3\2\2\2cd\7-\2\2d\f\3\2\2\2ef\7/\2\2f\16\3\2\2"+
		"\2gh\7?\2\2h\20\3\2\2\2ij\7,\2\2j\22\3\2\2\2kl\7\61\2\2l\24\3\2\2\2mn"+
		"\7,\2\2no\7,\2\2o\26\3\2\2\2pq\7=\2\2q\30\3\2\2\2rs\7*\2\2s\32\3\2\2\2"+
		"tu\7+\2\2u\34\3\2\2\2vw\7}\2\2w\36\3\2\2\2xy\7\177\2\2y \3\2\2\2z{\7]"+
		"\2\2{\"\3\2\2\2|}\7_\2\2}$\3\2\2\2~\177\7k\2\2\177\u0080\7h\2\2\u0080"+
		"&\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7g\2\2\u0085(\3\2\2\2\u0086\u0087\7#\2\2\u0087*\3\2\2\2\u0088\u0089"+
		"\7(\2\2\u0089\u008a\7(\2\2\u008a,\3\2\2\2\u008b\u008c\7~\2\2\u008c\u008d"+
		"\7~\2\2\u008d.\3\2\2\2\u008e\u008f\7?\2\2\u008f\u0090\7?\2\2\u0090\60"+
		"\3\2\2\2\u0091\u0092\7#\2\2\u0092\u0093\7?\2\2\u0093\62\3\2\2\2\u0094"+
		"\u0095\7@\2\2\u0095\64\3\2\2\2\u0096\u0097\7>\2\2\u0097\66\3\2\2\2\u0098"+
		"\u0099\7@\2\2\u0099\u009a\7?\2\2\u009a8\3\2\2\2\u009b\u009c\7>\2\2\u009c"+
		"\u009d\7?\2\2\u009d:\3\2\2\2\u009e\u00a2\t\3\2\2\u009f\u00a1\t\4\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3<\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\t\5\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\b\37\2\2\u00ab>\3\2\2\2\n\2BGMTV\u00a2\u00a8"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}