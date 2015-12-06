package _1206_10818;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	static public int maxReturn(int [] array){
		int max=0;
		
		for(int i=0;i<array.length-1;i++){
			if(array[i] > array[i+1]){
				max = array[i];
			}else{
				max = array[i+1];
			}
		}
		
		
		return max;
	}
	
	public int minReturn(int [] array){
		
		
		return 0;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int caseTest = sc.nextInt();
		String str = sc.next();
		String [] str2 = str.split("\\s+");
		System.out.println(str2.length);
		int [] array = new int[caseTest];
		for(int i=0;i<str2.length;i++){
			array[i] = Integer.parseInt(str2[i]);
		}
	}

}
