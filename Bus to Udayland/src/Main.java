import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder[] seats = new StringBuilder[n];
		
		boolean possible = false;
		for(int i=0; i<n; i++) {
			seats[i] = new StringBuilder(br.readLine());
			
			if(!possible) {
				if(seats[i].charAt(0) == 'O' && seats[i].charAt(1) == 'O') {
					possible = true;
					seats[i].setCharAt(0, '+');
					seats[i].setCharAt(1, '+');
				} else if(seats[i].charAt(3) == 'O' && seats[i].charAt(4) == 'O') {
					possible = true;
					seats[i].setCharAt(3, '+');
					seats[i].setCharAt(4, '+');
				}
			}
		}
		
		System.out.println(possible ? "YES" : "NO");
		if(possible) {
			for(int i=0; i<n; i++) {
				System.out.println(seats[i]);
			}
		}
	}
}
