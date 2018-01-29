import java.util.*;

public class Main {
	private static final int MAX = 1000001;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean[] primes = sieve(MAX);
		
		int n = sc.nextInt();
		int m = 1;
		while(true) {
			if (primes[(n*m) + 1] == false) {
				System.out.println(m);
				return;
			}
			++m;
		}
	}
	
	public static boolean[] sieve(int range) {
		boolean[] primes = new boolean[range+1];
		
		Arrays.fill(primes, true);
		
		primes[1] = false;
		
		int sqrtRange = (int) Math.sqrt(range);
		for(int factor=2; factor<=sqrtRange; factor++) {
			if(primes[factor] == true) {
				int div = range/factor;
				
				for(int i=factor; i <= div; i++) {
					primes[factor*i] = false;
				}
			}
		}
		
		return primes;
	}
}
