/*
* generated by Xtext
*/
package ai.vital.flora2.edit;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Flora2EditorStandaloneSetup extends Flora2EditorStandaloneSetupGenerated{

	public static void doSetup() {
		new Flora2EditorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

