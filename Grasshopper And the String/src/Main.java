import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
	
		int hop = 1;
		int maxHop = 0;
		char c;
		for(int i=0; i<input.length() ; i++) {
			c = input.charAt(i);
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') {
				if(maxHop < hop) maxHop = hop;
				hop = 1;
			} else {
				++hop;
			}
		}
		if(maxHop < hop) maxHop = hop;
		
		System.out.println(maxHop);
	}
}
		