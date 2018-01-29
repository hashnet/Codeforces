import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int n = str.length();
		int[] a = new int[n+1];
		int count = 0;
		a[0] = count;
		for(int i=1; i<=n; i++) {
			if(str.charAt(i-1) == '1') ++count;
			a[i] = count;
		}
		
		long sum=0;
		for(int i=Integer.max(k, 1); i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				int d = a[j+i-1] - a[j-1];
				if(d == k) ++sum;
			}
		}
		
		System.out.println(sum);
	}
}
