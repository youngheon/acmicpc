package _11557;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	Scanner sc;
	Map<String,Integer> univ; 
	private int testcase;
	private int univNum;
	
	public void setTestcase(int testcase){
		this.testcase = testcase;
	}
	
	public int getTestcase(){
		return this.testcase;
	}
	
	public void setUnivNum(int univNum){
		this.univNum = univNum;
	}
	
	public int getUnivNum(){
		return this.univNum;
	}
	
	public Main(){
		sc = new Scanner(System.in);
		univ = new HashMap<String,Integer>();
		setTestcase(sc.nextInt());
	}
	
	public Map<String, Integer> input(){
		setUnivNum(sc.nextInt());
		
		
		for(int i=0; i<getUnivNum(); i++){
			univ.put(sc.next(), Integer.parseInt(sc.next()));
		}
		return univ;
	}
	
	public void calcPrint(Map<String,Integer> univ){
		Set<String> set = univ.keySet();
		int num = 0;
		String univName="";
		for(String keys : set){
			String key = keys;
			int value = univ.get(key);
			if(num < value){
				num = value;
				univName = key;
			}
		}
		System.out.println(univName);
		univ.clear();
	}
	
	public void run(){
		for(int i=0;i<getTestcase();i++)
			calcPrint(input());
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}
