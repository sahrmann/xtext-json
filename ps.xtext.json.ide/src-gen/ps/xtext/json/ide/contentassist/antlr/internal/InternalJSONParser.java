package ps.xtext.json.ide.contentassist.antlr.internal;

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
import ps.xtext.json.services.JSONGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSONParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_JSONNUMBER", "RULE_STRING", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "','", "':'", "'['", "']'", "'true'", "'false'", "'null'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_JSONNUMBER=4;
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

    	public void setGrammarAccess(JSONGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleValue"
    // InternalJSON.g:53:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalJSON.g:54:1: ( ruleValue EOF )
            // InternalJSON.g:55:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalJSON.g:62:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:66:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalJSON.g:67:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalJSON.g:67:2: ( ( rule__Value__Alternatives ) )
            // InternalJSON.g:68:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalJSON.g:69:3: ( rule__Value__Alternatives )
            // InternalJSON.g:69:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleObject"
    // InternalJSON.g:78:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalJSON.g:79:1: ( ruleObject EOF )
            // InternalJSON.g:80:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalJSON.g:87:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:91:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalJSON.g:92:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalJSON.g:92:2: ( ( rule__Object__Group__0 ) )
            // InternalJSON.g:93:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalJSON.g:94:3: ( rule__Object__Group__0 )
            // InternalJSON.g:94:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRulePair"
    // InternalJSON.g:103:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // InternalJSON.g:104:1: ( rulePair EOF )
            // InternalJSON.g:105:1: rulePair EOF
            {
             before(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            rulePair();

            state._fsp--;

             after(grammarAccess.getPairRule()); 
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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalJSON.g:112:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:116:2: ( ( ( rule__Pair__Group__0 ) ) )
            // InternalJSON.g:117:2: ( ( rule__Pair__Group__0 ) )
            {
            // InternalJSON.g:117:2: ( ( rule__Pair__Group__0 ) )
            // InternalJSON.g:118:3: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // InternalJSON.g:119:3: ( rule__Pair__Group__0 )
            // InternalJSON.g:119:4: rule__Pair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getGroup()); 

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
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleArray"
    // InternalJSON.g:128:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // InternalJSON.g:129:1: ( ruleArray EOF )
            // InternalJSON.g:130:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalJSON.g:137:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:141:2: ( ( ( rule__Array__Group__0 ) ) )
            // InternalJSON.g:142:2: ( ( rule__Array__Group__0 ) )
            {
            // InternalJSON.g:142:2: ( ( rule__Array__Group__0 ) )
            // InternalJSON.g:143:3: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // InternalJSON.g:144:3: ( rule__Array__Group__0 )
            // InternalJSON.g:144:4: rule__Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getGroup()); 

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleNumber"
    // InternalJSON.g:153:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalJSON.g:154:1: ( ruleNumber EOF )
            // InternalJSON.g:155:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalJSON.g:162:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:166:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalJSON.g:167:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalJSON.g:167:2: ( ( rule__Number__Group__0 ) )
            // InternalJSON.g:168:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalJSON.g:169:3: ( rule__Number__Group__0 )
            // InternalJSON.g:169:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleStr"
    // InternalJSON.g:178:1: entryRuleStr : ruleStr EOF ;
    public final void entryRuleStr() throws RecognitionException {
        try {
            // InternalJSON.g:179:1: ( ruleStr EOF )
            // InternalJSON.g:180:1: ruleStr EOF
            {
             before(grammarAccess.getStrRule()); 
            pushFollow(FOLLOW_1);
            ruleStr();

            state._fsp--;

             after(grammarAccess.getStrRule()); 
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
    // $ANTLR end "entryRuleStr"


    // $ANTLR start "ruleStr"
    // InternalJSON.g:187:1: ruleStr : ( ( rule__Str__Group__0 ) ) ;
    public final void ruleStr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:191:2: ( ( ( rule__Str__Group__0 ) ) )
            // InternalJSON.g:192:2: ( ( rule__Str__Group__0 ) )
            {
            // InternalJSON.g:192:2: ( ( rule__Str__Group__0 ) )
            // InternalJSON.g:193:3: ( rule__Str__Group__0 )
            {
             before(grammarAccess.getStrAccess().getGroup()); 
            // InternalJSON.g:194:3: ( rule__Str__Group__0 )
            // InternalJSON.g:194:4: rule__Str__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Str__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStrAccess().getGroup()); 

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
    // $ANTLR end "ruleStr"


    // $ANTLR start "entryRuleBoolean"
    // InternalJSON.g:203:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalJSON.g:204:1: ( ruleBoolean EOF )
            // InternalJSON.g:205:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalJSON.g:212:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:216:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalJSON.g:217:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalJSON.g:217:2: ( ( rule__Boolean__Alternatives ) )
            // InternalJSON.g:218:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalJSON.g:219:3: ( rule__Boolean__Alternatives )
            // InternalJSON.g:219:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNull"
    // InternalJSON.g:228:1: entryRuleNull : ruleNull EOF ;
    public final void entryRuleNull() throws RecognitionException {
        try {
            // InternalJSON.g:229:1: ( ruleNull EOF )
            // InternalJSON.g:230:1: ruleNull EOF
            {
             before(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_1);
            ruleNull();

            state._fsp--;

             after(grammarAccess.getNullRule()); 
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
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // InternalJSON.g:237:1: ruleNull : ( ( rule__Null__Group__0 ) ) ;
    public final void ruleNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:241:2: ( ( ( rule__Null__Group__0 ) ) )
            // InternalJSON.g:242:2: ( ( rule__Null__Group__0 ) )
            {
            // InternalJSON.g:242:2: ( ( rule__Null__Group__0 ) )
            // InternalJSON.g:243:3: ( rule__Null__Group__0 )
            {
             before(grammarAccess.getNullAccess().getGroup()); 
            // InternalJSON.g:244:3: ( rule__Null__Group__0 )
            // InternalJSON.g:244:4: rule__Null__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Null__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullAccess().getGroup()); 

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
    // $ANTLR end "ruleNull"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalJSON.g:252:1: rule__Value__Alternatives : ( ( ruleObject ) | ( ruleArray ) | ( ruleNumber ) | ( ruleStr ) | ( ruleBoolean ) | ( ruleNull ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:256:1: ( ( ruleObject ) | ( ruleArray ) | ( ruleNumber ) | ( ruleStr ) | ( ruleBoolean ) | ( ruleNull ) )
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
                    // InternalJSON.g:257:2: ( ruleObject )
                    {
                    // InternalJSON.g:257:2: ( ruleObject )
                    // InternalJSON.g:258:3: ruleObject
                    {
                     before(grammarAccess.getValueAccess().getObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObject();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSON.g:263:2: ( ruleArray )
                    {
                    // InternalJSON.g:263:2: ( ruleArray )
                    // InternalJSON.g:264:3: ruleArray
                    {
                     before(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArray();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSON.g:269:2: ( ruleNumber )
                    {
                    // InternalJSON.g:269:2: ( ruleNumber )
                    // InternalJSON.g:270:3: ruleNumber
                    {
                     before(grammarAccess.getValueAccess().getNumberParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNumberParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSON.g:275:2: ( ruleStr )
                    {
                    // InternalJSON.g:275:2: ( ruleStr )
                    // InternalJSON.g:276:3: ruleStr
                    {
                     before(grammarAccess.getValueAccess().getStrParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStr();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStrParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJSON.g:281:2: ( ruleBoolean )
                    {
                    // InternalJSON.g:281:2: ( ruleBoolean )
                    // InternalJSON.g:282:3: ruleBoolean
                    {
                     before(grammarAccess.getValueAccess().getBooleanParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJSON.g:287:2: ( ruleNull )
                    {
                    // InternalJSON.g:287:2: ( ruleNull )
                    // InternalJSON.g:288:3: ruleNull
                    {
                     before(grammarAccess.getValueAccess().getNullParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNull();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNullParserRuleCall_5()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalJSON.g:297:1: rule__Boolean__Alternatives : ( ( ( rule__Boolean__Group_0__0 ) ) | ( ( rule__Boolean__Group_1__0 ) ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:301:1: ( ( ( rule__Boolean__Group_0__0 ) ) | ( ( rule__Boolean__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSON.g:302:2: ( ( rule__Boolean__Group_0__0 ) )
                    {
                    // InternalJSON.g:302:2: ( ( rule__Boolean__Group_0__0 ) )
                    // InternalJSON.g:303:3: ( rule__Boolean__Group_0__0 )
                    {
                     before(grammarAccess.getBooleanAccess().getGroup_0()); 
                    // InternalJSON.g:304:3: ( rule__Boolean__Group_0__0 )
                    // InternalJSON.g:304:4: rule__Boolean__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boolean__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSON.g:308:2: ( ( rule__Boolean__Group_1__0 ) )
                    {
                    // InternalJSON.g:308:2: ( ( rule__Boolean__Group_1__0 ) )
                    // InternalJSON.g:309:3: ( rule__Boolean__Group_1__0 )
                    {
                     before(grammarAccess.getBooleanAccess().getGroup_1()); 
                    // InternalJSON.g:310:3: ( rule__Boolean__Group_1__0 )
                    // InternalJSON.g:310:4: rule__Boolean__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boolean__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Object__Group__0"
    // InternalJSON.g:318:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:322:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalJSON.g:323:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

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
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalJSON.g:330:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:334:1: ( ( () ) )
            // InternalJSON.g:335:1: ( () )
            {
            // InternalJSON.g:335:1: ( () )
            // InternalJSON.g:336:2: ()
            {
             before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            // InternalJSON.g:337:2: ()
            // InternalJSON.g:337:3: 
            {
            }

             after(grammarAccess.getObjectAccess().getObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalJSON.g:345:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:349:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalJSON.g:350:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

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
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalJSON.g:357:1: rule__Object__Group__1__Impl : ( '{' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:361:1: ( ( '{' ) )
            // InternalJSON.g:362:1: ( '{' )
            {
            // InternalJSON.g:362:1: ( '{' )
            // InternalJSON.g:363:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalJSON.g:372:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:376:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalJSON.g:377:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

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
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalJSON.g:384:1: rule__Object__Group__2__Impl : ( ( rule__Object__Group_2__0 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:388:1: ( ( ( rule__Object__Group_2__0 )? ) )
            // InternalJSON.g:389:1: ( ( rule__Object__Group_2__0 )? )
            {
            // InternalJSON.g:389:1: ( ( rule__Object__Group_2__0 )? )
            // InternalJSON.g:390:2: ( rule__Object__Group_2__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_2()); 
            // InternalJSON.g:391:2: ( rule__Object__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSON.g:391:3: rule__Object__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalJSON.g:399:1: rule__Object__Group__3 : rule__Object__Group__3__Impl ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:403:1: ( rule__Object__Group__3__Impl )
            // InternalJSON.g:404:2: rule__Object__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__3__Impl();

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
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalJSON.g:410:1: rule__Object__Group__3__Impl : ( '}' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:414:1: ( ( '}' ) )
            // InternalJSON.g:415:1: ( '}' )
            {
            // InternalJSON.g:415:1: ( '}' )
            // InternalJSON.g:416:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group_2__0"
    // InternalJSON.g:426:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:430:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalJSON.g:431:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Object__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1();

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
    // $ANTLR end "rule__Object__Group_2__0"


    // $ANTLR start "rule__Object__Group_2__0__Impl"
    // InternalJSON.g:438:1: rule__Object__Group_2__0__Impl : ( ( rule__Object__PairsAssignment_2_0 ) ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:442:1: ( ( ( rule__Object__PairsAssignment_2_0 ) ) )
            // InternalJSON.g:443:1: ( ( rule__Object__PairsAssignment_2_0 ) )
            {
            // InternalJSON.g:443:1: ( ( rule__Object__PairsAssignment_2_0 ) )
            // InternalJSON.g:444:2: ( rule__Object__PairsAssignment_2_0 )
            {
             before(grammarAccess.getObjectAccess().getPairsAssignment_2_0()); 
            // InternalJSON.g:445:2: ( rule__Object__PairsAssignment_2_0 )
            // InternalJSON.g:445:3: rule__Object__PairsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__PairsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getPairsAssignment_2_0()); 

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
    // $ANTLR end "rule__Object__Group_2__0__Impl"


    // $ANTLR start "rule__Object__Group_2__1"
    // InternalJSON.g:453:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:457:1: ( rule__Object__Group_2__1__Impl )
            // InternalJSON.g:458:2: rule__Object__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1__Impl();

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
    // $ANTLR end "rule__Object__Group_2__1"


    // $ANTLR start "rule__Object__Group_2__1__Impl"
    // InternalJSON.g:464:1: rule__Object__Group_2__1__Impl : ( ( rule__Object__Group_2_1__0 )* ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:468:1: ( ( ( rule__Object__Group_2_1__0 )* ) )
            // InternalJSON.g:469:1: ( ( rule__Object__Group_2_1__0 )* )
            {
            // InternalJSON.g:469:1: ( ( rule__Object__Group_2_1__0 )* )
            // InternalJSON.g:470:2: ( rule__Object__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectAccess().getGroup_2_1()); 
            // InternalJSON.g:471:2: ( rule__Object__Group_2_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJSON.g:471:3: rule__Object__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Object__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getObjectAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Object__Group_2__1__Impl"


    // $ANTLR start "rule__Object__Group_2_1__0"
    // InternalJSON.g:480:1: rule__Object__Group_2_1__0 : rule__Object__Group_2_1__0__Impl rule__Object__Group_2_1__1 ;
    public final void rule__Object__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:484:1: ( rule__Object__Group_2_1__0__Impl rule__Object__Group_2_1__1 )
            // InternalJSON.g:485:2: rule__Object__Group_2_1__0__Impl rule__Object__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Object__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_2_1__1();

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
    // $ANTLR end "rule__Object__Group_2_1__0"


    // $ANTLR start "rule__Object__Group_2_1__0__Impl"
    // InternalJSON.g:492:1: rule__Object__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Object__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:496:1: ( ( ',' ) )
            // InternalJSON.g:497:1: ( ',' )
            {
            // InternalJSON.g:497:1: ( ',' )
            // InternalJSON.g:498:2: ','
            {
             before(grammarAccess.getObjectAccess().getCommaKeyword_2_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Object__Group_2_1__0__Impl"


    // $ANTLR start "rule__Object__Group_2_1__1"
    // InternalJSON.g:507:1: rule__Object__Group_2_1__1 : rule__Object__Group_2_1__1__Impl ;
    public final void rule__Object__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:511:1: ( rule__Object__Group_2_1__1__Impl )
            // InternalJSON.g:512:2: rule__Object__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Object__Group_2_1__1"


    // $ANTLR start "rule__Object__Group_2_1__1__Impl"
    // InternalJSON.g:518:1: rule__Object__Group_2_1__1__Impl : ( ( rule__Object__PairsAssignment_2_1_1 ) ) ;
    public final void rule__Object__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:522:1: ( ( ( rule__Object__PairsAssignment_2_1_1 ) ) )
            // InternalJSON.g:523:1: ( ( rule__Object__PairsAssignment_2_1_1 ) )
            {
            // InternalJSON.g:523:1: ( ( rule__Object__PairsAssignment_2_1_1 ) )
            // InternalJSON.g:524:2: ( rule__Object__PairsAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectAccess().getPairsAssignment_2_1_1()); 
            // InternalJSON.g:525:2: ( rule__Object__PairsAssignment_2_1_1 )
            // InternalJSON.g:525:3: rule__Object__PairsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__PairsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getPairsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Object__Group_2_1__1__Impl"


    // $ANTLR start "rule__Pair__Group__0"
    // InternalJSON.g:534:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:538:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // InternalJSON.g:539:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__1();

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
    // $ANTLR end "rule__Pair__Group__0"


    // $ANTLR start "rule__Pair__Group__0__Impl"
    // InternalJSON.g:546:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__StringAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:550:1: ( ( ( rule__Pair__StringAssignment_0 ) ) )
            // InternalJSON.g:551:1: ( ( rule__Pair__StringAssignment_0 ) )
            {
            // InternalJSON.g:551:1: ( ( rule__Pair__StringAssignment_0 ) )
            // InternalJSON.g:552:2: ( rule__Pair__StringAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getStringAssignment_0()); 
            // InternalJSON.g:553:2: ( rule__Pair__StringAssignment_0 )
            // InternalJSON.g:553:3: rule__Pair__StringAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__StringAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getStringAssignment_0()); 

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
    // $ANTLR end "rule__Pair__Group__0__Impl"


    // $ANTLR start "rule__Pair__Group__1"
    // InternalJSON.g:561:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:565:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // InternalJSON.g:566:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__2();

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
    // $ANTLR end "rule__Pair__Group__1"


    // $ANTLR start "rule__Pair__Group__1__Impl"
    // InternalJSON.g:573:1: rule__Pair__Group__1__Impl : ( ':' ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:577:1: ( ( ':' ) )
            // InternalJSON.g:578:1: ( ':' )
            {
            // InternalJSON.g:578:1: ( ':' )
            // InternalJSON.g:579:2: ':'
            {
             before(grammarAccess.getPairAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Pair__Group__1__Impl"


    // $ANTLR start "rule__Pair__Group__2"
    // InternalJSON.g:588:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:592:1: ( rule__Pair__Group__2__Impl )
            // InternalJSON.g:593:2: rule__Pair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__2__Impl();

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
    // $ANTLR end "rule__Pair__Group__2"


    // $ANTLR start "rule__Pair__Group__2__Impl"
    // InternalJSON.g:599:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__ValueAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:603:1: ( ( ( rule__Pair__ValueAssignment_2 ) ) )
            // InternalJSON.g:604:1: ( ( rule__Pair__ValueAssignment_2 ) )
            {
            // InternalJSON.g:604:1: ( ( rule__Pair__ValueAssignment_2 ) )
            // InternalJSON.g:605:2: ( rule__Pair__ValueAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_2()); 
            // InternalJSON.g:606:2: ( rule__Pair__ValueAssignment_2 )
            // InternalJSON.g:606:3: rule__Pair__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Pair__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // InternalJSON.g:615:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:619:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalJSON.g:620:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__1();

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
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // InternalJSON.g:627:1: rule__Array__Group__0__Impl : ( () ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:631:1: ( ( () ) )
            // InternalJSON.g:632:1: ( () )
            {
            // InternalJSON.g:632:1: ( () )
            // InternalJSON.g:633:2: ()
            {
             before(grammarAccess.getArrayAccess().getArrayAction_0()); 
            // InternalJSON.g:634:2: ()
            // InternalJSON.g:634:3: 
            {
            }

             after(grammarAccess.getArrayAccess().getArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // InternalJSON.g:642:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:646:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalJSON.g:647:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__2();

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
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // InternalJSON.g:654:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:658:1: ( ( '[' ) )
            // InternalJSON.g:659:1: ( '[' )
            {
            // InternalJSON.g:659:1: ( '[' )
            // InternalJSON.g:660:2: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // InternalJSON.g:669:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:673:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // InternalJSON.g:674:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Array__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__3();

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
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // InternalJSON.g:681:1: rule__Array__Group__2__Impl : ( ( rule__Array__Group_2__0 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:685:1: ( ( ( rule__Array__Group_2__0 )? ) )
            // InternalJSON.g:686:1: ( ( rule__Array__Group_2__0 )? )
            {
            // InternalJSON.g:686:1: ( ( rule__Array__Group_2__0 )? )
            // InternalJSON.g:687:2: ( rule__Array__Group_2__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_2()); 
            // InternalJSON.g:688:2: ( rule__Array__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_JSONNUMBER && LA5_0<=RULE_STRING)||LA5_0==13||LA5_0==17||(LA5_0>=19 && LA5_0<=21)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJSON.g:688:3: rule__Array__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Array__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__3"
    // InternalJSON.g:696:1: rule__Array__Group__3 : rule__Array__Group__3__Impl ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:700:1: ( rule__Array__Group__3__Impl )
            // InternalJSON.g:701:2: rule__Array__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__3__Impl();

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
    // $ANTLR end "rule__Array__Group__3"


    // $ANTLR start "rule__Array__Group__3__Impl"
    // InternalJSON.g:707:1: rule__Array__Group__3__Impl : ( ']' ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:711:1: ( ( ']' ) )
            // InternalJSON.g:712:1: ( ']' )
            {
            // InternalJSON.g:712:1: ( ']' )
            // InternalJSON.g:713:2: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Array__Group__3__Impl"


    // $ANTLR start "rule__Array__Group_2__0"
    // InternalJSON.g:723:1: rule__Array__Group_2__0 : rule__Array__Group_2__0__Impl rule__Array__Group_2__1 ;
    public final void rule__Array__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:727:1: ( rule__Array__Group_2__0__Impl rule__Array__Group_2__1 )
            // InternalJSON.g:728:2: rule__Array__Group_2__0__Impl rule__Array__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Array__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group_2__1();

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
    // $ANTLR end "rule__Array__Group_2__0"


    // $ANTLR start "rule__Array__Group_2__0__Impl"
    // InternalJSON.g:735:1: rule__Array__Group_2__0__Impl : ( ( rule__Array__ValuesAssignment_2_0 ) ) ;
    public final void rule__Array__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:739:1: ( ( ( rule__Array__ValuesAssignment_2_0 ) ) )
            // InternalJSON.g:740:1: ( ( rule__Array__ValuesAssignment_2_0 ) )
            {
            // InternalJSON.g:740:1: ( ( rule__Array__ValuesAssignment_2_0 ) )
            // InternalJSON.g:741:2: ( rule__Array__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getArrayAccess().getValuesAssignment_2_0()); 
            // InternalJSON.g:742:2: ( rule__Array__ValuesAssignment_2_0 )
            // InternalJSON.g:742:3: rule__Array__ValuesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Array__ValuesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getValuesAssignment_2_0()); 

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
    // $ANTLR end "rule__Array__Group_2__0__Impl"


    // $ANTLR start "rule__Array__Group_2__1"
    // InternalJSON.g:750:1: rule__Array__Group_2__1 : rule__Array__Group_2__1__Impl ;
    public final void rule__Array__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:754:1: ( rule__Array__Group_2__1__Impl )
            // InternalJSON.g:755:2: rule__Array__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group_2__1__Impl();

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
    // $ANTLR end "rule__Array__Group_2__1"


    // $ANTLR start "rule__Array__Group_2__1__Impl"
    // InternalJSON.g:761:1: rule__Array__Group_2__1__Impl : ( ( rule__Array__Group_2_1__0 )* ) ;
    public final void rule__Array__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:765:1: ( ( ( rule__Array__Group_2_1__0 )* ) )
            // InternalJSON.g:766:1: ( ( rule__Array__Group_2_1__0 )* )
            {
            // InternalJSON.g:766:1: ( ( rule__Array__Group_2_1__0 )* )
            // InternalJSON.g:767:2: ( rule__Array__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_2_1()); 
            // InternalJSON.g:768:2: ( rule__Array__Group_2_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJSON.g:768:3: rule__Array__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Array__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getArrayAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Array__Group_2__1__Impl"


    // $ANTLR start "rule__Array__Group_2_1__0"
    // InternalJSON.g:777:1: rule__Array__Group_2_1__0 : rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 ;
    public final void rule__Array__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:781:1: ( rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 )
            // InternalJSON.g:782:2: rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Array__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group_2_1__1();

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
    // $ANTLR end "rule__Array__Group_2_1__0"


    // $ANTLR start "rule__Array__Group_2_1__0__Impl"
    // InternalJSON.g:789:1: rule__Array__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:793:1: ( ( ',' ) )
            // InternalJSON.g:794:1: ( ',' )
            {
            // InternalJSON.g:794:1: ( ',' )
            // InternalJSON.g:795:2: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Array__Group_2_1__0__Impl"


    // $ANTLR start "rule__Array__Group_2_1__1"
    // InternalJSON.g:804:1: rule__Array__Group_2_1__1 : rule__Array__Group_2_1__1__Impl ;
    public final void rule__Array__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:808:1: ( rule__Array__Group_2_1__1__Impl )
            // InternalJSON.g:809:2: rule__Array__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Array__Group_2_1__1"


    // $ANTLR start "rule__Array__Group_2_1__1__Impl"
    // InternalJSON.g:815:1: rule__Array__Group_2_1__1__Impl : ( ( rule__Array__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__Array__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:819:1: ( ( ( rule__Array__ValuesAssignment_2_1_1 ) ) )
            // InternalJSON.g:820:1: ( ( rule__Array__ValuesAssignment_2_1_1 ) )
            {
            // InternalJSON.g:820:1: ( ( rule__Array__ValuesAssignment_2_1_1 ) )
            // InternalJSON.g:821:2: ( rule__Array__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayAccess().getValuesAssignment_2_1_1()); 
            // InternalJSON.g:822:2: ( rule__Array__ValuesAssignment_2_1_1 )
            // InternalJSON.g:822:3: rule__Array__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Array__ValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getValuesAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Array__Group_2_1__1__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalJSON.g:831:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:835:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalJSON.g:836:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalJSON.g:843:1: rule__Number__Group__0__Impl : ( () ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:847:1: ( ( () ) )
            // InternalJSON.g:848:1: ( () )
            {
            // InternalJSON.g:848:1: ( () )
            // InternalJSON.g:849:2: ()
            {
             before(grammarAccess.getNumberAccess().getNumberAction_0()); 
            // InternalJSON.g:850:2: ()
            // InternalJSON.g:850:3: 
            {
            }

             after(grammarAccess.getNumberAccess().getNumberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalJSON.g:858:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:862:1: ( rule__Number__Group__1__Impl )
            // InternalJSON.g:863:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalJSON.g:869:1: rule__Number__Group__1__Impl : ( RULE_JSONNUMBER ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:873:1: ( ( RULE_JSONNUMBER ) )
            // InternalJSON.g:874:1: ( RULE_JSONNUMBER )
            {
            // InternalJSON.g:874:1: ( RULE_JSONNUMBER )
            // InternalJSON.g:875:2: RULE_JSONNUMBER
            {
             before(grammarAccess.getNumberAccess().getJSONNUMBERTerminalRuleCall_1()); 
            match(input,RULE_JSONNUMBER,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getJSONNUMBERTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Str__Group__0"
    // InternalJSON.g:885:1: rule__Str__Group__0 : rule__Str__Group__0__Impl rule__Str__Group__1 ;
    public final void rule__Str__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:889:1: ( rule__Str__Group__0__Impl rule__Str__Group__1 )
            // InternalJSON.g:890:2: rule__Str__Group__0__Impl rule__Str__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Str__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Str__Group__1();

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
    // $ANTLR end "rule__Str__Group__0"


    // $ANTLR start "rule__Str__Group__0__Impl"
    // InternalJSON.g:897:1: rule__Str__Group__0__Impl : ( () ) ;
    public final void rule__Str__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:901:1: ( ( () ) )
            // InternalJSON.g:902:1: ( () )
            {
            // InternalJSON.g:902:1: ( () )
            // InternalJSON.g:903:2: ()
            {
             before(grammarAccess.getStrAccess().getStrAction_0()); 
            // InternalJSON.g:904:2: ()
            // InternalJSON.g:904:3: 
            {
            }

             after(grammarAccess.getStrAccess().getStrAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Str__Group__0__Impl"


    // $ANTLR start "rule__Str__Group__1"
    // InternalJSON.g:912:1: rule__Str__Group__1 : rule__Str__Group__1__Impl ;
    public final void rule__Str__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:916:1: ( rule__Str__Group__1__Impl )
            // InternalJSON.g:917:2: rule__Str__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Str__Group__1__Impl();

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
    // $ANTLR end "rule__Str__Group__1"


    // $ANTLR start "rule__Str__Group__1__Impl"
    // InternalJSON.g:923:1: rule__Str__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Str__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:927:1: ( ( RULE_STRING ) )
            // InternalJSON.g:928:1: ( RULE_STRING )
            {
            // InternalJSON.g:928:1: ( RULE_STRING )
            // InternalJSON.g:929:2: RULE_STRING
            {
             before(grammarAccess.getStrAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStrAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Str__Group__1__Impl"


    // $ANTLR start "rule__Boolean__Group_0__0"
    // InternalJSON.g:939:1: rule__Boolean__Group_0__0 : rule__Boolean__Group_0__0__Impl rule__Boolean__Group_0__1 ;
    public final void rule__Boolean__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:943:1: ( rule__Boolean__Group_0__0__Impl rule__Boolean__Group_0__1 )
            // InternalJSON.g:944:2: rule__Boolean__Group_0__0__Impl rule__Boolean__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Boolean__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group_0__1();

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
    // $ANTLR end "rule__Boolean__Group_0__0"


    // $ANTLR start "rule__Boolean__Group_0__0__Impl"
    // InternalJSON.g:951:1: rule__Boolean__Group_0__0__Impl : ( () ) ;
    public final void rule__Boolean__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:955:1: ( ( () ) )
            // InternalJSON.g:956:1: ( () )
            {
            // InternalJSON.g:956:1: ( () )
            // InternalJSON.g:957:2: ()
            {
             before(grammarAccess.getBooleanAccess().getTrueAction_0_0()); 
            // InternalJSON.g:958:2: ()
            // InternalJSON.g:958:3: 
            {
            }

             after(grammarAccess.getBooleanAccess().getTrueAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group_0__0__Impl"


    // $ANTLR start "rule__Boolean__Group_0__1"
    // InternalJSON.g:966:1: rule__Boolean__Group_0__1 : rule__Boolean__Group_0__1__Impl ;
    public final void rule__Boolean__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:970:1: ( rule__Boolean__Group_0__1__Impl )
            // InternalJSON.g:971:2: rule__Boolean__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group_0__1__Impl();

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
    // $ANTLR end "rule__Boolean__Group_0__1"


    // $ANTLR start "rule__Boolean__Group_0__1__Impl"
    // InternalJSON.g:977:1: rule__Boolean__Group_0__1__Impl : ( 'true' ) ;
    public final void rule__Boolean__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:981:1: ( ( 'true' ) )
            // InternalJSON.g:982:1: ( 'true' )
            {
            // InternalJSON.g:982:1: ( 'true' )
            // InternalJSON.g:983:2: 'true'
            {
             before(grammarAccess.getBooleanAccess().getTrueKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getTrueKeyword_0_1()); 

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
    // $ANTLR end "rule__Boolean__Group_0__1__Impl"


    // $ANTLR start "rule__Boolean__Group_1__0"
    // InternalJSON.g:993:1: rule__Boolean__Group_1__0 : rule__Boolean__Group_1__0__Impl rule__Boolean__Group_1__1 ;
    public final void rule__Boolean__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:997:1: ( rule__Boolean__Group_1__0__Impl rule__Boolean__Group_1__1 )
            // InternalJSON.g:998:2: rule__Boolean__Group_1__0__Impl rule__Boolean__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Boolean__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group_1__1();

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
    // $ANTLR end "rule__Boolean__Group_1__0"


    // $ANTLR start "rule__Boolean__Group_1__0__Impl"
    // InternalJSON.g:1005:1: rule__Boolean__Group_1__0__Impl : ( () ) ;
    public final void rule__Boolean__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1009:1: ( ( () ) )
            // InternalJSON.g:1010:1: ( () )
            {
            // InternalJSON.g:1010:1: ( () )
            // InternalJSON.g:1011:2: ()
            {
             before(grammarAccess.getBooleanAccess().getFalseAction_1_0()); 
            // InternalJSON.g:1012:2: ()
            // InternalJSON.g:1012:3: 
            {
            }

             after(grammarAccess.getBooleanAccess().getFalseAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group_1__0__Impl"


    // $ANTLR start "rule__Boolean__Group_1__1"
    // InternalJSON.g:1020:1: rule__Boolean__Group_1__1 : rule__Boolean__Group_1__1__Impl ;
    public final void rule__Boolean__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1024:1: ( rule__Boolean__Group_1__1__Impl )
            // InternalJSON.g:1025:2: rule__Boolean__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group_1__1__Impl();

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
    // $ANTLR end "rule__Boolean__Group_1__1"


    // $ANTLR start "rule__Boolean__Group_1__1__Impl"
    // InternalJSON.g:1031:1: rule__Boolean__Group_1__1__Impl : ( 'false' ) ;
    public final void rule__Boolean__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1035:1: ( ( 'false' ) )
            // InternalJSON.g:1036:1: ( 'false' )
            {
            // InternalJSON.g:1036:1: ( 'false' )
            // InternalJSON.g:1037:2: 'false'
            {
             before(grammarAccess.getBooleanAccess().getFalseKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getFalseKeyword_1_1()); 

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
    // $ANTLR end "rule__Boolean__Group_1__1__Impl"


    // $ANTLR start "rule__Null__Group__0"
    // InternalJSON.g:1047:1: rule__Null__Group__0 : rule__Null__Group__0__Impl rule__Null__Group__1 ;
    public final void rule__Null__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1051:1: ( rule__Null__Group__0__Impl rule__Null__Group__1 )
            // InternalJSON.g:1052:2: rule__Null__Group__0__Impl rule__Null__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Null__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Null__Group__1();

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
    // $ANTLR end "rule__Null__Group__0"


    // $ANTLR start "rule__Null__Group__0__Impl"
    // InternalJSON.g:1059:1: rule__Null__Group__0__Impl : ( () ) ;
    public final void rule__Null__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1063:1: ( ( () ) )
            // InternalJSON.g:1064:1: ( () )
            {
            // InternalJSON.g:1064:1: ( () )
            // InternalJSON.g:1065:2: ()
            {
             before(grammarAccess.getNullAccess().getNullAction_0()); 
            // InternalJSON.g:1066:2: ()
            // InternalJSON.g:1066:3: 
            {
            }

             after(grammarAccess.getNullAccess().getNullAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Null__Group__0__Impl"


    // $ANTLR start "rule__Null__Group__1"
    // InternalJSON.g:1074:1: rule__Null__Group__1 : rule__Null__Group__1__Impl ;
    public final void rule__Null__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1078:1: ( rule__Null__Group__1__Impl )
            // InternalJSON.g:1079:2: rule__Null__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Null__Group__1__Impl();

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
    // $ANTLR end "rule__Null__Group__1"


    // $ANTLR start "rule__Null__Group__1__Impl"
    // InternalJSON.g:1085:1: rule__Null__Group__1__Impl : ( 'null' ) ;
    public final void rule__Null__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1089:1: ( ( 'null' ) )
            // InternalJSON.g:1090:1: ( 'null' )
            {
            // InternalJSON.g:1090:1: ( 'null' )
            // InternalJSON.g:1091:2: 'null'
            {
             before(grammarAccess.getNullAccess().getNullKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNullAccess().getNullKeyword_1()); 

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
    // $ANTLR end "rule__Null__Group__1__Impl"


    // $ANTLR start "rule__Object__PairsAssignment_2_0"
    // InternalJSON.g:1101:1: rule__Object__PairsAssignment_2_0 : ( rulePair ) ;
    public final void rule__Object__PairsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1105:1: ( ( rulePair ) )
            // InternalJSON.g:1106:2: ( rulePair )
            {
            // InternalJSON.g:1106:2: ( rulePair )
            // InternalJSON.g:1107:3: rulePair
            {
             before(grammarAccess.getObjectAccess().getPairsPairParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getPairsPairParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Object__PairsAssignment_2_0"


    // $ANTLR start "rule__Object__PairsAssignment_2_1_1"
    // InternalJSON.g:1116:1: rule__Object__PairsAssignment_2_1_1 : ( rulePair ) ;
    public final void rule__Object__PairsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1120:1: ( ( rulePair ) )
            // InternalJSON.g:1121:2: ( rulePair )
            {
            // InternalJSON.g:1121:2: ( rulePair )
            // InternalJSON.g:1122:3: rulePair
            {
             before(grammarAccess.getObjectAccess().getPairsPairParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getPairsPairParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Object__PairsAssignment_2_1_1"


    // $ANTLR start "rule__Pair__StringAssignment_0"
    // InternalJSON.g:1131:1: rule__Pair__StringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Pair__StringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1135:1: ( ( RULE_STRING ) )
            // InternalJSON.g:1136:2: ( RULE_STRING )
            {
            // InternalJSON.g:1136:2: ( RULE_STRING )
            // InternalJSON.g:1137:3: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getStringSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getStringSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Pair__StringAssignment_0"


    // $ANTLR start "rule__Pair__ValueAssignment_2"
    // InternalJSON.g:1146:1: rule__Pair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Pair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1150:1: ( ( ruleValue ) )
            // InternalJSON.g:1151:2: ( ruleValue )
            {
            // InternalJSON.g:1151:2: ( ruleValue )
            // InternalJSON.g:1152:3: ruleValue
            {
             before(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Pair__ValueAssignment_2"


    // $ANTLR start "rule__Array__ValuesAssignment_2_0"
    // InternalJSON.g:1161:1: rule__Array__ValuesAssignment_2_0 : ( ruleValue ) ;
    public final void rule__Array__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1165:1: ( ( ruleValue ) )
            // InternalJSON.g:1166:2: ( ruleValue )
            {
            // InternalJSON.g:1166:2: ( ruleValue )
            // InternalJSON.g:1167:3: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Array__ValuesAssignment_2_0"


    // $ANTLR start "rule__Array__ValuesAssignment_2_1_1"
    // InternalJSON.g:1176:1: rule__Array__ValuesAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__Array__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSON.g:1180:1: ( ( ruleValue ) )
            // InternalJSON.g:1181:2: ( ruleValue )
            {
            // InternalJSON.g:1181:2: ( ruleValue )
            // InternalJSON.g:1182:3: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Array__ValuesAssignment_2_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003A2030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003E2030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});

}