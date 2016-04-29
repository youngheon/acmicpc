package _1208_1934;

import java.util.Scanner;

public class Main {
	static int gcd(int x, int y){
		if(y==0){
			return x;
		}else{
			return gcd(y, x%y);
		}
	}
	static int lcm(int x, int y){
		return gcd(x,y)*(x/gcd(x,y))*(y/gcd(x,y));
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0;i<testCase;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(lcm(a,b));
		}
	}

}
