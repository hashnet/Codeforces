import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder str1 = new StringBuilder(br.readLine());
		StringBuilder str2 = new StringBuilder(br.readLine());
		
		str1 = str1.reverse();
		if(str1.toString().equals(str2.toString())) System.out.println("YES");
		else System.out.println("NO");
	}
}
