import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split("\\s+");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);
		
		String input = br.readLine();
		
		int start = input.indexOf('G');
		int end = input.indexOf('T');
		if(end < start) k = -k;
		
		if(((end-start)%k) != 0) {
			System.out.println("NO");
			return;
		}
		
		boolean reachable = true;
		for(int i=start+k; i!=end; i+=k) {
			if(input.charAt(i) != '.') {
				reachable = false;
				break;
			}
		}
		
		System.out.println(reachable ? "YES" : "NO");
	}
}