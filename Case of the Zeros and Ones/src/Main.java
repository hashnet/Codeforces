import java.io.*;
	
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int countZero = 0;
		int countOne = 0;
		
		for(int i=0; i<n; i++) {
			if(input.charAt(i) == '0') ++countZero;
			else if(input.charAt(i) == '1') ++countOne;
		}
		
		int max = countZero > countOne ? countZero : countOne;
		int min = countZero < countOne ? countZero : countOne;
		
		System.out.println(max - min);
	}
}
