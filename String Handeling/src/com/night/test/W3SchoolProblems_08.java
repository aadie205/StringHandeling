package com.night.test;

/*
	
	20. Write a Java program to get the canonical representation of the string object. Go to the editor
		
		Sample Output:
		
		str1 == str2? false                                                                                           
		str1 == str3? true
	
	*/

public class W3SchoolProblems_08 {

	public static void main(String[] args) {
		String str1 = "Java Exercise";
		String str2 = new StringBuffer("Java ").append("Exercise").toString();
		String str3 = str2.intern();

		System.out.println("str1==str2? " + (str1 == str2));
		System.out.println("str1==str3? " + (str1 == str3));

	}
}
