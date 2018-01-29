import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] poly = new int[n+1][3];
		
		int prevIndex = 1;
		long count = 1;
		for(int i=1; i<=n; i++) {
			long add = 0;
			int nextIndex = (prevIndex + m) % n;
			
			int max = prevIndex >= nextIndex ? prevIndex : nextIndex;
			int min = prevIndex <= nextIndex ? prevIndex : nextIndex;
			
			for(int j=min+1; j<max; j++) {
				for(int k=1; k<=poly[j][0]; k++) {
					if(poly[j][k] < min || poly[j][k] > max) ++add;
				}
			}
			
			poly[prevIndex][++poly[prevIndex][0]] = nextIndex;
			poly[nextIndex][++poly[nextIndex][0]] = prevIndex;
			
			count += add + 1;
			System.out.print(count + " ");
			
			prevIndex = nextIndex;
		}
		System.out.println();		
	}
} 
