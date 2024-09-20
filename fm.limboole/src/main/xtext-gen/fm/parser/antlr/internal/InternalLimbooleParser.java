package fm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fm.services.LimbooleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLimbooleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VAR", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<->'", "'->'", "'<-'", "'|'", "'&'", "'!'", "'('", "')'"
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

        public InternalLimbooleParser(TokenStream input, LimbooleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Expr";
       	}

       	@Override
       	protected LimbooleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpr"
    // InternalLimboole.g:64:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalLimboole.g:64:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalLimboole.g:65:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalLimboole.g:71:1: ruleExpr returns [EObject current=null] : this_Iff_0= ruleIff ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Iff_0 = null;



        	enterRule();

        try {
            // InternalLimboole.g:77:2: (this_Iff_0= ruleIff )
            // InternalLimboole.g:78:2: this_Iff_0= ruleIff
            {

            		newCompositeNode(grammarAccess.getExprAccess().getIffParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Iff_0=ruleIff();

            state._fsp--;


            		current = this_Iff_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleIff"
    // InternalLimboole.g:89:1: entryRuleIff returns [EObject current=null] : iv_ruleIff= ruleIff EOF ;
    public final EObject entryRuleIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIff = null;


        try {
            // InternalLimboole.g:89:44: (iv_ruleIff= ruleIff EOF )
            // InternalLimboole.g:90:2: iv_ruleIff= ruleIff EOF
            {
             newCompositeNode(grammarAccess.getIffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIff=ruleIff();

            state._fsp--;

             current =iv_ruleIff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIff"


    // $ANTLR start "ruleIff"
    // InternalLimboole.g:96:1: ruleIff returns [EObject current=null] : (this_Implies_0= ruleImplies ( () otherlv_2= '<->' ( (lv_right_3_0= ruleImplies ) ) )* ) ;
    public final EObject ruleIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Implies_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLimboole.g:102:2: ( (this_Implies_0= ruleImplies ( () otherlv_2= '<->' ( (lv_right_3_0= ruleImplies ) ) )* ) )
            // InternalLimboole.g:103:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<->' ( (lv_right_3_0= ruleImplies ) ) )* )
            {
            // InternalLimboole.g:103:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<->' ( (lv_right_3_0= ruleImplies ) ) )* )
            // InternalLimboole.g:104:3: this_Implies_0= ruleImplies ( () otherlv_2= '<->' ( (lv_right_3_0= ruleImplies ) ) )*
            {

            			newCompositeNode(grammarAccess.getIffAccess().getImpliesParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_Implies_0=ruleImplies();

            state._fsp--;


            			current = this_Implies_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLimboole.g:112:3: ( () otherlv_2= '<->' ( (lv_right_3_0= ruleImplies ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLimboole.g:113:4: () otherlv_2= '<->' ( (lv_right_3_0= ruleImplies ) )
            	    {
            	    // InternalLimboole.g:113:4: ()
            	    // InternalLimboole.g:114:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getIffAccess().getIffLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIffAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalLimboole.g:124:4: ( (lv_right_3_0= ruleImplies ) )
            	    // InternalLimboole.g:125:5: (lv_right_3_0= ruleImplies )
            	    {
            	    // InternalLimboole.g:125:5: (lv_right_3_0= ruleImplies )
            	    // InternalLimboole.g:126:6: lv_right_3_0= ruleImplies
            	    {

            	    						newCompositeNode(grammarAccess.getIffAccess().getRightImpliesParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_right_3_0=ruleImplies();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIffRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fm.Limboole.Implies");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIff"


    // $ANTLR start "entryRuleImplies"
    // InternalLimboole.g:148:1: entryRuleImplies returns [EObject current=null] : iv_ruleImplies= ruleImplies EOF ;
    public final EObject entryRuleImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplies = null;


        try {
            // InternalLimboole.g:148:48: (iv_ruleImplies= ruleImplies EOF )
            // InternalLimboole.g:149:2: iv_ruleImplies= ruleImplies EOF
            {
             newCompositeNode(grammarAccess.getImpliesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplies=ruleImplies();

            state._fsp--;

             current =iv_ruleImplies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplies"


    // $ANTLR start "ruleImplies"
    // InternalLimboole.g:155:1: ruleImplies returns [EObject current=null] : (this_Or_0= ruleOr ( (otherlv_1= '->' | otherlv_2= '<-' ) () ( (lv_right_4_0= ruleOr ) ) )? ) ;
    public final EObject ruleImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLimboole.g:161:2: ( (this_Or_0= ruleOr ( (otherlv_1= '->' | otherlv_2= '<-' ) () ( (lv_right_4_0= ruleOr ) ) )? ) )
            // InternalLimboole.g:162:2: (this_Or_0= ruleOr ( (otherlv_1= '->' | otherlv_2= '<-' ) () ( (lv_right_4_0= ruleOr ) ) )? )
            {
            // InternalLimboole.g:162:2: (this_Or_0= ruleOr ( (otherlv_1= '->' | otherlv_2= '<-' ) () ( (lv_right_4_0= ruleOr ) ) )? )
            // InternalLimboole.g:163:3: this_Or_0= ruleOr ( (otherlv_1= '->' | otherlv_2= '<-' ) () ( (lv_right_4_0= ruleOr ) ) )?
            {

            			newCompositeNode(grammarAccess.getImpliesAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLimboole.g:171:3: ( (otherlv_1= '->' | otherlv_2= '<-' ) () ( (lv_right_4_0= ruleOr ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLimboole.g:172:4: (otherlv_1= '->' | otherlv_2= '<-' ) () ( (lv_right_4_0= ruleOr ) )
                    {
                    // InternalLimboole.g:172:4: (otherlv_1= '->' | otherlv_2= '<-' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==13) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==14) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalLimboole.g:173:5: otherlv_1= '->'
                            {
                            otherlv_1=(Token)match(input,13,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getImpliesAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLimboole.g:178:5: otherlv_2= '<-'
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_4); 

                            					newLeafNode(otherlv_2, grammarAccess.getImpliesAccess().getLessThanSignHyphenMinusKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalLimboole.g:183:4: ()
                    // InternalLimboole.g:184:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getImpliesAccess().getImpliesLeftAction_1_1(),
                    						current);
                    				

                    }

                    // InternalLimboole.g:190:4: ( (lv_right_4_0= ruleOr ) )
                    // InternalLimboole.g:191:5: (lv_right_4_0= ruleOr )
                    {
                    // InternalLimboole.g:191:5: (lv_right_4_0= ruleOr )
                    // InternalLimboole.g:192:6: lv_right_4_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getImpliesAccess().getRightOrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_4_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImpliesRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_4_0,
                    							"fm.Limboole.Or");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplies"


    // $ANTLR start "entryRuleOr"
    // InternalLimboole.g:214:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalLimboole.g:214:43: (iv_ruleOr= ruleOr EOF )
            // InternalLimboole.g:215:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalLimboole.g:221:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '|' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLimboole.g:227:2: ( (this_And_0= ruleAnd ( () otherlv_2= '|' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalLimboole.g:228:2: (this_And_0= ruleAnd ( () otherlv_2= '|' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalLimboole.g:228:2: (this_And_0= ruleAnd ( () otherlv_2= '|' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalLimboole.g:229:3: this_And_0= ruleAnd ( () otherlv_2= '|' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLimboole.g:237:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleAnd ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLimboole.g:238:4: () otherlv_2= '|' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalLimboole.g:238:4: ()
            	    // InternalLimboole.g:239:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineKeyword_1_1());
            	    			
            	    // InternalLimboole.g:249:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalLimboole.g:250:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalLimboole.g:250:5: (lv_right_3_0= ruleAnd )
            	    // InternalLimboole.g:251:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fm.Limboole.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalLimboole.g:273:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalLimboole.g:273:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalLimboole.g:274:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalLimboole.g:280:1: ruleAnd returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= '&' ( (lv_right_3_0= ruleNot ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLimboole.g:286:2: ( (this_Not_0= ruleNot ( () otherlv_2= '&' ( (lv_right_3_0= ruleNot ) ) )* ) )
            // InternalLimboole.g:287:2: (this_Not_0= ruleNot ( () otherlv_2= '&' ( (lv_right_3_0= ruleNot ) ) )* )
            {
            // InternalLimboole.g:287:2: (this_Not_0= ruleNot ( () otherlv_2= '&' ( (lv_right_3_0= ruleNot ) ) )* )
            // InternalLimboole.g:288:3: this_Not_0= ruleNot ( () otherlv_2= '&' ( (lv_right_3_0= ruleNot ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLimboole.g:296:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleNot ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLimboole.g:297:4: () otherlv_2= '&' ( (lv_right_3_0= ruleNot ) )
            	    {
            	    // InternalLimboole.g:297:4: ()
            	    // InternalLimboole.g:298:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandKeyword_1_1());
            	    			
            	    // InternalLimboole.g:308:4: ( (lv_right_3_0= ruleNot ) )
            	    // InternalLimboole.g:309:5: (lv_right_3_0= ruleNot )
            	    {
            	    // InternalLimboole.g:309:5: (lv_right_3_0= ruleNot )
            	    // InternalLimboole.g:310:6: lv_right_3_0= ruleNot
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightNotParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleNot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fm.Limboole.Not");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNot"
    // InternalLimboole.g:332:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalLimboole.g:332:44: (iv_ruleNot= ruleNot EOF )
            // InternalLimboole.g:333:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalLimboole.g:339:1: ruleNot returns [EObject current=null] : (this_Basic_0= ruleBasic | (otherlv_1= '!' this_Not_2= ruleNot ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Basic_0 = null;

        EObject this_Not_2 = null;



        	enterRule();

        try {
            // InternalLimboole.g:345:2: ( (this_Basic_0= ruleBasic | (otherlv_1= '!' this_Not_2= ruleNot ) ) )
            // InternalLimboole.g:346:2: (this_Basic_0= ruleBasic | (otherlv_1= '!' this_Not_2= ruleNot ) )
            {
            // InternalLimboole.g:346:2: (this_Basic_0= ruleBasic | (otherlv_1= '!' this_Not_2= ruleNot ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_VAR||LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLimboole.g:347:3: this_Basic_0= ruleBasic
                    {

                    			newCompositeNode(grammarAccess.getNotAccess().getBasicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Basic_0=ruleBasic();

                    state._fsp--;


                    			current = this_Basic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLimboole.g:356:3: (otherlv_1= '!' this_Not_2= ruleNot )
                    {
                    // InternalLimboole.g:356:3: (otherlv_1= '!' this_Not_2= ruleNot )
                    // InternalLimboole.g:357:4: otherlv_1= '!' this_Not_2= ruleNot
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getExclamationMarkKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getNotAccess().getNotParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Not_2=ruleNot();

                    state._fsp--;


                    				current = this_Not_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleBasic"
    // InternalLimboole.g:374:1: entryRuleBasic returns [EObject current=null] : iv_ruleBasic= ruleBasic EOF ;
    public final EObject entryRuleBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasic = null;


        try {
            // InternalLimboole.g:374:46: (iv_ruleBasic= ruleBasic EOF )
            // InternalLimboole.g:375:2: iv_ruleBasic= ruleBasic EOF
            {
             newCompositeNode(grammarAccess.getBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasic=ruleBasic();

            state._fsp--;

             current =iv_ruleBasic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasic"


    // $ANTLR start "ruleBasic"
    // InternalLimboole.g:381:1: ruleBasic returns [EObject current=null] : ( ( (lv_var_0_0= RULE_VAR ) ) | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) ) ;
    public final EObject ruleBasic() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Expr_2 = null;



        	enterRule();

        try {
            // InternalLimboole.g:387:2: ( ( ( (lv_var_0_0= RULE_VAR ) ) | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) ) )
            // InternalLimboole.g:388:2: ( ( (lv_var_0_0= RULE_VAR ) ) | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) )
            {
            // InternalLimboole.g:388:2: ( ( (lv_var_0_0= RULE_VAR ) ) | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_VAR) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLimboole.g:389:3: ( (lv_var_0_0= RULE_VAR ) )
                    {
                    // InternalLimboole.g:389:3: ( (lv_var_0_0= RULE_VAR ) )
                    // InternalLimboole.g:390:4: (lv_var_0_0= RULE_VAR )
                    {
                    // InternalLimboole.g:390:4: (lv_var_0_0= RULE_VAR )
                    // InternalLimboole.g:391:5: lv_var_0_0= RULE_VAR
                    {
                    lv_var_0_0=(Token)match(input,RULE_VAR,FOLLOW_2); 

                    					newLeafNode(lv_var_0_0, grammarAccess.getBasicAccess().getVarVARTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"var",
                    						lv_var_0_0,
                    						"fm.Limboole.VAR");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLimboole.g:408:3: (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' )
                    {
                    // InternalLimboole.g:408:3: (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' )
                    // InternalLimboole.g:409:4: otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getBasicAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getBasicAccess().getExprParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_Expr_2=ruleExpr();

                    state._fsp--;


                    				current = this_Expr_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getBasicAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});

}