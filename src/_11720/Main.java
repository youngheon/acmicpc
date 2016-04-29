package _11720;

import java.util.Scanner;

public class Main {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //자릿수
		int sum = 0;
		String str = sc.next();
		for(int i=0;i<num;i++)
			sum+=Character.getNumericValue(str.charAt(i));
		System.out.println(sum);
	}
}
