import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int d = sc.nextInt();
		
		long[] ways = new long[n+1];
		long[] dways = new long[n+1];
		for(int i=1; i<=n; i++) {
			long sum = 0;
			long dsum = 0;
			for(int j=1; j<=k && j<=i; j++) {
				sum += ways[i-j];
				if(j >= d) {
					dsum += ways[i-j];
				} else {
					dsum += dways[i-j];
				}
			}
			if(i <= k) {
				sum+=1;
				if(i >= d) {
					dsum+=1;
				}
			}
			
			ways[i] = sum%1000000007;
			dways[i] = dsum%1000000007;
		}
		
		System.out.println(dways[n]);
	}
}
