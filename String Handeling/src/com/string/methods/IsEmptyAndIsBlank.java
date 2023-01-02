package com.string.methods;

public class IsEmptyAndIsBlank {

	public static void main(String[] args) {	
	/**
	 * public boolean isEmpty();		//1.6
	 */
		String s1="";					
		String s2=" ";					
		String s3="abc";				
		String s4=new String();			
		String s5=new String("");		
		String s6=new String(" ");		
		String s7=new String("abc");
		String s8=" a";
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println(s4.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());
		System.out.println(s7.isEmpty());
		System.out.println(s8.isEmpty());
		System.out.println();	
	/**
	 * 	public boolean isBlank();
	 * 	System.out.println(s2.trim().isEmpty());     -> Up to java 10v	
	 */
		System.out.println(s1.isBlank());
		System.out.println(s2.isBlank());
		System.out.println(s3.isBlank());
		System.out.println(s4.isBlank());
		System.out.println(s5.isBlank());
		System.out.println(s6.isBlank());
		System.out.println(s7.isBlank());
		System.out.println(s8.isBlank());
		System.out.println();
		
	}

}
