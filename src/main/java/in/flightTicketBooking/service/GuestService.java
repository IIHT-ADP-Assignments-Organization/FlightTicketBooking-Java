package in.flightTicketBooking.service;

import in.flightTicketBooking.model.Flight;

public interface GuestService {
	Flight getFlight(Flight from, Flight to);
}
