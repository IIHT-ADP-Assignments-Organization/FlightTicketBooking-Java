package in.flightTicketBooking.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.flightTicketBooking.model.Admin;
import in.flightTicketBooking.model.User;

public class TestBoundary {

	@Test
	public void testUserPasswordLength() {
		User user = new User();
		user.setUserPassword("1234567890");

		int passwordLength = 10;
		assertEquals(passwordLength, user.getUserPassword().length());

	}

	@Test
	public void testUserNameLength() {
		User user = new User();
		user.setUserName("user23");

		int maxChar = 5;
		boolean usernamelength = ((user.getUserName().length()) >= maxChar);
		assertEquals(usernamelength, true);
	}

	@Test
	public void testAdminPasswordLength() {
		Admin admin = new Admin();
		admin.setAdminPassword("1234567890");

		int passwordLength = 10;
		assertEquals(passwordLength, admin.getAdminPassword().length());

	}

	@Test
	public void testAdminUserNameLength() {
		Admin admin = new Admin();
		admin.setAdminName("Admin");

		int maxChar = 5;
		boolean usernamelength = ((admin.getAdminName().length()) >= maxChar);
		assertEquals(usernamelength, true);
	}
}
