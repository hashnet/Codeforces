import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int w = Integer.parseInt(br.readLine());
		
		if(w >= 4 && (w%2) == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
