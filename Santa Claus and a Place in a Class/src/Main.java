import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int l = ((k-1)/(m*2)) + 1;
		int d = (k-((l-1)*(m*2)) - 1)/2 + 1;
		char s = k%2 ==0 ? 'R' : 'L';
		
		System.out.println(l + " " + d + " " + s);
	}
}
