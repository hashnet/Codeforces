import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		long value = 0;
		while(n >= 1) {
			long middle = (long)Math.pow(2, n-1);
			if(k == middle) {
				value = n;
				break;
			} else if(k > middle) {
				k = k - middle;
			}
			--n;
		}
		
		System.out.println(value);
	}
}
