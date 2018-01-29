import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int r = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int n = k*i;
			if(n%10 == 0 || (n-((n/10)*10)) == r) {
				System.out.println(i);
				return;
			}
		}
	}
}
