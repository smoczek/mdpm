/*
* generated by Xtext
*/
package com.lowcoupling.mdpm.lng.resources.parser.antlr;

import java.io.InputStream;

import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ResourcesAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.tokens");
	}
}
