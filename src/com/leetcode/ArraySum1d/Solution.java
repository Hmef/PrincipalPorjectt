package com.leetcode.ArraySum1d;

import java.util.Scanner;


/*
  
  Leetcode 
  
  https://koor.fr/Java/Tutorial/java_tableaux.wp
   
 */

public class Solution {
	
	  public int[] runningSum(int[] nums) {
		  
		 
		  return null;
	        
	    }
	  
	  public static void main(String[] args) {
		
		  
		  
		  int[] tab = new int[3];
		  
		  for(int i = 0;i<tab.length;i++) {
			  
			  System.out.println(" Enter the Number : ");
			  Scanner scan = new Scanner(System.in);
			  int input = scan.nextInt();
			  tab[i] = input;
			  
			 // scan.close();  // scan is never closed
			  
			  // TO DO: afficher le contenu du tableau 

		  }
		  
		  for(int i=0; i<tab.length;i++) {
			  
			  System.out.println("tab[" + i + "]");
		  }
		  
		  System.out.println(" length : " + tab.length);
		  
		  System.out.println(" Output : " + tab); /// 
		  
		  System.out.println(" tab[2] : " + tab[2]);
		  
		  // among the most asked questions // Koor
		  System.out.println(" tab[-1] : " + tab[-1]); //ArrayIndexOutOfBoundsException
  
		 
	}

}


/*
 * 
	Input: nums = [1,2,3,4]
	Output: [1,3,6,10]
	Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
