package com.night.test;

import java.util.Scanner;

/**
* Read user name from keyboard
* If user entered empty string as user name
* 		print error message "Enter User-name"
*	 Else
*		Print "Welcome to NIT"
**/

public class PracticeProjects_01 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String uname=null;
			String pwd=null;
	
		System.out.print("Enter username: ");
		uname=sc.nextLine();
		
		while(uname.isBlank()) {
			System.err.println("Enter username");
			uname=sc.nextLine();
		}
		
		System.out.println("Welcome to NIT");
	}
}
