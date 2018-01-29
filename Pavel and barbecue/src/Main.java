import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] next = new int[n];
		boolean[] node = new boolean[n];
		for(int i=0; i<n; i++) {
			next[i] = sc.nextInt();
		}
		
		int count1 = 0;
		for(int i=0; i<n; i++) {
			count1 += sc.nextInt();
		}
		
		int loop = 0;
		for(int i=0; i<n; i++) {
			if(node[i] == true) continue;
			++loop;
			
			int j = i;
			do {
				node[j] = true;
				j = next[j]-1;
			} while(node[j] == false);
		}
		
		int change = loop <= 1 ? 0 : loop;
						
		if(count1%2 != 1) ++change;
		
		System.out.println(change);
	}
}
