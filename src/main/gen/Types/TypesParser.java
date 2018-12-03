// Generated from C:/Users/vladh/Desktop/antlr-project/src/main/antlr/com/example/Types\Types.g4 by ANTLR 4.7
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
		BYTE=1, INT=2, DOUBLE=3, WHITESPACE=4, VAR=5;
	public static final int
		RULE_type = 0;
	public static final String[] ruleNames = {
		"type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'byte'", "'int'", "'double'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BYTE", "INT", "DOUBLE", "WHITESPACE", "VAR"
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
		public TerminalNode WHITESPACE() { return getToken(TypesParser.WHITESPACE, 0); }
		public TerminalNode VAR() { return getToken(TypesParser.VAR, 0); }
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
		try {
			setState(11);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				match(BYTE);
				setState(3);
				match(WHITESPACE);
				setState(4);
				match(VAR);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				match(INT);
				setState(6);
				match(WHITESPACE);
				setState(7);
				match(VAR);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				match(DOUBLE);
				setState(9);
				match(WHITESPACE);
				setState(10);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\20\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\16\n\2\3\2\2\2\3\2\2\2\2\20\2\r\3"+
		"\2\2\2\4\5\7\3\2\2\5\6\7\6\2\2\6\16\7\7\2\2\7\b\7\4\2\2\b\t\7\6\2\2\t"+
		"\16\7\7\2\2\n\13\7\5\2\2\13\f\7\6\2\2\f\16\7\7\2\2\r\4\3\2\2\2\r\7\3\2"+
		"\2\2\r\n\3\2\2\2\16\3\3\2\2\2\3\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}