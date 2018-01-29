import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int maxSum = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) a[i] = sc.nextInt();
		
		System.out.println(twoPointer(a, n, maxSum));
	}
	
	private static int twoPointer(int[] a, int n, int maxSum) {
		int l=0, r=0;
		int sum=0;
		int count=0, maxCount=0;
		
		while(l < n) {
			while(r < n && sum+a[r] <= maxSum) {
				sum += a[r];
				if(l<=r) maxCount = Math.max(maxCount, r-l+1);
				
				++r;
			}
			
			sum -= a[l];
			++l;
		}
		
		return maxCount;
	}
}
