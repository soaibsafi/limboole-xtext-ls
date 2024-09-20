package fm.ide;

import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import fm.limboole.LimboolePackage;
import fm.services.LimbooleGrammarAccess;

import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

// TODO: Complete the implementation
public class LimbooleIdeContentProposalProvider extends IdeContentProposalProvider {
	@Inject
	private LimbooleGrammarAccess limbooleGrammarAccess;

	@Inject
	private IScopeProvider scopeProvider;

	@Override
    protected void _createProposals(RuleCall ruleCall, ContentAssistContext context,
            IIdeContentProposalAcceptor acceptor) {
        if (limbooleGrammarAccess.getAndRule().equals(ruleCall.getRule()) && context.getCurrentModel() != null) {
        	IScope scope = scopeProvider.getScope(context.getCurrentModel(), LimboolePackage.Literals.EXPR__RIGHT);
        }
    }

}