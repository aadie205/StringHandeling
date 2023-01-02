package com.stringBuffer.methods;
/**
 * 
 * public StringBuffer insert(int index, xxx val)
 *
 */
public class InsertMethod {

	public static void main(String[] args) {
		StringBuffer sb2=new StringBuffer("acef");
		System.out.println("SB chars: "+sb2);
		System.out.println();
		
		sb2.insert(1, "b");
		System.out.println("SB chars: "+sb2);
		System.out.println();
		
		sb2.insert(3,"d");
		System.out.println("SB chars: "+sb2);
		System.out.println();
		
		sb2.insert(sb2.length()-1, "g");
		System.out.println("SB chars: "+sb2);
		System.out.println();
		
		sb2.insert(sb2.length(), "h");
		System.out.println("SB chars: "+sb2);
		System.out.println();
		
//		sb2.insert(sb2.length()+1, "i");
//		sb2.insert(5, null);
		sb2.insert(5, (String)null);
		System.out.println("SB chars: "+sb2);
		System.out.println();
		
//		sb2.insert(5, (char[])null);
		
		sb2.insert(0, "b");
		System.out.println("SB chars: "+sb2);
		System.out.println();
		
		StringBuffer sb3=new StringBuffer(2);
		sb3.append("ab");
		
		System.out.println("SB capacity: "+sb3.capacity());
		System.out.println("SB length: "+sb3.length());
		System.out.println("SB chars: "+sb3);
		System.out.println();
		
		sb3.insert(1, 'c');
		System.out.println("SB capacity: "+sb3.capacity());
		System.out.println("SB length: "+sb3.length());
		System.out.println("SB chars: "+sb3);
		System.out.println();
		
		sb3.insert(1, "123332323232");
		System.out.println("SB capacity: "+sb3.capacity());
		System.out.println("SB length: "+sb3.length());
		System.out.println("SB chars: "+sb3);
		System.out.println();
		 	
	}

}
