/*
* generated by Xtext
*/
package ai.vital.flora2.edit;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class Flora2EditorUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return ai.vital.flora2.edit.ui.internal.Flora2EditorActivator.getInstance().getInjector("ai.vital.flora2.edit.Flora2Editor");
	}
	
}
