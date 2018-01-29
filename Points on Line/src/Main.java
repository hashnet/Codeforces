import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(twoPointer(a, n, d));
	}
	
	private static long twoPointer(int[] a, int n, int d) {
		Arrays.sort(a);
		
		int l=0, r=0;
		long count=0;
		while(l<n) {
			while(r<n && (a[r]-a[l]) <= d) {
				if(r > l+1) {
					long x = r-l-1;
					count += (x * (x+1))/2 ;
 				}
				++r;
			}
			
			++l;
		}		

		return count;
	}
}
