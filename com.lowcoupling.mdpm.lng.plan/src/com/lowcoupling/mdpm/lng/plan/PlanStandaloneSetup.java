
package com.lowcoupling.mdpm.lng.plan;

import com.lowcoupling.mdpm.lng.plan.PlanStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PlanStandaloneSetup extends PlanStandaloneSetupGenerated{

	public static void doSetup() {
		new PlanStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

