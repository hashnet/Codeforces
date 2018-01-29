import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] letters = new int[26];
		
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		for(int i=0; i<a.length(); i++) {
			++letters[a.charAt(i)-'A'];
		}
		for(int i=0; i<b.length(); i++) {
			++letters[b.charAt(i)-'A'];
		}
		
		for(int i=0; i<c.length(); i++) {
			--letters[c.charAt(i)-'A'];
			if(letters[c.charAt(i)-'A'] < 0) {
				System.out.println("NO");
				return;
			}
		}
		
		for(int i=0; i<26; i++) {
			if(letters[i] != 0) {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");
	}
}
