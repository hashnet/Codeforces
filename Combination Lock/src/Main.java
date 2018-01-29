import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String start = br.readLine();
		String end = br.readLine();

		int total = 0;
		for(int i=0; i<n; i++) {
			total += count(start.charAt(i), end.charAt(i));
		}
		
		System.out.println(total);
	}
	
	private static int count(int a, int b) {
		if(a == b) return 0;
		else if(a > b) {
			return min(a-b, b+10-a);
		} else {
			return min(b-a, a+10-b);
		}
	}
	
	private static int min(int a, int b) {
		if(a <= b) return a;
		else return b;
	}
}
