package in.flightTicketBooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Airline")
public class Airline {
	@Id
	@Column(name = "aId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	@Column(name = "airlineName")
	private String airlineName;
	@Column(name = "logoUrl")
	private String logoUrl;
	@Column(name = "briefDescription")
	private String briefDescription;
	@Column(name = "contactDetails")
	private String contactDetails;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getBriefDescription() {
		return briefDescription;
	}
	public void setBriefDescription(String briefDescription) {
		this.briefDescription = briefDescription;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
}
