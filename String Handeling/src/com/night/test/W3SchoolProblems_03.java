package com.night.test;

import java.util.Calendar;

//15. Write a Java program to print current date and time in the specified format.

public class W3SchoolProblems_03 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println("Current Date and Time :");
		System.out.format("%tB %te, %tY%n", c, c, c);
		System.out.format("%tl:%tM %tp%n", c, c, c);
	}

}
