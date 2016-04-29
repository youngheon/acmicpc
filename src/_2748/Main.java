package _2748;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static BigInteger getFibonacciNumber(int num){
		//int first=0, second=1, result=0;
		BigInteger first  = BigInteger.valueOf(0);
		BigInteger second = BigInteger.valueOf(1);
		BigInteger result = BigInteger.valueOf(0);
		
		
		for(int index=0; index<=num; index++){
			result = first;
			first = second;
			second = result.add(second);
		}
		return result;
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		System.out.println(getFibonacciNumber(str));
	}
}
