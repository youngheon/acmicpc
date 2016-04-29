package _2747;

import java.util.Scanner;

public class Main {
	
	public static int getFibonacciNumber(int num){
		int first=0, second=1, result=0;
		
		for(int index=0; index<=num; index++){
			result = first;
			first = second;
			second = result + second;
		}
		return result;
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		System.out.println(getFibonacciNumber(str));
	}
}
