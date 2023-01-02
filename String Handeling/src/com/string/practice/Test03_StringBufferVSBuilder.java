package com.string.practice;

public class Test03_StringBufferVSBuilder {
	public static void main(String[] args) {
		long time1, time2;
		StringBuffer sb3 = new StringBuffer();
		StringBuilder sb4 = new StringBuilder();

		time1 = System.nanoTime();
		for (int i = 0; i < 50000000; i++) {
			sb3.append(new Integer(i));
		}
		time2 = System.nanoTime();
		System.out.println(time2 - time1);


		time1 = System.nanoTime();
		for (int i = 0; i < 50000000; i++) {
			sb4.append(new Integer(i));
		}
		time2 = System.nanoTime();

		System.out.println(time2 - time1);

	}
}
