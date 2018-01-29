import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int r = 240 - k;
		int count = 0;
		int t = 5;
		while(t <= r && count < n) {
			++count;
			t += 5*(count+1);
		}
		
		System.out.println(count);
	}
}
