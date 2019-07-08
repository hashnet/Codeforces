import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[][] dp = new int[n][n];
		for(int d=2; d<=n ;d*=2) {
			for(int i=0; i<=n-d; i++) {
				arr[i] = arr[i] + arr[i+1];
				if(arr[i] >= 10) dp[i][i+d-1] = 1;
				
				int x = d/2;
				dp[i][i+d-1] += dp[i][i+x-1] + dp[i+x][i+d-1];
				
				arr[i] %= 10;
			}
		}
		
		int q = sc.nextInt();
		for(int i=0; i<q; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(dp[x-1][y-1]);
		}
	}
	
	private static void print2DArray(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
