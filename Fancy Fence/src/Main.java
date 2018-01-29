import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(--t >= 0) {
			int a = sc.nextInt();
			
			if(a < 60) {
				System.out.println("NO");
			} else {
			
				double n = 360 / (180 - (double)a);
				if(n == Math.floor(n)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
