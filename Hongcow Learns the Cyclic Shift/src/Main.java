import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String orig = new String(str);
		
		int count = 1;
		do {
			str = String.valueOf(str.charAt(str.length()-1)).concat(str.substring(0, str.length()-1));
			if(!str.equals(orig)) ++count;
			else break;
		} while(true);
		
		System.out.println(count);
	}
}
