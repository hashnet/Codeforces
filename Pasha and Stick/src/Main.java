import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		if((n < 6) || ((n&1) != 0)) {
			System.out.println("0");
			return;
		}
		
		long k = n/2;
		if((k&1) == 0) {
			System.out.println((k/2) - 1);
		} else {
			System.out.println(k/2);
		}
	}
}
