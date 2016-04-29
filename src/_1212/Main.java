package _1212;

import java.util.Scanner;
//2진수 to 8진
public class Main {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.print(octalToBinary(str));
		
	}
	static String octalToBinary(String s) {
        char int8[] = s.toCharArray();
        int n = int8.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String a = Integer.toBinaryString((int) int8[i] - 48);
            if ((n - i) < n) a = radix(a);
            sb.append(a);
        }
       return sb.toString();
 }
static String radix(String r) {
       int n = r.length();
       if (n < 3) {
          r = "00" + r;
          n = r.length();
          return r.substring(n - 3, n);
      } else
          return r;

}
}
