import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		String output = "";
		for(int i=0; i<n; i++) {
			if((n-i)%2 == 0) {
				output = input.charAt(i) + output;
			} else {
				output = output + input.charAt(i);
			}
		}
		
		System.out.println(output);
	}
}
