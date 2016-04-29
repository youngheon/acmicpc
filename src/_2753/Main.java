package _2753;

import java.util.Scanner;

public class Main {
	
	static void isLeapYear(int year){
		 boolean isYun=false;
         
         if( (0 == (year % 4) && 
                  0 != (year %100)) || 
                  0 == year%400 ){
                 isYun = true;
         }else{
                 isYun = false;
         }
                 
         if(isYun){
                 System.out.println("1");
         }else{
                 System.out.println("0");
         }                
	}
	
	

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		isLeapYear(num);
		
	}
}
