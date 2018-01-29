import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();
		
		if(n <= m) {
			System.out.println(n);
			return;
		}
		
		double x = (double)(n - m);
		x = Math.sqrt(8*x + 1);
		x = (x - 1)/2;
		
		System.out.println(m + (long)Math.ceil(x));
	}
}
