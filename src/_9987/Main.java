package _9987;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
	static String getHTML() {
		String pocketmonSite="http://pokemondb.net/pokedex/national";
        URL url; // The URL to read
        HttpURLConnection conn; // The actual connection to the web page
        BufferedReader rd; // Used to read results from the web page
        String line; // An individual line of the web page HTML
        String result = ""; // A long string containing all the HTML
        try {
           url = new URL(pocketmonSite);
           conn = (HttpURLConnection) url.openConnection();
           conn.setRequestMethod("GET");
           
           rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
           while ((line = rd.readLine()) != null) {
              result += line;
           }
           rd.close();
        } catch (Exception e) {
           e.printStackTrace();
        }
        
        return result;
     }

	public static void main(String[] args) {
		
		//입력 : 번호
		
		//출력 
		//이름
		//속성 
		String num;
		Scanner sc = new Scanner(System.in);
		num=sc.next();
		num+="#";
		
		
		System.out.println(getHTML());

	}

}
