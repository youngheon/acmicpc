package _2163;

import java.util.Scanner;

public class Main {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if( a==1 && b!=1){
			System.out.println(b-1);
		}else if(a!=1 && b==1){
			System.out.println(a-1);
		}else{
			System.out.println((b-1)*a + a-1);
		}
	}
}
