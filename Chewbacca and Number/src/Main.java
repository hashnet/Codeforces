import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder str = new StringBuilder(br.readLine());
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) > '4') {
				if(!(str.charAt(i) == '9' && i==0))
				str.setCharAt(i, (char) ('0'+'9'-str.charAt(i)));
			}
		}
		
		System.out.println(str);
	}
}
