package _2752;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		BigInteger [] num = {sc.nextBigInteger(),sc.nextBigInteger(),sc.nextBigInteger()};
		Arrays.sort(num);
		System.out.println(num[0]+" "+num[1]+" "+num[2]);
	}
}
