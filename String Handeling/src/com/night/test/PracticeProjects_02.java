package com.night.test;

import java.util.Scanner;

/**
 * Read name from keyboard.
 * Print number of characters in the given name.
 * @author Night King
 *
 */


public class PracticeProjects_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println(name+" has "+name.length()+" characters");
		
		
	}
}
