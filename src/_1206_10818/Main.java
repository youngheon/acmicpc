package _1206_10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static public int maxReturn(int [] array){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
			if(array[i]>max) max = array[i];
		}
		return max;
	}
	
	static public int minReturn(int [] array){
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++){
			if(array[i]<min) min = array[i];
		
		}
		
		return min;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int caseTest = sc.nextInt();
		
		int [] array = new int[caseTest];
		//String str = "20 10 20";
	    for (int i=0;i<caseTest;i++)
	    	array[i]=sc.nextInt();
	    
//	    Arrays.sort(array);
	    System.out.print(minReturn(array)+" "+maxReturn(array));
		

	}

}
