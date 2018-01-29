import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] votes = new int[n];
		Arrays.fill(votes, 0);
		
		for(int i=0; i<m; i++) {
			int max = sc.nextInt();
			int candidate = 0;
			for(int j=1; j<n; j++) {
				int v = sc.nextInt();
			
				if(v > max) {
					max = v;
					candidate = j;
				}
			}
			
			++votes[candidate];
		}
		
		int max = votes[0];
		int candidate = 0;
		for(int i=1; i<n; i++) {
			if(votes[i] > max) {
				max = votes[i];
				candidate = i;
			}
		}
		
		System.out.println(++candidate);
	}
}
