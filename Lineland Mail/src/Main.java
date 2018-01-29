import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		long[] c = new long[n+1];
		
		for(int i=1; i<=n; i++) {
			c[i] = sc.nextLong();
		}
		
		for(int i=1; i<=n; i++) {
			long min = 0;
			long max = 0;
			
			if(i==1) {
				min = Math.abs(c[i+1] - c[i]);
				max = Math.abs(c[n] - c[i]);
			} else if(i==n) {
				min = Math.abs(c[i-1] - c[i]);
				max = Math.abs(c[1] - c[i]);
			} else {
				min = getMin(Math.abs(c[i-1] - c[i]), Math.abs(c[i+1] - c[i]));
				max = getMax(Math.abs(c[1] - c[i]), Math.abs(c[n] - c[i]));
			}
			
			System.out.println(min + " " + max);
		}
	}
	
	private static long getMin(long a, long b) {
		if(a < b) return a;
		else return b;
	}
	
	private static long getMax(long a, long b) {
		if(a > b) return a;
		else return b;
	}
}
