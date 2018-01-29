import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		String[] values = br.readLine().split("\\s+");
		List<Integer> coins = new ArrayList<Integer>();
		
		int sum = 0;
		for(int i=0 ; i<n ; i++){
			int num = Integer.parseInt(values[i]);
			sum+=num;
			coins.add(num);
		}
		
		Collections.sort(coins);
		Collections.reverse(coins);
		
		int a = 0;
		int b = sum;
		int min = 0;
		
		for(int num : coins) {
			++min;
			a+=num;
			b-=num;
			
			if(a > b) break;
		}
		
		System.out.println(min);
	}
}