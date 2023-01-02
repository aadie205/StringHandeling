package com.string.methods;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 1. public String[] split(String delim) 2. Its parameter is regex. 3. If the
 * given argument string has special meaning as per regex the current string
 * will be with the matched characters. Ex: "." --> all characters are
 * considered as delimiter finally we will get empty string "[abc]"--> string is
 * split by the characters a,b and c. "[a-z]"--> string is split by the any
 * letter if we want to treat a regular expression character as normal
 * character, we must prefix '\\' as "\\."
 * 
 * 4. If the given argument string does not have any special meaning the current
 * string will be split by the given character itself. Ex: "a", string is split
 * by the letter "a"
 * 
 * 5. If given argument string is completely equal to current string then empty
 * array will be return with 0 tokens.
 * 
 * 6. If given argument is not matched with any character in current string,
 * current string will be return as one token.
 * 
 * 7. for the given argument string LRFT token is not found but RIGHT tokens
 * found, as LEFt token it includes an empty string.
 * 
 * 8. If we pass empty string "" as delimiter each character will be return as a
 * token
 * 
 * 9. Available from JDK 1.4
 * 
 */

public class SplitingStrings {

	public static void main(String[] args) {

		// Splitting strings into tokens

		// public String[] split(String delimiter)

		String s1 = "hari, aditya, yadav, naveeN";
		String sa1[] = s1.split(",");

		System.out.println("sa1.length: " + sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		String sa2[] = s1.split(";");
		System.out.println("sa2.length: " + sa2.length);
		System.out.println(java.util.Arrays.toString(sa2));
		System.out.println();

		String sa3[] = s1.split("hari,aditya,yadav,naveen");
		System.out.println("sa3.length: " + sa3.length);
		System.out.println(Arrays.toString(sa3));
		System.out.println();

		String sa4[] = s1.split("h");
		System.out.println("sa4.length: " + sa4.length);
		System.out.println(java.util.Arrays.toString(sa4));
		System.out.println();

		String sa5[] = s1.split("N");
		System.out.println("sa5.length: " + sa5.length);
		System.out.println(java.util.Arrays.toString(sa5));
		System.out.println();

		String sa6[] = s1.split(" ");
		System.out.println("sa6.length: " + sa6.length);
		System.out.println(java.util.Arrays.toString(sa6));
		System.out.println();

		s1 = "aaaaaaaaaa";
		sa1 = s1.split("a");
		System.out.println("sa1.length: " + sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();

		s1 = "abc.txt";
		sa1 = s1.split(".");
		System.out.println("sa1.length: " + sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();

		sa1 = s1.split("\\.");
		System.out.println("sa1.length: " + sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();

		s1 = "a1b2c3";
		// sa1=s31.split("abc");
		sa1 = s1.split("[abc]");
		System.out.println("sa1.length: " + sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();

		sa1 = s1.split("[123]");
		System.out.println("sa1.length: " + sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();

		s1 = "a1b2c3d4";
		// sa1=s31.split("abc");
		// sa1=s31.split("[123]");
		sa1 = s1.split("[0-9]");
		System.out.println("sa1.length: " + sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();

		s1 = "abc";
		sa1 = s1.split("");
		System.out.println("sa1.length" + sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();

		String s35 = "My name is Aditya yadav";
//		StringTokenizer st=new StringTokenizer(s35);
//		StringTokenizer st=new StringTokenizer(s35, " ");
		StringTokenizer st = new StringTokenizer(s35, "a", true);

		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}

		String s36 = "abc";
		char[] ch = s36.toCharArray();
		byte[] b = s36.getBytes();
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(b));
		System.out.println(ch[2]);

	}

}
