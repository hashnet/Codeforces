import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		for(int i=0; i<a.length(); i++) {
			System.out.print(a.charAt(i) ^ b.charAt(i));
		}
		
		System.out.println();
	}
}
