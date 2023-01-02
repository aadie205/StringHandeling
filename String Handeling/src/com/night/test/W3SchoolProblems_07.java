package com.night.test;

/*
	19. Write a Java program to get the index of all the characters of the alphabet. Go to the editor

			Sample Output:

			a  b c  d e  f  g h i  j                                                                                     
			=========================                                                                                     
			36 10 7 40 2 16 42 1 6 20                                                                                     

			k  l  m  n  o  p q  r  s  t                                                                                   
			===========================                                                                                   
			8 35 22 14 12 23 4 11 24 31                                                                                   

			u  v  w  x  y  z                                                                                              
			================                                                                                              
			5 27 13 18 38 37
			Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

 */

public class W3SchoolProblems_07 {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";

		for (int i = 0; i < 26; i++) {
			System.out.print((char) (((int) 'a') + i) + "	");
			//    		(char)(((int)'a')+i)  		
		}
		System.out.println();
		for (int i = 0; i < 26; i++) {
			System.out.print(str.indexOf((char) (((int) 'a') + i)) + "	");
		}
		System.out.println();
		for (int i = 0; i < 26; i++) {
			System.out.print("==");
		}
	}
}
