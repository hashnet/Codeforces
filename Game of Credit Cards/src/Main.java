import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static final int MAX = 1000;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String m = br.readLine();
		
		int[] sa = new int[n];
		int[] ma = new int[n];
		
		for(int i=0; i<n; i++) {
			sa[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
			ma[i] = Integer.parseInt(String.valueOf(m.charAt(i)));
		}
		
		Arrays.sort(sa);
		Arrays.sort(ma);
		
		int min = n;
		int sc = 0;
		for(int i=0; i<=n-1; i++) {
			if(sa[sc] <= ma[i]) {
				--min;
				++sc;
			}
		}
		System.out.println(min);
		
		int max = 0;
		int mc = n-1;
		for(int i=n-1; i>=0; i--) {
			if(ma[mc] > sa[i]) {
				++max;
				--mc;
			}
		}
		System.out.println(max);
	}
}
