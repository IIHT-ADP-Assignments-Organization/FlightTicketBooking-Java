package in.flightTicketBooking.service;

import in.flightTicketBooking.model.User;

public interface LoginService {
	boolean register(User user);
	boolean login(String userName,String password);
	boolean resetPassword(String userName,String password);
}
