package com.string.modifiers;

public class ChangingCases {

	public static void main(String[] args) {
		String s1="aBc";
		System.out.println(s1);
		
		s1.toLowerCase();
		System.out.println(s1);
		System.out.println();
		
		String s2=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		String s3=s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s3);
		System.out.println();
		
		s1=s1.toUpperCase();
		System.out.println(s1);
		System.out.println();
		
		s1=s1.toLowerCase();
		System.out.println(s1);
		System.out.println();
		
		String s4=s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1==s4);
		System.out.println();
		
		String s5=s1.toUpperCase();
		String s6=s1.toUpperCase();
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println();
		
		String s7=s6.toUpperCase();
		System.out.println(s6==s7);
		System.out.println(s6.equals(s7));
		System.out.println();
		
		String s8="12@34";
		String s9=s8.toLowerCase();
		String s10=s8.toUpperCase();
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
		System.out.println(s8==s9);
		System.out.println(s9==s10);
		System.out.println();
		
		
	
	
	}

}
