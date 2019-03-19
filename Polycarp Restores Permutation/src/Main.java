import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n + 1];
		int max = 0;
		int min = 0;
		arr[0] = 0;
		Set<Integer> set = new HashSet<>();
		set.add(0);
		
		for(int i=1; i<n; i++) {
			arr[i] = arr[i-1] + sc.nextInt();
			
			if(set.contains(arr[i])) {
				System.out.println("-1");
				return;
			}
			
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		
		if((max - min) != (n-1)) {
			System.out.println("-1");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append((arr[i] - min + 1));
			sb.append(" ");
		}
		System.out.println(sb);
	}
}
