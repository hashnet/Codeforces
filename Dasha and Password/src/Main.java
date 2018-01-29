import java.io.*;

public class Main {
	private static final int MAX = 1000;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nm = br.readLine().split("\\s+");
		
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		int[][] matrix = new int[n][3];
		for(int i=0; i<n; i++)
			for(int j=0; j<3; j++)
				matrix[i][j] = MAX;
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				int index = getVal(str.charAt(j));
				if(matrix[i][index] > j) matrix[i][index] = j; 
			}
			for(int j=m-1, k=1; j>=0; j--, k++) {
				int index = getVal(str.charAt(j));
				if(matrix[i][index] > k) matrix[i][index] = k;
			}
		}
		
		
		int minTotal = MAX;
		for(int i=0; i<n; i++) {
			if(matrix[i][0] == MAX) continue;
			for(int j=0; j<n; j++) {
				if(j==i || matrix[j][1] == MAX) continue;
				for(int k=0; k<n; k++) {
					if(k==j || k==i || matrix[k][2] == MAX) continue;
				
					int total = matrix[i][0] + matrix[j][1] + matrix[k][2];
					if(minTotal > total) minTotal = total;
				}
			}
		}
		
		System.out.println(minTotal);
	}
	
	public static int getVal(char c) {
		if (c >= 'a' && c <= 'z') return 0;
		if (c >= '0' && c <= '9') return 1;
		
		if(c == '#' || c=='*' || c == '&') return 2;
		
		return 0;
	}
}