import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int div = sc.nextInt();
		
		int sum = 0;
		int rem = 0;
		
		do {
			num += rem;
			rem = num % div;			
			num = num / div;
			sum += (num * div);
		} while(num > 0);
		
		sum+=rem;
		
		System.out.println(sum);
	}
}
