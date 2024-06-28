package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contact.contact;


class contactservice_test {

	@BeforeEach
	public void setUp() {
		contactService = new ContactService();
	}
	
	@Test
	public void testAddContact() {
		Contact contact = new Contact("1234567890", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		contactService.addCoontact(contact);
		assertEquals(contact, ContactService.getContact("1234567890"));
	}
	
	@Test
	public void testAddDuplicateContact() {
		Contact contact1 = new Contact("1234567890", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		Contact contact2 = new Contact("1234567890", "Luke", "Skywalker", "1234567890", "456 Dagobah Swamps Ln");
		conatctService.addContact(contact1);
		asserThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(contact2);
		});
	}
	
	@Test
	public void testDeleteContact() {
		Contact contact = new Contact("1234567890", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		contactService.addContact(contact);
		contactService.delteContact("1234567890");
		assertNull(contactService.getContact("1234567890"));
	}
	
	@Test
	public void testUpdateContact() {
		Contact contact = new Contact("1234567890", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		contactService.addContact(contact);
		contactService.updateContact("1234567890", "Luke", "Skywalker", "1234567890", "456 Dagobah Swamps Ln");
		contact updateContact = contactService.getContact("1234567890");
		assertEquals("Luke", updateContact.getFirstName());
		assertEquals("Skywalker", updateContact.getLastName());
		assertEquals("0987654321", updateContact.getPhone());
		assertEquals("456 Dagobah Swamps Ln", updateContact.getAddress());
	}
	
	@Test
	public voidtestUpdateNonExistentContact() {
		assertThrows(IllegalArgumentException.class, () -> {
			contactService.updateContact("nonexistent", "Luke", "Skywalker", "0987654321", "456 Dagobah Swamps Ln");
		});
	}
}
