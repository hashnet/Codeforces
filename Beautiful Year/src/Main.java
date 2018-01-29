import java.io.*;

public class Main {
	private static boolean checkUniqueness(String str) {
		for(int i=0; i<str.length()-1; i++) {
			for(int j=i+1; j<str.length(); j++){
				if(str.charAt(i) == str.charAt(j)) return false;
			}
		}
			
		return true;	
	}
	
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		for(int i = Integer.parseInt(input) + 1 ; ; i++) {
			if(checkUniqueness(String.valueOf(i))) {
				System.out.println(i);
				break;
			}
		}
	}
}
