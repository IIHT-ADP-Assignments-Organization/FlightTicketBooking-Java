package in.flightTicketBooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Flight")
public class Flight {
	@Id
	@Column(name = "fId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fId;
	
	@Column(name = "flightNo")
	private String flightNo;
	
	@Column(name = "airlineNo")
	private String airline;
	
	@Column(name = "from")
	private String from;
	
	@Column(name = "to")
	private String to;
	
	@Column(name = "startDateTime")
	private String startDateTime;
	
	@Column(name = "endDateTime")
	private String endDateTime;
	
	@Column(name = "scheduledDay")
	private String scheduledDay;
	
	@Column(name = "instrumentUsed")
	private String instrumentUsed;	
	
	@Column(name = "totalBussinessSeats")
	private int totalBussinessSeats;
	
	@Column(name = "totalNonBussinessSeats")	
	private int totalNonBussinessSeats;
	
	@Column(name = "tickateCost")
	private long tickateCost;
	
	@Column(name = "noOfRows")
	private String noOfRows;
	
	@Column(name = "noOfColumns")
	private String noOfColumns;
	
	@Column(name = "meal")
	private String meal;

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getScheduledDay() {
		return scheduledDay;
	}

	public void setScheduledDay(String scheduledDay) {
		this.scheduledDay = scheduledDay;
	}

	public String getInstrumentUsed() {
		return instrumentUsed;
	}

	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}

	public int getTotalBussinessSeats() {
		return totalBussinessSeats;
	}

	public void setTotalBussinessSeats(int totalBussinessSeats) {
		this.totalBussinessSeats = totalBussinessSeats;
	}

	public int getTotalNonBussinessSeats() {
		return totalNonBussinessSeats;
	}

	public void setTotalNonBussinessSeats(int totalNonBussinessSeats) {
		this.totalNonBussinessSeats = totalNonBussinessSeats;
	}

	public long getTickateCost() {
		return tickateCost;
	}

	public void setTickateCost(long tickateCost) {
		this.tickateCost = tickateCost;
	}

	public String getNoOfRows() {
		return noOfRows;
	}

	public void setNoOfRows(String noOfRows) {
		this.noOfRows = noOfRows;
	}

	public String getNoOfColumns() {
		return noOfColumns;
	}

	public void setNoOfColumns(String noOfColumns) {
		this.noOfColumns = noOfColumns;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	
}
