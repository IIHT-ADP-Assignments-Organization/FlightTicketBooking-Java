package in.flightTicketBooking.dao;

import in.flightTicketBooking.model.Flight;

public interface GuestDao {
	Flight getFlight(Flight from, Flight to);
}
