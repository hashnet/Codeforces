import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static String temp;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		String str = construct(n);
		
		System.out.println(str);
	}
	
	private static String construct(long n) {
		if(n < 2) return String.valueOf(n);
		
		temp = construct(n/2);
		return temp + String.valueOf(n%2) + temp;		
	}
}