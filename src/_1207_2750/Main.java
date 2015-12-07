package _1207_2750;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<testCase;i++){
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		
		for(int i=0;i<testCase;i++)
			System.out.println(list.get(i));
	}
}
