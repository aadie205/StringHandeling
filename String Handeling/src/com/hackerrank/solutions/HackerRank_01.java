package com.hackerrank.solutions;

import java.util.Scanner;

public class HackerRank_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter inputs");
		
		String s1=sc.next();
		String s2=sc.next();
		
		System.out.println(s1.length()+s2.length());
		
		System.out.println((s1.compareTo(s2)>0?"Yes":"No"));
		
		System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1)+" "
		+s2.substring(0,1).toUpperCase()+s2.substring(1));

	}

}
