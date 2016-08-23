package org.eclipsercp.hyperbola;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

public class ChatEditor extends EditorPart {
	
	public static String ID = "org.eclipsercp.hyperbola.editors.chat";
	private Text text;

	public ChatEditor() {
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite top = new Composite(parent, 0);
		text = new Text(top, 0);
		text.setMessage("message");
	}

	@Override
	public void setFocus() {
		text.setFocus();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
}
