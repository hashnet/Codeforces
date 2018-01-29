import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean[] h = new boolean[n+1];
		boolean[] v = new boolean[n+1];
 		
		for(int i=1; i<= (n*n); i++) {
			int hIndex = sc.nextInt();
			int vIndex = sc.nextInt();
			
			if(h[hIndex] == false && v[vIndex] == false) {
				h[hIndex] = true;
				v[vIndex] = true;
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
	}
}
