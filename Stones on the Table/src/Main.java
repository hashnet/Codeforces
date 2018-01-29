import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		
		char prev = 'N';
		int count = 0;
		for(int i=0 ; i<n ; i++) {
			if(input.charAt(i) == prev) ++count;
			prev = input.charAt(i);
		}
		
		System.out.println(count);
	}
}