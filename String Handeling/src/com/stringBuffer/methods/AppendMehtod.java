package com.stringBuffer.methods;
/**
 * 
 * public StringBuffer append(xxx val)
 *
 */
public class AppendMehtod {
	
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer();
		System.out.println("ab1 capacity: "+sb1.capacity());
		System.out.println("sb1 size: "+sb1.length());
		System.out.println("sb1 chars: "+sb1);
		System.out.println();

		sb1.append("a");
		System.out.println("ab1 capacity: "+sb1.capacity());
		System.out.println("sb1 size: "+sb1.length());
		System.out.println("sb1 chars: "+sb1);
		System.out.println();

		sb1.append(10);
		System.out.println("ab1 capacity: "+sb1.capacity());
		System.out.println("sb1 size: "+sb1.length());
		System.out.println("sb1 chars: "+sb1);
		System.out.println();

		Pqr p1=new Pqr();
		sb1.append(p1);
		System.out.println("ab1 capacity: "+sb1.capacity());
		System.out.println("sb1 size: "+sb1.length());
		System.out.println("sb1 chars: "+sb1);
		System.out.println();
		
//		sb1.append(null);
		
		sb1.append((String)null);
		System.out.println("ab1 capacity: "+sb1.capacity());
		System.out.println("sb1 size: "+sb1.length());
		System.out.println("sb1 chars: "+sb1);
		System.out.println();
		
//		sb1.append((char[]) null);

		
		StringBuffer sb=new StringBuffer();
		
		for(int i=1;i<=20;i++)
			sb.append(i);
		System.out.println("sb capacity: "+sb.capacity());
		System.out.println("sb size: "+sb.length());
		System.out.println("sb chars: "+sb);
		System.out.println();

		
		
		


	}

}
class Pqr{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hi";
	}
}
