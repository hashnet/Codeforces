import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long count = 0;
		
		do {
			if(n%2 != 0) ++count;
			
			++count;
			n/=2;
		} while (n>= 2);
		
		
		System.out.println(count);
	}
}
