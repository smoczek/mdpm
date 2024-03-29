/*
 * generated by Xtext
 */
package com.lowcoupling.mdpm.lng.wbs.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;
import com.lowcoupling.mdpm.lng.wbs.ui.internal.WBSActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class WBSExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return WBSActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return WBSActivator.getInstance().getInjector(WBSActivator.COM_LOWCOUPLING_MDPM_LNG_WBS_WBS);
	}
	
}
