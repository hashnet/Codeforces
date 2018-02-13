import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int pos = sc.nextInt();
		String str = sc.next();
		
		int min, max;
		
		if(pos <= n/2) {
			min = 1;
			max = n/2;
		} else {
			min = n/2+1;
			max = n;
		}
		
		int left = max;
		int right = min;
		
		int a, b, diff;
		int count = 0;
		boolean hasPal = false;
		for(int i=min; i<=max; i++) {
			a = str.charAt(i-1) - 'a' + 1;
			b = str.charAt(n-i) - 'a' + 1;
			
			if(a != b) {
				hasPal = true;
				
				if(i < left) left = i;
				if(i > right) right = i;
				
				diff = Math.abs(a - b);
				if(diff > 13) diff = 26 - diff;
				count += diff;
			}
		}
		
		if(hasPal) {
			count += Math.min(Math.abs(right - pos), Math.abs(pos - left));
			count += Math.abs(right - left);
		}
		
		System.out.println(count);
	}
}
