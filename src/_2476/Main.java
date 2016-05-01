package _2476;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		System.out.println(str);
		String [] str2 = str.split("\\s+");
//		for(int i=0;i<str2.length;i++)
//			System.out.println(str2[i]);
		
		int [] num = new int[str2.length];
		for(int i=0;i<str2.length;i++)
			num[i]=Integer.parseInt(str2[i]);
		
//		//검증수 만들기
		int result=0;
		for(int i=0;i<num.length;i++)
			result += num[i]*num[i];
		System.out.println(result%10);
	}

}
