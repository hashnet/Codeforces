import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		int smallCount = 0;
		int capitalCount = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ++smallCount;
			else ++capitalCount;
		}
		
		System.out.println(smallCount >= capitalCount ? str.toLowerCase() : str.toUpperCase());
	}
}
