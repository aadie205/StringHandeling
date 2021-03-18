package com.night.test;

/* 
27. Write a Java program to get a substring of a given string between two specified positions. Go to the editor

	Sample Output:

	old = The quick brown fox jumps over the lazy dog.                                                            
	new = brown fox jumps
 */

class W3SchoolProblems_13 {

	public static void main(String[] args) {
		String str1 = "Red is favorite color.";
		String str2 = "Orange is alos my favorite color.";

		System.out.println(str1 + " starts with Red? " + str1.startsWith("Red"));
		System.out.println(str2 + " starts with Red? " + str2.startsWith("Red"));

	}
}