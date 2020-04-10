package in.flightTicketBooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Guest")
public class Guest {
	@Id
	@Column(name = "guestId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guestId;

	@Column(name = "guestName")
	private String guestName;

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
}
