package _1206_2438;

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = "*";
		for(int i=0;i<num;i++){
			System.out.println(str);
			str+="*";
		}
				
	}
}
