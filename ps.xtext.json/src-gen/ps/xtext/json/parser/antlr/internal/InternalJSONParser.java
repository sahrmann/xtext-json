package ps.xtext.json.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ps.xtext.json.services.JSONGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSONParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_JSONNUMBER", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", "'null'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_JSONNUMBER=5;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_DIGIT=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJSONParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJSONParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJSONParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJSON.g"; }



     	private JSONGrammarAccess grammarAccess;

        public InternalJSONParser(TokenStream input, JSONGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Value";
       	}

       	@Override
       	protected JSONGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleValue"
    // InternalJSON.g:64:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalJSON.g:64:46: (iv_ruleValue= ruleValue EOF )
            // InternalJSON.g:65:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalJSON.g:71:1: ruleValue returns [EObject current=null] : (this_Object_0= ruleObject | this_Array_1= ruleArray | this_Number_2= ruleNumber | this_Str_3= ruleStr | this_Boolean_4= ruleBoolean | this_Null_5= ruleNull ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Object_0 = null;

        EObject this_Array_1 = null;

        EObject this_Number_2 = null;

        EObject this_Str_3 = null;

        EObject this_Boolean_4 = null;

        EObject this_Null_5 = null;



        	enterRule();

        try {
            // InternalJSON.g:77:2: ( (this_Object_0= ruleObject | this_Array_1= ruleArray | this_Number_2= ruleNumber | this_Str_3= ruleStr | this_Boolean_4= ruleBoolean | this_Null_5= ruleNull ) )
            // InternalJSON.g:78:2: (this_Object_0= ruleObject | this_Array_1= ruleArray | this_Number_2= ruleNumber | this_Str_3= ruleStr | this_Boolean_4= ruleBoolean | this_Null_5= ruleNull )
            {
            // InternalJSON.g:78:2: (this_Object_0= ruleObject | this_Array_1= ruleArray | this_Number_2= ruleNumber | this_Str_3= ruleStr | this_Boolean_4= ruleBoolean | this_Null_5= ruleNull )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case RULE_JSONNUMBER:
                {
                alt1=3;
                }
                break;
            case RULE_STRING:
                {
                alt1=4;
                }
                break;
            case 19:
            case 20:
                {
                alt1=5;
                }
                break;
            case 21:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJSON.g:79:3: this_Object_0= ruleObject
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Object_0=ruleObject();

                    state._fsp--;


                    			current = this_Object_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJSON.g:88:3: this_Array_1= ruleArray
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getArrayParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Array_1=ruleArray();

                    state._fsp--;


                    			current = this_Array_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJSON.g:97:3: this_Number_2= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumberParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_2=ruleNumber();

                    state._fsp--;


                    			current = this_Number_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJSON.g:106:3: this_Str_3= ruleStr
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStrParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Str_3=ruleStr();

                    state._fsp--;


                    			current = this_Str_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJSON.g:115:3: this_Boolean_4= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_4=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJSON.g:124:3: this_Null_5= ruleNull
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Null_5=ruleNull();

                    state._fsp--;


                    			current = this_Null_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleObject"
    // InternalJSON.g:136:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalJSON.g:136:47: (iv_ruleObject= ruleObject EOF )
            // InternalJSON.g:137:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalJSON.g:143:1: ruleObject returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_pairs_2_0= rulePair ) ) (otherlv_3= ',' ( (lv_pairs_4_0= rulePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_pairs_2_0 = null;

        EObject lv_pairs_4_0 = null;



        	enterRule();

        try {
            // InternalJSON.g:149:2: ( ( () otherlv_1= '{' ( ( (lv_pairs_2_0= rulePair ) ) (otherlv_3= ',' ( (lv_pairs_4_0= rulePair ) ) )* )? otherlv_5= '}' ) )
            // InternalJSON.g:150:2: ( () otherlv_1= '{' ( ( (lv_pairs_2_0= rulePair ) ) (otherlv_3= ',' ( (lv_pairs_4_0= rulePair ) ) )* )? otherlv_5= '}' )
            {
            // InternalJSON.g:150:2: ( () otherlv_1= '{' ( ( (lv_pairs_2_0= rulePair ) ) (otherlv_3= ',' ( (lv_pairs_4_0= rulePair ) ) )* )? otherlv_5= '}' )
            // InternalJSON.g:151:3: () otherlv_1= '{' ( ( (lv_pairs_2_0= rulePair ) ) (otherlv_3= ',' ( (lv_pairs_4_0= rulePair ) ) )* )? otherlv_5= '}'
            {
            // InternalJSON.g:151:3: ()
            // InternalJSON.g:152:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectAccess().getObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalJSON.g:162:3: ( ( (lv_pairs_2_0= rulePair ) ) (otherlv_3= ',' ( (lv_pairs_4_0= rulePair ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSON.g:163:4: ( (lv_pairs_2_0= rulePair ) ) (otherlv_3= ',' ( (lv_pairs_4_0= rulePair ) ) )*
                    {
                    // InternalJSON.g:163:4: ( (lv_pairs_2_0= rulePair ) )
                    // InternalJSON.g:164:5: (lv_pairs_2_0= rulePair )
                    {
                    // InternalJSON.g:164:5: (lv_pairs_2_0= rulePair )
                    // InternalJSON.g:165:6: lv_pairs_2_0= rulePair
                    {

                    						newCompositeNode(grammarAccess.getObjectAccess().getPairsPairParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_pairs_2_0=rulePair();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectRule());
                    						}
                    						add(
                    							current,
                    							"pairs",
                    							lv_pairs_2_0,
                    							"ps.xtext.json.JSON.Pair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJSON.g:182:4: (otherlv_3= ',' ( (lv_pairs_4_0= rulePair ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalJSON.g:183:5: otherlv_3= ',' ( (lv_pairs_4_0= rulePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJSON.g:187:5: ( (lv_pairs_4_0= rulePair ) )
                    	    // InternalJSON.g:188:6: (lv_pairs_4_0= rulePair )
                    	    {
                    	    // InternalJSON.g:188:6: (lv_pairs_4_0= rulePair )
                    	    // InternalJSON.g:189:7: lv_pairs_4_0= rulePair
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectAccess().getPairsPairParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_pairs_4_0=rulePair();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pairs",
                    	    								lv_pairs_4_0,
                    	    								"ps.xtext.json.JSON.Pair");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRulePair"
    // InternalJSON.g:216:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalJSON.g:216:45: (iv_rulePair= rulePair EOF )
            // InternalJSON.g:217:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalJSON.g:223:1: rulePair returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJSON.g:229:2: ( ( ( (lv_string_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalJSON.g:230:2: ( ( (lv_string_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalJSON.g:230:2: ( ( (lv_string_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalJSON.g:231:3: ( (lv_string_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalJSON.g:231:3: ( (lv_string_0_0= RULE_STRING ) )
            // InternalJSON.g:232:4: (lv_string_0_0= RULE_STRING )
            {
            // InternalJSON.g:232:4: (lv_string_0_0= RULE_STRING )
            // InternalJSON.g:233:5: lv_string_0_0= RULE_STRING
            {
            lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_string_0_0, grammarAccess.getPairAccess().getStringSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPairAccess().getColonKeyword_1());
            		
            // InternalJSON.g:253:3: ( (lv_value_2_0= ruleValue ) )
            // InternalJSON.g:254:4: (lv_value_2_0= ruleValue )
            {
            // InternalJSON.g:254:4: (lv_value_2_0= ruleValue )
            // InternalJSON.g:255:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ps.xtext.json.JSON.Value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleArray"
    // InternalJSON.g:276:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJSON.g:276:46: (iv_ruleArray= ruleArray EOF )
            // InternalJSON.g:277:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalJSON.g:283:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalJSON.g:289:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* )? otherlv_5= ']' ) )
            // InternalJSON.g:290:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalJSON.g:290:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* )? otherlv_5= ']' )
            // InternalJSON.g:291:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* )? otherlv_5= ']'
            {
            // InternalJSON.g:291:3: ()
            // InternalJSON.g:292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayAccess().getArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJSON.g:302:3: ( ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_JSONNUMBER)||LA5_0==13||LA5_0==17||(LA5_0>=19 && LA5_0<=21)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJSON.g:303:4: ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )*
                    {
                    // InternalJSON.g:303:4: ( (lv_values_2_0= ruleValue ) )
                    // InternalJSON.g:304:5: (lv_values_2_0= ruleValue )
                    {
                    // InternalJSON.g:304:5: (lv_values_2_0= ruleValue )
                    // InternalJSON.g:305:6: lv_values_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_values_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"ps.xtext.json.JSON.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJSON.g:322:4: (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJSON.g:323:5: otherlv_3= ',' ( (lv_values_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJSON.g:327:5: ( (lv_values_4_0= ruleValue ) )
                    	    // InternalJSON.g:328:6: (lv_values_4_0= ruleValue )
                    	    {
                    	    // InternalJSON.g:328:6: (lv_values_4_0= ruleValue )
                    	    // InternalJSON.g:329:7: lv_values_4_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_values_4_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"ps.xtext.json.JSON.Value");
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
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleNumber"
    // InternalJSON.g:356:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalJSON.g:356:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalJSON.g:357:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalJSON.g:363:1: ruleNumber returns [EObject current=null] : ( () this_JSONNUMBER_1= RULE_JSONNUMBER ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token this_JSONNUMBER_1=null;


        	enterRule();

        try {
            // InternalJSON.g:369:2: ( ( () this_JSONNUMBER_1= RULE_JSONNUMBER ) )
            // InternalJSON.g:370:2: ( () this_JSONNUMBER_1= RULE_JSONNUMBER )
            {
            // InternalJSON.g:370:2: ( () this_JSONNUMBER_1= RULE_JSONNUMBER )
            // InternalJSON.g:371:3: () this_JSONNUMBER_1= RULE_JSONNUMBER
            {
            // InternalJSON.g:371:3: ()
            // InternalJSON.g:372:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumberAction_0(),
            					current);
            			

            }

            this_JSONNUMBER_1=(Token)match(input,RULE_JSONNUMBER,FOLLOW_2); 

            			newLeafNode(this_JSONNUMBER_1, grammarAccess.getNumberAccess().getJSONNUMBERTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleStr"
    // InternalJSON.g:386:1: entryRuleStr returns [EObject current=null] : iv_ruleStr= ruleStr EOF ;
    public final EObject entryRuleStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStr = null;


        try {
            // InternalJSON.g:386:44: (iv_ruleStr= ruleStr EOF )
            // InternalJSON.g:387:2: iv_ruleStr= ruleStr EOF
            {
             newCompositeNode(grammarAccess.getStrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStr=ruleStr();

            state._fsp--;

             current =iv_ruleStr; 
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
    // $ANTLR end "entryRuleStr"


    // $ANTLR start "ruleStr"
    // InternalJSON.g:393:1: ruleStr returns [EObject current=null] : ( () this_STRING_1= RULE_STRING ) ;
    public final EObject ruleStr() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalJSON.g:399:2: ( ( () this_STRING_1= RULE_STRING ) )
            // InternalJSON.g:400:2: ( () this_STRING_1= RULE_STRING )
            {
            // InternalJSON.g:400:2: ( () this_STRING_1= RULE_STRING )
            // InternalJSON.g:401:3: () this_STRING_1= RULE_STRING
            {
            // InternalJSON.g:401:3: ()
            // InternalJSON.g:402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrAccess().getStrAction_0(),
            					current);
            			

            }

            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_1, grammarAccess.getStrAccess().getSTRINGTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleStr"


    // $ANTLR start "entryRuleBoolean"
    // InternalJSON.g:416:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalJSON.g:416:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalJSON.g:417:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalJSON.g:423:1: ruleBoolean returns [EObject current=null] : ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalJSON.g:429:2: ( ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) ) )
            // InternalJSON.g:430:2: ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) )
            {
            // InternalJSON.g:430:2: ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJSON.g:431:3: ( () otherlv_1= 'true' )
                    {
                    // InternalJSON.g:431:3: ( () otherlv_1= 'true' )
                    // InternalJSON.g:432:4: () otherlv_1= 'true'
                    {
                    // InternalJSON.g:432:4: ()
                    // InternalJSON.g:433:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBooleanAccess().getTrueAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getTrueKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJSON.g:445:3: ( () otherlv_3= 'false' )
                    {
                    // InternalJSON.g:445:3: ( () otherlv_3= 'false' )
                    // InternalJSON.g:446:4: () otherlv_3= 'false'
                    {
                    // InternalJSON.g:446:4: ()
                    // InternalJSON.g:447:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBooleanAccess().getFalseAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanAccess().getFalseKeyword_1_1());
                    			

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNull"
    // InternalJSON.g:462:1: entryRuleNull returns [EObject current=null] : iv_ruleNull= ruleNull EOF ;
    public final EObject entryRuleNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNull = null;


        try {
            // InternalJSON.g:462:45: (iv_ruleNull= ruleNull EOF )
            // InternalJSON.g:463:2: iv_ruleNull= ruleNull EOF
            {
             newCompositeNode(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNull=ruleNull();

            state._fsp--;

             current =iv_ruleNull; 
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
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // InternalJSON.g:469:1: ruleNull returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJSON.g:475:2: ( ( () otherlv_1= 'null' ) )
            // InternalJSON.g:476:2: ( () otherlv_1= 'null' )
            {
            // InternalJSON.g:476:2: ( () otherlv_1= 'null' )
            // InternalJSON.g:477:3: () otherlv_1= 'null'
            {
            // InternalJSON.g:477:3: ()
            // InternalJSON.g:478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullAccess().getNullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullAccess().getNullKeyword_1());
            		

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
    // $ANTLR end "ruleNull"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003A2030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E2030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000044000L});

}