import java.io.*;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) == 'H' || str.charAt(i) == 'Q' || str.charAt(i) == '9') {
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");
	}
}