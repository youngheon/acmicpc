package _2935;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = new BigInteger(sc.next());
		String c = sc.next();
		BigInteger b = new BigInteger(sc.next());
		
		if(c.equals("*"))
			System.out.print(a.multiply(b));
		else
			System.out.print(a.add(b));
		
	}

}
