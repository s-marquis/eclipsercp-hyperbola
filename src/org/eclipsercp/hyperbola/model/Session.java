package org.eclipsercp.hyperbola.model;

public class Session {

	public ContactsGroup getRoot() {
		ContactsGroup subchild = new ContactsGroup("dev", null);
		ContactsGroup child = new ContactsGroup("pmo", new ContactsGroup[] {subchild});
		ContactsGroup parent = new ContactsGroup("business", new ContactsGroup[] {child}); // not shown
		return parent;
	}

}
