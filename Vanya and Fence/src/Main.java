import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int h = sc.nextInt();
		
		int total = n;
		for(int i=1; i<=n; i++) {
			int f = sc.nextInt();
			if(f > h) ++total;
		}
		
		System.out.println(total);
	}
}
