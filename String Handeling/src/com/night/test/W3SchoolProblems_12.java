package com.night.test;

/* 
24. Write a Java program to replace a specified character with another character. Go to the editor

		Sample Output:

		Original string: The quick brown fox jumps over the lazy dog.                                                 
		New String:      The quick brown fox jumps over the lazy fog.
 */

class W3SchoolProblems_12 {

	public static void main(String[] args) {

		String oldStr = "The quick brown fox jumps over the lazy dog.";
		String newStr = oldStr.replace("d", "f");

		System.out.println("Original string: " + oldStr);
		System.out.println("New String: " + newStr);

	}
}