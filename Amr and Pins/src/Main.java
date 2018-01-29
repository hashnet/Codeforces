import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long r = sc.nextLong();
		long x1 = sc.nextLong();
		long  y1 = sc.nextLong();
		long x2 = sc.nextLong();
		long y2 = sc.nextLong();
		
		double d = Math.sqrt(((x1 - x2)*(x1 - x2)) + ((y1 - y2)*(y1 - y2)));
	
		if (d == 0) System.out.println(0);
		else {
			long count = (long) Math.ceil(d / (2*(double)r));
		
			System.out.println(count);
		}
	}
}
