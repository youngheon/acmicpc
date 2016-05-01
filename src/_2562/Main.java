package _2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[9];
		int max=0,cnt=0;
		for(int i=0;i<9;i++){
			num[i]=Integer.parseInt(sc.nextLine());
			if(num[i] > max){
				max = num[i];
				cnt = i;
			}
				
		}
		
		System.out.println(max);
		System.out.println(cnt+1);
		
	}

}
