/*
 * generated by Xtext
 */
package com.lowcoupling.mdpm.lng.plan.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.lowcoupling.mdpm.lng.plan.ui.internal.PlanActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PlanExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PlanActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PlanActivator.getInstance().getInjector(PlanActivator.COM_LOWCOUPLING_MDPM_LNG_PLAN_PLAN);
	}
	
}