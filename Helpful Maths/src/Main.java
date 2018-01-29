import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input= br.readLine().split("\\+");
	
		int[] numCount = {0,0,0,0};
		
		for(int i=0 ; i<input.length ; i++) {
			int n = Integer.parseInt(input[i]);
			
			++numCount[n];
		}
		
		boolean firstNum = true;
		StringBuilder output = new StringBuilder();
		for(int i=1 ; i<=3 ; i++) {
			for(int j=1 ; j<= numCount[i] ; j++) {
				if(firstNum) {
					output.append(i);
					firstNum = false;
				} else {
					output.append("+");
					output.append(i);
				}
			}
		}
		
		System.out.println(output);
	}
}
