package _2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		String numB = sc.next();
		
		char[] number = numB.toCharArray();
		
		int result;
		result = numA * Integer.parseInt(number[2]+"");
		System.out.println(result);
		
		result = numA * Integer.parseInt(number[1]+"");
		System.out.println(result);
		
		result = numA * Integer.parseInt(number[0]+"");
		System.out.println(result);
		
		System.out.println(numA * Integer.parseInt(numB));
		
	}

}
