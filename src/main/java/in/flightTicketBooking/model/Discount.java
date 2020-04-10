package in.flightTicketBooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Discount")
public class Discount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "discId")
	private String discId;
	@Column(name = "couponCode")
	private String couponCode;
	@Column(name = "discount")
	private String discount;
	@Column(name = "validityStartDate")
	private String validityStartDate;
	@Column(name = "validityEndDate")
	private String validityEndDate;
	public String getDiscId() {
		return discId;
	}
	public void setDiscId(String discId) {
		this.discId = discId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getValidityStartDate() {
		return validityStartDate;
	}
	public void setValidityStartDate(String validityStartDate) {
		this.validityStartDate = validityStartDate;
	}
	public String getValidityEndDate() {
		return validityEndDate;
	}
	public void setValidityEndDate(String validityEndDate) {
		this.validityEndDate = validityEndDate;
	}
}
