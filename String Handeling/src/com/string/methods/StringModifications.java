package com.string.methods;
/*
 *  String object modification --> new Object
 *  1. the return object is not stored
 *  2. the return object is stored in new variable
 *  3. the return object is stored in same variable
 *  
 *  4*. As a result of mutator method call, if current string
 *  object data is not modified either by character of by length,
 *  the same current string object reference is returned. new object
 *  is destroyed.
 */
public class StringModifications {

	public static void main(String[] args) {

//1. concat():
		
		String s1="Adi";
		String s2=s1.concat("tya");

		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println();
		
		String s3="a";
		s3.concat("b");
		
		System.out.println("s3: "+s3);
		System.out.println();
		
		String s4=s3.concat("c");
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		System.out.println();
		
		s3=s3.concat("d");
		System.out.println("s3: "+s3);
		System.out.println();
		
		System.out.println(s3.concat("e"));
		System.out.println(s3);
		System.out.println();

		String s5=s3.concat("");
		System.out.println("s3: "+s3);
		System.out.println(s3==s5);
		System.out.println();
		
		String s6="";
		String s7=s6.concat(s3);
		System.out.println("s7: "+s7);
		System.out.println(s6==s7);
		System.out.println(s3==s7);
		System.out.println();
		

//2. +operator
		
		String s8="p";
		String s9=s8+"q";
		String s10=s8+"";
		String s11=""+s8;
		
		System.out.println("s8: "+s8);
		System.out.println("s9: "+s9);
		System.out.println("s10 :"+s10);
		System.out.println("s11 :"+s11);
		System.out.println(s8==s9);
		System.out.println(s8==s10);
		System.out.println(s10==s11);
		System.out.println();
		
		String s15="abc";
		String s16="a"+"b"+"c";
		String s17="a".concat("b").concat("c");
		
		System.out.println(s15==s16);
		System.out.println(s15==s17);
		System.out.println();
		
		String s18="a";
		String s19=s18.concat("b");
		String s20=s18.concat("b");
		
		System.out.println(s19==s20);
		System.out.println();
		
		String s21=s18.concat("");
		String s22=s18.concat("");
		System.out.println(s18==s21);
		System.out.println(s18==s22);
		System.out.println(s21==s22);
		System.out.println();
		
//		String str1=null+null;
//		String str2=null.concat(null);
		String str2=null+"a";
		System.out.println(str2);
		
		String str4="a"+null;
		System.out.println(str4);
		System.out.println();
		
//		String str5=null.concat("a");
//		String str6="a".concat(null);
//		System.out.println(str6);
		
		String s23=null;
		String s24=null;
		
		String s25=s23+s24;
		System.out.println(s25);
		
		String s28=7+8+"adi"+8+7+null;
		System.out.println(s28);
		System.out.println();
		
		String s29="a"; 
		String s30="a";
		System.out.println("s29==s30"+s29==s30);	//false
		System.out.println();
		
		String s31="abc";
		String s32="bbc";
		String s33=s31+s32;	//s33=new StringBuilder().append(s31).append(32).toString();
		
		String s34=s31.concat(s32);
		System.out.println(s33);
		System.out.println(s34);
		System.out.println();
		
		 
		
	}

}
