import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			boolean canDAnce = testClock(arr) || testAntiClock(arr);
		
			pw.println(canDAnce ? "YES" : "NO");
		}
		
		pw.close();
		sc.close();
	}
	
	private static boolean testClock(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if((arr[i] != (arr[i-1] + 1)) && arr[i] != 1) return false;
		}
		
		return true;
	}
	
	private static boolean testAntiClock(int[] arr) {
		for(int i=arr.length - 2; i >= 0; i--) {
			if((arr[i] != (arr[i+1] + 1)) && arr[i] != 1) return false;
		}
		
		return true;
	}
}
