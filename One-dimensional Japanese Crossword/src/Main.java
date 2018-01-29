import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		List<Integer> b = new ArrayList<Integer>();
		
		boolean lastB = false;
		int bLen = 0;
		for(int i=0; i<k; i++) {
			if(input.charAt(i) == 'W') {
				if(lastB == true) {
					b.add(bLen);
					
					lastB = false;
				} else {
					
				}
			} else if(input.charAt(i) == 'B') {
				if(lastB == true) {
					++bLen;
				} else {
					lastB = true;
					bLen = 1;
				}
			}
		}
		
		if(lastB == true) b.add(bLen);
		
		System.out.println(b.size());
		
		for(int i=0; i<b.size(); i++) {
			System.out.print(b.get(i) + " ");
		}
		System.out.println();
	}
}
