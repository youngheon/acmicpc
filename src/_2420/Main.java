package _2420;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] str2 = str.split("\\s+");
		BigInteger a = new BigInteger(str2[0]); 
		BigInteger b = new BigInteger(str2[1]); 
		
		
		System.out.println(a.subtract(b).abs());
	}
}
