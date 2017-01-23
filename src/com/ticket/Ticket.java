package com.ticket;

import java.util.Date;

public class Ticket {

	private String country;
	private String city;
	private String doj;
	private String flightNo;
	private int seatNo;
	private String checkInCounter;
	private int ticketNo;
	private String passportNo;
	private String expirydate;
	private String gender;
public Ticket(){
		
	}
	public Ticket(String country, String city, String doj, String flightNo,
			int seatNo, String checkInCounter, int ticketNo, String passportNo,
			String expirydate, String gender) {
		super();
		this.country = country;
		this.city = city;
		this.doj = doj;
		this.flightNo = flightNo;
		this.seatNo = seatNo;
		this.checkInCounter = checkInCounter;
		this.ticketNo = ticketNo;
		this.passportNo = passportNo;
		this.expirydate = expirydate;
		this.gender = gender;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getCheckInCounter() {
		return checkInCounter;
	}
	public void setCheckInCounter(String checkInCounter) {
		this.checkInCounter = checkInCounter;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	
	
}
