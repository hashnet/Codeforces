import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int count = 0;
		while(a >2 || b >2) {
			if (a < b) {
				int t = a;
				a = b;
				b = t;
			}
			
			if(a%2 == 0) {
				int r = a/2-1;
				a = 2;
				b += r;
				count += r;
			} else {
				int r = a/2;
				a = 1;
				b += r;
				count += r;
			}
		}
		
		if(a>1 || b>1) ++count;
	
		System.out.println(count);
	}
}
