import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		
		
		int prev = 0;
		int count = 0;
		while(--n >= 0) {
			int next = sc.nextInt();
			if((next - prev) <= c) 	++ count;
			else count = 1;

			prev = next;
		}
		
		System.out.println(count);
	}
}
