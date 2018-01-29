import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long x = sc.nextLong();
		
		long min = ((x-1)/n) + 1;
		long max = (x < n ? x : n);
		
		long total = 0;
		for(long i=min; i<=max; i++) {
			if(x%i == 0) ++ total;
		}
		
		System.out.println(total);
	}
}
