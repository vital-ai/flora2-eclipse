package ai.vital.flora2.edit.ui.highlight;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;


public class Flora2HighlightConfig implements IHighlightingConfiguration {

	/*
	 / bindILexicalHighlightingConfiguration

	// public java.lang.Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration> bindILexicalHighlightingConfiguration()

	// bindAbstractAntlrTokenToAttributeIdMapper
	// public java.lang.Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper()

	// bindSematicTextHighlightCalculator
	// public java.lang.Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindSematicTextHighlightCalculator()

	
	
	
	public Class<? extends IHighlightingConfiguration> bindFlora2EditorIHighlightingConfiguration() {
	     return Flora2HighlightConfig.class;
	}
	 */
	
	
    // public static final String METHOD_ID = "method";
	
	
    public static final String KEYWORD_ID = DefaultHighlightingConfiguration.KEYWORD_ID;

	public static final String PUNCTUATION_ID = DefaultHighlightingConfiguration.PUNCTUATION_ID;

	public static final String COMMENT_ID = DefaultHighlightingConfiguration.COMMENT_ID;

	public static final String STRING_ID = DefaultHighlightingConfiguration.STRING_ID;

	public static final String NUMBER_ID = DefaultHighlightingConfiguration.NUMBER_ID;

	public static final String DEFAULT_ID = DefaultHighlightingConfiguration.DEFAULT_ID;

	public static final String INVALID_TOKEN_ID = DefaultHighlightingConfiguration.INVALID_TOKEN_ID;
	
	public static final String TASK_ID = DefaultHighlightingConfiguration.TASK_ID;
    

	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		
        acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
        
        //acceptor.acceptDefaultHighlighting(METHOD_ID, "Method", methodTextStyle());
        
        acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
        
        acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
        
        
        
		
	}

	
	protected TextStyle commentTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(255, 0, 0));
        return textStyle;
    }
	
	protected TextStyle defaultTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(0, 0, 0));
        return textStyle;
    }

    protected TextStyle keywordTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(127, 0, 85));
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
    }

    /*
    protected TextStyle methodTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(85, 0, 127));
        textStyle.setStyle(SWT.ITALIC);
        return textStyle;
    }
	*/
    
    protected TextStyle numberTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(127, 127, 127));
        return textStyle;
    } 
	
}
