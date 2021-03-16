package com.night.test;
/**
 * Read a password from keyboard
 * Check whether it has characters in between 8, 16
 * if not then print error message.
 */

import java.util.Scanner;

public class PracticeProjects_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter password: ");
		String pwd=sc.nextLine();
		
		while((pwd.length()<8) || (pwd.length()>16)) {
			System.err.println("Password length must be in 8 to 16");
			System.out.print("Enter password: ");
			pwd=sc.nextLine();
		}
		
		System.out.println("Valid password!");
		sc.close();
	}
}
