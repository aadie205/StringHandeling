package com.string.modifiers;

import java.util.ArrayList;
import java.util.List;

/**
 * public static String join(String delimiter, CharSequence...cs)
 * public static String join(String delimiter, Iterable<? extends CharSequence> iterable)
 * 
 * @author Night King
 *
 */
public class JoinMehtod {

	public static void main(String[] args) {
	// join() from java 1.8
		
		String s1=String.join("-", "a","b","c","d");
		String s2=String.join("", "a","b","c","d");
		String s3=String.join("-");
		String s4=String.join("-", "a");
		String s5=String.join("-","a","b" );
		String s6=String.join("-", "a",new StringBuffer("b"),new StringBuilder("c"));	
		String s7=String.join("-", "a",null,"b");
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		System.out.println("s5: "+s5);
		System.out.println("s6: "+s6);
		System.out.println("s7: "+s7);
		System.out.println();
		
		
		String s8=String.join(":::", new String[] {"1","2","3"}); 
		String s9=String.join("::", 
				new StringBuffer[] {new StringBuffer("m"),new StringBuffer("n")});
		
		
		System.out.println("s8: "+s8);
		System.out.println("s9: "+s9);
		System.out.println();
		
		List<String> al=List.of("p","q","r");
		String s10=String.join("/", al);	
		
		System.out.println(s10);
		
	} 

}
