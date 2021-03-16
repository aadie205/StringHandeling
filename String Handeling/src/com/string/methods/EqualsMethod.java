package com.string.methods;

public class EqualsMethod {

	public static void main(String[] args) {
		String s15="Hari";
		System.out.println(s15=="Hari");
		System.out.println(s15.equals("Hari"));
		System.out.println();
		
		String s16=new String("Hari");
		System.out.println(s16=="Hari");
		System.out.println(s16.equals("Hari"));
		System.out.println(s16.equals("hari"));
		System.out.println(s16.equalsIgnoreCase("HARI"));
		System.out.println();
		
		char[] ch= {'1'};
		String s17="1";
//		System.out.println(ch==s17);
		System.out.println(s17.equals(ch));
		System.out.println();
		
		String s19="a";
		String s20="a";
		
		System.out.println(s19==s20);
		System.out.println("s19==s20"+s19==s20);
		System.out.println("s19==s20"+(s19==s20));
		System.out.println();
		
		String s21="abc";
		StringBuffer sb1=new StringBuffer("abc");
		StringBuilder sb2=new StringBuilder("abc");
		
//		System.out.println(sb2==sb1);
		System.out.println(s21.equals(sb1));
		System.out.println(s21.equals(sb2));
		System.out.println(sb1.equals(sb2));
		
		System.out.println(s21.contentEquals(sb1));
		System.out.println(s21.contentEquals(sb2));
		System.out.println(s21.contentEquals(s21));
		System.out.println();
		
		StringBuffer sb3=new StringBuffer("abc");
		System.out.println(sb1.equals(sb3));
		System.out.println();

	}

}
