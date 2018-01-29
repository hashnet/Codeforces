import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		boolean[] chars = new boolean[26];
		int count = 0;
		int i=0;
		while(true) {
			i++;
			char c = str.charAt(i++);
			if(c == '}') break;
			if(chars[c-'a'] != true) {
				chars[c-'a'] = true;
				++count;
			}
			c = str.charAt(i++);
			
			if(c == '}') break;
		}
		
		System.out.println(count);
	}
}
