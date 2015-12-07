package _1207_1924;

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] str2 = str.split("\\s+");
		
		int month = Integer.parseInt(str2[0]);
		int day = Integer.parseInt(str2[1]);
		
	    int sumDate = day;
		
		String [] date = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	    int [] dayBymonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=1;i<month;i++){
			sumDate+=dayBymonth[i-1];
		}
		
		System.out.println(date[sumDate%7]);
	}
	
}
