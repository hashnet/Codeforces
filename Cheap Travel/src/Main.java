import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int total = 0;
		
		if((double)b/m < (double)a) {
			int mCount = n/m;
			total += (mCount * b);
			n -= (mCount * m);
			if(b < n*a) {
				total+=b;
				n=0;
			}
		}
		
		total += (n * a);
		
		System.out.println(total);
	}
}
