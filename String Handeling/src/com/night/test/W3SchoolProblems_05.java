package com.night.test;

/*
	17. Write a Java program to get the contents of a given string as a character array.
	Sample output: 
			The char array equals "[C@2a139a55"
 */

public class W3SchoolProblems_05 {

	public static void main(String[] args) {
		String str = "String array";

		char ch[] = str.toCharArray();
		System.out.println("The char array equals: " + ch);
	}
}
