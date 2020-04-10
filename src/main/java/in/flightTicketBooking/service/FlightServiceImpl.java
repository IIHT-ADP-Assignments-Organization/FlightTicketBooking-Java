package in.flightTicketBooking.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.flightTicketBooking.model.Flight;
@Component
@Service("FlightService")
public class FlightServiceImpl implements FlightService {

	@Override
	public int saveFlight(Flight flight) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Flight getFlight(String from, String to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

}
