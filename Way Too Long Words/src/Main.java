import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(--t >= 0) {
			String str = br.readLine();
			
			if(str.length() > 10) {
				StringBuilder newStr = new StringBuilder();
				newStr.append(str.charAt(0));
				newStr.append(str.length()-2);
				newStr.append(str.charAt(str.length()-1));
				
				System.out.println(newStr);
			} else {
				System.out.println(str);
			}
		}
	}
}
