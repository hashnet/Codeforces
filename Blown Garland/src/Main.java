import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int r = str.indexOf('R')%4;
		int b = str.indexOf('B')%4;
		int y = str.indexOf('Y')%4;
		int g = str.indexOf('G')%4;
		
		char[] map = new char[4];
		
		map[r] = 'R';
		map[b] = 'B';
		map[y] = 'Y';
		map[g] = 'G';
		
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '!') {
				++count[map[i%4]-'A'];
			}
		}
		
		System.out.println(count['R'-'A'] + " " + count['B'-'A'] + " " + count['Y'-'A'] + " " + count['G'-'A']);
	}
}
