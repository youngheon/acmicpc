package n.test;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class RecordMaker {
	
	private HashSet<personVo> hs = new HashSet<personVo>();
	
	class personVo{
		private String personNo;
		private int personValue;
		
		public personVo(int personNo, int personValue){
			this.personNo = "NT"+formatter(personNo);
			this.personValue = personValue;
		}
		public String getPersonNo() {
			return personNo;
		}
		public int getPersonValue() {
			return personValue;
		}
		
		@Override
		public int hashCode(){
			return personNo.hashCode();
		}
		@Override
		public boolean equals(Object obj){
			if(!(obj instanceof personVo)){
				return false;
			}
			hs.add(new personVo(createNo(false),createNo(true)));
			personVo vo = (personVo)obj;
			return personNo.equals(vo.personNo);
		}
		@Override
		public String toString(){
			return personNo+" "+personValue;
		}
	}
	
	// Create create Count
	private int count;
	public int getCount(){
		return this.count;
	}
	public void setCount(int count){
		this.count = count;
	}
	
	//Create Random Numeric
	public int createNo(boolean type){
		if(type==false){  //personNo
			return (int)(Math.random()*100000+1);			
		}else{ //personValue
			return (int)(Math.random()*100);
		}
	}
	
	//Change Format
	public String formatter(int personNo){
		return new DecimalFormat("00000").format(personNo);
	}
	
	//Input by keyboard
	@SuppressWarnings("resource")
	public void inputCount() throws InputMismatchException{
		setCount(new Scanner(System.in).nextInt());
	}
	
	//Add HashSet
	public void setList(){
		for(int i=0; i<getCount();i++){
			hs.add(new personVo(createNo(false),createNo(true)));
		}
		//error genertater
		//hs.add(new personVo(12345,30));
		//hs.add(new personVo(12345,40));
	}
	
	//print
	public void getList(){
		Iterator<personVo> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args){
		RecordMaker rm = new RecordMaker();
		try {
			rm.inputCount();
			rm.setList();
			rm.getList();
		} catch (InputMismatchException e) {
			System.out.println("input error");
		}
	}
}