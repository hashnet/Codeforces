import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = sc.nextInt();
		
		int c = Math.abs(a) + Math.abs(b);
		if(c > s) System.out.println("No");
		else if(c == s) {
			System.out.println("Yes");
		} else {
			int k = s - c;
			if(k%2 == 0) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
