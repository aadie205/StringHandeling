package com.night.test;

//10. Write a Java program to compare a given string to the specified string buffer.
public class W3SchoolProblems_01 {

	public static void main(String[] args) {
		String str1 = "example.com";
		String str2 = "Example.com";

		StringBuffer sb = new StringBuffer(str1);

		System.out.println("Comparing " + str2 + " and " + sb + ": " + str1.contentEquals(sb));
		System.out.println("Comparing " + str1 + " and " + sb + ": " + str2.contentEquals(sb));
	}

}
