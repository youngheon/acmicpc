package n.test;

import java.util.HashSet;
import java.util.Iterator;

public class RecordMaker {
	 
	final String companyShortName = "NT";
	private HashSet<personVo> hs = new HashSet<personVo>();
	
	//DAO || VO
	class personVo{
		private String personNo;
		private int personValue;
		
		public personVo(int personNo, int personValue){
			this.personNo = formatter(personNo);
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
			hs.add(new personVo(createNo(5),createNo(2)));
			personVo vo = (personVo)obj;
			return personNo.equals(vo.personNo);
		}
		
		@Override
		public String toString(){
			return personNo+" "+personValue;
		}
	}
	
	// Create create inputCount
	private int count;
	public int getCount(){
		return this.count;
	}
	public void setCount(int count){
		this.count = count;
	}
	
	//Create Random Numeric
	public int createNo(int digit){
		if(digit==5){  //personNo
			return (int)(Math.random()*100000+1);			
		}else{ //personValue
			return (int)(Math.random()*100);
		}
	}
	
	//Change Format
	public String formatter(int personNo){
		
		String result=companyShortName;
		for(int i=0; i<5-(""+personNo).length();i++){
			result+="0";
		}
		result+=personNo;
		return result;
	}
	
	//Input by keyboard
	public void inputCount(String args) throws NumberFormatException{
		setCount(Integer.parseInt(args));
	}
	
	//Add HashSet
	public void setList(){
		for(int i=0; i<getCount();i++){
			hs.add(new personVo(createNo(5),createNo(2)));
		}
	}
	
	//print
	public void getList(){
		Iterator<personVo> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public void run(String args){
		inputCount(args);
		setList();
		getList();
	}
	
	public static void main(String[] args){
		try {
			new RecordMaker().run(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("숫자형식으로 입력이 필요합니다.");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("실행인자 값 입력이 없습니다.");
		} catch (Exception e){
			System.out.println("에러가 발생하였습니다.");
		}
	}
}