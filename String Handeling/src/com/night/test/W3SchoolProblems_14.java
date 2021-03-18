package com.night.test;

/* 
27. Write a Java program to get a substring of a given string between two specified positions. Go to the editor
	
	Sample Output:
	
	old = The quick brown fox jumps over the lazy dog.                                                            
	new = brown fox jumps
 */

class W3SchoolProblems_14 {

	public static void main(String[] args) {

		String oldStr = "The quick brown fox jumps over the lazy dog.";

		String newStr = oldStr.substring(10, 25);

		System.out.println(newStr);

	}
}