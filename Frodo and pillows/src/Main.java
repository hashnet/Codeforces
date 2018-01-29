import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int left = k;
		int right = k;
		
		int frodo = 1;
		int pillow = n;
		int count = 0;
		do{			
			count = right - left + 1;
			if(count == n) {
				int rem = m - pillow;
				frodo += rem / n;
				break;
			}
			
			pillow = pillow + count;
			
			if(pillow <= m) {
				++frodo;
			} else {
				break;
			}
			
			if(left > 1) --left;
			if(right < n) ++right;
		} while(true);
		
		System.out.println(frodo);
	}
}
