package ai.vital.flora2.edit.ui.highlight;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class Flora2AntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

private static final Pattern QUOTED = Pattern.compile("(?:^'(\\w[^']*)'$)|(?:^\"(\\w[^\"]*)\")$", Pattern.MULTILINE);
	
    @Override
    protected String calculateId(String tokenName, int tokenType) {
    	
        if(tokenName.equals("RULE_INT")) {
            return Flora2HighlightConfig.NUMBER_ID;
        }
        else if(tokenName.equals("RULE_SINGLE_LINE_COMMENT")) {
            return Flora2HighlightConfig.COMMENT_ID;
        }
        else if(QUOTED.matcher(tokenName).matches()) {
            return Flora2HighlightConfig.KEYWORD_ID;
        }
        return Flora2HighlightConfig.DEFAULT_ID;
    }

}
