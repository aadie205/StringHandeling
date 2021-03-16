package com.string.practice;

public class Test01_StringLiteral {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		System.out.println(Night);
		System.out.println("Night");

		String s1 = "Night";
		System.out.println(s1);

//		String s1=Night;
		String Night = "Night";
		System.out.println(Night);

		if (s1.equals("night")) {
			System.out.println("Hello night");
		} else {
			System.out.println("Hello Night");
		}

		s1.concat("King");
		System.out.println(s1);
		
		s1=s1.concat("King");
		System.out.println(s1);
		
		
		
	}// main
}// class
