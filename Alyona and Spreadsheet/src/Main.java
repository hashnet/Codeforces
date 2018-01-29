import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[][] list = new int[n][m];
		
		for(int j=0; j<m; j++) list[0][j] = 1;
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] >= arr[i-1][j]) list[i][j] = list[i-1][j] + 1;
				else list[i][j] = 1;
			}
		}
		
		int t = sc.nextInt();
		while(--t >= 0) {
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			
			boolean found = false;
			for(int j=0; j<m; j++) {
				if(list[r][j] >= (r-l+1)) {
					found = true;
					break;
				}
			}
			
			System.out.println(found == true ? "Yes" : "No");
		}
		
	}
}