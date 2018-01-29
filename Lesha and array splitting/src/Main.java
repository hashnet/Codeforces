import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long rightSum = 0;
		long leftSum = 0;
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			rightSum += a[i];
		}
		
		boolean possible = false;
		if(rightSum != 0) {
			possible = true;
			System.out.println("YES");
			System.out.println("1");
			System.out.println("1 " + n);
		} else {
			for(int i=0; i<n-1; i++) {
				leftSum += a[i];
				rightSum -= leftSum;
				if(leftSum != 0 && rightSum != 0) {
					possible = true;
					System.out.println("YES");
					System.out.println("2");
					System.out.println("1 " + (i+1));
					System.out.println((i+2) + " " + n);
					break;
				}
			}
		}
		
		if(!possible) System.out.println("NO");
	}
}
