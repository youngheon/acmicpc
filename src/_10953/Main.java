package _10953;

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int testCase;
		testCase = sc.nextInt();
		
		int i=0;
		while(testCase-- > 0){
			String str = sc.next();
			String [] str2; 
			str2 = str.split(",");
			System.out.println(Integer.parseInt(str2[0])+Integer.parseInt(str2[1]));
		}
		
	}
}

