import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		
		int count = 0;
		do {
			count += n&1;
			n>>=1;
		}while(n != 0);
		
		System.out.println(count);
	}
}
