package in.flightTicketBooking.service;

import java.util.List;

import in.flightTicketBooking.model.Airline;

public interface AirlineService {	
	int saveAirline(Airline airline);
	Airline getAirline(int airlineId);
	List<Airline> listAirline();
	boolean updateAirline(Airline airline);
	boolean deleteAirlinet(Airline airline);
}
