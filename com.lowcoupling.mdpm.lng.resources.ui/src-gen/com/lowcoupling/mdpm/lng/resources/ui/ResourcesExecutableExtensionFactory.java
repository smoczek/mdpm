/*
 * generated by Xtext
 */
package com.lowcoupling.mdpm.lng.resources.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.lowcoupling.mdpm.lng.resources.ui.internal.ResourcesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ResourcesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ResourcesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ResourcesActivator.getInstance().getInjector(ResourcesActivator.COM_LOWCOUPLING_MDPM_LNG_RESOURCES_RESOURCES);
	}
	
}
