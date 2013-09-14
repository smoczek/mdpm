
package com.lowcoupling.mdpm.lng.resources;

import com.lowcoupling.mdpm.lng.resources.ResourcesStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ResourcesStandaloneSetup extends ResourcesStandaloneSetupGenerated{

	public static void doSetup() {
		new ResourcesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

