import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		StringBuilder output = new StringBuilder();
		
		for(int i=0 ; i<input.length() ; i++) {
			char c = Character.toLowerCase(input.charAt(i));
			
			if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y')) {
				output.append('.');
				output.append(c);
			}
		}
		
		System.out.println(output);
	}
}
