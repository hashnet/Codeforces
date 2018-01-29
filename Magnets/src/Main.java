import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String prev = "";
		int count = 0;
		while(--n >= 0) {
			String str = br.readLine();
			if (!str.equals(prev)) {
				++count;
				prev = str;
			}
		}
		
		System.out.println(count);
	}
}
