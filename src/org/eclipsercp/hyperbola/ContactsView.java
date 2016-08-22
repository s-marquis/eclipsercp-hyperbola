package org.eclipsercp.hyperbola;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.ViewPart;
import org.eclipsercp.hyperbola.model.Contact;
import org.eclipsercp.hyperbola.model.ContactsGroup;
import org.eclipsercp.hyperbola.model.Session;

public class ContactsView extends ViewPart {
	
	public static final String ID = "org.eclipsercp.hyperbola.views.contacts";
	private TreeViewer treeViewer;

	public ContactsView() {
		super();
	}

	@Override
	public void createPartControl(Composite parent) {

		Platform.getAdapterManager().registerAdapters(new HyperbolaAdapterFactory(), Contact.class);

		treeViewer = new TreeViewer(parent, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		getSite().setSelectionProvider(treeViewer);
		treeViewer.setContentProvider(new BaseWorkbenchContentProvider());
		treeViewer.setLabelProvider(new WorkbenchLabelProvider());
		treeViewer.setInput(new Session().getRoot());
		// lastly:
	}

	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();
	}

	
}
