import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int z = sc.nextInt();
		
		System.out.println(z / lcm(n, m));
	}
	
	private static int lcm(int a, int b) {
		long x = a * b;
		return (int) x / gcd(a, b);
	}
	
	private static int gcd(int a, int b) {
		return b==0 ? a : gcd(b, a%b);
	}
}
