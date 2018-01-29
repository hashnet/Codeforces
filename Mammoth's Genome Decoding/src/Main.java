import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder str = new StringBuilder(br.readLine());
		
		int countA = 0;
		int countG = 0;
		int countC = 0;
		int countT = 0;
		int countQ = 0;
		
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == 'A') ++countA;
			else if(str.charAt(i) == 'G') ++countG;
			else if(str.charAt(i) == 'C') ++countC;
			else if(str.charAt(i) == 'T') ++countT;
			else if(str.charAt(i) == '?') ++countQ;
		}
		

		if(n%4 != 0) {
			System.out.println("===");
			return;
		}
		
		int s = n/4;
		if(countA > s || countG > s || countC > s || countT > s) {
			System.out.println("===");
			return;
		}
		
		List<Character> remChars = new ArrayList<Character>();
		for(int i=1; i<=(s-countA); i++) {
			remChars.add('A');
		}
		for(int i=1; i<=(s-countG); i++) {
			remChars.add('G');
		}
		for(int i=1; i<=(s-countC); i++) {
			remChars.add('C');
		}
		for(int i=1; i<=(s-countT); i++) {
			remChars.add('T');
		}
		
		int j = 0;
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == '?') {
				str.setCharAt(i, remChars.get(j++));
			}
		}
		
		System.out.println(str);
	}
}
