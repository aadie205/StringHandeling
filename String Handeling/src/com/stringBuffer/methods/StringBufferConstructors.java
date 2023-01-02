package com.stringBuffer.methods;
/**
 * StrigBuffer & StringBuilder:
 *  1. StringBuffer is thread safe, all its mutator methods are synchronized.
 *  2. StrignBuilder is non thread safe, all its mutator methods are not synchronized.	
 *  3. Mutable objects.
 * 	4. for every change result is stored in SB and SB object.
 *  5. new SB and SB object are not created.
 *  6. Always we'll have latest modified string content. old content is lost.
 *  7. SB/SB class method returns the same current SB/SB objects.
 *  
 * Constructors:
 * 	1. StringBuffer()					--> empty SB with default capacity 16
 * 	2. StringBuffer(int intialCapacity)	--> empty SB with given capacity
 * 	3. StringBuffer(String s)			--> SB with given characters with the capacity 16+s.length()
 * 	4. StirngBuffer(CharSequence cs)	--> SB with given characters with the capacity 16+cs.length()
 * 
 * Rules:
 * 	1. We must not pass Negative numbers as arguments, it leads to NASE
 * 	2. We must not pass null as argument it leads to NPE.
 * 
 *  Methods:
 * 	1. public StringBuffer append(xxx value) <-Overloaded method (i/l/f/d/c/b/ch[]/str/obj)
 * 	2. public StringBuffer insert(xxx value) <-Overloaded method (i/l/f/d/c/b/ch[]/str/obj)
 * 	3. public StringBuffer deleteAt(int index)
 * 	4. public StringBuffer delete(int start, int end)
 * 	5. public StringBuffer setCharAt(int index)
 * 	6. public StringBuffer reverse()
 * 
 * 	7. public int capcity()
 * 	8. public void ensureCapacity(int newCapacity)
 * 	9. public void trimToSize()
 * 	10.public void setLength(int len)
 * `	
 */
public class StringBufferConstructors {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer();
		System.out.println("ab1 capacity: "+sb1.capacity());
		System.out.println("sb1 size: "+sb1.length());
		System.out.println("sb1 chars: "+sb1);
		System.out.println();

		StringBuffer sb2=new StringBuffer(50);
		System.out.println("ab1 capacity: "+sb2.capacity());
		System.out.println("sb1 size: "+sb2.length());
		System.out.println("sb1 chars: "+sb2);
		System.out.println();
		
		StringBuffer sb3=new StringBuffer("abc");
		System.out.println("ab1 capacity: "+sb3.capacity());
		System.out.println("sb1 size: "+sb3.length());
		System.out.println("sb1 chars: "+sb3);
		System.out.println();
		
		sb3.append("d");
		System.out.println("ab1 capacity: "+sb3.capacity());
		System.out.println("sb1 size: "+sb3.length());
		System.out.println("sb1 chars: "+sb3);
		System.out.println();
		
		StringBuffer sb4=new StringBuffer(sb3);
		System.out.println("ab1 capacity: "+sb4.capacity());
		System.out.println("sb1 size: "+sb4.length());
		System.out.println("sb1 chars: "+sb4);
		System.out.println();
		
//		StringBuffer sb5=new StringBuffer(-5);	//NegativeArraySize
//		StringBuffer sb5=new StringBuffer(0);
//		StringBuffer sb5=new StringBuffer(null);	//NullPointerException
//		String s1=new String((String)null);			//NullPointerException
		StringBuffer sb5=new StringBuffer("null");	
		System.out.println("ab1 capacity: "+sb5.capacity());
		System.out.println("sb1 size: "+sb5.length());
		System.out.println("sb1 chars: "+sb5);
		System.out.println();
		
		
		StringBuffer sb7=null;
		System.out.println("sb7: "+sb7);
		System.out.println();
		
//		StringBuffer sb9="null";
		
		StringBuffer sb10=new StringBuffer("null");
		System.out.println("ab1 capacity: "+sb10.capacity());
		System.out.println("sb1 size: "+sb10.length());
		System.out.println("sb1 chars: "+sb10);
		System.out.println();
	 
		
	}

}
