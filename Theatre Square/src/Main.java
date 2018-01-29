import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] values = br.readLine().split("\\s+");
		
		long n = Long.parseLong(values[0]);
		long m = Long.parseLong(values[1]);
		long a = Long.parseLong(values[2]);
		
		System.out.println((((n-1)/a)+1) * (((m-1)/a)+1));
	}
}
