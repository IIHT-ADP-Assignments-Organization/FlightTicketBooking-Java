package in.flightTicketBooking.dao;

import java.util.List;

import in.flightTicketBooking.model.Airline;

public interface AirlineDao {
	
	int saveAirline(Airline airline);

	Airline getAirline(int airlineId);

	List<Airline> listAirline();

	boolean updateAirline(Airline airline);

	boolean deleteAirlinet(Airline airline);
}
