// Generated from D:/GitHub/antlr-project/src/main/antlr/com/example/Types\Types.g4 by ANTLR 4.7
package Types;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE=1, INT=2, DOUBLE=3, CLASS=4, WHILE=5, EXTENDS=6, WHITESPACE=7, EQUAL=8, 
		OPENSQRBRACKET=9, CLOSESQRBRACKET=10, OPENFIGBRACK=11, VAR=12;
	public static final int
		RULE_type = 0, RULE_assigment = 1, RULE_arrayRule = 2, RULE_classRule = 3, 
		RULE_classExtendsRule = 4;
	public static final String[] ruleNames = {
		"type", "assigment", "arrayRule", "classRule", "classExtendsRule"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'byte'", "'int'", "'double'", "'class'", "'while'", "'extends'", 
		"' '", "'='", "'['", "']'", "'{'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BYTE", "INT", "DOUBLE", "CLASS", "WHILE", "EXTENDS", "WHITESPACE", 
		"EQUAL", "OPENSQRBRACKET", "CLOSESQRBRACKET", "OPENFIGBRACK", "VAR"
	};
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
	public String getGrammarFileName() { return "Types.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(TypesParser.BYTE, 0); }
		public TerminalNode INT() { return getToken(TypesParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(TypesParser.DOUBLE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypesVisitor ) return ((TypesVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << INT) | (1L << DOUBLE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AssigmentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(TypesParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TypesParser.WHITESPACE, i);
		}
		public List<TerminalNode> VAR() { return getTokens(TypesParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(TypesParser.VAR, i);
		}
		public TerminalNode EQUAL() { return getToken(TypesParser.EQUAL, 0); }
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypesVisitor ) return ((TypesVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assigment);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				type();
				setState(13);
				match(WHITESPACE);
				setState(14);
				match(VAR);
				setState(15);
				match(WHITESPACE);
				setState(16);
				match(EQUAL);
				setState(17);
				match(WHITESPACE);
				setState(18);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				type();
				setState(21);
				match(WHITESPACE);
				setState(22);
				match(VAR);
				setState(23);
				match(EQUAL);
				setState(24);
				match(VAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				type();
				setState(27);
				match(WHITESPACE);
				setState(28);
				match(VAR);
				}
				break;
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

	public static class ArrayRuleContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPENSQRBRACKET() { return getToken(TypesParser.OPENSQRBRACKET, 0); }
		public TerminalNode CLOSESQRBRACKET() { return getToken(TypesParser.CLOSESQRBRACKET, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(TypesParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TypesParser.WHITESPACE, i);
		}
		public TerminalNode VAR() { return getToken(TypesParser.VAR, 0); }
		public ArrayRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterArrayRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitArrayRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypesVisitor ) return ((TypesVisitor<? extends T>)visitor).visitArrayRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayRuleContext arrayRule() throws RecognitionException {
		ArrayRuleContext _localctx = new ArrayRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arrayRule);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				type();
				setState(33);
				match(OPENSQRBRACKET);
				setState(34);
				match(CLOSESQRBRACKET);
				setState(35);
				match(WHITESPACE);
				setState(36);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				type();
				setState(39);
				match(WHITESPACE);
				setState(40);
				match(VAR);
				setState(41);
				match(WHITESPACE);
				setState(42);
				match(OPENSQRBRACKET);
				setState(43);
				match(CLOSESQRBRACKET);
				}
				break;
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

	public static class ClassRuleContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(TypesParser.CLASS, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(TypesParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TypesParser.WHITESPACE, i);
		}
		public TerminalNode VAR() { return getToken(TypesParser.VAR, 0); }
		public TerminalNode OPENFIGBRACK() { return getToken(TypesParser.OPENFIGBRACK, 0); }
		public ClassRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterClassRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitClassRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypesVisitor ) return ((TypesVisitor<? extends T>)visitor).visitClassRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassRuleContext classRule() throws RecognitionException {
		ClassRuleContext _localctx = new ClassRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classRule);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(CLASS);
				setState(48);
				match(WHITESPACE);
				setState(49);
				match(VAR);
				setState(50);
				match(OPENFIGBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(CLASS);
				setState(52);
				match(WHITESPACE);
				setState(53);
				match(VAR);
				setState(54);
				match(WHITESPACE);
				setState(55);
				match(OPENFIGBRACK);
				}
				break;
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

	public static class ClassExtendsRuleContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(TypesParser.CLASS, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(TypesParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TypesParser.WHITESPACE, i);
		}
		public List<TerminalNode> VAR() { return getTokens(TypesParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(TypesParser.VAR, i);
		}
		public TerminalNode EXTENDS() { return getToken(TypesParser.EXTENDS, 0); }
		public TerminalNode OPENFIGBRACK() { return getToken(TypesParser.OPENFIGBRACK, 0); }
		public ClassExtendsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExtendsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterClassExtendsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitClassExtendsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypesVisitor ) return ((TypesVisitor<? extends T>)visitor).visitClassExtendsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExtendsRuleContext classExtendsRule() throws RecognitionException {
		ClassExtendsRuleContext _localctx = new ClassExtendsRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classExtendsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(CLASS);
			setState(59);
			match(WHITESPACE);
			setState(60);
			match(VAR);
			setState(61);
			match(WHITESPACE);
			setState(62);
			match(EXTENDS);
			setState(63);
			match(WHITESPACE);
			setState(64);
			match(VAR);
			setState(65);
			match(WHITESPACE);
			setState(66);
			match(OPENFIGBRACK);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4"+
		"\6\b\n\2\3\3\2\3\5\2E\2\f\3\2\2\2\4 \3\2\2\2\6/\3\2\2\2\b:\3\2\2\2\n<"+
		"\3\2\2\2\f\r\t\2\2\2\r\3\3\2\2\2\16\17\5\2\2\2\17\20\7\t\2\2\20\21\7\16"+
		"\2\2\21\22\7\t\2\2\22\23\7\n\2\2\23\24\7\t\2\2\24\25\7\16\2\2\25!\3\2"+
		"\2\2\26\27\5\2\2\2\27\30\7\t\2\2\30\31\7\16\2\2\31\32\7\n\2\2\32\33\7"+
		"\16\2\2\33!\3\2\2\2\34\35\5\2\2\2\35\36\7\t\2\2\36\37\7\16\2\2\37!\3\2"+
		"\2\2 \16\3\2\2\2 \26\3\2\2\2 \34\3\2\2\2!\5\3\2\2\2\"#\5\2\2\2#$\7\13"+
		"\2\2$%\7\f\2\2%&\7\t\2\2&\'\7\16\2\2\'\60\3\2\2\2()\5\2\2\2)*\7\t\2\2"+
		"*+\7\16\2\2+,\7\t\2\2,-\7\13\2\2-.\7\f\2\2.\60\3\2\2\2/\"\3\2\2\2/(\3"+
		"\2\2\2\60\7\3\2\2\2\61\62\7\6\2\2\62\63\7\t\2\2\63\64\7\16\2\2\64;\7\r"+
		"\2\2\65\66\7\6\2\2\66\67\7\t\2\2\678\7\16\2\289\7\t\2\29;\7\r\2\2:\61"+
		"\3\2\2\2:\65\3\2\2\2;\t\3\2\2\2<=\7\6\2\2=>\7\t\2\2>?\7\16\2\2?@\7\t\2"+
		"\2@A\7\b\2\2AB\7\t\2\2BC\7\16\2\2CD\7\t\2\2DE\7\r\2\2E\13\3\2\2\2\5 /"+
		":";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}