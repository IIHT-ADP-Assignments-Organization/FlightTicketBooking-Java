package in.flightTicketBooking.service;

import java.util.List;

import in.flightTicketBooking.model.Admin;
import in.flightTicketBooking.model.User;

public interface AdminService {
	
	int saveAdmin(Admin admin);
	
	User getAdmin(int fId);
	  
	List<Admin> list();
	  
	boolean updateAdmin(Admin admin);
	  
	boolean deleteAdmin(Admin admin);
}
