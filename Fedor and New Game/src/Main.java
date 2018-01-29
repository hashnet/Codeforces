import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int[] x = new int[m+2];
		for(int i=1; i<=m+1; i++) {
			x[i] = sc.nextInt();
		}
		
		int friends = 0;
		for(int i=1; i<=m; i++) {
			int xor = x[i] ^ x[m+1];
		
			int count = 0;
			while(xor > 0) {
				if ((xor & 1) != 0) ++count;
				xor>>=1;
			}
			if(count <= k) ++ friends;
		}
		
		System.out.println(friends);
	}
}
