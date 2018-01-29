import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] keyboard = {"qwertyuiop", "asdfghjkl;", "zxcvbnm,./"};
		HashMap<Character, Character> shiftLeft = new HashMap<Character, Character>();
		HashMap<Character, Character> shiftRight = new HashMap<Character, Character>();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<(keyboard[i].length()-1); j++) {
				shiftLeft.put(keyboard[i].charAt(j), keyboard[i].charAt(j+1));
			}
			for(int j=1; j<keyboard[i].length(); j++) {
				shiftRight.put(keyboard[i].charAt(j), keyboard[i].charAt(j-1));
			}
		}
		
		String shift = br.readLine();				
		String input = br.readLine();
		for(int i=0; i<input.length(); i++) {
			if(shift.equals("L")) System.out.print(shiftLeft.get(input.charAt(i)));
			else System.out.print(shiftRight.get(input.charAt(i)));
		}
		System.out.println();
	}
}
