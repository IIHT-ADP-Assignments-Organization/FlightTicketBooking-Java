package in.flightTicketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.flightTicketBooking.dao.LoginDao;
import in.flightTicketBooking.model.User;
@Component
@Service("LoginService")

public class loginServiceImpl implements LoginService {
	@Autowired
	LoginDao loginserviceDao;

	@Transactional
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean resetPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
