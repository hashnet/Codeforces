import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = Integer.max(a, b);
		int min = Integer.min(a, b);
		
		if(a == 0 && b == 0) System.out.println("NO");
		else if((max-min) <= 1) System.out.println("YES");
		else System.out.println("NO");
	}
}