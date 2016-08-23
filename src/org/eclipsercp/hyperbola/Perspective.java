package org.eclipsercp.hyperbola;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.PlatformUI;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		// layout.addView(ContactsView.ID, IPageLayout.LEFT, 1.0f,
		layout.addStandaloneView(ContactsView.ID, false, IPageLayout.LEFT,
				0.5f, layout.getEditorArea());
	}
}
