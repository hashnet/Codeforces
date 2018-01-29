import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sumX = 0;
		int sumY = 0;
		int sumZ = 0;
		while(--n >= 0) {
			sumX += sc.nextInt();
			sumY += sc.nextInt();
			sumZ += sc.nextInt();
		}
		
		if(sumX==0 && sumY==0 && sumZ==0) System.out.println("YES");
		else System.out.println("NO");
	}
}
