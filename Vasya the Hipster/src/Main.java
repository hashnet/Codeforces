import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int b = sc.nextInt();
		
		int m = r <= b ? r : b;
		
		System.out.print(m + " ");
		
		int x = r + b - m - m;
		System.out.println(x/2);		
	}
}
