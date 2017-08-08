/*
 * generated by Xtext 2.12.0
 */
package ps.xtext.json.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class JSONGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ps.xtext.json.JSON.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cObjectParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cArrayParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cNumberParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cStrParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cBooleanParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cNullParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Value:
		//	Object | Array | Number | Str | Boolean | Null;
		@Override public ParserRule getRule() { return rule; }
		
		//Object | Array | Number | Str | Boolean | Null
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Object
		public RuleCall getObjectParserRuleCall_0() { return cObjectParserRuleCall_0; }
		
		//Array
		public RuleCall getArrayParserRuleCall_1() { return cArrayParserRuleCall_1; }
		
		//Number
		public RuleCall getNumberParserRuleCall_2() { return cNumberParserRuleCall_2; }
		
		//Str
		public RuleCall getStrParserRuleCall_3() { return cStrParserRuleCall_3; }
		
		//Boolean
		public RuleCall getBooleanParserRuleCall_4() { return cBooleanParserRuleCall_4; }
		
		//Null
		public RuleCall getNullParserRuleCall_5() { return cNullParserRuleCall_5; }
	}
	public class ObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ps.xtext.json.JSON.Object");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cObjectAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cPairsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cPairsPairParserRuleCall_2_0_0 = (RuleCall)cPairsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cPairsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cPairsPairParserRuleCall_2_1_1_0 = (RuleCall)cPairsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Object:
		//	{Object} '{' (pairs+=Pair (',' pairs+=Pair)*)? '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Object} '{' (pairs+=Pair (',' pairs+=Pair)*)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Object}
		public Action getObjectAction_0() { return cObjectAction_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//(pairs+=Pair (',' pairs+=Pair)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//pairs+=Pair
		public Assignment getPairsAssignment_2_0() { return cPairsAssignment_2_0; }
		
		//Pair
		public RuleCall getPairsPairParserRuleCall_2_0_0() { return cPairsPairParserRuleCall_2_0_0; }
		
		//(',' pairs+=Pair)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//pairs+=Pair
		public Assignment getPairsAssignment_2_1_1() { return cPairsAssignment_2_1_1; }
		
		//Pair
		public RuleCall getPairsPairParserRuleCall_2_1_1_0() { return cPairsPairParserRuleCall_2_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class PairElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ps.xtext.json.JSON.Pair");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStringAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cStringSTRINGTerminalRuleCall_0_0 = (RuleCall)cStringAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Pair:
		//	string=STRING ":" value=Value;
		@Override public ParserRule getRule() { return rule; }
		
		//string=STRING ":" value=Value
		public Group getGroup() { return cGroup; }
		
		//string=STRING
		public Assignment getStringAssignment_0() { return cStringAssignment_0; }
		
		//STRING
		public RuleCall getStringSTRINGTerminalRuleCall_0_0() { return cStringSTRINGTerminalRuleCall_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//value=Value
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_0() { return cValueValueParserRuleCall_2_0; }
	}
	public class ArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ps.xtext.json.JSON.Array");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cArrayAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cValuesAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cValuesValueParserRuleCall_2_0_0 = (RuleCall)cValuesAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cValuesAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cValuesValueParserRuleCall_2_1_1_0 = (RuleCall)cValuesAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Array:
		//	{Array} '[' (values+=Value (',' values+=Value)*)? ']';
		@Override public ParserRule getRule() { return rule; }
		
		//{Array} '[' (values+=Value (',' values+=Value)*)? ']'
		public Group getGroup() { return cGroup; }
		
		//{Array}
		public Action getArrayAction_0() { return cArrayAction_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//(values+=Value (',' values+=Value)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//values+=Value
		public Assignment getValuesAssignment_2_0() { return cValuesAssignment_2_0; }
		
		//Value
		public RuleCall getValuesValueParserRuleCall_2_0_0() { return cValuesValueParserRuleCall_2_0_0; }
		
		//(',' values+=Value)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//values+=Value
		public Assignment getValuesAssignment_2_1_1() { return cValuesAssignment_2_1_1; }
		
		//Value
		public RuleCall getValuesValueParserRuleCall_2_1_1_0() { return cValuesValueParserRuleCall_2_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ps.xtext.json.JSON.Number");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNumberAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cJSONNUMBERTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Number:
		//	{Number} JSONNUMBER;
		@Override public ParserRule getRule() { return rule; }
		
		//{Number} JSONNUMBER
		public Group getGroup() { return cGroup; }
		
		//{Number}
		public Action getNumberAction_0() { return cNumberAction_0; }
		
		//JSONNUMBER
		public RuleCall getJSONNUMBERTerminalRuleCall_1() { return cJSONNUMBERTerminalRuleCall_1; }
	}
	public class StrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ps.xtext.json.JSON.Str");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStrAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Str:
		//	{Str} STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//{Str} STRING
		public Group getGroup() { return cGroup; }
		
		//{Str}
		public Action getStrAction_0() { return cStrAction_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
	}
	public class BooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ps.xtext.json.JSON.Boolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cTrueAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cTrueKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cFalseAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cFalseKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//Boolean:
		//	{True} 'true' | {False} 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//{True} 'true' | {False} 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{True} 'true'
		public Group getGroup_0() { return cGroup_0; }
		
		//{True}
		public Action getTrueAction_0_0() { return cTrueAction_0_0; }
		
		//'true'
		public Keyword getTrueKeyword_0_1() { return cTrueKeyword_0_1; }
		
		//{False} 'false'
		public Group getGroup_1() { return cGroup_1; }
		
		//{False}
		public Action getFalseAction_1_0() { return cFalseAction_1_0; }
		
		//'false'
		public Keyword getFalseKeyword_1_1() { return cFalseKeyword_1_1; }
	}
	public class NullElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ps.xtext.json.JSON.Null");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNullAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNullKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Null:
		//	{Null} 'null';
		@Override public ParserRule getRule() { return rule; }
		
		//{Null} 'null'
		public Group getGroup() { return cGroup; }
		
		//{Null}
		public Action getNullAction_0() { return cNullAction_0; }
		
		//'null'
		public Keyword getNullKeyword_1() { return cNullKeyword_1; }
	}
	
	
	private final ValueElements pValue;
	private final ObjectElements pObject;
	private final PairElements pPair;
	private final ArrayElements pArray;
	private final NumberElements pNumber;
	private final StrElements pStr;
	private final BooleanElements pBoolean;
	private final NullElements pNull;
	private final TerminalRule tJSONNUMBER;
	private final TerminalRule tDIGIT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public JSONGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pValue = new ValueElements();
		this.pObject = new ObjectElements();
		this.pPair = new PairElements();
		this.pArray = new ArrayElements();
		this.pNumber = new NumberElements();
		this.pStr = new StrElements();
		this.pBoolean = new BooleanElements();
		this.pNull = new NullElements();
		this.tJSONNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ps.xtext.json.JSON.JSONNUMBER");
		this.tDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ps.xtext.json.JSON.DIGIT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("ps.xtext.json.JSON".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Value:
	//	Object | Array | Number | Str | Boolean | Null;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}
	
	//Object:
	//	{Object} '{' (pairs+=Pair (',' pairs+=Pair)*)? '}';
	public ObjectElements getObjectAccess() {
		return pObject;
	}
	
	public ParserRule getObjectRule() {
		return getObjectAccess().getRule();
	}
	
	//Pair:
	//	string=STRING ":" value=Value;
	public PairElements getPairAccess() {
		return pPair;
	}
	
	public ParserRule getPairRule() {
		return getPairAccess().getRule();
	}
	
	//Array:
	//	{Array} '[' (values+=Value (',' values+=Value)*)? ']';
	public ArrayElements getArrayAccess() {
		return pArray;
	}
	
	public ParserRule getArrayRule() {
		return getArrayAccess().getRule();
	}
	
	//Number:
	//	{Number} JSONNUMBER;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//Str:
	//	{Str} STRING;
	public StrElements getStrAccess() {
		return pStr;
	}
	
	public ParserRule getStrRule() {
		return getStrAccess().getRule();
	}
	
	//Boolean:
	//	{True} 'true' | {False} 'false';
	public BooleanElements getBooleanAccess() {
		return pBoolean;
	}
	
	public ParserRule getBooleanRule() {
		return getBooleanAccess().getRule();
	}
	
	//Null:
	//	{Null} 'null';
	public NullElements getNullAccess() {
		return pNull;
	}
	
	public ParserRule getNullRule() {
		return getNullAccess().getRule();
	}
	
	//terminal JSONNUMBER returns ecore::EFloat:
	//	'-'? ('0' | '1'..'9' DIGIT*) ('.' DIGIT+)? (('E' | 'e') ('+' | '-')? DIGIT+)?;
	public TerminalRule getJSONNUMBERRule() {
		return tJSONNUMBER;
	}
	
	//terminal fragment DIGIT:
	//	'0'..'9';
	public TerminalRule getDIGITRule() {
		return tDIGIT;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}