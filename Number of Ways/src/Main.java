import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] nums = new long[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextLong();
		}
		
		long sum = 0;
		for(int i=0; i<n; i++) {
			sum += nums[i];
		}
		if(sum%3 != 0) {
			System.out.println("0");
			return;
		}
		
		long target = sum / 3;
		long count = 0;
		long partSum = 0;
		long[] possibles = new long[n];
		for(int i=n-1; i>=0; i--) {
			partSum += nums[i];
			if(partSum == target) {
				++count;
			}
			
			possibles[i] = count;
		}
		
		count = 0;
		partSum = 0;
		for(int i=0; i<n-2; i++) {
			partSum += nums[i];
			if(partSum == target) {
				count += possibles[i+2];
			}
		}
		
		System.out.println(count);
	}
}
