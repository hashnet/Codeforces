import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt() + sc.nextInt() + sc.nextInt();
		int b = sc.nextInt() + sc.nextInt() + sc.nextInt();
	
		int n = sc.nextInt();
		
		int r = 0;
		if(a == 0) r+=0;
		else r+= ((a-1)/5) + 1;
		
		if(b == 0) r+=0;
		else r+= ((b-1)/10) + 1;
		
		System.out.println(r > n ? "NO" : "YES");
	}
}
