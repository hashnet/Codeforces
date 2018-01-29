import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		if(n == 1) {
			System.out.println("-1");
		} else {
			System.out.println(n + " " + (n+1) + " " + (n * (n+1)));
		}
	}
}
