import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int max = n;
		int min = (n/2) + (n%2);
		
		
		for(int i=(min > m ? min : m); i<=max; i++) {
			if(i%m == 0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
		return;
	}
}
