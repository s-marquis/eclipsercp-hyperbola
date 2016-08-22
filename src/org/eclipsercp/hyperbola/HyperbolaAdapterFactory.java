package org.eclipsercp.hyperbola;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipsercp.hyperbola.model.ContactsGroup;

public class HyperbolaAdapterFactory implements IAdapterFactory {

	public static IWorkbenchAdapter groupAdapter = new IWorkbenchAdapter() {
		
		@Override
		public Object getParent(Object o) {
			return null;
		}
		
		@Override
		public String getLabel(Object o) {
			return ((ContactsGroup)o).getName();
		}
		
		@Override
		public ImageDescriptor getImageDescriptor(Object object) {
			return null;
		}
		
		@Override
		public Object[] getChildren(Object o) {
			return ((ContactsGroup)o).getEntries();
		}
	};
	
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		return (adapterType == ContactsGroup.class && adaptableObject instanceof ContactsGroup ? groupAdapter : null);
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[] {IWorkbenchAdapter.class };
	}

}
