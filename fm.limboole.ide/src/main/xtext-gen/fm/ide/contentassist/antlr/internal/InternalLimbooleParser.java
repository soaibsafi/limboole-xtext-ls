package fm.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fm.services.LimbooleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLimbooleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VAR", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'<-'", "'<->'", "'|'", "'&'", "'!'", "'('", "')'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_VAR=4;

    // delegates
    // delegators


        public InternalLimbooleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLimbooleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLimbooleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLimboole.g"; }


    	private LimbooleGrammarAccess grammarAccess;

    	public void setGrammarAccess(LimbooleGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleExpr"
    // InternalLimboole.g:53:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalLimboole.g:54:1: ( ruleExpr EOF )
            // InternalLimboole.g:55:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalLimboole.g:62:1: ruleExpr : ( ruleIff ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:66:2: ( ( ruleIff ) )
            // InternalLimboole.g:67:2: ( ruleIff )
            {
            // InternalLimboole.g:67:2: ( ruleIff )
            // InternalLimboole.g:68:3: ruleIff
            {
             before(grammarAccess.getExprAccess().getIffParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleIff();

            state._fsp--;

             after(grammarAccess.getExprAccess().getIffParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleIff"
    // InternalLimboole.g:78:1: entryRuleIff : ruleIff EOF ;
    public final void entryRuleIff() throws RecognitionException {
        try {
            // InternalLimboole.g:79:1: ( ruleIff EOF )
            // InternalLimboole.g:80:1: ruleIff EOF
            {
             before(grammarAccess.getIffRule()); 
            pushFollow(FOLLOW_1);
            ruleIff();

            state._fsp--;

             after(grammarAccess.getIffRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIff"


    // $ANTLR start "ruleIff"
    // InternalLimboole.g:87:1: ruleIff : ( ( rule__Iff__Group__0 ) ) ;
    public final void ruleIff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:91:2: ( ( ( rule__Iff__Group__0 ) ) )
            // InternalLimboole.g:92:2: ( ( rule__Iff__Group__0 ) )
            {
            // InternalLimboole.g:92:2: ( ( rule__Iff__Group__0 ) )
            // InternalLimboole.g:93:3: ( rule__Iff__Group__0 )
            {
             before(grammarAccess.getIffAccess().getGroup()); 
            // InternalLimboole.g:94:3: ( rule__Iff__Group__0 )
            // InternalLimboole.g:94:4: rule__Iff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Iff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIffAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIff"


    // $ANTLR start "entryRuleImplies"
    // InternalLimboole.g:103:1: entryRuleImplies : ruleImplies EOF ;
    public final void entryRuleImplies() throws RecognitionException {
        try {
            // InternalLimboole.g:104:1: ( ruleImplies EOF )
            // InternalLimboole.g:105:1: ruleImplies EOF
            {
             before(grammarAccess.getImpliesRule()); 
            pushFollow(FOLLOW_1);
            ruleImplies();

            state._fsp--;

             after(grammarAccess.getImpliesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImplies"


    // $ANTLR start "ruleImplies"
    // InternalLimboole.g:112:1: ruleImplies : ( ( rule__Implies__Group__0 ) ) ;
    public final void ruleImplies() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:116:2: ( ( ( rule__Implies__Group__0 ) ) )
            // InternalLimboole.g:117:2: ( ( rule__Implies__Group__0 ) )
            {
            // InternalLimboole.g:117:2: ( ( rule__Implies__Group__0 ) )
            // InternalLimboole.g:118:3: ( rule__Implies__Group__0 )
            {
             before(grammarAccess.getImpliesAccess().getGroup()); 
            // InternalLimboole.g:119:3: ( rule__Implies__Group__0 )
            // InternalLimboole.g:119:4: rule__Implies__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Implies__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImpliesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplies"


    // $ANTLR start "entryRuleOr"
    // InternalLimboole.g:128:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalLimboole.g:129:1: ( ruleOr EOF )
            // InternalLimboole.g:130:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalLimboole.g:137:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:141:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalLimboole.g:142:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalLimboole.g:142:2: ( ( rule__Or__Group__0 ) )
            // InternalLimboole.g:143:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalLimboole.g:144:3: ( rule__Or__Group__0 )
            // InternalLimboole.g:144:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalLimboole.g:153:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalLimboole.g:154:1: ( ruleAnd EOF )
            // InternalLimboole.g:155:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalLimboole.g:162:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:166:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalLimboole.g:167:2: ( ( rule__And__Group__0 ) )
            {
            // InternalLimboole.g:167:2: ( ( rule__And__Group__0 ) )
            // InternalLimboole.g:168:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalLimboole.g:169:3: ( rule__And__Group__0 )
            // InternalLimboole.g:169:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNot"
    // InternalLimboole.g:178:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalLimboole.g:179:1: ( ruleNot EOF )
            // InternalLimboole.g:180:1: ruleNot EOF
            {
             before(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getNotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalLimboole.g:187:1: ruleNot : ( ( rule__Not__Alternatives ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:191:2: ( ( ( rule__Not__Alternatives ) ) )
            // InternalLimboole.g:192:2: ( ( rule__Not__Alternatives ) )
            {
            // InternalLimboole.g:192:2: ( ( rule__Not__Alternatives ) )
            // InternalLimboole.g:193:3: ( rule__Not__Alternatives )
            {
             before(grammarAccess.getNotAccess().getAlternatives()); 
            // InternalLimboole.g:194:3: ( rule__Not__Alternatives )
            // InternalLimboole.g:194:4: rule__Not__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Not__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleBasic"
    // InternalLimboole.g:203:1: entryRuleBasic : ruleBasic EOF ;
    public final void entryRuleBasic() throws RecognitionException {
        try {
            // InternalLimboole.g:204:1: ( ruleBasic EOF )
            // InternalLimboole.g:205:1: ruleBasic EOF
            {
             before(grammarAccess.getBasicRule()); 
            pushFollow(FOLLOW_1);
            ruleBasic();

            state._fsp--;

             after(grammarAccess.getBasicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasic"


    // $ANTLR start "ruleBasic"
    // InternalLimboole.g:212:1: ruleBasic : ( ( rule__Basic__Alternatives ) ) ;
    public final void ruleBasic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:216:2: ( ( ( rule__Basic__Alternatives ) ) )
            // InternalLimboole.g:217:2: ( ( rule__Basic__Alternatives ) )
            {
            // InternalLimboole.g:217:2: ( ( rule__Basic__Alternatives ) )
            // InternalLimboole.g:218:3: ( rule__Basic__Alternatives )
            {
             before(grammarAccess.getBasicAccess().getAlternatives()); 
            // InternalLimboole.g:219:3: ( rule__Basic__Alternatives )
            // InternalLimboole.g:219:4: rule__Basic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Basic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasic"


    // $ANTLR start "rule__Implies__Alternatives_1_0"
    // InternalLimboole.g:227:1: rule__Implies__Alternatives_1_0 : ( ( '->' ) | ( '<-' ) );
    public final void rule__Implies__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:231:1: ( ( '->' ) | ( '<-' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLimboole.g:232:2: ( '->' )
                    {
                    // InternalLimboole.g:232:2: ( '->' )
                    // InternalLimboole.g:233:3: '->'
                    {
                     before(grammarAccess.getImpliesAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getImpliesAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLimboole.g:238:2: ( '<-' )
                    {
                    // InternalLimboole.g:238:2: ( '<-' )
                    // InternalLimboole.g:239:3: '<-'
                    {
                     before(grammarAccess.getImpliesAccess().getLessThanSignHyphenMinusKeyword_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getImpliesAccess().getLessThanSignHyphenMinusKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Alternatives_1_0"


    // $ANTLR start "rule__Not__Alternatives"
    // InternalLimboole.g:248:1: rule__Not__Alternatives : ( ( ruleBasic ) | ( ( rule__Not__Group_1__0 ) ) );
    public final void rule__Not__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:252:1: ( ( ruleBasic ) | ( ( rule__Not__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_VAR||LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLimboole.g:253:2: ( ruleBasic )
                    {
                    // InternalLimboole.g:253:2: ( ruleBasic )
                    // InternalLimboole.g:254:3: ruleBasic
                    {
                     before(grammarAccess.getNotAccess().getBasicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasic();

                    state._fsp--;

                     after(grammarAccess.getNotAccess().getBasicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLimboole.g:259:2: ( ( rule__Not__Group_1__0 ) )
                    {
                    // InternalLimboole.g:259:2: ( ( rule__Not__Group_1__0 ) )
                    // InternalLimboole.g:260:3: ( rule__Not__Group_1__0 )
                    {
                     before(grammarAccess.getNotAccess().getGroup_1()); 
                    // InternalLimboole.g:261:3: ( rule__Not__Group_1__0 )
                    // InternalLimboole.g:261:4: rule__Not__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Not__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Alternatives"


    // $ANTLR start "rule__Basic__Alternatives"
    // InternalLimboole.g:269:1: rule__Basic__Alternatives : ( ( ( rule__Basic__VarAssignment_0 ) ) | ( ( rule__Basic__Group_1__0 ) ) );
    public final void rule__Basic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:273:1: ( ( ( rule__Basic__VarAssignment_0 ) ) | ( ( rule__Basic__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_VAR) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLimboole.g:274:2: ( ( rule__Basic__VarAssignment_0 ) )
                    {
                    // InternalLimboole.g:274:2: ( ( rule__Basic__VarAssignment_0 ) )
                    // InternalLimboole.g:275:3: ( rule__Basic__VarAssignment_0 )
                    {
                     before(grammarAccess.getBasicAccess().getVarAssignment_0()); 
                    // InternalLimboole.g:276:3: ( rule__Basic__VarAssignment_0 )
                    // InternalLimboole.g:276:4: rule__Basic__VarAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basic__VarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicAccess().getVarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLimboole.g:280:2: ( ( rule__Basic__Group_1__0 ) )
                    {
                    // InternalLimboole.g:280:2: ( ( rule__Basic__Group_1__0 ) )
                    // InternalLimboole.g:281:3: ( rule__Basic__Group_1__0 )
                    {
                     before(grammarAccess.getBasicAccess().getGroup_1()); 
                    // InternalLimboole.g:282:3: ( rule__Basic__Group_1__0 )
                    // InternalLimboole.g:282:4: rule__Basic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basic__Alternatives"


    // $ANTLR start "rule__Iff__Group__0"
    // InternalLimboole.g:290:1: rule__Iff__Group__0 : rule__Iff__Group__0__Impl rule__Iff__Group__1 ;
    public final void rule__Iff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:294:1: ( rule__Iff__Group__0__Impl rule__Iff__Group__1 )
            // InternalLimboole.g:295:2: rule__Iff__Group__0__Impl rule__Iff__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Iff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iff__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group__0"


    // $ANTLR start "rule__Iff__Group__0__Impl"
    // InternalLimboole.g:302:1: rule__Iff__Group__0__Impl : ( ruleImplies ) ;
    public final void rule__Iff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:306:1: ( ( ruleImplies ) )
            // InternalLimboole.g:307:1: ( ruleImplies )
            {
            // InternalLimboole.g:307:1: ( ruleImplies )
            // InternalLimboole.g:308:2: ruleImplies
            {
             before(grammarAccess.getIffAccess().getImpliesParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleImplies();

            state._fsp--;

             after(grammarAccess.getIffAccess().getImpliesParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group__0__Impl"


    // $ANTLR start "rule__Iff__Group__1"
    // InternalLimboole.g:317:1: rule__Iff__Group__1 : rule__Iff__Group__1__Impl ;
    public final void rule__Iff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:321:1: ( rule__Iff__Group__1__Impl )
            // InternalLimboole.g:322:2: rule__Iff__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iff__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group__1"


    // $ANTLR start "rule__Iff__Group__1__Impl"
    // InternalLimboole.g:328:1: rule__Iff__Group__1__Impl : ( ( rule__Iff__Group_1__0 )* ) ;
    public final void rule__Iff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:332:1: ( ( ( rule__Iff__Group_1__0 )* ) )
            // InternalLimboole.g:333:1: ( ( rule__Iff__Group_1__0 )* )
            {
            // InternalLimboole.g:333:1: ( ( rule__Iff__Group_1__0 )* )
            // InternalLimboole.g:334:2: ( rule__Iff__Group_1__0 )*
            {
             before(grammarAccess.getIffAccess().getGroup_1()); 
            // InternalLimboole.g:335:2: ( rule__Iff__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLimboole.g:335:3: rule__Iff__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Iff__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getIffAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group__1__Impl"


    // $ANTLR start "rule__Iff__Group_1__0"
    // InternalLimboole.g:344:1: rule__Iff__Group_1__0 : rule__Iff__Group_1__0__Impl rule__Iff__Group_1__1 ;
    public final void rule__Iff__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:348:1: ( rule__Iff__Group_1__0__Impl rule__Iff__Group_1__1 )
            // InternalLimboole.g:349:2: rule__Iff__Group_1__0__Impl rule__Iff__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Iff__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iff__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__0"


    // $ANTLR start "rule__Iff__Group_1__0__Impl"
    // InternalLimboole.g:356:1: rule__Iff__Group_1__0__Impl : ( () ) ;
    public final void rule__Iff__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:360:1: ( ( () ) )
            // InternalLimboole.g:361:1: ( () )
            {
            // InternalLimboole.g:361:1: ( () )
            // InternalLimboole.g:362:2: ()
            {
             before(grammarAccess.getIffAccess().getIffLeftAction_1_0()); 
            // InternalLimboole.g:363:2: ()
            // InternalLimboole.g:363:3: 
            {
            }

             after(grammarAccess.getIffAccess().getIffLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__0__Impl"


    // $ANTLR start "rule__Iff__Group_1__1"
    // InternalLimboole.g:371:1: rule__Iff__Group_1__1 : rule__Iff__Group_1__1__Impl rule__Iff__Group_1__2 ;
    public final void rule__Iff__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:375:1: ( rule__Iff__Group_1__1__Impl rule__Iff__Group_1__2 )
            // InternalLimboole.g:376:2: rule__Iff__Group_1__1__Impl rule__Iff__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Iff__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iff__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__1"


    // $ANTLR start "rule__Iff__Group_1__1__Impl"
    // InternalLimboole.g:383:1: rule__Iff__Group_1__1__Impl : ( '<->' ) ;
    public final void rule__Iff__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:387:1: ( ( '<->' ) )
            // InternalLimboole.g:388:1: ( '<->' )
            {
            // InternalLimboole.g:388:1: ( '<->' )
            // InternalLimboole.g:389:2: '<->'
            {
             before(grammarAccess.getIffAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getIffAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__1__Impl"


    // $ANTLR start "rule__Iff__Group_1__2"
    // InternalLimboole.g:398:1: rule__Iff__Group_1__2 : rule__Iff__Group_1__2__Impl ;
    public final void rule__Iff__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:402:1: ( rule__Iff__Group_1__2__Impl )
            // InternalLimboole.g:403:2: rule__Iff__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iff__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__2"


    // $ANTLR start "rule__Iff__Group_1__2__Impl"
    // InternalLimboole.g:409:1: rule__Iff__Group_1__2__Impl : ( ( rule__Iff__RightAssignment_1_2 ) ) ;
    public final void rule__Iff__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:413:1: ( ( ( rule__Iff__RightAssignment_1_2 ) ) )
            // InternalLimboole.g:414:1: ( ( rule__Iff__RightAssignment_1_2 ) )
            {
            // InternalLimboole.g:414:1: ( ( rule__Iff__RightAssignment_1_2 ) )
            // InternalLimboole.g:415:2: ( rule__Iff__RightAssignment_1_2 )
            {
             before(grammarAccess.getIffAccess().getRightAssignment_1_2()); 
            // InternalLimboole.g:416:2: ( rule__Iff__RightAssignment_1_2 )
            // InternalLimboole.g:416:3: rule__Iff__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Iff__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIffAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__Group_1__2__Impl"


    // $ANTLR start "rule__Implies__Group__0"
    // InternalLimboole.g:425:1: rule__Implies__Group__0 : rule__Implies__Group__0__Impl rule__Implies__Group__1 ;
    public final void rule__Implies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:429:1: ( rule__Implies__Group__0__Impl rule__Implies__Group__1 )
            // InternalLimboole.g:430:2: rule__Implies__Group__0__Impl rule__Implies__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Implies__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implies__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group__0"


    // $ANTLR start "rule__Implies__Group__0__Impl"
    // InternalLimboole.g:437:1: rule__Implies__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Implies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:441:1: ( ( ruleOr ) )
            // InternalLimboole.g:442:1: ( ruleOr )
            {
            // InternalLimboole.g:442:1: ( ruleOr )
            // InternalLimboole.g:443:2: ruleOr
            {
             before(grammarAccess.getImpliesAccess().getOrParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getImpliesAccess().getOrParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group__0__Impl"


    // $ANTLR start "rule__Implies__Group__1"
    // InternalLimboole.g:452:1: rule__Implies__Group__1 : rule__Implies__Group__1__Impl ;
    public final void rule__Implies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:456:1: ( rule__Implies__Group__1__Impl )
            // InternalLimboole.g:457:2: rule__Implies__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implies__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group__1"


    // $ANTLR start "rule__Implies__Group__1__Impl"
    // InternalLimboole.g:463:1: rule__Implies__Group__1__Impl : ( ( rule__Implies__Group_1__0 )? ) ;
    public final void rule__Implies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:467:1: ( ( ( rule__Implies__Group_1__0 )? ) )
            // InternalLimboole.g:468:1: ( ( rule__Implies__Group_1__0 )? )
            {
            // InternalLimboole.g:468:1: ( ( rule__Implies__Group_1__0 )? )
            // InternalLimboole.g:469:2: ( rule__Implies__Group_1__0 )?
            {
             before(grammarAccess.getImpliesAccess().getGroup_1()); 
            // InternalLimboole.g:470:2: ( rule__Implies__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=12 && LA5_0<=13)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLimboole.g:470:3: rule__Implies__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Implies__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImpliesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group__1__Impl"


    // $ANTLR start "rule__Implies__Group_1__0"
    // InternalLimboole.g:479:1: rule__Implies__Group_1__0 : rule__Implies__Group_1__0__Impl rule__Implies__Group_1__1 ;
    public final void rule__Implies__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:483:1: ( rule__Implies__Group_1__0__Impl rule__Implies__Group_1__1 )
            // InternalLimboole.g:484:2: rule__Implies__Group_1__0__Impl rule__Implies__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Implies__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implies__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__0"


    // $ANTLR start "rule__Implies__Group_1__0__Impl"
    // InternalLimboole.g:491:1: rule__Implies__Group_1__0__Impl : ( ( rule__Implies__Alternatives_1_0 ) ) ;
    public final void rule__Implies__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:495:1: ( ( ( rule__Implies__Alternatives_1_0 ) ) )
            // InternalLimboole.g:496:1: ( ( rule__Implies__Alternatives_1_0 ) )
            {
            // InternalLimboole.g:496:1: ( ( rule__Implies__Alternatives_1_0 ) )
            // InternalLimboole.g:497:2: ( rule__Implies__Alternatives_1_0 )
            {
             before(grammarAccess.getImpliesAccess().getAlternatives_1_0()); 
            // InternalLimboole.g:498:2: ( rule__Implies__Alternatives_1_0 )
            // InternalLimboole.g:498:3: rule__Implies__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Implies__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImpliesAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__0__Impl"


    // $ANTLR start "rule__Implies__Group_1__1"
    // InternalLimboole.g:506:1: rule__Implies__Group_1__1 : rule__Implies__Group_1__1__Impl rule__Implies__Group_1__2 ;
    public final void rule__Implies__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:510:1: ( rule__Implies__Group_1__1__Impl rule__Implies__Group_1__2 )
            // InternalLimboole.g:511:2: rule__Implies__Group_1__1__Impl rule__Implies__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Implies__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implies__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__1"


    // $ANTLR start "rule__Implies__Group_1__1__Impl"
    // InternalLimboole.g:518:1: rule__Implies__Group_1__1__Impl : ( () ) ;
    public final void rule__Implies__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:522:1: ( ( () ) )
            // InternalLimboole.g:523:1: ( () )
            {
            // InternalLimboole.g:523:1: ( () )
            // InternalLimboole.g:524:2: ()
            {
             before(grammarAccess.getImpliesAccess().getImpliesLeftAction_1_1()); 
            // InternalLimboole.g:525:2: ()
            // InternalLimboole.g:525:3: 
            {
            }

             after(grammarAccess.getImpliesAccess().getImpliesLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__1__Impl"


    // $ANTLR start "rule__Implies__Group_1__2"
    // InternalLimboole.g:533:1: rule__Implies__Group_1__2 : rule__Implies__Group_1__2__Impl ;
    public final void rule__Implies__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:537:1: ( rule__Implies__Group_1__2__Impl )
            // InternalLimboole.g:538:2: rule__Implies__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implies__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__2"


    // $ANTLR start "rule__Implies__Group_1__2__Impl"
    // InternalLimboole.g:544:1: rule__Implies__Group_1__2__Impl : ( ( rule__Implies__RightAssignment_1_2 ) ) ;
    public final void rule__Implies__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:548:1: ( ( ( rule__Implies__RightAssignment_1_2 ) ) )
            // InternalLimboole.g:549:1: ( ( rule__Implies__RightAssignment_1_2 ) )
            {
            // InternalLimboole.g:549:1: ( ( rule__Implies__RightAssignment_1_2 ) )
            // InternalLimboole.g:550:2: ( rule__Implies__RightAssignment_1_2 )
            {
             before(grammarAccess.getImpliesAccess().getRightAssignment_1_2()); 
            // InternalLimboole.g:551:2: ( rule__Implies__RightAssignment_1_2 )
            // InternalLimboole.g:551:3: rule__Implies__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Implies__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImpliesAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__Group_1__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalLimboole.g:560:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:564:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalLimboole.g:565:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalLimboole.g:572:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:576:1: ( ( ruleAnd ) )
            // InternalLimboole.g:577:1: ( ruleAnd )
            {
            // InternalLimboole.g:577:1: ( ruleAnd )
            // InternalLimboole.g:578:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalLimboole.g:587:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:591:1: ( rule__Or__Group__1__Impl )
            // InternalLimboole.g:592:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalLimboole.g:598:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:602:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalLimboole.g:603:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalLimboole.g:603:1: ( ( rule__Or__Group_1__0 )* )
            // InternalLimboole.g:604:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalLimboole.g:605:2: ( rule__Or__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLimboole.g:605:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalLimboole.g:614:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:618:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalLimboole.g:619:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalLimboole.g:626:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:630:1: ( ( () ) )
            // InternalLimboole.g:631:1: ( () )
            {
            // InternalLimboole.g:631:1: ( () )
            // InternalLimboole.g:632:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalLimboole.g:633:2: ()
            // InternalLimboole.g:633:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalLimboole.g:641:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:645:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalLimboole.g:646:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalLimboole.g:653:1: rule__Or__Group_1__1__Impl : ( '|' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:657:1: ( ( '|' ) )
            // InternalLimboole.g:658:1: ( '|' )
            {
            // InternalLimboole.g:658:1: ( '|' )
            // InternalLimboole.g:659:2: '|'
            {
             before(grammarAccess.getOrAccess().getVerticalLineKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalLimboole.g:668:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:672:1: ( rule__Or__Group_1__2__Impl )
            // InternalLimboole.g:673:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalLimboole.g:679:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:683:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalLimboole.g:684:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalLimboole.g:684:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalLimboole.g:685:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalLimboole.g:686:2: ( rule__Or__RightAssignment_1_2 )
            // InternalLimboole.g:686:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalLimboole.g:695:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:699:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalLimboole.g:700:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalLimboole.g:707:1: rule__And__Group__0__Impl : ( ruleNot ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:711:1: ( ( ruleNot ) )
            // InternalLimboole.g:712:1: ( ruleNot )
            {
            // InternalLimboole.g:712:1: ( ruleNot )
            // InternalLimboole.g:713:2: ruleNot
            {
             before(grammarAccess.getAndAccess().getNotParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getAndAccess().getNotParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalLimboole.g:722:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:726:1: ( rule__And__Group__1__Impl )
            // InternalLimboole.g:727:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalLimboole.g:733:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:737:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalLimboole.g:738:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalLimboole.g:738:1: ( ( rule__And__Group_1__0 )* )
            // InternalLimboole.g:739:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalLimboole.g:740:2: ( rule__And__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLimboole.g:740:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalLimboole.g:749:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:753:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalLimboole.g:754:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalLimboole.g:761:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:765:1: ( ( () ) )
            // InternalLimboole.g:766:1: ( () )
            {
            // InternalLimboole.g:766:1: ( () )
            // InternalLimboole.g:767:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalLimboole.g:768:2: ()
            // InternalLimboole.g:768:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalLimboole.g:776:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:780:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalLimboole.g:781:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalLimboole.g:788:1: rule__And__Group_1__1__Impl : ( '&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:792:1: ( ( '&' ) )
            // InternalLimboole.g:793:1: ( '&' )
            {
            // InternalLimboole.g:793:1: ( '&' )
            // InternalLimboole.g:794:2: '&'
            {
             before(grammarAccess.getAndAccess().getAmpersandKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalLimboole.g:803:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:807:1: ( rule__And__Group_1__2__Impl )
            // InternalLimboole.g:808:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalLimboole.g:814:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:818:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalLimboole.g:819:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalLimboole.g:819:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalLimboole.g:820:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalLimboole.g:821:2: ( rule__And__RightAssignment_1_2 )
            // InternalLimboole.g:821:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Not__Group_1__0"
    // InternalLimboole.g:830:1: rule__Not__Group_1__0 : rule__Not__Group_1__0__Impl rule__Not__Group_1__1 ;
    public final void rule__Not__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:834:1: ( rule__Not__Group_1__0__Impl rule__Not__Group_1__1 )
            // InternalLimboole.g:835:2: rule__Not__Group_1__0__Impl rule__Not__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Not__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1__0"


    // $ANTLR start "rule__Not__Group_1__0__Impl"
    // InternalLimboole.g:842:1: rule__Not__Group_1__0__Impl : ( '!' ) ;
    public final void rule__Not__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:846:1: ( ( '!' ) )
            // InternalLimboole.g:847:1: ( '!' )
            {
            // InternalLimboole.g:847:1: ( '!' )
            // InternalLimboole.g:848:2: '!'
            {
             before(grammarAccess.getNotAccess().getExclamationMarkKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1__0__Impl"


    // $ANTLR start "rule__Not__Group_1__1"
    // InternalLimboole.g:857:1: rule__Not__Group_1__1 : rule__Not__Group_1__1__Impl ;
    public final void rule__Not__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:861:1: ( rule__Not__Group_1__1__Impl )
            // InternalLimboole.g:862:2: rule__Not__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1__1"


    // $ANTLR start "rule__Not__Group_1__1__Impl"
    // InternalLimboole.g:868:1: rule__Not__Group_1__1__Impl : ( ruleNot ) ;
    public final void rule__Not__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:872:1: ( ( ruleNot ) )
            // InternalLimboole.g:873:1: ( ruleNot )
            {
            // InternalLimboole.g:873:1: ( ruleNot )
            // InternalLimboole.g:874:2: ruleNot
            {
             before(grammarAccess.getNotAccess().getNotParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getNotAccess().getNotParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1__1__Impl"


    // $ANTLR start "rule__Basic__Group_1__0"
    // InternalLimboole.g:884:1: rule__Basic__Group_1__0 : rule__Basic__Group_1__0__Impl rule__Basic__Group_1__1 ;
    public final void rule__Basic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:888:1: ( rule__Basic__Group_1__0__Impl rule__Basic__Group_1__1 )
            // InternalLimboole.g:889:2: rule__Basic__Group_1__0__Impl rule__Basic__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Basic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Basic__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basic__Group_1__0"


    // $ANTLR start "rule__Basic__Group_1__0__Impl"
    // InternalLimboole.g:896:1: rule__Basic__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Basic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:900:1: ( ( '(' ) )
            // InternalLimboole.g:901:1: ( '(' )
            {
            // InternalLimboole.g:901:1: ( '(' )
            // InternalLimboole.g:902:2: '('
            {
             before(grammarAccess.getBasicAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBasicAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basic__Group_1__0__Impl"


    // $ANTLR start "rule__Basic__Group_1__1"
    // InternalLimboole.g:911:1: rule__Basic__Group_1__1 : rule__Basic__Group_1__1__Impl rule__Basic__Group_1__2 ;
    public final void rule__Basic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:915:1: ( rule__Basic__Group_1__1__Impl rule__Basic__Group_1__2 )
            // InternalLimboole.g:916:2: rule__Basic__Group_1__1__Impl rule__Basic__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Basic__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Basic__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basic__Group_1__1"


    // $ANTLR start "rule__Basic__Group_1__1__Impl"
    // InternalLimboole.g:923:1: rule__Basic__Group_1__1__Impl : ( ruleExpr ) ;
    public final void rule__Basic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:927:1: ( ( ruleExpr ) )
            // InternalLimboole.g:928:1: ( ruleExpr )
            {
            // InternalLimboole.g:928:1: ( ruleExpr )
            // InternalLimboole.g:929:2: ruleExpr
            {
             before(grammarAccess.getBasicAccess().getExprParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getBasicAccess().getExprParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basic__Group_1__1__Impl"


    // $ANTLR start "rule__Basic__Group_1__2"
    // InternalLimboole.g:938:1: rule__Basic__Group_1__2 : rule__Basic__Group_1__2__Impl ;
    public final void rule__Basic__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:942:1: ( rule__Basic__Group_1__2__Impl )
            // InternalLimboole.g:943:2: rule__Basic__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Basic__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basic__Group_1__2"


    // $ANTLR start "rule__Basic__Group_1__2__Impl"
    // InternalLimboole.g:949:1: rule__Basic__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Basic__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:953:1: ( ( ')' ) )
            // InternalLimboole.g:954:1: ( ')' )
            {
            // InternalLimboole.g:954:1: ( ')' )
            // InternalLimboole.g:955:2: ')'
            {
             before(grammarAccess.getBasicAccess().getRightParenthesisKeyword_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBasicAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basic__Group_1__2__Impl"


    // $ANTLR start "rule__Iff__RightAssignment_1_2"
    // InternalLimboole.g:965:1: rule__Iff__RightAssignment_1_2 : ( ruleImplies ) ;
    public final void rule__Iff__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:969:1: ( ( ruleImplies ) )
            // InternalLimboole.g:970:2: ( ruleImplies )
            {
            // InternalLimboole.g:970:2: ( ruleImplies )
            // InternalLimboole.g:971:3: ruleImplies
            {
             before(grammarAccess.getIffAccess().getRightImpliesParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImplies();

            state._fsp--;

             after(grammarAccess.getIffAccess().getRightImpliesParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iff__RightAssignment_1_2"


    // $ANTLR start "rule__Implies__RightAssignment_1_2"
    // InternalLimboole.g:980:1: rule__Implies__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__Implies__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:984:1: ( ( ruleOr ) )
            // InternalLimboole.g:985:2: ( ruleOr )
            {
            // InternalLimboole.g:985:2: ( ruleOr )
            // InternalLimboole.g:986:3: ruleOr
            {
             before(grammarAccess.getImpliesAccess().getRightOrParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getImpliesAccess().getRightOrParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implies__RightAssignment_1_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalLimboole.g:995:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:999:1: ( ( ruleAnd ) )
            // InternalLimboole.g:1000:2: ( ruleAnd )
            {
            // InternalLimboole.g:1000:2: ( ruleAnd )
            // InternalLimboole.g:1001:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalLimboole.g:1010:1: rule__And__RightAssignment_1_2 : ( ruleNot ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:1014:1: ( ( ruleNot ) )
            // InternalLimboole.g:1015:2: ( ruleNot )
            {
            // InternalLimboole.g:1015:2: ( ruleNot )
            // InternalLimboole.g:1016:3: ruleNot
            {
             before(grammarAccess.getAndAccess().getRightNotParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightNotParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Basic__VarAssignment_0"
    // InternalLimboole.g:1025:1: rule__Basic__VarAssignment_0 : ( RULE_VAR ) ;
    public final void rule__Basic__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLimboole.g:1029:1: ( ( RULE_VAR ) )
            // InternalLimboole.g:1030:2: ( RULE_VAR )
            {
            // InternalLimboole.g:1030:2: ( RULE_VAR )
            // InternalLimboole.g:1031:3: RULE_VAR
            {
             before(grammarAccess.getBasicAccess().getVarVARTerminalRuleCall_0_0()); 
            match(input,RULE_VAR,FOLLOW_2); 
             after(grammarAccess.getBasicAccess().getVarVARTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basic__VarAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});

}