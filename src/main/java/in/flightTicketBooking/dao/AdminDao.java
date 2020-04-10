package in.flightTicketBooking.dao;

import java.util.List;

import in.flightTicketBooking.model.Admin;
import in.flightTicketBooking.model.User;

public interface AdminDao {
	
	int saveAdmin(Admin admin);
	
	User getAdmin(int adminId);
	  
	List<Admin> list();
	  
	boolean updateAdmin(Admin admin);
	  
	boolean deleteAdmin(Admin admin);
}
