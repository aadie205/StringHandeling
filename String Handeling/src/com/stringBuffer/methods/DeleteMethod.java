package com.stringBuffer.methods;

public class DeleteMethod {
/**
 * public StringBuffer deleteCharAt(int index)
 * public StringBuffer delete(int start, int end)
 * 
 */
	public static void main(String[] args) {
		StringBuffer sb3=new StringBuffer("Hari Ameerpet Krishna");
		System.out.println("SB chars: "+sb3);
		System.out.println();
		
		sb3.delete(5, 13);
		System.out.println("SB chars: "+sb3);
		System.out.println();
		
		sb3.deleteCharAt(4);
		System.out.println("SB chars: "+sb3);
		System.out.println();
		
		StringBuffer sb4=new StringBuffer("abcdef");
		System.out.println("SB chars: "+sb4);
		sb4.deleteCharAt(1);
		sb4.deleteCharAt(2);
		
		System.out.println("SB chars: "+sb4);
		System.out.println();
		
<<<<<<< HEAD
=======
		
>>>>>>> branch 'master' of https://github.com/aadie205/StringHandeling.git
//		sb4.deleteCharAt(20);
//		System.out.println("SB chars: "+sb3);
//		System.out.println();
		
		
	}

}
