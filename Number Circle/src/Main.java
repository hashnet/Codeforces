import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Integer[] arr = new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		if(arr[0] >= arr[1] + arr[2]) {
			System.out.println("NO");
		} else {System.out.println("YES");
			int temp = arr[2];
			arr[2] = arr[1];
			arr[1] = arr[0];
			arr[0] = temp;
			
			for(int i=0; i<n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
