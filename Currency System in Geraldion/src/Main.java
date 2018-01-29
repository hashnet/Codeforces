import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(--n >= 0) {
			int c = sc.nextInt();
			if(c == 1) {
				System.out.println("-1");
				return;
			}
		}
		
		System.out.println("1");
	}
}
