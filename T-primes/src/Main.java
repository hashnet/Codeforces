import java.io.*;
import java.util.*;

public class Main {
	private static final int MAX = 1000000;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] primes = sieve(MAX);
		
		int k = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split("\\s+");
		for(int i=0; i<k; i++) {
			long n = Long.parseLong(input[i]);
			long sqrtN = (long) Math.sqrt(n);
			
			if(sqrtN * sqrtN != n) {
				System.out.println("NO");
			} else {
				System.out.println(primes[(int)sqrtN] == true ? "YES" : "NO");
			}
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
