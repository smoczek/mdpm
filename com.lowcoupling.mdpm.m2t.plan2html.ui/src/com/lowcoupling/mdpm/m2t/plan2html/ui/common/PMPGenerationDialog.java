package com.lowcoupling.mdpm.m2t.plan2html.ui.common;


import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class PMPGenerationDialog extends Dialog {

	public PMPGenerationDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
	
	   /*
		* The GridLayout of the dialog area
		*/	 
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout compositeLayout = new GridLayout();
		compositeLayout.numColumns = 5;
		compositeLayout.horizontalSpacing = 30;
		compositeLayout.verticalSpacing = 10;
		compositeLayout.marginHeight = 10;
		compositeLayout.marginWidth = 30;
		compositeLayout.makeColumnsEqualWidth=true;
		composite.setLayout(compositeLayout);
		GridData compositeData = new GridData();
		compositeData.grabExcessHorizontalSpace = false;
		compositeData.widthHint=600;
		composite.setLayoutData(compositeData);

		/*
		 * the composite data of the dialog area
		 */
		composite.getShell().setText("PMP Generation Options");
	
		GridData gridData = new GridData();
		Group generics = new Group(composite, SWT.FILL);
		generics.setText("");
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 5;
		generics.setLayout(gridLayout);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 5;
		generics.setLayoutData(gridData);
		
		Label label = new Label(generics, SWT.FILL);
		label.setText("Format:"); 
		
		Combo formats = new Combo(generics, SWT.FILL);
		formats.setItems(new String [] {"HTML", "Doc. (OpenXML)"});
		formats.select(0); 
		
		label = new Label(generics, SWT.FILL);
		label.setText("File:"); 
		
		Text fileText = new Text(generics,SWT.FILL | SWT.BORDER);
		fileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Button button = new Button(generics,SWT.PUSH);
		button.setText("Search");
		button.setLayoutData(new GridData(SWT.SINGLE));
		
		//intro
		//gridData = new GridData();
		
		{
			
		Group intro = new Group(composite, SWT.FILL);
		intro.setText("Intro");
		gridLayout = new GridLayout();
		gridLayout.numColumns = 4;
		intro.setLayout(gridLayout);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 5;
		intro.setLayoutData(gridData);
		
		label = new Label(intro, SWT.NONE);
		label.setText("Generate Section");
		new Button(intro, SWT.CHECK); 
		
		label = new Label(intro, SWT.NONE);
		label.setText("Heading");
		Text headingText =  new Text(intro, SWT.FILL|SWT.BORDER);
		headingText.setText("Introduction");
	    GridData headingGridLayout= new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		headingGridLayout.horizontalSpan=1;
	 	headingText.setLayoutData(headingGridLayout);
		
	 	new Label(intro, SWT.NULL).setText("Generate Purpose ");
		//ownerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		new Button(intro, SWT.CHECK); 
		new Label(intro, SWT.NULL).setText("Sub Heading");
		Text purpose = new Text(intro, SWT.FILL | SWT.BORDER);
		purpose.setText("Purpose");
		gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		purpose.setLayoutData(gridData);
		
		new Label(intro, SWT.NULL).setText("Generate Assumptions and Constraints ");
		//ownerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		new Button(intro, SWT.CHECK); 
		
		new Label(intro, SWT.NULL).setText("Sub Heading");
		Text assumptions = new Text(intro, SWT.SINGLE | SWT.BORDER);
		assumptions.setText("Assumptions and Constraints");
		}		
		
		{
			Group intro = new Group(composite, SWT.FILL);
			intro.setText("Schedule & Time Management");
			gridLayout = new GridLayout();
			gridLayout.numColumns = 4;
			intro.setLayout(gridLayout);
			gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
			gridData.horizontalSpan = 5;
			intro.setLayoutData(gridData);
			
			label = new Label(intro, SWT.NONE);
			label.setText("Generate Section");
			new Button(intro, SWT.CHECK); 
			
			label = new Label(intro, SWT.NONE);
			label.setText("Heading");
			Text headingText =  new Text(intro, SWT.FILL|SWT.BORDER);
			headingText.setText("Introduction");
		    GridData headingGridLayout= new GridData(GridData.HORIZONTAL_ALIGN_FILL);
			headingGridLayout.horizontalSpan=1;
		 	headingText.setLayoutData(headingGridLayout);
			
		 	new Label(intro, SWT.NULL).setText("Generate Purpose ");
			//ownerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			new Button(intro, SWT.CHECK); 
			new Label(intro, SWT.NULL).setText("Sub Heading");
			Text purpose = new Text(intro, SWT.FILL | SWT.BORDER);
			purpose.setText("Purpose");
			gridData = new GridData();
			gridData.horizontalAlignment = GridData.FILL;
			purpose.setLayoutData(gridData);
			
			new Label(intro, SWT.NULL).setText("Generate Assumptions and Constraints ");
			//ownerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			new Button(intro, SWT.CHECK); 
			
			new Label(intro, SWT.NULL).setText("Sub Heading");
			Text assumptions = new Text(intro, SWT.SINGLE | SWT.BORDER);
			assumptions.setText("Assumptions and Constraints");
			}
		
		{
			Group intro = new Group(composite, SWT.FILL);
			intro.setText("Costs & Budget");
			gridLayout = new GridLayout();
			gridLayout.numColumns = 4;
			intro.setLayout(gridLayout);
			gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
			gridData.horizontalSpan = 5;
			intro.setLayoutData(gridData);
			
			label = new Label(intro, SWT.NONE);
			label.setText("Generate Section");
			new Button(intro, SWT.CHECK); 
			
			label = new Label(intro, SWT.NONE);
			label.setText("Heading");
			Text headingText =  new Text(intro, SWT.FILL|SWT.BORDER);
			headingText.setText("Introduction");
		    GridData headingGridLayout= new GridData(GridData.HORIZONTAL_ALIGN_FILL);
			headingGridLayout.horizontalSpan=1;
		 	headingText.setLayoutData(headingGridLayout);
			
		 	new Label(intro, SWT.NULL).setText("Generate Purpose ");
			//ownerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			new Button(intro, SWT.CHECK); 
			new Label(intro, SWT.NULL).setText("Sub Heading");
			Text purpose = new Text(intro, SWT.FILL | SWT.BORDER);
			purpose.setText("Purpose");
			gridData = new GridData();
			gridData.horizontalAlignment = GridData.FILL;
			purpose.setLayoutData(gridData);
			
			new Label(intro, SWT.NULL).setText("Generate Assumptions and Constraints ");
			//ownerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			new Button(intro, SWT.CHECK); 
			
			new Label(intro, SWT.NULL).setText("Sub Heading");
			Text assumptions = new Text(intro, SWT.SINGLE | SWT.BORDER);
			assumptions.setText("Assumptions and Constraints");
			}
		
		{
			Group intro = new Group(composite, SWT.FILL);
			intro.setText("Quality Management");
			gridLayout = new GridLayout();
			gridLayout.numColumns = 4;
			intro.setLayout(gridLayout);
			gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
			gridData.horizontalSpan = 5;
			intro.setLayoutData(gridData);
			
			label = new Label(intro, SWT.NONE);
			label.setText("Generate Section");
			new Button(intro, SWT.CHECK); 
			
			label = new Label(intro, SWT.NONE);
			label.setText("Heading");
			Text headingText =  new Text(intro, SWT.FILL|SWT.BORDER);
			headingText.setText("Introduction");
		    GridData headingGridLayout= new GridData(GridData.HORIZONTAL_ALIGN_FILL);
			headingGridLayout.horizontalSpan=1;
		 	headingText.setLayoutData(headingGridLayout);
			
		 	new Label(intro, SWT.NULL).setText("Generate Purpose ");
			//ownerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			new Button(intro, SWT.CHECK); 
			new Label(intro, SWT.NULL).setText("Sub Heading");
			Text purpose = new Text(intro, SWT.FILL | SWT.BORDER);
			purpose.setText("Purpose");
			gridData = new GridData();
			gridData.horizontalAlignment = GridData.FILL;
			purpose.setLayoutData(gridData);
			
			new Label(intro, SWT.NULL).setText("Generate Assumptions and Constraints ");
			//ownerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			new Button(intro, SWT.CHECK); 
			
			new Label(intro, SWT.NULL).setText("Sub Heading");
			Text assumptions = new Text(intro, SWT.SINGLE | SWT.BORDER);
			assumptions.setText("Assumptions and Constraints");
			}
		
		{
			Group intro = new Group(composite, SWT.FILL);
			intro.setText("Human Resources Management");
			gridLayout = new GridLayout();
			gridLayout.numColumns = 4;
			intro.setLayout(gridLayout);
			gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
			gridData.horizontalSpan = 5;
			intro.setLayoutData(gridData);
			
			label = new Label(intro, SWT.NONE);
			label.setText("Generate Section");
			new Button(intro, SWT.CHECK); 
			
			label = new Label(intro, SWT.NONE);
			label.setText("Heading");
			Text headingText =  new Text(intro, SWT.FILL|SWT.BORDER);
			headingText.setText("Introduction");
		    GridData headingGridLayout= new GridData(GridData.HORIZONTAL_ALIGN_FILL);
			headingGridLayout.horizontalSpan=1;
		 	headingText.setLayoutData(headingGridLayout);
			
		 	new Label(intro, SWT.NULL).setText("Generate Purpose ");
			//ownerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			new Button(intro, SWT.CHECK); 
			new Label(intro, SWT.NULL).setText("Sub Heading");
			Text purpose = new Text(intro, SWT.FILL | SWT.BORDER);
			purpose.setText("Purpose");
			gridData = new GridData();
			gridData.horizontalAlignment = GridData.FILL;
			purpose.setLayoutData(gridData);
			
			new Label(intro, SWT.NULL).setText("Generate Assumptions and Constraints ");
			//ownerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			new Button(intro, SWT.CHECK); 
			
			new Label(intro, SWT.NULL).setText("Sub Heading");
			Text assumptions = new Text(intro, SWT.SINGLE | SWT.BORDER);
			assumptions.setText("Assumptions and Constraints");
			}
		//    Button button = new Button(composite, SWT.PUSH);
		//    Label l1 = new Label(composite, SWT.NONE);
		//    l1.setText("Format: ");
		//    
		//    button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
		//        false));
		//    button.setText("Press me");
		//    button.addSelectionListener(new SelectionAdapter() {
		//      @Override
		//      public void widgetSelected(SelectionEvent e) {
		//        System.out.println("Pressed");
		//      }
		//    });
		
		//composite.pack();
		composite.getShell().pack();
		return composite;
	}

	// overriding this methods allows you to set the
	// title of the custom dialog
	  @Override
	  protected void configureShell(Shell newShell) {
	    super.configureShell(newShell);
	    
	  }
	
	@Override
	protected Point getInitialSize() {
		return new Point(600, 300);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		//super.createButtonsForButtonBar(parent);
	}

} 