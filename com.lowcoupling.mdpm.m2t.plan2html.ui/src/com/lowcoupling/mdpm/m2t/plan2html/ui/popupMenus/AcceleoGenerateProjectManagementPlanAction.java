/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package com.lowcoupling.mdpm.m2t.plan2html.ui.popupMenus;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

import com.lowcoupling.mdpm.m2t.plan2html.main.GanttImageExporter;
import com.lowcoupling.mdpm.m2t.plan2html.main.OccupationImageExporter;
import com.lowcoupling.mdpm.m2t.plan2html.main.WBSImageExporter;
import com.lowcoupling.mdpm.m2t.plan2html.ui.Activator;
import com.lowcoupling.mdpm.m2t.plan2html.ui.common.GenerateAll;
import com.lowcoupling.mdpm.m2t.plan2html.ui.common.PMPGenerationDialog;

/**
 * Project Management Plan code generation.
 */
public class AcceleoGenerateProjectManagementPlanAction extends ActionDelegate implements IActionDelegate {

	/**
	 * Selected model files.
	 */
	protected List<IFile> files;

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		Display display = PlatformUI.getWorkbench().getDisplay();
		PMPGenerationDialog dialog = new PMPGenerationDialog(display.getActiveShell());
		int result = dialog.open();
		//System.out.println("RESULT "+result);
		if (result==0){
			if (files != null) {
				IRunnableWithProgress operation = new IRunnableWithProgress() {
					public void run(IProgressMonitor monitor) {
						try {
							Iterator<IFile> filesIt = files.iterator();
							while (filesIt.hasNext()) {
								IFile model = (IFile)filesIt.next();
								URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
								try {
									GanttImageExporter.setCurrentModel(model);
									OccupationImageExporter.setCurrentModel(model);	
									WBSImageExporter.setCurrentModel(model);;

									IFolder docsFolder = model.getProject().getFolder("/docs");
									if(docsFolder.exists()){
										docsFolder.delete(true, null);
									}
									docsFolder.create(true,false,null);

									IContainer target = model.getProject().getFolder("docs");

									GenerateAll generator = new GenerateAll(modelURI, target, getArguments());
									generator.doGenerate(monitor);

									//URL fileURL =  Platform.getBundle("com.lowcoupling.mdpm.m2t.plan2html.ui").getEntry("css/bootstrap.css");
									//InputStream in = fileURL.openConnection().getInputStream();
									//IFolder planFolder = model.getProject().getFolder("/docs/css");
									//planFolder.create(true,false,null);
									//IFile planFile = model.getProject().getFile("/docs/css/bootstrap.css");
									//planFile.create(in, true, null);
									//in.close();


								} catch (IOException e) {
									IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
									Activator.getDefault().getLog().log(status);
								} finally {
									model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
								}
							}
						} catch (CoreException e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
							Activator.getDefault().getLog().log(status);
						}
					}
				};
				try {
					PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
				} catch (InvocationTargetException e) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				} catch (InterruptedException e) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
	}

	/**
	 * Computes the arguments of the generator.
	 * 
	 * @return the arguments
	 * @generated
	 */
	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}

}