import java.io.*;
	
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int a = 0;
		int d = 0;
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == 'A') ++ a;
			else ++d;
		}
		
		if(a == d) System.out.println("Friendship");
		else if(a > d) System.out.println("Anton");
		else if(d > a) System.out.println("Danik");
	}
}
