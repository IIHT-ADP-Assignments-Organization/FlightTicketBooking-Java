package in.flightTicketBooking.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.flightTicketBooking.model.Admin;
import in.flightTicketBooking.model.User;
@Component
@Service("AdminService")
public class AdminServiceImpl implements AdminService {

	@Override
	public int saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getAdmin(int fId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

}
