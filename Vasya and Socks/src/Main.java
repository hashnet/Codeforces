import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split("\\s+");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int days = 0;
		int div = 0;
		do {
			div = n/m;
			int rem = n%m;
			
			if (div == 0) days+= rem;
			else days+= (m * div);
			
			n = div + rem;
		} while(div > 0);
		
		System.out.println(days);
	}
}
