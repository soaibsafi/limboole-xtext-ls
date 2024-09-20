/*
 * generated by Xtext 2.36.0
 */
package fm.serializer;

import com.google.inject.Inject;
import fm.services.LimbooleGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LimbooleSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LimbooleGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Basic_Not___ExclamationMarkKeyword_1_0_a_LeftParenthesisKeyword_1_0__a;
	protected AbstractElementAlias match_Basic_Not___ExclamationMarkKeyword_1_0_a_LeftParenthesisKeyword_1_0__p;
	protected AbstractElementAlias match_Basic_Not___ExclamationMarkKeyword_1_0_or_LeftParenthesisKeyword_1_0__a;
	protected AbstractElementAlias match_Basic_Not___LeftParenthesisKeyword_1_0_ExclamationMarkKeyword_1_0_a__a;
	protected AbstractElementAlias match_Implies_HyphenMinusGreaterThanSignKeyword_1_0_0_or_LessThanSignHyphenMinusKeyword_1_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LimbooleGrammarAccess) access;
		match_Basic_Not___ExclamationMarkKeyword_1_0_a_LeftParenthesisKeyword_1_0__a = new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getNotAccess().getExclamationMarkKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getBasicAccess().getLeftParenthesisKeyword_1_0()));
		match_Basic_Not___ExclamationMarkKeyword_1_0_a_LeftParenthesisKeyword_1_0__p = new GroupAlias(true, false, new TokenAlias(true, true, grammarAccess.getNotAccess().getExclamationMarkKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getBasicAccess().getLeftParenthesisKeyword_1_0()));
		match_Basic_Not___ExclamationMarkKeyword_1_0_or_LeftParenthesisKeyword_1_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getBasicAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getNotAccess().getExclamationMarkKeyword_1_0()));
		match_Basic_Not___LeftParenthesisKeyword_1_0_ExclamationMarkKeyword_1_0_a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getBasicAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(true, true, grammarAccess.getNotAccess().getExclamationMarkKeyword_1_0()));
		match_Implies_HyphenMinusGreaterThanSignKeyword_1_0_0_or_LessThanSignHyphenMinusKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImpliesAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getImpliesAccess().getLessThanSignHyphenMinusKeyword_1_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Basic_Not___ExclamationMarkKeyword_1_0_a_LeftParenthesisKeyword_1_0__a.equals(syntax))
				emit_Basic_Not___ExclamationMarkKeyword_1_0_a_LeftParenthesisKeyword_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Basic_Not___ExclamationMarkKeyword_1_0_a_LeftParenthesisKeyword_1_0__p.equals(syntax))
				emit_Basic_Not___ExclamationMarkKeyword_1_0_a_LeftParenthesisKeyword_1_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Basic_Not___ExclamationMarkKeyword_1_0_or_LeftParenthesisKeyword_1_0__a.equals(syntax))
				emit_Basic_Not___ExclamationMarkKeyword_1_0_or_LeftParenthesisKeyword_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Basic_Not___LeftParenthesisKeyword_1_0_ExclamationMarkKeyword_1_0_a__a.equals(syntax))
				emit_Basic_Not___LeftParenthesisKeyword_1_0_ExclamationMarkKeyword_1_0_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Implies_HyphenMinusGreaterThanSignKeyword_1_0_0_or_LessThanSignHyphenMinusKeyword_1_0_1.equals(syntax))
				emit_Implies_HyphenMinusGreaterThanSignKeyword_1_0_0_or_LessThanSignHyphenMinusKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('!'* '(')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '(' (ambiguity) {And.left=}
	 *     (rule start) '(' (ambiguity) {Iff.left=}
	 *     (rule start) '(' (ambiguity) {Implies.left=}
	 *     (rule start) '(' (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Iff.left=}
	 *     (rule start) (ambiguity) {Implies.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 
	 * </pre>
	 */
	protected void emit_Basic_Not___ExclamationMarkKeyword_1_0_a_LeftParenthesisKeyword_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('!'* '(')+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Iff.left=}
	 *     (rule start) (ambiguity) {Implies.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 
	 * </pre>
	 */
	protected void emit_Basic_Not___ExclamationMarkKeyword_1_0_a_LeftParenthesisKeyword_1_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('!' | '(')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) var=VAR
	 
	 * </pre>
	 */
	protected void emit_Basic_Not___ExclamationMarkKeyword_1_0_or_LeftParenthesisKeyword_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' '!'*)*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) var=VAR
	 
	 * </pre>
	 */
	protected void emit_Basic_Not___LeftParenthesisKeyword_1_0_ExclamationMarkKeyword_1_0_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '-&gt;' | '&lt;-'
	 *
	 * This ambiguous syntax occurs at:
	 *     right=And (ambiguity) (rule end)
	 *     right=Implies ')' (ambiguity) (rule end)
	 *     right=Not (ambiguity) (rule end)
	 *     right=Or ')' (ambiguity) (rule end)
	 *     var=VAR (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Implies_HyphenMinusGreaterThanSignKeyword_1_0_0_or_LessThanSignHyphenMinusKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
