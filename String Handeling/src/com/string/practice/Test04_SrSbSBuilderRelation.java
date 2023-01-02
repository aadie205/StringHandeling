package com.string.practice;

public class Test04_SrSbSBuilderRelation {
	public static void main(String[] args) {
		String str1="Hari";
//		StringBuffer sb1="Hari";
//		StringBuilder sb2="Hari";
		
		StringBuffer sb3=new StringBuffer("Hari");
		StringBuilder sb4=new StringBuilder("Hari");
		
		System.out.println(str1);
		System.out.println(sb3);
		System.out.println(sb4); 
		
		CharSequence cs1="Night";
		CharSequence cs2=new StringBuffer("Night");
		CharSequence cs3=new StringBuilder("Night");
		
		System.out.println();
		System.out.println(cs1);
		System.out.println(cs2);
		System.out.println(cs3);
		
		
	}
}
