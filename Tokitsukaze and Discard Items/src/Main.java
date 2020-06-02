import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		int m = sc.nextInt();
		Long k = sc.nextLong();
		
		long[] ms = new long[m];
		for(int i=0; i<m; i++) {
			ms[i] = sc.nextLong();
		}
		
		long pos = k;
		int idx = 0;
		int res = 0;
		while(true) {
			if(idx >= m) break;
			
			int dCount = 0;
			while(idx < m && ms[idx] <= pos) {
				++idx;
				++dCount;
			}
			
			if(dCount > 0) {
				pos += dCount;
				++res;
			} else {
				if(idx >= m) break;
				
				pos += ((((ms[idx] - 1 - pos) / k) + 1) * k);
			}
		}
		
		System.out.println(res);
		
		sc.close();
	}
}
