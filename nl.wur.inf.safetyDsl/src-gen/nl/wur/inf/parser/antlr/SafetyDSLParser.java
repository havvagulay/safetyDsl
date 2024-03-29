/*
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.parser.antlr;

import com.google.inject.Inject;
import nl.wur.inf.parser.antlr.internal.InternalSafetyDSLParser;
import nl.wur.inf.services.SafetyDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SafetyDSLParser extends AbstractAntlrParser {

	@Inject
	private SafetyDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSafetyDSLParser createParser(XtextTokenStream stream) {
		return new InternalSafetyDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SafetyFramework";
	}

	public SafetyDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SafetyDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
