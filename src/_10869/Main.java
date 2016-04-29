package _10869;

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] str2 = str.split("\\s+");
		
		System.out.println(Integer.parseInt(str2[0])+Integer.parseInt(str2[1]));
		System.out.println(Integer.parseInt(str2[0])-Integer.parseInt(str2[1]));
		System.out.println(Integer.parseInt(str2[0])*Integer.parseInt(str2[1]));
		System.out.println(Integer.parseInt(str2[0])/Integer.parseInt(str2[1]));
		System.out.println(Integer.parseInt(str2[0])%Integer.parseInt(str2[1]));

	}

}