import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		int result = a.compareToIgnoreCase(b);
		
		if(result > 0) result = 1;
		if(result < 0) result = -1;
		
		System.out.println(result);
	}
}
