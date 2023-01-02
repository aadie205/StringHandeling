package com.night.test;

import java.util.Calendar;

/**
 * Write a Java program to get the contents of a given string as a byte array.
 * Go to the editor
 * 
 * Sample Output:
 * 
 * The new String equals This is a sample String.
 * 
 */
public class W3SchoolProblems_04 {

	public static void main(String[] args) {

		String str = "This is a sample String.";
		byte b[] = str.getBytes();

		String str2 = new String(b);
		System.out.println("The new String equals: " + str2);
	}

}
