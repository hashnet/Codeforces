import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int last = 0;
		int end = -1;
		for(int i = n-1; i>=0; i--) {
			if(arr[i] == 1) ++last;
			else {
				end = i;
				break;
			}
		}
		
		for(int i=0; i<=end; i++) {
			if(arr[i] == 1) {
				++last;
			} else {
				if(last > max) max = last;
				last = 0;
			}
		}
		
		System.out.println(max);
	}
}
