import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nx = br.readLine().split("\\s+");
		
		long n = Long.parseLong(nx[0]);
		long x = Long.parseLong(nx[1]);
		
		long[] array = new long[131072];		
		long[] num = new long[(int)n];
		String[] arrayStr = br.readLine().split("\\s+");
		for(int i=0; i<n; i++) {
			num[i] = Long.parseLong(arrayStr[i]);
			++array[(int)num[i]];
		}
		
		long count = 0;
		for(int i=0; i<n; i++) {
			long b = num[i]^x;
			
			if(b == num[i]) {
				count += array[(int)b] - 1;
			} else {
				count += array[(int)b];
			}
			--array[(int)num[i]];
		}		
		
		System.out.println(count);
	}
}
