import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		
		StringBuilder check1 = new StringBuilder(input.toUpperCase());
		StringBuilder check2 = new StringBuilder(check1);
		check2.setCharAt(0, Character.toLowerCase(check2.charAt(0)));
		
		StringBuilder output;
		if(input.compareTo(check1.toString()) == 0) {
			output = new StringBuilder(input.toLowerCase());
			System.out.println(output.toString());
		} else if(input.compareTo(check2.toString()) == 0) {
			output = new StringBuilder(input.toLowerCase());
			output.setCharAt(0, Character.toUpperCase(output.charAt(0)));
			System.out.println(output.toString());
		} else {		
			System.out.println(input);
		}
	}
}