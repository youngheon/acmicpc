package _2754;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String result="";
		if(input.equals("A+")){
			result="4.3";
		}else if(input.equals("A0")){
			result="4.0";
		}else if(input.equals("A-")){
			result="3.7";
		}else if(input.equals("B+")){
			result="3.3";
		}else if(input.equals("B0")){
			result="3.0";
		}else if(input.equals("B-")){
			result="2.7";
		}else if(input.equals("C+")){
			result="2.3";
		}else if(input.equals("C0")){
			result="2.0";
		}else if(input.equals("C-")){
			result="1.7";
		}else if(input.equals("D+")){
			result="1.3";
		}else if(input.equals("D0")){
			result="1.0";
		}else if(input.equals("D-")){
			result="0.7";
		}else {
			result = "0.0";
		}
		System.out.println(result);
	}

}
