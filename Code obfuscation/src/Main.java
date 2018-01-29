import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static final int MAX = 1000;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		char next = 'a';
		boolean[] used = new boolean[26];
		
		boolean mod = true;
		for(int i=0; i<str.length(); i++) {
			if(used[str.charAt(i) - 'a'] == false) {
				if(str.charAt(i) == next) {
					used[str.charAt(i) - 'a'] = true;
					++next;
				} else {
					mod = false;
					break;
				}
			}
		}
		
		System.out.println(mod == true ? "YES" : "NO");
	}
}