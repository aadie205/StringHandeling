package com.string.methods;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Example{
	public int x;
	public Example() {
		
	}
	public Example(int x){
		this.x=x;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub

//		return super.hashCode();
		return x;
	}
	
	
	@Override
	public String toString() {
		
//		return x+"";
//		return Integer.toString(x);
		return String.valueOf(x);
	}
}
