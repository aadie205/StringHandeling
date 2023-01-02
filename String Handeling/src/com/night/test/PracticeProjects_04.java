package com.night.test;

import java.util.Scanner;

/**
 * Read mobile number from keyboard and check whether it has
 * 10 digits or not
 * If not, print error message:
 * 			"Mobile number must contain 10 digits"
 * If it has 10 digits, check those are really digits or not
 * If not, print error message:
 * 			"mobile number should contain digits only"
 * 
 * If yes, print the following message:
 * 			"Opt successfully sent to your registered
 * 				number "xxxxxxxx+last" 2 digits of mobile number
 * @author Night King
 *
 */
public class PracticeProjects_04 {
	private static String phNo=null; 
	public static void main(String[] args) {
		
		getInput();
		
		System.out.println("Otp successfully sent to your registered number "+
		 phNo.charAt(0)+phNo.charAt(1)+"xxxxxx"+phNo.charAt(8)+phNo.charAt(9)+"!");
	}//main
	

	public static void getInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter mobile number: ");
		phNo =sc.nextLine();
		
		//checking length of the input
		while(phNo.length()!=10) {
			System.err.println("mobile number must contain 10 digits");
			getInput();
			
		}
		
		//checking numbers of the input
		for(int i=0; i<phNo.length(); i++) {
			int element=phNo.charAt(i);
//			System.out.println(element);
			
			if(element<48 || element>57) {
				System.err.println("mobile number should contain digits only");
				getInput();
				break;
			}
		}
		
	}//getInput
	
}
