package com.string.methods;

import java.util.Scanner;

public class LengthMethod {

	public static void main(String[] args) {

		
		String[] a= {"a", "b", "c"};
//		System.out.println(a.length());
		System.out.println(a.length);
		
		String s9="a";
		System.out.println(s9.length());
//		System.out.println(s9.length);
		
		
		Example e1=new Example(5);
		String s10="Hari";
		
		System.out.println(s10.toString());
		
		System.out.println(e1.toString());
		System.out.println();
		
		
		
		/** Scanner scn = new Scanner(System.in); String s14=scn.nextLine();
		 * 
		 * System.out.println(s14.isEmpty()); System.out.println(s14.isBlank());
		 * System.out.println(s14.length());
		 */


		String[] a1 = { "a", "b", "c" };
//		System.out.println(a.length());
		System.out.println(a1.length);

		String s91 = "a";
		System.out.println(s91.length());
//		System.out.println(s9.length);

		Example e11 = new Example(5);
		String s101 = "Hari";

		System.out.println("s10.toString(): "+s101.toString());

		System.out.println("e1.toString(): "+e11.toString());
		System.out.println();

		Scanner scn = new Scanner(System.in);
		String s14 = scn.nextLine();

		System.out.println(s14.isEmpty());
		System.out.println(s14.isBlank());
		System.out.println(s14.length());

	}

}
