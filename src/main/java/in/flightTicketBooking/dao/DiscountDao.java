package in.flightTicketBooking.dao;

import java.util.List;

import in.flightTicketBooking.model.Discount;

public interface DiscountDao {
	int saveDiscount(Discount discount);

	Discount getDiscount(int discId);

	List<Discount> listDiscount();

	boolean updateDiscount(Discount discount);

	boolean deleteDiscount(Discount discount);
}
