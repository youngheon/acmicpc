package _5347;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0;i<testCase;i++){
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			BigInteger gcd = a.gcd(b);
			
			System.out.println(gcd.multiply(a.divide(gcd)).multiply(b.divide(gcd)));
		}
	}
}
