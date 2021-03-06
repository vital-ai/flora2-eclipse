/*
 * generated by Xtext
 */
package ai.vital.flora2.edit.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

import ai.vital.flora2.edit.ui.highlight.Flora2AntlrTokenToAttributeIdMapper;
import ai.vital.flora2.edit.ui.highlight.Flora2HighlightConfig;


/**
 * Use this class to register components to be used within the IDE.
 */
public class Flora2EditorUiModule extends ai.vital.flora2.edit.ui.AbstractFlora2EditorUiModule {

	
	public Flora2EditorUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	// bindILexicalHighlightingConfiguration

	// public java.lang.Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration> bindILexicalHighlightingConfiguration()

	// bindAbstractAntlrTokenToAttributeIdMapper
	// public java.lang.Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper()

	
	public java.lang.Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		
		System.out.println("Getting Flora2AntlrTokenToAttributeIdMapper...");

		return Flora2AntlrTokenToAttributeIdMapper.class;
	}

	
	
	// bindSematicTextHighlightCalculator
	// public java.lang.Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindSematicTextHighlightCalculator()

	
	
	
	public Class<? extends IHighlightingConfiguration> bindFlora2EditorIHighlightingConfiguration() {
		
		System.out.println("Getting Flora2HighlightConfig...");
		
	     return Flora2HighlightConfig.class;
	}
}
