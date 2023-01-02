package com.night.test;

import java.util.Scanner;




public class Solution3{

  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	String input=sc.next();
	
	
	for(int i=0; i<input.length(); i++) {
		int no=input.charAt(i);
		if(no>=48 && no<=75){
			count++;
		}
	}
		System.out.println(count);
}}