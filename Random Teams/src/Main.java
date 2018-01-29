import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long d = n/m;
		long r = n - (d * m);
		
		long min = 0;
		min += nc2(d+1) * r;
		min += nc2(d) * (m-r);
		
		long max = 0;
		max += nc2(n - (m-1));
		
		System.out.println(min + " " + max);
	}
	
	private static long nc2(long n) {
		return (n * (n-1))/2;
	}
}
