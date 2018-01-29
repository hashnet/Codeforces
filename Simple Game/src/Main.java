import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n == 1) System.out.println(1);
		else {
			if(n%2 == 0) {
				int limit = n/2;
				if(m <= limit) System.out.println(m+1);
				else System.out.println(m-1);
			} else {
				int limit = (n/2) + 1;
				if(m < limit) System.out.println(m+1);
				else System.out.println(m-1);
			}
		}
	}
}
