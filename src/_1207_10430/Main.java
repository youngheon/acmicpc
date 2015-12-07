package _1207_10430;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] str2 = str.split("\\s+");
		int a = Integer.parseInt(str2[0]);
		int b = Integer.parseInt(str2[1]);
		int c = Integer.parseInt(str2[2]);
		 
		System.out.println((a+b)%c);
		System.out.println((a%c+b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c*b%c)%c);
		
		
	}

}
