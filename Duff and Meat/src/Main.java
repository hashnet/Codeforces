import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long total = 0;
		int min = -1;
		for(int i=1; i<=n; i++) {
			int w = sc.nextInt();
			int p = sc.nextInt();
			
			if(min == -1) min = p;
			else if(p < min) min = p;
			
			total += (w * min);
		}
		
		System.out.println(total);
	}
}
