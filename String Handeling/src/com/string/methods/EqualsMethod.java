package com.string.methods;

public class EqualsMethod {

	public static void main(String[] args) {
		String s1="Hari";
		System.out.println(s1=="Hari");
		System.out.println(s1.equals("Hari"));
		System.out.println();
		
		String s2=new String("Hari");
		System.out.println(s2=="Hari");
		System.out.println(s2.equals("Hari"));
		System.out.println(s2.equals("hari"));
		System.out.println(s2.equalsIgnoreCase("HARI"));
		System.out.println();
		
		char[] ch= {'1'};
		String s3="1";
//		System.out.println(ch==s17);
		System.out.println(s3.equals(ch));
		System.out.println();
		
		String s4="a";
		String s5="a";
		
		System.out.println(s4==s5);
		System.out.println("s19==s20"+s4==s5);
		System.out.println("s19==s20"+(s4==s5));
		System.out.println();
		
		String s6="abc";
		StringBuffer sb1=new StringBuffer("abc");
		StringBuilder sb2=new StringBuilder("abc");
		
//		System.out.println(sb2==sb1);
		System.out.println(s6.equals(sb1));
		System.out.println(s6.equals(sb2));
		System.out.println(sb1.equals(sb2));
		
		System.out.println(s6.contentEquals(sb1));
		System.out.println(s6.contentEquals(sb2));
		System.out.println(s6.contentEquals(s6));
		System.out.println();
		
		StringBuffer sb3=new StringBuffer("abc");
		System.out.println(sb1.equals(sb3));
		System.out.println();

	}

}
