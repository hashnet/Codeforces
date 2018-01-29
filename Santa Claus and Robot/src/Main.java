import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		char lr = 'I';
		char ud = 'I';
		
		int count = 1;
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == 'L' || str.charAt(i) == 'R') {
				if(lr == 'I') {
					lr = str.charAt(i);
				} else if (lr != str.charAt(i)) {
					++count;
					
					lr = str.charAt(i);
					ud = 'I';
				}
			} else if(str.charAt(i) == 'U' || str.charAt(i) == 'D') {
				if(ud == 'I') {
					ud = str.charAt(i);
				} else if(ud != str.charAt(i)) {
					++count;
					
					ud = str.charAt(i);
					lr = 'I';
				}
			}
		}
		
		System.out.println(count);
	}
}
