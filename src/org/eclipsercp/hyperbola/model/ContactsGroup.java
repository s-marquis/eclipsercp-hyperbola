package org.eclipsercp.hyperbola.model;


public class ContactsGroup extends Contact {

	private final String name;
	private final ContactsGroup[]  entries;

	public ContactsGroup(String name, ContactsGroup[] entries) {
		this.name = name;
		this.entries = entries;
	}
	
	public String getName() {
		return name;
	}
	
	public ContactsGroup[] getEntries() {
		return entries;
	}
}
