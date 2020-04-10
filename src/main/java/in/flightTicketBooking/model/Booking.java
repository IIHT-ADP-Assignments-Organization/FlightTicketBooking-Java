package in.flightTicketBooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookingId")
	private int bookingId;
	@Column(name = "flightNo")
	private String flightNo;
	@Column(name = "seatNo")
	private String seatNo;
	@Column(name = "prnNo")
	private String prnNo;
	@Column(name = "typeOfClass")
	private String typeOfClass;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getPrnNo() {
		return prnNo;
	}
	public void setPrnNo(String prnNo) {
		this.prnNo = prnNo;
	}
	public String getTypeOfClass() {
		return typeOfClass;
	}
	public void setTypeOfClass(String typeOfClass) {
		this.typeOfClass = typeOfClass;
	}

}
