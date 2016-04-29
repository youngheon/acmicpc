package _2609;

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
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] str2 = str.split("\\s+");
		int num1 = Integer.parseInt(str2[0]);
		int num2 = Integer.parseInt(str2[1]);
		
		System.out.println(gcd(num1,num2));
		System.out.println(lcm(num1,num2));
		

	}

}
