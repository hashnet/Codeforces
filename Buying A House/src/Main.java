import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt()-1;
		int k = sc.nextInt();
		
		int[] prices = new int[n];
		
		for(int i=0; i<n; i++) prices[i] = sc.nextInt();
		
		int distance = Integer.MAX_VALUE;
		for(int i=m-1; i>=0; i--) {
			if(prices[i] != 0 && prices[i] <= k) {
				distance = Math.abs(m-i);
				break;
			}
		}
		
		for(int i=m+1; i<n; i++) {
			if(prices[i] != 0 && prices[i] <= k) {
				distance = Math.min(distance, Math.abs(i-m));
			}
		}
		
		System.out.println(distance * 10);
	}
}