import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long countA = a/k;
		long countB = b/k;
		
		long remA = a%k;
		long remB = b%k;
		
		if(remA > 0) {
			if(countB <= 0) {
				System.out.println("-1");
				return;
			}
		}
		if(remB > 0) {
			if(countA <= 0) {
				System.out.println("-1");
				return;
			}
		}
		
		long result = countA + countB;
		System.out.println(result);
	}
}
		