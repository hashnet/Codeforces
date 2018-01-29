import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		long k = sc.nextLong();
		long sx = sc.nextLong();
		long sy = sc.nextLong();
		
		long c;
		long max;
		long min;
		
		long x = (k + (m - 1)) / m;
		if(x <= n) {
			c = 0;
			max = 1;
			if(x == n) min = 1;
			else min = 0;
		} else {
			x = x - n;
			c = 1;
			
			c += x / (n-1);
			x = x % (n-1);
		
			if(x > 0) max = c+1;
			else max = c;
			
			min = 1;
			min += (c-1) / 2;
		}
		
		System.out.println(max + " " + min);	
	}
}
