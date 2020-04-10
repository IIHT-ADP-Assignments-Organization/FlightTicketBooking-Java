package in.flightTicketBooking.service;

import java.util.List;

import in.flightTicketBooking.model.Discount;

public interface DiscountService {
	int saveDiscount(Discount discount);
	Discount getDiscount(int discId);
	List<Discount> listDiscount();
	boolean updateDiscount(Discount discount);
	boolean deleteDiscount(Discount discount);
}
