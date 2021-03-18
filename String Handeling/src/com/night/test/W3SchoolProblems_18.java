package com.night.test;

/*
31. Write a Java program to trim any leading or trailing whitespace from a given string. Go to the editor

Sample Output:

Original String:  Java Exercises                                                                              
New String: Java Exercises

 */

class W3SchoolProblems_18 {
	public static void main(String args[]) {

		String str = "   Java Exercise";

		String str2 = str.trim();

		System.out.println("Old String: " + str);
		System.out.println("New String: " + str2);

	}
}
