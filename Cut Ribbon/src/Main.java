import java.util.*;

public class Main {
	private static int max(int a, int b) {
		return (a > b ? a : b);
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] c = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		int[] dp = new int[n+1];
		
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for(int j=0; j<3; j++) {
			for(int i=c[j]; i<=n; i++) {
				if(dp[i-c[j]] != -1) {
					dp[i] = max(dp[i], dp[i-c[j]] + 1);
				}
			}
		}
		
		if(dp[n] == -1) System.out.println("0");
		else System.out.println(dp[n]);
	}
}
