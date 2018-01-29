import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nab = br.readLine().split("\\s+");
		int n = Integer.parseInt(nab[0]);
		int a = Integer.parseInt(nab[1]) - 1;
		int b = Integer.parseInt(nab[2]) - 1;
		
		String airports = br.readLine();
		
		if(airports.charAt(a) == airports.charAt(b)) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
