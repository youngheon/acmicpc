package _2446;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int st=0;
		num=num*2-1;
		num = (num%2) == 0 ? num-1 : num;
		for(int i=0;i<num;i++){
			for(int j=0; j<(num-st);j++){
				System.out.print((j >= st )? "*" : " ");
			}
			st = i < (num/2)?st+1:st-1;
			System.out.println();
		}
	}
}
