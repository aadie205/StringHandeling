package com.night.test;

/*
	18. Write a Java program to create a unique identifier of a given string. Go to the editor

		Sample Output:

		The hash for Python Exercises. is 863132599 
 */

public class W3SchoolProblems_06 {

	public static void main(String[] args) {
		String str = "Python Exercise.";

		System.out.println("The hash for " + str + " is " + str.hashCode());
		System.out.println(System.identityHashCode(str));
	}
}
