package ai.vital.flora2.edit.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ai.vital.flora2.edit.services.Flora2EditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFlora2EditorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ATOM", "RULE_OP1200XFX", "RULE_OP1200FX", "RULE_OP1150FX", "RULE_OP1100XFY", "RULE_OP1050XFY", "RULE_OP1000XFY", "RULE_OP954XFY", "RULE_OP900FY", "RULE_OP900FX", "RULE_OP700XFX", "RULE_OP600XFY", "RULE_OP500YFX", "RULE_OP500FX", "RULE_OP400YFX", "RULE_OP200XFX", "RULE_OP200XFY", "RULE_EXT_INT", "RULE_INT", "RULE_VARIABLE", "RULE_STRING", "RULE_WHITESPACE", "RULE_SINGLE_LINE_COMMENT", "'.'", "'!'", "'-'", "'('", "')'", "'['", "']'", "'|'"
    };
    public static final int RULE_STRING=24;
    public static final int RULE_OP1050XFY=9;
    public static final int RULE_OP400YFX=18;
    public static final int RULE_OP1100XFY=8;
    public static final int RULE_ATOM=4;
    public static final int RULE_OP954XFY=11;
    public static final int T__33=33;
    public static final int RULE_OP700XFX=14;
    public static final int T__34=34;
    public static final int RULE_OP1200FX=6;
    public static final int RULE_SINGLE_LINE_COMMENT=26;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_WHITESPACE=25;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_OP600XFY=15;
    public static final int RULE_OP900FY=12;
    public static final int RULE_EXT_INT=21;
    public static final int RULE_OP900FX=13;
    public static final int RULE_VARIABLE=23;
    public static final int RULE_OP1200XFX=5;
    public static final int RULE_OP1150FX=7;
    public static final int T__27=27;
    public static final int RULE_OP500FX=17;
    public static final int T__28=28;
    public static final int RULE_INT=22;
    public static final int T__29=29;
    public static final int RULE_OP1000XFY=10;
    public static final int RULE_OP200XFX=19;
    public static final int RULE_OP200XFY=20;
    public static final int RULE_OP500YFX=16;

    // delegates
    // delegators


        public InternalFlora2EditorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFlora2EditorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFlora2EditorParser.tokenNames; }
    public String getGrammarFileName() { return "../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g"; }


     
     	private Flora2EditorGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Flora2EditorGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:62:1: ( ruleModel EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:70:1: ruleModel : ( ( ( rule__Model__Group__0 ) ) ( ( rule__Model__Group__0 )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:74:2: ( ( ( ( rule__Model__Group__0 ) ) ( ( rule__Model__Group__0 )* ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:75:1: ( ( ( rule__Model__Group__0 ) ) ( ( rule__Model__Group__0 )* ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:75:1: ( ( ( rule__Model__Group__0 ) ) ( ( rule__Model__Group__0 )* ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:76:1: ( ( rule__Model__Group__0 ) ) ( ( rule__Model__Group__0 )* )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:76:1: ( ( rule__Model__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:77:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:78:1: ( rule__Model__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:78:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel102);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }

            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:81:1: ( ( rule__Model__Group__0 )* )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:82:1: ( rule__Model__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:83:1: ( rule__Model__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ATOM && LA1_0<=RULE_OP200XFY)||(LA1_0>=RULE_INT && LA1_0<=RULE_STRING)||(LA1_0>=27 && LA1_0<=30)||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:83:2: rule__Model__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel114);
            	    rule__Model__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleATOMS"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:96:1: entryRuleATOMS : ruleATOMS EOF ;
    public final void entryRuleATOMS() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:97:1: ( ruleATOMS EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:98:1: ruleATOMS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getATOMSRule()); 
            }
            pushFollow(FOLLOW_ruleATOMS_in_entryRuleATOMS144);
            ruleATOMS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getATOMSRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleATOMS151); if (state.failed) return ;

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
    // $ANTLR end "entryRuleATOMS"


    // $ANTLR start "ruleATOMS"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:105:1: ruleATOMS : ( ( rule__ATOMS__Alternatives ) ) ;
    public final void ruleATOMS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:109:2: ( ( ( rule__ATOMS__Alternatives ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:110:1: ( ( rule__ATOMS__Alternatives ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:110:1: ( ( rule__ATOMS__Alternatives ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:111:1: ( rule__ATOMS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getATOMSAccess().getAlternatives()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:112:1: ( rule__ATOMS__Alternatives )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:112:2: rule__ATOMS__Alternatives
            {
            pushFollow(FOLLOW_rule__ATOMS__Alternatives_in_ruleATOMS177);
            rule__ATOMS__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getATOMSAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleATOMS"


    // $ANTLR start "entryRuleNUMBER"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:124:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:128:1: ( ruleNUMBER EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:129:1: ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER209);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER216); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:139:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:144:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:145:1: ( ( rule__NUMBER__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:145:1: ( ( rule__NUMBER__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:146:1: ( rule__NUMBER__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:147:1: ( rule__NUMBER__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:147:2: rule__NUMBER__Group__0
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__0_in_ruleNUMBER246);
            rule__NUMBER__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleExpressionInfinity"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:160:1: entryRuleExpressionInfinity : ruleExpressionInfinity EOF ;
    public final void entryRuleExpressionInfinity() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:161:1: ( ruleExpressionInfinity EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:162:1: ruleExpressionInfinity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionInfinityRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionInfinity_in_entryRuleExpressionInfinity273);
            ruleExpressionInfinity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionInfinityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionInfinity280); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionInfinity"


    // $ANTLR start "ruleExpressionInfinity"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:169:1: ruleExpressionInfinity : ( ruleExpression1200xfx ) ;
    public final void ruleExpressionInfinity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:173:2: ( ( ruleExpression1200xfx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:174:1: ( ruleExpression1200xfx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:174:1: ( ruleExpression1200xfx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:175:1: ruleExpression1200xfx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionInfinityAccess().getExpression1200xfxParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleExpression1200xfx_in_ruleExpressionInfinity306);
            ruleExpression1200xfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionInfinityAccess().getExpression1200xfxParserRuleCall()); 
            }

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
    // $ANTLR end "ruleExpressionInfinity"


    // $ANTLR start "entryRuleExpression1200xfx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:188:1: entryRuleExpression1200xfx : ruleExpression1200xfx EOF ;
    public final void entryRuleExpression1200xfx() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:189:1: ( ruleExpression1200xfx EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:190:1: ruleExpression1200xfx EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200xfxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression1200xfx_in_entryRuleExpression1200xfx332);
            ruleExpression1200xfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200xfxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1200xfx339); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression1200xfx"


    // $ANTLR start "ruleExpression1200xfx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:197:1: ruleExpression1200xfx : ( ( rule__Expression1200xfx__Group__0 ) ) ;
    public final void ruleExpression1200xfx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:201:2: ( ( ( rule__Expression1200xfx__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:202:1: ( ( rule__Expression1200xfx__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:202:1: ( ( rule__Expression1200xfx__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:203:1: ( rule__Expression1200xfx__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200xfxAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:204:1: ( rule__Expression1200xfx__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:204:2: rule__Expression1200xfx__Group__0
            {
            pushFollow(FOLLOW_rule__Expression1200xfx__Group__0_in_ruleExpression1200xfx365);
            rule__Expression1200xfx__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200xfxAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression1200xfx"


    // $ANTLR start "entryRuleExpression1200fx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:216:1: entryRuleExpression1200fx : ruleExpression1200fx EOF ;
    public final void entryRuleExpression1200fx() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:217:1: ( ruleExpression1200fx EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:218:1: ruleExpression1200fx EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200fxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression1200fx_in_entryRuleExpression1200fx392);
            ruleExpression1200fx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200fxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1200fx399); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression1200fx"


    // $ANTLR start "ruleExpression1200fx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:225:1: ruleExpression1200fx : ( ( rule__Expression1200fx__Group__0 ) ) ;
    public final void ruleExpression1200fx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:229:2: ( ( ( rule__Expression1200fx__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:230:1: ( ( rule__Expression1200fx__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:230:1: ( ( rule__Expression1200fx__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:231:1: ( rule__Expression1200fx__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200fxAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:232:1: ( rule__Expression1200fx__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:232:2: rule__Expression1200fx__Group__0
            {
            pushFollow(FOLLOW_rule__Expression1200fx__Group__0_in_ruleExpression1200fx425);
            rule__Expression1200fx__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200fxAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression1200fx"


    // $ANTLR start "entryRuleExpression1150fx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:244:1: entryRuleExpression1150fx : ruleExpression1150fx EOF ;
    public final void entryRuleExpression1150fx() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:245:1: ( ruleExpression1150fx EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:246:1: ruleExpression1150fx EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1150fxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression1150fx_in_entryRuleExpression1150fx452);
            ruleExpression1150fx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1150fxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1150fx459); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression1150fx"


    // $ANTLR start "ruleExpression1150fx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:253:1: ruleExpression1150fx : ( ( rule__Expression1150fx__Group__0 ) ) ;
    public final void ruleExpression1150fx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:257:2: ( ( ( rule__Expression1150fx__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:258:1: ( ( rule__Expression1150fx__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:258:1: ( ( rule__Expression1150fx__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:259:1: ( rule__Expression1150fx__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1150fxAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:260:1: ( rule__Expression1150fx__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:260:2: rule__Expression1150fx__Group__0
            {
            pushFollow(FOLLOW_rule__Expression1150fx__Group__0_in_ruleExpression1150fx485);
            rule__Expression1150fx__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1150fxAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression1150fx"


    // $ANTLR start "entryRuleExpression1100xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:272:1: entryRuleExpression1100xfy : ruleExpression1100xfy EOF ;
    public final void entryRuleExpression1100xfy() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:273:1: ( ruleExpression1100xfy EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:274:1: ruleExpression1100xfy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1100xfyRule()); 
            }
            pushFollow(FOLLOW_ruleExpression1100xfy_in_entryRuleExpression1100xfy512);
            ruleExpression1100xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1100xfyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1100xfy519); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression1100xfy"


    // $ANTLR start "ruleExpression1100xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:281:1: ruleExpression1100xfy : ( ( rule__Expression1100xfy__Group__0 ) ) ;
    public final void ruleExpression1100xfy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:285:2: ( ( ( rule__Expression1100xfy__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:286:1: ( ( rule__Expression1100xfy__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:286:1: ( ( rule__Expression1100xfy__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:287:1: ( rule__Expression1100xfy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1100xfyAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:288:1: ( rule__Expression1100xfy__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:288:2: rule__Expression1100xfy__Group__0
            {
            pushFollow(FOLLOW_rule__Expression1100xfy__Group__0_in_ruleExpression1100xfy545);
            rule__Expression1100xfy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1100xfyAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression1100xfy"


    // $ANTLR start "entryRuleExpression1050xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:300:1: entryRuleExpression1050xfy : ruleExpression1050xfy EOF ;
    public final void entryRuleExpression1050xfy() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:301:1: ( ruleExpression1050xfy EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:302:1: ruleExpression1050xfy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1050xfyRule()); 
            }
            pushFollow(FOLLOW_ruleExpression1050xfy_in_entryRuleExpression1050xfy572);
            ruleExpression1050xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1050xfyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1050xfy579); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression1050xfy"


    // $ANTLR start "ruleExpression1050xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:309:1: ruleExpression1050xfy : ( ( rule__Expression1050xfy__Group__0 ) ) ;
    public final void ruleExpression1050xfy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:313:2: ( ( ( rule__Expression1050xfy__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:314:1: ( ( rule__Expression1050xfy__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:314:1: ( ( rule__Expression1050xfy__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:315:1: ( rule__Expression1050xfy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1050xfyAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:316:1: ( rule__Expression1050xfy__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:316:2: rule__Expression1050xfy__Group__0
            {
            pushFollow(FOLLOW_rule__Expression1050xfy__Group__0_in_ruleExpression1050xfy605);
            rule__Expression1050xfy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1050xfyAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression1050xfy"


    // $ANTLR start "entryRuleExpression1000xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:328:1: entryRuleExpression1000xfy : ruleExpression1000xfy EOF ;
    public final void entryRuleExpression1000xfy() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:329:1: ( ruleExpression1000xfy EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:330:1: ruleExpression1000xfy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1000xfyRule()); 
            }
            pushFollow(FOLLOW_ruleExpression1000xfy_in_entryRuleExpression1000xfy632);
            ruleExpression1000xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1000xfyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1000xfy639); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression1000xfy"


    // $ANTLR start "ruleExpression1000xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:337:1: ruleExpression1000xfy : ( ( rule__Expression1000xfy__Group__0 ) ) ;
    public final void ruleExpression1000xfy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:341:2: ( ( ( rule__Expression1000xfy__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:342:1: ( ( rule__Expression1000xfy__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:342:1: ( ( rule__Expression1000xfy__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:343:1: ( rule__Expression1000xfy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1000xfyAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:344:1: ( rule__Expression1000xfy__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:344:2: rule__Expression1000xfy__Group__0
            {
            pushFollow(FOLLOW_rule__Expression1000xfy__Group__0_in_ruleExpression1000xfy665);
            rule__Expression1000xfy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1000xfyAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression1000xfy"


    // $ANTLR start "entryRuleExpression954xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:356:1: entryRuleExpression954xfy : ruleExpression954xfy EOF ;
    public final void entryRuleExpression954xfy() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:357:1: ( ruleExpression954xfy EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:358:1: ruleExpression954xfy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression954xfyRule()); 
            }
            pushFollow(FOLLOW_ruleExpression954xfy_in_entryRuleExpression954xfy692);
            ruleExpression954xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression954xfyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression954xfy699); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression954xfy"


    // $ANTLR start "ruleExpression954xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:365:1: ruleExpression954xfy : ( ( rule__Expression954xfy__Group__0 ) ) ;
    public final void ruleExpression954xfy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:369:2: ( ( ( rule__Expression954xfy__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:370:1: ( ( rule__Expression954xfy__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:370:1: ( ( rule__Expression954xfy__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:371:1: ( rule__Expression954xfy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression954xfyAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:372:1: ( rule__Expression954xfy__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:372:2: rule__Expression954xfy__Group__0
            {
            pushFollow(FOLLOW_rule__Expression954xfy__Group__0_in_ruleExpression954xfy725);
            rule__Expression954xfy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression954xfyAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression954xfy"


    // $ANTLR start "entryRuleExpression900fy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:384:1: entryRuleExpression900fy : ruleExpression900fy EOF ;
    public final void entryRuleExpression900fy() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:385:1: ( ruleExpression900fy EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:386:1: ruleExpression900fy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fyRule()); 
            }
            pushFollow(FOLLOW_ruleExpression900fy_in_entryRuleExpression900fy752);
            ruleExpression900fy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression900fy759); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression900fy"


    // $ANTLR start "ruleExpression900fy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:393:1: ruleExpression900fy : ( ( rule__Expression900fy__Alternatives ) ) ;
    public final void ruleExpression900fy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:397:2: ( ( ( rule__Expression900fy__Alternatives ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:398:1: ( ( rule__Expression900fy__Alternatives ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:398:1: ( ( rule__Expression900fy__Alternatives ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:399:1: ( rule__Expression900fy__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fyAccess().getAlternatives()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:400:1: ( rule__Expression900fy__Alternatives )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:400:2: rule__Expression900fy__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression900fy__Alternatives_in_ruleExpression900fy785);
            rule__Expression900fy__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fyAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleExpression900fy"


    // $ANTLR start "entryRuleExpression900fx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:412:1: entryRuleExpression900fx : ruleExpression900fx EOF ;
    public final void entryRuleExpression900fx() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:413:1: ( ruleExpression900fx EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:414:1: ruleExpression900fx EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression900fx_in_entryRuleExpression900fx812);
            ruleExpression900fx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression900fx819); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression900fx"


    // $ANTLR start "ruleExpression900fx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:421:1: ruleExpression900fx : ( ( rule__Expression900fx__Group__0 ) ) ;
    public final void ruleExpression900fx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:425:2: ( ( ( rule__Expression900fx__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:426:1: ( ( rule__Expression900fx__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:426:1: ( ( rule__Expression900fx__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:427:1: ( rule__Expression900fx__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fxAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:428:1: ( rule__Expression900fx__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:428:2: rule__Expression900fx__Group__0
            {
            pushFollow(FOLLOW_rule__Expression900fx__Group__0_in_ruleExpression900fx845);
            rule__Expression900fx__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fxAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression900fx"


    // $ANTLR start "entryRuleExpression700xfx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:440:1: entryRuleExpression700xfx : ruleExpression700xfx EOF ;
    public final void entryRuleExpression700xfx() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:441:1: ( ruleExpression700xfx EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:442:1: ruleExpression700xfx EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression700xfxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression700xfx_in_entryRuleExpression700xfx872);
            ruleExpression700xfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression700xfxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression700xfx879); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression700xfx"


    // $ANTLR start "ruleExpression700xfx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:449:1: ruleExpression700xfx : ( ( rule__Expression700xfx__Group__0 ) ) ;
    public final void ruleExpression700xfx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:453:2: ( ( ( rule__Expression700xfx__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:454:1: ( ( rule__Expression700xfx__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:454:1: ( ( rule__Expression700xfx__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:455:1: ( rule__Expression700xfx__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression700xfxAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:456:1: ( rule__Expression700xfx__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:456:2: rule__Expression700xfx__Group__0
            {
            pushFollow(FOLLOW_rule__Expression700xfx__Group__0_in_ruleExpression700xfx905);
            rule__Expression700xfx__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression700xfxAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression700xfx"


    // $ANTLR start "entryRuleExpression600xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:468:1: entryRuleExpression600xfy : ruleExpression600xfy EOF ;
    public final void entryRuleExpression600xfy() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:469:1: ( ruleExpression600xfy EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:470:1: ruleExpression600xfy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression600xfyRule()); 
            }
            pushFollow(FOLLOW_ruleExpression600xfy_in_entryRuleExpression600xfy932);
            ruleExpression600xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression600xfyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression600xfy939); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression600xfy"


    // $ANTLR start "ruleExpression600xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:477:1: ruleExpression600xfy : ( ( rule__Expression600xfy__Group__0 ) ) ;
    public final void ruleExpression600xfy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:481:2: ( ( ( rule__Expression600xfy__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:482:1: ( ( rule__Expression600xfy__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:482:1: ( ( rule__Expression600xfy__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:483:1: ( rule__Expression600xfy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression600xfyAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:484:1: ( rule__Expression600xfy__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:484:2: rule__Expression600xfy__Group__0
            {
            pushFollow(FOLLOW_rule__Expression600xfy__Group__0_in_ruleExpression600xfy965);
            rule__Expression600xfy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression600xfyAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression600xfy"


    // $ANTLR start "entryRuleExpression500yfx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:496:1: entryRuleExpression500yfx : ruleExpression500yfx EOF ;
    public final void entryRuleExpression500yfx() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:497:1: ( ruleExpression500yfx EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:498:1: ruleExpression500yfx EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500yfxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression500yfx_in_entryRuleExpression500yfx992);
            ruleExpression500yfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500yfxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression500yfx999); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression500yfx"


    // $ANTLR start "ruleExpression500yfx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:505:1: ruleExpression500yfx : ( ( rule__Expression500yfx__Group__0 ) ) ;
    public final void ruleExpression500yfx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:509:2: ( ( ( rule__Expression500yfx__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:510:1: ( ( rule__Expression500yfx__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:510:1: ( ( rule__Expression500yfx__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:511:1: ( rule__Expression500yfx__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500yfxAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:512:1: ( rule__Expression500yfx__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:512:2: rule__Expression500yfx__Group__0
            {
            pushFollow(FOLLOW_rule__Expression500yfx__Group__0_in_ruleExpression500yfx1025);
            rule__Expression500yfx__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500yfxAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression500yfx"


    // $ANTLR start "entryRuleExpression500fx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:524:1: entryRuleExpression500fx : ruleExpression500fx EOF ;
    public final void entryRuleExpression500fx() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:525:1: ( ruleExpression500fx EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:526:1: ruleExpression500fx EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500fxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression500fx_in_entryRuleExpression500fx1052);
            ruleExpression500fx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500fxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression500fx1059); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression500fx"


    // $ANTLR start "ruleExpression500fx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:533:1: ruleExpression500fx : ( ( rule__Expression500fx__Group__0 ) ) ;
    public final void ruleExpression500fx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:537:2: ( ( ( rule__Expression500fx__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:538:1: ( ( rule__Expression500fx__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:538:1: ( ( rule__Expression500fx__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:539:1: ( rule__Expression500fx__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500fxAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:540:1: ( rule__Expression500fx__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:540:2: rule__Expression500fx__Group__0
            {
            pushFollow(FOLLOW_rule__Expression500fx__Group__0_in_ruleExpression500fx1085);
            rule__Expression500fx__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500fxAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression500fx"


    // $ANTLR start "entryRuleExpression400yfx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:552:1: entryRuleExpression400yfx : ruleExpression400yfx EOF ;
    public final void entryRuleExpression400yfx() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:553:1: ( ruleExpression400yfx EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:554:1: ruleExpression400yfx EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression400yfxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression400yfx_in_entryRuleExpression400yfx1112);
            ruleExpression400yfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression400yfxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression400yfx1119); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression400yfx"


    // $ANTLR start "ruleExpression400yfx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:561:1: ruleExpression400yfx : ( ( rule__Expression400yfx__Group__0 ) ) ;
    public final void ruleExpression400yfx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:565:2: ( ( ( rule__Expression400yfx__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:566:1: ( ( rule__Expression400yfx__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:566:1: ( ( rule__Expression400yfx__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:567:1: ( rule__Expression400yfx__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression400yfxAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:568:1: ( rule__Expression400yfx__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:568:2: rule__Expression400yfx__Group__0
            {
            pushFollow(FOLLOW_rule__Expression400yfx__Group__0_in_ruleExpression400yfx1145);
            rule__Expression400yfx__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression400yfxAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression400yfx"


    // $ANTLR start "entryRuleExpression200xfx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:580:1: entryRuleExpression200xfx : ruleExpression200xfx EOF ;
    public final void entryRuleExpression200xfx() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:581:1: ( ruleExpression200xfx EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:582:1: ruleExpression200xfx EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression200xfx_in_entryRuleExpression200xfx1172);
            ruleExpression200xfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression200xfx1179); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression200xfx"


    // $ANTLR start "ruleExpression200xfx"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:589:1: ruleExpression200xfx : ( ( rule__Expression200xfx__Group__0 ) ) ;
    public final void ruleExpression200xfx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:593:2: ( ( ( rule__Expression200xfx__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:594:1: ( ( rule__Expression200xfx__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:594:1: ( ( rule__Expression200xfx__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:595:1: ( rule__Expression200xfx__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfxAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:596:1: ( rule__Expression200xfx__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:596:2: rule__Expression200xfx__Group__0
            {
            pushFollow(FOLLOW_rule__Expression200xfx__Group__0_in_ruleExpression200xfx1205);
            rule__Expression200xfx__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfxAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression200xfx"


    // $ANTLR start "entryRuleExpression200xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:608:1: entryRuleExpression200xfy : ruleExpression200xfy EOF ;
    public final void entryRuleExpression200xfy() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:609:1: ( ruleExpression200xfy EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:610:1: ruleExpression200xfy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfyRule()); 
            }
            pushFollow(FOLLOW_ruleExpression200xfy_in_entryRuleExpression200xfy1232);
            ruleExpression200xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression200xfy1239); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression200xfy"


    // $ANTLR start "ruleExpression200xfy"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:617:1: ruleExpression200xfy : ( ( rule__Expression200xfy__Group__0 ) ) ;
    public final void ruleExpression200xfy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:621:2: ( ( ( rule__Expression200xfy__Group__0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:622:1: ( ( rule__Expression200xfy__Group__0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:622:1: ( ( rule__Expression200xfy__Group__0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:623:1: ( rule__Expression200xfy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfyAccess().getGroup()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:624:1: ( rule__Expression200xfy__Group__0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:624:2: rule__Expression200xfy__Group__0
            {
            pushFollow(FOLLOW_rule__Expression200xfy__Group__0_in_ruleExpression200xfy1265);
            rule__Expression200xfy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfyAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression200xfy"


    // $ANTLR start "entryRuleExpression0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:636:1: entryRuleExpression0 : ruleExpression0 EOF ;
    public final void entryRuleExpression0() throws RecognitionException {
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:637:1: ( ruleExpression0 EOF )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:638:1: ruleExpression0 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Rule()); 
            }
            pushFollow(FOLLOW_ruleExpression0_in_entryRuleExpression01292);
            ruleExpression0();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Rule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression01299); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression0"


    // $ANTLR start "ruleExpression0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:645:1: ruleExpression0 : ( ( rule__Expression0__Alternatives ) ) ;
    public final void ruleExpression0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:649:2: ( ( ( rule__Expression0__Alternatives ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:650:1: ( ( rule__Expression0__Alternatives ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:650:1: ( ( rule__Expression0__Alternatives ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:651:1: ( rule__Expression0__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getAlternatives()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:652:1: ( rule__Expression0__Alternatives )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:652:2: rule__Expression0__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression0__Alternatives_in_ruleExpression01325);
            rule__Expression0__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getAlternatives()); 
            }

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
    // $ANTLR end "ruleExpression0"


    // $ANTLR start "rule__ATOMS__Alternatives"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:664:1: rule__ATOMS__Alternatives : ( ( '.' ) | ( '!' ) | ( RULE_ATOM ) | ( RULE_OP1200XFX ) | ( RULE_OP1200FX ) | ( RULE_OP1150FX ) | ( RULE_OP1100XFY ) | ( RULE_OP1050XFY ) | ( RULE_OP1000XFY ) | ( RULE_OP954XFY ) | ( RULE_OP900FY ) | ( RULE_OP900FX ) | ( RULE_OP700XFX ) | ( RULE_OP600XFY ) | ( RULE_OP500YFX ) | ( RULE_OP500FX ) | ( RULE_OP400YFX ) | ( RULE_OP200XFX ) | ( RULE_OP200XFY ) );
    public final void rule__ATOMS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:668:1: ( ( '.' ) | ( '!' ) | ( RULE_ATOM ) | ( RULE_OP1200XFX ) | ( RULE_OP1200FX ) | ( RULE_OP1150FX ) | ( RULE_OP1100XFY ) | ( RULE_OP1050XFY ) | ( RULE_OP1000XFY ) | ( RULE_OP954XFY ) | ( RULE_OP900FY ) | ( RULE_OP900FX ) | ( RULE_OP700XFX ) | ( RULE_OP600XFY ) | ( RULE_OP500YFX ) | ( RULE_OP500FX ) | ( RULE_OP400YFX ) | ( RULE_OP200XFX ) | ( RULE_OP200XFY ) )
            int alt2=19;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case RULE_ATOM:
                {
                alt2=3;
                }
                break;
            case RULE_OP1200XFX:
                {
                alt2=4;
                }
                break;
            case RULE_OP1200FX:
                {
                alt2=5;
                }
                break;
            case RULE_OP1150FX:
                {
                alt2=6;
                }
                break;
            case RULE_OP1100XFY:
                {
                alt2=7;
                }
                break;
            case RULE_OP1050XFY:
                {
                alt2=8;
                }
                break;
            case RULE_OP1000XFY:
                {
                alt2=9;
                }
                break;
            case RULE_OP954XFY:
                {
                alt2=10;
                }
                break;
            case RULE_OP900FY:
                {
                alt2=11;
                }
                break;
            case RULE_OP900FX:
                {
                alt2=12;
                }
                break;
            case RULE_OP700XFX:
                {
                alt2=13;
                }
                break;
            case RULE_OP600XFY:
                {
                alt2=14;
                }
                break;
            case RULE_OP500YFX:
                {
                alt2=15;
                }
                break;
            case RULE_OP500FX:
                {
                alt2=16;
                }
                break;
            case RULE_OP400YFX:
                {
                alt2=17;
                }
                break;
            case RULE_OP200XFX:
                {
                alt2=18;
                }
                break;
            case RULE_OP200XFY:
                {
                alt2=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:669:1: ( '.' )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:669:1: ( '.' )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:670:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getFullStopKeyword_0()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__ATOMS__Alternatives1362); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getFullStopKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:677:6: ( '!' )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:677:6: ( '!' )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:678:1: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getExclamationMarkKeyword_1()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__ATOMS__Alternatives1382); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getExclamationMarkKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:685:6: ( RULE_ATOM )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:685:6: ( RULE_ATOM )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:686:1: RULE_ATOM
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getATOMTerminalRuleCall_2()); 
                    }
                    match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_rule__ATOMS__Alternatives1401); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getATOMTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:691:6: ( RULE_OP1200XFX )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:691:6: ( RULE_OP1200XFX )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:692:1: RULE_OP1200XFX
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP1200XFXTerminalRuleCall_3()); 
                    }
                    match(input,RULE_OP1200XFX,FOLLOW_RULE_OP1200XFX_in_rule__ATOMS__Alternatives1418); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP1200XFXTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:697:6: ( RULE_OP1200FX )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:697:6: ( RULE_OP1200FX )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:698:1: RULE_OP1200FX
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP1200FXTerminalRuleCall_4()); 
                    }
                    match(input,RULE_OP1200FX,FOLLOW_RULE_OP1200FX_in_rule__ATOMS__Alternatives1435); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP1200FXTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:703:6: ( RULE_OP1150FX )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:703:6: ( RULE_OP1150FX )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:704:1: RULE_OP1150FX
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP1150FXTerminalRuleCall_5()); 
                    }
                    match(input,RULE_OP1150FX,FOLLOW_RULE_OP1150FX_in_rule__ATOMS__Alternatives1452); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP1150FXTerminalRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:709:6: ( RULE_OP1100XFY )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:709:6: ( RULE_OP1100XFY )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:710:1: RULE_OP1100XFY
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP1100XFYTerminalRuleCall_6()); 
                    }
                    match(input,RULE_OP1100XFY,FOLLOW_RULE_OP1100XFY_in_rule__ATOMS__Alternatives1469); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP1100XFYTerminalRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:715:6: ( RULE_OP1050XFY )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:715:6: ( RULE_OP1050XFY )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:716:1: RULE_OP1050XFY
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP1050XFYTerminalRuleCall_7()); 
                    }
                    match(input,RULE_OP1050XFY,FOLLOW_RULE_OP1050XFY_in_rule__ATOMS__Alternatives1486); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP1050XFYTerminalRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:721:6: ( RULE_OP1000XFY )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:721:6: ( RULE_OP1000XFY )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:722:1: RULE_OP1000XFY
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP1000XFYTerminalRuleCall_8()); 
                    }
                    match(input,RULE_OP1000XFY,FOLLOW_RULE_OP1000XFY_in_rule__ATOMS__Alternatives1503); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP1000XFYTerminalRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:727:6: ( RULE_OP954XFY )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:727:6: ( RULE_OP954XFY )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:728:1: RULE_OP954XFY
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP954XFYTerminalRuleCall_9()); 
                    }
                    match(input,RULE_OP954XFY,FOLLOW_RULE_OP954XFY_in_rule__ATOMS__Alternatives1520); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP954XFYTerminalRuleCall_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:733:6: ( RULE_OP900FY )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:733:6: ( RULE_OP900FY )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:734:1: RULE_OP900FY
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP900FYTerminalRuleCall_10()); 
                    }
                    match(input,RULE_OP900FY,FOLLOW_RULE_OP900FY_in_rule__ATOMS__Alternatives1537); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP900FYTerminalRuleCall_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:739:6: ( RULE_OP900FX )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:739:6: ( RULE_OP900FX )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:740:1: RULE_OP900FX
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP900FXTerminalRuleCall_11()); 
                    }
                    match(input,RULE_OP900FX,FOLLOW_RULE_OP900FX_in_rule__ATOMS__Alternatives1554); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP900FXTerminalRuleCall_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:745:6: ( RULE_OP700XFX )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:745:6: ( RULE_OP700XFX )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:746:1: RULE_OP700XFX
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP700XFXTerminalRuleCall_12()); 
                    }
                    match(input,RULE_OP700XFX,FOLLOW_RULE_OP700XFX_in_rule__ATOMS__Alternatives1571); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP700XFXTerminalRuleCall_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:751:6: ( RULE_OP600XFY )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:751:6: ( RULE_OP600XFY )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:752:1: RULE_OP600XFY
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP600XFYTerminalRuleCall_13()); 
                    }
                    match(input,RULE_OP600XFY,FOLLOW_RULE_OP600XFY_in_rule__ATOMS__Alternatives1588); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP600XFYTerminalRuleCall_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:757:6: ( RULE_OP500YFX )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:757:6: ( RULE_OP500YFX )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:758:1: RULE_OP500YFX
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP500YFXTerminalRuleCall_14()); 
                    }
                    match(input,RULE_OP500YFX,FOLLOW_RULE_OP500YFX_in_rule__ATOMS__Alternatives1605); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP500YFXTerminalRuleCall_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:763:6: ( RULE_OP500FX )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:763:6: ( RULE_OP500FX )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:764:1: RULE_OP500FX
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP500FXTerminalRuleCall_15()); 
                    }
                    match(input,RULE_OP500FX,FOLLOW_RULE_OP500FX_in_rule__ATOMS__Alternatives1622); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP500FXTerminalRuleCall_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:769:6: ( RULE_OP400YFX )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:769:6: ( RULE_OP400YFX )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:770:1: RULE_OP400YFX
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP400YFXTerminalRuleCall_16()); 
                    }
                    match(input,RULE_OP400YFX,FOLLOW_RULE_OP400YFX_in_rule__ATOMS__Alternatives1639); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP400YFXTerminalRuleCall_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:775:6: ( RULE_OP200XFX )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:775:6: ( RULE_OP200XFX )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:776:1: RULE_OP200XFX
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP200XFXTerminalRuleCall_17()); 
                    }
                    match(input,RULE_OP200XFX,FOLLOW_RULE_OP200XFX_in_rule__ATOMS__Alternatives1656); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP200XFXTerminalRuleCall_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:781:6: ( RULE_OP200XFY )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:781:6: ( RULE_OP200XFY )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:782:1: RULE_OP200XFY
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATOMSAccess().getOP200XFYTerminalRuleCall_18()); 
                    }
                    match(input,RULE_OP200XFY,FOLLOW_RULE_OP200XFY_in_rule__ATOMS__Alternatives1673); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATOMSAccess().getOP200XFYTerminalRuleCall_18()); 
                    }

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
    // $ANTLR end "rule__ATOMS__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives_2_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:792:1: rule__NUMBER__Alternatives_2_1 : ( ( RULE_EXT_INT ) | ( RULE_INT ) );
    public final void rule__NUMBER__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:796:1: ( ( RULE_EXT_INT ) | ( RULE_INT ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_EXT_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:797:1: ( RULE_EXT_INT )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:797:1: ( RULE_EXT_INT )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:798:1: RULE_EXT_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNUMBERAccess().getEXT_INTTerminalRuleCall_2_1_0()); 
                    }
                    match(input,RULE_EXT_INT,FOLLOW_RULE_EXT_INT_in_rule__NUMBER__Alternatives_2_11705); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNUMBERAccess().getEXT_INTTerminalRuleCall_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:803:6: ( RULE_INT )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:803:6: ( RULE_INT )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:804:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Alternatives_2_11722); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1_1()); 
                    }

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
    // $ANTLR end "rule__NUMBER__Alternatives_2_1"


    // $ANTLR start "rule__Expression900fy__Alternatives"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:814:1: rule__Expression900fy__Alternatives : ( ( ( rule__Expression900fy__Group_0__0 ) ) | ( ( rule__Expression900fy__RightAssignment_1 ) ) );
    public final void rule__Expression900fy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:818:1: ( ( ( rule__Expression900fy__Group_0__0 ) ) | ( ( rule__Expression900fy__RightAssignment_1 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:819:1: ( ( rule__Expression900fy__Group_0__0 ) )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:819:1: ( ( rule__Expression900fy__Group_0__0 ) )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:820:1: ( rule__Expression900fy__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpression900fyAccess().getGroup_0()); 
                    }
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:821:1: ( rule__Expression900fy__Group_0__0 )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:821:2: rule__Expression900fy__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Expression900fy__Group_0__0_in_rule__Expression900fy__Alternatives1754);
                    rule__Expression900fy__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpression900fyAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:825:6: ( ( rule__Expression900fy__RightAssignment_1 ) )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:825:6: ( ( rule__Expression900fy__RightAssignment_1 ) )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:826:1: ( rule__Expression900fy__RightAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpression900fyAccess().getRightAssignment_1()); 
                    }
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:827:1: ( rule__Expression900fy__RightAssignment_1 )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:827:2: rule__Expression900fy__RightAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expression900fy__RightAssignment_1_in_rule__Expression900fy__Alternatives1772);
                    rule__Expression900fy__RightAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpression900fyAccess().getRightAssignment_1()); 
                    }

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
    // $ANTLR end "rule__Expression900fy__Alternatives"


    // $ANTLR start "rule__Expression0__Alternatives"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:836:1: rule__Expression0__Alternatives : ( ( ( rule__Expression0__Group_0__0 ) ) | ( ( rule__Expression0__Group_1__0 ) ) | ( ( rule__Expression0__Group_2__0 ) ) | ( ( rule__Expression0__Group_3__0 ) ) | ( ( rule__Expression0__Group_4__0 ) ) | ( ( rule__Expression0__Group_5__0 ) ) );
    public final void rule__Expression0__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:840:1: ( ( ( rule__Expression0__Group_0__0 ) ) | ( ( rule__Expression0__Group_1__0 ) ) | ( ( rule__Expression0__Group_2__0 ) ) | ( ( rule__Expression0__Group_3__0 ) ) | ( ( rule__Expression0__Group_4__0 ) ) | ( ( rule__Expression0__Group_5__0 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
            case RULE_OP1200XFX:
            case RULE_OP1200FX:
            case RULE_OP1150FX:
            case RULE_OP1100XFY:
            case RULE_OP1050XFY:
            case RULE_OP1000XFY:
            case RULE_OP954XFY:
            case RULE_OP900FY:
            case RULE_OP900FX:
            case RULE_OP700XFX:
            case RULE_OP600XFY:
            case RULE_OP500YFX:
            case RULE_OP500FX:
            case RULE_OP400YFX:
            case RULE_OP200XFX:
            case RULE_OP200XFY:
            case 27:
            case 28:
                {
                alt5=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case RULE_INT:
            case 29:
                {
                alt5=4;
                }
                break;
            case 32:
                {
                alt5=5;
                }
                break;
            case 30:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:841:1: ( ( rule__Expression0__Group_0__0 ) )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:841:1: ( ( rule__Expression0__Group_0__0 ) )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:842:1: ( rule__Expression0__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpression0Access().getGroup_0()); 
                    }
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:843:1: ( rule__Expression0__Group_0__0 )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:843:2: rule__Expression0__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Expression0__Group_0__0_in_rule__Expression0__Alternatives1805);
                    rule__Expression0__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpression0Access().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:847:6: ( ( rule__Expression0__Group_1__0 ) )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:847:6: ( ( rule__Expression0__Group_1__0 ) )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:848:1: ( rule__Expression0__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpression0Access().getGroup_1()); 
                    }
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:849:1: ( rule__Expression0__Group_1__0 )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:849:2: rule__Expression0__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression0__Group_1__0_in_rule__Expression0__Alternatives1823);
                    rule__Expression0__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpression0Access().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:853:6: ( ( rule__Expression0__Group_2__0 ) )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:853:6: ( ( rule__Expression0__Group_2__0 ) )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:854:1: ( rule__Expression0__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpression0Access().getGroup_2()); 
                    }
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:855:1: ( rule__Expression0__Group_2__0 )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:855:2: rule__Expression0__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Expression0__Group_2__0_in_rule__Expression0__Alternatives1841);
                    rule__Expression0__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpression0Access().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:859:6: ( ( rule__Expression0__Group_3__0 ) )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:859:6: ( ( rule__Expression0__Group_3__0 ) )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:860:1: ( rule__Expression0__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpression0Access().getGroup_3()); 
                    }
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:861:1: ( rule__Expression0__Group_3__0 )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:861:2: rule__Expression0__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Expression0__Group_3__0_in_rule__Expression0__Alternatives1859);
                    rule__Expression0__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpression0Access().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:865:6: ( ( rule__Expression0__Group_4__0 ) )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:865:6: ( ( rule__Expression0__Group_4__0 ) )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:866:1: ( rule__Expression0__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpression0Access().getGroup_4()); 
                    }
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:867:1: ( rule__Expression0__Group_4__0 )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:867:2: rule__Expression0__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Expression0__Group_4__0_in_rule__Expression0__Alternatives1877);
                    rule__Expression0__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpression0Access().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:871:6: ( ( rule__Expression0__Group_5__0 ) )
                    {
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:871:6: ( ( rule__Expression0__Group_5__0 ) )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:872:1: ( rule__Expression0__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpression0Access().getGroup_5()); 
                    }
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:873:1: ( rule__Expression0__Group_5__0 )
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:873:2: rule__Expression0__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Expression0__Group_5__0_in_rule__Expression0__Alternatives1895);
                    rule__Expression0__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpression0Access().getGroup_5()); 
                    }

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
    // $ANTLR end "rule__Expression0__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:884:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:888:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:889:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01926);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01929);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:896:1: rule__Model__Group__0__Impl : ( ( rule__Model__ExpsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:900:1: ( ( ( rule__Model__ExpsAssignment_0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:901:1: ( ( rule__Model__ExpsAssignment_0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:901:1: ( ( rule__Model__ExpsAssignment_0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:902:1: ( rule__Model__ExpsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getExpsAssignment_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:903:1: ( rule__Model__ExpsAssignment_0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:903:2: rule__Model__ExpsAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ExpsAssignment_0_in_rule__Model__Group__0__Impl1956);
            rule__Model__ExpsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getExpsAssignment_0()); 
            }

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:913:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:917:1: ( rule__Model__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:918:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11986);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:924:1: rule__Model__Group__1__Impl : ( '.' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:928:1: ( ( '.' ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:929:1: ( '.' )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:929:1: ( '.' )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:930:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFullStopKeyword_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Model__Group__1__Impl2014); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFullStopKeyword_1()); 
            }

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:947:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:951:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:952:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__0__Impl_in_rule__NUMBER__Group__02049);
            rule__NUMBER__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NUMBER__Group__1_in_rule__NUMBER__Group__02052);
            rule__NUMBER__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NUMBER__Group__0"


    // $ANTLR start "rule__NUMBER__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:959:1: rule__NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:963:1: ( ( ( '-' )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:964:1: ( ( '-' )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:964:1: ( ( '-' )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:965:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:966:1: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:967:2: '-'
                    {
                    match(input,29,FOLLOW_29_in_rule__NUMBER__Group__0__Impl2081); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group__0__Impl"


    // $ANTLR start "rule__NUMBER__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:978:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:982:1: ( rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:983:2: rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__1__Impl_in_rule__NUMBER__Group__12114);
            rule__NUMBER__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NUMBER__Group__2_in_rule__NUMBER__Group__12117);
            rule__NUMBER__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NUMBER__Group__1"


    // $ANTLR start "rule__NUMBER__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:990:1: rule__NUMBER__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:994:1: ( ( RULE_INT ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:995:1: ( RULE_INT )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:995:1: ( RULE_INT )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:996:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Group__1__Impl2144); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1007:1: rule__NUMBER__Group__2 : rule__NUMBER__Group__2__Impl ;
    public final void rule__NUMBER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1011:1: ( rule__NUMBER__Group__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1012:2: rule__NUMBER__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__2__Impl_in_rule__NUMBER__Group__22173);
            rule__NUMBER__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NUMBER__Group__2"


    // $ANTLR start "rule__NUMBER__Group__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1018:1: rule__NUMBER__Group__2__Impl : ( ( rule__NUMBER__Group_2__0 )? ) ;
    public final void rule__NUMBER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1022:1: ( ( ( rule__NUMBER__Group_2__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1023:1: ( ( rule__NUMBER__Group_2__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1023:1: ( ( rule__NUMBER__Group_2__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1024:1: ( rule__NUMBER__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getGroup_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1025:1: ( rule__NUMBER__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_INT) ) {
                    int LA7_3 = input.LA(3);

                    if ( (synpred28_InternalFlora2Editor()) ) {
                        alt7=1;
                    }
                }
                else if ( (LA7_1==RULE_EXT_INT) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1025:2: rule__NUMBER__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NUMBER__Group_2__0_in_rule__NUMBER__Group__2__Impl2200);
                    rule__NUMBER__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group__2__Impl"


    // $ANTLR start "rule__NUMBER__Group_2__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1041:1: rule__NUMBER__Group_2__0 : rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 ;
    public final void rule__NUMBER__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1045:1: ( rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1046:2: rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_2__0__Impl_in_rule__NUMBER__Group_2__02237);
            rule__NUMBER__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NUMBER__Group_2__1_in_rule__NUMBER__Group_2__02240);
            rule__NUMBER__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NUMBER__Group_2__0"


    // $ANTLR start "rule__NUMBER__Group_2__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1053:1: rule__NUMBER__Group_2__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1057:1: ( ( '.' ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1058:1: ( '.' )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1058:1: ( '.' )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1059:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__NUMBER__Group_2__0__Impl2268); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group_2__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_2__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1072:1: rule__NUMBER__Group_2__1 : rule__NUMBER__Group_2__1__Impl ;
    public final void rule__NUMBER__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1076:1: ( rule__NUMBER__Group_2__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1077:2: rule__NUMBER__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_2__1__Impl_in_rule__NUMBER__Group_2__12299);
            rule__NUMBER__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NUMBER__Group_2__1"


    // $ANTLR start "rule__NUMBER__Group_2__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1083:1: rule__NUMBER__Group_2__1__Impl : ( ( rule__NUMBER__Alternatives_2_1 ) ) ;
    public final void rule__NUMBER__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1087:1: ( ( ( rule__NUMBER__Alternatives_2_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1088:1: ( ( rule__NUMBER__Alternatives_2_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1088:1: ( ( rule__NUMBER__Alternatives_2_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1089:1: ( rule__NUMBER__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getAlternatives_2_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1090:1: ( rule__NUMBER__Alternatives_2_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1090:2: rule__NUMBER__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__NUMBER__Alternatives_2_1_in_rule__NUMBER__Group_2__1__Impl2326);
            rule__NUMBER__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getAlternatives_2_1()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group_2__1__Impl"


    // $ANTLR start "rule__Expression1200xfx__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1104:1: rule__Expression1200xfx__Group__0 : rule__Expression1200xfx__Group__0__Impl rule__Expression1200xfx__Group__1 ;
    public final void rule__Expression1200xfx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1108:1: ( rule__Expression1200xfx__Group__0__Impl rule__Expression1200xfx__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1109:2: rule__Expression1200xfx__Group__0__Impl rule__Expression1200xfx__Group__1
            {
            pushFollow(FOLLOW_rule__Expression1200xfx__Group__0__Impl_in_rule__Expression1200xfx__Group__02360);
            rule__Expression1200xfx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1200xfx__Group__1_in_rule__Expression1200xfx__Group__02363);
            rule__Expression1200xfx__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1200xfx__Group__0"


    // $ANTLR start "rule__Expression1200xfx__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1116:1: rule__Expression1200xfx__Group__0__Impl : ( ruleExpression1200fx ) ;
    public final void rule__Expression1200xfx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1120:1: ( ( ruleExpression1200fx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1121:1: ( ruleExpression1200fx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1121:1: ( ruleExpression1200fx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1122:1: ruleExpression1200fx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200xfxAccess().getExpression1200fxParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression1200fx_in_rule__Expression1200xfx__Group__0__Impl2390);
            ruleExpression1200fx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200xfxAccess().getExpression1200fxParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression1200xfx__Group__0__Impl"


    // $ANTLR start "rule__Expression1200xfx__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1133:1: rule__Expression1200xfx__Group__1 : rule__Expression1200xfx__Group__1__Impl ;
    public final void rule__Expression1200xfx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1137:1: ( rule__Expression1200xfx__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1138:2: rule__Expression1200xfx__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression1200xfx__Group__1__Impl_in_rule__Expression1200xfx__Group__12419);
            rule__Expression1200xfx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1200xfx__Group__1"


    // $ANTLR start "rule__Expression1200xfx__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1144:1: rule__Expression1200xfx__Group__1__Impl : ( ( rule__Expression1200xfx__Group_1__0 )? ) ;
    public final void rule__Expression1200xfx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1148:1: ( ( ( rule__Expression1200xfx__Group_1__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1149:1: ( ( rule__Expression1200xfx__Group_1__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1149:1: ( ( rule__Expression1200xfx__Group_1__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1150:1: ( rule__Expression1200xfx__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200xfxAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1151:1: ( rule__Expression1200xfx__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OP1200XFX) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1151:2: rule__Expression1200xfx__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression1200xfx__Group_1__0_in_rule__Expression1200xfx__Group__1__Impl2446);
                    rule__Expression1200xfx__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200xfxAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression1200xfx__Group__1__Impl"


    // $ANTLR start "rule__Expression1200xfx__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1165:1: rule__Expression1200xfx__Group_1__0 : rule__Expression1200xfx__Group_1__0__Impl rule__Expression1200xfx__Group_1__1 ;
    public final void rule__Expression1200xfx__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1169:1: ( rule__Expression1200xfx__Group_1__0__Impl rule__Expression1200xfx__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1170:2: rule__Expression1200xfx__Group_1__0__Impl rule__Expression1200xfx__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression1200xfx__Group_1__0__Impl_in_rule__Expression1200xfx__Group_1__02481);
            rule__Expression1200xfx__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1200xfx__Group_1__1_in_rule__Expression1200xfx__Group_1__02484);
            rule__Expression1200xfx__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1200xfx__Group_1__0"


    // $ANTLR start "rule__Expression1200xfx__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1177:1: rule__Expression1200xfx__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1200xfx__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1181:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1182:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1182:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1183:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200xfxAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1184:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1186:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200xfxAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1200xfx__Group_1__0__Impl"


    // $ANTLR start "rule__Expression1200xfx__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1196:1: rule__Expression1200xfx__Group_1__1 : rule__Expression1200xfx__Group_1__1__Impl rule__Expression1200xfx__Group_1__2 ;
    public final void rule__Expression1200xfx__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1200:1: ( rule__Expression1200xfx__Group_1__1__Impl rule__Expression1200xfx__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1201:2: rule__Expression1200xfx__Group_1__1__Impl rule__Expression1200xfx__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression1200xfx__Group_1__1__Impl_in_rule__Expression1200xfx__Group_1__12542);
            rule__Expression1200xfx__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1200xfx__Group_1__2_in_rule__Expression1200xfx__Group_1__12545);
            rule__Expression1200xfx__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1200xfx__Group_1__1"


    // $ANTLR start "rule__Expression1200xfx__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1208:1: rule__Expression1200xfx__Group_1__1__Impl : ( ( rule__Expression1200xfx__OpAssignment_1_1 ) ) ;
    public final void rule__Expression1200xfx__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1212:1: ( ( ( rule__Expression1200xfx__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1213:1: ( ( rule__Expression1200xfx__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1213:1: ( ( rule__Expression1200xfx__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1214:1: ( rule__Expression1200xfx__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200xfxAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1215:1: ( rule__Expression1200xfx__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1215:2: rule__Expression1200xfx__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression1200xfx__OpAssignment_1_1_in_rule__Expression1200xfx__Group_1__1__Impl2572);
            rule__Expression1200xfx__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200xfxAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression1200xfx__Group_1__1__Impl"


    // $ANTLR start "rule__Expression1200xfx__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1225:1: rule__Expression1200xfx__Group_1__2 : rule__Expression1200xfx__Group_1__2__Impl ;
    public final void rule__Expression1200xfx__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1229:1: ( rule__Expression1200xfx__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1230:2: rule__Expression1200xfx__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression1200xfx__Group_1__2__Impl_in_rule__Expression1200xfx__Group_1__22602);
            rule__Expression1200xfx__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1200xfx__Group_1__2"


    // $ANTLR start "rule__Expression1200xfx__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1236:1: rule__Expression1200xfx__Group_1__2__Impl : ( ( rule__Expression1200xfx__RightAssignment_1_2 ) ) ;
    public final void rule__Expression1200xfx__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1240:1: ( ( ( rule__Expression1200xfx__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1241:1: ( ( rule__Expression1200xfx__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1241:1: ( ( rule__Expression1200xfx__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1242:1: ( rule__Expression1200xfx__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200xfxAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1243:1: ( rule__Expression1200xfx__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1243:2: rule__Expression1200xfx__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression1200xfx__RightAssignment_1_2_in_rule__Expression1200xfx__Group_1__2__Impl2629);
            rule__Expression1200xfx__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200xfxAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression1200xfx__Group_1__2__Impl"


    // $ANTLR start "rule__Expression1200fx__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1259:1: rule__Expression1200fx__Group__0 : rule__Expression1200fx__Group__0__Impl rule__Expression1200fx__Group__1 ;
    public final void rule__Expression1200fx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1263:1: ( rule__Expression1200fx__Group__0__Impl rule__Expression1200fx__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1264:2: rule__Expression1200fx__Group__0__Impl rule__Expression1200fx__Group__1
            {
            pushFollow(FOLLOW_rule__Expression1200fx__Group__0__Impl_in_rule__Expression1200fx__Group__02665);
            rule__Expression1200fx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1200fx__Group__1_in_rule__Expression1200fx__Group__02668);
            rule__Expression1200fx__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1200fx__Group__0"


    // $ANTLR start "rule__Expression1200fx__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1271:1: rule__Expression1200fx__Group__0__Impl : ( ( rule__Expression1200fx__OpAssignment_0 )? ) ;
    public final void rule__Expression1200fx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1275:1: ( ( ( rule__Expression1200fx__OpAssignment_0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1276:1: ( ( rule__Expression1200fx__OpAssignment_0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1276:1: ( ( rule__Expression1200fx__OpAssignment_0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1277:1: ( rule__Expression1200fx__OpAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200fxAccess().getOpAssignment_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1278:1: ( rule__Expression1200fx__OpAssignment_0 )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1278:2: rule__Expression1200fx__OpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expression1200fx__OpAssignment_0_in_rule__Expression1200fx__Group__0__Impl2695);
                    rule__Expression1200fx__OpAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200fxAccess().getOpAssignment_0()); 
            }

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
    // $ANTLR end "rule__Expression1200fx__Group__0__Impl"


    // $ANTLR start "rule__Expression1200fx__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1288:1: rule__Expression1200fx__Group__1 : rule__Expression1200fx__Group__1__Impl ;
    public final void rule__Expression1200fx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1292:1: ( rule__Expression1200fx__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1293:2: rule__Expression1200fx__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression1200fx__Group__1__Impl_in_rule__Expression1200fx__Group__12726);
            rule__Expression1200fx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1200fx__Group__1"


    // $ANTLR start "rule__Expression1200fx__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1299:1: rule__Expression1200fx__Group__1__Impl : ( ( rule__Expression1200fx__RightAssignment_1 ) ) ;
    public final void rule__Expression1200fx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1303:1: ( ( ( rule__Expression1200fx__RightAssignment_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1304:1: ( ( rule__Expression1200fx__RightAssignment_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1304:1: ( ( rule__Expression1200fx__RightAssignment_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1305:1: ( rule__Expression1200fx__RightAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200fxAccess().getRightAssignment_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1306:1: ( rule__Expression1200fx__RightAssignment_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1306:2: rule__Expression1200fx__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression1200fx__RightAssignment_1_in_rule__Expression1200fx__Group__1__Impl2753);
            rule__Expression1200fx__RightAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200fxAccess().getRightAssignment_1()); 
            }

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
    // $ANTLR end "rule__Expression1200fx__Group__1__Impl"


    // $ANTLR start "rule__Expression1150fx__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1320:1: rule__Expression1150fx__Group__0 : rule__Expression1150fx__Group__0__Impl rule__Expression1150fx__Group__1 ;
    public final void rule__Expression1150fx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1324:1: ( rule__Expression1150fx__Group__0__Impl rule__Expression1150fx__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1325:2: rule__Expression1150fx__Group__0__Impl rule__Expression1150fx__Group__1
            {
            pushFollow(FOLLOW_rule__Expression1150fx__Group__0__Impl_in_rule__Expression1150fx__Group__02787);
            rule__Expression1150fx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1150fx__Group__1_in_rule__Expression1150fx__Group__02790);
            rule__Expression1150fx__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1150fx__Group__0"


    // $ANTLR start "rule__Expression1150fx__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1332:1: rule__Expression1150fx__Group__0__Impl : ( ( rule__Expression1150fx__OpAssignment_0 )? ) ;
    public final void rule__Expression1150fx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1336:1: ( ( ( rule__Expression1150fx__OpAssignment_0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1337:1: ( ( rule__Expression1150fx__OpAssignment_0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1337:1: ( ( rule__Expression1150fx__OpAssignment_0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1338:1: ( rule__Expression1150fx__OpAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1150fxAccess().getOpAssignment_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1339:1: ( rule__Expression1150fx__OpAssignment_0 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1339:2: rule__Expression1150fx__OpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expression1150fx__OpAssignment_0_in_rule__Expression1150fx__Group__0__Impl2817);
                    rule__Expression1150fx__OpAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1150fxAccess().getOpAssignment_0()); 
            }

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
    // $ANTLR end "rule__Expression1150fx__Group__0__Impl"


    // $ANTLR start "rule__Expression1150fx__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1349:1: rule__Expression1150fx__Group__1 : rule__Expression1150fx__Group__1__Impl ;
    public final void rule__Expression1150fx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1353:1: ( rule__Expression1150fx__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1354:2: rule__Expression1150fx__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression1150fx__Group__1__Impl_in_rule__Expression1150fx__Group__12848);
            rule__Expression1150fx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1150fx__Group__1"


    // $ANTLR start "rule__Expression1150fx__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1360:1: rule__Expression1150fx__Group__1__Impl : ( ( rule__Expression1150fx__RightAssignment_1 ) ) ;
    public final void rule__Expression1150fx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1364:1: ( ( ( rule__Expression1150fx__RightAssignment_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1365:1: ( ( rule__Expression1150fx__RightAssignment_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1365:1: ( ( rule__Expression1150fx__RightAssignment_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1366:1: ( rule__Expression1150fx__RightAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1150fxAccess().getRightAssignment_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1367:1: ( rule__Expression1150fx__RightAssignment_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1367:2: rule__Expression1150fx__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression1150fx__RightAssignment_1_in_rule__Expression1150fx__Group__1__Impl2875);
            rule__Expression1150fx__RightAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1150fxAccess().getRightAssignment_1()); 
            }

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
    // $ANTLR end "rule__Expression1150fx__Group__1__Impl"


    // $ANTLR start "rule__Expression1100xfy__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1381:1: rule__Expression1100xfy__Group__0 : rule__Expression1100xfy__Group__0__Impl rule__Expression1100xfy__Group__1 ;
    public final void rule__Expression1100xfy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1385:1: ( rule__Expression1100xfy__Group__0__Impl rule__Expression1100xfy__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1386:2: rule__Expression1100xfy__Group__0__Impl rule__Expression1100xfy__Group__1
            {
            pushFollow(FOLLOW_rule__Expression1100xfy__Group__0__Impl_in_rule__Expression1100xfy__Group__02909);
            rule__Expression1100xfy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1100xfy__Group__1_in_rule__Expression1100xfy__Group__02912);
            rule__Expression1100xfy__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1100xfy__Group__0"


    // $ANTLR start "rule__Expression1100xfy__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1393:1: rule__Expression1100xfy__Group__0__Impl : ( ruleExpression1050xfy ) ;
    public final void rule__Expression1100xfy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1397:1: ( ( ruleExpression1050xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1398:1: ( ruleExpression1050xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1398:1: ( ruleExpression1050xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1399:1: ruleExpression1050xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1100xfyAccess().getExpression1050xfyParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression1050xfy_in_rule__Expression1100xfy__Group__0__Impl2939);
            ruleExpression1050xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1100xfyAccess().getExpression1050xfyParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression1100xfy__Group__0__Impl"


    // $ANTLR start "rule__Expression1100xfy__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1410:1: rule__Expression1100xfy__Group__1 : rule__Expression1100xfy__Group__1__Impl ;
    public final void rule__Expression1100xfy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1414:1: ( rule__Expression1100xfy__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1415:2: rule__Expression1100xfy__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression1100xfy__Group__1__Impl_in_rule__Expression1100xfy__Group__12968);
            rule__Expression1100xfy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1100xfy__Group__1"


    // $ANTLR start "rule__Expression1100xfy__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1421:1: rule__Expression1100xfy__Group__1__Impl : ( ( rule__Expression1100xfy__Group_1__0 )? ) ;
    public final void rule__Expression1100xfy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1425:1: ( ( ( rule__Expression1100xfy__Group_1__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1426:1: ( ( rule__Expression1100xfy__Group_1__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1426:1: ( ( rule__Expression1100xfy__Group_1__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1427:1: ( rule__Expression1100xfy__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1100xfyAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1428:1: ( rule__Expression1100xfy__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OP1100XFY) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1428:2: rule__Expression1100xfy__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression1100xfy__Group_1__0_in_rule__Expression1100xfy__Group__1__Impl2995);
                    rule__Expression1100xfy__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1100xfyAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression1100xfy__Group__1__Impl"


    // $ANTLR start "rule__Expression1100xfy__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1442:1: rule__Expression1100xfy__Group_1__0 : rule__Expression1100xfy__Group_1__0__Impl rule__Expression1100xfy__Group_1__1 ;
    public final void rule__Expression1100xfy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1446:1: ( rule__Expression1100xfy__Group_1__0__Impl rule__Expression1100xfy__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1447:2: rule__Expression1100xfy__Group_1__0__Impl rule__Expression1100xfy__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression1100xfy__Group_1__0__Impl_in_rule__Expression1100xfy__Group_1__03030);
            rule__Expression1100xfy__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1100xfy__Group_1__1_in_rule__Expression1100xfy__Group_1__03033);
            rule__Expression1100xfy__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1100xfy__Group_1__0"


    // $ANTLR start "rule__Expression1100xfy__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1454:1: rule__Expression1100xfy__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1100xfy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1458:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1459:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1459:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1460:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1100xfyAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1461:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1463:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1100xfyAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1100xfy__Group_1__0__Impl"


    // $ANTLR start "rule__Expression1100xfy__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1473:1: rule__Expression1100xfy__Group_1__1 : rule__Expression1100xfy__Group_1__1__Impl rule__Expression1100xfy__Group_1__2 ;
    public final void rule__Expression1100xfy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1477:1: ( rule__Expression1100xfy__Group_1__1__Impl rule__Expression1100xfy__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1478:2: rule__Expression1100xfy__Group_1__1__Impl rule__Expression1100xfy__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression1100xfy__Group_1__1__Impl_in_rule__Expression1100xfy__Group_1__13091);
            rule__Expression1100xfy__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1100xfy__Group_1__2_in_rule__Expression1100xfy__Group_1__13094);
            rule__Expression1100xfy__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1100xfy__Group_1__1"


    // $ANTLR start "rule__Expression1100xfy__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1485:1: rule__Expression1100xfy__Group_1__1__Impl : ( ( rule__Expression1100xfy__OpAssignment_1_1 ) ) ;
    public final void rule__Expression1100xfy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1489:1: ( ( ( rule__Expression1100xfy__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1490:1: ( ( rule__Expression1100xfy__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1490:1: ( ( rule__Expression1100xfy__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1491:1: ( rule__Expression1100xfy__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1100xfyAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1492:1: ( rule__Expression1100xfy__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1492:2: rule__Expression1100xfy__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression1100xfy__OpAssignment_1_1_in_rule__Expression1100xfy__Group_1__1__Impl3121);
            rule__Expression1100xfy__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1100xfyAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression1100xfy__Group_1__1__Impl"


    // $ANTLR start "rule__Expression1100xfy__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1502:1: rule__Expression1100xfy__Group_1__2 : rule__Expression1100xfy__Group_1__2__Impl ;
    public final void rule__Expression1100xfy__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1506:1: ( rule__Expression1100xfy__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1507:2: rule__Expression1100xfy__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression1100xfy__Group_1__2__Impl_in_rule__Expression1100xfy__Group_1__23151);
            rule__Expression1100xfy__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1100xfy__Group_1__2"


    // $ANTLR start "rule__Expression1100xfy__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1513:1: rule__Expression1100xfy__Group_1__2__Impl : ( ( rule__Expression1100xfy__RightAssignment_1_2 ) ) ;
    public final void rule__Expression1100xfy__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1517:1: ( ( ( rule__Expression1100xfy__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1518:1: ( ( rule__Expression1100xfy__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1518:1: ( ( rule__Expression1100xfy__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1519:1: ( rule__Expression1100xfy__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1100xfyAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1520:1: ( rule__Expression1100xfy__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1520:2: rule__Expression1100xfy__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression1100xfy__RightAssignment_1_2_in_rule__Expression1100xfy__Group_1__2__Impl3178);
            rule__Expression1100xfy__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1100xfyAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression1100xfy__Group_1__2__Impl"


    // $ANTLR start "rule__Expression1050xfy__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1536:1: rule__Expression1050xfy__Group__0 : rule__Expression1050xfy__Group__0__Impl rule__Expression1050xfy__Group__1 ;
    public final void rule__Expression1050xfy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1540:1: ( rule__Expression1050xfy__Group__0__Impl rule__Expression1050xfy__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1541:2: rule__Expression1050xfy__Group__0__Impl rule__Expression1050xfy__Group__1
            {
            pushFollow(FOLLOW_rule__Expression1050xfy__Group__0__Impl_in_rule__Expression1050xfy__Group__03214);
            rule__Expression1050xfy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1050xfy__Group__1_in_rule__Expression1050xfy__Group__03217);
            rule__Expression1050xfy__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1050xfy__Group__0"


    // $ANTLR start "rule__Expression1050xfy__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1548:1: rule__Expression1050xfy__Group__0__Impl : ( ruleExpression1000xfy ) ;
    public final void rule__Expression1050xfy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1552:1: ( ( ruleExpression1000xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1553:1: ( ruleExpression1000xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1553:1: ( ruleExpression1000xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1554:1: ruleExpression1000xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1050xfyAccess().getExpression1000xfyParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression1000xfy_in_rule__Expression1050xfy__Group__0__Impl3244);
            ruleExpression1000xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1050xfyAccess().getExpression1000xfyParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression1050xfy__Group__0__Impl"


    // $ANTLR start "rule__Expression1050xfy__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1565:1: rule__Expression1050xfy__Group__1 : rule__Expression1050xfy__Group__1__Impl ;
    public final void rule__Expression1050xfy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1569:1: ( rule__Expression1050xfy__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1570:2: rule__Expression1050xfy__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression1050xfy__Group__1__Impl_in_rule__Expression1050xfy__Group__13273);
            rule__Expression1050xfy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1050xfy__Group__1"


    // $ANTLR start "rule__Expression1050xfy__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1576:1: rule__Expression1050xfy__Group__1__Impl : ( ( rule__Expression1050xfy__Group_1__0 )? ) ;
    public final void rule__Expression1050xfy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1580:1: ( ( ( rule__Expression1050xfy__Group_1__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1581:1: ( ( rule__Expression1050xfy__Group_1__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1581:1: ( ( rule__Expression1050xfy__Group_1__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1582:1: ( rule__Expression1050xfy__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1050xfyAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1583:1: ( rule__Expression1050xfy__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_OP1050XFY) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1583:2: rule__Expression1050xfy__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression1050xfy__Group_1__0_in_rule__Expression1050xfy__Group__1__Impl3300);
                    rule__Expression1050xfy__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1050xfyAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression1050xfy__Group__1__Impl"


    // $ANTLR start "rule__Expression1050xfy__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1597:1: rule__Expression1050xfy__Group_1__0 : rule__Expression1050xfy__Group_1__0__Impl rule__Expression1050xfy__Group_1__1 ;
    public final void rule__Expression1050xfy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1601:1: ( rule__Expression1050xfy__Group_1__0__Impl rule__Expression1050xfy__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1602:2: rule__Expression1050xfy__Group_1__0__Impl rule__Expression1050xfy__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression1050xfy__Group_1__0__Impl_in_rule__Expression1050xfy__Group_1__03335);
            rule__Expression1050xfy__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1050xfy__Group_1__1_in_rule__Expression1050xfy__Group_1__03338);
            rule__Expression1050xfy__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1050xfy__Group_1__0"


    // $ANTLR start "rule__Expression1050xfy__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1609:1: rule__Expression1050xfy__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1050xfy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1613:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1614:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1614:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1615:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1050xfyAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1616:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1618:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1050xfyAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1050xfy__Group_1__0__Impl"


    // $ANTLR start "rule__Expression1050xfy__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1628:1: rule__Expression1050xfy__Group_1__1 : rule__Expression1050xfy__Group_1__1__Impl rule__Expression1050xfy__Group_1__2 ;
    public final void rule__Expression1050xfy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1632:1: ( rule__Expression1050xfy__Group_1__1__Impl rule__Expression1050xfy__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1633:2: rule__Expression1050xfy__Group_1__1__Impl rule__Expression1050xfy__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression1050xfy__Group_1__1__Impl_in_rule__Expression1050xfy__Group_1__13396);
            rule__Expression1050xfy__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1050xfy__Group_1__2_in_rule__Expression1050xfy__Group_1__13399);
            rule__Expression1050xfy__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1050xfy__Group_1__1"


    // $ANTLR start "rule__Expression1050xfy__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1640:1: rule__Expression1050xfy__Group_1__1__Impl : ( ( rule__Expression1050xfy__OpAssignment_1_1 ) ) ;
    public final void rule__Expression1050xfy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1644:1: ( ( ( rule__Expression1050xfy__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1645:1: ( ( rule__Expression1050xfy__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1645:1: ( ( rule__Expression1050xfy__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1646:1: ( rule__Expression1050xfy__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1050xfyAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1647:1: ( rule__Expression1050xfy__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1647:2: rule__Expression1050xfy__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression1050xfy__OpAssignment_1_1_in_rule__Expression1050xfy__Group_1__1__Impl3426);
            rule__Expression1050xfy__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1050xfyAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression1050xfy__Group_1__1__Impl"


    // $ANTLR start "rule__Expression1050xfy__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1657:1: rule__Expression1050xfy__Group_1__2 : rule__Expression1050xfy__Group_1__2__Impl ;
    public final void rule__Expression1050xfy__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1661:1: ( rule__Expression1050xfy__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1662:2: rule__Expression1050xfy__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression1050xfy__Group_1__2__Impl_in_rule__Expression1050xfy__Group_1__23456);
            rule__Expression1050xfy__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1050xfy__Group_1__2"


    // $ANTLR start "rule__Expression1050xfy__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1668:1: rule__Expression1050xfy__Group_1__2__Impl : ( ( rule__Expression1050xfy__RightAssignment_1_2 ) ) ;
    public final void rule__Expression1050xfy__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1672:1: ( ( ( rule__Expression1050xfy__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1673:1: ( ( rule__Expression1050xfy__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1673:1: ( ( rule__Expression1050xfy__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1674:1: ( rule__Expression1050xfy__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1050xfyAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1675:1: ( rule__Expression1050xfy__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1675:2: rule__Expression1050xfy__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression1050xfy__RightAssignment_1_2_in_rule__Expression1050xfy__Group_1__2__Impl3483);
            rule__Expression1050xfy__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1050xfyAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression1050xfy__Group_1__2__Impl"


    // $ANTLR start "rule__Expression1000xfy__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1691:1: rule__Expression1000xfy__Group__0 : rule__Expression1000xfy__Group__0__Impl rule__Expression1000xfy__Group__1 ;
    public final void rule__Expression1000xfy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1695:1: ( rule__Expression1000xfy__Group__0__Impl rule__Expression1000xfy__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1696:2: rule__Expression1000xfy__Group__0__Impl rule__Expression1000xfy__Group__1
            {
            pushFollow(FOLLOW_rule__Expression1000xfy__Group__0__Impl_in_rule__Expression1000xfy__Group__03519);
            rule__Expression1000xfy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1000xfy__Group__1_in_rule__Expression1000xfy__Group__03522);
            rule__Expression1000xfy__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1000xfy__Group__0"


    // $ANTLR start "rule__Expression1000xfy__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1703:1: rule__Expression1000xfy__Group__0__Impl : ( ruleExpression954xfy ) ;
    public final void rule__Expression1000xfy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1707:1: ( ( ruleExpression954xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1708:1: ( ruleExpression954xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1708:1: ( ruleExpression954xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1709:1: ruleExpression954xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1000xfyAccess().getExpression954xfyParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression954xfy_in_rule__Expression1000xfy__Group__0__Impl3549);
            ruleExpression954xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1000xfyAccess().getExpression954xfyParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression1000xfy__Group__0__Impl"


    // $ANTLR start "rule__Expression1000xfy__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1720:1: rule__Expression1000xfy__Group__1 : rule__Expression1000xfy__Group__1__Impl ;
    public final void rule__Expression1000xfy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1724:1: ( rule__Expression1000xfy__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1725:2: rule__Expression1000xfy__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression1000xfy__Group__1__Impl_in_rule__Expression1000xfy__Group__13578);
            rule__Expression1000xfy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1000xfy__Group__1"


    // $ANTLR start "rule__Expression1000xfy__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1731:1: rule__Expression1000xfy__Group__1__Impl : ( ( rule__Expression1000xfy__Group_1__0 )? ) ;
    public final void rule__Expression1000xfy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1735:1: ( ( ( rule__Expression1000xfy__Group_1__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1736:1: ( ( rule__Expression1000xfy__Group_1__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1736:1: ( ( rule__Expression1000xfy__Group_1__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1737:1: ( rule__Expression1000xfy__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1000xfyAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1738:1: ( rule__Expression1000xfy__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_OP1000XFY) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1738:2: rule__Expression1000xfy__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression1000xfy__Group_1__0_in_rule__Expression1000xfy__Group__1__Impl3605);
                    rule__Expression1000xfy__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1000xfyAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression1000xfy__Group__1__Impl"


    // $ANTLR start "rule__Expression1000xfy__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1752:1: rule__Expression1000xfy__Group_1__0 : rule__Expression1000xfy__Group_1__0__Impl rule__Expression1000xfy__Group_1__1 ;
    public final void rule__Expression1000xfy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1756:1: ( rule__Expression1000xfy__Group_1__0__Impl rule__Expression1000xfy__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1757:2: rule__Expression1000xfy__Group_1__0__Impl rule__Expression1000xfy__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression1000xfy__Group_1__0__Impl_in_rule__Expression1000xfy__Group_1__03640);
            rule__Expression1000xfy__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1000xfy__Group_1__1_in_rule__Expression1000xfy__Group_1__03643);
            rule__Expression1000xfy__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1000xfy__Group_1__0"


    // $ANTLR start "rule__Expression1000xfy__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1764:1: rule__Expression1000xfy__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1000xfy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1768:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1769:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1769:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1770:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1000xfyAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1771:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1773:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1000xfyAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1000xfy__Group_1__0__Impl"


    // $ANTLR start "rule__Expression1000xfy__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1783:1: rule__Expression1000xfy__Group_1__1 : rule__Expression1000xfy__Group_1__1__Impl rule__Expression1000xfy__Group_1__2 ;
    public final void rule__Expression1000xfy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1787:1: ( rule__Expression1000xfy__Group_1__1__Impl rule__Expression1000xfy__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1788:2: rule__Expression1000xfy__Group_1__1__Impl rule__Expression1000xfy__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression1000xfy__Group_1__1__Impl_in_rule__Expression1000xfy__Group_1__13701);
            rule__Expression1000xfy__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression1000xfy__Group_1__2_in_rule__Expression1000xfy__Group_1__13704);
            rule__Expression1000xfy__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1000xfy__Group_1__1"


    // $ANTLR start "rule__Expression1000xfy__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1795:1: rule__Expression1000xfy__Group_1__1__Impl : ( ( rule__Expression1000xfy__OpAssignment_1_1 ) ) ;
    public final void rule__Expression1000xfy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1799:1: ( ( ( rule__Expression1000xfy__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1800:1: ( ( rule__Expression1000xfy__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1800:1: ( ( rule__Expression1000xfy__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1801:1: ( rule__Expression1000xfy__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1000xfyAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1802:1: ( rule__Expression1000xfy__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1802:2: rule__Expression1000xfy__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression1000xfy__OpAssignment_1_1_in_rule__Expression1000xfy__Group_1__1__Impl3731);
            rule__Expression1000xfy__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1000xfyAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression1000xfy__Group_1__1__Impl"


    // $ANTLR start "rule__Expression1000xfy__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1812:1: rule__Expression1000xfy__Group_1__2 : rule__Expression1000xfy__Group_1__2__Impl ;
    public final void rule__Expression1000xfy__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1816:1: ( rule__Expression1000xfy__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1817:2: rule__Expression1000xfy__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression1000xfy__Group_1__2__Impl_in_rule__Expression1000xfy__Group_1__23761);
            rule__Expression1000xfy__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression1000xfy__Group_1__2"


    // $ANTLR start "rule__Expression1000xfy__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1823:1: rule__Expression1000xfy__Group_1__2__Impl : ( ( rule__Expression1000xfy__RightAssignment_1_2 ) ) ;
    public final void rule__Expression1000xfy__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1827:1: ( ( ( rule__Expression1000xfy__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1828:1: ( ( rule__Expression1000xfy__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1828:1: ( ( rule__Expression1000xfy__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1829:1: ( rule__Expression1000xfy__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1000xfyAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1830:1: ( rule__Expression1000xfy__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1830:2: rule__Expression1000xfy__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression1000xfy__RightAssignment_1_2_in_rule__Expression1000xfy__Group_1__2__Impl3788);
            rule__Expression1000xfy__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1000xfyAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression1000xfy__Group_1__2__Impl"


    // $ANTLR start "rule__Expression954xfy__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1846:1: rule__Expression954xfy__Group__0 : rule__Expression954xfy__Group__0__Impl rule__Expression954xfy__Group__1 ;
    public final void rule__Expression954xfy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1850:1: ( rule__Expression954xfy__Group__0__Impl rule__Expression954xfy__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1851:2: rule__Expression954xfy__Group__0__Impl rule__Expression954xfy__Group__1
            {
            pushFollow(FOLLOW_rule__Expression954xfy__Group__0__Impl_in_rule__Expression954xfy__Group__03824);
            rule__Expression954xfy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression954xfy__Group__1_in_rule__Expression954xfy__Group__03827);
            rule__Expression954xfy__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression954xfy__Group__0"


    // $ANTLR start "rule__Expression954xfy__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1858:1: rule__Expression954xfy__Group__0__Impl : ( ruleExpression900fy ) ;
    public final void rule__Expression954xfy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1862:1: ( ( ruleExpression900fy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1863:1: ( ruleExpression900fy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1863:1: ( ruleExpression900fy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1864:1: ruleExpression900fy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression954xfyAccess().getExpression900fyParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression900fy_in_rule__Expression954xfy__Group__0__Impl3854);
            ruleExpression900fy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression954xfyAccess().getExpression900fyParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression954xfy__Group__0__Impl"


    // $ANTLR start "rule__Expression954xfy__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1875:1: rule__Expression954xfy__Group__1 : rule__Expression954xfy__Group__1__Impl ;
    public final void rule__Expression954xfy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1879:1: ( rule__Expression954xfy__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1880:2: rule__Expression954xfy__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression954xfy__Group__1__Impl_in_rule__Expression954xfy__Group__13883);
            rule__Expression954xfy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression954xfy__Group__1"


    // $ANTLR start "rule__Expression954xfy__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1886:1: rule__Expression954xfy__Group__1__Impl : ( ( rule__Expression954xfy__Group_1__0 )? ) ;
    public final void rule__Expression954xfy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1890:1: ( ( ( rule__Expression954xfy__Group_1__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1891:1: ( ( rule__Expression954xfy__Group_1__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1891:1: ( ( rule__Expression954xfy__Group_1__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1892:1: ( rule__Expression954xfy__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression954xfyAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1893:1: ( rule__Expression954xfy__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_OP954XFY) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1893:2: rule__Expression954xfy__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression954xfy__Group_1__0_in_rule__Expression954xfy__Group__1__Impl3910);
                    rule__Expression954xfy__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression954xfyAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression954xfy__Group__1__Impl"


    // $ANTLR start "rule__Expression954xfy__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1907:1: rule__Expression954xfy__Group_1__0 : rule__Expression954xfy__Group_1__0__Impl rule__Expression954xfy__Group_1__1 ;
    public final void rule__Expression954xfy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1911:1: ( rule__Expression954xfy__Group_1__0__Impl rule__Expression954xfy__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1912:2: rule__Expression954xfy__Group_1__0__Impl rule__Expression954xfy__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression954xfy__Group_1__0__Impl_in_rule__Expression954xfy__Group_1__03945);
            rule__Expression954xfy__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression954xfy__Group_1__1_in_rule__Expression954xfy__Group_1__03948);
            rule__Expression954xfy__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression954xfy__Group_1__0"


    // $ANTLR start "rule__Expression954xfy__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1919:1: rule__Expression954xfy__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression954xfy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1923:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1924:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1924:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1925:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression954xfyAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1926:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1928:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression954xfyAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression954xfy__Group_1__0__Impl"


    // $ANTLR start "rule__Expression954xfy__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1938:1: rule__Expression954xfy__Group_1__1 : rule__Expression954xfy__Group_1__1__Impl rule__Expression954xfy__Group_1__2 ;
    public final void rule__Expression954xfy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1942:1: ( rule__Expression954xfy__Group_1__1__Impl rule__Expression954xfy__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1943:2: rule__Expression954xfy__Group_1__1__Impl rule__Expression954xfy__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression954xfy__Group_1__1__Impl_in_rule__Expression954xfy__Group_1__14006);
            rule__Expression954xfy__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression954xfy__Group_1__2_in_rule__Expression954xfy__Group_1__14009);
            rule__Expression954xfy__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression954xfy__Group_1__1"


    // $ANTLR start "rule__Expression954xfy__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1950:1: rule__Expression954xfy__Group_1__1__Impl : ( ( rule__Expression954xfy__OpAssignment_1_1 ) ) ;
    public final void rule__Expression954xfy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1954:1: ( ( ( rule__Expression954xfy__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1955:1: ( ( rule__Expression954xfy__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1955:1: ( ( rule__Expression954xfy__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1956:1: ( rule__Expression954xfy__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression954xfyAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1957:1: ( rule__Expression954xfy__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1957:2: rule__Expression954xfy__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression954xfy__OpAssignment_1_1_in_rule__Expression954xfy__Group_1__1__Impl4036);
            rule__Expression954xfy__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression954xfyAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression954xfy__Group_1__1__Impl"


    // $ANTLR start "rule__Expression954xfy__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1967:1: rule__Expression954xfy__Group_1__2 : rule__Expression954xfy__Group_1__2__Impl ;
    public final void rule__Expression954xfy__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1971:1: ( rule__Expression954xfy__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1972:2: rule__Expression954xfy__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression954xfy__Group_1__2__Impl_in_rule__Expression954xfy__Group_1__24066);
            rule__Expression954xfy__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression954xfy__Group_1__2"


    // $ANTLR start "rule__Expression954xfy__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1978:1: rule__Expression954xfy__Group_1__2__Impl : ( ( rule__Expression954xfy__RightAssignment_1_2 ) ) ;
    public final void rule__Expression954xfy__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1982:1: ( ( ( rule__Expression954xfy__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1983:1: ( ( rule__Expression954xfy__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1983:1: ( ( rule__Expression954xfy__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1984:1: ( rule__Expression954xfy__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression954xfyAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1985:1: ( rule__Expression954xfy__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1985:2: rule__Expression954xfy__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression954xfy__RightAssignment_1_2_in_rule__Expression954xfy__Group_1__2__Impl4093);
            rule__Expression954xfy__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression954xfyAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression954xfy__Group_1__2__Impl"


    // $ANTLR start "rule__Expression900fy__Group_0__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2001:1: rule__Expression900fy__Group_0__0 : rule__Expression900fy__Group_0__0__Impl rule__Expression900fy__Group_0__1 ;
    public final void rule__Expression900fy__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2005:1: ( rule__Expression900fy__Group_0__0__Impl rule__Expression900fy__Group_0__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2006:2: rule__Expression900fy__Group_0__0__Impl rule__Expression900fy__Group_0__1
            {
            pushFollow(FOLLOW_rule__Expression900fy__Group_0__0__Impl_in_rule__Expression900fy__Group_0__04129);
            rule__Expression900fy__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression900fy__Group_0__1_in_rule__Expression900fy__Group_0__04132);
            rule__Expression900fy__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression900fy__Group_0__0"


    // $ANTLR start "rule__Expression900fy__Group_0__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2013:1: rule__Expression900fy__Group_0__0__Impl : ( ( rule__Expression900fy__OpAssignment_0_0 ) ) ;
    public final void rule__Expression900fy__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2017:1: ( ( ( rule__Expression900fy__OpAssignment_0_0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2018:1: ( ( rule__Expression900fy__OpAssignment_0_0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2018:1: ( ( rule__Expression900fy__OpAssignment_0_0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2019:1: ( rule__Expression900fy__OpAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fyAccess().getOpAssignment_0_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2020:1: ( rule__Expression900fy__OpAssignment_0_0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2020:2: rule__Expression900fy__OpAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Expression900fy__OpAssignment_0_0_in_rule__Expression900fy__Group_0__0__Impl4159);
            rule__Expression900fy__OpAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fyAccess().getOpAssignment_0_0()); 
            }

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
    // $ANTLR end "rule__Expression900fy__Group_0__0__Impl"


    // $ANTLR start "rule__Expression900fy__Group_0__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2030:1: rule__Expression900fy__Group_0__1 : rule__Expression900fy__Group_0__1__Impl ;
    public final void rule__Expression900fy__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2034:1: ( rule__Expression900fy__Group_0__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2035:2: rule__Expression900fy__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression900fy__Group_0__1__Impl_in_rule__Expression900fy__Group_0__14189);
            rule__Expression900fy__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression900fy__Group_0__1"


    // $ANTLR start "rule__Expression900fy__Group_0__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2041:1: rule__Expression900fy__Group_0__1__Impl : ( ( rule__Expression900fy__RightAssignment_0_1 ) ) ;
    public final void rule__Expression900fy__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2045:1: ( ( ( rule__Expression900fy__RightAssignment_0_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2046:1: ( ( rule__Expression900fy__RightAssignment_0_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2046:1: ( ( rule__Expression900fy__RightAssignment_0_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2047:1: ( rule__Expression900fy__RightAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fyAccess().getRightAssignment_0_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2048:1: ( rule__Expression900fy__RightAssignment_0_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2048:2: rule__Expression900fy__RightAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Expression900fy__RightAssignment_0_1_in_rule__Expression900fy__Group_0__1__Impl4216);
            rule__Expression900fy__RightAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fyAccess().getRightAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__Expression900fy__Group_0__1__Impl"


    // $ANTLR start "rule__Expression900fx__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2062:1: rule__Expression900fx__Group__0 : rule__Expression900fx__Group__0__Impl rule__Expression900fx__Group__1 ;
    public final void rule__Expression900fx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2066:1: ( rule__Expression900fx__Group__0__Impl rule__Expression900fx__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2067:2: rule__Expression900fx__Group__0__Impl rule__Expression900fx__Group__1
            {
            pushFollow(FOLLOW_rule__Expression900fx__Group__0__Impl_in_rule__Expression900fx__Group__04250);
            rule__Expression900fx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression900fx__Group__1_in_rule__Expression900fx__Group__04253);
            rule__Expression900fx__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression900fx__Group__0"


    // $ANTLR start "rule__Expression900fx__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2074:1: rule__Expression900fx__Group__0__Impl : ( ( rule__Expression900fx__OpAssignment_0 )? ) ;
    public final void rule__Expression900fx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2078:1: ( ( ( rule__Expression900fx__OpAssignment_0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2079:1: ( ( rule__Expression900fx__OpAssignment_0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2079:1: ( ( rule__Expression900fx__OpAssignment_0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2080:1: ( rule__Expression900fx__OpAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fxAccess().getOpAssignment_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2081:1: ( rule__Expression900fx__OpAssignment_0 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2081:2: rule__Expression900fx__OpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expression900fx__OpAssignment_0_in_rule__Expression900fx__Group__0__Impl4280);
                    rule__Expression900fx__OpAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fxAccess().getOpAssignment_0()); 
            }

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
    // $ANTLR end "rule__Expression900fx__Group__0__Impl"


    // $ANTLR start "rule__Expression900fx__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2091:1: rule__Expression900fx__Group__1 : rule__Expression900fx__Group__1__Impl ;
    public final void rule__Expression900fx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2095:1: ( rule__Expression900fx__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2096:2: rule__Expression900fx__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression900fx__Group__1__Impl_in_rule__Expression900fx__Group__14311);
            rule__Expression900fx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression900fx__Group__1"


    // $ANTLR start "rule__Expression900fx__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2102:1: rule__Expression900fx__Group__1__Impl : ( ( rule__Expression900fx__RightAssignment_1 ) ) ;
    public final void rule__Expression900fx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2106:1: ( ( ( rule__Expression900fx__RightAssignment_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2107:1: ( ( rule__Expression900fx__RightAssignment_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2107:1: ( ( rule__Expression900fx__RightAssignment_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2108:1: ( rule__Expression900fx__RightAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fxAccess().getRightAssignment_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2109:1: ( rule__Expression900fx__RightAssignment_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2109:2: rule__Expression900fx__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression900fx__RightAssignment_1_in_rule__Expression900fx__Group__1__Impl4338);
            rule__Expression900fx__RightAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fxAccess().getRightAssignment_1()); 
            }

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
    // $ANTLR end "rule__Expression900fx__Group__1__Impl"


    // $ANTLR start "rule__Expression700xfx__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2123:1: rule__Expression700xfx__Group__0 : rule__Expression700xfx__Group__0__Impl rule__Expression700xfx__Group__1 ;
    public final void rule__Expression700xfx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2127:1: ( rule__Expression700xfx__Group__0__Impl rule__Expression700xfx__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2128:2: rule__Expression700xfx__Group__0__Impl rule__Expression700xfx__Group__1
            {
            pushFollow(FOLLOW_rule__Expression700xfx__Group__0__Impl_in_rule__Expression700xfx__Group__04372);
            rule__Expression700xfx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression700xfx__Group__1_in_rule__Expression700xfx__Group__04375);
            rule__Expression700xfx__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression700xfx__Group__0"


    // $ANTLR start "rule__Expression700xfx__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2135:1: rule__Expression700xfx__Group__0__Impl : ( ruleExpression600xfy ) ;
    public final void rule__Expression700xfx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2139:1: ( ( ruleExpression600xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2140:1: ( ruleExpression600xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2140:1: ( ruleExpression600xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2141:1: ruleExpression600xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression700xfxAccess().getExpression600xfyParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression600xfy_in_rule__Expression700xfx__Group__0__Impl4402);
            ruleExpression600xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression700xfxAccess().getExpression600xfyParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression700xfx__Group__0__Impl"


    // $ANTLR start "rule__Expression700xfx__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2152:1: rule__Expression700xfx__Group__1 : rule__Expression700xfx__Group__1__Impl ;
    public final void rule__Expression700xfx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2156:1: ( rule__Expression700xfx__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2157:2: rule__Expression700xfx__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression700xfx__Group__1__Impl_in_rule__Expression700xfx__Group__14431);
            rule__Expression700xfx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression700xfx__Group__1"


    // $ANTLR start "rule__Expression700xfx__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2163:1: rule__Expression700xfx__Group__1__Impl : ( ( rule__Expression700xfx__Group_1__0 )? ) ;
    public final void rule__Expression700xfx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2167:1: ( ( ( rule__Expression700xfx__Group_1__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2168:1: ( ( rule__Expression700xfx__Group_1__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2168:1: ( ( rule__Expression700xfx__Group_1__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2169:1: ( rule__Expression700xfx__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression700xfxAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2170:1: ( rule__Expression700xfx__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_OP700XFX) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2170:2: rule__Expression700xfx__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression700xfx__Group_1__0_in_rule__Expression700xfx__Group__1__Impl4458);
                    rule__Expression700xfx__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression700xfxAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression700xfx__Group__1__Impl"


    // $ANTLR start "rule__Expression700xfx__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2184:1: rule__Expression700xfx__Group_1__0 : rule__Expression700xfx__Group_1__0__Impl rule__Expression700xfx__Group_1__1 ;
    public final void rule__Expression700xfx__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2188:1: ( rule__Expression700xfx__Group_1__0__Impl rule__Expression700xfx__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2189:2: rule__Expression700xfx__Group_1__0__Impl rule__Expression700xfx__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression700xfx__Group_1__0__Impl_in_rule__Expression700xfx__Group_1__04493);
            rule__Expression700xfx__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression700xfx__Group_1__1_in_rule__Expression700xfx__Group_1__04496);
            rule__Expression700xfx__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression700xfx__Group_1__0"


    // $ANTLR start "rule__Expression700xfx__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2196:1: rule__Expression700xfx__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression700xfx__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2200:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2201:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2201:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2202:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression700xfxAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2203:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2205:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression700xfxAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression700xfx__Group_1__0__Impl"


    // $ANTLR start "rule__Expression700xfx__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2215:1: rule__Expression700xfx__Group_1__1 : rule__Expression700xfx__Group_1__1__Impl rule__Expression700xfx__Group_1__2 ;
    public final void rule__Expression700xfx__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2219:1: ( rule__Expression700xfx__Group_1__1__Impl rule__Expression700xfx__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2220:2: rule__Expression700xfx__Group_1__1__Impl rule__Expression700xfx__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression700xfx__Group_1__1__Impl_in_rule__Expression700xfx__Group_1__14554);
            rule__Expression700xfx__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression700xfx__Group_1__2_in_rule__Expression700xfx__Group_1__14557);
            rule__Expression700xfx__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression700xfx__Group_1__1"


    // $ANTLR start "rule__Expression700xfx__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2227:1: rule__Expression700xfx__Group_1__1__Impl : ( ( rule__Expression700xfx__OpAssignment_1_1 ) ) ;
    public final void rule__Expression700xfx__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2231:1: ( ( ( rule__Expression700xfx__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2232:1: ( ( rule__Expression700xfx__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2232:1: ( ( rule__Expression700xfx__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2233:1: ( rule__Expression700xfx__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression700xfxAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2234:1: ( rule__Expression700xfx__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2234:2: rule__Expression700xfx__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression700xfx__OpAssignment_1_1_in_rule__Expression700xfx__Group_1__1__Impl4584);
            rule__Expression700xfx__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression700xfxAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression700xfx__Group_1__1__Impl"


    // $ANTLR start "rule__Expression700xfx__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2244:1: rule__Expression700xfx__Group_1__2 : rule__Expression700xfx__Group_1__2__Impl ;
    public final void rule__Expression700xfx__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2248:1: ( rule__Expression700xfx__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2249:2: rule__Expression700xfx__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression700xfx__Group_1__2__Impl_in_rule__Expression700xfx__Group_1__24614);
            rule__Expression700xfx__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression700xfx__Group_1__2"


    // $ANTLR start "rule__Expression700xfx__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2255:1: rule__Expression700xfx__Group_1__2__Impl : ( ( rule__Expression700xfx__RightAssignment_1_2 ) ) ;
    public final void rule__Expression700xfx__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2259:1: ( ( ( rule__Expression700xfx__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2260:1: ( ( rule__Expression700xfx__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2260:1: ( ( rule__Expression700xfx__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2261:1: ( rule__Expression700xfx__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression700xfxAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2262:1: ( rule__Expression700xfx__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2262:2: rule__Expression700xfx__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression700xfx__RightAssignment_1_2_in_rule__Expression700xfx__Group_1__2__Impl4641);
            rule__Expression700xfx__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression700xfxAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression700xfx__Group_1__2__Impl"


    // $ANTLR start "rule__Expression600xfy__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2278:1: rule__Expression600xfy__Group__0 : rule__Expression600xfy__Group__0__Impl rule__Expression600xfy__Group__1 ;
    public final void rule__Expression600xfy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2282:1: ( rule__Expression600xfy__Group__0__Impl rule__Expression600xfy__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2283:2: rule__Expression600xfy__Group__0__Impl rule__Expression600xfy__Group__1
            {
            pushFollow(FOLLOW_rule__Expression600xfy__Group__0__Impl_in_rule__Expression600xfy__Group__04677);
            rule__Expression600xfy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression600xfy__Group__1_in_rule__Expression600xfy__Group__04680);
            rule__Expression600xfy__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression600xfy__Group__0"


    // $ANTLR start "rule__Expression600xfy__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2290:1: rule__Expression600xfy__Group__0__Impl : ( ruleExpression500yfx ) ;
    public final void rule__Expression600xfy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2294:1: ( ( ruleExpression500yfx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2295:1: ( ruleExpression500yfx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2295:1: ( ruleExpression500yfx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2296:1: ruleExpression500yfx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression600xfyAccess().getExpression500yfxParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression500yfx_in_rule__Expression600xfy__Group__0__Impl4707);
            ruleExpression500yfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression600xfyAccess().getExpression500yfxParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression600xfy__Group__0__Impl"


    // $ANTLR start "rule__Expression600xfy__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2307:1: rule__Expression600xfy__Group__1 : rule__Expression600xfy__Group__1__Impl ;
    public final void rule__Expression600xfy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2311:1: ( rule__Expression600xfy__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2312:2: rule__Expression600xfy__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression600xfy__Group__1__Impl_in_rule__Expression600xfy__Group__14736);
            rule__Expression600xfy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression600xfy__Group__1"


    // $ANTLR start "rule__Expression600xfy__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2318:1: rule__Expression600xfy__Group__1__Impl : ( ( rule__Expression600xfy__Group_1__0 )? ) ;
    public final void rule__Expression600xfy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2322:1: ( ( ( rule__Expression600xfy__Group_1__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2323:1: ( ( rule__Expression600xfy__Group_1__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2323:1: ( ( rule__Expression600xfy__Group_1__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2324:1: ( rule__Expression600xfy__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression600xfyAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2325:1: ( rule__Expression600xfy__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_OP600XFY) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2325:2: rule__Expression600xfy__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression600xfy__Group_1__0_in_rule__Expression600xfy__Group__1__Impl4763);
                    rule__Expression600xfy__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression600xfyAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression600xfy__Group__1__Impl"


    // $ANTLR start "rule__Expression600xfy__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2339:1: rule__Expression600xfy__Group_1__0 : rule__Expression600xfy__Group_1__0__Impl rule__Expression600xfy__Group_1__1 ;
    public final void rule__Expression600xfy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2343:1: ( rule__Expression600xfy__Group_1__0__Impl rule__Expression600xfy__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2344:2: rule__Expression600xfy__Group_1__0__Impl rule__Expression600xfy__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression600xfy__Group_1__0__Impl_in_rule__Expression600xfy__Group_1__04798);
            rule__Expression600xfy__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression600xfy__Group_1__1_in_rule__Expression600xfy__Group_1__04801);
            rule__Expression600xfy__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression600xfy__Group_1__0"


    // $ANTLR start "rule__Expression600xfy__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2351:1: rule__Expression600xfy__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression600xfy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2355:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2356:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2356:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2357:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression600xfyAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2358:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2360:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression600xfyAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression600xfy__Group_1__0__Impl"


    // $ANTLR start "rule__Expression600xfy__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2370:1: rule__Expression600xfy__Group_1__1 : rule__Expression600xfy__Group_1__1__Impl rule__Expression600xfy__Group_1__2 ;
    public final void rule__Expression600xfy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2374:1: ( rule__Expression600xfy__Group_1__1__Impl rule__Expression600xfy__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2375:2: rule__Expression600xfy__Group_1__1__Impl rule__Expression600xfy__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression600xfy__Group_1__1__Impl_in_rule__Expression600xfy__Group_1__14859);
            rule__Expression600xfy__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression600xfy__Group_1__2_in_rule__Expression600xfy__Group_1__14862);
            rule__Expression600xfy__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression600xfy__Group_1__1"


    // $ANTLR start "rule__Expression600xfy__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2382:1: rule__Expression600xfy__Group_1__1__Impl : ( ( rule__Expression600xfy__OpAssignment_1_1 ) ) ;
    public final void rule__Expression600xfy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2386:1: ( ( ( rule__Expression600xfy__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2387:1: ( ( rule__Expression600xfy__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2387:1: ( ( rule__Expression600xfy__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2388:1: ( rule__Expression600xfy__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression600xfyAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2389:1: ( rule__Expression600xfy__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2389:2: rule__Expression600xfy__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression600xfy__OpAssignment_1_1_in_rule__Expression600xfy__Group_1__1__Impl4889);
            rule__Expression600xfy__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression600xfyAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression600xfy__Group_1__1__Impl"


    // $ANTLR start "rule__Expression600xfy__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2399:1: rule__Expression600xfy__Group_1__2 : rule__Expression600xfy__Group_1__2__Impl ;
    public final void rule__Expression600xfy__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2403:1: ( rule__Expression600xfy__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2404:2: rule__Expression600xfy__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression600xfy__Group_1__2__Impl_in_rule__Expression600xfy__Group_1__24919);
            rule__Expression600xfy__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression600xfy__Group_1__2"


    // $ANTLR start "rule__Expression600xfy__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2410:1: rule__Expression600xfy__Group_1__2__Impl : ( ( rule__Expression600xfy__RightAssignment_1_2 ) ) ;
    public final void rule__Expression600xfy__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2414:1: ( ( ( rule__Expression600xfy__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2415:1: ( ( rule__Expression600xfy__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2415:1: ( ( rule__Expression600xfy__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2416:1: ( rule__Expression600xfy__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression600xfyAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2417:1: ( rule__Expression600xfy__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2417:2: rule__Expression600xfy__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression600xfy__RightAssignment_1_2_in_rule__Expression600xfy__Group_1__2__Impl4946);
            rule__Expression600xfy__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression600xfyAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression600xfy__Group_1__2__Impl"


    // $ANTLR start "rule__Expression500yfx__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2433:1: rule__Expression500yfx__Group__0 : rule__Expression500yfx__Group__0__Impl rule__Expression500yfx__Group__1 ;
    public final void rule__Expression500yfx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2437:1: ( rule__Expression500yfx__Group__0__Impl rule__Expression500yfx__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2438:2: rule__Expression500yfx__Group__0__Impl rule__Expression500yfx__Group__1
            {
            pushFollow(FOLLOW_rule__Expression500yfx__Group__0__Impl_in_rule__Expression500yfx__Group__04982);
            rule__Expression500yfx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression500yfx__Group__1_in_rule__Expression500yfx__Group__04985);
            rule__Expression500yfx__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression500yfx__Group__0"


    // $ANTLR start "rule__Expression500yfx__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2445:1: rule__Expression500yfx__Group__0__Impl : ( ruleExpression500fx ) ;
    public final void rule__Expression500yfx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2449:1: ( ( ruleExpression500fx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2450:1: ( ruleExpression500fx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2450:1: ( ruleExpression500fx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2451:1: ruleExpression500fx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500yfxAccess().getExpression500fxParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression500fx_in_rule__Expression500yfx__Group__0__Impl5012);
            ruleExpression500fx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500yfxAccess().getExpression500fxParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression500yfx__Group__0__Impl"


    // $ANTLR start "rule__Expression500yfx__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2462:1: rule__Expression500yfx__Group__1 : rule__Expression500yfx__Group__1__Impl ;
    public final void rule__Expression500yfx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2466:1: ( rule__Expression500yfx__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2467:2: rule__Expression500yfx__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression500yfx__Group__1__Impl_in_rule__Expression500yfx__Group__15041);
            rule__Expression500yfx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression500yfx__Group__1"


    // $ANTLR start "rule__Expression500yfx__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2473:1: rule__Expression500yfx__Group__1__Impl : ( ( rule__Expression500yfx__Group_1__0 )* ) ;
    public final void rule__Expression500yfx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2477:1: ( ( ( rule__Expression500yfx__Group_1__0 )* ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2478:1: ( ( rule__Expression500yfx__Group_1__0 )* )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2478:1: ( ( rule__Expression500yfx__Group_1__0 )* )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2479:1: ( rule__Expression500yfx__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500yfxAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2480:1: ( rule__Expression500yfx__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_OP500YFX) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2480:2: rule__Expression500yfx__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expression500yfx__Group_1__0_in_rule__Expression500yfx__Group__1__Impl5068);
            	    rule__Expression500yfx__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500yfxAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression500yfx__Group__1__Impl"


    // $ANTLR start "rule__Expression500yfx__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2494:1: rule__Expression500yfx__Group_1__0 : rule__Expression500yfx__Group_1__0__Impl rule__Expression500yfx__Group_1__1 ;
    public final void rule__Expression500yfx__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2498:1: ( rule__Expression500yfx__Group_1__0__Impl rule__Expression500yfx__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2499:2: rule__Expression500yfx__Group_1__0__Impl rule__Expression500yfx__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression500yfx__Group_1__0__Impl_in_rule__Expression500yfx__Group_1__05103);
            rule__Expression500yfx__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression500yfx__Group_1__1_in_rule__Expression500yfx__Group_1__05106);
            rule__Expression500yfx__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression500yfx__Group_1__0"


    // $ANTLR start "rule__Expression500yfx__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2506:1: rule__Expression500yfx__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression500yfx__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2510:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2511:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2511:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2512:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500yfxAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2513:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2515:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500yfxAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression500yfx__Group_1__0__Impl"


    // $ANTLR start "rule__Expression500yfx__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2525:1: rule__Expression500yfx__Group_1__1 : rule__Expression500yfx__Group_1__1__Impl rule__Expression500yfx__Group_1__2 ;
    public final void rule__Expression500yfx__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2529:1: ( rule__Expression500yfx__Group_1__1__Impl rule__Expression500yfx__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2530:2: rule__Expression500yfx__Group_1__1__Impl rule__Expression500yfx__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression500yfx__Group_1__1__Impl_in_rule__Expression500yfx__Group_1__15164);
            rule__Expression500yfx__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression500yfx__Group_1__2_in_rule__Expression500yfx__Group_1__15167);
            rule__Expression500yfx__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression500yfx__Group_1__1"


    // $ANTLR start "rule__Expression500yfx__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2537:1: rule__Expression500yfx__Group_1__1__Impl : ( ( rule__Expression500yfx__OpAssignment_1_1 ) ) ;
    public final void rule__Expression500yfx__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2541:1: ( ( ( rule__Expression500yfx__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2542:1: ( ( rule__Expression500yfx__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2542:1: ( ( rule__Expression500yfx__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2543:1: ( rule__Expression500yfx__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500yfxAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2544:1: ( rule__Expression500yfx__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2544:2: rule__Expression500yfx__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression500yfx__OpAssignment_1_1_in_rule__Expression500yfx__Group_1__1__Impl5194);
            rule__Expression500yfx__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500yfxAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression500yfx__Group_1__1__Impl"


    // $ANTLR start "rule__Expression500yfx__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2554:1: rule__Expression500yfx__Group_1__2 : rule__Expression500yfx__Group_1__2__Impl ;
    public final void rule__Expression500yfx__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2558:1: ( rule__Expression500yfx__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2559:2: rule__Expression500yfx__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression500yfx__Group_1__2__Impl_in_rule__Expression500yfx__Group_1__25224);
            rule__Expression500yfx__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression500yfx__Group_1__2"


    // $ANTLR start "rule__Expression500yfx__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2565:1: rule__Expression500yfx__Group_1__2__Impl : ( ( rule__Expression500yfx__RightAssignment_1_2 ) ) ;
    public final void rule__Expression500yfx__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2569:1: ( ( ( rule__Expression500yfx__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2570:1: ( ( rule__Expression500yfx__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2570:1: ( ( rule__Expression500yfx__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2571:1: ( rule__Expression500yfx__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500yfxAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2572:1: ( rule__Expression500yfx__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2572:2: rule__Expression500yfx__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression500yfx__RightAssignment_1_2_in_rule__Expression500yfx__Group_1__2__Impl5251);
            rule__Expression500yfx__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500yfxAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression500yfx__Group_1__2__Impl"


    // $ANTLR start "rule__Expression500fx__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2588:1: rule__Expression500fx__Group__0 : rule__Expression500fx__Group__0__Impl rule__Expression500fx__Group__1 ;
    public final void rule__Expression500fx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2592:1: ( rule__Expression500fx__Group__0__Impl rule__Expression500fx__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2593:2: rule__Expression500fx__Group__0__Impl rule__Expression500fx__Group__1
            {
            pushFollow(FOLLOW_rule__Expression500fx__Group__0__Impl_in_rule__Expression500fx__Group__05287);
            rule__Expression500fx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression500fx__Group__1_in_rule__Expression500fx__Group__05290);
            rule__Expression500fx__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression500fx__Group__0"


    // $ANTLR start "rule__Expression500fx__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2600:1: rule__Expression500fx__Group__0__Impl : ( ( rule__Expression500fx__OpAssignment_0 )? ) ;
    public final void rule__Expression500fx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2604:1: ( ( ( rule__Expression500fx__OpAssignment_0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2605:1: ( ( rule__Expression500fx__OpAssignment_0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2605:1: ( ( rule__Expression500fx__OpAssignment_0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2606:1: ( rule__Expression500fx__OpAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500fxAccess().getOpAssignment_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2607:1: ( rule__Expression500fx__OpAssignment_0 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2607:2: rule__Expression500fx__OpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expression500fx__OpAssignment_0_in_rule__Expression500fx__Group__0__Impl5317);
                    rule__Expression500fx__OpAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500fxAccess().getOpAssignment_0()); 
            }

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
    // $ANTLR end "rule__Expression500fx__Group__0__Impl"


    // $ANTLR start "rule__Expression500fx__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2617:1: rule__Expression500fx__Group__1 : rule__Expression500fx__Group__1__Impl ;
    public final void rule__Expression500fx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2621:1: ( rule__Expression500fx__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2622:2: rule__Expression500fx__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression500fx__Group__1__Impl_in_rule__Expression500fx__Group__15348);
            rule__Expression500fx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression500fx__Group__1"


    // $ANTLR start "rule__Expression500fx__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2628:1: rule__Expression500fx__Group__1__Impl : ( ( rule__Expression500fx__RightAssignment_1 ) ) ;
    public final void rule__Expression500fx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2632:1: ( ( ( rule__Expression500fx__RightAssignment_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2633:1: ( ( rule__Expression500fx__RightAssignment_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2633:1: ( ( rule__Expression500fx__RightAssignment_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2634:1: ( rule__Expression500fx__RightAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500fxAccess().getRightAssignment_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2635:1: ( rule__Expression500fx__RightAssignment_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2635:2: rule__Expression500fx__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression500fx__RightAssignment_1_in_rule__Expression500fx__Group__1__Impl5375);
            rule__Expression500fx__RightAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500fxAccess().getRightAssignment_1()); 
            }

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
    // $ANTLR end "rule__Expression500fx__Group__1__Impl"


    // $ANTLR start "rule__Expression400yfx__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2649:1: rule__Expression400yfx__Group__0 : rule__Expression400yfx__Group__0__Impl rule__Expression400yfx__Group__1 ;
    public final void rule__Expression400yfx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2653:1: ( rule__Expression400yfx__Group__0__Impl rule__Expression400yfx__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2654:2: rule__Expression400yfx__Group__0__Impl rule__Expression400yfx__Group__1
            {
            pushFollow(FOLLOW_rule__Expression400yfx__Group__0__Impl_in_rule__Expression400yfx__Group__05409);
            rule__Expression400yfx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression400yfx__Group__1_in_rule__Expression400yfx__Group__05412);
            rule__Expression400yfx__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression400yfx__Group__0"


    // $ANTLR start "rule__Expression400yfx__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2661:1: rule__Expression400yfx__Group__0__Impl : ( ruleExpression200xfx ) ;
    public final void rule__Expression400yfx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2665:1: ( ( ruleExpression200xfx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2666:1: ( ruleExpression200xfx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2666:1: ( ruleExpression200xfx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2667:1: ruleExpression200xfx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression400yfxAccess().getExpression200xfxParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression200xfx_in_rule__Expression400yfx__Group__0__Impl5439);
            ruleExpression200xfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression400yfxAccess().getExpression200xfxParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression400yfx__Group__0__Impl"


    // $ANTLR start "rule__Expression400yfx__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2678:1: rule__Expression400yfx__Group__1 : rule__Expression400yfx__Group__1__Impl ;
    public final void rule__Expression400yfx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2682:1: ( rule__Expression400yfx__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2683:2: rule__Expression400yfx__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression400yfx__Group__1__Impl_in_rule__Expression400yfx__Group__15468);
            rule__Expression400yfx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression400yfx__Group__1"


    // $ANTLR start "rule__Expression400yfx__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2689:1: rule__Expression400yfx__Group__1__Impl : ( ( rule__Expression400yfx__Group_1__0 )* ) ;
    public final void rule__Expression400yfx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2693:1: ( ( ( rule__Expression400yfx__Group_1__0 )* ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2694:1: ( ( rule__Expression400yfx__Group_1__0 )* )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2694:1: ( ( rule__Expression400yfx__Group_1__0 )* )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2695:1: ( rule__Expression400yfx__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression400yfxAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2696:1: ( rule__Expression400yfx__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_OP400YFX) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2696:2: rule__Expression400yfx__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expression400yfx__Group_1__0_in_rule__Expression400yfx__Group__1__Impl5495);
            	    rule__Expression400yfx__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression400yfxAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression400yfx__Group__1__Impl"


    // $ANTLR start "rule__Expression400yfx__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2710:1: rule__Expression400yfx__Group_1__0 : rule__Expression400yfx__Group_1__0__Impl rule__Expression400yfx__Group_1__1 ;
    public final void rule__Expression400yfx__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2714:1: ( rule__Expression400yfx__Group_1__0__Impl rule__Expression400yfx__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2715:2: rule__Expression400yfx__Group_1__0__Impl rule__Expression400yfx__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression400yfx__Group_1__0__Impl_in_rule__Expression400yfx__Group_1__05530);
            rule__Expression400yfx__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression400yfx__Group_1__1_in_rule__Expression400yfx__Group_1__05533);
            rule__Expression400yfx__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression400yfx__Group_1__0"


    // $ANTLR start "rule__Expression400yfx__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2722:1: rule__Expression400yfx__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression400yfx__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2726:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2727:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2727:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2728:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression400yfxAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2729:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2731:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression400yfxAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression400yfx__Group_1__0__Impl"


    // $ANTLR start "rule__Expression400yfx__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2741:1: rule__Expression400yfx__Group_1__1 : rule__Expression400yfx__Group_1__1__Impl rule__Expression400yfx__Group_1__2 ;
    public final void rule__Expression400yfx__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2745:1: ( rule__Expression400yfx__Group_1__1__Impl rule__Expression400yfx__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2746:2: rule__Expression400yfx__Group_1__1__Impl rule__Expression400yfx__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression400yfx__Group_1__1__Impl_in_rule__Expression400yfx__Group_1__15591);
            rule__Expression400yfx__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression400yfx__Group_1__2_in_rule__Expression400yfx__Group_1__15594);
            rule__Expression400yfx__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression400yfx__Group_1__1"


    // $ANTLR start "rule__Expression400yfx__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2753:1: rule__Expression400yfx__Group_1__1__Impl : ( ( rule__Expression400yfx__OpAssignment_1_1 ) ) ;
    public final void rule__Expression400yfx__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2757:1: ( ( ( rule__Expression400yfx__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2758:1: ( ( rule__Expression400yfx__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2758:1: ( ( rule__Expression400yfx__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2759:1: ( rule__Expression400yfx__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression400yfxAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2760:1: ( rule__Expression400yfx__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2760:2: rule__Expression400yfx__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression400yfx__OpAssignment_1_1_in_rule__Expression400yfx__Group_1__1__Impl5621);
            rule__Expression400yfx__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression400yfxAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression400yfx__Group_1__1__Impl"


    // $ANTLR start "rule__Expression400yfx__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2770:1: rule__Expression400yfx__Group_1__2 : rule__Expression400yfx__Group_1__2__Impl ;
    public final void rule__Expression400yfx__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2774:1: ( rule__Expression400yfx__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2775:2: rule__Expression400yfx__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression400yfx__Group_1__2__Impl_in_rule__Expression400yfx__Group_1__25651);
            rule__Expression400yfx__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression400yfx__Group_1__2"


    // $ANTLR start "rule__Expression400yfx__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2781:1: rule__Expression400yfx__Group_1__2__Impl : ( ( rule__Expression400yfx__RightAssignment_1_2 ) ) ;
    public final void rule__Expression400yfx__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2785:1: ( ( ( rule__Expression400yfx__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2786:1: ( ( rule__Expression400yfx__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2786:1: ( ( rule__Expression400yfx__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2787:1: ( rule__Expression400yfx__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression400yfxAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2788:1: ( rule__Expression400yfx__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2788:2: rule__Expression400yfx__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression400yfx__RightAssignment_1_2_in_rule__Expression400yfx__Group_1__2__Impl5678);
            rule__Expression400yfx__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression400yfxAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression400yfx__Group_1__2__Impl"


    // $ANTLR start "rule__Expression200xfx__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2804:1: rule__Expression200xfx__Group__0 : rule__Expression200xfx__Group__0__Impl rule__Expression200xfx__Group__1 ;
    public final void rule__Expression200xfx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2808:1: ( rule__Expression200xfx__Group__0__Impl rule__Expression200xfx__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2809:2: rule__Expression200xfx__Group__0__Impl rule__Expression200xfx__Group__1
            {
            pushFollow(FOLLOW_rule__Expression200xfx__Group__0__Impl_in_rule__Expression200xfx__Group__05714);
            rule__Expression200xfx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression200xfx__Group__1_in_rule__Expression200xfx__Group__05717);
            rule__Expression200xfx__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression200xfx__Group__0"


    // $ANTLR start "rule__Expression200xfx__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2816:1: rule__Expression200xfx__Group__0__Impl : ( ruleExpression200xfy ) ;
    public final void rule__Expression200xfx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2820:1: ( ( ruleExpression200xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2821:1: ( ruleExpression200xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2821:1: ( ruleExpression200xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2822:1: ruleExpression200xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfxAccess().getExpression200xfyParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression200xfy_in_rule__Expression200xfx__Group__0__Impl5744);
            ruleExpression200xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfxAccess().getExpression200xfyParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression200xfx__Group__0__Impl"


    // $ANTLR start "rule__Expression200xfx__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2833:1: rule__Expression200xfx__Group__1 : rule__Expression200xfx__Group__1__Impl ;
    public final void rule__Expression200xfx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2837:1: ( rule__Expression200xfx__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2838:2: rule__Expression200xfx__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression200xfx__Group__1__Impl_in_rule__Expression200xfx__Group__15773);
            rule__Expression200xfx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression200xfx__Group__1"


    // $ANTLR start "rule__Expression200xfx__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2844:1: rule__Expression200xfx__Group__1__Impl : ( ( rule__Expression200xfx__Group_1__0 )? ) ;
    public final void rule__Expression200xfx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2848:1: ( ( ( rule__Expression200xfx__Group_1__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2849:1: ( ( rule__Expression200xfx__Group_1__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2849:1: ( ( rule__Expression200xfx__Group_1__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2850:1: ( rule__Expression200xfx__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfxAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2851:1: ( rule__Expression200xfx__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_OP200XFX) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2851:2: rule__Expression200xfx__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression200xfx__Group_1__0_in_rule__Expression200xfx__Group__1__Impl5800);
                    rule__Expression200xfx__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfxAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression200xfx__Group__1__Impl"


    // $ANTLR start "rule__Expression200xfx__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2865:1: rule__Expression200xfx__Group_1__0 : rule__Expression200xfx__Group_1__0__Impl rule__Expression200xfx__Group_1__1 ;
    public final void rule__Expression200xfx__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2869:1: ( rule__Expression200xfx__Group_1__0__Impl rule__Expression200xfx__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2870:2: rule__Expression200xfx__Group_1__0__Impl rule__Expression200xfx__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression200xfx__Group_1__0__Impl_in_rule__Expression200xfx__Group_1__05835);
            rule__Expression200xfx__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression200xfx__Group_1__1_in_rule__Expression200xfx__Group_1__05838);
            rule__Expression200xfx__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression200xfx__Group_1__0"


    // $ANTLR start "rule__Expression200xfx__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2877:1: rule__Expression200xfx__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression200xfx__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2881:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2882:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2882:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2883:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfxAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2884:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2886:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfxAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression200xfx__Group_1__0__Impl"


    // $ANTLR start "rule__Expression200xfx__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2896:1: rule__Expression200xfx__Group_1__1 : rule__Expression200xfx__Group_1__1__Impl rule__Expression200xfx__Group_1__2 ;
    public final void rule__Expression200xfx__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2900:1: ( rule__Expression200xfx__Group_1__1__Impl rule__Expression200xfx__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2901:2: rule__Expression200xfx__Group_1__1__Impl rule__Expression200xfx__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression200xfx__Group_1__1__Impl_in_rule__Expression200xfx__Group_1__15896);
            rule__Expression200xfx__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression200xfx__Group_1__2_in_rule__Expression200xfx__Group_1__15899);
            rule__Expression200xfx__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression200xfx__Group_1__1"


    // $ANTLR start "rule__Expression200xfx__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2908:1: rule__Expression200xfx__Group_1__1__Impl : ( ( rule__Expression200xfx__OpAssignment_1_1 ) ) ;
    public final void rule__Expression200xfx__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2912:1: ( ( ( rule__Expression200xfx__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2913:1: ( ( rule__Expression200xfx__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2913:1: ( ( rule__Expression200xfx__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2914:1: ( rule__Expression200xfx__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfxAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2915:1: ( rule__Expression200xfx__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2915:2: rule__Expression200xfx__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression200xfx__OpAssignment_1_1_in_rule__Expression200xfx__Group_1__1__Impl5926);
            rule__Expression200xfx__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfxAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression200xfx__Group_1__1__Impl"


    // $ANTLR start "rule__Expression200xfx__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2925:1: rule__Expression200xfx__Group_1__2 : rule__Expression200xfx__Group_1__2__Impl ;
    public final void rule__Expression200xfx__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2929:1: ( rule__Expression200xfx__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2930:2: rule__Expression200xfx__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression200xfx__Group_1__2__Impl_in_rule__Expression200xfx__Group_1__25956);
            rule__Expression200xfx__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression200xfx__Group_1__2"


    // $ANTLR start "rule__Expression200xfx__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2936:1: rule__Expression200xfx__Group_1__2__Impl : ( ( rule__Expression200xfx__RightAssignment_1_2 ) ) ;
    public final void rule__Expression200xfx__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2940:1: ( ( ( rule__Expression200xfx__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2941:1: ( ( rule__Expression200xfx__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2941:1: ( ( rule__Expression200xfx__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2942:1: ( rule__Expression200xfx__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfxAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2943:1: ( rule__Expression200xfx__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2943:2: rule__Expression200xfx__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression200xfx__RightAssignment_1_2_in_rule__Expression200xfx__Group_1__2__Impl5983);
            rule__Expression200xfx__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfxAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression200xfx__Group_1__2__Impl"


    // $ANTLR start "rule__Expression200xfy__Group__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2959:1: rule__Expression200xfy__Group__0 : rule__Expression200xfy__Group__0__Impl rule__Expression200xfy__Group__1 ;
    public final void rule__Expression200xfy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2963:1: ( rule__Expression200xfy__Group__0__Impl rule__Expression200xfy__Group__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2964:2: rule__Expression200xfy__Group__0__Impl rule__Expression200xfy__Group__1
            {
            pushFollow(FOLLOW_rule__Expression200xfy__Group__0__Impl_in_rule__Expression200xfy__Group__06019);
            rule__Expression200xfy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression200xfy__Group__1_in_rule__Expression200xfy__Group__06022);
            rule__Expression200xfy__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression200xfy__Group__0"


    // $ANTLR start "rule__Expression200xfy__Group__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2971:1: rule__Expression200xfy__Group__0__Impl : ( ruleExpression0 ) ;
    public final void rule__Expression200xfy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2975:1: ( ( ruleExpression0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2976:1: ( ruleExpression0 )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2976:1: ( ruleExpression0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2977:1: ruleExpression0
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfyAccess().getExpression0ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression0_in_rule__Expression200xfy__Group__0__Impl6049);
            ruleExpression0();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfyAccess().getExpression0ParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression200xfy__Group__0__Impl"


    // $ANTLR start "rule__Expression200xfy__Group__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2988:1: rule__Expression200xfy__Group__1 : rule__Expression200xfy__Group__1__Impl ;
    public final void rule__Expression200xfy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2992:1: ( rule__Expression200xfy__Group__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2993:2: rule__Expression200xfy__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression200xfy__Group__1__Impl_in_rule__Expression200xfy__Group__16078);
            rule__Expression200xfy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression200xfy__Group__1"


    // $ANTLR start "rule__Expression200xfy__Group__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2999:1: rule__Expression200xfy__Group__1__Impl : ( ( rule__Expression200xfy__Group_1__0 )? ) ;
    public final void rule__Expression200xfy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3003:1: ( ( ( rule__Expression200xfy__Group_1__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3004:1: ( ( rule__Expression200xfy__Group_1__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3004:1: ( ( rule__Expression200xfy__Group_1__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3005:1: ( rule__Expression200xfy__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfyAccess().getGroup_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3006:1: ( rule__Expression200xfy__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_OP200XFY) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3006:2: rule__Expression200xfy__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression200xfy__Group_1__0_in_rule__Expression200xfy__Group__1__Impl6105);
                    rule__Expression200xfy__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfyAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression200xfy__Group__1__Impl"


    // $ANTLR start "rule__Expression200xfy__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3020:1: rule__Expression200xfy__Group_1__0 : rule__Expression200xfy__Group_1__0__Impl rule__Expression200xfy__Group_1__1 ;
    public final void rule__Expression200xfy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3024:1: ( rule__Expression200xfy__Group_1__0__Impl rule__Expression200xfy__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3025:2: rule__Expression200xfy__Group_1__0__Impl rule__Expression200xfy__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression200xfy__Group_1__0__Impl_in_rule__Expression200xfy__Group_1__06140);
            rule__Expression200xfy__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression200xfy__Group_1__1_in_rule__Expression200xfy__Group_1__06143);
            rule__Expression200xfy__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression200xfy__Group_1__0"


    // $ANTLR start "rule__Expression200xfy__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3032:1: rule__Expression200xfy__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression200xfy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3036:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3037:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3037:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3038:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfyAccess().getExpressionLeftAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3039:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3041:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfyAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression200xfy__Group_1__0__Impl"


    // $ANTLR start "rule__Expression200xfy__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3051:1: rule__Expression200xfy__Group_1__1 : rule__Expression200xfy__Group_1__1__Impl rule__Expression200xfy__Group_1__2 ;
    public final void rule__Expression200xfy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3055:1: ( rule__Expression200xfy__Group_1__1__Impl rule__Expression200xfy__Group_1__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3056:2: rule__Expression200xfy__Group_1__1__Impl rule__Expression200xfy__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression200xfy__Group_1__1__Impl_in_rule__Expression200xfy__Group_1__16201);
            rule__Expression200xfy__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression200xfy__Group_1__2_in_rule__Expression200xfy__Group_1__16204);
            rule__Expression200xfy__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression200xfy__Group_1__1"


    // $ANTLR start "rule__Expression200xfy__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3063:1: rule__Expression200xfy__Group_1__1__Impl : ( ( rule__Expression200xfy__OpAssignment_1_1 ) ) ;
    public final void rule__Expression200xfy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3067:1: ( ( ( rule__Expression200xfy__OpAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3068:1: ( ( rule__Expression200xfy__OpAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3068:1: ( ( rule__Expression200xfy__OpAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3069:1: ( rule__Expression200xfy__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfyAccess().getOpAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3070:1: ( rule__Expression200xfy__OpAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3070:2: rule__Expression200xfy__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression200xfy__OpAssignment_1_1_in_rule__Expression200xfy__Group_1__1__Impl6231);
            rule__Expression200xfy__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfyAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression200xfy__Group_1__1__Impl"


    // $ANTLR start "rule__Expression200xfy__Group_1__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3080:1: rule__Expression200xfy__Group_1__2 : rule__Expression200xfy__Group_1__2__Impl ;
    public final void rule__Expression200xfy__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3084:1: ( rule__Expression200xfy__Group_1__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3085:2: rule__Expression200xfy__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression200xfy__Group_1__2__Impl_in_rule__Expression200xfy__Group_1__26261);
            rule__Expression200xfy__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression200xfy__Group_1__2"


    // $ANTLR start "rule__Expression200xfy__Group_1__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3091:1: rule__Expression200xfy__Group_1__2__Impl : ( ( rule__Expression200xfy__RightAssignment_1_2 ) ) ;
    public final void rule__Expression200xfy__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3095:1: ( ( ( rule__Expression200xfy__RightAssignment_1_2 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3096:1: ( ( rule__Expression200xfy__RightAssignment_1_2 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3096:1: ( ( rule__Expression200xfy__RightAssignment_1_2 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3097:1: ( rule__Expression200xfy__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfyAccess().getRightAssignment_1_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3098:1: ( rule__Expression200xfy__RightAssignment_1_2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3098:2: rule__Expression200xfy__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression200xfy__RightAssignment_1_2_in_rule__Expression200xfy__Group_1__2__Impl6288);
            rule__Expression200xfy__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfyAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Expression200xfy__Group_1__2__Impl"


    // $ANTLR start "rule__Expression0__Group_0__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3114:1: rule__Expression0__Group_0__0 : rule__Expression0__Group_0__0__Impl rule__Expression0__Group_0__1 ;
    public final void rule__Expression0__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3118:1: ( rule__Expression0__Group_0__0__Impl rule__Expression0__Group_0__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3119:2: rule__Expression0__Group_0__0__Impl rule__Expression0__Group_0__1
            {
            pushFollow(FOLLOW_rule__Expression0__Group_0__0__Impl_in_rule__Expression0__Group_0__06324);
            rule__Expression0__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_0__1_in_rule__Expression0__Group_0__06327);
            rule__Expression0__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_0__0"


    // $ANTLR start "rule__Expression0__Group_0__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3126:1: rule__Expression0__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression0__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3130:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3131:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3131:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3132:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getAtomExpressionAction_0_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3133:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3135:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getAtomExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_0__0__Impl"


    // $ANTLR start "rule__Expression0__Group_0__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3145:1: rule__Expression0__Group_0__1 : rule__Expression0__Group_0__1__Impl rule__Expression0__Group_0__2 ;
    public final void rule__Expression0__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3149:1: ( rule__Expression0__Group_0__1__Impl rule__Expression0__Group_0__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3150:2: rule__Expression0__Group_0__1__Impl rule__Expression0__Group_0__2
            {
            pushFollow(FOLLOW_rule__Expression0__Group_0__1__Impl_in_rule__Expression0__Group_0__16385);
            rule__Expression0__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_0__2_in_rule__Expression0__Group_0__16388);
            rule__Expression0__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_0__1"


    // $ANTLR start "rule__Expression0__Group_0__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3157:1: rule__Expression0__Group_0__1__Impl : ( ( rule__Expression0__AtomAssignment_0_1 ) ) ;
    public final void rule__Expression0__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3161:1: ( ( ( rule__Expression0__AtomAssignment_0_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3162:1: ( ( rule__Expression0__AtomAssignment_0_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3162:1: ( ( rule__Expression0__AtomAssignment_0_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3163:1: ( rule__Expression0__AtomAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getAtomAssignment_0_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3164:1: ( rule__Expression0__AtomAssignment_0_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3164:2: rule__Expression0__AtomAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Expression0__AtomAssignment_0_1_in_rule__Expression0__Group_0__1__Impl6415);
            rule__Expression0__AtomAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getAtomAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_0__1__Impl"


    // $ANTLR start "rule__Expression0__Group_0__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3174:1: rule__Expression0__Group_0__2 : rule__Expression0__Group_0__2__Impl ;
    public final void rule__Expression0__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3178:1: ( rule__Expression0__Group_0__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3179:2: rule__Expression0__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression0__Group_0__2__Impl_in_rule__Expression0__Group_0__26445);
            rule__Expression0__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_0__2"


    // $ANTLR start "rule__Expression0__Group_0__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3185:1: rule__Expression0__Group_0__2__Impl : ( ( rule__Expression0__Group_0_2__0 )? ) ;
    public final void rule__Expression0__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3189:1: ( ( ( rule__Expression0__Group_0_2__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3190:1: ( ( rule__Expression0__Group_0_2__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3190:1: ( ( rule__Expression0__Group_0_2__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3191:1: ( rule__Expression0__Group_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getGroup_0_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3192:1: ( rule__Expression0__Group_0_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3192:2: rule__Expression0__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Expression0__Group_0_2__0_in_rule__Expression0__Group_0__2__Impl6472);
                    rule__Expression0__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getGroup_0_2()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_0__2__Impl"


    // $ANTLR start "rule__Expression0__Group_0_2__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3208:1: rule__Expression0__Group_0_2__0 : rule__Expression0__Group_0_2__0__Impl rule__Expression0__Group_0_2__1 ;
    public final void rule__Expression0__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3212:1: ( rule__Expression0__Group_0_2__0__Impl rule__Expression0__Group_0_2__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3213:2: rule__Expression0__Group_0_2__0__Impl rule__Expression0__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__Expression0__Group_0_2__0__Impl_in_rule__Expression0__Group_0_2__06509);
            rule__Expression0__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_0_2__1_in_rule__Expression0__Group_0_2__06512);
            rule__Expression0__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_0_2__0"


    // $ANTLR start "rule__Expression0__Group_0_2__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3220:1: rule__Expression0__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__Expression0__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3224:1: ( ( '(' ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3225:1: ( '(' )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3225:1: ( '(' )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3226:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getLeftParenthesisKeyword_0_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Expression0__Group_0_2__0__Impl6540); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getLeftParenthesisKeyword_0_2_0()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_0_2__0__Impl"


    // $ANTLR start "rule__Expression0__Group_0_2__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3239:1: rule__Expression0__Group_0_2__1 : rule__Expression0__Group_0_2__1__Impl rule__Expression0__Group_0_2__2 ;
    public final void rule__Expression0__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3243:1: ( rule__Expression0__Group_0_2__1__Impl rule__Expression0__Group_0_2__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3244:2: rule__Expression0__Group_0_2__1__Impl rule__Expression0__Group_0_2__2
            {
            pushFollow(FOLLOW_rule__Expression0__Group_0_2__1__Impl_in_rule__Expression0__Group_0_2__16571);
            rule__Expression0__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_0_2__2_in_rule__Expression0__Group_0_2__16574);
            rule__Expression0__Group_0_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_0_2__1"


    // $ANTLR start "rule__Expression0__Group_0_2__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3251:1: rule__Expression0__Group_0_2__1__Impl : ( ( rule__Expression0__TermsAssignment_0_2_1 ) ) ;
    public final void rule__Expression0__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3255:1: ( ( ( rule__Expression0__TermsAssignment_0_2_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3256:1: ( ( rule__Expression0__TermsAssignment_0_2_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3256:1: ( ( rule__Expression0__TermsAssignment_0_2_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3257:1: ( rule__Expression0__TermsAssignment_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getTermsAssignment_0_2_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3258:1: ( rule__Expression0__TermsAssignment_0_2_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3258:2: rule__Expression0__TermsAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__Expression0__TermsAssignment_0_2_1_in_rule__Expression0__Group_0_2__1__Impl6601);
            rule__Expression0__TermsAssignment_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getTermsAssignment_0_2_1()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_0_2__1__Impl"


    // $ANTLR start "rule__Expression0__Group_0_2__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3268:1: rule__Expression0__Group_0_2__2 : rule__Expression0__Group_0_2__2__Impl ;
    public final void rule__Expression0__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3272:1: ( rule__Expression0__Group_0_2__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3273:2: rule__Expression0__Group_0_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression0__Group_0_2__2__Impl_in_rule__Expression0__Group_0_2__26631);
            rule__Expression0__Group_0_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_0_2__2"


    // $ANTLR start "rule__Expression0__Group_0_2__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3279:1: rule__Expression0__Group_0_2__2__Impl : ( ')' ) ;
    public final void rule__Expression0__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3283:1: ( ( ')' ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3284:1: ( ')' )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3284:1: ( ')' )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3285:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getRightParenthesisKeyword_0_2_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Expression0__Group_0_2__2__Impl6659); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getRightParenthesisKeyword_0_2_2()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_0_2__2__Impl"


    // $ANTLR start "rule__Expression0__Group_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3304:1: rule__Expression0__Group_1__0 : rule__Expression0__Group_1__0__Impl rule__Expression0__Group_1__1 ;
    public final void rule__Expression0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3308:1: ( rule__Expression0__Group_1__0__Impl rule__Expression0__Group_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3309:2: rule__Expression0__Group_1__0__Impl rule__Expression0__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression0__Group_1__0__Impl_in_rule__Expression0__Group_1__06696);
            rule__Expression0__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_1__1_in_rule__Expression0__Group_1__06699);
            rule__Expression0__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_1__0"


    // $ANTLR start "rule__Expression0__Group_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3316:1: rule__Expression0__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3320:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3321:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3321:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3322:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getVariableExpressionAction_1_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3323:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3325:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getVariableExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_1__0__Impl"


    // $ANTLR start "rule__Expression0__Group_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3335:1: rule__Expression0__Group_1__1 : rule__Expression0__Group_1__1__Impl ;
    public final void rule__Expression0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3339:1: ( rule__Expression0__Group_1__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3340:2: rule__Expression0__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression0__Group_1__1__Impl_in_rule__Expression0__Group_1__16757);
            rule__Expression0__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_1__1"


    // $ANTLR start "rule__Expression0__Group_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3346:1: rule__Expression0__Group_1__1__Impl : ( ( rule__Expression0__NameAssignment_1_1 ) ) ;
    public final void rule__Expression0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3350:1: ( ( ( rule__Expression0__NameAssignment_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3351:1: ( ( rule__Expression0__NameAssignment_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3351:1: ( ( rule__Expression0__NameAssignment_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3352:1: ( rule__Expression0__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getNameAssignment_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3353:1: ( rule__Expression0__NameAssignment_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3353:2: rule__Expression0__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression0__NameAssignment_1_1_in_rule__Expression0__Group_1__1__Impl6784);
            rule__Expression0__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getNameAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_1__1__Impl"


    // $ANTLR start "rule__Expression0__Group_2__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3367:1: rule__Expression0__Group_2__0 : rule__Expression0__Group_2__0__Impl rule__Expression0__Group_2__1 ;
    public final void rule__Expression0__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3371:1: ( rule__Expression0__Group_2__0__Impl rule__Expression0__Group_2__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3372:2: rule__Expression0__Group_2__0__Impl rule__Expression0__Group_2__1
            {
            pushFollow(FOLLOW_rule__Expression0__Group_2__0__Impl_in_rule__Expression0__Group_2__06818);
            rule__Expression0__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_2__1_in_rule__Expression0__Group_2__06821);
            rule__Expression0__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_2__0"


    // $ANTLR start "rule__Expression0__Group_2__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3379:1: rule__Expression0__Group_2__0__Impl : ( () ) ;
    public final void rule__Expression0__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3383:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3384:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3384:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3385:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getStringExpressionAction_2_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3386:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3388:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getStringExpressionAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_2__0__Impl"


    // $ANTLR start "rule__Expression0__Group_2__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3398:1: rule__Expression0__Group_2__1 : rule__Expression0__Group_2__1__Impl ;
    public final void rule__Expression0__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3402:1: ( rule__Expression0__Group_2__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3403:2: rule__Expression0__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression0__Group_2__1__Impl_in_rule__Expression0__Group_2__16879);
            rule__Expression0__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_2__1"


    // $ANTLR start "rule__Expression0__Group_2__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3409:1: rule__Expression0__Group_2__1__Impl : ( ( rule__Expression0__ValueAssignment_2_1 ) ) ;
    public final void rule__Expression0__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3413:1: ( ( ( rule__Expression0__ValueAssignment_2_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3414:1: ( ( rule__Expression0__ValueAssignment_2_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3414:1: ( ( rule__Expression0__ValueAssignment_2_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3415:1: ( rule__Expression0__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getValueAssignment_2_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3416:1: ( rule__Expression0__ValueAssignment_2_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3416:2: rule__Expression0__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Expression0__ValueAssignment_2_1_in_rule__Expression0__Group_2__1__Impl6906);
            rule__Expression0__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getValueAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_2__1__Impl"


    // $ANTLR start "rule__Expression0__Group_3__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3430:1: rule__Expression0__Group_3__0 : rule__Expression0__Group_3__0__Impl rule__Expression0__Group_3__1 ;
    public final void rule__Expression0__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3434:1: ( rule__Expression0__Group_3__0__Impl rule__Expression0__Group_3__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3435:2: rule__Expression0__Group_3__0__Impl rule__Expression0__Group_3__1
            {
            pushFollow(FOLLOW_rule__Expression0__Group_3__0__Impl_in_rule__Expression0__Group_3__06940);
            rule__Expression0__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_3__1_in_rule__Expression0__Group_3__06943);
            rule__Expression0__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_3__0"


    // $ANTLR start "rule__Expression0__Group_3__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3442:1: rule__Expression0__Group_3__0__Impl : ( () ) ;
    public final void rule__Expression0__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3446:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3447:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3447:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3448:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getNumberExpressionAction_3_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3449:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3451:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getNumberExpressionAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_3__0__Impl"


    // $ANTLR start "rule__Expression0__Group_3__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3461:1: rule__Expression0__Group_3__1 : rule__Expression0__Group_3__1__Impl ;
    public final void rule__Expression0__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3465:1: ( rule__Expression0__Group_3__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3466:2: rule__Expression0__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression0__Group_3__1__Impl_in_rule__Expression0__Group_3__17001);
            rule__Expression0__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_3__1"


    // $ANTLR start "rule__Expression0__Group_3__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3472:1: rule__Expression0__Group_3__1__Impl : ( ( rule__Expression0__ValueAssignment_3_1 ) ) ;
    public final void rule__Expression0__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3476:1: ( ( ( rule__Expression0__ValueAssignment_3_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3477:1: ( ( rule__Expression0__ValueAssignment_3_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3477:1: ( ( rule__Expression0__ValueAssignment_3_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3478:1: ( rule__Expression0__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getValueAssignment_3_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3479:1: ( rule__Expression0__ValueAssignment_3_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3479:2: rule__Expression0__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Expression0__ValueAssignment_3_1_in_rule__Expression0__Group_3__1__Impl7028);
            rule__Expression0__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getValueAssignment_3_1()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_3__1__Impl"


    // $ANTLR start "rule__Expression0__Group_4__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3493:1: rule__Expression0__Group_4__0 : rule__Expression0__Group_4__0__Impl rule__Expression0__Group_4__1 ;
    public final void rule__Expression0__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3497:1: ( rule__Expression0__Group_4__0__Impl rule__Expression0__Group_4__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3498:2: rule__Expression0__Group_4__0__Impl rule__Expression0__Group_4__1
            {
            pushFollow(FOLLOW_rule__Expression0__Group_4__0__Impl_in_rule__Expression0__Group_4__07062);
            rule__Expression0__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_4__1_in_rule__Expression0__Group_4__07065);
            rule__Expression0__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_4__0"


    // $ANTLR start "rule__Expression0__Group_4__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3505:1: rule__Expression0__Group_4__0__Impl : ( () ) ;
    public final void rule__Expression0__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3509:1: ( ( () ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3510:1: ( () )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3510:1: ( () )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3511:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getListExpressionAction_4_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3512:1: ()
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3514:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getListExpressionAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_4__0__Impl"


    // $ANTLR start "rule__Expression0__Group_4__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3524:1: rule__Expression0__Group_4__1 : rule__Expression0__Group_4__1__Impl rule__Expression0__Group_4__2 ;
    public final void rule__Expression0__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3528:1: ( rule__Expression0__Group_4__1__Impl rule__Expression0__Group_4__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3529:2: rule__Expression0__Group_4__1__Impl rule__Expression0__Group_4__2
            {
            pushFollow(FOLLOW_rule__Expression0__Group_4__1__Impl_in_rule__Expression0__Group_4__17123);
            rule__Expression0__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_4__2_in_rule__Expression0__Group_4__17126);
            rule__Expression0__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_4__1"


    // $ANTLR start "rule__Expression0__Group_4__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3536:1: rule__Expression0__Group_4__1__Impl : ( '[' ) ;
    public final void rule__Expression0__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3540:1: ( ( '[' ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3541:1: ( '[' )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3541:1: ( '[' )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3542:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getLeftSquareBracketKeyword_4_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Expression0__Group_4__1__Impl7154); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getLeftSquareBracketKeyword_4_1()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_4__1__Impl"


    // $ANTLR start "rule__Expression0__Group_4__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3555:1: rule__Expression0__Group_4__2 : rule__Expression0__Group_4__2__Impl rule__Expression0__Group_4__3 ;
    public final void rule__Expression0__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3559:1: ( rule__Expression0__Group_4__2__Impl rule__Expression0__Group_4__3 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3560:2: rule__Expression0__Group_4__2__Impl rule__Expression0__Group_4__3
            {
            pushFollow(FOLLOW_rule__Expression0__Group_4__2__Impl_in_rule__Expression0__Group_4__27185);
            rule__Expression0__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_4__3_in_rule__Expression0__Group_4__27188);
            rule__Expression0__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_4__2"


    // $ANTLR start "rule__Expression0__Group_4__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3567:1: rule__Expression0__Group_4__2__Impl : ( ( rule__Expression0__Group_4_2__0 )? ) ;
    public final void rule__Expression0__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3571:1: ( ( ( rule__Expression0__Group_4_2__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3572:1: ( ( rule__Expression0__Group_4_2__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3572:1: ( ( rule__Expression0__Group_4_2__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3573:1: ( rule__Expression0__Group_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getGroup_4_2()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3574:1: ( rule__Expression0__Group_4_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ATOM && LA24_0<=RULE_OP200XFY)||(LA24_0>=RULE_INT && LA24_0<=RULE_STRING)||(LA24_0>=27 && LA24_0<=30)||LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3574:2: rule__Expression0__Group_4_2__0
                    {
                    pushFollow(FOLLOW_rule__Expression0__Group_4_2__0_in_rule__Expression0__Group_4__2__Impl7215);
                    rule__Expression0__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getGroup_4_2()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_4__2__Impl"


    // $ANTLR start "rule__Expression0__Group_4__3"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3584:1: rule__Expression0__Group_4__3 : rule__Expression0__Group_4__3__Impl ;
    public final void rule__Expression0__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3588:1: ( rule__Expression0__Group_4__3__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3589:2: rule__Expression0__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Expression0__Group_4__3__Impl_in_rule__Expression0__Group_4__37246);
            rule__Expression0__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_4__3"


    // $ANTLR start "rule__Expression0__Group_4__3__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3595:1: rule__Expression0__Group_4__3__Impl : ( ']' ) ;
    public final void rule__Expression0__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3599:1: ( ( ']' ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3600:1: ( ']' )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3600:1: ( ']' )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3601:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getRightSquareBracketKeyword_4_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__Expression0__Group_4__3__Impl7274); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getRightSquareBracketKeyword_4_3()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_4__3__Impl"


    // $ANTLR start "rule__Expression0__Group_4_2__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3622:1: rule__Expression0__Group_4_2__0 : rule__Expression0__Group_4_2__0__Impl rule__Expression0__Group_4_2__1 ;
    public final void rule__Expression0__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3626:1: ( rule__Expression0__Group_4_2__0__Impl rule__Expression0__Group_4_2__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3627:2: rule__Expression0__Group_4_2__0__Impl rule__Expression0__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Expression0__Group_4_2__0__Impl_in_rule__Expression0__Group_4_2__07313);
            rule__Expression0__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_4_2__1_in_rule__Expression0__Group_4_2__07316);
            rule__Expression0__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_4_2__0"


    // $ANTLR start "rule__Expression0__Group_4_2__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3634:1: rule__Expression0__Group_4_2__0__Impl : ( ( rule__Expression0__HeadAssignment_4_2_0 ) ) ;
    public final void rule__Expression0__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3638:1: ( ( ( rule__Expression0__HeadAssignment_4_2_0 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3639:1: ( ( rule__Expression0__HeadAssignment_4_2_0 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3639:1: ( ( rule__Expression0__HeadAssignment_4_2_0 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3640:1: ( rule__Expression0__HeadAssignment_4_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getHeadAssignment_4_2_0()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3641:1: ( rule__Expression0__HeadAssignment_4_2_0 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3641:2: rule__Expression0__HeadAssignment_4_2_0
            {
            pushFollow(FOLLOW_rule__Expression0__HeadAssignment_4_2_0_in_rule__Expression0__Group_4_2__0__Impl7343);
            rule__Expression0__HeadAssignment_4_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getHeadAssignment_4_2_0()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_4_2__0__Impl"


    // $ANTLR start "rule__Expression0__Group_4_2__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3651:1: rule__Expression0__Group_4_2__1 : rule__Expression0__Group_4_2__1__Impl ;
    public final void rule__Expression0__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3655:1: ( rule__Expression0__Group_4_2__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3656:2: rule__Expression0__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression0__Group_4_2__1__Impl_in_rule__Expression0__Group_4_2__17373);
            rule__Expression0__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_4_2__1"


    // $ANTLR start "rule__Expression0__Group_4_2__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3662:1: rule__Expression0__Group_4_2__1__Impl : ( ( rule__Expression0__Group_4_2_1__0 )? ) ;
    public final void rule__Expression0__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3666:1: ( ( ( rule__Expression0__Group_4_2_1__0 )? ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3667:1: ( ( rule__Expression0__Group_4_2_1__0 )? )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3667:1: ( ( rule__Expression0__Group_4_2_1__0 )? )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3668:1: ( rule__Expression0__Group_4_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getGroup_4_2_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3669:1: ( rule__Expression0__Group_4_2_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3669:2: rule__Expression0__Group_4_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression0__Group_4_2_1__0_in_rule__Expression0__Group_4_2__1__Impl7400);
                    rule__Expression0__Group_4_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getGroup_4_2_1()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_4_2__1__Impl"


    // $ANTLR start "rule__Expression0__Group_4_2_1__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3683:1: rule__Expression0__Group_4_2_1__0 : rule__Expression0__Group_4_2_1__0__Impl rule__Expression0__Group_4_2_1__1 ;
    public final void rule__Expression0__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3687:1: ( rule__Expression0__Group_4_2_1__0__Impl rule__Expression0__Group_4_2_1__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3688:2: rule__Expression0__Group_4_2_1__0__Impl rule__Expression0__Group_4_2_1__1
            {
            pushFollow(FOLLOW_rule__Expression0__Group_4_2_1__0__Impl_in_rule__Expression0__Group_4_2_1__07435);
            rule__Expression0__Group_4_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_4_2_1__1_in_rule__Expression0__Group_4_2_1__07438);
            rule__Expression0__Group_4_2_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_4_2_1__0"


    // $ANTLR start "rule__Expression0__Group_4_2_1__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3695:1: rule__Expression0__Group_4_2_1__0__Impl : ( '|' ) ;
    public final void rule__Expression0__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3699:1: ( ( '|' ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3700:1: ( '|' )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3700:1: ( '|' )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3701:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getVerticalLineKeyword_4_2_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Expression0__Group_4_2_1__0__Impl7466); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getVerticalLineKeyword_4_2_1_0()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_4_2_1__0__Impl"


    // $ANTLR start "rule__Expression0__Group_4_2_1__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3714:1: rule__Expression0__Group_4_2_1__1 : rule__Expression0__Group_4_2_1__1__Impl ;
    public final void rule__Expression0__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3718:1: ( rule__Expression0__Group_4_2_1__1__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3719:2: rule__Expression0__Group_4_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression0__Group_4_2_1__1__Impl_in_rule__Expression0__Group_4_2_1__17497);
            rule__Expression0__Group_4_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_4_2_1__1"


    // $ANTLR start "rule__Expression0__Group_4_2_1__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3725:1: rule__Expression0__Group_4_2_1__1__Impl : ( ( rule__Expression0__TailAssignment_4_2_1_1 ) ) ;
    public final void rule__Expression0__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3729:1: ( ( ( rule__Expression0__TailAssignment_4_2_1_1 ) ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3730:1: ( ( rule__Expression0__TailAssignment_4_2_1_1 ) )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3730:1: ( ( rule__Expression0__TailAssignment_4_2_1_1 ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3731:1: ( rule__Expression0__TailAssignment_4_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getTailAssignment_4_2_1_1()); 
            }
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3732:1: ( rule__Expression0__TailAssignment_4_2_1_1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3732:2: rule__Expression0__TailAssignment_4_2_1_1
            {
            pushFollow(FOLLOW_rule__Expression0__TailAssignment_4_2_1_1_in_rule__Expression0__Group_4_2_1__1__Impl7524);
            rule__Expression0__TailAssignment_4_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getTailAssignment_4_2_1_1()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_4_2_1__1__Impl"


    // $ANTLR start "rule__Expression0__Group_5__0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3746:1: rule__Expression0__Group_5__0 : rule__Expression0__Group_5__0__Impl rule__Expression0__Group_5__1 ;
    public final void rule__Expression0__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3750:1: ( rule__Expression0__Group_5__0__Impl rule__Expression0__Group_5__1 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3751:2: rule__Expression0__Group_5__0__Impl rule__Expression0__Group_5__1
            {
            pushFollow(FOLLOW_rule__Expression0__Group_5__0__Impl_in_rule__Expression0__Group_5__07558);
            rule__Expression0__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_5__1_in_rule__Expression0__Group_5__07561);
            rule__Expression0__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_5__0"


    // $ANTLR start "rule__Expression0__Group_5__0__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3758:1: rule__Expression0__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Expression0__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3762:1: ( ( '(' ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3763:1: ( '(' )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3763:1: ( '(' )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3764:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Expression0__Group_5__0__Impl7589); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getLeftParenthesisKeyword_5_0()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_5__0__Impl"


    // $ANTLR start "rule__Expression0__Group_5__1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3777:1: rule__Expression0__Group_5__1 : rule__Expression0__Group_5__1__Impl rule__Expression0__Group_5__2 ;
    public final void rule__Expression0__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3781:1: ( rule__Expression0__Group_5__1__Impl rule__Expression0__Group_5__2 )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3782:2: rule__Expression0__Group_5__1__Impl rule__Expression0__Group_5__2
            {
            pushFollow(FOLLOW_rule__Expression0__Group_5__1__Impl_in_rule__Expression0__Group_5__17620);
            rule__Expression0__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression0__Group_5__2_in_rule__Expression0__Group_5__17623);
            rule__Expression0__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_5__1"


    // $ANTLR start "rule__Expression0__Group_5__1__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3789:1: rule__Expression0__Group_5__1__Impl : ( ruleExpressionInfinity ) ;
    public final void rule__Expression0__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3793:1: ( ( ruleExpressionInfinity ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3794:1: ( ruleExpressionInfinity )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3794:1: ( ruleExpressionInfinity )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3795:1: ruleExpressionInfinity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getExpressionInfinityParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleExpressionInfinity_in_rule__Expression0__Group_5__1__Impl7650);
            ruleExpressionInfinity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getExpressionInfinityParserRuleCall_5_1()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_5__1__Impl"


    // $ANTLR start "rule__Expression0__Group_5__2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3806:1: rule__Expression0__Group_5__2 : rule__Expression0__Group_5__2__Impl ;
    public final void rule__Expression0__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3810:1: ( rule__Expression0__Group_5__2__Impl )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3811:2: rule__Expression0__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression0__Group_5__2__Impl_in_rule__Expression0__Group_5__27679);
            rule__Expression0__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expression0__Group_5__2"


    // $ANTLR start "rule__Expression0__Group_5__2__Impl"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3817:1: rule__Expression0__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Expression0__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3821:1: ( ( ')' ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3822:1: ( ')' )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3822:1: ( ')' )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3823:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getRightParenthesisKeyword_5_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Expression0__Group_5__2__Impl7707); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getRightParenthesisKeyword_5_2()); 
            }

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
    // $ANTLR end "rule__Expression0__Group_5__2__Impl"


    // $ANTLR start "rule__Model__ExpsAssignment_0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3843:1: rule__Model__ExpsAssignment_0 : ( ruleExpressionInfinity ) ;
    public final void rule__Model__ExpsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3847:1: ( ( ruleExpressionInfinity ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3848:1: ( ruleExpressionInfinity )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3848:1: ( ruleExpressionInfinity )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3849:1: ruleExpressionInfinity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getExpsExpressionInfinityParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpressionInfinity_in_rule__Model__ExpsAssignment_07749);
            ruleExpressionInfinity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getExpsExpressionInfinityParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Model__ExpsAssignment_0"


    // $ANTLR start "rule__Expression1200xfx__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3858:1: rule__Expression1200xfx__OpAssignment_1_1 : ( RULE_OP1200XFX ) ;
    public final void rule__Expression1200xfx__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3862:1: ( ( RULE_OP1200XFX ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3863:1: ( RULE_OP1200XFX )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3863:1: ( RULE_OP1200XFX )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3864:1: RULE_OP1200XFX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200xfxAccess().getOpOP1200XFXTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP1200XFX,FOLLOW_RULE_OP1200XFX_in_rule__Expression1200xfx__OpAssignment_1_17780); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200xfxAccess().getOpOP1200XFXTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression1200xfx__OpAssignment_1_1"


    // $ANTLR start "rule__Expression1200xfx__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3873:1: rule__Expression1200xfx__RightAssignment_1_2 : ( ruleExpression1200fx ) ;
    public final void rule__Expression1200xfx__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3877:1: ( ( ruleExpression1200fx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3878:1: ( ruleExpression1200fx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3878:1: ( ruleExpression1200fx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3879:1: ruleExpression1200fx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200xfxAccess().getRightExpression1200fxParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression1200fx_in_rule__Expression1200xfx__RightAssignment_1_27811);
            ruleExpression1200fx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200xfxAccess().getRightExpression1200fxParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression1200xfx__RightAssignment_1_2"


    // $ANTLR start "rule__Expression1200fx__OpAssignment_0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3888:1: rule__Expression1200fx__OpAssignment_0 : ( RULE_OP1200FX ) ;
    public final void rule__Expression1200fx__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3892:1: ( ( RULE_OP1200FX ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3893:1: ( RULE_OP1200FX )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3893:1: ( RULE_OP1200FX )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3894:1: RULE_OP1200FX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200fxAccess().getOpOP1200FXTerminalRuleCall_0_0()); 
            }
            match(input,RULE_OP1200FX,FOLLOW_RULE_OP1200FX_in_rule__Expression1200fx__OpAssignment_07842); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200fxAccess().getOpOP1200FXTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Expression1200fx__OpAssignment_0"


    // $ANTLR start "rule__Expression1200fx__RightAssignment_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3903:1: rule__Expression1200fx__RightAssignment_1 : ( ruleExpression1150fx ) ;
    public final void rule__Expression1200fx__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3907:1: ( ( ruleExpression1150fx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3908:1: ( ruleExpression1150fx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3908:1: ( ruleExpression1150fx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3909:1: ruleExpression1150fx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1200fxAccess().getRightExpression1150fxParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression1150fx_in_rule__Expression1200fx__RightAssignment_17873);
            ruleExpression1150fx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1200fxAccess().getRightExpression1150fxParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Expression1200fx__RightAssignment_1"


    // $ANTLR start "rule__Expression1150fx__OpAssignment_0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3918:1: rule__Expression1150fx__OpAssignment_0 : ( RULE_OP1150FX ) ;
    public final void rule__Expression1150fx__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3922:1: ( ( RULE_OP1150FX ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3923:1: ( RULE_OP1150FX )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3923:1: ( RULE_OP1150FX )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3924:1: RULE_OP1150FX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1150fxAccess().getOpOP1150FXTerminalRuleCall_0_0()); 
            }
            match(input,RULE_OP1150FX,FOLLOW_RULE_OP1150FX_in_rule__Expression1150fx__OpAssignment_07904); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1150fxAccess().getOpOP1150FXTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Expression1150fx__OpAssignment_0"


    // $ANTLR start "rule__Expression1150fx__RightAssignment_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3933:1: rule__Expression1150fx__RightAssignment_1 : ( ruleExpression1100xfy ) ;
    public final void rule__Expression1150fx__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3937:1: ( ( ruleExpression1100xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3938:1: ( ruleExpression1100xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3938:1: ( ruleExpression1100xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3939:1: ruleExpression1100xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1150fxAccess().getRightExpression1100xfyParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression1100xfy_in_rule__Expression1150fx__RightAssignment_17935);
            ruleExpression1100xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1150fxAccess().getRightExpression1100xfyParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Expression1150fx__RightAssignment_1"


    // $ANTLR start "rule__Expression1100xfy__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3948:1: rule__Expression1100xfy__OpAssignment_1_1 : ( RULE_OP1100XFY ) ;
    public final void rule__Expression1100xfy__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3952:1: ( ( RULE_OP1100XFY ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3953:1: ( RULE_OP1100XFY )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3953:1: ( RULE_OP1100XFY )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3954:1: RULE_OP1100XFY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1100xfyAccess().getOpOP1100XFYTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP1100XFY,FOLLOW_RULE_OP1100XFY_in_rule__Expression1100xfy__OpAssignment_1_17966); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1100xfyAccess().getOpOP1100XFYTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression1100xfy__OpAssignment_1_1"


    // $ANTLR start "rule__Expression1100xfy__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3963:1: rule__Expression1100xfy__RightAssignment_1_2 : ( ruleExpression1100xfy ) ;
    public final void rule__Expression1100xfy__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3967:1: ( ( ruleExpression1100xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3968:1: ( ruleExpression1100xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3968:1: ( ruleExpression1100xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3969:1: ruleExpression1100xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1100xfyAccess().getRightExpression1100xfyParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression1100xfy_in_rule__Expression1100xfy__RightAssignment_1_27997);
            ruleExpression1100xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1100xfyAccess().getRightExpression1100xfyParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression1100xfy__RightAssignment_1_2"


    // $ANTLR start "rule__Expression1050xfy__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3978:1: rule__Expression1050xfy__OpAssignment_1_1 : ( RULE_OP1050XFY ) ;
    public final void rule__Expression1050xfy__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3982:1: ( ( RULE_OP1050XFY ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3983:1: ( RULE_OP1050XFY )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3983:1: ( RULE_OP1050XFY )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3984:1: RULE_OP1050XFY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1050xfyAccess().getOpOP1050XFYTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP1050XFY,FOLLOW_RULE_OP1050XFY_in_rule__Expression1050xfy__OpAssignment_1_18028); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1050xfyAccess().getOpOP1050XFYTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression1050xfy__OpAssignment_1_1"


    // $ANTLR start "rule__Expression1050xfy__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3993:1: rule__Expression1050xfy__RightAssignment_1_2 : ( ruleExpression1050xfy ) ;
    public final void rule__Expression1050xfy__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3997:1: ( ( ruleExpression1050xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3998:1: ( ruleExpression1050xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3998:1: ( ruleExpression1050xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:3999:1: ruleExpression1050xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1050xfyAccess().getRightExpression1050xfyParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression1050xfy_in_rule__Expression1050xfy__RightAssignment_1_28059);
            ruleExpression1050xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1050xfyAccess().getRightExpression1050xfyParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression1050xfy__RightAssignment_1_2"


    // $ANTLR start "rule__Expression1000xfy__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4008:1: rule__Expression1000xfy__OpAssignment_1_1 : ( RULE_OP1000XFY ) ;
    public final void rule__Expression1000xfy__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4012:1: ( ( RULE_OP1000XFY ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4013:1: ( RULE_OP1000XFY )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4013:1: ( RULE_OP1000XFY )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4014:1: RULE_OP1000XFY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1000xfyAccess().getOpOP1000XFYTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP1000XFY,FOLLOW_RULE_OP1000XFY_in_rule__Expression1000xfy__OpAssignment_1_18090); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1000xfyAccess().getOpOP1000XFYTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression1000xfy__OpAssignment_1_1"


    // $ANTLR start "rule__Expression1000xfy__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4023:1: rule__Expression1000xfy__RightAssignment_1_2 : ( ruleExpression1000xfy ) ;
    public final void rule__Expression1000xfy__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4027:1: ( ( ruleExpression1000xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4028:1: ( ruleExpression1000xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4028:1: ( ruleExpression1000xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4029:1: ruleExpression1000xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression1000xfyAccess().getRightExpression1000xfyParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression1000xfy_in_rule__Expression1000xfy__RightAssignment_1_28121);
            ruleExpression1000xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression1000xfyAccess().getRightExpression1000xfyParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression1000xfy__RightAssignment_1_2"


    // $ANTLR start "rule__Expression954xfy__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4038:1: rule__Expression954xfy__OpAssignment_1_1 : ( RULE_OP954XFY ) ;
    public final void rule__Expression954xfy__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4042:1: ( ( RULE_OP954XFY ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4043:1: ( RULE_OP954XFY )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4043:1: ( RULE_OP954XFY )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4044:1: RULE_OP954XFY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression954xfyAccess().getOpOP954XFYTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP954XFY,FOLLOW_RULE_OP954XFY_in_rule__Expression954xfy__OpAssignment_1_18152); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression954xfyAccess().getOpOP954XFYTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression954xfy__OpAssignment_1_1"


    // $ANTLR start "rule__Expression954xfy__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4053:1: rule__Expression954xfy__RightAssignment_1_2 : ( ruleExpression954xfy ) ;
    public final void rule__Expression954xfy__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4057:1: ( ( ruleExpression954xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4058:1: ( ruleExpression954xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4058:1: ( ruleExpression954xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4059:1: ruleExpression954xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression954xfyAccess().getRightExpression954xfyParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression954xfy_in_rule__Expression954xfy__RightAssignment_1_28183);
            ruleExpression954xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression954xfyAccess().getRightExpression954xfyParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression954xfy__RightAssignment_1_2"


    // $ANTLR start "rule__Expression900fy__OpAssignment_0_0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4068:1: rule__Expression900fy__OpAssignment_0_0 : ( RULE_OP900FY ) ;
    public final void rule__Expression900fy__OpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4072:1: ( ( RULE_OP900FY ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4073:1: ( RULE_OP900FY )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4073:1: ( RULE_OP900FY )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4074:1: RULE_OP900FY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fyAccess().getOpOP900FYTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_OP900FY,FOLLOW_RULE_OP900FY_in_rule__Expression900fy__OpAssignment_0_08214); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fyAccess().getOpOP900FYTerminalRuleCall_0_0_0()); 
            }

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
    // $ANTLR end "rule__Expression900fy__OpAssignment_0_0"


    // $ANTLR start "rule__Expression900fy__RightAssignment_0_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4083:1: rule__Expression900fy__RightAssignment_0_1 : ( ruleExpression900fy ) ;
    public final void rule__Expression900fy__RightAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4087:1: ( ( ruleExpression900fy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4088:1: ( ruleExpression900fy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4088:1: ( ruleExpression900fy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4089:1: ruleExpression900fy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fyAccess().getRightExpression900fyParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression900fy_in_rule__Expression900fy__RightAssignment_0_18245);
            ruleExpression900fy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fyAccess().getRightExpression900fyParserRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__Expression900fy__RightAssignment_0_1"


    // $ANTLR start "rule__Expression900fy__RightAssignment_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4098:1: rule__Expression900fy__RightAssignment_1 : ( ruleExpression900fx ) ;
    public final void rule__Expression900fy__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4102:1: ( ( ruleExpression900fx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4103:1: ( ruleExpression900fx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4103:1: ( ruleExpression900fx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4104:1: ruleExpression900fx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fyAccess().getRightExpression900fxParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression900fx_in_rule__Expression900fy__RightAssignment_18276);
            ruleExpression900fx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fyAccess().getRightExpression900fxParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Expression900fy__RightAssignment_1"


    // $ANTLR start "rule__Expression900fx__OpAssignment_0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4113:1: rule__Expression900fx__OpAssignment_0 : ( RULE_OP900FX ) ;
    public final void rule__Expression900fx__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4117:1: ( ( RULE_OP900FX ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4118:1: ( RULE_OP900FX )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4118:1: ( RULE_OP900FX )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4119:1: RULE_OP900FX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fxAccess().getOpOP900FXTerminalRuleCall_0_0()); 
            }
            match(input,RULE_OP900FX,FOLLOW_RULE_OP900FX_in_rule__Expression900fx__OpAssignment_08307); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fxAccess().getOpOP900FXTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Expression900fx__OpAssignment_0"


    // $ANTLR start "rule__Expression900fx__RightAssignment_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4128:1: rule__Expression900fx__RightAssignment_1 : ( ruleExpression700xfx ) ;
    public final void rule__Expression900fx__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4132:1: ( ( ruleExpression700xfx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4133:1: ( ruleExpression700xfx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4133:1: ( ruleExpression700xfx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4134:1: ruleExpression700xfx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression900fxAccess().getRightExpression700xfxParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression700xfx_in_rule__Expression900fx__RightAssignment_18338);
            ruleExpression700xfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression900fxAccess().getRightExpression700xfxParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Expression900fx__RightAssignment_1"


    // $ANTLR start "rule__Expression700xfx__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4143:1: rule__Expression700xfx__OpAssignment_1_1 : ( RULE_OP700XFX ) ;
    public final void rule__Expression700xfx__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4147:1: ( ( RULE_OP700XFX ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4148:1: ( RULE_OP700XFX )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4148:1: ( RULE_OP700XFX )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4149:1: RULE_OP700XFX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression700xfxAccess().getOpOP700XFXTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP700XFX,FOLLOW_RULE_OP700XFX_in_rule__Expression700xfx__OpAssignment_1_18369); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression700xfxAccess().getOpOP700XFXTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression700xfx__OpAssignment_1_1"


    // $ANTLR start "rule__Expression700xfx__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4158:1: rule__Expression700xfx__RightAssignment_1_2 : ( ruleExpression600xfy ) ;
    public final void rule__Expression700xfx__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4162:1: ( ( ruleExpression600xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4163:1: ( ruleExpression600xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4163:1: ( ruleExpression600xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4164:1: ruleExpression600xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression700xfxAccess().getRightExpression600xfyParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression600xfy_in_rule__Expression700xfx__RightAssignment_1_28400);
            ruleExpression600xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression700xfxAccess().getRightExpression600xfyParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression700xfx__RightAssignment_1_2"


    // $ANTLR start "rule__Expression600xfy__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4173:1: rule__Expression600xfy__OpAssignment_1_1 : ( RULE_OP600XFY ) ;
    public final void rule__Expression600xfy__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4177:1: ( ( RULE_OP600XFY ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4178:1: ( RULE_OP600XFY )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4178:1: ( RULE_OP600XFY )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4179:1: RULE_OP600XFY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression600xfyAccess().getOpOP600XFYTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP600XFY,FOLLOW_RULE_OP600XFY_in_rule__Expression600xfy__OpAssignment_1_18431); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression600xfyAccess().getOpOP600XFYTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression600xfy__OpAssignment_1_1"


    // $ANTLR start "rule__Expression600xfy__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4188:1: rule__Expression600xfy__RightAssignment_1_2 : ( ruleExpression600xfy ) ;
    public final void rule__Expression600xfy__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4192:1: ( ( ruleExpression600xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4193:1: ( ruleExpression600xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4193:1: ( ruleExpression600xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4194:1: ruleExpression600xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression600xfyAccess().getRightExpression600xfyParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression600xfy_in_rule__Expression600xfy__RightAssignment_1_28462);
            ruleExpression600xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression600xfyAccess().getRightExpression600xfyParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression600xfy__RightAssignment_1_2"


    // $ANTLR start "rule__Expression500yfx__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4203:1: rule__Expression500yfx__OpAssignment_1_1 : ( RULE_OP500YFX ) ;
    public final void rule__Expression500yfx__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4207:1: ( ( RULE_OP500YFX ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4208:1: ( RULE_OP500YFX )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4208:1: ( RULE_OP500YFX )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4209:1: RULE_OP500YFX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500yfxAccess().getOpOP500YFXTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP500YFX,FOLLOW_RULE_OP500YFX_in_rule__Expression500yfx__OpAssignment_1_18493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500yfxAccess().getOpOP500YFXTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression500yfx__OpAssignment_1_1"


    // $ANTLR start "rule__Expression500yfx__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4218:1: rule__Expression500yfx__RightAssignment_1_2 : ( ruleExpression500fx ) ;
    public final void rule__Expression500yfx__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4222:1: ( ( ruleExpression500fx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4223:1: ( ruleExpression500fx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4223:1: ( ruleExpression500fx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4224:1: ruleExpression500fx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500yfxAccess().getRightExpression500fxParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression500fx_in_rule__Expression500yfx__RightAssignment_1_28524);
            ruleExpression500fx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500yfxAccess().getRightExpression500fxParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression500yfx__RightAssignment_1_2"


    // $ANTLR start "rule__Expression500fx__OpAssignment_0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4233:1: rule__Expression500fx__OpAssignment_0 : ( RULE_OP500FX ) ;
    public final void rule__Expression500fx__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4237:1: ( ( RULE_OP500FX ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4238:1: ( RULE_OP500FX )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4238:1: ( RULE_OP500FX )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4239:1: RULE_OP500FX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500fxAccess().getOpOP500FXTerminalRuleCall_0_0()); 
            }
            match(input,RULE_OP500FX,FOLLOW_RULE_OP500FX_in_rule__Expression500fx__OpAssignment_08555); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500fxAccess().getOpOP500FXTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Expression500fx__OpAssignment_0"


    // $ANTLR start "rule__Expression500fx__RightAssignment_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4248:1: rule__Expression500fx__RightAssignment_1 : ( ruleExpression400yfx ) ;
    public final void rule__Expression500fx__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4252:1: ( ( ruleExpression400yfx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4253:1: ( ruleExpression400yfx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4253:1: ( ruleExpression400yfx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4254:1: ruleExpression400yfx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression500fxAccess().getRightExpression400yfxParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression400yfx_in_rule__Expression500fx__RightAssignment_18586);
            ruleExpression400yfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression500fxAccess().getRightExpression400yfxParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Expression500fx__RightAssignment_1"


    // $ANTLR start "rule__Expression400yfx__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4263:1: rule__Expression400yfx__OpAssignment_1_1 : ( RULE_OP400YFX ) ;
    public final void rule__Expression400yfx__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4267:1: ( ( RULE_OP400YFX ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4268:1: ( RULE_OP400YFX )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4268:1: ( RULE_OP400YFX )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4269:1: RULE_OP400YFX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression400yfxAccess().getOpOP400YFXTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP400YFX,FOLLOW_RULE_OP400YFX_in_rule__Expression400yfx__OpAssignment_1_18617); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression400yfxAccess().getOpOP400YFXTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression400yfx__OpAssignment_1_1"


    // $ANTLR start "rule__Expression400yfx__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4278:1: rule__Expression400yfx__RightAssignment_1_2 : ( ruleExpression200xfx ) ;
    public final void rule__Expression400yfx__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4282:1: ( ( ruleExpression200xfx ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4283:1: ( ruleExpression200xfx )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4283:1: ( ruleExpression200xfx )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4284:1: ruleExpression200xfx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression400yfxAccess().getRightExpression200xfxParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression200xfx_in_rule__Expression400yfx__RightAssignment_1_28648);
            ruleExpression200xfx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression400yfxAccess().getRightExpression200xfxParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression400yfx__RightAssignment_1_2"


    // $ANTLR start "rule__Expression200xfx__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4293:1: rule__Expression200xfx__OpAssignment_1_1 : ( RULE_OP200XFX ) ;
    public final void rule__Expression200xfx__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4297:1: ( ( RULE_OP200XFX ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4298:1: ( RULE_OP200XFX )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4298:1: ( RULE_OP200XFX )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4299:1: RULE_OP200XFX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfxAccess().getOpOP200XFXTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP200XFX,FOLLOW_RULE_OP200XFX_in_rule__Expression200xfx__OpAssignment_1_18679); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfxAccess().getOpOP200XFXTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression200xfx__OpAssignment_1_1"


    // $ANTLR start "rule__Expression200xfx__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4308:1: rule__Expression200xfx__RightAssignment_1_2 : ( ruleExpression200xfy ) ;
    public final void rule__Expression200xfx__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4312:1: ( ( ruleExpression200xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4313:1: ( ruleExpression200xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4313:1: ( ruleExpression200xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4314:1: ruleExpression200xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfxAccess().getRightExpression200xfyParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression200xfy_in_rule__Expression200xfx__RightAssignment_1_28710);
            ruleExpression200xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfxAccess().getRightExpression200xfyParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression200xfx__RightAssignment_1_2"


    // $ANTLR start "rule__Expression200xfy__OpAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4323:1: rule__Expression200xfy__OpAssignment_1_1 : ( RULE_OP200XFY ) ;
    public final void rule__Expression200xfy__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4327:1: ( ( RULE_OP200XFY ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4328:1: ( RULE_OP200XFY )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4328:1: ( RULE_OP200XFY )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4329:1: RULE_OP200XFY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfyAccess().getOpOP200XFYTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OP200XFY,FOLLOW_RULE_OP200XFY_in_rule__Expression200xfy__OpAssignment_1_18741); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfyAccess().getOpOP200XFYTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression200xfy__OpAssignment_1_1"


    // $ANTLR start "rule__Expression200xfy__RightAssignment_1_2"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4338:1: rule__Expression200xfy__RightAssignment_1_2 : ( ruleExpression200xfy ) ;
    public final void rule__Expression200xfy__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4342:1: ( ( ruleExpression200xfy ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4343:1: ( ruleExpression200xfy )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4343:1: ( ruleExpression200xfy )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4344:1: ruleExpression200xfy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression200xfyAccess().getRightExpression200xfyParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression200xfy_in_rule__Expression200xfy__RightAssignment_1_28772);
            ruleExpression200xfy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression200xfyAccess().getRightExpression200xfyParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Expression200xfy__RightAssignment_1_2"


    // $ANTLR start "rule__Expression0__AtomAssignment_0_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4353:1: rule__Expression0__AtomAssignment_0_1 : ( ruleATOMS ) ;
    public final void rule__Expression0__AtomAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4357:1: ( ( ruleATOMS ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4358:1: ( ruleATOMS )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4358:1: ( ruleATOMS )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4359:1: ruleATOMS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getAtomATOMSParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleATOMS_in_rule__Expression0__AtomAssignment_0_18803);
            ruleATOMS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getAtomATOMSParserRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__Expression0__AtomAssignment_0_1"


    // $ANTLR start "rule__Expression0__TermsAssignment_0_2_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4368:1: rule__Expression0__TermsAssignment_0_2_1 : ( ruleExpressionInfinity ) ;
    public final void rule__Expression0__TermsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4372:1: ( ( ruleExpressionInfinity ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4373:1: ( ruleExpressionInfinity )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4373:1: ( ruleExpressionInfinity )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4374:1: ruleExpressionInfinity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getTermsExpressionInfinityParserRuleCall_0_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpressionInfinity_in_rule__Expression0__TermsAssignment_0_2_18834);
            ruleExpressionInfinity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getTermsExpressionInfinityParserRuleCall_0_2_1_0()); 
            }

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
    // $ANTLR end "rule__Expression0__TermsAssignment_0_2_1"


    // $ANTLR start "rule__Expression0__NameAssignment_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4383:1: rule__Expression0__NameAssignment_1_1 : ( RULE_VARIABLE ) ;
    public final void rule__Expression0__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4387:1: ( ( RULE_VARIABLE ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4388:1: ( RULE_VARIABLE )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4388:1: ( RULE_VARIABLE )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4389:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getNameVARIABLETerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Expression0__NameAssignment_1_18865); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getNameVARIABLETerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression0__NameAssignment_1_1"


    // $ANTLR start "rule__Expression0__ValueAssignment_2_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4398:1: rule__Expression0__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Expression0__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4402:1: ( ( RULE_STRING ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4403:1: ( RULE_STRING )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4403:1: ( RULE_STRING )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4404:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getValueSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Expression0__ValueAssignment_2_18896); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getValueSTRINGTerminalRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__Expression0__ValueAssignment_2_1"


    // $ANTLR start "rule__Expression0__ValueAssignment_3_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4413:1: rule__Expression0__ValueAssignment_3_1 : ( ruleNUMBER ) ;
    public final void rule__Expression0__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4417:1: ( ( ruleNUMBER ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4418:1: ( ruleNUMBER )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4418:1: ( ruleNUMBER )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4419:1: ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getValueNUMBERParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_rule__Expression0__ValueAssignment_3_18927);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getValueNUMBERParserRuleCall_3_1_0()); 
            }

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
    // $ANTLR end "rule__Expression0__ValueAssignment_3_1"


    // $ANTLR start "rule__Expression0__HeadAssignment_4_2_0"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4428:1: rule__Expression0__HeadAssignment_4_2_0 : ( ruleExpressionInfinity ) ;
    public final void rule__Expression0__HeadAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4432:1: ( ( ruleExpressionInfinity ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4433:1: ( ruleExpressionInfinity )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4433:1: ( ruleExpressionInfinity )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4434:1: ruleExpressionInfinity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getHeadExpressionInfinityParserRuleCall_4_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpressionInfinity_in_rule__Expression0__HeadAssignment_4_2_08958);
            ruleExpressionInfinity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getHeadExpressionInfinityParserRuleCall_4_2_0_0()); 
            }

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
    // $ANTLR end "rule__Expression0__HeadAssignment_4_2_0"


    // $ANTLR start "rule__Expression0__TailAssignment_4_2_1_1"
    // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4443:1: rule__Expression0__TailAssignment_4_2_1_1 : ( ruleExpressionInfinity ) ;
    public final void rule__Expression0__TailAssignment_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4447:1: ( ( ruleExpressionInfinity ) )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4448:1: ( ruleExpressionInfinity )
            {
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4448:1: ( ruleExpressionInfinity )
            // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:4449:1: ruleExpressionInfinity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression0Access().getTailExpressionInfinityParserRuleCall_4_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpressionInfinity_in_rule__Expression0__TailAssignment_4_2_1_18989);
            ruleExpressionInfinity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression0Access().getTailExpressionInfinityParserRuleCall_4_2_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression0__TailAssignment_4_2_1_1"

    // $ANTLR start synpred21_InternalFlora2Editor
    public final void synpred21_InternalFlora2Editor_fragment() throws RecognitionException {   
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:819:1: ( ( ( rule__Expression900fy__Group_0__0 ) ) )
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:819:1: ( ( rule__Expression900fy__Group_0__0 ) )
        {
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:819:1: ( ( rule__Expression900fy__Group_0__0 ) )
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:820:1: ( rule__Expression900fy__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpression900fyAccess().getGroup_0()); 
        }
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:821:1: ( rule__Expression900fy__Group_0__0 )
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:821:2: rule__Expression900fy__Group_0__0
        {
        pushFollow(FOLLOW_rule__Expression900fy__Group_0__0_in_synpred21_InternalFlora2Editor1754);
        rule__Expression900fy__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalFlora2Editor

    // $ANTLR start synpred28_InternalFlora2Editor
    public final void synpred28_InternalFlora2Editor_fragment() throws RecognitionException {   
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1025:2: ( rule__NUMBER__Group_2__0 )
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1025:2: rule__NUMBER__Group_2__0
        {
        pushFollow(FOLLOW_rule__NUMBER__Group_2__0_in_synpred28_InternalFlora2Editor2200);
        rule__NUMBER__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalFlora2Editor

    // $ANTLR start synpred30_InternalFlora2Editor
    public final void synpred30_InternalFlora2Editor_fragment() throws RecognitionException {   
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1278:2: ( rule__Expression1200fx__OpAssignment_0 )
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1278:2: rule__Expression1200fx__OpAssignment_0
        {
        pushFollow(FOLLOW_rule__Expression1200fx__OpAssignment_0_in_synpred30_InternalFlora2Editor2695);
        rule__Expression1200fx__OpAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalFlora2Editor

    // $ANTLR start synpred31_InternalFlora2Editor
    public final void synpred31_InternalFlora2Editor_fragment() throws RecognitionException {   
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1339:2: ( rule__Expression1150fx__OpAssignment_0 )
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:1339:2: rule__Expression1150fx__OpAssignment_0
        {
        pushFollow(FOLLOW_rule__Expression1150fx__OpAssignment_0_in_synpred31_InternalFlora2Editor2817);
        rule__Expression1150fx__OpAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalFlora2Editor

    // $ANTLR start synpred36_InternalFlora2Editor
    public final void synpred36_InternalFlora2Editor_fragment() throws RecognitionException {   
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2081:2: ( rule__Expression900fx__OpAssignment_0 )
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2081:2: rule__Expression900fx__OpAssignment_0
        {
        pushFollow(FOLLOW_rule__Expression900fx__OpAssignment_0_in_synpred36_InternalFlora2Editor4280);
        rule__Expression900fx__OpAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalFlora2Editor

    // $ANTLR start synpred40_InternalFlora2Editor
    public final void synpred40_InternalFlora2Editor_fragment() throws RecognitionException {   
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2607:2: ( rule__Expression500fx__OpAssignment_0 )
        // ../ai.vital.flora2.edit.ui/src-gen/ai/vital/flora2/edit/ui/contentassist/antlr/internal/InternalFlora2Editor.g:2607:2: rule__Expression500fx__OpAssignment_0
        {
        pushFollow(FOLLOW_rule__Expression500fx__OpAssignment_0_in_synpred40_InternalFlora2Editor5317);
        rule__Expression500fx__OpAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalFlora2Editor

    // Delegated rules

    public final boolean synpred28_InternalFlora2Editor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalFlora2Editor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalFlora2Editor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalFlora2Editor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalFlora2Editor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalFlora2Editor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalFlora2Editor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalFlora2Editor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalFlora2Editor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalFlora2Editor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalFlora2Editor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalFlora2Editor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA4_eotS =
        "\33\uffff";
    static final String DFA4_eofS =
        "\33\uffff";
    static final String DFA4_minS =
        "\1\4\1\0\31\uffff";
    static final String DFA4_maxS =
        "\1\40\1\0\31\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\27\uffff\1\1";
    static final String DFA4_specialS =
        "\1\uffff\1\0\31\uffff}>";
    static final String[] DFA4_transitionS = {
            "\10\2\1\1\10\2\1\uffff\3\2\2\uffff\4\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "814:1: rule__Expression900fy__Alternatives : ( ( ( rule__Expression900fy__Group_0__0 ) ) | ( ( rule__Expression900fy__RightAssignment_1 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFlora2Editor()) ) {s = 26;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\33\uffff";
    static final String DFA9_eofS =
        "\33\uffff";
    static final String DFA9_minS =
        "\1\4\1\0\31\uffff";
    static final String DFA9_maxS =
        "\1\40\1\0\31\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\27\uffff\1\1";
    static final String DFA9_specialS =
        "\1\uffff\1\0\31\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\2\1\1\16\2\1\uffff\3\2\2\uffff\4\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1278:1: ( rule__Expression1200fx__OpAssignment_0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalFlora2Editor()) ) {s = 26;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\33\uffff";
    static final String DFA10_eofS =
        "\33\uffff";
    static final String DFA10_minS =
        "\1\4\1\0\31\uffff";
    static final String DFA10_maxS =
        "\1\40\1\0\31\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\27\uffff\1\1";
    static final String DFA10_specialS =
        "\1\uffff\1\0\31\uffff}>";
    static final String[] DFA10_transitionS = {
            "\3\2\1\1\15\2\1\uffff\3\2\2\uffff\4\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1339:1: ( rule__Expression1150fx__OpAssignment_0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalFlora2Editor()) ) {s = 26;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\33\uffff";
    static final String DFA15_eofS =
        "\33\uffff";
    static final String DFA15_minS =
        "\1\4\1\0\31\uffff";
    static final String DFA15_maxS =
        "\1\40\1\0\31\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\27\uffff\1\1";
    static final String DFA15_specialS =
        "\1\uffff\1\0\31\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\2\1\1\7\2\1\uffff\3\2\2\uffff\4\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "2081:1: ( rule__Expression900fx__OpAssignment_0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalFlora2Editor()) ) {s = 26;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\33\uffff";
    static final String DFA19_eofS =
        "\33\uffff";
    static final String DFA19_minS =
        "\1\4\1\0\31\uffff";
    static final String DFA19_maxS =
        "\1\40\1\0\31\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\27\uffff\1\1";
    static final String DFA19_specialS =
        "\1\uffff\1\0\31\uffff}>";
    static final String[] DFA19_transitionS = {
            "\15\2\1\1\3\2\1\uffff\3\2\2\uffff\4\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "2607:1: ( rule__Expression500fx__OpAssignment_0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalFlora2Editor()) ) {s = 26;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel102 = new BitSet(new long[]{0x0000000179DFFFF2L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel114 = new BitSet(new long[]{0x0000000179DFFFF2L});
    public static final BitSet FOLLOW_ruleATOMS_in_entryRuleATOMS144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATOMS151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATOMS__Alternatives_in_ruleATOMS177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__0_in_ruleNUMBER246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionInfinity_in_entryRuleExpressionInfinity273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionInfinity280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1200xfx_in_ruleExpressionInfinity306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1200xfx_in_entryRuleExpression1200xfx332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1200xfx339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__Group__0_in_ruleExpression1200xfx365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1200fx_in_entryRuleExpression1200fx392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1200fx399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200fx__Group__0_in_ruleExpression1200fx425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1150fx_in_entryRuleExpression1150fx452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1150fx459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1150fx__Group__0_in_ruleExpression1150fx485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1100xfy_in_entryRuleExpression1100xfy512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1100xfy519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__Group__0_in_ruleExpression1100xfy545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1050xfy_in_entryRuleExpression1050xfy572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1050xfy579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__Group__0_in_ruleExpression1050xfy605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1000xfy_in_entryRuleExpression1000xfy632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1000xfy639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__Group__0_in_ruleExpression1000xfy665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression954xfy_in_entryRuleExpression954xfy692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression954xfy699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression954xfy__Group__0_in_ruleExpression954xfy725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression900fy_in_entryRuleExpression900fy752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression900fy759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fy__Alternatives_in_ruleExpression900fy785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression900fx_in_entryRuleExpression900fx812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression900fx819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fx__Group__0_in_ruleExpression900fx845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression700xfx_in_entryRuleExpression700xfx872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression700xfx879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression700xfx__Group__0_in_ruleExpression700xfx905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression600xfy_in_entryRuleExpression600xfy932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression600xfy939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression600xfy__Group__0_in_ruleExpression600xfy965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression500yfx_in_entryRuleExpression500yfx992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression500yfx999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500yfx__Group__0_in_ruleExpression500yfx1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression500fx_in_entryRuleExpression500fx1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression500fx1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500fx__Group__0_in_ruleExpression500fx1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression400yfx_in_entryRuleExpression400yfx1112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression400yfx1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression400yfx__Group__0_in_ruleExpression400yfx1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression200xfx_in_entryRuleExpression200xfx1172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression200xfx1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfx__Group__0_in_ruleExpression200xfx1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression200xfy_in_entryRuleExpression200xfy1232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression200xfy1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfy__Group__0_in_ruleExpression200xfy1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression0_in_entryRuleExpression01292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression01299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Alternatives_in_ruleExpression01325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ATOMS__Alternatives1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ATOMS__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ATOM_in_rule__ATOMS__Alternatives1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1200XFX_in_rule__ATOMS__Alternatives1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1200FX_in_rule__ATOMS__Alternatives1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1150FX_in_rule__ATOMS__Alternatives1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1100XFY_in_rule__ATOMS__Alternatives1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1050XFY_in_rule__ATOMS__Alternatives1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1000XFY_in_rule__ATOMS__Alternatives1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP954XFY_in_rule__ATOMS__Alternatives1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP900FY_in_rule__ATOMS__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP900FX_in_rule__ATOMS__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP700XFX_in_rule__ATOMS__Alternatives1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP600XFY_in_rule__ATOMS__Alternatives1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP500YFX_in_rule__ATOMS__Alternatives1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP500FX_in_rule__ATOMS__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP400YFX_in_rule__ATOMS__Alternatives1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP200XFX_in_rule__ATOMS__Alternatives1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP200XFY_in_rule__ATOMS__Alternatives1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXT_INT_in_rule__NUMBER__Alternatives_2_11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Alternatives_2_11722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fy__Group_0__0_in_rule__Expression900fy__Alternatives1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fy__RightAssignment_1_in_rule__Expression900fy__Alternatives1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0__0_in_rule__Expression0__Alternatives1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_1__0_in_rule__Expression0__Alternatives1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_2__0_in_rule__Expression0__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_3__0_in_rule__Expression0__Alternatives1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4__0_in_rule__Expression0__Alternatives1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_5__0_in_rule__Expression0__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01926 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExpsAssignment_0_in_rule__Model__Group__0__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Model__Group__1__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__0__Impl_in_rule__NUMBER__Group__02049 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__1_in_rule__NUMBER__Group__02052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NUMBER__Group__0__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__1__Impl_in_rule__NUMBER__Group__12114 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__2_in_rule__NUMBER__Group__12117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Group__1__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__2__Impl_in_rule__NUMBER__Group__22173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_2__0_in_rule__NUMBER__Group__2__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_2__0__Impl_in_rule__NUMBER__Group_2__02237 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_2__1_in_rule__NUMBER__Group_2__02240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NUMBER__Group_2__0__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_2__1__Impl_in_rule__NUMBER__Group_2__12299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Alternatives_2_1_in_rule__NUMBER__Group_2__1__Impl2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__Group__0__Impl_in_rule__Expression1200xfx__Group__02360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__Group__1_in_rule__Expression1200xfx__Group__02363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1200fx_in_rule__Expression1200xfx__Group__0__Impl2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__Group__1__Impl_in_rule__Expression1200xfx__Group__12419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__Group_1__0_in_rule__Expression1200xfx__Group__1__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__Group_1__0__Impl_in_rule__Expression1200xfx__Group_1__02481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__Group_1__1_in_rule__Expression1200xfx__Group_1__02484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__Group_1__1__Impl_in_rule__Expression1200xfx__Group_1__12542 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__Group_1__2_in_rule__Expression1200xfx__Group_1__12545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__OpAssignment_1_1_in_rule__Expression1200xfx__Group_1__1__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__Group_1__2__Impl_in_rule__Expression1200xfx__Group_1__22602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200xfx__RightAssignment_1_2_in_rule__Expression1200xfx__Group_1__2__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200fx__Group__0__Impl_in_rule__Expression1200fx__Group__02665 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression1200fx__Group__1_in_rule__Expression1200fx__Group__02668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200fx__OpAssignment_0_in_rule__Expression1200fx__Group__0__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200fx__Group__1__Impl_in_rule__Expression1200fx__Group__12726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200fx__RightAssignment_1_in_rule__Expression1200fx__Group__1__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1150fx__Group__0__Impl_in_rule__Expression1150fx__Group__02787 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression1150fx__Group__1_in_rule__Expression1150fx__Group__02790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1150fx__OpAssignment_0_in_rule__Expression1150fx__Group__0__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1150fx__Group__1__Impl_in_rule__Expression1150fx__Group__12848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1150fx__RightAssignment_1_in_rule__Expression1150fx__Group__1__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__Group__0__Impl_in_rule__Expression1100xfy__Group__02909 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__Group__1_in_rule__Expression1100xfy__Group__02912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1050xfy_in_rule__Expression1100xfy__Group__0__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__Group__1__Impl_in_rule__Expression1100xfy__Group__12968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__Group_1__0_in_rule__Expression1100xfy__Group__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__Group_1__0__Impl_in_rule__Expression1100xfy__Group_1__03030 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__Group_1__1_in_rule__Expression1100xfy__Group_1__03033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__Group_1__1__Impl_in_rule__Expression1100xfy__Group_1__13091 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__Group_1__2_in_rule__Expression1100xfy__Group_1__13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__OpAssignment_1_1_in_rule__Expression1100xfy__Group_1__1__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__Group_1__2__Impl_in_rule__Expression1100xfy__Group_1__23151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1100xfy__RightAssignment_1_2_in_rule__Expression1100xfy__Group_1__2__Impl3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__Group__0__Impl_in_rule__Expression1050xfy__Group__03214 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__Group__1_in_rule__Expression1050xfy__Group__03217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1000xfy_in_rule__Expression1050xfy__Group__0__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__Group__1__Impl_in_rule__Expression1050xfy__Group__13273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__Group_1__0_in_rule__Expression1050xfy__Group__1__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__Group_1__0__Impl_in_rule__Expression1050xfy__Group_1__03335 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__Group_1__1_in_rule__Expression1050xfy__Group_1__03338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__Group_1__1__Impl_in_rule__Expression1050xfy__Group_1__13396 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__Group_1__2_in_rule__Expression1050xfy__Group_1__13399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__OpAssignment_1_1_in_rule__Expression1050xfy__Group_1__1__Impl3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__Group_1__2__Impl_in_rule__Expression1050xfy__Group_1__23456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1050xfy__RightAssignment_1_2_in_rule__Expression1050xfy__Group_1__2__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__Group__0__Impl_in_rule__Expression1000xfy__Group__03519 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__Group__1_in_rule__Expression1000xfy__Group__03522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression954xfy_in_rule__Expression1000xfy__Group__0__Impl3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__Group__1__Impl_in_rule__Expression1000xfy__Group__13578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__Group_1__0_in_rule__Expression1000xfy__Group__1__Impl3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__Group_1__0__Impl_in_rule__Expression1000xfy__Group_1__03640 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__Group_1__1_in_rule__Expression1000xfy__Group_1__03643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__Group_1__1__Impl_in_rule__Expression1000xfy__Group_1__13701 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__Group_1__2_in_rule__Expression1000xfy__Group_1__13704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__OpAssignment_1_1_in_rule__Expression1000xfy__Group_1__1__Impl3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__Group_1__2__Impl_in_rule__Expression1000xfy__Group_1__23761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1000xfy__RightAssignment_1_2_in_rule__Expression1000xfy__Group_1__2__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression954xfy__Group__0__Impl_in_rule__Expression954xfy__Group__03824 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Expression954xfy__Group__1_in_rule__Expression954xfy__Group__03827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression900fy_in_rule__Expression954xfy__Group__0__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression954xfy__Group__1__Impl_in_rule__Expression954xfy__Group__13883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression954xfy__Group_1__0_in_rule__Expression954xfy__Group__1__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression954xfy__Group_1__0__Impl_in_rule__Expression954xfy__Group_1__03945 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Expression954xfy__Group_1__1_in_rule__Expression954xfy__Group_1__03948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression954xfy__Group_1__1__Impl_in_rule__Expression954xfy__Group_1__14006 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression954xfy__Group_1__2_in_rule__Expression954xfy__Group_1__14009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression954xfy__OpAssignment_1_1_in_rule__Expression954xfy__Group_1__1__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression954xfy__Group_1__2__Impl_in_rule__Expression954xfy__Group_1__24066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression954xfy__RightAssignment_1_2_in_rule__Expression954xfy__Group_1__2__Impl4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fy__Group_0__0__Impl_in_rule__Expression900fy__Group_0__04129 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression900fy__Group_0__1_in_rule__Expression900fy__Group_0__04132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fy__OpAssignment_0_0_in_rule__Expression900fy__Group_0__0__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fy__Group_0__1__Impl_in_rule__Expression900fy__Group_0__14189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fy__RightAssignment_0_1_in_rule__Expression900fy__Group_0__1__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fx__Group__0__Impl_in_rule__Expression900fx__Group__04250 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression900fx__Group__1_in_rule__Expression900fx__Group__04253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fx__OpAssignment_0_in_rule__Expression900fx__Group__0__Impl4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fx__Group__1__Impl_in_rule__Expression900fx__Group__14311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fx__RightAssignment_1_in_rule__Expression900fx__Group__1__Impl4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression700xfx__Group__0__Impl_in_rule__Expression700xfx__Group__04372 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Expression700xfx__Group__1_in_rule__Expression700xfx__Group__04375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression600xfy_in_rule__Expression700xfx__Group__0__Impl4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression700xfx__Group__1__Impl_in_rule__Expression700xfx__Group__14431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression700xfx__Group_1__0_in_rule__Expression700xfx__Group__1__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression700xfx__Group_1__0__Impl_in_rule__Expression700xfx__Group_1__04493 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Expression700xfx__Group_1__1_in_rule__Expression700xfx__Group_1__04496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression700xfx__Group_1__1__Impl_in_rule__Expression700xfx__Group_1__14554 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression700xfx__Group_1__2_in_rule__Expression700xfx__Group_1__14557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression700xfx__OpAssignment_1_1_in_rule__Expression700xfx__Group_1__1__Impl4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression700xfx__Group_1__2__Impl_in_rule__Expression700xfx__Group_1__24614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression700xfx__RightAssignment_1_2_in_rule__Expression700xfx__Group_1__2__Impl4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression600xfy__Group__0__Impl_in_rule__Expression600xfy__Group__04677 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Expression600xfy__Group__1_in_rule__Expression600xfy__Group__04680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression500yfx_in_rule__Expression600xfy__Group__0__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression600xfy__Group__1__Impl_in_rule__Expression600xfy__Group__14736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression600xfy__Group_1__0_in_rule__Expression600xfy__Group__1__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression600xfy__Group_1__0__Impl_in_rule__Expression600xfy__Group_1__04798 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Expression600xfy__Group_1__1_in_rule__Expression600xfy__Group_1__04801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression600xfy__Group_1__1__Impl_in_rule__Expression600xfy__Group_1__14859 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression600xfy__Group_1__2_in_rule__Expression600xfy__Group_1__14862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression600xfy__OpAssignment_1_1_in_rule__Expression600xfy__Group_1__1__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression600xfy__Group_1__2__Impl_in_rule__Expression600xfy__Group_1__24919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression600xfy__RightAssignment_1_2_in_rule__Expression600xfy__Group_1__2__Impl4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500yfx__Group__0__Impl_in_rule__Expression500yfx__Group__04982 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Expression500yfx__Group__1_in_rule__Expression500yfx__Group__04985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression500fx_in_rule__Expression500yfx__Group__0__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500yfx__Group__1__Impl_in_rule__Expression500yfx__Group__15041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500yfx__Group_1__0_in_rule__Expression500yfx__Group__1__Impl5068 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Expression500yfx__Group_1__0__Impl_in_rule__Expression500yfx__Group_1__05103 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Expression500yfx__Group_1__1_in_rule__Expression500yfx__Group_1__05106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500yfx__Group_1__1__Impl_in_rule__Expression500yfx__Group_1__15164 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression500yfx__Group_1__2_in_rule__Expression500yfx__Group_1__15167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500yfx__OpAssignment_1_1_in_rule__Expression500yfx__Group_1__1__Impl5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500yfx__Group_1__2__Impl_in_rule__Expression500yfx__Group_1__25224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500yfx__RightAssignment_1_2_in_rule__Expression500yfx__Group_1__2__Impl5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500fx__Group__0__Impl_in_rule__Expression500fx__Group__05287 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression500fx__Group__1_in_rule__Expression500fx__Group__05290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500fx__OpAssignment_0_in_rule__Expression500fx__Group__0__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500fx__Group__1__Impl_in_rule__Expression500fx__Group__15348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500fx__RightAssignment_1_in_rule__Expression500fx__Group__1__Impl5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression400yfx__Group__0__Impl_in_rule__Expression400yfx__Group__05409 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Expression400yfx__Group__1_in_rule__Expression400yfx__Group__05412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression200xfx_in_rule__Expression400yfx__Group__0__Impl5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression400yfx__Group__1__Impl_in_rule__Expression400yfx__Group__15468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression400yfx__Group_1__0_in_rule__Expression400yfx__Group__1__Impl5495 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Expression400yfx__Group_1__0__Impl_in_rule__Expression400yfx__Group_1__05530 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Expression400yfx__Group_1__1_in_rule__Expression400yfx__Group_1__05533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression400yfx__Group_1__1__Impl_in_rule__Expression400yfx__Group_1__15591 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression400yfx__Group_1__2_in_rule__Expression400yfx__Group_1__15594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression400yfx__OpAssignment_1_1_in_rule__Expression400yfx__Group_1__1__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression400yfx__Group_1__2__Impl_in_rule__Expression400yfx__Group_1__25651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression400yfx__RightAssignment_1_2_in_rule__Expression400yfx__Group_1__2__Impl5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfx__Group__0__Impl_in_rule__Expression200xfx__Group__05714 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Expression200xfx__Group__1_in_rule__Expression200xfx__Group__05717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression200xfy_in_rule__Expression200xfx__Group__0__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfx__Group__1__Impl_in_rule__Expression200xfx__Group__15773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfx__Group_1__0_in_rule__Expression200xfx__Group__1__Impl5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfx__Group_1__0__Impl_in_rule__Expression200xfx__Group_1__05835 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Expression200xfx__Group_1__1_in_rule__Expression200xfx__Group_1__05838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfx__Group_1__1__Impl_in_rule__Expression200xfx__Group_1__15896 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression200xfx__Group_1__2_in_rule__Expression200xfx__Group_1__15899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfx__OpAssignment_1_1_in_rule__Expression200xfx__Group_1__1__Impl5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfx__Group_1__2__Impl_in_rule__Expression200xfx__Group_1__25956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfx__RightAssignment_1_2_in_rule__Expression200xfx__Group_1__2__Impl5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfy__Group__0__Impl_in_rule__Expression200xfy__Group__06019 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Expression200xfy__Group__1_in_rule__Expression200xfy__Group__06022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression0_in_rule__Expression200xfy__Group__0__Impl6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfy__Group__1__Impl_in_rule__Expression200xfy__Group__16078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfy__Group_1__0_in_rule__Expression200xfy__Group__1__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfy__Group_1__0__Impl_in_rule__Expression200xfy__Group_1__06140 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Expression200xfy__Group_1__1_in_rule__Expression200xfy__Group_1__06143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfy__Group_1__1__Impl_in_rule__Expression200xfy__Group_1__16201 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression200xfy__Group_1__2_in_rule__Expression200xfy__Group_1__16204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfy__OpAssignment_1_1_in_rule__Expression200xfy__Group_1__1__Impl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfy__Group_1__2__Impl_in_rule__Expression200xfy__Group_1__26261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression200xfy__RightAssignment_1_2_in_rule__Expression200xfy__Group_1__2__Impl6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0__0__Impl_in_rule__Expression0__Group_0__06324 = new BitSet(new long[]{0x00000000181FFFF0L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0__1_in_rule__Expression0__Group_0__06327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0__1__Impl_in_rule__Expression0__Group_0__16385 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0__2_in_rule__Expression0__Group_0__16388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__AtomAssignment_0_1_in_rule__Expression0__Group_0__1__Impl6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0__2__Impl_in_rule__Expression0__Group_0__26445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0_2__0_in_rule__Expression0__Group_0__2__Impl6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0_2__0__Impl_in_rule__Expression0__Group_0_2__06509 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0_2__1_in_rule__Expression0__Group_0_2__06512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Expression0__Group_0_2__0__Impl6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0_2__1__Impl_in_rule__Expression0__Group_0_2__16571 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0_2__2_in_rule__Expression0__Group_0_2__16574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__TermsAssignment_0_2_1_in_rule__Expression0__Group_0_2__1__Impl6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_0_2__2__Impl_in_rule__Expression0__Group_0_2__26631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Expression0__Group_0_2__2__Impl6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_1__0__Impl_in_rule__Expression0__Group_1__06696 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Expression0__Group_1__1_in_rule__Expression0__Group_1__06699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_1__1__Impl_in_rule__Expression0__Group_1__16757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__NameAssignment_1_1_in_rule__Expression0__Group_1__1__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_2__0__Impl_in_rule__Expression0__Group_2__06818 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Expression0__Group_2__1_in_rule__Expression0__Group_2__06821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_2__1__Impl_in_rule__Expression0__Group_2__16879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__ValueAssignment_2_1_in_rule__Expression0__Group_2__1__Impl6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_3__0__Impl_in_rule__Expression0__Group_3__06940 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_rule__Expression0__Group_3__1_in_rule__Expression0__Group_3__06943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_3__1__Impl_in_rule__Expression0__Group_3__17001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__ValueAssignment_3_1_in_rule__Expression0__Group_3__1__Impl7028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4__0__Impl_in_rule__Expression0__Group_4__07062 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4__1_in_rule__Expression0__Group_4__07065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4__1__Impl_in_rule__Expression0__Group_4__17123 = new BitSet(new long[]{0x0000000379DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4__2_in_rule__Expression0__Group_4__17126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Expression0__Group_4__1__Impl7154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4__2__Impl_in_rule__Expression0__Group_4__27185 = new BitSet(new long[]{0x0000000379DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4__3_in_rule__Expression0__Group_4__27188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4_2__0_in_rule__Expression0__Group_4__2__Impl7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4__3__Impl_in_rule__Expression0__Group_4__37246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Expression0__Group_4__3__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4_2__0__Impl_in_rule__Expression0__Group_4_2__07313 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4_2__1_in_rule__Expression0__Group_4_2__07316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__HeadAssignment_4_2_0_in_rule__Expression0__Group_4_2__0__Impl7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4_2__1__Impl_in_rule__Expression0__Group_4_2__17373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4_2_1__0_in_rule__Expression0__Group_4_2__1__Impl7400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4_2_1__0__Impl_in_rule__Expression0__Group_4_2_1__07435 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4_2_1__1_in_rule__Expression0__Group_4_2_1__07438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Expression0__Group_4_2_1__0__Impl7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_4_2_1__1__Impl_in_rule__Expression0__Group_4_2_1__17497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__TailAssignment_4_2_1_1_in_rule__Expression0__Group_4_2_1__1__Impl7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_5__0__Impl_in_rule__Expression0__Group_5__07558 = new BitSet(new long[]{0x0000000179DFFFF0L});
    public static final BitSet FOLLOW_rule__Expression0__Group_5__1_in_rule__Expression0__Group_5__07561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Expression0__Group_5__0__Impl7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_5__1__Impl_in_rule__Expression0__Group_5__17620 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Expression0__Group_5__2_in_rule__Expression0__Group_5__17623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionInfinity_in_rule__Expression0__Group_5__1__Impl7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression0__Group_5__2__Impl_in_rule__Expression0__Group_5__27679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Expression0__Group_5__2__Impl7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionInfinity_in_rule__Model__ExpsAssignment_07749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1200XFX_in_rule__Expression1200xfx__OpAssignment_1_17780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1200fx_in_rule__Expression1200xfx__RightAssignment_1_27811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1200FX_in_rule__Expression1200fx__OpAssignment_07842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1150fx_in_rule__Expression1200fx__RightAssignment_17873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1150FX_in_rule__Expression1150fx__OpAssignment_07904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1100xfy_in_rule__Expression1150fx__RightAssignment_17935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1100XFY_in_rule__Expression1100xfy__OpAssignment_1_17966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1100xfy_in_rule__Expression1100xfy__RightAssignment_1_27997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1050XFY_in_rule__Expression1050xfy__OpAssignment_1_18028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1050xfy_in_rule__Expression1050xfy__RightAssignment_1_28059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP1000XFY_in_rule__Expression1000xfy__OpAssignment_1_18090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression1000xfy_in_rule__Expression1000xfy__RightAssignment_1_28121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP954XFY_in_rule__Expression954xfy__OpAssignment_1_18152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression954xfy_in_rule__Expression954xfy__RightAssignment_1_28183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP900FY_in_rule__Expression900fy__OpAssignment_0_08214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression900fy_in_rule__Expression900fy__RightAssignment_0_18245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression900fx_in_rule__Expression900fy__RightAssignment_18276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP900FX_in_rule__Expression900fx__OpAssignment_08307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression700xfx_in_rule__Expression900fx__RightAssignment_18338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP700XFX_in_rule__Expression700xfx__OpAssignment_1_18369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression600xfy_in_rule__Expression700xfx__RightAssignment_1_28400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP600XFY_in_rule__Expression600xfy__OpAssignment_1_18431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression600xfy_in_rule__Expression600xfy__RightAssignment_1_28462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP500YFX_in_rule__Expression500yfx__OpAssignment_1_18493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression500fx_in_rule__Expression500yfx__RightAssignment_1_28524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP500FX_in_rule__Expression500fx__OpAssignment_08555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression400yfx_in_rule__Expression500fx__RightAssignment_18586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP400YFX_in_rule__Expression400yfx__OpAssignment_1_18617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression200xfx_in_rule__Expression400yfx__RightAssignment_1_28648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP200XFX_in_rule__Expression200xfx__OpAssignment_1_18679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression200xfy_in_rule__Expression200xfx__RightAssignment_1_28710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OP200XFY_in_rule__Expression200xfy__OpAssignment_1_18741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression200xfy_in_rule__Expression200xfy__RightAssignment_1_28772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATOMS_in_rule__Expression0__AtomAssignment_0_18803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionInfinity_in_rule__Expression0__TermsAssignment_0_2_18834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Expression0__NameAssignment_1_18865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Expression0__ValueAssignment_2_18896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__Expression0__ValueAssignment_3_18927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionInfinity_in_rule__Expression0__HeadAssignment_4_2_08958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionInfinity_in_rule__Expression0__TailAssignment_4_2_1_18989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fy__Group_0__0_in_synpred21_InternalFlora2Editor1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_2__0_in_synpred28_InternalFlora2Editor2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1200fx__OpAssignment_0_in_synpred30_InternalFlora2Editor2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression1150fx__OpAssignment_0_in_synpred31_InternalFlora2Editor2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression900fx__OpAssignment_0_in_synpred36_InternalFlora2Editor4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression500fx__OpAssignment_0_in_synpred40_InternalFlora2Editor5317 = new BitSet(new long[]{0x0000000000000002L});

}