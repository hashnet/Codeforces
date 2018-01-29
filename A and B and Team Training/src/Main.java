import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if (n == 0 || m == 0) {
			System.out.println(0);
			return;
		}
		
		int min = n < m ? n : m;
		int max = n > m ? n : m;
		
		if(min * 2 < max) System.out.println(min);
		else System.out.println((min+max)/3);
	}
}
