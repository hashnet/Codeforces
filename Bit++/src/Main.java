import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int x = 0;
		while(--n >= 0) {
			String str = br.readLine();
			
			if(str.charAt(0) == '+' || str.charAt(2) == '+') ++x;
			if(str.charAt(0) == '-' || str.charAt(2) == '-') --x;
		}
		
		System.out.println(x);
	}
}