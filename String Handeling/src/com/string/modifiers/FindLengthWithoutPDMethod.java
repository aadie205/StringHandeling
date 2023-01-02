package com.string.modifiers;

import java.lang.reflect.Field;

/**
 * Find length of String with and without using pre-defined methods
 * @author Night King
 *
 */
public class FindLengthWithoutPDMethod{

	public static void main(String[] args) {
		String s="Hello World!";
		
	//Approach 1. By using predefined method "length()"	
		System.out.println(s.length());
		
	//Approach 2. By using charAt()
		int count=0;
		try {
			while(true) {
//				count++;
				s.charAt(++count);
			}
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(count);
			
		}
	
	//Approach 3. By using toCharArray()
		char[] ch=s.toCharArray();
		System.out.println(ch.length);
		
	//Approach 4. By using toByteArray()
		byte[] b=s.getBytes();
		System.out.println(b.length);
		
	//Approach 5. By using split()
		String chars[]=s.split("");
		System.out.println(chars.length);
	
	//Approach 6. Without any pre-defined method
		
		Class<?> cls=s.getClass();
			
		try {
			Field value=cls.getDeclaredField("value");
			value.setAccessible(true);
			byte[] ba= (byte[]) value.get(s);
			System.out.println(ba.length);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
