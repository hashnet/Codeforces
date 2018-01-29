import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<Character, Integer> pieces = new HashMap<Character, Integer>();
		pieces.put('Q', 9);
		pieces.put('R', 5);
		pieces.put('B', 3);
		pieces.put('N', 3);
		pieces.put('P', 1);
		pieces.put('q', -9);
		pieces.put('r', -5);
		pieces.put('b', -3);
		pieces.put('n', -3);
		pieces.put('p', -1);

		int count = 0;
		for(int i=1; i<=8; i++) {
			String row = br.readLine();
			for(int j=0; j<8; j++) {
				char c = row.charAt(j);
				
				if(pieces.containsKey(c)) count+=pieces.get(c);
			}
		}
		
		if(count == 0) System.out.println("Draw");
		else if(count > 0) System.out.println("White");
		else System.out.println("Black");
	}
}
