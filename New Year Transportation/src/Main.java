import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		int next = 1;
		boolean reachable = false;
		for(int i=1; i<t; i++) {
			int a = sc.nextInt();
			if(i != next) continue;
			else {
				next = i+a;
				if(next == t) {
					reachable = true;
					break;
				}
			}
		}
		
		System.out.println(reachable ? "YES" : "NO");
	}
}
