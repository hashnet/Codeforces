import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(n/2);
		
		if(n%2 == 0) {
			for(int i=1; i<=n/2; i++) {
				System.out.print("2 ");
			}
			System.out.println();
		} else {
			for(int i=1; i<=(n/2)-1; i++) {
				System.out.print("2 ");
			}
			System.out.println("3");
		}
	}
}
