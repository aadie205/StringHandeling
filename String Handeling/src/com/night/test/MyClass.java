package com.night.test;

import java.util.Arrays;
import java.util.Scanner;

class MyClass extends ResortGuest {
	
	public static int findNumberOfRoomsBookedInMonth(ResortGuest[] ObjArray, String  givenDate) {
		int totalBookings=0;
		ResortGuest []rs=ObjArray;
		
		for(int i=0; i<ObjArray.length; i++) {
			
			String date[]= rs[i].getDateOfBooking().split("-");
			String actDate=date[1];
			
			if(actDate==givenDate) {
				totalBookings++;
			}
		}
		return totalBookings;	
			
	}
	
	
	public static ResortGuest searchResortGuestByMealOpted (ResortGuest[] ObjArray,String givenMeal) {
		//return resortgues object with second highest totalbill if meal option matches
		ResortGuest []rs=ObjArray;
		double guestBill[]=new double[rs.length];
		
		for(int i=0; i<ObjArray.length; i++) {
			guestBill[i]=rs[i].getTotalBill();
		}
		Arrays.sort(guestBill);
		int guestNo=guestBill.length-2;
		
		for(int i=0; i<ObjArray.length; i++) {
			
			String mealOption = rs[i].getMealOption();
			if(rs[guestNo].getMealOption()==givenMeal) {
				return rs[guestNo];
			}	
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ResortGuest rs1=new ResortGuest();
		
		rs1.setGuestId(sc.nextInt());
		rs1.setGuestName(sc.next());
		rs1.setDateOfBooking(sc.next());
		rs1.setNoOfRoomsBooked(sc.nextInt());
		rs1.setMealOption(sc.next());
		rs1.setTotalBill(sc.nextDouble());
		
		ResortGuest rs2=new ResortGuest();
		
		rs2.setGuestId(sc.nextInt());
		rs2.setGuestName(sc.next());
		rs2.setDateOfBooking(sc.next());
		rs2.setNoOfRoomsBooked(sc.nextInt());
		rs2.setMealOption(sc.next());
		rs2.setTotalBill(sc.nextDouble());
		
		ResortGuest rs3=new ResortGuest();
		
		rs3.setGuestId(sc.nextInt());
		rs3.setGuestName(sc.next());
		rs3.setDateOfBooking(sc.next());
		rs3.setNoOfRoomsBooked(sc.nextInt());
		rs3.setMealOption(sc.next());
		rs3.setTotalBill(sc.nextDouble());
		
		ResortGuest rs4=new ResortGuest();
		
		rs4.setGuestId(sc.nextInt());
		rs4.setGuestName(sc.next());
		rs4.setDateOfBooking(sc.next());
		rs4.setNoOfRoomsBooked(sc.nextInt());
		rs4.setMealOption(sc.next());
		rs4.setTotalBill(sc.nextDouble());
		
		String fromDate=sc.next();
		String meal=sc.next();
		
		
		int noOfRooms = findNumberOfRoomsBookedInMonth(new ResortGuest[]{rs1,rs2,rs3,rs4}, fromDate);
		if(noOfRooms==0) {
			System.out.println("No rooms booked");
		}
		else {
			System.out.println(noOfRooms+" booked");
		}
		
		ResortGuest rs = searchResortGuestByMealOpted(new ResortGuest[]{rs1,rs2,rs3,rs4}, meal);
		if(rs!=null) {
			System.out.println(rs.getMealOption());
		}
		else
			System.out.println("No such meal");
	}

}
