/*
* generated by Xtext
*/
package com.lowcoupling.mdpm.lng.wbs;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class WBSUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.lowcoupling.mdpm.lng.wbs.ui.internal.WBSActivator.getInstance().getInjector("com.lowcoupling.mdpm.lng.wbs.WBS");
	}
	
}