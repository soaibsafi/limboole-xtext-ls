/*
 * generated by Xtext 2.36.0
 */
package fm.services;

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
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LimbooleGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fm.Limboole.Expr");
		private final RuleCall cIffParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expr:
		//    Iff;
		@Override public ParserRule getRule() { return rule; }
		
		//Iff
		public RuleCall getIffParserRuleCall() { return cIffParserRuleCall; }
	}
	public class IffElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fm.Limboole.Iff");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cImpliesParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cIffLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLessThanSignHyphenMinusGreaterThanSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightImpliesParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Iff returns Expr:
		//    Implies ({Iff.left=current} '<->' right=Implies)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Implies ({Iff.left=current} '<->' right=Implies)*
		public Group getGroup() { return cGroup; }
		
		//Implies
		public RuleCall getImpliesParserRuleCall_0() { return cImpliesParserRuleCall_0; }
		
		//({Iff.left=current} '<->' right=Implies)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Iff.left=current}
		public Action getIffLeftAction_1_0() { return cIffLeftAction_1_0; }
		
		//'<->'
		public Keyword getLessThanSignHyphenMinusGreaterThanSignKeyword_1_1() { return cLessThanSignHyphenMinusGreaterThanSignKeyword_1_1; }
		
		//right=Implies
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Implies
		public RuleCall getRightImpliesParserRuleCall_1_2_0() { return cRightImpliesParserRuleCall_1_2_0; }
	}
	public class ImpliesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fm.Limboole.Implies");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOrParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1_0_0 = (Keyword)cAlternatives_1_0.eContents().get(0);
		private final Keyword cLessThanSignHyphenMinusKeyword_1_0_1 = (Keyword)cAlternatives_1_0.eContents().get(1);
		private final Action cImpliesLeftAction_1_1 = (Action)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightOrParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Implies returns Expr:
		//    Or (('->' | '<-') {Implies.left=current} right=Or)?;
		@Override public ParserRule getRule() { return rule; }
		
		//Or (('->' | '<-') {Implies.left=current} right=Or)?
		public Group getGroup() { return cGroup; }
		
		//Or
		public RuleCall getOrParserRuleCall_0() { return cOrParserRuleCall_0; }
		
		//(('->' | '<-') {Implies.left=current} right=Or)?
		public Group getGroup_1() { return cGroup_1; }
		
		//('->' | '<-')
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1_0_0() { return cHyphenMinusGreaterThanSignKeyword_1_0_0; }
		
		//'<-'
		public Keyword getLessThanSignHyphenMinusKeyword_1_0_1() { return cLessThanSignHyphenMinusKeyword_1_0_1; }
		
		//{Implies.left=current}
		public Action getImpliesLeftAction_1_1() { return cImpliesLeftAction_1_1; }
		
		//right=Or
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Or
		public RuleCall getRightOrParserRuleCall_1_2_0() { return cRightOrParserRuleCall_1_2_0; }
	}
	public class OrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fm.Limboole.Or");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cVerticalLineKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Or returns Expr:
		//    And ({Or.left=current} '|' right=And)*;
		@Override public ParserRule getRule() { return rule; }
		
		//And ({Or.left=current} '|' right=And)*
		public Group getGroup() { return cGroup; }
		
		//And
		public RuleCall getAndParserRuleCall_0() { return cAndParserRuleCall_0; }
		
		//({Or.left=current} '|' right=And)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Or.left=current}
		public Action getOrLeftAction_1_0() { return cOrLeftAction_1_0; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1() { return cVerticalLineKeyword_1_1; }
		
		//right=And
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//And
		public RuleCall getRightAndParserRuleCall_1_2_0() { return cRightAndParserRuleCall_1_2_0; }
	}
	public class AndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fm.Limboole.And");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNotParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAmpersandKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightNotParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//And returns Expr:
		//    Not ({And.left=current} '&' right=Not)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Not ({And.left=current} '&' right=Not)*
		public Group getGroup() { return cGroup; }
		
		//Not
		public RuleCall getNotParserRuleCall_0() { return cNotParserRuleCall_0; }
		
		//({And.left=current} '&' right=Not)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{And.left=current}
		public Action getAndLeftAction_1_0() { return cAndLeftAction_1_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_1_1() { return cAmpersandKeyword_1_1; }
		
		//right=Not
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Not
		public RuleCall getRightNotParserRuleCall_1_2_0() { return cRightNotParserRuleCall_1_2_0; }
	}
	public class NotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fm.Limboole.Not");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBasicParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cNotParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Not returns Expr:
		//    Basic
		//    | '!' Not;
		@Override public ParserRule getRule() { return rule; }
		
		//Basic
		//| '!' Not
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Basic
		public RuleCall getBasicParserRuleCall_0() { return cBasicParserRuleCall_0; }
		
		//'!' Not
		public Group getGroup_1() { return cGroup_1; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_1_0() { return cExclamationMarkKeyword_1_0; }
		
		//Not
		public RuleCall getNotParserRuleCall_1_1() { return cNotParserRuleCall_1_1; }
	}
	public class BasicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fm.Limboole.Basic");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cVarAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cVarVARTerminalRuleCall_0_0 = (RuleCall)cVarAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExprParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Basic returns Expr:
		//    var=VAR
		//    | '(' Expr ')';
		@Override public ParserRule getRule() { return rule; }
		
		//var=VAR
		//| '(' Expr ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//var=VAR
		public Assignment getVarAssignment_0() { return cVarAssignment_0; }
		
		//VAR
		public RuleCall getVarVARTerminalRuleCall_0_0() { return cVarVARTerminalRuleCall_0_0; }
		
		//'(' Expr ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Expr
		public RuleCall getExprParserRuleCall_1_1() { return cExprParserRuleCall_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	
	
	private final ExprElements pExpr;
	private final IffElements pIff;
	private final ImpliesElements pImplies;
	private final OrElements pOr;
	private final AndElements pAnd;
	private final NotElements pNot;
	private final BasicElements pBasic;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tVAR;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LimbooleGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pExpr = new ExprElements();
		this.pIff = new IffElements();
		this.pImplies = new ImpliesElements();
		this.pOr = new OrElements();
		this.pAnd = new AndElements();
		this.pNot = new NotElements();
		this.pBasic = new BasicElements();
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fm.Limboole.SL_COMMENT");
		this.tVAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fm.Limboole.VAR");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fm.Limboole".equals(grammar.getName())) {
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

	
	//Expr:
	//    Iff;
	public ExprElements getExprAccess() {
		return pExpr;
	}
	
	public ParserRule getExprRule() {
		return getExprAccess().getRule();
	}
	
	//Iff returns Expr:
	//    Implies ({Iff.left=current} '<->' right=Implies)*;
	public IffElements getIffAccess() {
		return pIff;
	}
	
	public ParserRule getIffRule() {
		return getIffAccess().getRule();
	}
	
	//Implies returns Expr:
	//    Or (('->' | '<-') {Implies.left=current} right=Or)?;
	public ImpliesElements getImpliesAccess() {
		return pImplies;
	}
	
	public ParserRule getImpliesRule() {
		return getImpliesAccess().getRule();
	}
	
	//Or returns Expr:
	//    And ({Or.left=current} '|' right=And)*;
	public OrElements getOrAccess() {
		return pOr;
	}
	
	public ParserRule getOrRule() {
		return getOrAccess().getRule();
	}
	
	//And returns Expr:
	//    Not ({And.left=current} '&' right=Not)*;
	public AndElements getAndAccess() {
		return pAnd;
	}
	
	public ParserRule getAndRule() {
		return getAndAccess().getRule();
	}
	
	//Not returns Expr:
	//    Basic
	//    | '!' Not;
	public NotElements getNotAccess() {
		return pNot;
	}
	
	public ParserRule getNotRule() {
		return getNotAccess().getRule();
	}
	
	//Basic returns Expr:
	//    var=VAR
	//    | '(' Expr ')';
	public BasicElements getBasicAccess() {
		return pBasic;
	}
	
	public ParserRule getBasicRule() {
		return getBasicAccess().getRule();
	}
	
	//@Override
	//terminal SL_COMMENT : '%' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal VAR: ('a'..'z'|'A'..'Z'|'_'|'-'|'.'|'['|']'|'$'|'@'|'0'..'9')* ('a'..'z'|'A'..'Z'|'_'|'.'|'['|']'|'$'|'@'|'0'..'9');
	public TerminalRule getVARRule() {
		return tVAR;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
