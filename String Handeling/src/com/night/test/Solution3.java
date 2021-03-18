package com.night.test;

import java.io.*;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Enter input");
        if(!scan.hasNext()) {
        	System.out.println();
        	return;
        }
        String s = scan.nextLine();
        
        
        // Write your code here.
        s=s.trim();
        String[] sa=s.split("[! , ? . _ ' @]+");
        System.out.println(sa.length);
        
        
        for(String ch: sa)
            System.out.println(ch);
        
        
        scan.close();
    }
}
