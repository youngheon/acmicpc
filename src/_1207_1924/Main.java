package _1207_1924;

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		
		/*
		 * 
		 *  1,3,5,7,8,10,12 ==> 31
		 *  4,6,8,9,11 ==> 30
		 *  2 ==> 28
		 *  1월 1일은 월요일부터 시작 		
		 */
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] str2 = str.split("\\s+");
		
		int month = Integer.parseInt(str2[0]);
		int day = Integer.parseInt(str2[1]);
		
//		int month = 3;
//		int day = 1;
	    int sumDate = day;
		
		String [] date = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	    int [] dayBymonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=1;i<month;i++){
			sumDate+=dayBymonth[i-1];
		}
		
		System.out.println(sumDate);
		System.out.println(date[sumDate%7]);
	}
		
	
}
