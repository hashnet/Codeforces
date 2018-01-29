import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static final int MAX = 1000;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nk = br.readLine().split("\\s+");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		
		int num = n - k + 1;
		boolean[] yn = new boolean[num];
		String[] ynString = br.readLine().split("\\s+");
		for(int i=0; i<num; i++) {
			if(ynString[i].equals("YES")) yn[i] = true;
			else yn[i] = false;
		}

		int[] names = new int[n];
		boolean existing;
		if(yn[0] == true) {
			for(int i=0; i<k; i++) {
				names[i] = i + 1;
			}
			existing = true;
		} else {
			for(int i=0; i<k; i++) {
				names[i] = 1;
			}
			existing = false;
		}
		
		
		for(int i=1; i<=n-k; i++) {
			int next = i + k - 1;
			if(existing == true) {
				if(yn[i] == true) {
					names[next] = names[next-1] + 1;
					existing = true;
				} else {
					names[next] = names[next-1];
					existing = false;
				}
			} else {
				if(yn[i] == true) {
					for(int j=i+1; j<=next; j++) {
						names[j] = names[j-1] + 1;
					}
					existing = true;
				} else {
					names[next] = names[next-1];
					existing = false;
				}
			}
		}
		
		for(int i : names) {
			System.out.print(getName(i-1));
		}
		System.out.println();
	}
	
	private static String getName(int index) {
		int mod = index % 26;
		int div = index / 26;
		
		char first = (char) ('A' + div);
		char second = (char) ('A' + mod);
		
		return "" + first + second + " ";
	}
}