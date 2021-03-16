package com.night.test;

import java.util.*;

class Car{
	public void printTopSpeed() {
		System.out.println("Top speed of the vehicle is 100 kmph");
	}
	
	public void printTopSpeed(int topSpeed) {
		System.out.println("Top speed of the vehicle is "+topSpeed+" kmph");
	}
	
	public void printTopSpeed(String vehicleName, int topSpeed) {
		System.out.println("Top speed of the vehicle "+vehicleName+" is "+topSpeed+" kmph");
	}

}

public class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first line: ");
		int n=sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String arg=sc.nextLine();
			StringTokenizer tokens=new StringTokenizer(arg);
			int totalTokens=tokens.countTokens();
			Car solution=new Car();
			
			if(totalTokens==1) {
				solution.printTopSpeed();
			}
			else if(totalTokens==2) {
				String name=tokens.nextToken();
				int speed = Integer.parseInt(tokens.nextToken());
				solution.printTopSpeed(speed);
			}
			else if(totalTokens==3) {
				String name=tokens.nextToken();
				String carName=tokens.nextToken();
				int speed = Integer.parseInt(tokens.nextToken());
				
				solution.printTopSpeed(carName, speed);
			}
			
		}
		
		
	}	
	
}


