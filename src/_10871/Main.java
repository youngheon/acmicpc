package _10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		
		String [] sizeValue = str.split("\\s+");
		String [] values = str2.split("\\s+");
		
		int numSize = Integer.parseInt(sizeValue[0]);
		int value = Integer.parseInt(sizeValue[1]);
		
		int [] num = new int[values.length];
		for(int i=0;i<values.length;i++){
			num[i]=Integer.parseInt(values[i]);
			if(value>num[i]){
				System.out.print(num[i]+" ");
			}
		}
		
	}

}
