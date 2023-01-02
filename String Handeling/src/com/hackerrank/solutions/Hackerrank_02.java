package com.hackerrank.solutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hackerrank_02 {

	// Complete the makeAnagram function below.
	static int makeAnagram(String first, String second) {

		String firstCopy = first;

		for (char c : first.toCharArray()) {
			if (second.indexOf(c) != -1) {
				firstCopy = firstCopy.replaceFirst(c + "", "");
				second = second.replaceFirst(c + "", "");
			}
		}

		return firstCopy.length() + second.length();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		System.out.println("enter inputs:");
		String a = scanner.nextLine();

		String b = scanner.nextLine();

		int res = makeAnagram(a, b);

		//        bufferedWriter.write(String.valueOf(res));
		//        bufferedWriter.newLine();
		//
		//        bufferedWriter.close();
		System.out.println(res);
		scanner.close();
	}
}
