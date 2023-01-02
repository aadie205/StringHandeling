package com.string.methods;

public class ComparingStringsLexicographically {
	public static void main(String[] args) {


		//Comparing Strings lexicographically. 
<<<<<<< HEAD
		String s22="abc";
		String s23="abc";
		
		
		
		System.out.println(s22==s23);
		System.out.println(s22.equals(s23));
		System.out.println(s22.compareTo(s23));
		System.out.println(s22.compareToIgnoreCase(s23));
		System.out.println();

		String s24="aBc";
		System.out.println(s22.compareTo(s24));
		System.out.println(s22.compareToIgnoreCase(s24));

		System.out.println(s22.compareTo("ab"));
=======
		String s1="abc";
		String s2="abc";

		System.out.println(s1==s2);
		System.out
		.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println();

		String s3="aBc";
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s3));

		System.out.println(s1.compareTo("ab"));
		
		String s4=new String("abc");
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		
		
		
>>>>>>> branch 'master' of https://github.com/aadie205/StringHandeling.git

	}
}
