import java.io.*;
import java.util.*;

public class Main {
	public static int gcd(int a, int b) {
		while(b != 0) {
			int t = b;
			b = a%b;
			a = t;
		}
		
		return a;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		int winner = 0;
		while(true){
			n-=gcd(a, n);
			if(n<=0) {
				winner = 0;
				break;
			}
			
			
			n-=gcd(b, n);
			if(n<=0) {
				winner = 1;
				break;
			}
		}
		
		System.out.println(winner);
	}
}
