package com.night.test;

/*
23. Write a Java program to find whether a region in the current string matches a region in another string. 
	Sample Output:

	str1[0 - 7] == str2[28 - 35]? true                                                                            
	str1[9 - 15] == str2[9 - 15]? false 
 */
class W3SchoolProblems_11 {

	public static void main(String argsp[]) {

		String str1 = "Shanghai Houston Colorado Alexandria";
		String str2 = "Alexandria Colorado Houston Shanghai";

		String s1 = str1.substring(0, 8);
		String s2 = str1.substring(28, 36);
		String s3 = str2.substring(9, 16);
		String s4 = str2.substring(9, 16);

		System.out.println("str[0-7] == str2[28-35]? " + s1.equals(s2));
		System.out.println("str[9-15] == str2[9-15]? " + s3.equals(s3));

	}
}
