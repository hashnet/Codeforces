import java.util.*;
	
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int na = sc.nextInt();
		int nb = sc.nextInt();
		
		int k = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[na];
		int[] b = new int[nb];
		
		for(int i=0; i<na; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<nb; i++) {
			b[i] = sc.nextInt();
		}
		
		if(a[k-1] < b[nb-m]) System.out.println("YES");
		else System.out.println("NO");
	}
}
