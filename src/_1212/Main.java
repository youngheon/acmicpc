package _1212;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static int func(int n){
		if(n==0){
			return 0; 
		}
		return (n%10)+func(n/10)+func(n/100);
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		BigInteger.valueOf(Long.parseLong(str,8));
//		
//		
//		System.out.println(BigInteger.toString(BigInteger.valueOf(Integer.parseInt(str,8))));
		
		
//	int a = 1<<2;
//	int b = 1<<3;
//	int c = 1<<1;
//	int result = 7;
//	
//	result &=a;
//	result |=b;
//	result ^=c;
//	result = ~result;
//	System.out.println(result);
//		int j;
//		for(int i=1;i<=4;i++){
//			for(j=i;j<=4;j++){
//				System.out.print(j);
//			}
//			System.out.println();
		
//		}


//
//		System.out.println(func());
//		System.out.println(func(512));
//		System.out.println(func(1049));
//		System.out.println(func(2013));
//	System.out.println(func(3021));
//		
//int n=63, c=0;
//		while(n>1){
//			c+=(n&3);
//			n/=2;
//			
//			
//		}
//		System.out.println(c);
int a=1;
int b=20;
int ret=0;
for(int i=a;i<=b;++i){
	Boolean ok = true;
	if(i==1) ok =false;
	for(int j=2;j*j<=i;++j){
		if(i%j==0){
			ok =false;
		}
	}
	if(ok) ret++;
}
System.out.println(ret);
		
		
	}
}
