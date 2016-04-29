package _10797;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String cha = sc.nextLine();
		int count=0;
//		StringTokenizer st = new StringTokenizer(cha);
//		
//		while(st.hasMoreTokens()){
//			int num2 = Integer.parseInt(st.nextToken());
//			if(num == num2){
//				count+=1;
//			}else
//				System.out.println(num2);
//		}
		//int [] arr = new int [5];
		String [] str2 = cha.split("\\s+");
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		System.out.println(str2[2]);
		System.out.println(str2[3]);
		System.out.println(str2[4]);
		
		
		
		for(int i=0;i<5;i++){
			
		}
		
		
		System.out.println(count);
		
	}

}
