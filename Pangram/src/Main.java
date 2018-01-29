import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n < 26) {
			System.out.println("NO");
			return;
		}
		
		boolean[] chars = new boolean[26];
		String str = sc.next().toLowerCase();
		int count = 26;
		for(int i=0; i<n; i++) {
			if(chars[str.charAt(i) - 'a'] == false) {
				chars[str.charAt(i) - 'a'] = true;
				--count;
			}

			
			if(count <= 0) break;
		}
		
		System.out.println(count <= 0 ? "YES" : "NO");
	}
}
