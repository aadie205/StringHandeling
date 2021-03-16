package com.night.test;

import java.util.Scanner;

/**
 * Develop a project to read a string from the keyboard.
 * find whether this string has a substring "hari" is available
 * If available, display the characters "hari" in the case available
 * in the passing string.
 * 		for example:
 * 				Input: JavaHari
 * 				Output: Hari is available
 * 
 *				Input: JavaHaRi
 *				Output: HaRi is available
 *						(not hari is available)
 * @author Night King
 *
 */
public class PracticeProjects_06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string: ");
		String str=sc.next();
		String str2=str.toLowerCase();
		

		
		if(str2.contains("hari")) {
			int start = str2.indexOf("hari");
			int end= start+4;
			
			String hari=str.substring(start, end);
			System.out.println(hari+" is available");
		}
		System.err.println("not available");
		
		
	}
}
