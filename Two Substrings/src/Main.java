import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		if(str.contains("AB") && str.substring(str.indexOf("AB")+2).contains("BA")) {
			System.out.println("YES");
			return;
		}
		
		if(str.contains("BA") && str.substring(str.indexOf("BA")+2).contains("AB")) {
			System.out.println("YES");
			return;
		}
		
		System.out.println("NO");
	}
}
