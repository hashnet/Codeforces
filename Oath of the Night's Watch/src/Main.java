import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] arr = new long[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLong();
		}
	
		Arrays.sort(arr);
		
		long min = arr[0];
		long max = arr[n-1];
		
		int minC = 1;
		while(minC <= n-1 && arr[minC] == min) {
			++minC;
		}
		
		int maxC = n-2;
		while(maxC >= 0 && arr[maxC] == max) {
			--maxC;
		}
		
		if((maxC - minC) >= 0) System.out.println(maxC-minC +1 );
		else System.out.println(0);
	}
}