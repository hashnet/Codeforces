import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Map<String, Integer> username = new HashMap<String, Integer>();
		
		for(int i=1; i<=n; i++) {
			String str = br.readLine();
			
			if(username.containsKey(str)) {
				int c = username.get(str);
				username.put(str, ++c);
				System.out.println(str + c);
			} else {
				username.put(str,  0);
				System.out.println("OK");
			}
		}
	}
}
