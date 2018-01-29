import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		int[] q = new int[s.length()];
		int count = 0;
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) == s.charAt(i-1)) ++count;
			q[i] = count;
		}
		
		for(int i=1; i<=n; i++) {
			String[] lr = br.readLine().split("\\s+");
			int l = Integer.parseInt(lr[0]) - 1;
			int r = Integer.parseInt(lr[1]) - 1;
			
			System.out.println(q[r] - q[l]);
		}
	}
}
