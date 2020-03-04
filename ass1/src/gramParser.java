// Generated from E:/Work/languages and compilers/ass1/src\gram.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, TRUE=3, FALSE=4, PLUS=5, MINUS=6, EQUALS=7, MULTI=8, DIV=9, 
		POW=10, SCOL=11, LBRAC=12, RBRAC=13, OCBRAC=14, CCBRAC=15, SOBRAC=16, 
		SCBRAC=17, IF=18, ELSE=19, NOT=20, AND=21, OR=22, EQ=23, NEQ=24, GT=25, 
		LT=26, GTEQ=27, LTEQ=28, VAR=29, WHITESPACE=30;
	public static final int
		RULE_parse = 0, RULE_exp = 1, RULE_assignment = 2, RULE_number = 3, RULE_if_start = 4, 
		RULE_cdn_exp = 5, RULE_stat_exp = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "exp", "assignment", "number", "if_start", "cdn_exp", "stat_exp"
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

	@Override
	public String getGrammarFileName() { return "gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public List<If_startContext> if_start() {
			return getRuleContexts(If_startContext.class);
		}
		public If_startContext if_start(int i) {
			return getRuleContext(If_startContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(17);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(14);
					if_start();
					}
					break;
				case 2:
					{
					setState(15);
					assignment();
					}
					break;
				case 3:
					{
					setState(16);
					exp(0);
					}
					break;
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << LBRAC) | (1L << SOBRAC) | (1L << IF) | (1L << NOT) | (1L << VAR))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormExpContext extends ExpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NormExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterNormExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitNormExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitNormExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExpContext extends ExpContext {
		public TerminalNode MINUS() { return getToken(gramParser.MINUS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MinusExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterMinusExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitMinusExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitMinusExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public TerminalNode AND() { return getToken(gramParser.AND, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AndExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExpContext extends ExpContext {
		public ExpContext left;
		public Token op;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(gramParser.POW, 0); }
		public PowExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterPowExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitPowExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitPowExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivMultiExpContext extends ExpContext {
		public ExpContext left;
		public Token op;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(gramParser.DIV, 0); }
		public TerminalNode MULTI() { return getToken(gramParser.MULTI, 0); }
		public DivMultiExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterDivMultiExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitDivMultiExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitDivMultiExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddMinusExpContext extends ExpContext {
		public ExpContext left;
		public Token op;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(gramParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gramParser.MINUS, 0); }
		public AddMinusExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterAddMinusExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitAddMinusExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitAddMinusExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EvalExpContext extends ExpContext {
		public TerminalNode SOBRAC() { return getToken(gramParser.SOBRAC, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SCBRAC() { return getToken(gramParser.SCBRAC, 0); }
		public EvalExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterEvalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitEvalExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitEvalExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracExpContext extends ExpContext {
		public TerminalNode LBRAC() { return getToken(gramParser.LBRAC, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRAC() { return getToken(gramParser.RBRAC, 0); }
		public BracExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterBracExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitBracExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitBracExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public TerminalNode OR() { return getToken(gramParser.OR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OrExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExpContext {
		public ExpContext left;
		public Token op;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(gramParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(gramParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(gramParser.LT, 0); }
		public TerminalNode GT() { return getToken(gramParser.GT, 0); }
		public RelationalExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpContext extends ExpContext {
		public TerminalNode NOT() { return getToken(gramParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitNotExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitNotExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExpContext {
		public ExpContext left;
		public Token op;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(gramParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(gramParser.NEQ, 0); }
		public EqualityExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new EvalExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(22);
				match(SOBRAC);
				setState(23);
				exp(0);
				setState(24);
				match(SCBRAC);
				}
				break;
			case 2:
				{
				_localctx = new MinusExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(MINUS);
				setState(27);
				exp(11);
				}
				break;
			case 3:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(NOT);
				setState(29);
				exp(10);
				}
				break;
			case 4:
				{
				_localctx = new BracExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(LBRAC);
				setState(31);
				exp(0);
				setState(32);
				match(RBRAC);
				}
				break;
			case 5:
				{
				_localctx = new NormExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				number();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PowExpContext(new ExpContext(_parentctx, _parentState));
						((PowExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(37);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(38);
						((PowExpContext)_localctx).op = match(POW);
						setState(39);
						((PowExpContext)_localctx).right = exp(9);
						}
						break;
					case 2:
						{
						_localctx = new DivMultiExpContext(new ExpContext(_parentctx, _parentState));
						((DivMultiExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(40);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(41);
						((DivMultiExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTI || _la==DIV) ) {
							((DivMultiExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(42);
						((DivMultiExpContext)_localctx).right = exp(8);
						}
						break;
					case 3:
						{
						_localctx = new AddMinusExpContext(new ExpContext(_parentctx, _parentState));
						((AddMinusExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(43);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(44);
						((AddMinusExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddMinusExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(45);
						((AddMinusExpContext)_localctx).right = exp(7);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExpContext(_parentctx, _parentState));
						((RelationalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(46);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(47);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(48);
						((RelationalExprContext)_localctx).right = exp(6);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExpContext(_parentctx, _parentState));
						((EqualityExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(49);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(50);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(51);
						((EqualityExprContext)_localctx).right = exp(5);
						}
						break;
					case 6:
						{
						_localctx = new AndExpContext(new ExpContext(_parentctx, _parentState));
						((AndExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(52);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(53);
						match(AND);
						setState(54);
						((AndExpContext)_localctx).right = exp(4);
						}
						break;
					case 7:
						{
						_localctx = new OrExpContext(new ExpContext(_parentctx, _parentState));
						((OrExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(55);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(56);
						match(OR);
						setState(57);
						((OrExpContext)_localctx).right = exp(3);
						}
						break;
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Token varName;
		public ExpContext varExpr;
		public TerminalNode EQUALS() { return getToken(gramParser.EQUALS, 0); }
		public TerminalNode SCOL() { return getToken(gramParser.SCOL, 0); }
		public TerminalNode VAR() { return getToken(gramParser.VAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((AssignmentContext)_localctx).varName = match(VAR);
			setState(64);
			match(EQUALS);
			setState(65);
			((AssignmentContext)_localctx).varExpr = exp(0);
			setState(66);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarExpContext extends NumberContext {
		public TerminalNode VAR() { return getToken(gramParser.VAR, 0); }
		public VarExpContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterVarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitVarExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitVarExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpContext extends NumberContext {
		public TerminalNode TRUE() { return getToken(gramParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(gramParser.FALSE, 0); }
		public TerminalNode NOT() { return getToken(gramParser.NOT, 0); }
		public BoolExpContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefExpContext extends NumberContext {
		public TerminalNode INT() { return getToken(gramParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gramParser.FLOAT, 0); }
		public TerminalNode MINUS() { return getToken(gramParser.MINUS, 0); }
		public DefExpContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterDefExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitDefExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitDefExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case MINUS:
				_localctx = new DefExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(68);
					match(MINUS);
					}
				}

				setState(71);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
			case NOT:
				_localctx = new BoolExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(72);
					match(NOT);
					}
				}

				setState(75);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case VAR:
				_localctx = new VarExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_startContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(gramParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(gramParser.IF, i);
		}
		public List<Cdn_expContext> cdn_exp() {
			return getRuleContexts(Cdn_expContext.class);
		}
		public Cdn_expContext cdn_exp(int i) {
			return getRuleContext(Cdn_expContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(gramParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(gramParser.ELSE, i);
		}
		public Stat_expContext stat_exp() {
			return getRuleContext(Stat_expContext.class,0);
		}
		public If_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterIf_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitIf_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitIf_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_startContext if_start() throws RecognitionException {
		If_startContext _localctx = new If_startContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IF);
			setState(80);
			cdn_exp();
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					match(ELSE);
					setState(82);
					match(IF);
					setState(83);
					cdn_exp();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(89);
				match(ELSE);
				setState(90);
				stat_exp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cdn_expContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Stat_expContext stat_exp() {
			return getRuleContext(Stat_expContext.class,0);
		}
		public Cdn_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdn_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterCdn_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitCdn_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitCdn_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cdn_expContext cdn_exp() throws RecognitionException {
		Cdn_expContext _localctx = new Cdn_expContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cdn_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			exp(0);
			setState(94);
			stat_exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_expContext extends ParserRuleContext {
		public TerminalNode OCBRAC() { return getToken(gramParser.OCBRAC, 0); }
		public TerminalNode CCBRAC() { return getToken(gramParser.CCBRAC, 0); }
		public List<If_startContext> if_start() {
			return getRuleContexts(If_startContext.class);
		}
		public If_startContext if_start(int i) {
			return getRuleContext(If_startContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Stat_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterStat_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitStat_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitStat_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_expContext stat_exp() throws RecognitionException {
		Stat_expContext _localctx = new Stat_expContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat_exp);
		int _la;
		try {
			int _alt;
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCBRAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(OCBRAC);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << LBRAC) | (1L << SOBRAC) | (1L << IF) | (1L << NOT) | (1L << VAR))) != 0)) {
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(98); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(97);
								if_start();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(100); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						setState(103); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(102);
								assignment();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(105); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						setState(108); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(107);
								exp(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(110); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(CCBRAC);
				}
				break;
			case INT:
			case FLOAT:
			case TRUE:
			case FALSE:
			case MINUS:
			case LBRAC:
			case SOBRAC:
			case NOT:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				exp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 |\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\6\2\24\n\2\r\2\16"+
		"\2\25\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3&\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\4\3\4\3\4\3\4\3\4\3\5\5\5H\n"+
		"\5\3\5\3\5\5\5L\n\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\6\3\6\3\6\7\6W\n\6\f\6"+
		"\16\6Z\13\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\b\3\b\6\be\n\b\r\b\16\bf\3"+
		"\b\6\bj\n\b\r\b\16\bk\3\b\6\bo\n\b\r\b\16\bp\7\bs\n\b\f\b\16\bv\13\b\3"+
		"\b\3\b\5\bz\n\b\3\b\2\3\4\t\2\4\6\b\n\f\16\2\b\3\2\n\13\3\2\7\b\3\2\33"+
		"\36\3\2\31\32\3\2\3\4\3\2\5\6\2\u008f\2\23\3\2\2\2\4%\3\2\2\2\6A\3\2\2"+
		"\2\bO\3\2\2\2\nQ\3\2\2\2\f_\3\2\2\2\16y\3\2\2\2\20\24\5\n\6\2\21\24\5"+
		"\6\4\2\22\24\5\4\3\2\23\20\3\2\2\2\23\21\3\2\2\2\23\22\3\2\2\2\24\25\3"+
		"\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\30\b\3\1\2\30\31\7"+
		"\22\2\2\31\32\5\4\3\2\32\33\7\23\2\2\33&\3\2\2\2\34\35\7\b\2\2\35&\5\4"+
		"\3\r\36\37\7\26\2\2\37&\5\4\3\f !\7\16\2\2!\"\5\4\3\2\"#\7\17\2\2#&\3"+
		"\2\2\2$&\5\b\5\2%\27\3\2\2\2%\34\3\2\2\2%\36\3\2\2\2% \3\2\2\2%$\3\2\2"+
		"\2&>\3\2\2\2\'(\f\n\2\2()\7\f\2\2)=\5\4\3\13*+\f\t\2\2+,\t\2\2\2,=\5\4"+
		"\3\n-.\f\b\2\2./\t\3\2\2/=\5\4\3\t\60\61\f\7\2\2\61\62\t\4\2\2\62=\5\4"+
		"\3\b\63\64\f\6\2\2\64\65\t\5\2\2\65=\5\4\3\7\66\67\f\5\2\2\678\7\27\2"+
		"\28=\5\4\3\69:\f\4\2\2:;\7\30\2\2;=\5\4\3\5<\'\3\2\2\2<*\3\2\2\2<-\3\2"+
		"\2\2<\60\3\2\2\2<\63\3\2\2\2<\66\3\2\2\2<9\3\2\2\2=@\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?\5\3\2\2\2@>\3\2\2\2AB\7\37\2\2BC\7\t\2\2CD\5\4\3\2DE\7\r\2"+
		"\2E\7\3\2\2\2FH\7\b\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IP\t\6\2\2JL\7\26"+
		"\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MP\t\7\2\2NP\7\37\2\2OG\3\2\2\2OK\3"+
		"\2\2\2ON\3\2\2\2P\t\3\2\2\2QR\7\24\2\2RX\5\f\7\2ST\7\25\2\2TU\7\24\2\2"+
		"UW\5\f\7\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y]\3\2\2\2ZX\3\2\2\2"+
		"[\\\7\25\2\2\\^\5\16\b\2][\3\2\2\2]^\3\2\2\2^\13\3\2\2\2_`\5\4\3\2`a\5"+
		"\16\b\2a\r\3\2\2\2bt\7\20\2\2ce\5\n\6\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2gs\3\2\2\2hj\5\6\4\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2"+
		"ls\3\2\2\2mo\5\4\3\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2"+
		"rd\3\2\2\2ri\3\2\2\2rn\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2"+
		"vt\3\2\2\2wz\7\21\2\2xz\5\4\3\2yb\3\2\2\2yx\3\2\2\2z\17\3\2\2\2\22\23"+
		"\25%<>GKOX]fkprty";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}