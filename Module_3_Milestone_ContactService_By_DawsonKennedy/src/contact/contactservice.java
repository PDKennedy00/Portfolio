package contact;

import java.util.HashMap;
import java.util.Map;

public class contactservice {
	private Map<String, Contact> contacts = new HashMap<>();
	
	public void addContact(Contact contact) {
		if(contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact ID already exists");
		}
		contacts.put(contact.getContactId(), contact);
	}
	
	public void deleteContact(String contactId) {
		if(!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		contacts.remove(contactId);
	}
	
	public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
		Contact contact = contacts.get(contactId);
		if (contact == null) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		
		if (firstName != null) {
			contact.setFirstName(firstName);
			
		}
		
		if (lastName != null) {
			contact.setLastName(lastName);
			
		}
		
		if (phone != null) {
			contact.setPhone(phone);
			
		}
		
		if (address != null) {
			contact.setAddress(address);
			
		}
	}
	
	public Contact getContact(String contactId) {
		return contacts.get(contactId);
	}
}
