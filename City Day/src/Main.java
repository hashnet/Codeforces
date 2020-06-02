import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[] arr = new int[x + n + y];
		for(int i=0; i<x; i++) {
			arr[i] = Integer.MAX_VALUE;
		}
		for(int i=x; i<(n+x); i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=x+n; i<(n+x+y); i++) {
			arr[i] = Integer.MAX_VALUE;
		}
		
		int result = -1;
		for(int i=x; i<(n+x); i++) {
			int min = Integer.MAX_VALUE;
			for(int j=i-x; j<i; j++) {
				if(arr[j] < min) min = arr[j];
			}
			for(int j=i+1; j<=i+y; j++) {
				if(arr[j] < min) min = arr[j];
			}
			
			if(arr[i] < min) {
				result = i-x+1;
				break;
			}
		}
		
		pr.println(result);
		
		pr.close();
		sc.close();
	}
}
