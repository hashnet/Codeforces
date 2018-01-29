import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] mn = br.readLine().split("\\s+");
		int m = Integer.parseInt(mn[0]);
		int n = Integer.parseInt(mn[1]);
		
		int result = (m*n)/2;
		
		System.out.println(result);
	}
}
