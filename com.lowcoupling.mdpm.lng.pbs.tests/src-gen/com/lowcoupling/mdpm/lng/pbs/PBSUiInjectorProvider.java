/*
* generated by Xtext
*/
package com.lowcoupling.mdpm.lng.pbs;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class PBSUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.lowcoupling.mdpm.lng.pbs.ui.internal.PBSActivator.getInstance().getInjector("com.lowcoupling.mdpm.lng.pbs.PBS");
	}
	
}