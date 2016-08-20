package org.eclipsercp.hyperbola;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.part.ViewPart;

public class ContactsView extends ViewPart {
	
	public static final String ID = "org.eclipsercp.hyperbola.views.contacts";
	private TreeViewer treeViewer;

	public ContactsView() {
		super();
	}

	@Override
	public void createPartControl(Composite parent) {
		treeViewer = new TreeViewer(parent, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		getSite().setSelectionProvider(treeViewer);
		treeViewer.setContentProvider(new BaseWorkbenchContentProvider());
		treeViewer.setInput("input");

	}

	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();
	}

}
