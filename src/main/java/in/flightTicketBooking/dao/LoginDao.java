package in.flightTicketBooking.dao;

import in.flightTicketBooking.model.User;

public interface LoginDao {

	boolean register(User user);
	boolean login(String userName,String password);
	boolean resetPassword(String userName,String password);
}
