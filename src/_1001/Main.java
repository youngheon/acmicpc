package _1001;

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] str2 = str.split("\\s+");
		
		System.out.printf("%.10f", (double)Integer.parseInt(str2[0])/(double)Integer.parseInt(str2[1]));
	}

}
