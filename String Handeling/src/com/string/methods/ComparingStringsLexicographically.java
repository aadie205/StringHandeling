package com.string.methods;

public class ComparingStringsLexicographically {
	public static void main(String[] args) {


		//Comparing Strings lexicographically. 
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

	}
}
