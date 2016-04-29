package _2440;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int str = sc.nextInt();
	int i,j;
	
	for(i=0; i<str; i++)
    {
		for(j=str;j>i;j--)
			System.out.print("*");
		System.out.println();
    }
}
}