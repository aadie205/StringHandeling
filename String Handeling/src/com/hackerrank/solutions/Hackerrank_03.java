package com.hackerrank.solutions;
import java.io.*;
import java.util.*;

public class Hackerrank_03{

    public static void main(String[] args) {
        System.out.println("enter input");
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        for(int i=0,j=A.length()-1; i<(A.length())/2;i++,j--){
        	System.out.println(A.charAt(i)+" "+A.charAt(j));
            if(A.charAt(i)!=A.charAt(j)) {
               System.out.println("No");
            	return;
            }
        }
        System.out.println("Yes");
    }
}



