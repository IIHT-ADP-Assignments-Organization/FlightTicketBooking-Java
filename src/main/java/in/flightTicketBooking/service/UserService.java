package in.flightTicketBooking.service;

import java.util.List;

import in.flightTicketBooking.model.User;

public interface UserService {
	int saveUser(User user);
	User getUser(int userId);
	List<User> listUser();
	boolean updateUser(User user);
	boolean deleteUser(User user);
}
