import java.io.*;

public class Main {
	private static final String hello = "hello";
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int index = 0;
		boolean match = false;
		for(int i=0 ; i<input.length() ; i++) {
			if(input.charAt(i) == hello.charAt(index)) {
				++index;
			}
			
			if(index == hello.length()) {
				match = true;
				break;
			}
		}
		
		if(match) System.out.println("YES");
		else System.out.println("NO");
	}
}