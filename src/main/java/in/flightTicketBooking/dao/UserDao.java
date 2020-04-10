package in.flightTicketBooking.dao;

import java.util.List;

import in.flightTicketBooking.model.User;

public interface UserDao {
	
	int saveUser(User user);
	
	User getUser(int userId);
	  
	List<User> listUser();
	  
	boolean updateUser(User user);
	  
	boolean deleteUser(User user);
	 
}
