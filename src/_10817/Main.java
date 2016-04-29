package _10817;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] str2 = str.split("\\s+");
		int [] array = new int[3];
		array[0] = Integer.parseInt(str2[0]);
		array[1] = Integer.parseInt(str2[1]);
		array[2] = Integer.parseInt(str2[2]);
		
		Arrays.sort(array);
		
		System.out.println(array[1]);
		
	}

}