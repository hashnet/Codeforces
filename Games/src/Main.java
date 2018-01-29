import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] teams = new int[n][2];
		
		for(int i=0; i<n; i++) {
			teams[i][0] = sc.nextInt();
			teams[i][1] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(teams[i][0] == teams[j][1]) ++count;
				if(teams[j][0] == teams[i][1]) ++count;
			}
		}
		
		System.out.println(count);
	}
}
