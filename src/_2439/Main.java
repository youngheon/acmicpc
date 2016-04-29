package _2439;

import java.util.Scanner;

public class Main {
	
		public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		int i,j;
		
		for(i=0; i<str; i++)
	    {
	        for(j=0; j<str-1-i; j++)
	        {
	            System.out.print(" ");
	        }
	        
	        for(j=0; j<=i; j++)
	        {
	        	System.out.print("*");
	        }
	        System.out.print("\n");
	    }
	}
}
