import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		long odds = (n-1)/2 + 1;
		long evens = n/2;
		
		long output = 0;
		if(k <= odds) output = (2 * k) -1;
		else output = 2 * (k - odds);
		
		System.out.println(output);
	}
}
