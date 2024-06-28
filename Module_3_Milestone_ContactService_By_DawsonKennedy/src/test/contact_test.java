package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class contact_test {

	@Test
	public void testContactCreation() {
		Contact contact = new Contact("1234567890", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		assertEquals("1234567890", contact.getContactId());
		assertEquals("Anakin", contact.getFirstName());
		assertEquals("Skywalker", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123 Jedi Temple Ave", contact.getAddress());
	}
	
	@Test
	public void testInvalidContactId() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		});
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345678901", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		});
	}
	
	@Test
	public void testInvalidFirstName() {
		assertThrows(IllegalArgumentException.class() -> {
			new Contact("1234567890", null, "Skywalker", "1234567890", "123 Jedi Temple Ave");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "AnakinAnakinAnakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		});
	}
	
	@Test
	public void testInvalidLastName() {
		assertThrows(IllegalArgumentException.class() -> {
			new Contact("1234567890", "Anakin", null, "1234567890", "123 Jedi Temple Ave");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Anakin", "SkywalkerSkywalkerSkywalker", "1234567890", "123 Jedi Temple Ave");
		});
	}
	@Test
	public void testInvalidPhone() {
		assertThrows(IllegalArgumentException.class() -> {
			new Contact("1234567890", "Anakin", "Skywalker", null, "123 Jedi Temple Ave");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Anakin", "Skywalker", "123456789", "123 Jedi Temple Ave");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Anakin", "Skywalker", "12345678901", "123 Jedi Temple Ave");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Anakin", "Skywalker", "OrderSixtySix", "123 Jedi Temple Ave");
		});
	}
	
	@Test
	public void testInvalidAddress() {
		assertThrows(IllegalArgumentException.class() -> {
			new Contact("1234567890", "Anakin", "Skywalker", "1234567890", null);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple AveJedi Temple AveJedi Temple Ave");
		});
	}
	
	@Test
	public void testsetFirstName() {
		contact.contact contact = new Contact("1234567890", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		contact.setFirstName("Luke");
		assertEquals("Luke", contact.getFirstName());
		
		assertThrows(IllegalArgumentException.class,() -> {
			contact.setFirstName(null);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName("LukeLukeLuke");
		});
	}
	
	@Test
	public void testSetLastname() {
		contact.contact contact = new Contact("1234567890", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		contact.setLastName("Starkiller");
		assertEquals("Starkiller", contact.getLastName());
		
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName(null);
		});
	}
	
	@Test
	public void testSetPhone() {
		contact.contact contact = new Contact("1234567890", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		contact.setPhone("0987654321");
		assertEquals("0987654321", contact.getPhone());
		
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone(null);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone("123456789");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone("12345678901");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone("OrderSixtySix");
		});
	}
	
	@Test
	public void testSetAddress() {
		contact.contact contact = new Contact("1234567890", "Anakin", "Skywalker", "1234567890", "123 Jedi Temple Ave");
		contact.setAddress("066 Vaders Castle Rd");
		assertEquals("066 Vaders Castle Rd", contact.getAddress());
		
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress(null);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress("501st Clone Army WayClone Army WayClone Army Way");
		});
	}
}
