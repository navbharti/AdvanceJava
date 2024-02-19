package nav.bharti.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String houseNo;
	private String street;
	private String city;
	private String state;
	private String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String houseNo, String street, String city, String state, String country) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		city = city;
		state = state;
		country = country;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", City=" + city + ", State=" + state
				+ ", Country=" + country + "]";
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		country = country;
	}
	
	
}
