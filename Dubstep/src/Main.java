import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder input = new StringBuilder(br.readLine());
		String match = "WUB";
		
		int index = 0;
		int occ = 0;
		while(index<input.length()) {
			occ = input.indexOf(match, index);
			
			if(occ != -1) {
				if(occ == index) {
					index+=match.length();
				} else {
					System.out.print(input.substring(index, occ) + " ");
					index=occ+match.length();
				}
				
			} else {
				System.out.print(input.substring(index) + " ");
				index = input.length();
			}
		}
		
		System.out.println();		
	}
}