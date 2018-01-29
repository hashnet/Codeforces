import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		long m = sc.nextInt();
		
		long maxN = n * 2;
		long maxM = m * 3;
		
		long min = Long.min(maxN, maxM);
		long exc = min/6;
		
		while(exc > 0) {
			if(maxN + 2 <= maxM + 3) {
				maxN += 2;
				
				if(!(maxN <= maxM && maxN%6 == 0)) -- exc;
			} else {
				maxM += 3;
				
				if(!(maxM <= maxN && maxM%6 == 0)) -- exc;
			}
		}
		
		long max = Long.max(maxN, maxM);		
		System.out.println(max);
	}
}
