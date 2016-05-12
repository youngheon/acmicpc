package _2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=0, m=0, plus, g=0;
		h = sc.nextInt();
		m = sc.nextInt();
		plus = sc.nextInt();
		m+=plus;
		if(m>=60){
			g=m/60;
			m=m-60*g;
		}
		h=h+g;
		if(h>=24){
			h=h-24;
		}
		System.out.print(h +" " +m);
		
	}

}
