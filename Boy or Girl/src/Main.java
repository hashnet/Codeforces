import java.io.*;

public class Main {
	private static final int size = 26;
	private static final boolean[] characters = new boolean[size];
	
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0 ; i<size ; i++) {
			characters[i] = false;
		}
		
		String input = br.readLine();
		for(int i=0 ; i<input.length() ; i++) {
			characters[input.charAt(i) - 'a'] = true;
		}
		
		int total = 0;
		for(int i=0 ; i<size ; i++) {
			if(characters[i]) ++total;
		}
		
		if(total%2 == 0) System.out.println("CHAT WITH HER!");
		else System.out.println("IGNORE HIM!");
	}
}