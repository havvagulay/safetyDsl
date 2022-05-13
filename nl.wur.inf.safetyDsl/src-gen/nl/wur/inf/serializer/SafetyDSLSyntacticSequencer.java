/*
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.wur.inf.services.SafetyDSLGrammarAccess;
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
public class SafetyDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SafetyDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_NonSafetyCritical_SemicolonKeyword_2_1_or___LeftCurlyBracketKeyword_2_0_0_RightCurlyBracketKeyword_2_0_2__;
	protected AbstractElementAlias match_PrimaryNode_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_PrimaryNode_LeftParenthesisKeyword_1_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SafetyDSLGrammarAccess) access;
		match_NonSafetyCritical_SemicolonKeyword_2_1_or___LeftCurlyBracketKeyword_2_0_0_RightCurlyBracketKeyword_2_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getNonSafetyCriticalAccess().getLeftCurlyBracketKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getNonSafetyCriticalAccess().getRightCurlyBracketKeyword_2_0_2())), new TokenAlias(false, false, grammarAccess.getNonSafetyCriticalAccess().getSemicolonKeyword_2_1()));
		match_PrimaryNode_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryNodeAccess().getLeftParenthesisKeyword_1_0());
		match_PrimaryNode_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryNodeAccess().getLeftParenthesisKeyword_1_0());
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
			if (match_NonSafetyCritical_SemicolonKeyword_2_1_or___LeftCurlyBracketKeyword_2_0_0_RightCurlyBracketKeyword_2_0_2__.equals(syntax))
				emit_NonSafetyCritical_SemicolonKeyword_2_1_or___LeftCurlyBracketKeyword_2_0_0_RightCurlyBracketKeyword_2_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryNode_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_PrimaryNode_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryNode_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_PrimaryNode_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ';'
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_NonSafetyCritical_SemicolonKeyword_2_1_or___LeftCurlyBracketKeyword_2_0_0_RightCurlyBracketKeyword_2_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) value=[Fault|ID]
	 *     (rule start) (ambiguity) {ANDNodeExpression.left=}
	 *     (rule start) (ambiguity) {ORNodeExpression.left=}
	 */
	protected void emit_PrimaryNode_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {ANDNodeExpression.left=}
	 *     (rule start) (ambiguity) {ORNodeExpression.left=}
	 */
	protected void emit_PrimaryNode_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
