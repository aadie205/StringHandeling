package com.string.methods;

import java.util.Scanner;

public class InternMethod {

	public static void main(String[] args) {

		/*		String s1="a";	//one obj created
				String s2="a"; //No objects created
				System.out.println(s1==s2);
				
				String s3=new String("b");	//two obj created
				String s4=new String("b");	//one obj created
				System.out.println(s3==s4);
				
				String s5=s1.concat(s2);
				String s6=s1.concat(s2);
				
				System.out.println(s5==s6);
				System.out.println();
				
				String s7=s1+s2;
				String s8=s1+s2;
				
				System.out.println(s7==s8);
				System.out.println(s7.equals(s8));
				System.out.println();
				
				Scanner scn=new Scanner(System.in);
				String s9=scn.nextLine();
				String s10=scn.nextLine();
				
				System.out.println(s9==s10);
				System.out.println(s9.equals(s10));
				System.out.println();
				
				*/
		
		/**
		 * By default JVM only makes string literal eligible 
		 * for string pooling.
		 * To tell JVM an specific object to come under string
		 * pooling, we use intern();
		 */
		
		String s1="H ";			
		String s2=s1.intern();	//used for adding and retrieving a string object to and from pool.
		System.out.println(s1==s2);
		System.out.println();
		
		String s3=new String("NIT");
		String s4=s3.intern();
		String s5="NIT";
		String s6=new String("NIT").intern(); 
		
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println();
		
		String s7=new String("Ameerpet").intern();
		String s8=new String("Ameerpet").intern();
		
		System.out.println(s7==s8);
		System.out.println();
	


		String s11="a";	//one obj created
		String s22="a"; //No objects created
		System.out.println("s11==s22: "+(s1==s2));

		String s33=new String("b");	//two obj created
		String s44=new String("b");	//one obj created
		System.out.println("s33==s44: "+(s3==s4));

		String s55=s1.concat(s22);
		String s66=s1.concat(s22);

		System.out.println("s5==s6: "+(s55==s66));
		System.out.println();

		String s77=s11+s22;
		String s88=s11+s22;

		System.out.println("s77==s88: "+(s77==s88));
		System.out.println("s77.equals(s88): "+(s77.equals(s88)));
		System.out.println();

		Scanner scn=new Scanner(System.in);
		System.out.println("enter two strings: ");
		String s9=scn.nextLine();
		String s10=scn.nextLine();

		System.out.println("s9==s10: "+(s9==s10));
		System.out.println("s9.equals(s10): "+(s9.equals(s10)));
		System.out.println("hello");

		
		String s111="H ";			
		String s12=s111.intern();	//used for adding and retrieving a string object to and from pool.
		System.out.println("s11==s12: "+(s111==s12));
		System.out.println();
		
		String s13=new String("NIT");
		String s14=s13.intern();
		String s15="NIT";
		String s16=new String("NIT").intern(); 
		
		System.out.println("s13==s14: "+(s13==s14));
		System.out.println("s13==s15: "+(s13==s15));
		System.out.println("s14==s15: "+(s14==s15));
		System.out.println("s14==s16: "+(s14==s16));
		System.out.println();
		
		String s17=new String("Ameerpet").intern();
		String s18=new String("Ameerpet").intern();
		
		System.out.println("s17==s18: "+(s17==s18));
		System.out.println();
		
		scn.close();
	}

}
