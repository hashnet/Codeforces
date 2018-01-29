import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] table = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || j==1) table[i][j] = 1;
				else table[i][j] = table[i-1][j] + table[i][j-1];
			}
		}

		System.out.println(table[n][n]);
	}
}
