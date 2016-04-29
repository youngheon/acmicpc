package _10818;

import java.util.Scanner;

public class Main {
	
	static public int maxReturn(int [] array){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
			if(array[i]>max) 
				max = array[i];
		}
		return max;
	}
	
	static public int minReturn(int [] array){
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++){
			if(array[i]<min) 
				min = array[i];
		}
		return min;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int caseTest = sc.nextInt();
		int [] array = new int[caseTest];
	    for (int i=0;i<caseTest;i++)
	    	array[i]=sc.nextInt();
	    
	    System.out.print(minReturn(array)+" "+maxReturn(array));
			}
}
