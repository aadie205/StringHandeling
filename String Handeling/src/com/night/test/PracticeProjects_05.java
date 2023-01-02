package com.night.test;

import java.util.Scanner;

/**
 * Read name from keyboard
 * Print is back on console with its number of characters
 * If it is empty print msg: name is empty
 * 
 * 		input:
 * 			Enter name: Hari
 * 		output: 
 * 			Hi Hari, Your name has 4 characters
 * @author Night King
 *
 */
public class PracticeProjects_05 {
	public static void main(String[] args) {
		
		String name=getInput();
		
		int nameLength=name.length();
		System.out.println("Hi "+name+", Your name has "+nameLength+" characters");
	}

	private static String getInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		
		while(name.isBlank()) {
			System.err.println("name is empty!");
			System.out.println("Enter your name: ");
			name=sc.nextLine();
		}
//		System.out.println("Returning "+name);
		sc.close();
		return name;
	}
}
