import java.io.*;
import java.util.*;

public class Main {
	public static boolean isComposite(int num) {
		if (num < 4) return false;
		
		int limit = (int) Math.sqrt((double) num);
		
		for(int i=2; i<=limit; i++) {
			if(num%i == 0) return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		int start = 4;
		int end = 1 + (input-1)/2;
		
		for(int num = start ; num <= end ; num++) {
			int left = num;
			int right = input - num;
			
			if(isComposite(left) && isComposite(right)) {
				System.out.println(left + " " + right);
				break;
			}
		}
	}
}