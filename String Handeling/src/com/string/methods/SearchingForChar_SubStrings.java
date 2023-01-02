package com.string.methods;

public class SearchingForChar_SubStrings {
<<<<<<< HEAD
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
=======
	
	public static void main(String[] args) {
		System.err.println("First");
		//Searching for char/substring
		String s1 = "Java Programming  Language";

		System.out.println(s1.equals("Program"));
		System.out.println(s1.compareTo("Program"));

		System.out.println(s1.contains("Program"));
		System.out.println(s1.contains("program"));
		System.out.println(s1.toLowerCase().contains("program"));
		System.out.println();
		
		System.err.println("Second");
		System.out.println("Java Programming  Language");
		//	System.out.println(s26.contains('J'));
		System.out.println(s1.contains("J"));

		System.out.println(s1.indexOf("q"));
		System.out.println(s1.indexOf("g"));
		System.out.println(s1.indexOf('g'));
		System.out.println(s1.lastIndexOf('g'));
		System.out.println(s1.indexOf('a', 6));
		System.out.println();
		
		System.err.println("Third");
		System.out.println("Java Programming  Language");
		System.out.println(s1.lastIndexOf('a', 5));
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.lastIndexOf('A', 5));
		System.out.println();

		System.err.println("Five");
		System.out.println("Java Programming  Language");
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a', -5));
		System.out.println(s1.lastIndexOf('a', -5));
		System.out.println();

		System.err.println("Six");
		System.out.println("Java Programming  Language");
		System.out.println(s1.indexOf('a', 1));
		System.out.println(s1.indexOf("Program"));
		System.out.println(s1.lastIndexOf("Program"));
		System.out.println();
		
		System.err.println("Seven");
		
		String s2 = "abc bbc cbz";
		System.out.println(s2.equals("bbc"));
		System.out.println(s2.compareTo("bbc"));
		System.out.println(s2.indexOf("bbc"));
		System.out.println(s2.contains("bbc"));
		System.out.println(s2.contains("abc"));
		System.out.println(s2.contains("cbc"));
		System.out.println();

		System.err.println("Eight");

		System.out.println(s2.startsWith("abc"));
		System.out.println(s2.endsWith("cbz"));
		System.out.println();

		System.out.println(s2.startsWith("bbc", 4));

		System.err.println("Nine");
	
		String s3 = "hari krishna";
		System.out.println(s3.charAt(1));
		//	System.out.println(s28.charAt(12));		//SIOOBException
		System.out.println();

		for (int i = 0; i < s3.length(); i++) {
			System.out.print(s3.charAt(i) + " ");
		}
		System.out.println();

		//	for(char c: s28) {
		//		
		//	}

		System.err.println("Ten");

		System.out.println(s3.substring(5));
		System.out.println(s3.substring(5, 10));

		//	System.out.println(s28.substring(-5, 10));
		//	System.out.println(s28.substring(5, -10));
		System.out.println(s3.substring(5, 12));
		//	System.out.println(s28.substring(5, 13));
		System.out.println();
		
		System.err.println("Eleven");

		System.out.println(s3.substring(5, 5)); // empty string
		System.out.println(s3.substring(5, 5).equals(""));
		System.out.println(s3.substring(5, 5).isEmpty());
		System.out.println(s3.substring(5, 5).isBlank());

	}
>>>>>>> branch 'master' of https://github.com/aadie205/StringHandeling.git
}
