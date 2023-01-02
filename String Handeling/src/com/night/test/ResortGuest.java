package com.night.test;

public class ResortGuest {
	
	private int guestId;
	private String guestName;
	private String dateOfBooking;
	private int noOfRoomsBooked;
	private String mealOption;
	private double totalBill;
	
	public void ResortGuest(int guestId,String guestName,String dateOfBooking,int noOfRoomsBooked,String mealOption,double totalBill) {
		this.guestId=guestId;
		this.guestName=guestName;
		this.dateOfBooking=dateOfBooking;
		this.noOfRoomsBooked=noOfRoomsBooked;
		this.mealOption=mealOption;
		this.totalBill=totalBill;
	}
	
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
	public String getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public int getNoOfRoomsBooked() {
		return noOfRoomsBooked;
	}
	public void setNoOfRoomsBooked(int noOfRoomsBooked) {
		this.noOfRoomsBooked = noOfRoomsBooked;
	}
	public String getMealOption() {
		return mealOption;
	}
	public void setMealOption(String mealOption) {
		this.mealOption = mealOption;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	
	

}
