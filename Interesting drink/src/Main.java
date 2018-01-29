import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> prices = new ArrayList<Integer>();
		
		int max = 0;
		for(int i=0; i<n; i++) {
			int p = sc.nextInt();
			if(p > max) max = p;
			prices.add(p);
		}
		Collections.sort(prices);
		
		int[] count = new int[max+1];
		int lastIndex = 1;
		count[lastIndex] = 0;
		int lastCount = 0;
		for(int i=0; i<prices.size(); i++) {
			int x = prices.get(i);
			if(x == lastIndex) ++count[lastIndex];
			else {
				for(int j=lastIndex+1; j<x; j++) {
					count[j] = count[lastIndex];
				}
				count[x] = count[lastIndex]+1;
				
				lastIndex = x;
			}
		}
		
		int q = sc.nextInt();
		int m = 0;
		for(int i=1; i<=q; i++) {
			m = sc.nextInt();

			if(m >= max) System.out.println(count[max]);
			else System.out.println(count[m]);
		}
	}
}
