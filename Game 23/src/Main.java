import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		if(n == m) {
			System.out.println(0);
			return;
		}
		
		long d = m/n;
		if((d*n) != m) {
			System.out.println("-1");
			return;
		}
		
		long count = 0;
		while(d%2 == 0) {
			d = d / 2;
			++count;
		}
		
		while(d != 1) {
			if(d%3 != 0) {
				System.out.println("-1");
				return;
			}
			
			d = d / 3;
			++count;
		}
		
		System.out.println(count);
	}
}
