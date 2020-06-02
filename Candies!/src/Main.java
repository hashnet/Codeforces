import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int m = 1;
		int k = 0;
		while(m <n) {
			++k;
			m *= 2;
		}
		int[][] dp = new int[n][k+1];
		for(int i=0; i<n; i++) {
			dp[i][0] = sc.nextInt();
		}
		
		for(int ik=1, d=2; ik<=k; ik++, d*=2) {
			for(int i=0; i<=n-d; i++) {
				dp[i][ik] = dp[i][ik-1] + dp[i+d/2][ik-1];
			}
		}
		//print2DArray(dp);
		
		int q = sc.nextInt();
		for(int i=0; i<q; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			
			n = y-x+1;
			m = 1;
			k = 0;
			while(m < n) {
				++k;
				m *= 2;
			}
			System.out.println(dp[x][k] / 10);
		}
		
		sc.close();
	}
	
	private static void print2DArray(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(String.format("%3d", arr[i][j]));
			}
			
			System.out.println();
		}
		System.out.println();
	}
}
