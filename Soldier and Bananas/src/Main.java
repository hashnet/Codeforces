import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String val[] = br.readLine().split("\\s+");
		int k = Integer.parseInt(val[0]);
		int n = Integer.parseInt(val[1]);
		int w = Integer.parseInt(val[2]);
		
		int req = (k * w * (w+1))/2;
		
		if(req <= n) System.out.println(0);
		else System.out.println(req - n);		
	}
}