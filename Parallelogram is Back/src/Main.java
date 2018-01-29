import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		System.out.println("3");
		System.out.println((x+a-p) + " " + (y+b-q));
		System.out.println((a+p-x) + " " + (b+q-y));
		System.out.println((x+p-a) + " " + (y+q-b));
	}		
}
