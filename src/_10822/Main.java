package _10822;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String [] str2 = str.split(",");
		int [] number = new int[str2.length];
		int sum=0;
		for(int i=0;i<number.length;i++){
			number[i]=Integer.parseInt(str2[i]);
			sum+=number[i];
		}
		System.out.println(sum);
	}

}
