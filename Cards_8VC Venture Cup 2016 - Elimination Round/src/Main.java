import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int r=0, g=0, b=0;
		int c=0;
		for(int i=0; i<n; i++) {
			if (str.charAt(i) == 'R') ++r;
			else if(str.charAt(i) == 'G') ++g;
			else if(str.charAt(i) == 'B') ++b;
		}
		
		if(r > 0) ++c;
		if(g > 0) ++c;
		if(b > 0) ++c;
		StringBuilder output = new StringBuilder();
		if(c == 1) {
			if(r > 0) output.append('R');
			else if(g > 0) output.append('G');
			else if(b > 0) output.append('B');
		} else if(c == 3) {
			output.append("RGB");
		} else if(c == 2) {
			int min = Integer.MAX_VALUE;
			char minc = 'R';
			if(r > 0 && r < min) {
				min = r;
				minc = 'R';
			}
			if(g > 0 && g < min) {
				min = g;
				minc = 'G';
			}
			if(b > 0 && b < min) {
				min = b;
				minc = 'B';
			}
			
			int max = r;
			int maxc = 'R';
			if(g > max) {
				max = g;
				maxc = 'G';
			}
			if(b > max) {
				max = b;
				maxc = 'B';
			}
			
			if(min == 1 && max == 1) {
				if(r != 1) output.append('R');
				if(g != 1) output.append('G');
				if(b != 1) output.append('B');
			} else if(min >= 2) {
				output.append("RGB");
			} else if(min == 1 && max > 1) {
				output.append(minc);
				if(minc != 'R' && maxc != 'R') output.append('R');
				if(minc != 'G' && maxc != 'G') output.append('G');
				if(minc != 'B' && maxc != 'B') output.append('B');
			}
		}
		
		char[] ca = output.toString().toCharArray();
		Arrays.sort(ca);
		System.out.println(ca);
	}
}
