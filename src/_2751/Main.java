package _2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
       
        StringBuffer result = new StringBuffer();
        
        int n;
        
        List<Integer> list = new ArrayList<>();
        
         
        n=t;
            for(int i = 0; i < n ; i++){
                list.add(Integer.parseInt(br.readLine()));
            }
            Collections.sort(list);
            for(int i = 0; i < n ; i++){        
                result.append(list.get(i)+"\n");
            }
             
             
            //line = br.readLine();
        
        result.deleteCharAt(result.length()-1);
        System.out.println(result);
 
    }
 
}
