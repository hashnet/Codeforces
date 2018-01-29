import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		int k = sc.nextInt();
		
		List<Long> divisors = new ArrayList<Long>();
		
		for(long i=1; i*i <= n; i++) {
			if(n%i == 0) divisors.add(i);
		}
		
		int available = divisors.size();
		long last = divisors.get(available-1);
		
		int total = 0;
		if(last * last == n) total = (2 * available) - 1;
		else total = 2 * available;
		
		if(k > total) System.out.println("-1");
		else {
			if(k <= available) System.out.println(divisors.get(k-1));
			else {
				int index;
				if(total%2 == 0) {
					index = (2 * available) - k + 1;
				} else {
					index = (2 * available) - k;
				}
				System.out.println(n/divisors.get(index-1));
			}
		}
	}
}