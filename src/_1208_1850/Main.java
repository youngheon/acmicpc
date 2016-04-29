package _1208_1850;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String a2="";
		String b2="";
		for(int i=0;i<a;i++){
			a2+=1;
		}
		for(int j=0;j<b;j++){
			b2+=1;
		}
		BigInteger x = new BigInteger(a2);
		BigInteger y = new BigInteger(b2);
		System.out.println(x.gcd(y));
		
	}
	
}