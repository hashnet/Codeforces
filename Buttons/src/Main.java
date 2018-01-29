import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long output = (((n-1) * n * (n+1)) / 6 ) + n;
		
		System.out.println(output);
	}
}
