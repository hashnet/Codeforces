import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int sing = (n-1) * 10;
		for(int i=1; i<=n; i++) {
			sing += sc.nextInt();
		}
		
		if(sing > d) {
			System.out.println("-1");
			return;
		}
		
		int joke = (n-1) * 2;
		joke += (d - sing)/5;
		System.out.println(joke);
	}
}
