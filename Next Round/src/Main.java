import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nk = br.readLine().split("\\s+");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		
		int count = 0;
		String[] a = br.readLine().split("\\s+");
		int same = 0;
		for(int i = 1 ; i <= n ; i++) {
			int score = Integer.parseInt(a[i-1]);
			
			if(score <= 0) break;
			
			if(i <= k) {
				++count;
				if(i==k) {
					same = score;
				}
			} else {
				if(score == same) ++count;
			}
		}
		
		System.out.println(count);
	}
}