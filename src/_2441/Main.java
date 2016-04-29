package _2441;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int str = sc.nextInt();
	int i,j;
	
	for(i=str-1; i>=0; i--)
    {
		for(j=1;j<str-i;j++)
			System.out.print(" ");
		for(j=0;j<=i;j++)
			System.out.print("*");
		
		System.out.println();
    }
}
}