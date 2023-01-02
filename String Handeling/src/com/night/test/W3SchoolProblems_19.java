package com.night.test;

/*
  32. Write a Java program to find longest Palindromic Substring within a string. Go to the editor

	Sample Output:

	The given string is: thequickbrownfoxxofnworbquickthe
	The longest palindrome substring in the given string is; brownfoxxofnworb
	The length of the palindromic substring is: 16
 */

class W3SchoolProblems_19 {
	public static void main(String args[]) {

		String str = "thequickbrownfoxxofnworbquickthe";

		String res = LogestPalindrome(str);
		System.out.println("The longest palindrom substring in the given string is, " + res);
		System.out.println("the length of the palindromic substring is: " + res.length());

	}

	private static String LogestPalindrome(String str) {
		int low, high;
		int start = 0, end = 1;

		for (int i = 1; i < str.length(); i++) {

			// even substring
			low = i - 1;
			high = i;

			while (low > 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {

				if (high - low - 1 > end) {
					start = low;
					end = high - low - 1;
				}
				low--;
				high++;
			}
		}
		for (int i = 1; i < str.length(); i++) {

			// even substring
			low = i - 1;
			high = i + 1;

			while (low > 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {

				if (high - low - 1 > end) {
					start = low;
					end = high - low - 1;
				}
				low--;
				high++;
			}
		}

		return str.substring(start, start + end + 2);
	}

}
