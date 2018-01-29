import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int count = 0;
		for(int i=0 ; i<input.length() ; i++) {
			if(input.charAt(i) == '4' || input.charAt(i) == '7') ++count;
		}
		
		if(count == 4 || count == 7) System.out.println("YES");
		else System.out.println("NO");
	}
}