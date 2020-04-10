package in.flightTicketBooking.service;

import java.util.List;

import in.flightTicketBooking.model.Booking;

public interface BookingService {	
	int saveBooking(Booking booking);
	Booking getBooking(int bookingId);
	List<Booking> listBooking();
	boolean updateBooking(Booking booking);
	boolean deleteBooking(Booking booking);
}
