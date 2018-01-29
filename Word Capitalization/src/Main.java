import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder str = new StringBuilder(br.readLine());
		str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
		
		System.out.println(str.toString());
	}
}