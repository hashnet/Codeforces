import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();

		BigInteger start = new BigInteger("10").pow(n-1);
		BigInteger end = new BigInteger("10").pow(n).subtract(new BigInteger("1"));
		BigInteger mod = new BigInteger(String.valueOf(t));
		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		
		while(true) {
			if(start.mod(mod).compareTo(zero) == 0) {
				System.out.println(start.toString());
				return;
			}
			
			if(start.compareTo(end) == 0) {
				System.out.println("-1");
				return;
			}
			
			start = start.add(one);
		}
	}
}
