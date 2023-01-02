package com.string.methods;

public class SearchingForChar_SubStrings {
public static void main(String[] args) {
	
//Searching for char/substring
	String s26="Java Programming  Language";
	
	System.out.println(s26.equals("Program"));
	System.out.println(s26.compareTo("Program"));

	System.out.println(s26.contains("Program"));
	System.out.println(s26.contains("program"));
	System.out.println(s26.toLowerCase().contains("program"));
	
//	System.out.println(s26.contains('J'));
	System.out.println(s26.contains("J"));
	
	System.out.println(s26.indexOf("q"));
	System.out.println(s26.indexOf("g"));
	System.out.println(s26.indexOf('g'));
	System.out.println("last index"+s26.lastIndexOf('g'));
	System.out.println(s26.indexOf('a',6));
	
	System.out.println(s26.lastIndexOf('a', 5));
	System.out.println(s26.indexOf('A'));
	System.out.println(s26.lastIndexOf('A', 5));
	System.out.println();
	
	System.out.println(s26.indexOf('a'));
	System.out.println("index of a, -5");
	System.out.println(s26.indexOf('a', -5));
	System.out.println(s26.lastIndexOf('a',-5));
	System.out.println();
	
	System.out.println(s26.indexOf('a',1));
	System.out.println(s26.indexOf("Program"));
	System.out.println(s26.lastIndexOf("Program"));
	

	String s27="abc bbc cbz";
	System.out.println(s27.equals("bbc"));
	System.out.println(s27.compareTo("bbc"));
	System.out.println(s27.indexOf("bbc"));
	System.out.println(s27.contains("bbc"));
	System.out.println(s27.contains("abc"));
	System.out.println(s27.contains("cbc"));
	System.out.println();
	
	System.out.println(s27.startsWith("abc"));
	System.out.println(s27.endsWith("cbz"));
	System.out.println();
	
	System.out.println(s27.startsWith("bbc",4));  
	
	
	String s28="hari krishna";
	System.out.println(s28.charAt(1));
//	System.out.println(s28.charAt(12));		//SIOOBException
	System.out.println();
	
	for (int i=0; i<s28.length(); i++) {
		System.out.print(s28.charAt(i)+" ");
	}
	System.out.println();
	
//	for(char c: s28) {
//		
//	}
	
	System.out.println(s28.substring(5));
	System.out.println(s28.substring(5, 10));
	
//	System.out.println(s28.substring(-5, 10));
//	System.out.println(s28.substring(5, -10));
	System.out.println(s28.substring(5, 12));
//	System.out.println(s28.substring(5, 13));
	
	System.out.println(s28.substring(5,5));	//empty string
	System.out.println(s28.substring(5,5).equals(""));
	System.out.println(s28.substring(5, 5).isEmpty());
	System.out.println(s28.substring(5, 5).isBlank());

}
}
