package com.stringBuffer.methods;

public class ReverseMethod {
/**
 * public StringBuffer reverse()
 * 
 */
	public static void main(String[] args) {
		StringBuffer sb5=new StringBuffer("abc bbc");
		System.out.println("SB chars: "+sb5);
		System.out.println();
		
		sb5.reverse();
		System.out.println("SB chars: "+sb5);
		System.out.println();
		
		StringBuffer sb6=sb5.reverse();
		System.out.println("SB chars: "+sb6);
		System.out.println();
		
		System.out.println(sb5.hashCode());
		System.out.println(sb6.hashCode());
	}

}
