package com.lowcoupling.mdpm.lng.plan.ui;
import org.eclipse.emf.ecore.EObject;

import com.lowcoupling.mdpm.lng.plan.plan.Activity;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityGroup;
import com.lowcoupling.mdpm.lng.plan.plan.CheckPoint;
import com.lowcoupling.mdpm.lng.plan.plan.Program;
import com.lowcoupling.mdpm.lng.plan.plan.Project;

import java.util.regex.Pattern;

import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
 
public class PlanDocumentationProvider implements IEObjectDocumentationProvider {
 
    
	@Override
    public String getDocumentation(EObject o) {
        if (o instanceof Activity) {
            return ((Activity)o).getDescription().replaceAll(Pattern.quote("*"),"").replaceAll(Pattern.quote("/"),"");
        }
        if (o instanceof Project) {
            return ((Project)o).getDescription().replaceAll(Pattern.quote("*"),"").replaceAll(Pattern.quote("/"),"");
        }
        if (o instanceof Program) {
            return ((Program)o).getDescription().replaceAll(Pattern.quote("*"),"").replaceAll(Pattern.quote("/"),"");
        }
        if (o instanceof CheckPoint) {
            return ((CheckPoint)o).getDescription().replaceAll(Pattern.quote("*"),"").replaceAll(Pattern.quote("/"),"");
        }
        if (o instanceof ActivityGroup) {
            return ((ActivityGroup)o).getDescription().replaceAll(Pattern.quote("*"),"").replaceAll(Pattern.quote("/"),"");
        }
        return null;
    }
 
}