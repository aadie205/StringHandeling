package com.stringBuffer.methods;

public class CapacityControlling {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer(3);
		System.out.println(sb.capacity());
		System.out.println();
		
		sb.ensureCapacity(5);					//cc*2+2 or 5(given capacity) whichever is biggest
		System.out.println(sb.capacity());
		System.out.println();
		
		sb.ensureCapacity(20);
		System.out.println(sb.capacity());
		System.out.println();
		
		sb.ensureCapacity(15);
		System.out.println(sb.capacity());
		System.out.println();

		sb.ensureCapacity(0);
		System.out.println(sb.capacity());
		System.out.println();
		
		sb.ensureCapacity(-5);
		System.out.println(sb.capacity());
		System.out.println();
		
		sb.append("abcd");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println();
		
		sb.trimToSize();
		System.out.println("capacity: "+sb.capacity());
		System.out.println("size: "+sb.length());
		System.out.println("sb: "+sb );
		System.out.println();
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("abc");
		System.out.println("capacity: "+sb1.capacity());
		System.out.println("size: "+sb1.length());
		System.out.println("sb1: "+sb1);
		System.out.println();
		
		sb1.setLength(6);
		
		System.out.println("capacity: "+sb1.capacity());
		System.out.println("size: "+sb1.length());
		System.out.println("sb1: "+String.valueOf(sb1.charAt(3)).equals("\0"));
		System.out.println();
		
		sb1.trimToSize();
		
		System.out.println("capacity: "+sb1.capacity());
		System.out.println("size: "+sb1.length());
		System.out.println("sb1: "+sb1);
		System.out.println();
		
//		sb1.append("def");
		sb1.replace(3, 6, "def");
		System.out.println("capacity: "+sb1.capacity());
		System.out.println("size: "+sb1.length());
		System.out.println("sb1: "+sb1);
		System.out.println();

		StringBuffer sb2=new StringBuffer(7);
		sb2.append("abc");
		
		System.out.println("capacity: "+sb2.capacity());
		System.out.println("size: "+sb2.length());
		System.out.println("sb2: "+sb2);
//		System.out.println((String.valueOf(sb2.charAt(4)).equals("\0")));
		System.out.println();
		
		sb2.setLength(5);
		
		System.out.println("capacity: "+sb2.capacity());
		System.out.println("size: "+sb2.length());
		System.out.println("sb2: "+sb2);
		System.out.println();

		sb2.setLength(2);
		
		System.out.println("capacity: "+sb2.capacity());
		System.out.println("size: "+sb2.length());
		System.out.println("sb2: "+sb2);
		System.out.println();

		sb2.setLength(5);
		
		System.out.println("capacity: "+sb2.capacity());
		System.out.println("size: "+sb2.length());
		System.out.println("sb2: "+sb2);
		System.out.println();

		
		sb2.setLength(0);
		
		System.out.println("capacity: "+sb2.capacity());
		System.out.println("size: "+sb2.length());
		System.out.println("sb2: "+sb2);
		System.out.println();

//		sb2.setLength(-5);
		sb2.setLength(14);
		
		System.out.println("capacity: "+sb2.capacity());
		System.out.println("size: "+sb2.length());
		System.out.println("sb2: "+sb2);
		System.out.println();

		sb2.setLength(19);
		
		System.out.println("capacity: "+sb2.capacity());
		System.out.println("size: "+sb2.length());
		System.out.println("sb2: "+sb2);
		System.out.println();

		
		










	}

}