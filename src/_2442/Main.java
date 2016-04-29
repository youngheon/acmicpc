package _2442;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		int i, j;

		for (i = 0; i < str; i++) {
			for (j = 0; j < str-1 - i; j++)
				System.out.printf("*");
			for (j = 0; j < i * 2 + 1; j++)
				System.out.printf(" ");

			System.out.println();
		}
	}
}
