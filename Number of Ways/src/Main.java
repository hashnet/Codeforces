import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n<3) {
			System.out.println(0);
			return;
		}
		
		int[] array = new int[n];
		long sum = 0;
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		if(sum%3 != 0) {
			System.out.println(0);
			return;
		}
		
		sum /= 3;
		
		long[] sums = new long[n+1];	
		long sumK = 0;
		for(int k=n-1; k>=2; k--) {
			sumK += array[k];
			if(sumK == sum) {
				sums[k] = sums[k+1] + 1;
			} else {
				sums[k] = sums[k+1];
			}
		}
		
		long count = 0;
		long sumI = 0;
		for(int i=0; i<=n-3; i++) {
			sumI += array[i];
			if(sumI == sum) {
				count += sums[i+2];
			}
		}
		
		System.out.println(count);
	}
}
