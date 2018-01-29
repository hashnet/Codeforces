import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int count = 0;
		
		while(m > n) {
			if(m%2 == 0) m /= 2;
			else m += 1;
			
			++count;
		}
		
		count += (n-m);
		
		System.out.println(count);
	}
}
